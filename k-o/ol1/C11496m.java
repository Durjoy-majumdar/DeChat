package ol1;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import p206nj.C11171e;
import qo3.C12925w;

/* renamed from: ol1.m */
public final class C11496m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C11497n f33790d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f33791e;

    public C11496m(C11497n nVar, C12925w wVar) {
        this.f33790d = nVar;
        this.f33791e = wVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!C85865h1.m106133c(this.f33790d.f28306d) && !C85875k4.m106171a0() && C11171e.m11044a(30)) {
            View view = this.f33791e.f36927f;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
        }
    }
}
