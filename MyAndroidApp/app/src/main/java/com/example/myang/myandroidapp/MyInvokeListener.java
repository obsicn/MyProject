package com.example.myang.myandroidapp;

/**
 * Created by myang on 2/23/16.
 */

import com.worklight.wlclient.api.*;
import android.util.Log;

public class MyInvokeListener implements WLResponseListener {

    @Override
    public void onSuccess(WLResponse wlResponse) {
        Log.i("MFPMyProject","Adapter invocation response: " + wlResponse.getResponseJSON());
    }

    @Override
    public void onFailure(WLFailResponse wlFailResponse) {
        Log.i("MFPMyProject", "Adapter invocation response: " + wlFailResponse.getErrorMsg());
    }
}