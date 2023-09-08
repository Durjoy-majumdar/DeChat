package com.tencent.p014mm.plugin.newtips.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50840pj3;
import te3.C50970qj3;

/* renamed from: com.tencent.mm.plugin.newtips.model.b */
public class C42588b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f115231d;

    /* renamed from: e */
    public C47350c f115232e;

    /* renamed from: f */
    public boolean f115233f = false;

    /* renamed from: g */
    public int f115234g = 0;

    @Deprecated
    public C42588b(int i, int i2, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50840pj3();
        bVar.f127067b = new C50970qj3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/pushnewtips";
        bVar.f127069d = 597;
        C47350c a = bVar.mo72403a();
        this.f115232e = a;
        C50840pj3 pj32 = (C50840pj3) a.f127055a.f127080a;
        pj32.f139793d = i;
        pj32.f139794e = i2;
        pj32.f139795f = str;
        this.f115234g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetScenePushCompatNewTips", "doScene");
        this.f115231d = nVar;
        return dispatch(gVar, this.f115232e, this);
    }

    public int getType() {
        return 597;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            this.f115233f = ((C50970qj3) ((C47350c) uVar).f127056b.f127083a).f140353d;
            this.f115231d.onSceneEnd(i2, i3, str, this);
            return;
        }
        Log.m105920e("MicroMsg.NetScenePushCompatNewTips", "errType:" + i2 + " errCode:" + i3);
        this.f115231d.onSceneEnd(i2, i3, str, this);
    }
}
