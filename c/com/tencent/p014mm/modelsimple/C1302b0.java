package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49302el3;
import te3.C49441fl3;

/* renamed from: com.tencent.mm.modelsimple.b0 */
public class C1302b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f10414d;

    /* renamed from: e */
    public C47350c f10415e;

    /* renamed from: f */
    public int f10416f = 1;

    /* renamed from: g */
    public int f10417g;

    public C1302b0(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49302el3();
        bVar.f127067b = new C49441fl3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/queryhaspasswd";
        bVar.f127069d = 255;
        bVar.f127070e = 132;
        bVar.f127071f = 1000000132;
        C47350c a = bVar.mo72403a();
        this.f10415e = a;
        ((C49302el3) a.f127055a.f127080a).f132997d = i;
        this.f10417g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f10414d = nVar;
        return dispatch(gVar, this.f10415e, this);
    }

    public int getType() {
        return 255;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f10414d.onSceneEnd(i2, i3, str, this);
    }
}
