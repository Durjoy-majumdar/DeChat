package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51191s2;
import te3.C51331t2;

/* renamed from: com.tencent.mm.plugin.webview.model.v */
public class C6061v extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f22359d;

    /* renamed from: e */
    public C11385n f22360e;

    /* renamed from: f */
    public String f22361f;

    public C6061v(String str, String str2, String str3) {
        this.f22361f = str3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51191s2();
        bVar.f127067b = new C51331t2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_addavatarheadimg";
        bVar.f127069d = 2667;
        bVar.f127070e = 2667;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22359d = a;
        C51191s2 s2Var = (C51191s2) a.f127055a.f127080a;
        s2Var.f141278d = str;
        s2Var.f141279e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22360e = nVar;
        return dispatch(gVar, this.f22359d, this);
    }

    public int getType() {
        return 2667;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCreateAvatar", "NetSceneCreateAvatar:  netId = %d, errType = %d,errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f22360e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
