package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import py1.C47613k2;
import py1.C47620l2;

/* renamed from: com.tencent.mm.plugin.game.model.w0 */
public class C42142w0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113587d;

    /* renamed from: e */
    public final C47350c f113588e;

    public C42142w0(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.NetSceneGetMoreGameList", "offset: %d, limit: %d, type: %d, cat: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47613k2();
        bVar.f127067b = new C47620l2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/newgetmoregamelist";
        bVar.f127069d = 1220;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113588e = a;
        C47613k2 k2Var = (C47613k2) a.f127055a.f127080a;
        k2Var.f127829d = i;
        k2Var.f127830e = i2;
        k2Var.f127831f = LocaleUtil.getApplicationLanguage();
        k2Var.f127832g = i3;
        k2Var.f127833h = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113587d = nVar;
        return dispatch(gVar, this.f113588e, this);
    }

    public int getType() {
        return 1220;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetMoreGameList", "errType = " + i2 + ", errCode = " + i3);
        this.f113587d.onSceneEnd(i2, i3, str, this);
    }
}
