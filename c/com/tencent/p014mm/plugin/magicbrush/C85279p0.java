package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81462w0;
import f42.C86757e;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.magicbrush.p0 */
public final class C85279p0 extends C81428p0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85279p0(C86757e eVar) {
        super(eVar.f251839a);
        C87412m.m108594g(eVar, "record");
        WxaPkg wxaPkg = new WxaPkg(eVar.f251840b);
        wxaPkg.mo63189b();
        this.f238970d.add(new C81462w0(wxaPkg));
    }
}
