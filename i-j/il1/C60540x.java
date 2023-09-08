package il1;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.x */
public final class C60540x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f172558d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60540x(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
        super(0);
        this.f172558d = finderLiveAnchorGameTogetherWidget;
    }

    public Object invoke() {
        LiveBottomSheetPanel liveBottomSheetPanel = this.f172558d.f160048m;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                liveBottomSheetPanel.mo78804d();
            }
            TextView textView = this.f172558d.f160041f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            FrameLayout frameLayout = this.f172558d.f160042g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.f172558d.mo78216a();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("container");
        throw null;
    }
}
