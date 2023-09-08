package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C52053y13;
import te3.C64792w13;
import te3.C64821x13;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.u */
public final class C56993u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f163216d;

    /* renamed from: e */
    public final C47350c f163217e;

    public C56993u(LinkedList<C64821x13> linkedList) {
        C87412m.m108594g(linkedList, "reqInfos");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6473;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetlink";
        bVar.f127066a = new C64792w13();
        bVar.f127067b = new C52053y13();
        C47350c a = bVar.mo72403a();
        this.f163217e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetLinkReq");
        ((C64792w13) aVar).f186032d = linkedList;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (C64821x13 x132 : linkedList) {
            stringBuffer.append("(");
            stringBuffer.append(x132.f186251d);
            stringBuffer.append(",");
            stringBuffer.append(x132.f186252e);
            stringBuffer.append("),");
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f163216d = nVar;
        return dispatch(gVar, this.f163217e, this);
    }

    public int getType() {
        return 6473;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f163217e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetLinkResp");
            C52053y13 y132 = (C52053y13) aVar;
            C11385n nVar = this.f163216d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f163216d;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
