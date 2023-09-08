package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.a75;
import te3.z65;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.a */
public final class C40491a extends C89132b<a75> {

    /* renamed from: i */
    public final String f108788i;

    /* renamed from: j */
    public final int f108789j;

    public C40491a(String str, int i, String str2, C8480h hVar) {
        this.f108788i = str;
        this.f108789j = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        z65 z65 = new z65();
        z65.f145728d = i;
        z65.f145729e = str2 == null ? null : C89349b.m111675b(str2);
        z65.f145730f = str;
        bVar.f127066a = z65;
        bVar.f127067b = new a75();
        bVar.f127069d = 2889;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaruntime/updatedeeplinkinfo";
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        a75 a75 = (a75) eu32;
        Log.m105924i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "onCgiBack errType:" + i + " errCode:" + i2 + " errMsg:" + str + ", cgiHash[" + hashCode() + ']');
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<a75>> mo9225i() {
        Log.m105924i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "run() ticket:" + this.f108788i + " status:" + this.f108789j + ", cgiHash[" + hashCode() + ']');
        C89059e<C89132b.C89134c<a75>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }
}
