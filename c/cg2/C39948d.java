package cg2;

import ag2.C39570c1;
import ag2.C39573d1;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.d */
public class C39948d extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f107090d;

    /* renamed from: e */
    public C11385n f107091e;

    /* renamed from: f */
    public String f107092f;

    public C39948d(String str) {
        this.f107092f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11016;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_searchmailaddr";
        C39570c1 c1Var = new C39570c1();
        c1Var.f106224d = (long) C86709a0.m107523b().mo121110g();
        c1Var.f106225e = str;
        bVar.f127066a = c1Var;
        bVar.f127067b = new C39573d1();
        this.f107090d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107091e = nVar;
        return dispatch(gVar, this.f107090d, this);
    }

    public int getType() {
        return 11016;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f107091e.onSceneEnd(i2, i3, str, this);
    }
}
