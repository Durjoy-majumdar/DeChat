package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49935j30;
import te3.C50072k30;

/* renamed from: com.tencent.mm.modelsimple.p */
public class C40366p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108478d;

    /* renamed from: e */
    public final C47350c f108479e;

    public C40366p(String str, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneDelTempSession", "NetSceneDelTempSession %s", str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49935j30();
        bVar.f127067b = new C50072k30();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/deltempsession";
        bVar.f127069d = 1067;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108479e = a;
        C49935j30 j302 = (C49935j30) a.f127055a.f127080a;
        j302.f135838d = str;
        if (bArr == null) {
            j302.f135839e = C89349b.m111674a(new byte[0]);
        } else {
            j302.f135839e = C89349b.m111674a(bArr);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108478d = nVar;
        return dispatch(gVar, this.f108479e, this);
    }

    public int getType() {
        return 1067;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneDelTempSession", "onGYNetEnd: %d, %d, %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f108478d.onSceneEnd(i2, i3, str, this);
    }
}
