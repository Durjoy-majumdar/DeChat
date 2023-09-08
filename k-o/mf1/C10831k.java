package mf1;

import android.view.View;
import android.widget.TextView;
import c30.C104289g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import df1.C58259c;
import di3.C86312j;
import fy3.C32224a;
import go1.C8366a;
import go1.C8368c;
import gr1.C59670o2;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jq3.C60905o;
import l31.C61212e;
import o40.C61926c;
import org.libpag.PAGComposition;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import pf1.C11906j;
import pf1.C11918p;
import pf1.C11920q;
import q31.C118148a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50023jq2;
import te3.uc4;

/* renamed from: mf1.k */
public final class C10831k extends C10854p {

    /* renamed from: o */
    public double f32345o;

    /* renamed from: mf1.k$a */
    public static final class C10832a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ long f32346a;

        /* renamed from: b */
        public final /* synthetic */ Object f32347b;

        public C10832a(long j, Object obj) {
            this.f32346a = j;
            this.f32347b = obj;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90364q0.m113147f(new C13604l("feed_id", C61926c.m72691p(this.f32346a)), new C13604l("report_extra_data", this.f32347b));
        }
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C104289g gVar;
        FinderJumpInfo finderJumpInfo;
        T t;
        boolean z;
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        String str2 = str;
        Class cls = C61212e.class;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        uc4 uc4 = this.f37017f;
        boolean z2 = true;
        if (uc4 == null) {
            LinkedList<uc4> linkedList = qVar2.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 11) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 = (uc4) t;
        }
        FinderJumpInfo finderJumpInfo2 = qVar2.f34827a;
        C8368c cVar = C8368c.f27352a;
        if (!cVar.mo9335b(oVar.hashCode(), mo11037g(finderJumpInfo2))) {
            mo12512t(8);
            Log.m105924i("Finder.FeedCardJumperObserver", "[onBindView] priority not ok");
            return;
        }
        C50023jq2 jq22 = uc4 != null ? uc4.f142749F : null;
        if (jq22 != null) {
            PAGView pAGView = (PAGView) view2.findViewById(C0966R.C0970id.f358054gl1);
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
            C59670o2 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
            int currentPlaySecond = (!C87412m.m108589b(str2, "timeline") || finderThumbPlayerProxy == null) ? 0 : finderThumbPlayerProxy.getCurrentPlaySecond();
            int i = qVar2.f34851y - qVar2.f34850x;
            if ((pAGView != null ? pAGView.getComposition() : null) == null) {
                PAGFile Load = PAGFile.Load(oVar2.f173499A.getAssets(), "cny_redpack_loading.pag");
                pAGView.setRepeatCount(1);
                pAGView.setComposition(Load);
                if (currentPlaySecond >= qVar2.f34850x && currentPlaySecond < qVar2.f34851y) {
                    long duration = Load.duration() / TimeUtil.SECOND_TO_US;
                    pAGView.setProgress(((double) ((duration - ((long) i)) + ((long) currentPlaySecond))) / ((double) duration));
                }
                pAGView.play();
            }
            BaseFinderFeed baseFinderFeed2 = qVar2.f34830d;
            long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0;
            C11920q qVar3 = this.f37015d;
            if (qVar3 == null || (finderJumpInfo = qVar3.f34827a) == null || finderJumpInfo.red_packet_type != 1) {
                z2 = false;
            }
            if (z2) {
                C11918p pVar = qVar3 != null ? qVar3.f34832f : null;
                C11906j jVar = pVar instanceof C11906j ? (C11906j) pVar : null;
                Object opt = (jVar == null || (gVar = jVar.f34783f) == null) ? null : gVar.opt("report_extra_data");
                if (opt == null) {
                    opt = "";
                }
                ((C61212e) C86312j.m106911c(cls)).o30(view2, "red_preview_icon");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(view2, 40, 25496);
                ((C61212e) C86312j.m106911c(cls)).E60(view2, new C10832a(itemId, opt));
            }
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f358055gl2);
            if (!Util.isNullOrNil(jq22.f136257e)) {
                if (textView != null) {
                    textView.setText(jq22.f136257e);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            cVar.mo9337d(oVar2, view2, mo11037g(qVar2.f34827a));
        }
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? finderJumpInfo.ext_type == 3 ? C8366a.AD_HARD : C8366a.AD_COMMON : super.mo11037g(finderJumpInfo);
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }

    /* renamed from: j */
    public void mo11048j(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12510f(250, view, z, aVar);
        mo12508d(false, z);
    }

    /* renamed from: o */
    public void mo11052o(C60905o oVar, View view, C11920q qVar, C58259c.C58260a aVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(aVar, "event");
        super.mo11052o(oVar, view, qVar, aVar);
        int i = aVar.f166811b;
        if (i == 11) {
            PAGView pAGView = (PAGView) view.findViewById(C0966R.C0970id.f358054gl1);
            this.f32345o = pAGView.getProgress();
            pAGView.stop();
            return;
        }
        boolean z = true;
        if (i == 1) {
            PAGView pAGView2 = (PAGView) view.findViewById(C0966R.C0970id.f358054gl1);
            if (!pAGView2.isPlaying()) {
                double progress = pAGView2.getProgress();
                double d = this.f32345o;
                if (progress != d) {
                    z = false;
                }
                if (z) {
                    pAGView2.setProgress(d);
                    pAGView2.play();
                }
            }
        }
    }

    /* renamed from: p */
    public void mo11053p(C60905o oVar, View view, C11920q qVar, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11053p(oVar, view, qVar, i);
        PAGView pAGView = (PAGView) view.findViewById(C0966R.C0970id.f358054gl1);
        PAGComposition composition = pAGView.getComposition();
        long j = 0;
        long duration = (composition != null ? composition.duration() : 0) / TimeUtil.SECOND_TO_US;
        int i2 = (int) (duration - ((long) (qVar.f34851y - qVar.f34850x)));
        double progress = pAGView.getProgress();
        PAGComposition composition2 = pAGView.getComposition();
        if (composition2 != null) {
            j = composition2.duration();
        }
        long abs = Math.abs(((((long) i) * 1000) * 1000) - (((long) ((int) (progress * ((double) j)))) - ((((long) i2) * 1000) * 1000)));
        if (i >= qVar.f34850x && i < qVar.f34851y && abs > TimeUtil.SECOND_TO_US) {
            pAGView.setProgress(((double) (i + i2)) / ((double) duration));
            if (!pAGView.isPlaying()) {
                pAGView.play();
            }
        }
    }

    /* renamed from: u */
    public void mo11045u(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12509e(250, view, z, aVar);
        mo12508d(true, z);
    }
}
