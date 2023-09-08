package com.tencent.kinda.framework.app;

import b63.C113146l;
import com.tencent.kinda.gen.KindaLocationManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C77963l1;

public class KindaLocationManagerImpl implements KindaLocationManager {
    private static final String TAG = "KindaLocationManagerImpl";

    public String getCellInfo() {
        C77963l1 c = C113146l.m154805c();
        String str = c != null ? c.f227800p : "";
        Log.m105924i(TAG, "getCellInfo return: " + str);
        return str;
    }

    public String getEncryptInfo(boolean z, boolean z2) {
        C77963l1 c = C113146l.m154805c();
        String str = c != null ? c.f227798n : "";
        Log.m105924i(TAG, "getEncryptInfo return: " + str);
        return str;
    }

    public String getEncryptKey() {
        C77963l1 c = C113146l.m154805c();
        String str = c != null ? c.f227799o : "";
        Log.m105924i(TAG, "getEncryptKey return: " + str);
        return str;
    }
}
