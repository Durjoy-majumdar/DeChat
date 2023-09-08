package je1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C49992jh1;
import te3.C50131kh1;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: je1.h1 */
public final class C46522h1 extends C60625c<C50131kh1> {

    /* renamed from: s */
    public final String f125328s = "Finder.CgiFinderPostBoxMsg";

    /* renamed from: t */
    public C49992jh1 f125329t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46522h1(C52013xs0 xs02, C45795b bVar, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        Class cls = C55001u.class;
        C87412m.m108594g(xs02, "appMsg");
        C87412m.m108594g(bVar, "roomData");
        String str = null;
        C49992jh1 jh12 = new C49992jh1();
        this.f125329t = jh12;
        jh12.f136120e = C89349b.m111674a(((C55001u) ((C54991o) bVar.mo71262a(C54991o.class)).business(cls)).f154417n);
        C49992jh1 jh13 = this.f125329t;
        jh13.f136121f = xs02;
        jh13.f136122g = ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d;
        this.f125329t.f136123h = ((C55001u) bVar.mo71262a(cls)).f154416j;
        this.f125329t.f136124i = ((C55001u) bVar.mo71262a(cls)).f154423t;
        C49992jh1 jh14 = this.f125329t;
        jh14.f136125j = 2;
        jh14.f136126n = C66785b.f191882e.mo90662O5();
        C49992jh1 jh15 = this.f125329t;
        C46523h2 h2Var = C46523h2.f125330a;
        jh15.f136119d = h2Var.mo71859a(6888);
        h2Var.mo71865g(this.f125329t.f136119d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(((C55001u) bVar.mo71262a(cls)).f154416j))), (C49712hj1) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f125329t;
        C50131kh1 kh12 = new C50131kh1();
        kh12.setBaseResponse(new C49966ja());
        kh12.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = kh12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        bVar2.f127069d = 6888;
        mo123453j(bVar2.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiFinderPostBoxMsg init ");
        sb.append(this.f125329t.f136122g);
        sb.append(",msgType ");
        C52013xs0 xs03 = this.f125329t.f136121f;
        sb.append(xs03 != null ? Integer.valueOf(xs03.f144903e) : null);
        sb.append(", client_msg_id:");
        C52013xs0 xs04 = this.f125329t.f136121f;
        sb.append(xs04 != null ? xs04.f144904f : str);
        Log.m105924i("Finder.CgiFinderPostBoxMsg", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50131kh1) eu32, "resp");
        String str2 = this.f125328s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
