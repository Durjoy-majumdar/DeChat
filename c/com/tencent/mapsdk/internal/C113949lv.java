package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.exception.FileUploadResetException;
import com.tencent.map.tools.net.processor.RequestProcessor;

/* renamed from: com.tencent.mapsdk.internal.lv */
public final class C113949lv extends C113945lr implements RequestProcessor {
    public final void onRequest(NetRequest netRequest) {
        netRequest.setRespHeaders("User-ReturnCode");
    }

    public final void onResponse(NetResponse netResponse) {
        String headerField = netResponse.getHeaderField("User-ReturnCode");
        int parseInt = Integer.parseInt(headerField);
        if (parseInt != 0) {
            if (parseInt == -2) {
                netResponse.exception(new FileUploadResetException());
            }
            netResponse.exception(new Exception("FileUploader user error:".concat(String.valueOf(headerField))));
        }
    }
}
