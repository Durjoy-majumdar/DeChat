package sn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49949j60;
import te3.C49966ja;
import te3.C50085k60;
import te3.C51163rv3;

/* renamed from: sn1.c */
public final class C13738c extends C60625c<C50085k60> {

    /* renamed from: s */
    public final String f38837s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13738c(int i, String str, int i2, boolean z, String str2, int i3, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        z = (i3 & 8) != 0 ? true : z;
        str2 = (i3 & 16) != 0 ? "" : str2;
        C87412m.m108594g(str, "lastBuffer");
        C87412m.m108594g(str2, "appId");
        this.f38837s = "Finder.CgiFinderLiveEcCustomerGetOrderList";
        C49949j60 j602 = new C49949j60();
        j602.f135883d = i;
        j602.f135886g = str;
        j602.f135885f = i2;
        j602.f135887h = z;
        j602.f135888i = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = j602;
        C50085k60 k602 = new C50085k60();
        k602.setBaseResponse(new C49966ja());
        k602.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = k602;
        bVar.f127068c = "/cgi-bin/micromsg-bin/eccustomergetorderlist";
        bVar.f127069d = 6881;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveEcCustomerGetOrderList", "init tabType:" + i + ", lastBuffer:" + str + ", pageSize:" + i2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50085k60) eu32, "resp");
        String str2 = this.f38837s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
