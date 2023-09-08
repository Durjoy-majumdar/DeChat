package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import te3.tl4;
import te3.ul4;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b */
public final class C40492b extends C89132b<ul4> {
    public C40492b(String str, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        tl4 tl4 = new tl4();
        tl4.f142282d = str;
        tl4.f142283e = i;
        tl4.f142284f = str2;
        bVar.f127066a = tl4;
        bVar.f127067b = new ul4();
        bVar.f127069d = 2578;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/updateruntimeqrcode";
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        ul4 ul4 = (ul4) eu32;
        Log.m105924i("MicroMsg.CgiUpdateRuntimeQrcode", "onCgiBack errType[" + i + "] errCode[" + i2 + "] errMsg[" + str + ']');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40492b(String str, int i, String str2, int i2, C8480h hVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2);
    }
}
