package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p154fy.C45843c;
import te3.C49502g20;
import te3.C49644h20;

/* renamed from: com.tencent.mm.modelsimple.o */
public class C40365o extends C117747y implements C1311n, C45843c {

    /* renamed from: d */
    public final C47350c f108476d;

    /* renamed from: e */
    public C11385n f108477e;

    public C40365o(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49502g20();
        bVar.f127067b = new C49644h20();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_delavatar";
        bVar.f127069d = 2700;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108476d = a;
        ((C49502g20) a.f127055a.f127080a).f133797d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108477e = nVar;
        return dispatch(gVar, this.f108476d, this);
    }

    public int getType() {
        return 2700;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f108477e.onSceneEnd(i2, i3, str, this);
    }
}
