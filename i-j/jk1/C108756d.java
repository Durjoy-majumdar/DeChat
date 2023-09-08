package jk1;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import gy3.C87412m;
import p853i4.C108353o;

/* renamed from: jk1.d */
public final class C108756d extends Transition {

    /* renamed from: jk1.d$a */
    public static final class C108757a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C108353o f325656d;

        /* renamed from: e */
        public final /* synthetic */ ArgbEvaluator f325657e;

        /* renamed from: f */
        public final /* synthetic */ Integer f325658f;

        /* renamed from: g */
        public final /* synthetic */ Integer f325659g;

        public C108757a(C108353o oVar, ArgbEvaluator argbEvaluator, Integer num, Integer num2) {
            this.f325656d = oVar;
            this.f325657e = argbEvaluator;
            this.f325658f = num;
            this.f325659g = num2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C108353o oVar = this.f325656d;
            TextView textView = null;
            KeyEvent.Callback callback = oVar != null ? oVar.f324392b : null;
            if (callback instanceof TextView) {
                textView = (TextView) callback;
            }
            if (textView != null) {
                ArgbEvaluator argbEvaluator = this.f325657e;
                Integer num = this.f325658f;
                Integer num2 = this.f325659g;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                Object evaluate = argbEvaluator.evaluate(((Float) animatedValue).floatValue(), num, num2);
                C87412m.m108592e(evaluate, "null cannot be cast to non-null type kotlin.Int");
                textView.setTextColor(((Integer) evaluate).intValue());
            }
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
    }

    /* renamed from: o */
    public Animator mo145268o(ViewGroup viewGroup, C108353o oVar, C108353o oVar2) {
        ColorStateList textColors;
        ColorStateList textColors2;
        C87412m.m108594g(viewGroup, "sceneRoot");
        Integer num = null;
        if ((oVar != null ? oVar.f324392b : null) instanceof TextView) {
            if ((oVar2 != null ? oVar2.f324392b : null) instanceof TextView) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                View view = oVar != null ? oVar.f324392b : null;
                TextView textView = view instanceof TextView ? (TextView) view : null;
                Integer valueOf = (textView == null || (textColors2 = textView.getTextColors()) == null) ? null : Integer.valueOf(textColors2.getDefaultColor());
                View view2 = oVar2 != null ? oVar2.f324392b : null;
                TextView textView2 = view2 instanceof TextView ? (TextView) view2 : null;
                if (!(textView2 == null || (textColors = textView2.getTextColors()) == null)) {
                    num = Integer.valueOf(textColors.getDefaultColor());
                }
                ofFloat.addUpdateListener(new C108757a(oVar2, new ArgbEvaluator(), valueOf, num));
                return ofFloat;
            }
        }
        return null;
    }
}
