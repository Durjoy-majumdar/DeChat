package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49451fo0;
import te3.C49585go0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.f1 */
public final class C45358f1 extends C58286q<C49585go0> {

    /* renamed from: t */
    public final String f122852t = "Finder.CgiFinderOnlineMember";

    /* renamed from: u */
    public C49451fo0 f122853u;

    /* renamed from: dj1.f1$a */
    public interface C45359a {
        /* renamed from: a */
        void mo70889a(int i, int i2, String str, C49585go0 go02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45358f1(C49842ig0 ig02, long j, String str, long j2, int i, C45359a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(ig02, "finderBaseRequest");
        C87412m.m108594g(str, "finderUsername");
        C49451fo0 fo02 = new C49451fo0();
        this.f122853u = fo02;
        fo02.f133605d = ig02;
        fo02.f133606e = j;
        fo02.f133608g = str;
        fo02.f133607f = j2;
        fo02.f133610i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = fo02;
        C49585go0 go02 = new C49585go0();
        go02.setBaseResponse(new C49966ja());
        go02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = go02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetliveonlinemember";
        bVar.f127069d = 3603;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderOnlineMember", "[initReqResp] liveId =" + this.f122853u.f133606e + " finderUsername=" + this.f122853u.f133608g + " scene=" + this.f122853u.f133610i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49585go0) eu32, "resp");
        String str2 = this.f122852t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
