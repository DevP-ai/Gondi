package com.compose.android.dev.edu.iiitnr.gondi

import android.widget.Filter
import com.compose.android.dev.edu.iiitnr.gondi.adapter.DictAdapter
import com.compose.android.dev.edu.iiitnr.gondi.model.Dict
import java.util.Locale

class WordFilter(
    private val adapter: DictAdapter,
    private val filterJobs : ArrayList<Dict>
) : Filter() {
    override fun performFiltering(searchingText: CharSequence?): FilterResults {
        val filteredResults = FilterResults()

        if(!searchingText.isNullOrEmpty()){
            val query = searchingText.toString().trim().uppercase(Locale.getDefault()).split(" ")
            val filteredJobList = ArrayList<Dict>()
            for(jobs in filterJobs){

                if(query.any { search ->
                        jobs.English?.uppercase(Locale.getDefault())?.contains(search) == true ||
                                jobs.Hindi?.uppercase(Locale.getDefault())?.contains(search) == true ||
                                jobs.Gondi?.uppercase(Locale.getDefault())?.contains(search) == true

                    }){
                    filteredJobList.add(jobs)
                }
            }
            filteredResults.apply {
                count = filteredJobList.size
                values = filteredJobList
            }

        }
        else{
            filteredResults.apply {
                count = filterJobs.size
                values = filterJobs
            }
        }

        return filteredResults
    }

    override fun publishResults(p0: CharSequence?, results: FilterResults?) {
        adapter.dictList= results?.values as ArrayList<Dict>
        adapter.notifyDataSetChanged()
    }
}