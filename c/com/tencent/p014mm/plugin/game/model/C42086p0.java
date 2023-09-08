package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50864pr1;
import te3.C51001qr1;

/* renamed from: com.tencent.mm.plugin.game.model.p0 */
public class C42086p0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113385d;

    /* renamed from: e */
    public final C47350c f113386e;

    public C42086p0(String str, LinkedList<String> linkedList, LinkedList<String> linkedList2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50864pr1();
        bVar.f127067b = new C51001qr1();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamecentersearch";
        bVar.f127069d = 1328;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113386e = a;
        C50864pr1 pr12 = (C50864pr1) a.f127055a.f127080a;
        pr12.f139913f = str;
        pr12.f139911d = linkedList;
        pr12.f139912e = linkedList2;
        pr12.f139915h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113385d = nVar;
        return dispatch(gVar, this.f113386e, this);
    }

    public int getType() {
        return 1328;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGameCenterSearch", "errType = " + i2 + ", errCode = " + i3);
        this.f113385d.onSceneEnd(i2, i3, str, this);
    }
}
