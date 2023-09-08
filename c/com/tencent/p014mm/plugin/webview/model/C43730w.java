package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50031js2;
import te3.C50174ks2;

/* renamed from: com.tencent.mm.plugin.webview.model.w */
public class C43730w extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f118188d;

    /* renamed from: e */
    public C11385n f118189e;

    /* renamed from: f */
    public String f118190f;

    /* renamed from: g */
    public String f118191g;

    public C43730w(String str, String str2) {
        this.f118190f = str;
        this.f118191g = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50031js2();
        bVar.f127067b = new C50174ks2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_downloadcdninfo";
        bVar.f127069d = 1035;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f118188d = a;
        C50031js2 js22 = (C50031js2) a.f127055a.f127080a;
        js22.f136297d = str;
        js22.f136298e = str2;
        Log.m105925i("MicroMsg.NetSceneDownloadCdnInfo", "download cdn info, appid : %s, mediaId : %s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f118189e = nVar;
        return dispatch(gVar, this.f118188d, this);
    }

    public int getType() {
        return 1035;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneDownloadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f118189e.onSceneEnd(i2, i3, str, this);
    }
}
