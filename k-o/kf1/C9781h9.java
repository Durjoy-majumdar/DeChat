package kf1;

import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C7642k;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import o40.C61926c;
import rs1.C13442s8;
import te3.C48727ak1;
import te3.C49712hj1;
import te3.C50673of1;
import z04.C112551y;

/* renamed from: kf1.h9 */
public final class C9781h9 extends C9818k2 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9781h9(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: a */
    public void mo2498a(RecyclerView recyclerView) {
        this.f30362g = recyclerView;
    }

    /* renamed from: b */
    public void mo2499b(C7642k kVar) {
        C60905o oVar;
        Object obj;
        C87412m.m108594g(kVar, "ev");
        if (kVar.f25960k != null) {
            Log.m105924i("Finder.SingleFeedReport", "onCenterFeedChange: " + C61926c.m72691p(kVar.f25958i));
            RecyclerView recyclerView = this.f30362g;
            C49712hj1 hj12 = null;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f30356a);
            int i = f != null ? f.f38096i : 0;
            if (i != 6 && i != 23 && wxRecyclerAdapter != null && (oVar = (C60905o) C60898l.m71330b6(wxRecyclerAdapter, kVar.f25958i, false, 2, (Object) null)) != null && (obj = oVar.f173503E) != null) {
                BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
                if (baseFinderFeed != null) {
                    C50673of1 of12 = baseFinderFeed.mo3513o().getFinderObject().hotWordInfo;
                    if ((of12 != null ? of12.f139136d : null) != null) {
                        C48727ak1 ak12 = of12.f139136d;
                        if (!Util.isNullOrNil(ak12 != null ? ak12.f130586d : null)) {
                            C104289g gVar = new C104289g();
                            gVar.put("feedid", C61926c.m72691p(kVar.f25958i));
                            C48727ak1 ak13 = of12.f139136d;
                            gVar.put("query_word", ak13 != null ? ak13.f130586d : null);
                            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                            String gVar2 = gVar.toString();
                            C87412m.m108593f(gVar2, "kvJson.toString()");
                            String n = C112551y.m153814n(gVar2, ",", ";", false);
                            C13442s8 f2 = aVar.mo12873f(this.f30356a);
                            if (f2 != null) {
                                hj12 = f2.mo12861q3();
                            }
                            y0Var.Cx0(0, "hotsearch_timelinespot", n, hj12);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2500c() {
        this.f30362g = null;
    }
}
