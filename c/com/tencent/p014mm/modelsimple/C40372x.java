package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48678a82;
import te3.C52228z72;

/* renamed from: com.tencent.mm.modelsimple.x */
public class C40372x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108496d;

    /* renamed from: e */
    public final C47350c f108497e;

    public C40372x() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52228z72();
        bVar.f127067b = new C48678a82();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getremind";
        bVar.f127069d = 866;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f108497e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108496d = nVar;
        return dispatch(gVar, this.f108497e, this);
    }

    public int getType() {
        return 866;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f108496d.onSceneEnd(i2, i3, str, this);
    }
}
