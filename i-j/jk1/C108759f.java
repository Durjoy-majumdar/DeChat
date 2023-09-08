package jk1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.transition.Transition;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p853i4.C108353o;

/* renamed from: jk1.f */
public final class C108759f extends Transition {

    /* renamed from: jk1.f$a */
    public static final class C108760a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C108353o f325660d;

        /* renamed from: e */
        public final /* synthetic */ C108353o f325661e;

        public C108760a(C108353o oVar, C108353o oVar2) {
            this.f325660d = oVar;
            this.f325661e = oVar2;
        }

        public void onAnimationStart(Animator animator) {
            View view;
            View view2;
            C108353o oVar = this.f325660d;
            View view3 = null;
            View view4 = oVar != null ? oVar.f324392b : null;
            float f = 0.0f;
            if (view4 != null) {
                C108353o oVar2 = this.f325661e;
                view4.setTranslationX((oVar2 == null || (view2 = oVar2.f324392b) == null) ? 0.0f : view2.getTranslationX());
            }
            C108353o oVar3 = this.f325660d;
            if (oVar3 != null) {
                view3 = oVar3.f324392b;
            }
            if (view3 != null) {
                C108353o oVar4 = this.f325661e;
                if (!(oVar4 == null || (view = oVar4.f324392b) == null)) {
                    f = view.getTranslationY();
                }
                view3.setTranslationY(f);
            }
        }
    }

    /* renamed from: jk1.f$b */
    public static final class C108761b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C108353o f325662d;

        /* renamed from: e */
        public final /* synthetic */ float f325663e;

        /* renamed from: f */
        public final /* synthetic */ float f325664f;

        /* renamed from: g */
        public final /* synthetic */ float f325665g;

        /* renamed from: h */
        public final /* synthetic */ float f325666h;

        public C108761b(C108353o oVar, float f, float f2, float f3, float f4) {
            this.f325662d = oVar;
            this.f325663e = f;
            this.f325664f = f2;
            this.f325665g = f3;
            this.f325666h = f4;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C108353o oVar = this.f325662d;
            if (oVar != null && (view = oVar.f324392b) != null) {
                float f = this.f325663e;
                float f2 = this.f325664f;
                float f3 = this.f325665g;
                float f4 = this.f325666h;
                view.setTranslationX(f - ((f - f2) * floatValue));
                view.setTranslationY(f3 - (floatValue * (f3 - f4)));
            }
        }
    }

    /* renamed from: S */
    public final void mo159776S(C108353o oVar) {
        View view = oVar.f324392b;
        Map<String, Object> map = oVar.f324391a;
        C87412m.m108593f(map, "transitionValues.values");
        ((HashMap) map).put("com.tencent.mm:View:translationY", Float.valueOf(view.getTranslationX()));
        Map<String, Object> map2 = oVar.f324391a;
        C87412m.m108593f(map2, "transitionValues.values");
        ((HashMap) map2).put("com.tencent.mm:View:translationX", Float.valueOf(view.getTranslationY()));
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo159776S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo159776S(oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r12.f324392b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r11, p853i4.C108353o r12, p853i4.C108353o r13) {
        /*
            r10 = this;
            java.lang.String r0 = "sceneRoot"
            gy3.C87412m.m108594g(r11, r0)
            r11 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r12 == 0) goto L_0x0019
            android.view.View r0 = r12.f324392b
            if (r0 == 0) goto L_0x0019
            float r0 = r0.getTranslationX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x001a
        L_0x0019:
            r0 = r11
        L_0x001a:
            if (r13 == 0) goto L_0x0029
            android.view.View r1 = r13.f324392b
            if (r1 == 0) goto L_0x0029
            float r1 = r1.getTranslationX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x002a
        L_0x0029:
            r1 = r11
        L_0x002a:
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0057
            if (r12 == 0) goto L_0x0040
            android.view.View r0 = r12.f324392b
            if (r0 == 0) goto L_0x0040
            float r0 = r0.getTranslationY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0041
        L_0x0040:
            r0 = r11
        L_0x0041:
            if (r13 == 0) goto L_0x004f
            android.view.View r2 = r13.f324392b
            if (r2 == 0) goto L_0x004f
            float r11 = r2.getTranslationY()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
        L_0x004f:
            boolean r11 = gy3.C87412m.m108589b(r0, r11)
            if (r11 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            return r1
        L_0x0057:
            r11 = 2
            float[] r11 = new float[r11]
            r11 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofFloat(r11)
            java.lang.String r0 = "com.tencent.mm:View:translationY"
            if (r12 == 0) goto L_0x0070
            java.util.Map<java.lang.String, java.lang.Object> r2 = r12.f324391a
            if (r2 == 0) goto L_0x0070
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r0)
            goto L_0x0071
        L_0x0070:
            r2 = r1
        L_0x0071:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0078
            java.lang.Float r2 = (java.lang.Float) r2
            goto L_0x0079
        L_0x0078:
            r2 = r1
        L_0x0079:
            r3 = 0
            if (r2 == 0) goto L_0x0082
            float r2 = r2.floatValue()
            r6 = r2
            goto L_0x0083
        L_0x0082:
            r6 = 0
        L_0x0083:
            java.lang.String r2 = "com.tencent.mm:View:translationX"
            if (r12 == 0) goto L_0x0092
            java.util.Map<java.lang.String, java.lang.Object> r4 = r12.f324391a
            if (r4 == 0) goto L_0x0092
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r2)
            goto L_0x0093
        L_0x0092:
            r4 = r1
        L_0x0093:
            boolean r5 = r4 instanceof java.lang.Float
            if (r5 == 0) goto L_0x009a
            java.lang.Float r4 = (java.lang.Float) r4
            goto L_0x009b
        L_0x009a:
            r4 = r1
        L_0x009b:
            if (r4 == 0) goto L_0x00a3
            float r4 = r4.floatValue()
            r8 = r4
            goto L_0x00a4
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            if (r13 == 0) goto L_0x00b1
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.f324391a
            if (r4 == 0) goto L_0x00b1
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            goto L_0x00b2
        L_0x00b1:
            r0 = r1
        L_0x00b2:
            boolean r4 = r0 instanceof java.lang.Float
            if (r4 == 0) goto L_0x00b9
            java.lang.Float r0 = (java.lang.Float) r0
            goto L_0x00ba
        L_0x00b9:
            r0 = r1
        L_0x00ba:
            if (r0 == 0) goto L_0x00c2
            float r0 = r0.floatValue()
            r7 = r0
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            if (r13 == 0) goto L_0x00d0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.f324391a
            if (r0 == 0) goto L_0x00d0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            goto L_0x00d1
        L_0x00d0:
            r0 = r1
        L_0x00d1:
            boolean r2 = r0 instanceof java.lang.Float
            if (r2 == 0) goto L_0x00d8
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
        L_0x00d8:
            if (r1 == 0) goto L_0x00e0
            float r3 = r1.floatValue()
            r9 = r3
            goto L_0x00e1
        L_0x00e0:
            r9 = 0
        L_0x00e1:
            jk1.f$a r0 = new jk1.f$a
            r0.<init>(r13, r12)
            r11.addListener(r0)
            jk1.f$b r12 = new jk1.f$b
            r4 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r11.addUpdateListener(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jk1.C108759f.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }
}
