package jg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51677vc;
import te3.C51812wc;

/* renamed from: jg0.e */
public class C46556e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125447d;

    /* renamed from: e */
    public C47350c f125448e;

    public C46556e(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51677vc();
        bVar.f127067b = new C51812wc();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindemail";
        bVar.f127069d = 256;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125448e = a;
        C51677vc vcVar = (C51677vc) a.f127055a.f127080a;
        vcVar.f143425d = i;
        vcVar.f143426e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125447d = nVar;
        return dispatch(gVar, this.f125448e, this);
    }

    public int getType() {
        return 256;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f125447d.onSceneEnd(i2, i3, str, this);
    }
}
