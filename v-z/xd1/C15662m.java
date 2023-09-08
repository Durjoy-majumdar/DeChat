package xd1;

import android.content.Intent;
import bp3.C79758p;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import oa1.C117731d;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C48713ah1;
import te3.C49712hj1;
import te3.m74;
import te3.z74;
import tf3.C101877q;

/* renamed from: xd1.m */
public final class C15662m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ m74 f42335d;

    /* renamed from: e */
    public final /* synthetic */ C15644c f42336e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15662m(m74 m74, C15644c cVar) {
        super(0);
        this.f42335d = m74;
        this.f42336e = cVar;
    }

    public Object invoke() {
        int i;
        z74 z74;
        m74 m74 = this.f42335d;
        if (m74 != null) {
            C15644c cVar = this.f42336e;
            m74.f184220e = cVar.f42295n;
            m74.f184219d = cVar.f42296o;
            m74.f184222g = cVar.f42298q;
            m74.f184223h = cVar.f42297p;
            m74.f184235w = true;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            FinderPoiFeedUI.C3005a aVar = FinderPoiFeedUI.C3005a.ACTION_GO_TO_MAP;
            long j = cVar.f42293i;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(cVar.getActivity());
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            m74 m742 = cVar.f42300s;
            String str = m742 != null ? m742.f184224i : null;
            String str2 = cVar.f42294j;
            String stringExtra = cVar.getActivity().getIntent().getStringExtra("key_sns_feed_id");
            if (stringExtra == null) {
                stringExtra = C75592q0.m90789s();
            }
            C58417y0.Dy0(y0Var, aVar, j, q3, str, str2, stringExtra, 0, 64, (Object) null);
            C48713ah1 ah12 = (C48713ah1) cVar.f33564d;
            int i2 = 5;
            if (ah12 == null || (z74 = ah12.f130516g) == null) {
                i = 5;
            } else {
                int i3 = z74.f145747h;
                if (i3 != 0) {
                    i2 = i3;
                }
                i = i2;
            }
            C101877q qVar = new C101877q();
            if (C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1) {
                C58784w3.f168295a.mo83926e1(cVar.getContext(), (Intent) null, 11, m74, true, i);
            } else {
                C58784w3.f168295a.mo83923d1(cVar.getContext(), m74, true, false, i);
            }
        }
        return C13598b0.f38549a;
    }
}
