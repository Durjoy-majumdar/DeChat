package com.tencent.p014mm.game.report;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import x10.C53281e;
import x10.C53282f;

/* renamed from: com.tencent.mm.game.report.e */
public class C40310e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108380d;

    /* renamed from: e */
    public final C47350c f108381e;

    public C40310e(String str, int i, int i2, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C53281e();
        bVar.f127067b = new C53282f();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamereport";
        bVar.f127069d = 1223;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108381e = a;
        C53281e eVar = (C53281e) a.f127055a.f127080a;
        eVar.f148868d = str;
        eVar.f148870f = i;
        eVar.f148871g = i2;
        eVar.f148872h = str2;
        eVar.f148873i = str3;
        eVar.f148869e = (int) (System.currentTimeMillis() / 1000);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108380d = nVar;
        return dispatch(gVar, this.f108381e, this);
    }

    public int getType() {
        return 1223;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetGameIndex", "errType = " + i2 + ", errCode = " + i3);
        this.f108380d.onSceneEnd(i2, i3, str, this);
    }
}
