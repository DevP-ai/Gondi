package com.compose.android.dev.edu.iiitnr.gondi.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.compose.android.dev.edu.iiitnr.gondi.model.Dict
import com.google.gson.Gson
import java.io.IOException

class DictViewmodel(private val dict_context:Context):ViewModel(){

    private val _dictLiveData = MutableLiveData<List<Dict>>()

    init {
        loadDictFromAssets()
    }

    fun getDict(): LiveData<List<Dict>> {
        return _dictLiveData
    }

    private fun loadDictFromAssets() {
        try {
            val inputStream = dict_context.assets.open("gondi_dic.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val json = String(buffer, Charsets.UTF_8)
            val gson = Gson()
            val dictList = gson.fromJson(json, Array<Dict>::class.java).toList()
            _dictLiveData.value = dictList
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }


}