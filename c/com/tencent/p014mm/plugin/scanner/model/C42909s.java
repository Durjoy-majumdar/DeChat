package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C52107yf;
import te3.C52254zf;

/* renamed from: com.tencent.mm.plugin.scanner.model.s */
public class C42909s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116182d;

    /* renamed from: e */
    public C47350c f116183e;

    /* renamed from: f */
    public String f116184f;

    /* renamed from: g */
    public int f116185g;

    /* renamed from: h */
    public String f116186h;

    public C42909s(String str, int i, String str2) {
        this.f116184f = str;
        this.f116185g = i;
        this.f116186h = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116182d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52107yf();
        bVar.f127067b = new C52254zf();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
        bVar.f127069d = 1063;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116183e = a;
        C52107yf yfVar = (C52107yf) a.f127055a.f127080a;
        yfVar.f145253d = this.f116184f;
        yfVar.f145254e = this.f116185g;
        yfVar.f145255f = this.f116186h;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 1063;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.scanner.NetSceneGetProductInfo", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f116182d.onSceneEnd(i2, i3, str, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str;
        C52107yf yfVar = (C52107yf) ((C47350c) uVar).f127055a.f127080a;
        if (yfVar.f145254e >= 0 && (str = yfVar.f145253d) != null && str.length() > 0) {
            return y$$d.EOk;
        }
        Log.m105921e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", Integer.valueOf(yfVar.f145254e));
        return y$$d.EFailed;
    }
}
