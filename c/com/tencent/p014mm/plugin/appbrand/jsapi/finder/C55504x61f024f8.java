package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import te3.C64287ci1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1 */
public final class C55504x61f024f8 implements C82794c.C82798c {

    /* renamed from: a */
    public final /* synthetic */ C82794c.C82798c f158094a;

    /* renamed from: b */
    public final /* synthetic */ C81879g f158095b;

    /* renamed from: c */
    public final /* synthetic */ String f158096c;

    /* renamed from: d */
    public final /* synthetic */ C64287ci1 f158097d;

    public C55504x61f024f8(C82794c.C82798c cVar, C81879g gVar, String str, C64287ci1 ci12) {
        this.f158094a = cVar;
        this.f158095b = gVar;
        this.f158096c = str;
        this.f158097d = ci12;
    }

    /* renamed from: a */
    public void mo1732a(boolean z, String str) {
        C82794c.C82798c cVar = this.f158094a;
        if (cVar != null) {
            cVar.mo1732a(z, str);
        }
        if (z) {
            new C82507x48fd9d26(this.f158095b, this.f158096c, this.f158097d, C40008f.f107254d).alive();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo1733b(AppBrandInitConfig appBrandInitConfig) {
    }
}
