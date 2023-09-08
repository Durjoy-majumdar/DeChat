package cg2;

import ag2.C39588j1;
import ag2.C39590k1;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.g */
public class C0502g extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f1226d;

    /* renamed from: e */
    public C11385n f1227e;

    /* renamed from: f */
    public String f1228f;

    public C0502g(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11480;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_updatemailstatus";
        C39588j1 j1Var = new C39588j1();
        j1Var.f106268e.add(str);
        j1Var.f106267d = (long) C86709a0.m107523b().mo121110g();
        j1Var.f106269f = (long) i;
        bVar.f127066a = j1Var;
        bVar.f127067b = new C39590k1();
        this.f1226d = bVar.mo72403a();
        this.f1228f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f1227e = nVar;
        return dispatch(gVar, this.f1226d, this);
    }

    public int getType() {
        return 11480;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f1227e.onSceneEnd(i2, i3, str, this);
    }
}
