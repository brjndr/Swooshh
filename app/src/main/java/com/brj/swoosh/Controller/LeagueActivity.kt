package com.brj.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.brj.swoosh.Model.Player
import com.brj.swoosh.R
import com.brj.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player(league = "", skill = "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "Womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "Co-ed"
    }

    fun leagueNextClicked(view: View) {
        if(player.league !== "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}