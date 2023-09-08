package je1;

import c30.C104289g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import o40.C61926c;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51562ul0;
import te3.C51707vl0;

/* renamed from: je1.u3 */
public final class C46539u3 extends C60628i {

    /* renamed from: g */
    public final String f125396g;

    /* renamed from: h */
    public int f125397h;

    /* renamed from: i */
    public C47350c f125398i;

    /* renamed from: j */
    public C11385n f125399j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46539u3(long j, int i, String str, String str2, C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "ecSource");
        this.f125396g = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5244;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetallwindowproducts";
        C51562ul0 ul02 = new C51562ul0();
        ul02.f142926e = str;
        ul02.f142927f = bVar;
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 b = h2Var.mo71860b(5244, hj12);
        ul02.f142925d = b;
        h2Var.mo71865g(b, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(j))), (C49712hj1) null);
        C104289g gVar = new C104289g();
        gVar.mo145953n("from_commentscene", i);
        gVar.put("from_feedid", C61926c.m72691p(j));
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …Id))\n        }.toString()");
        bVar2.f127066a = ul02;
        ul02.f142928g = gVar2;
        ul02.f142929h = str2;
        bVar2.f127067b = new C51707vl0();
        this.f125398i = bVar2.mo72403a();
        Log.m105924i("NetSceneFinderGetWindowProducts", "init finderUserName=" + str + ", ec_source:" + str2 + ", entranceReportInfo=" + gVar2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125399j = nVar;
        return dispatch(gVar, this.f125398i, this);
    }

    public int getType() {
        return 5244;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("NetSceneFinderGetWindowProducts", "onCgiEnd: errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f125399j;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
