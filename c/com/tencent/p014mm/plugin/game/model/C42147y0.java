package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51753vx3;
import te3.C51891wx3;

/* renamed from: com.tencent.mm.plugin.game.model.y0 */
public class C42147y0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113597d;

    /* renamed from: e */
    public final C47350c f113598e;

    public C42147y0(int i, int i2) {
        Log.m105925i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", Integer.valueOf(i), Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51753vx3();
        bVar.f127067b = new C51891wx3();
        bVar.f127068c = "/cgi-bin/mmgame-bin/searchgamelist";
        bVar.f127069d = 1215;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113598e = a;
        C51753vx3 vx32 = (C51753vx3) a.f127055a.f127080a;
        vx32.f143756d = i;
        vx32.f143757e = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113597d = nVar;
        return dispatch(gVar, this.f113598e, this);
    }

    public int getType() {
        return 1215;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneSearchGameList", "errType = " + i2 + ", errCode = " + i3);
        this.f113597d.onSceneEnd(i2, i3, str, this);
    }
}
