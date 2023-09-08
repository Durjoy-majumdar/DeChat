package com.tencent.tmassistantsdk.logreport;

import com.tencent.tmassistantsdk.network.GetSettingHttpRequest;
import com.tencent.tmassistantsdk.network.IGetSettingHttpListener;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse;
import com.tencent.tmassistantsdk.protocol.jce.SettingsCfg;
import com.tencent.tmassistantsdk.protocol.jce.StatCfg;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;

public class GetSettingEngine implements IGetSettingHttpListener {
    public static final String TAG = "GetSettingEngine";
    public static GetSettingEngine mInstance;
    public GetSettingHttpRequest httpRequest = null;

    public static synchronized GetSettingEngine getInstance() {
        GetSettingEngine getSettingEngine;
        synchronized (GetSettingEngine.class) {
            if (mInstance == null) {
                mInstance = new GetSettingEngine();
            }
            getSettingEngine = mInstance;
        }
        return getSettingEngine;
    }

    public synchronized void cancleRequest() {
        GetSettingHttpRequest getSettingHttpRequest = this.httpRequest;
        if (getSettingHttpRequest != null) {
            getSettingHttpRequest.cancleRequest();
            this.httpRequest = null;
        }
    }

    public void onSettingHttpRequestFinish(GetSettingsRequest getSettingsRequest, GetSettingsResponse getSettingsResponse, boolean z) {
        SettingsCfg settingsCfg;
        byte[] bArr;
        this.httpRequest = null;
        if (z) {
            ArrayList<SettingsCfg> arrayList = getSettingsResponse.settings;
            if (!(arrayList == null || arrayList.size() <= 0 || (settingsCfg = getSettingsResponse.settings.get(0)) == null || (bArr = settingsCfg.cfg) == null)) {
                StatCfg statCfg = (StatCfg) ProtocolPackage.bytes2JceObj(bArr, StatCfg.class);
                if (statCfg != null) {
                    GlobalUtil.getInstance().setNetTypeValue(statCfg.netType);
                } else {
                    TMLog.m164114i(TAG, "response  StatCfg is null !");
                }
            }
            TMLog.m164114i(TAG, "response.settings is null !");
            return;
        }
        TMLog.m164114i(TAG, "get settings failed!");
    }

    public void sendRequest() {
        if (this.httpRequest == null) {
            GetSettingHttpRequest getSettingHttpRequest = new GetSettingHttpRequest();
            this.httpRequest = getSettingHttpRequest;
            getSettingHttpRequest.setGetSettingHttpListener(this);
            this.httpRequest.sendSettingRequest();
        }
    }
}
