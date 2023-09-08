package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52169yu1;
import te3.C52309zu1;

/* renamed from: com.tencent.mm.plugin.webview.model.x */
public class C6065x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f22363d;

    /* renamed from: e */
    public final C47350c f22364e;

    public C6065x(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52169yu1();
        bVar.f127067b = new C52309zu1();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/getappticket";
        bVar.f127069d = 1097;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22364e = a;
        C52169yu1 yu12 = (C52169yu1) a.f127055a.f127080a;
        yu12.f145511d = str;
        yu12.f145512e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22363d = nVar;
        return dispatch(gVar, this.f22364e, this);
    }

    public int getType() {
        return 1097;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetAppTicket", "errType = " + i2 + ", errCode = " + i3);
        this.f22363d.onSceneEnd(i2, i3, str, this);
    }
}
