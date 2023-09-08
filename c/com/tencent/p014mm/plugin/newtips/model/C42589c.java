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

/* renamed from: com.tencent.mm.plugin.newtips.model.c */
public class C42589c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f115235d;

    /* renamed from: e */
    public C47350c f115236e;

    /* renamed from: f */
    public String f115237f;

    public C42589c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50840pj3();
        bVar.f127067b = new C50970qj3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/pushnewtips";
        bVar.f127069d = 597;
        C47350c a = bVar.mo72403a();
        this.f115236e = a;
        ((C50840pj3) a.f127055a.f127080a).f139796g = str;
        this.f115237f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NewTips.NetScenePushNewTips", "doScene");
        this.f115235d = nVar;
        return dispatch(gVar, this.f115236e, this);
    }

    public int getType() {
        return 597;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C50970qj3 qj32 = (C50970qj3) ((C47350c) uVar).f127056b.f127083a;
            C115624i.m162575k(this.f115237f, qj32.f140353d);
            this.f115235d.onSceneEnd(i2, i3, str, this);
            Log.m105925i("MicroMsg.NewTips.NetScenePushNewTips", "onGYNetEnd() uniqueId:%s IsReject:%s", this.f115237f, Boolean.valueOf(qj32.f140353d));
            return;
        }
        Log.m105920e("MicroMsg.NewTips.NetScenePushNewTips", "errType:" + i2 + " errCode:" + i3);
        this.f115235d.onSceneEnd(i2, i3, str, this);
    }
}
