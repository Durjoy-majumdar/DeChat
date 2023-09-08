package go3;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: go3.d0 */
public final class C8370d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TouchMediaPreviewLayout f27356d;

    /* renamed from: e */
    public final /* synthetic */ float f27357e;

    public C8370d0(TouchMediaPreviewLayout touchMediaPreviewLayout, float f) {
        this.f27356d = touchMediaPreviewLayout;
        this.f27357e = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue("percent");
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        View a = this.f27356d.getBackgroundView();
        float min = Math.min(this.f27357e, 1.0f - floatValue);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(min));
        View view = a;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        a.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
