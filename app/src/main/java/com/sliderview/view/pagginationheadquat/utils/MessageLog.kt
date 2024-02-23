package com.sliderview.view.pagginationheadquat.utils
import android.util.Log
/*
    code writing  date :- 22-02-24
 */

class MessageLog {

    companion object{

        /**
         * Set Log
         *
         * @param tag TAG of logcat
         * @param msg Message of Logcat
         */
        fun setLogCat(tag: String, msg: String?) {
            Log.i("$tag :", msg!!)
        }
    }
}