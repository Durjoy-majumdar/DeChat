package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p154fy.C87119d;
import te3.C50583nr2;
import te3.C50720or2;

/* renamed from: com.tencent.mm.modelsimple.z */
public class C40374z extends C117747y implements C1311n, C87119d {

    /* renamed from: d */
    public C11385n f108500d;

    /* renamed from: e */
    public final C47350c f108501e;

    public C40374z(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50583nr2();
        bVar.f127067b = new C50720or2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/logout";
        bVar.f127069d = 282;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108501e = a;
        ((C50583nr2) a.f127055a.f127080a).f138740d = i;
    }

    /* renamed from: V */
    public String mo63086V() {
        return ((C50720or2) this.f108501e.f127056b.f127083a).f139336d;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneLogout", "doScene");
        this.f108500d = nVar;
        return dispatch(gVar, this.f108501e, this);
    }

    public int getType() {
        return 282;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105918d("MicroMsg.NetSceneLogout", "logout Error. ");
        }
        C11385n nVar = this.f108500d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
