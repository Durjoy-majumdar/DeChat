package ce1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;

/* renamed from: ce1.q */
public final class C0488q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1209d;

    /* renamed from: e */
    public final /* synthetic */ int f1210e;

    /* renamed from: f */
    public final /* synthetic */ int f1211f;

    /* renamed from: g */
    public final /* synthetic */ int f1212g;

    public C0488q(C0479p pVar, int i, int i2, int i3) {
        this.f1209d = pVar;
        this.f1210e = i;
        this.f1211f = i2;
        this.f1212g = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        MMEditText mMEditText = this.f1209d.f1184f;
        if (mMEditText != null) {
            mMEditText.setPadding(this.f1210e, this.f1211f, this.f1212g, intValue);
        } else {
            C87412m.m108603p("descEdit");
            throw null;
        }
    }
}
