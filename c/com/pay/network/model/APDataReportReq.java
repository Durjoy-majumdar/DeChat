package com.pay.network.model;

import android.text.TextUtils;
import com.pay.http.APHttpReqPost;
import com.pay.http.APPluginUrlConf;
import com.tencent.midas.data.APPluginDataInterface;

public class APDataReportReq extends APHttpReqPost {
    public APDataReportReq() {
        String offerId = APPluginDataInterface.singleton().getOfferId();
        if (!TextUtils.isEmpty(offerId)) {
            setReportUrl(String.format(APPluginUrlConf.AP_LOGREPORT_FCG, new Object[]{offerId}), String.format(APPluginUrlConf.AP_LOGREPORT_FCG, new Object[]{offerId}), String.format(APPluginUrlConf.AP_LOGREPORT_FCG, new Object[]{offerId}));
        }
    }

    public void startService(String str) {
        if (!str.equals("") && !TextUtils.isEmpty(APPluginDataInterface.singleton().getOfferId())) {
            this.httpParam.reqParam.clear();
            this.httpParam.reqParam.put(str, "");
            startRequest();
        }
    }
}
