package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p161h8.C108165b;
import p161h8.C108169i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f */
    public final C108169i f2129f = new C108169i(75, 150);

    /* renamed from: g */
    public final C108169i f2130g = new C108169i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C0915a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f2131d;

        /* renamed from: e */
        public final /* synthetic */ View f2132e;

        public C0915a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f2131d = z;
            this.f2132e = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2131d) {
                View view = this.f2132e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/google/android/material/transformation/FabTransformationScrimBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/google/android/material/transformation/FabTransformationScrimBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f2131d) {
                View view = this.f2132e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/google/android/material/transformation/FabTransformationScrimBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/google/android/material/transformation/FabTransformationScrimBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: b */
    public boolean mo842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: v */
    public boolean mo843v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: x */
    public AnimatorSet mo844x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        View view3 = view2;
        boolean z3 = z;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C108169i iVar = z3 ? this.f2129f : this.f2130g;
        if (z3) {
            if (!z2) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view2, aVar.mo10232b(), "com/google/android/material/transformation/FabTransformationScrimBehavior", "createScrimAnimation", "(Landroid/view/View;ZZLjava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/google/android/material/transformation/FabTransformationScrimBehavior", "createScrimAnimation", "(Landroid/view/View;ZZLjava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            objectAnimator = ObjectAnimator.ofFloat(view3, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view3, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo158572a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        C108165b.m146494a(animatorSet, arrayList);
        animatorSet.addListener(new C0915a(this, z3, view3));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
