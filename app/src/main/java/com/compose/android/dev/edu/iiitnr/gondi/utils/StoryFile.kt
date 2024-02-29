package com.compose.android.dev.edu.iiitnr.gondi.utils

object StoryFile {
    private val storyMap= mapOf(
        "A" to listOf(
            "Once upon a time, there was a story that started with the letter A.",
            "a magical kingdom, an adventure began with the letter A.",
            "In a magical kingdom, an adventure began with the letter A.",
            "A Once upon a time, there was a story that started with the letter A.",
            "A a magical kingdom, an adventure began with the letter A.",
            "A In a magical kingdom, an adventure began with the letter A.",
        ),

        "B" to listOf(
            "B Once upon a time, there was a story that started with the letter A.",
            "B a magical kingdom, an adventure began with the letter A.",
            "B In a magical kingdom, an adventure began with the letter A.",
            "B Once upon a time, there was a story that started with the letter A.",
            "B A a magical kingdom, an adventure began with the letter A.",
            "B In a magical kingdom, an adventure began with the letter A.",
        ),
        "C" to listOf(
            "C Once upon a time, there was a story that started with the letter A.",
            "C a magical kingdom, an adventure began with the letter A.",
            "C In a magical kingdom, an adventure began with the letter A.",
            "C  Once upon a time, there was a story that started with the letter A.",
            "C A a magical kingdom, an adventure began with the letter A.",
            "C In a magical kingdom, an adventure began with the letter A.",
        ),
        "D" to listOf(
            "D Once upon a time, there was a story that started with the letter A.",
            "D a magical kingdom, an adventure began with the letter A.",
            "D In a magical kingdom, an adventure began with the letter A.",
            "D Once upon a time, there was a story that started with the letter A.",
            "D  A a magical kingdom, an adventure began with the letter A.",
            "D In a magical kingdom, an adventure began with the letter A.",
        )
    )

    fun getStory(letter:String):String{
        val stories= storyMap[letter.uppercase()]?: emptyList()

        return  if(stories.isNotEmpty()){
            stories.random()
        }else{
            "No story available for letter : ${letter}"
        }
    }
}