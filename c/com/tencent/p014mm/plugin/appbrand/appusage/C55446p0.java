package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import te3.mm4;
import te3.nm4;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.p0 */
public class C55446p0 extends C89132b<nm4> {

    /* renamed from: i */
    public final mm4 f157928i;

    public C55446p0(int i, boolean z, int i2, int i3, int i4, String str, int i5, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        mm4 mm4 = new mm4();
        mm4.f184357d = i == 0 ? 1000 : i;
        mm4.f184358e = z ? 1 : 0;
        mm4.f184359f = i2;
        mm4.f184360g = i3;
        mm4.f184361h = i4;
        mm4.f184362i = str;
        mm4.f184363j = i5;
        mm4.f184364n = str2;
        this.f157928i = mm4;
        bVar.f127066a = mm4;
        bVar.f127067b = new nm4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
        bVar.f127069d = JsApiNavigateToMiniProgramForFinderProductShare.CTRL_INDEX;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        Log.m105925i("MicroMsg.AppBrand.CgiUpdateWxaUsageRecord", "onCgiBack, req [scene %d, background %b, versionType %d, recordType %d, op %d, username %s]resp [errType %d, errCode %d, errMsg %s, resp %s]", Integer.valueOf(this.f157928i.f184357d), Integer.valueOf(this.f157928i.f184358e), Integer.valueOf(this.f157928i.f184359f), Integer.valueOf(this.f157928i.f184360g), Integer.valueOf(this.f157928i.f184361h), this.f157928i.f184362i, Integer.valueOf(i), Integer.valueOf(i2), str, (nm4) eu32);
    }
}
