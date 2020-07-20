package com.brj.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.brj.swoosh.utilities.EXTRA_LEAGUE
import com.brj.swoosh.R
import com.brj.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "Baller"
    }

    fun onSkillFinishClick(view: View) {
        if(skill !== "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}