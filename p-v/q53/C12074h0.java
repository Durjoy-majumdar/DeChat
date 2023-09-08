package q53;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import p206nj.C11171e;
import qo3.C101218e0;

/* renamed from: q53.h0 */
public final class C12074h0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C12062e0 f35158d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f35159e;

    public C12074h0(C12062e0 e0Var, C101218e0 e0Var2) {
        this.f35158d = e0Var;
        this.f35159e = e0Var2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!C85865h1.m106133c(this.f35158d.f35138a) && !C85875k4.m106171a0() && !C85875k4.m106169Z() && C11171e.m11044a(30)) {
            View view = this.f35159e.f296384g;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
        }
    }
}
