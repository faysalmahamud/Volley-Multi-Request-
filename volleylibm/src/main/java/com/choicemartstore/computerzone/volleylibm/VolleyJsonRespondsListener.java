package com.choicemartstore.computerzone.volleylibm;

import org.json.JSONObject;

public interface VolleyJsonRespondsListener {

    public void onSuccessJson(JSONObject result, String type);
    public void onFailureJson(int responseCode, String responseMessage);
}