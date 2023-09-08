package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i */
public class C1749i implements C82794c.C82798c {

    /* renamed from: a */
    public final /* synthetic */ C81879g f11483a;

    /* renamed from: b */
    public final /* synthetic */ int f11484b;

    /* renamed from: c */
    public final /* synthetic */ JsApiNavigateToDevMiniProgram f11485c;

    public C1749i(JsApiNavigateToDevMiniProgram jsApiNavigateToDevMiniProgram, C81879g gVar, int i) {
        this.f11485c = jsApiNavigateToDevMiniProgram;
        this.f11483a = gVar;
        this.f11484b = i;
    }

    /* renamed from: a */
    public void mo1732a(boolean z, String str) {
        String str2;
        String str3;
        if (z) {
            str2 = "ok";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("fail");
            if (TextUtils.isEmpty(str)) {
                str3 = "";
            } else {
                str3 = " " + str;
            }
            sb.append(str3);
            str2 = sb.toString();
        }
        this.f11483a.mo109647a(this.f11484b, this.f11485c.mo115109j(str2));
    }

    /* renamed from: b */
    public /* synthetic */ void mo1733b(AppBrandInitConfig appBrandInitConfig) {
    }
}
