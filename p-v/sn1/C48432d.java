package sn1;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50500n60;
import te3.C50638o60;
import te3.C51163rv3;

/* renamed from: sn1.d */
public final class C48432d extends C60625c<C50638o60> {

    /* renamed from: s */
    public final String f129603s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48432d(String str, int i, int i2, boolean z, String str2, int i3, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        z = (i3 & 8) != 0 ? true : z;
        str2 = (i3 & 16) != 0 ? "" : str2;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "appId");
        this.f129603s = "Finder.CgiFinderLiveEcCustomerGetOrderList";
        C50500n60 n602 = new C50500n60();
        n602.f138427d = str;
        n602.f138429f = i2;
        n602.f138430g = i;
        n602.f138431h = z;
        n602.f138432i = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = n602;
        C50638o60 o602 = new C50638o60();
        o602.setBaseResponse(new C49966ja());
        o602.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = o602;
        bVar.f127068c = "/cgi-bin/micromsg-bin/eccustomersearchorderlist";
        bVar.f127069d = 6881;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveEcCustomerGetOrderList", "init query:" + str + ", pageSize:" + i2 + ", lastOffset:" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50638o60) eu32, "resp");
        String str2 = this.f129603s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
