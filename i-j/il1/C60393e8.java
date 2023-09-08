package il1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget;
import gy3.C87412m;

/* renamed from: il1.e8 */
public final class C60393e8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f172198d;

    public C60393e8(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
        this.f172198d = finderLiveVisitorGameTogetherWidget;
    }

    public final void run() {
        if (!this.f172198d.f160109c.mo82893g0()) {
            View view = this.f172198d.f160113g;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C75044y4.m89991c(this.f172198d.f160107a.getContext());
                return;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        View view2 = this.f172198d.f160113g;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = C75044y4.m89991c(this.f172198d.f160107a.getContext());
            return;
        }
        C87412m.m108603p("rootView");
        throw null;
    }
}
