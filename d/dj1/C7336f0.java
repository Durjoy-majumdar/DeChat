package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49073d01;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51467tz0;
import te3.C51617uz0;

/* renamed from: dj1.f0 */
public final class C7336f0 extends C58286q<C51617uz0> {

    /* renamed from: t */
    public C51467tz0 f25452t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7336f0(String str, C89349b bVar, long j, long j2, String str2, int i, C49073d01 d012) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "finder_username");
        C87412m.m108594g(d012, "reqBuffer");
        C51467tz0 tz02 = new C51467tz0();
        this.f25452t = tz02;
        tz02.f142481d = C46523h2.f125330a.mo71860b(4119, this.f172731j);
        C51467tz0 tz03 = this.f25452t;
        tz03.f142482e = str;
        tz03.f142483f = bVar;
        tz03.f142484g = j;
        tz03.f142485h = j2;
        tz03.f142486i = str2;
        tz03.f142487j = i;
        tz03.f142488n = C58739j4.f168176a.mo83710g0(d012);
        Log.m105924i("Finder.CgiFinderLiveGetDeliveryDetail", "#init objectId=" + j + " liveId=" + j2 + " objectNonceId=" + str2 + " cmdId=" + i + " reqBuffer.package_id=" + d012.f132051d);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f25452t;
        C51617uz0 uz02 = new C51617uz0();
        uz02.setBaseResponse(new C49966ja());
        uz02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = uz02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetdeliverydetail";
        bVar2.f127069d = 4119;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51617uz0 uz02 = (C51617uz0) eu32;
        C87412m.m108594g(uz02, "resp");
        StringBuilder sb = new StringBuilder();
        sb.append("#onCgiEnd errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(", cmd_id:");
        sb.append(uz02.f143197d);
        sb.append(" resp_buffer:");
        C89349b bVar = uz02.f143198e;
        sb.append(bVar != null ? bVar.mo123705h() : null);
        Log.m105924i("Finder.CgiFinderLiveGetDeliveryDetail", sb.toString());
    }
}
