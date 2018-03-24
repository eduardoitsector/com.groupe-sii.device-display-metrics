package com.groupesii.displaymetrics;

import org.apache.cordova.*;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.DisplayMetrics;
import android.content.Context;

public class DeviceDisplayMetrics extends CordovaPlugin {
    

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        Context context=this.cordova.getActivity().getApplicationContext();

        DisplayMetrics metrics = context.getResources().getDisplayMetrics();

        JSONObject r = new JSONObject();
		r.put("widthPixels", metrics.widthPixels);
		r.put("heightPixels", metrics.heightPixels);
		r.put("density", metrics.density);

        if (action.equals("getDpi")) {
			callbackContext.success(r);
            return true;
        } else {
            return false;
        }
    }
}
