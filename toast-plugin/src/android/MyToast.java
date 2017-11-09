package org.apache.cordova.toast.MyToast;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by yu on 2017/11/9.
 */

public class MyToast extends CordovaPlugin {
    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        return super.execute(action, rawArgs, callbackContext);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        return super.execute(action, args, callbackContext);
    }

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        //showToast 是你在JS中调用的方法名；
        if (action.equals("showToast")) {
            //这里可以实现一些你的原生逻辑功能
            Toast.makeText(cordova.getActivity(), args.getString(0), Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
