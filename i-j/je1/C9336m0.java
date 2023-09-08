package je1;

import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import je1.C9360p1;
import jp3.C9487b;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import os1.C62153d;
import pe3.C89349b;
import rx3.C13604l;
import te3.C48888bp0;
import te3.C49034cp0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49980je1;
import te3.C50141kk1;

/* renamed from: je1.m0 */
public final class C9336m0 extends C60625c<C49034cp0> {

    /* renamed from: s */
    public final C9337a f29162s;

    /* renamed from: t */
    public final int f29163t;

    /* renamed from: u */
    public final C9360p1.C9362b f29164u;

    /* renamed from: je1.m0$a */
    public interface C9337a {
        /* renamed from: a */
        void mo10078a(int i, int i2, String str, C49034cp0 cp02, int i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9336m0(C89349b bVar, C9337a aVar, int i, C9360p1.C9362b bVar2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(aVar, "callback");
        this.f29162s = aVar;
        this.f29163t = i;
        this.f29164u = bVar2;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = 375;
        C48888bp0 bp02 = new C48888bp0();
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        bp02.f131242f = ((Number) X0.f38555d).floatValue();
        bp02.f131243g = ((Number) X0.f38556e).floatValue();
        bp02.f131241e = bVar;
        C46523h2 h2Var = C46523h2.f125330a;
        bp02.f131240d = h2Var.mo71859a(375);
        bp02.f131244h = h2Var.mo71867j();
        bVar3.f127066a = bp02;
        bVar3.f127067b = new C49034cp0();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findergetnearbylist";
        mo123453j(bVar3.mo72403a());
        Log.m105924i("Finder.CgiFinderGetNearbyList", "CgiFinderGetNearbyList lat.lng:" + bp02.f131243g + ", " + bp02.f131242f + ' ' + i + ' ' + bVar);
        C20480e0.m22095r(C20480e0.f57583a, 2, i, hj12, 10, false, 16, (Object) null);
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C49034cp0>> mo9225i() {
        C20480e0.m22094n(C20480e0.f57583a, 2, true, (C49712hj1) null, false, 0, false, 60, (Object) null);
        return super.mo9225i();
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49034cp0 cp02 = (C49034cp0) eu32;
        C87412m.m108594g(cp02, "resp");
        C20480e0 e0Var = C20480e0.f57583a;
        boolean z = false;
        e0Var.mo32034g(2, false);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("Finder.CgiFinderGetNearbyList", "[onCgiBack] pullType=" + this.f29163t + " errType=" + i + " errCode=" + i2 + " errMsg=" + str);
        C9360p1.C9362b bVar = this.f29164u;
        if (bVar != null && bVar.mo2804a(i, i2, str, cp02)) {
            z = true;
        }
        if (z) {
            Log.m105928w("Finder.CgiFinderGetNearbyList", "has consume.");
            return;
        }
        if (i == 0 && i2 == 0) {
            LinkedList<C49980je1> linkedList = cp02.f131885d;
            if (linkedList != null) {
                for (C49980je1 je12 : linkedList) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[onCgiBack] pullType=");
                    sb.append(this.f29163t);
                    sb.append(" type:");
                    C50141kk1 kk12 = je12.f136045d;
                    String str2 = null;
                    sb.append(kk12 != null ? Integer.valueOf(kk12.f136854o) : null);
                    sb.append(" t:");
                    C50141kk1 kk13 = je12.f136045d;
                    sb.append(kk13 != null ? kk13.f136846d : null);
                    sb.append(" desc:");
                    C50141kk1 kk14 = je12.f136045d;
                    if (kk14 != null) {
                        str2 = kk14.f136848f;
                    }
                    sb.append(str2);
                    sb.append(' ');
                    sb.append(C9311g2.f29093a.mo10062a(je12.f136046e));
                    Log.m105924i("Finder.CgiFinderGetNearbyList", sb.toString());
                }
            }
        } else {
            e0Var.mo32046u(2, this.f172731j);
        }
        this.f29162s.mo10078a(i, i2, str, cp02, this.f29163t);
        Log.m105924i("Finder.CgiFinderGetNearbyList", "[onCgiBack] Cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
    }
}
