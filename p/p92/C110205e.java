package p92;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: p92.e */
public final class C110205e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f329688d;

    /* renamed from: e */
    public final /* synthetic */ int f329689e;

    /* renamed from: f */
    public final /* synthetic */ int f329690f;

    /* renamed from: g */
    public final /* synthetic */ int f329691g;

    /* renamed from: h */
    public final /* synthetic */ MultiTaskFloatBallView f329692h;

    public C110205e(int i, int i2, int i3, int i4, MultiTaskFloatBallView multiTaskFloatBallView) {
        this.f329688d = i;
        this.f329689e = i2;
        this.f329690f = i3;
        this.f329691g = i4;
        this.f329692h = multiTaskFloatBallView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        int i = this.f329688d;
        int i2 = i + ((int) (((((float) this.f329689e) * 1.0f) - ((float) i)) * floatValue));
        int i3 = this.f329690f;
        int i4 = i3 + ((int) (((((float) this.f329691g) * 1.0f) - ((float) i3)) * floatValue));
        MultiTaskFloatBallView multiTaskFloatBallView = this.f329692h;
        int i5 = MultiTaskFloatBallView.f315133E;
        ViewGroup.LayoutParams layoutParams = multiTaskFloatBallView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i6 = marginLayoutParams.leftMargin;
        int i7 = marginLayoutParams.topMargin;
        if (i6 != i2 || i7 != i4) {
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.topMargin = i4;
            try {
                multiTaskFloatBallView.mo151067h(i2, i4, false, false);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.FloatBallView", th, "updateBallPosition fail", new Object[0]);
            }
        }
    }
}
