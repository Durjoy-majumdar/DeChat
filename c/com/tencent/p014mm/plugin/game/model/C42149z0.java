package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import py1.C47678t4;
import py1.C47685u4;

/* renamed from: com.tencent.mm.plugin.game.model.z0 */
public class C42149z0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113599d;

    /* renamed from: e */
    public final C47350c f113600e;

    public C42149z0(String str, String str2, String str3, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47678t4();
        bVar.f127067b = new C47685u4();
        bVar.f127068c = "/cgi-bin/mmgame-bin/newsubscribenewgame";
        bVar.f127069d = 1219;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113600e = a;
        C47678t4 t4Var = (C47678t4) a.f127055a.f127080a;
        t4Var.f128031e = str;
        t4Var.f128030d = str2;
        t4Var.f128032f = str3;
        t4Var.f128034h = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113599d = nVar;
        return dispatch(gVar, this.f113600e, this);
    }

    public int getType() {
        return 1219;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGameSubscription", "errType = " + i2 + ", errCode = " + i3);
        this.f113599d.onSceneEnd(i2, i3, str, this);
    }
}
