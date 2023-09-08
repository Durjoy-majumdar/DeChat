package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import android.text.TextUtils;
import ba1.C16777c;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import op3.C117877b;
import te3.C22505ka3;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.c */
public final class C18746c {
    /* renamed from: a */
    public static void m19503a(String str) {
        C22505ka3 e;
        C117877b<String, String> j;
        if (!TextUtils.isEmpty(str)) {
            C115411b.C115412a aVar = C115411b.f345922a;
            if (str != null && (e = C16777c.m16413e()) != null && (j = aVar.mo175253j(e.f64087d)) != null) {
                String str2 = e.f64087d;
                if (!(str2 == null ? false : C87412m.m108589b("145", aVar.mo175244a(str2)))) {
                    Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, old: " + e.f64087d);
                    String str3 = str + '_' + j.mo182596a(1);
                    e.f64087d = str3;
                    C16777c.m16418j(e);
                    Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "HellK, updateCurSid, new: " + str3);
                }
            }
        }
    }
}
