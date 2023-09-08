package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.TenpayCgiCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.tenpay.model.C75160b;
import java.util.HashMap;
import org.json.JSONObject;

public class NetSceneTenpay extends C75160b {
    private static final String TAG = "WXP";
    public TenpayCgiCallback mCallback;
    public int mCgiId;
    private final String mUrl;

    public interface EndCallback {
        void onEnd(int i);
    }

    public NetSceneTenpay(int i, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, TenpayCgiCallback tenpayCgiCallback) {
        this.mCgiId = i;
        this.mUrl = str;
        this.mCallback = tenpayCgiCallback;
        setWXRequestData(hashMap2);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return this.mCgiId;
    }

    public int getTenpayCgicmd() {
        return this.mCgiId;
    }

    public String getUri() {
        if (!Util.isNullOrNil(this.mUrl)) {
            return this.mUrl;
        }
        int funcId = getFuncId();
        return funcId != 1544 ? funcId != 1679 ? funcId != 1992 ? super.getUri() : "/cgi-bin/mmpay-bin/gettransferwording" : "/cgi-bin/mmpay-bin/tenpay/getbannerinfo" : "/cgi-bin/mmpay-bin/transferplaceorder";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        Log.m105925i(TAG, "errCode:%d,errMsg:%s,json:%s", Integer.valueOf(i), str, jSONObject);
        String.format("errCode:%d,errMsg:%s,json:%s", new Object[]{Integer.valueOf(i), str, jSONObject});
        if (i == 0) {
            this.mCallback.onSuccess(jSONObject.toString());
        } else {
            this.mCallback.onError(i, str);
        }
    }
}
