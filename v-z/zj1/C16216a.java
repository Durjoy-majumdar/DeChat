package zj1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C64586nn1;

/* renamed from: zj1.a */
public final class C16216a extends C87413o implements C32226l<C2458a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f43435d;

    /* renamed from: e */
    public final /* synthetic */ TextView f43436e;

    /* renamed from: f */
    public final /* synthetic */ View f43437f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16216a(View view, TextView textView, View view2) {
        super(1);
        this.f43435d = view;
        this.f43436e = textView;
        this.f43437f = view2;
    }

    public Object invoke(Object obj) {
        C2458a aVar = (C2458a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        if (aVar.f12908a) {
            C64586nn1 nn12 = aVar.f12909b;
            Integer valueOf = nn12 != null ? Integer.valueOf(nn12.f184502d) : null;
            if (valueOf != null && valueOf.intValue() == 6) {
                View view = this.f43435d;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView = this.f43436e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view3 = this.f43437f;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (valueOf != null && valueOf.intValue() == 2) {
                C64586nn1 nn13 = aVar.f12909b;
                if (nn13 != null) {
                    int i = nn13.f184503e;
                    TextView textView2 = this.f43436e;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = this.f43436e;
                    if (textView3 != null) {
                        C16217b bVar = C16217b.f43438a;
                        textView3.setText(i <= 0 ? "0" : i > 99 ? "..." : String.valueOf(i));
                    }
                    View view5 = this.f43435d;
                    if (view5 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view7 = this.f43437f;
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar5.mo10233c(8);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                TextView textView4 = this.f43436e;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                View view9 = this.f43435d;
                if (view9 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view11 = this.f43437f;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view13 = this.f43435d;
            if (view13 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view14 = view13;
                C117292a.m165358d(view14, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView5 = this.f43436e;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            View view15 = this.f43437f;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
            aVar9.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
