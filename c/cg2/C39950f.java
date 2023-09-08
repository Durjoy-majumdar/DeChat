package cg2;

import ag2.C39584h1;
import ag2.C39586i1;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.f */
public class C39950f extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f107096d;

    /* renamed from: e */
    public C11385n f107097e;

    /* renamed from: f */
    public long f107098f;

    public C39950f(long j) {
        this.f107098f = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 14418;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_syncconact";
        C39584h1 h1Var = new C39584h1();
        h1Var.f106257e = j;
        h1Var.f106256d = (long) C86709a0.m107523b().mo121110g();
        bVar.f127066a = h1Var;
        bVar.f127067b = new C39586i1();
        this.f107096d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107097e = nVar;
        return dispatch(gVar, this.f107096d, this);
    }

    public int getType() {
        return 14418;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f107097e.onSceneEnd(i2, i3, str, this);
    }
}
