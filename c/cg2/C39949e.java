package cg2;

import ag2.C39576e1;
import ag2.C39579f1;
import ag2.C39598t0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.e */
public class C39949e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f107093d;

    /* renamed from: e */
    public C11385n f107094e;

    /* renamed from: f */
    public String f107095f;

    public C39949e(String str, C39598t0 t0Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11166;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_sendmail";
        C39576e1 e1Var = new C39576e1();
        e1Var.f106238d = (long) C86709a0.m107523b().mo121110g();
        e1Var.f106239e = t0Var;
        bVar.f127066a = e1Var;
        bVar.f127067b = new C39579f1();
        this.f107093d = bVar.mo72403a();
        this.f107095f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107094e = nVar;
        return dispatch(gVar, this.f107093d, this);
    }

    public int getType() {
        return 11166;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f107094e.onSceneEnd(i2, i3, str, this);
    }
}
