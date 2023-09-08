package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50440mr1;
import te3.C50582nr1;

/* renamed from: com.tencent.mm.plugin.game.model.q0 */
public class C42088q0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113390d;

    /* renamed from: e */
    public final C47350c f113391e;

    /* renamed from: f */
    public String f113392f;

    public C42088q0(String str, String str2, LinkedList<String> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50440mr1();
        bVar.f127067b = new C50582nr1();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
        bVar.f127069d = 1329;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        if (str2 == null) {
            this.f113392f = "";
        } else {
            this.f113392f = str2.trim();
        }
        C47350c a = bVar.mo72403a();
        this.f113391e = a;
        C50440mr1 mr12 = (C50440mr1) a.f127055a.f127080a;
        mr12.f138168f = str;
        mr12.f138166d = str2;
        mr12.f138167e = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113390d = nVar;
        return dispatch(gVar, this.f113391e, this);
    }

    public int getType() {
        return 1329;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + i2 + ", errCode = " + i3);
        this.f113390d.onSceneEnd(i2, i3, str, this);
    }
}
