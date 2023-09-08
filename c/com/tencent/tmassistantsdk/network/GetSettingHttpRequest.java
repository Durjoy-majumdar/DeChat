package com.tencent.tmassistantsdk.network;

import com.p013qq.taf.jce.JceStruct;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse;
import com.tencent.tmassistantsdk.util.TMLog;

public class GetSettingHttpRequest extends PostHttpRequest {
    public static final String TAG = "GetSettingHttpRequest";
    public IGetSettingHttpListener mListener = null;

    public void onFinished(JceStruct jceStruct, JceStruct jceStruct2, int i) {
        if (jceStruct2 == null) {
            TMLog.m164114i(TAG, "response is null!");
            return;
        }
        IGetSettingHttpListener iGetSettingHttpListener = this.mListener;
        if (iGetSettingHttpListener != null && i == 0 && (jceStruct2 instanceof GetSettingsResponse)) {
            GetSettingsResponse getSettingsResponse = (GetSettingsResponse) jceStruct2;
            if (getSettingsResponse.ret == 0) {
                iGetSettingHttpListener.onSettingHttpRequestFinish((GetSettingsRequest) jceStruct, getSettingsResponse, true);
            } else {
                iGetSettingHttpListener.onSettingHttpRequestFinish((GetSettingsRequest) jceStruct, getSettingsResponse, false);
            }
        }
    }

    public void sendSettingRequest() {
        super.sendRequest(new GetSettingsRequest());
    }

    public void setGetSettingHttpListener(IGetSettingHttpListener iGetSettingHttpListener) {
        this.mListener = iGetSettingHttpListener;
    }
}
