package ek1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.transition.Transition;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p853i4.C108353o;

/* renamed from: ek1.b */
public final class C107277b extends Transition {

    /* renamed from: ek1.b$a */
    public static final class C107278a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C108353o f320954d;

        /* renamed from: e */
        public final /* synthetic */ C108353o f320955e;

        public C107278a(C108353o oVar, C108353o oVar2) {
            this.f320954d = oVar;
            this.f320955e = oVar2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        public void onAnimationStart(Animator animator) {
            View view;
            View view2;
            C108353o oVar = this.f320954d;
            View view3 = null;
            View view4 = oVar != null ? oVar.f324392b : null;
            float f = 0.0f;
            if (view4 != null) {
                C108353o oVar2 = this.f320955e;
                view4.setTranslationX((oVar2 == null || (view2 = oVar2.f324392b) == null) ? 0.0f : view2.getTranslationX());
            }
            C108353o oVar3 = this.f320954d;
            if (oVar3 != null) {
                view3 = oVar3.f324392b;
            }
            if (view3 != null) {
                C108353o oVar4 = this.f320955e;
                if (!(oVar4 == null || (view = oVar4.f324392b) == null)) {
                    f = view.getTranslationY();
                }
                view3.setTranslationY(f);
            }
        }
    }

    /* renamed from: ek1.b$b */
    public static final class C107279b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C108353o f320956d;

        /* renamed from: e */
        public final /* synthetic */ float f320957e;

        /* renamed from: f */
        public final /* synthetic */ float f320958f;

        public C107279b(C108353o oVar, float f, float f2) {
            this.f320956d = oVar;
            this.f320957e = f;
            this.f320958f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C108353o oVar = this.f320956d;
            if (oVar != null && (view = oVar.f324392b) != null) {
                float f = this.f320957e;
                view.setScaleX(f - (floatValue * (f - this.f320958f)));
                view.setScaleY(view.getScaleX());
            }
        }
    }

    /* renamed from: S */
    public final void mo157755S(C108353o oVar) {
        Map<String, Object> map = oVar.f324391a;
        C87412m.m108593f(map, "transitionValues.values");
        ((HashMap) map).put("com.tencent.mm:View:scale_visibility", Float.valueOf(oVar.f324392b.getVisibility() == 0 ? 1.0f : 0.0f));
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo157755S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo157755S(oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r7.f324391a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r6, p853i4.C108353o r7, p853i4.C108353o r8) {
        /*
            r5 = this;
            java.lang.String r0 = "sceneRoot"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r6 = "com.tencent.mm:View:scale_visibility"
            r0 = 0
            if (r7 == 0) goto L_0x0015
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f324391a
            if (r1 == 0) goto L_0x0015
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r6)
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            if (r8 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f324391a
            if (r2 == 0) goto L_0x0023
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r6)
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x0099
            if (r7 == 0) goto L_0x0035
            android.view.View r1 = r7.f324392b
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = r1.getTransitionName()
            goto L_0x0036
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x0041
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r1 = 0
            goto L_0x0042
        L_0x0041:
            r1 = 1
        L_0x0042:
            if (r1 != 0) goto L_0x0099
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            if (r7 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f324391a
            if (r2 == 0) goto L_0x005b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r6)
            goto L_0x005c
        L_0x005b:
            r2 = r0
        L_0x005c:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0063
            java.lang.Float r2 = (java.lang.Float) r2
            goto L_0x0064
        L_0x0063:
            r2 = r0
        L_0x0064:
            r3 = 0
            if (r2 == 0) goto L_0x006c
            float r2 = r2.floatValue()
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r8 == 0) goto L_0x007a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.f324391a
            if (r4 == 0) goto L_0x007a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r6 = r4.get(r6)
            goto L_0x007b
        L_0x007a:
            r6 = r0
        L_0x007b:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L_0x0082
            r0 = r6
            java.lang.Float r0 = (java.lang.Float) r0
        L_0x0082:
            if (r0 == 0) goto L_0x0088
            float r3 = r0.floatValue()
        L_0x0088:
            ek1.b$a r6 = new ek1.b$a
            r6.<init>(r8, r7)
            r1.addListener(r6)
            ek1.b$b r6 = new ek1.b$b
            r6.<init>(r8, r2, r3)
            r1.addUpdateListener(r6)
            return r1
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ek1.C107277b.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }
}
