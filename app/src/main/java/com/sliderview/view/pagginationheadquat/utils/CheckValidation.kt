package com.sliderview.view.pagginationheadquat.utils

import android.Manifest.permission.ACCESS_NETWORK_STATE
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.annotation.RequiresPermission

class CheckValidation {

    companion object{
        /**
         * Get the network info
         *
         * @param context the context
         * @return network info
         */

      @RequiresPermission(ACCESS_NETWORK_STATE)  // This code is actual code for git
        private fun getNetworkInfo(context : Context) : NetworkInfo? {
            val cm = (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
            return cm.activeNetworkInfo
        }

        /**
         * Check if there is any connectivity
         *
         * @param context the context
         * @return boolean boolean
         */

     @RequiresPermission(ACCESS_NETWORK_STATE)    //This code is actual code for git
        fun isConnected(context: Context): Boolean {
            val info = getNetworkInfo(context)
            return info != null && info.isConnected
        }
    }
}