package com.tencent.p014mm.plugin.sight.decode.model;

import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.sight.decode.model.b */
public class C30396b implements Runnable {
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).freeAll();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SightPlayController", "free all sight error");
            Log.printErrStackTrace("MicroMsg.SightPlayController", e, "", new Object[0]);
        }
        Log.m105925i("MicroMsg.SightPlayController", "free all, use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
