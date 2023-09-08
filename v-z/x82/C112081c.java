package x82;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: x82.c */
public final class C112081c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112087d f335564d;

    /* renamed from: x82.c$a */
    public static final class C112082a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C112087d f335565d;

        public C112082a(C112087d dVar) {
            this.f335565d = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WeImageView weImageView = this.f335565d.f335575b;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            View view = this.f335565d.f335578e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f335565d.f335578e;
            ViewGroup.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            if (layoutParams2 != null) {
                Object animatedValue = valueAnimator.getAnimatedValue("sizeW");
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue).intValue();
            }
            View view4 = this.f335565d.f335578e;
            ViewGroup.LayoutParams layoutParams3 = view4 != null ? view4.getLayoutParams() : null;
            if (layoutParams3 != null) {
                Object animatedValue2 = valueAnimator.getAnimatedValue("sizeH");
                C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams3.height = ((Integer) animatedValue2).intValue();
            }
            View view5 = this.f335565d.f335578e;
            ViewGroup.LayoutParams layoutParams4 = view5 != null ? view5.getLayoutParams() : null;
            C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            Object animatedValue3 = valueAnimator.getAnimatedValue("marginBottom");
            C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            ((RelativeLayout.LayoutParams) layoutParams4).bottomMargin = ((Integer) animatedValue3).intValue();
            View view6 = this.f335565d.f335578e;
            if (view6 != null) {
                layoutParams = view6.getLayoutParams();
            }
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            Object animatedValue4 = valueAnimator.getAnimatedValue("marginEnd");
            C87412m.m108592e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
            ((RelativeLayout.LayoutParams) layoutParams).setMarginEnd(((Integer) animatedValue4).intValue());
            View view7 = this.f335565d.f335578e;
            if (view7 != null) {
                view7.requestLayout();
            }
        }
    }

    public C112081c(C112087d dVar) {
        this.f335564d = dVar;
    }

    public final void run() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        TextView textView = this.f335564d.f335579f;
        if (textView != null) {
            textView.setVisibility(4);
        }
        WeImageView weImageView = this.f335564d.f335575b;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        WeImageView weImageView2 = this.f335564d.f335575b;
        if (weImageView2 != null) {
            weImageView2.clearAnimation();
        }
        int i = -C74942w4.m89784a(this.f335564d.f335574a, 4);
        View view = this.f335564d.f335583j;
        int width = (view != null ? view.getWidth() : 0) - C74942w4.m89784a(this.f335564d.f335574a, 32);
        WeImageView weImageView3 = this.f335564d.f335575b;
        int left = width - (weImageView3 != null ? weImageView3.getLeft() : 0);
        WeImageView weImageView4 = this.f335564d.f335575b;
        if (!(weImageView4 == null || (animate = weImageView4.animate()) == null || (translationX = animate.translationX((float) left)) == null || (translationY = translationX.translationY((float) i)) == null || (duration = translationY.setDuration(300)) == null)) {
            duration.start();
        }
        int[] iArr = new int[2];
        View view2 = this.f335564d.f335583j;
        iArr[0] = view2 != null ? view2.getWidth() : 0;
        iArr[1] = C74942w4.m89784a(this.f335564d.f335574a, 28);
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("sizeW", iArr);
        int[] iArr2 = new int[2];
        View view3 = this.f335564d.f335583j;
        iArr2[0] = view3 != null ? view3.getHeight() : 0;
        iArr2[1] = C74942w4.m89784a(this.f335564d.f335574a, 28);
        ValueAnimator duration2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofInt, PropertyValuesHolder.ofInt("sizeH", iArr2), PropertyValuesHolder.ofInt("marginBottom", new int[]{0, C74942w4.m89784a(this.f335564d.f335574a, 8)}), PropertyValuesHolder.ofInt("marginEnd", new int[]{0, C74942w4.m89784a(this.f335564d.f335574a, 8)})}).setDuration(300);
        duration2.addUpdateListener(new C112082a(this.f335564d));
        duration2.start();
    }
}
