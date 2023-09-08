package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29332j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import mi0.C34574b;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.i */
public final class C29331i {

    /* renamed from: a */
    public static final C29331i f80084a = new C29331i();

    /* renamed from: a */
    public final int mo56609a(String str) {
        C87412m.m108594g(str, "appId");
        long longValue = new C77710q(((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(str)).longValue();
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        boolean z = multiProcessMMKV.getBoolean("hadTransferToEncryptMMKV" + '#' + longValue + '#' + str, false);
        int i = 1;
        if (z) {
            MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
            StringBuilder sb = new StringBuilder();
            sb.append("keyHadFinishTransferToEncryptMMKV");
            sb.append('#');
            sb.append(longValue);
            sb.append('#');
            sb.append(str);
            i = multiProcessMMKV2.getBoolean(sb.toString(), false) ? 5 : 4;
        } else {
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            C29332j.C29333a aVar = C29332j.f80085e;
            if (defaultPreference.getBoolean(aVar.mo56611a("keyHadFinishTransfer", longValue, str), false)) {
                i = 2;
            } else if (defaultPreference.getBoolean(aVar.mo56611a("hadTransferToMMKV", longValue, str), false) && !C29336k.f80092a.mo56615a()) {
                i = 3;
            }
        }
        Log.m105924i("MicroMsg.AppBrandKVStorageScheme", "getStorageScheme:" + i);
        return i;
    }
}
