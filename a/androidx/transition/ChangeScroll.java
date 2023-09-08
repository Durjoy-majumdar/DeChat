package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p853i4.C108353o;

public class ChangeScroll extends Transition {

    /* renamed from: K */
    public static final String[] f306663K = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: S */
    public final void mo145290S(C108353o oVar) {
        ((HashMap) oVar.f324391a).put("android:changeScroll:x", Integer.valueOf(oVar.f324392b.getScrollX()));
        ((HashMap) oVar.f324391a).put("android:changeScroll:y", Integer.valueOf(oVar.f324392b.getScrollY()));
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145290S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145290S(oVar);
    }

    /* renamed from: o */
    public Animator mo145268o(ViewGroup viewGroup, C108353o oVar, C108353o oVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (oVar == null || oVar2 == null) {
            return null;
        }
        View view = oVar2.f324392b;
        int intValue = ((Integer) ((HashMap) oVar.f324391a).get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) ((HashMap) oVar2.f324391a).get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) ((HashMap) oVar.f324391a).get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) ((HashMap) oVar2.f324391a).get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        boolean z = C103837e.f306783a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
        return animatorSet;
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306663K;
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
