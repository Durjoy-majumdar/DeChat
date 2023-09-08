package kf1;

import android.content.Intent;
import bp3.C79758p;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import oa1.C117731d;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.m74;
import te3.z74;
import tf3.C101877q;

/* renamed from: kf1.q6 */
public final class C9937q6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9840l6 f30575d;

    /* renamed from: e */
    public final /* synthetic */ IResponse<C0740i2> f30576e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9937q6(C9840l6 l6Var, IResponse<C0740i2> iResponse) {
        super(0);
        this.f30575d = l6Var;
        this.f30576e = iResponse;
    }

    public Object invoke() {
        m74 m74;
        int i;
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30575d.mo10348I0().f30175e;
        String str = null;
        FinderPoiFeedLoader finderPoiFeedLoader = baseFinderFeedLoader instanceof FinderPoiFeedLoader ? (FinderPoiFeedLoader) baseFinderFeedLoader : null;
        if (!(finderPoiFeedLoader == null || (m74 = finderPoiFeedLoader.f13766e) == null)) {
            C9840l6 l6Var = this.f30575d;
            IResponse<C0740i2> iResponse = this.f30576e;
            m74.f184220e = l6Var.f30402A;
            m74.f184219d = l6Var.f30403B;
            m74.f184222g = l6Var.f30404C;
            MMActivity mMActivity = l6Var.f30214d;
            FinderPoiFeedUI finderPoiFeedUI = mMActivity instanceof FinderPoiFeedUI ? (FinderPoiFeedUI) mMActivity : null;
            if (finderPoiFeedUI != null) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                FinderPoiFeedUI.C3005a aVar = FinderPoiFeedUI.C3005a.ACTION_GO_TO_MAP;
                long j = finderPoiFeedUI.mo3078Q7().f30413y;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(finderPoiFeedUI);
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                m74 m742 = finderPoiFeedUI.mo3075N7().f13766e;
                if (m742 != null) {
                    str = m742.f184224i;
                }
                C58417y0.Dy0(y0Var, aVar, j, q3, str, finderPoiFeedUI.mo3078Q7().f30414z, finderPoiFeedUI.mo3077P7(), 0, 64, (Object) null);
            }
            z74 z74 = ((FinderPoiFeedLoader.C2728a) iResponse).f13773a;
            int i2 = 5;
            if (z74 != null) {
                int i3 = z74.f145747h;
                if (i3 != 0) {
                    i2 = i3;
                }
                i = i2;
            } else {
                i = 5;
            }
            C101877q qVar = new C101877q();
            if (C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1) {
                C58784w3.f168295a.mo83926e1(l6Var.f30214d, (Intent) null, 11, m74, true, i);
            } else {
                C58784w3.f168295a.mo83923d1(l6Var.f30214d, m74, true, false, i);
            }
        }
        return C13598b0.f38549a;
    }
}
