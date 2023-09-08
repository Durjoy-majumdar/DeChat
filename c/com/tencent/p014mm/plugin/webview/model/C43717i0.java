package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49159dk3;
import te3.C50369m83;
import te3.C90408ek3;

/* renamed from: com.tencent.mm.plugin.webview.model.i0 */
public class C43717i0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f118166d;

    /* renamed from: e */
    public C11385n f118167e;

    public C43717i0(String str, C50369m83 m832) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49159dk3();
        bVar.f127067b = new C90408ek3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/qrconnect_authorize";
        bVar.f127069d = 2543;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f118166d = a;
        C49159dk3 dk32 = (C49159dk3) a.f127055a.f127080a;
        dk32.f132384d = str;
        try {
            dk32.f132385e = new C89349b(m832.toByteArray());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneQRCodeOauthAuthorize", "toByteArray ex %s", e.getMessage());
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f118167e = nVar;
        return dispatch(gVar, this.f118166d, this);
    }

    public int getType() {
        return 2543;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f118167e.onSceneEnd(i2, i3, str, this);
    }
}
