package il1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import gy3.C87412m;

/* renamed from: il1.z */
public final class C46274z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f124730d;

    public C46274z(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
        this.f124730d = finderLiveAnchorGameTogetherWidget;
    }

    public final void run() {
        if (!this.f124730d.f160038c.mo82893g0()) {
            View view = this.f124730d.f160047l;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C75044y4.m89991c(this.f124730d.f160036a.getContext());
                return;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
    }
}
