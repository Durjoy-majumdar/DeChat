package vf1;

import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vf1.c6 */
public final class C14742c6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ OccupyFinderUI5 f40711d;

    /* renamed from: e */
    public final /* synthetic */ View f40712e;

    /* renamed from: f */
    public final /* synthetic */ int f40713f;

    /* renamed from: g */
    public final /* synthetic */ int f40714g;

    /* renamed from: vf1.c6$a */
    public static final class C14743a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C14743a f40715d = new C14743a();

        public C14743a() {
            super(0);
        }

        public Object invoke() {
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77239M5("TLRecommendTab");
            return C13598b0.f38549a;
        }
    }

    public C14742c6(OccupyFinderUI5 occupyFinderUI5, View view, int i, int i2) {
        this.f40711d = occupyFinderUI5;
        this.f40712e = view;
        this.f40713f = i;
        this.f40714g = i2;
    }

    public void onGlobalLayout() {
        OccupyFinderUI5 occupyFinderUI5 = this.f40711d;
        View view = this.f40712e;
        int i = this.f40713f;
        int i2 = this.f40714g;
        C14743a aVar = C14743a.f40715d;
        int i3 = OccupyFinderUI5.f14943w;
        occupyFinderUI5.mo3134O7(view, i, i2, false, aVar);
        this.f40712e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
