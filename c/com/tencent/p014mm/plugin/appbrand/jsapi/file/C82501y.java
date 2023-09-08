package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.util.ArrayMap;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import p170ic.C87688b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.y */
public final class C82501y implements C84754j1.C84756b {

    /* renamed from: a */
    public final /* synthetic */ ArrayMap<String, String> f241568a;

    /* renamed from: b */
    public final /* synthetic */ String f241569b;

    /* renamed from: c */
    public final /* synthetic */ C87688b f241570c;

    public C82501y(ArrayMap<String, String> arrayMap, String str, C87688b bVar) {
        this.f241568a = arrayMap;
        this.f241569b = str;
        this.f241570c = bVar;
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        String str2 = "fail";
        if (!(str == null || str.length() == 0)) {
            str2 = str2 + ' ' + str;
        }
        this.f241568a.put(this.f241569b, str2);
        this.f241570c.mo122118a();
    }

    public void onSuccess(String str) {
        this.f241568a.put(this.f241569b, "ok");
        this.f241570c.mo122118a();
    }
}
