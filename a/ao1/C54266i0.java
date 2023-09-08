package ao1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0764p0;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import dp1.C58408t0;
import fe1.C58964h;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import os1.C62153d;
import rx3.C13604l;
import te3.C64311db1;
import te3.C64885zm2;

/* renamed from: ao1.i0 */
public final class C54266i0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C0764p0> f152306d;

    /* renamed from: e */
    public final /* synthetic */ C54269l0 f152307e;

    public C54266i0(WxRecyclerAdapter<C0764p0> wxRecyclerAdapter, C54269l0 l0Var) {
        this.f152306d = wxRecyclerAdapter;
        this.f152307e = l0Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        FinderFeedReportObject finderFeedReportObject;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("PostLocationUIC", "click item pos:" + (i - this.f152306d.mo85796c6()));
        C0764p0 p0Var = (C0764p0) oVar.f173503E;
        if (p0Var != null) {
            C54269l0 l0Var = this.f152307e;
            C64885zm2 zm22 = p0Var.f1803d;
            l0Var.getClass();
            C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
            C58964h hVar = l0Var.f152310d;
            if (hVar != null) {
                hVar.mo83367f(l0Var.f152312f, zm22, ((Number) X0.f38555d).floatValue(), ((Number) X0.f38556e).floatValue());
                C58964h hVar2 = l0Var.f152310d;
                if (hVar2 != null) {
                    hVar2.mo83371k();
                    WxRecyclerView wxRecyclerView = l0Var.f152311e;
                    if (wxRecyclerView != null) {
                        wxRecyclerView.setVisibility(8);
                        C58964h hVar3 = l0Var.f152310d;
                        if (hVar3 != null) {
                            C64311db1 a = hVar3.mo83363a();
                            if (a != null && (finderFeedReportObject = C58408t0.f167337b) != null) {
                                finderFeedReportObject.lbsFlag = 5;
                                finderFeedReportObject.selectLocation = a;
                                finderFeedReportObject.recommend_lbs_position = i;
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("locationWidget");
                        throw null;
                    }
                    C87412m.m108603p("lbsRecyclerView");
                    throw null;
                }
                C87412m.m108603p("locationWidget");
                throw null;
            }
            C87412m.m108603p("locationWidget");
            throw null;
        }
    }
}
