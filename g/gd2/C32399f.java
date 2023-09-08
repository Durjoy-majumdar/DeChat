package gd2;

import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.platformtools.Log;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118309f;

/* renamed from: gd2.f */
public class C32399f implements C118309f {
    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
        Log.m105925i("OfflineHandleAuthResponse", "autoAuth: %s", Boolean.valueOf(z));
        if (!z) {
            C69963m.wx0().Bx0().mo96266a(7, 7);
        }
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
    }
}
