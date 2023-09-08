package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.i */
public final class C1533i implements C86297n {
    /* renamed from: a */
    public void mo1541a(int i, String str) {
        Log.m105924i("MicroMsg.AppBrandHeadlessStartTestLogic", "parseCmdVal, onError, errCode: " + i + ", errMsg: " + str);
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.AppBrandHeadlessStartTestLogic", "parseCmdVal, onSuccess");
    }
}
