package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8779k1;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49251e91;
import te3.C49335eu3;
import te3.C49396f91;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: qg1.z */
public final class C35853z extends C60625c<C49396f91> {

    /* renamed from: s */
    public final String f95691s = "Finder.CgiFinderLiveStream";

    /* renamed from: t */
    public C8779k1 f95692t;

    /* renamed from: u */
    public C49251e91 f95693u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35853z(C89349b bVar, int i, float f, float f2, C8779k1 k1Var) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(k1Var, "callback");
        this.f95692t = k1Var;
        C49251e91 e912 = new C49251e91();
        this.f95693u = e912;
        e912.f132812e = bVar;
        e912.f132813f = i;
        e912.f132814g = f;
        e912.f132815h = f2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = e912;
        C49396f91 f912 = new C49396f91();
        f912.setBaseResponse(new C49966ja());
        f912.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = f912;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivestream";
        bVar2.f127069d = 4151;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveStream", "CgiFinderLiveStream init " + this.f95693u.f132813f + ',' + this.f95693u.f132812e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49396f91 f912 = (C49396f91) eu32;
        C87412m.m108594g(f912, "resp");
        String str2 = this.f95691s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        this.f95692t.mo9621a(i, i2, str, f912);
    }
}
