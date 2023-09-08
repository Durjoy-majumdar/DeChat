package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50969qj2;
import te3.C51117rj2;

/* renamed from: com.tencent.mm.plugin.webview.model.b0 */
public class C6025b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f22271d;

    /* renamed from: e */
    public final C47350c f22272e;

    public C6025b0(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50969qj2();
        bVar.f127067b = new C51117rj2();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibggetuseropenid";
        bVar.f127069d = 1566;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22272e = a;
        C50969qj2 qj22 = (C50969qj2) a.f127055a.f127080a;
        qj22.f140351d = str2;
        qj22.f140352e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetUserOpenId", "doScene");
        this.f22271d = nVar;
        return dispatch(gVar, this.f22272e, this);
    }

    public int getType() {
        return 1566;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22271d.onSceneEnd(i2, i3, str, this);
    }
}
