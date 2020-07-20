package com.brj.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brj.swoosh.Model.Player
import com.brj.swoosh.R
import com.brj.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}