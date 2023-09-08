package cg2;

import ag2.C39566a1;
import ag2.C39605z0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: cg2.c */
public class C39947c extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f107087d;

    /* renamed from: e */
    public C11385n f107088e;

    /* renamed from: f */
    public String f107089f;

    public C39947c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11312;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_readmail";
        C39605z0 z0Var = new C39605z0();
        z0Var.f106332e = str;
        z0Var.f106331d = (long) C86709a0.m107523b().mo121110g();
        bVar.f127066a = z0Var;
        bVar.f127067b = new C39566a1();
        this.f107087d = bVar.mo72403a();
        this.f107089f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107088e = nVar;
        return dispatch(gVar, this.f107087d, this);
    }

    public int getType() {
        return 11312;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f107088e.onSceneEnd(i2, i3, str, this);
    }
}
