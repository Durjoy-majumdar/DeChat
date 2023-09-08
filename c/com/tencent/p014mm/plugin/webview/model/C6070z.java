package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48675a72;
import te3.C52223z62;

/* renamed from: com.tencent.mm.plugin.webview.model.z */
public class C6070z extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f22373d;

    /* renamed from: e */
    public C11385n f22374e;

    public C6070z(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52223z62();
        bVar.f127067b = new C48675a72();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_getrandomavatar";
        bVar.f127069d = 2785;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22373d = a;
        ((C52223z62) a.f127055a.f127080a).f145717d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22374e = nVar;
        return dispatch(gVar, this.f22373d, this);
    }

    public int getType() {
        return 2785;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f22374e.onSceneEnd(i2, i3, str, this);
    }
}
