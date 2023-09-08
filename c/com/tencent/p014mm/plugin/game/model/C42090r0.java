package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import py1.C47682u1;
import py1.C47688v1;

/* renamed from: com.tencent.mm.plugin.game.model.r0 */
public class C42090r0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113394d;

    /* renamed from: e */
    public final C47350c f113395e;

    public C42090r0(String str, String str2, boolean z, boolean z2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47682u1();
        bVar.f127067b = new C47688v1();
        bVar.f127068c = "/cgi-bin/mmgame-bin/newgetgamedetail";
        bVar.f127069d = 1217;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113395e = a;
        C47682u1 u1Var = (C47682u1) a.f127055a.f127080a;
        u1Var.f128049d = str;
        u1Var.f128050e = str2;
        u1Var.f128051f = z;
        u1Var.f128054i = z2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113394d = nVar;
        return dispatch(gVar, this.f113395e, this);
    }

    public int getType() {
        return 1217;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + i2 + ", errCode = " + i3);
        this.f113394d.onSceneEnd(i2, i3, str, this);
    }
}
