package rs1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.q2 */
public final class C63616q2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f180379d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63616q2(FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC) {
        super(0);
        this.f180379d = finderFeedMegaVideoBtnAnimUIC;
    }

    public Object invoke() {
        View view = this.f180379d.f162496e;
        if (view != null) {
            View view2 = view.getVisibility() == 0 ? view : null;
            if (view2 != null) {
                FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f180379d;
                if (finderFeedMegaVideoBtnAnimUIC.f162499h.isRunning()) {
                    finderFeedMegaVideoBtnAnimUIC.f162499h.cancel();
                }
                ((TextView) view2.findViewById(C0966R.C0970id.g75)).setAlpha(0.0f);
                View findViewById = view2.findViewById(C0966R.C0970id.f5842q4);
                int color = view2.getContext().getResources().getColor(C0966R.color.f3578ya);
                int color2 = view2.getContext().getResources().getColor(C0966R.color.f3590yo);
                finderFeedMegaVideoBtnAnimUIC.f162499h.removeAllUpdateListeners();
                finderFeedMegaVideoBtnAnimUIC.f162499h.removeAllListeners();
                finderFeedMegaVideoBtnAnimUIC.f162499h.addUpdateListener(new C63613p2(view2, finderFeedMegaVideoBtnAnimUIC, findViewById, color2, color));
                finderFeedMegaVideoBtnAnimUIC.f162499h.start();
            }
        }
        this.f180379d.f162496e = null;
        return C13598b0.f38549a;
    }
}
