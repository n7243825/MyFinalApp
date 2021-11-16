package com.example.finalapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

    val myCoin = Dice.Coin(2)
    println("Your ${myCoin.numSides} coin fliped ${myCoin.roll()}")
}



class Dice(val numSides :Int){



    fun roll() : Int{
        return (1..numSides).random()

    }
    class Coin(val numSides :Int) {
        fun roll() :Int{
            return (1..numSides).random()
            }
    }
}