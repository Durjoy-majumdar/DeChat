package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$d */
public class e$$d implements Runnable {
    public e$$d(C81810e eVar) {
    }

    public void run() {
        Log.m105925i("[ZIP]", "unzip JNI %d, cost %d", Integer.valueOf(ZipJNI.unzip("/sdcard/test_zip.zip", "/sdcard/test_zip/", (String) null)), Long.valueOf(Util.nowMilliSecond() - Util.nowMilliSecond()));
    }
}
