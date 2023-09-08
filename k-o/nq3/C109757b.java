package nq3;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.AbsListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import sq3.C110811c;
import tq3.C111052b;

/* renamed from: nq3.b */
public final class C109757b extends C111052b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109757b(View view) {
        super(view);
        C87412m.m108594g(view, "view");
    }

    /* renamed from: b */
    public ValueAnimator.AnimatorUpdateListener mo34214b(int i) {
        if (i == 0) {
            return null;
        }
        if ((i >= 0 || !this.f332555i.canScrollHorizontally(1)) && (i <= 0 || !this.f332555i.canScrollHorizontally(-1))) {
            return null;
        }
        this.f332552f = i;
        return this;
    }

    /* renamed from: l */
    public C110811c mo160998l() {
        return new C109756a();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        try {
            View view = this.f332555i;
            if (view instanceof AbsListView) {
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.AbsListView");
                ((AbsListView) view).scrollListBy(intValue - this.f332552f);
            } else {
                view.scrollBy(intValue - this.f332552f, 0);
            }
        } catch (Exception e) {
            Log.printInfoStack("HRefreshCenterWrapper", "", e);
        }
        this.f332552f = intValue;
    }
}
