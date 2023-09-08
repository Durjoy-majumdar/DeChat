package cg2;

import ag2.C39600w0;
import ag2.C39602x0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.b */
public class C0501b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f1224d;

    /* renamed from: e */
    public C11385n f1225e;

    public C0501b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 12213;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_getunreadcount";
        C39600w0 w0Var = new C39600w0();
        w0Var.f106321d = (long) C86709a0.m107523b().mo121110g();
        bVar.f127066a = w0Var;
        bVar.f127067b = new C39602x0();
        this.f1224d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f1225e = nVar;
        return dispatch(gVar, this.f1224d, this);
    }

    public int getType() {
        return 12213;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f1225e.onSceneEnd(i2, i3, str, this);
    }
}
