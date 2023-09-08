package je1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51092rd1;
import te3.C51163rv3;
import te3.C52144yo0;
import te3.C64835xo0;

/* renamed from: je1.c2 */
public final class C60796c2 extends C60625c<C52144yo0> {

    /* renamed from: s */
    public static C89349b f173165s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60796c2(int i, String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "username");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64835xo0 xo02 = new C64835xo0();
        xo02.f186358f = C46523h2.f125330a.mo71859a(3828);
        xo02.f186356d = i;
        xo02.f186357e = str;
        xo02.f186364o = true;
        xo02.f186366q = f173165s;
        xo02.f186367r = C58784w3.f168295a.mo83896Q(i);
        bVar.f127066a = xo02;
        C52144yo0 yo02 = new C52144yo0();
        yo02.setBaseResponse(new C49966ja());
        yo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        bVar.f127069d = 3828;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i + " username=" + str);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52144yo0 yo02 = (C52144yo0) eu32;
        C87412m.m108594g(yo02, "resp");
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(" session_id=");
        C51092rd1 rd12 = yo02.f145433g;
        sb.append(rd12 != null ? rd12.f140840e : null);
        sb.append(" enable_action=");
        C51092rd1 rd13 = yo02.f145433g;
        sb.append(rd13 != null ? Integer.valueOf(rd13.f140842g) : null);
        Log.m105924i("Finder.CgiGetMsgSessionId", sb.toString());
        f173165s = null;
        if (i != 0 || i2 != 0) {
            C115669n nVar = C115669n.INSTANCE;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i);
            sb4.append(',');
            sb4.append(i2);
            nVar.mo160131h(20492, 5L, sb4.toString());
            nVar.mo175913w(1473, 5, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60796c2(int i, String str, String str2, long j, Integer num) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "toLotteryId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64835xo0 xo02 = new C64835xo0();
        xo02.f186358f = C46523h2.f125330a.mo71859a(3828);
        xo02.f186356d = i;
        xo02.f186357e = str;
        xo02.f186362j = str2;
        xo02.f186360h = j;
        xo02.f186363n = num != null ? num.intValue() : 1;
        xo02.f186364o = true;
        xo02.f186366q = f173165s;
        xo02.f186367r = C58784w3.f168295a.mo83896Q(xo02.f186356d);
        bVar.f127066a = xo02;
        C52144yo0 yo02 = new C52144yo0();
        yo02.setBaseResponse(new C49966ja());
        yo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        bVar.f127069d = 3828;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i + " username=" + str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60796c2(int i, String str, long j, long j2) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "username");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64835xo0 xo02 = new C64835xo0();
        xo02.f186358f = C46523h2.f125330a.mo71859a(3828);
        xo02.f186356d = i;
        xo02.f186360h = j;
        xo02.f186363n = 4;
        xo02.f186361i = j2;
        xo02.f186357e = str;
        xo02.f186364o = true;
        xo02.f186366q = f173165s;
        xo02.f186367r = C58784w3.f168295a.mo83896Q(i);
        bVar.f127066a = xo02;
        C52144yo0 yo02 = new C52144yo0();
        yo02.setBaseResponse(new C49966ja());
        yo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        bVar.f127069d = 3828;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i + " username=" + str + " objectId=" + j + " commentId=" + j2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60796c2(int i, String str, long j) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "username");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64835xo0 xo02 = new C64835xo0();
        xo02.f186358f = C46523h2.f125330a.mo71859a(3828);
        xo02.f186356d = i;
        xo02.f186360h = j;
        xo02.f186363n = 8;
        xo02.f186357e = str;
        xo02.f186364o = true;
        xo02.f186366q = f173165s;
        xo02.f186367r = C58784w3.f168295a.mo83896Q(i);
        bVar.f127066a = xo02;
        C52144yo0 yo02 = new C52144yo0();
        yo02.setBaseResponse(new C49966ja());
        yo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        bVar.f127069d = 3828;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i + " username=" + str + " objectId=" + j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60796c2(String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "fansId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64835xo0 xo02 = new C64835xo0();
        xo02.f186358f = C46523h2.f125330a.mo71859a(3828);
        xo02.f186356d = 1;
        xo02.f186359g = str;
        xo02.f186364o = true;
        xo02.f186366q = f173165s;
        xo02.f186367r = C58784w3.f168295a.mo83896Q(1);
        bVar.f127066a = xo02;
        C52144yo0 yo02 = new C52144yo0();
        yo02.setBaseResponse(new C49966ja());
        yo02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = yo02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        bVar.f127069d = 3828;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] fansId=" + str);
    }
}
