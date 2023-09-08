package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48722aj0;
import te3.C49098d51;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52268zi0;

/* renamed from: je1.q */
public final class C9365q extends C60625c<C48722aj0> {

    /* renamed from: s */
    public C52268zi0 f29245s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9365q(String str, C49098d51 d512, int i, C49712hj1 hj12) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(d512, "noticeInfo");
        C52268zi0 zi02 = new C52268zi0();
        this.f29245s = zi02;
        zi02.f145971e = str;
        zi02.f145972f = d512;
        zi02.f145973g = i;
        zi02.f145970d = C46523h2.f125330a.mo71860b(6653, hj12);
        C52268zi0 zi03 = this.f29245s;
        C49842ig0 ig02 = zi03.f145970d;
        if (ig02 != null) {
            ig02.f135313e = hj12 != null ? hj12.f134677n : 0;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = zi03;
        C48722aj0 aj02 = new C48722aj0();
        aj02.setBaseResponse(new C49966ja());
        aj02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = aj02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercreatelivenotice";
        bVar.f127069d = 6653;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48722aj0) eu32, "resp");
        Log.m105924i("Cgi.CgiFinderCreateLiveNotice", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
