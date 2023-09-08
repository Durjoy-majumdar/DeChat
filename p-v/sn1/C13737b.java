package sn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49664h60;
import te3.C49712hj1;
import te3.C49805i60;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: sn1.b */
public final class C13737b extends C60625c<C49805i60> {

    /* renamed from: s */
    public final String f38836s = "Finder.CgiFinderLiveEcCustomerGetOrderInfo";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13737b(String str) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "orderId");
        C49664h60 h602 = new C49664h60();
        h602.f134459d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = h602;
        C49805i60 i602 = new C49805i60();
        i602.setBaseResponse(new C49966ja());
        i602.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = i602;
        bVar.f127068c = "/cgi-bin/micromsg-bin/eccustomergetorderinfo";
        bVar.f127069d = 10063;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveEcCustomerGetOrderInfo", "init CgiFinderLiveEcCustomerGetOrderInfo");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49805i60) eu32, "resp");
        String str2 = this.f38836s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
