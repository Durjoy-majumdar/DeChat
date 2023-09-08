package com.tencent.live2;

import android.content.Context;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.impl.C17631a;

public class V2TXLivePremier {

    public static abstract class V2TXLivePremierObserver {
        public void onLicenceLoaded(int i, String str) {
        }

        public void onLog(int i, String str) {
        }
    }

    public static String getSDKVersionStr() {
        return C17631a.m17916a();
    }

    public static void setEnvironment(String str) {
        C17631a.m17920a(str);
    }

    public static void setLicence(Context context, String str, String str2) {
        C17631a.m17917a(context, str, str2);
    }

    public static void setLogConfig(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        C17631a.m17918a(v2TXLiveLogConfig);
    }

    public static void setObserver(V2TXLivePremierObserver v2TXLivePremierObserver) {
        C17631a.m17919a(v2TXLivePremierObserver);
    }

    public static void setSocks5Proxy(String str, int i, String str2, String str3) {
        C17631a.m17921a(str, i, str2, str3);
    }
}
