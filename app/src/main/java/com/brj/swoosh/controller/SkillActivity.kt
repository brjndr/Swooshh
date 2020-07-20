package com.brj.swoosh.controller

import android.os.Bundle
import com.brj.swoosh.utilities.EXTRA_LEAGUE
import com.brj.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
}