package ul2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanInfoMaskView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ul2.z */
public final class C78233z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanInfoMaskView f229197d;

    /* renamed from: e */
    public final /* synthetic */ float f229198e;

    /* renamed from: f */
    public final /* synthetic */ float f229199f;

    public C78233z(ScanInfoMaskView scanInfoMaskView, float f, float f2) {
        this.f229197d = scanInfoMaskView;
        this.f229198e = f;
        this.f229199f = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        View view = this.f229197d.f205542h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$showInfoViewWithAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            TextView textView = this.f229197d.f205544j;
            if (textView != null) {
                textView.setAlpha(floatValue);
                float f = this.f229198e;
                float f2 = (float) 0;
                float f3 = f + ((f2 - f) * floatValue);
                float f4 = this.f229199f;
                float f5 = f4 + ((f2 - f4) * floatValue);
                ImageView imageView = this.f229197d.f205543i;
                if (imageView != null) {
                    imageView.setTranslationX(f3);
                    ImageView imageView2 = this.f229197d.f205543i;
                    if (imageView2 != null) {
                        imageView2.setTranslationY(f5);
                    } else {
                        C87412m.m108603p("infoIcon");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("infoIcon");
                    throw null;
                }
            } else {
                C87412m.m108603p("opButton");
                throw null;
            }
        } else {
            C87412m.m108603p("infoLayout");
            throw null;
        }
    }
}
