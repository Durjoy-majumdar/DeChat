package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48788b02;
import te3.C48934c02;

/* renamed from: com.tencent.mm.modelstat.m */
public final class C40375m extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f108502d;

    /* renamed from: e */
    public C11385n f108503e;

    public C40375m(C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C48788b02 b022 = new C48788b02();
        b022.f130869d = 0;
        b022.f130871f = bVar;
        bVar2.f127066a = b022;
        bVar2.f127067b = new C48934c02();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/geteventsampleconf";
        bVar2.f127069d = 1126;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        this.f108502d = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneUpdateEventConfig", "start update event config");
        setHasCallbackToQueue(true);
        this.f108503e = nVar;
        return dispatch(gVar, this.f108502d, this);
    }

    public int getType() {
        return 1126;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUpdateEventConfig", "onGYNetEnd errType: %d, errCode: %d, errMsg %s, IReqResp %s", Integer.valueOf(i2), Integer.valueOf(i3), str, uVar.toString());
        this.f108503e.onSceneEnd(i2, i3, str, this);
    }
}
