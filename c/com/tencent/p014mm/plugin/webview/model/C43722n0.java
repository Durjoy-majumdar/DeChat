package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49891is2;
import te3.C50587ns2;
import te3.C50725os2;

/* renamed from: com.tencent.mm.plugin.webview.model.n0 */
public class C43722n0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f118172d;

    /* renamed from: e */
    public C11385n f118173e;

    /* renamed from: f */
    public String f118174f;

    /* renamed from: g */
    public String f118175g;

    public C43722n0(String str, String str2, C49891is2 is22) {
        this.f118174f = str;
        this.f118175g = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50587ns2();
        bVar.f127067b = new C50725os2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_uploadcdninfo";
        bVar.f127069d = 1034;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f118172d = a;
        C50587ns2 ns22 = (C50587ns2) a.f127055a.f127080a;
        ns22.f138746d = str;
        ns22.f138747e = is22;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f118173e = nVar;
        return dispatch(gVar, this.f118172d, this);
    }

    public int getType() {
        return 1034;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f118173e.onSceneEnd(i2, i3, str, this);
    }
}
