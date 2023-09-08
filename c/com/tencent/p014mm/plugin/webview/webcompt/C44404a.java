package com.tencent.p014mm.plugin.webview.webcompt;

import android.net.Uri;
import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import u24.C90598g;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.a */
public final class C44404a {

    /* renamed from: a */
    public static final HashMap<String, Integer> f120354a = new HashMap<>();

    /* renamed from: a */
    public static final String m48764a(String str) {
        C87412m.m108594g(str, "<this>");
        try {
            String host = Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (Exception unused) {
            return "unknow";
        }
    }

    /* renamed from: b */
    public static final C104289g m48765b(C40427l0 l0Var) {
        C87412m.m108594g(l0Var, "<this>");
        return new C104289g(C81291m0.m99666b(l0Var, "/meta.json"));
    }

    /* renamed from: c */
    public static final int m48766c(C40427l0 l0Var) {
        C87412m.m108594g(l0Var, "<this>");
        HashMap<String, Integer> hashMap = f120354a;
        Integer num = hashMap.get(l0Var.mo63190c());
        if (num == null) {
            num = Integer.valueOf(m48765b(l0Var).optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION));
            int intValue = num.intValue();
            String c = l0Var.mo63190c();
            C87412m.m108593f(c, "this.pkgPath");
            hashMap.put(c, Integer.valueOf(intValue));
            Log.m105924i("pkgVersion", "getPkgVersion pkgPath=" + l0Var.mo63190c() + ", pkgVersion=" + intValue);
        }
        return num.intValue();
    }

    /* renamed from: d */
    public static final String m48767d(String str) {
        C87412m.m108594g(str, "<this>");
        return '\'' + C90598g.m113502a(str) + '\'';
    }
}
