package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore : Int): ViewModel() {

    private val _playAgain = MutableLiveData<Boolean>()
    val playAgain : LiveData<Boolean>
    get() = _playAgain
    init {
        Log.i("ScoreFragment","Final Score is $finalScore")
    }

    fun onPlayAgain(){
        _playAgain.value = true
    }
}