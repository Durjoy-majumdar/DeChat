package il1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: il1.c8 */
public final class C60382c8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f172180d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60382c8(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
        super(0);
        this.f172180d = finderLiveVisitorGameTogetherWidget;
    }

    public Object invoke() {
        FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.f172180d;
        LiveBottomSheetPanel liveBottomSheetPanel = finderLiveVisitorGameTogetherWidget.f160114h;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                View view = finderLiveVisitorGameTogetherWidget.f160113g;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    LiveBottomSheetPanel liveBottomSheetPanel2 = this.f172180d.f160114h;
                    if (liveBottomSheetPanel2 != null) {
                        liveBottomSheetPanel2.mo78804d();
                    } else {
                        C87412m.m108603p("container");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            }
            this.f172180d.mo78274a();
            TextView textView = this.f172180d.f160117k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            FrameLayout frameLayout = this.f172180d.f160111e;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("container");
        throw null;
    }
}
