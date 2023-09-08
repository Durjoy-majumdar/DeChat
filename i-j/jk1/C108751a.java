package jk1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.transition.Transition;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p853i4.C108353o;

/* renamed from: jk1.a */
public final class C108751a extends Transition {

    /* renamed from: jk1.a$a */
    public static final class C108752a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public boolean f325649d;

        /* renamed from: e */
        public final /* synthetic */ C108353o f325650e;

        /* renamed from: f */
        public final /* synthetic */ int f325651f;

        /* renamed from: g */
        public final /* synthetic */ C108353o f325652g;

        public C108752a(C108353o oVar, int i, C108353o oVar2) {
            this.f325650e = oVar;
            this.f325651f = i;
            this.f325652g = oVar2;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f325649d) {
                C108353o oVar = this.f325650e;
                View view = oVar != null ? oVar.f324392b : null;
                if (view != null) {
                    view.setBackground((Drawable) null);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r3 = r3.f324392b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationStart(android.animation.Animator r3) {
            /*
                r2 = this;
                i4.o r3 = r2.f325650e
                r0 = 0
                if (r3 == 0) goto L_0x000e
                android.view.View r3 = r3.f324392b
                if (r3 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x000f
            L_0x000e:
                r3 = r0
            L_0x000f:
                if (r3 != 0) goto L_0x003e
                int r3 = r2.f325651f
                if (r3 <= 0) goto L_0x003e
                i4.o r3 = r2.f325650e
                if (r3 == 0) goto L_0x001c
                android.view.View r3 = r3.f324392b
                goto L_0x001d
            L_0x001c:
                r3 = r0
            L_0x001d:
                if (r3 != 0) goto L_0x0020
                goto L_0x003b
            L_0x0020:
                i4.o r1 = r2.f325652g
                if (r1 == 0) goto L_0x0038
                android.view.View r1 = r1.f324392b
                if (r1 == 0) goto L_0x0038
                android.graphics.drawable.Drawable r1 = r1.getBackground()
                if (r1 == 0) goto L_0x0038
                android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
                if (r1 == 0) goto L_0x0038
                android.graphics.drawable.Drawable r0 = r1.newDrawable()
            L_0x0038:
                r3.setBackground(r0)
            L_0x003b:
                r3 = 1
                r2.f325649d = r3
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jk1.C108751a.C108752a.onAnimationStart(android.animation.Animator):void");
        }
    }

    /* renamed from: jk1.a$b */
    public static final class C108753b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C108353o f325653d;

        /* renamed from: e */
        public final /* synthetic */ int f325654e;

        /* renamed from: f */
        public final /* synthetic */ int f325655f;

        public C108753b(C108353o oVar, int i, int i2) {
            this.f325653d = oVar;
            this.f325654e = i;
            this.f325655f = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.f324392b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
            /*
                r4 = this;
                i4.o r0 = r4.f325653d
                if (r0 == 0) goto L_0x000d
                android.view.View r0 = r0.f324392b
                if (r0 == 0) goto L_0x000d
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                if (r0 != 0) goto L_0x0011
                goto L_0x0030
            L_0x0011:
                int r1 = r4.f325654e
                float r1 = (float) r1
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Float"
                gy3.C87412m.m108592e(r5, r2)
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                int r2 = r4.f325654e
                int r3 = r4.f325655f
                int r2 = r2 - r3
                float r2 = (float) r2
                float r5 = r5 * r2
                float r1 = r1 - r5
                int r5 = (int) r1
                r0.setAlpha(r5)
            L_0x0030:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jk1.C108751a.C108753b.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* renamed from: S */
    public final void mo159771S(C108353o oVar) {
        View view = oVar.f324392b;
        Map<String, Object> map = oVar.f324391a;
        C87412m.m108593f(map, "transitionValues.values");
        Drawable background = view.getBackground();
        ((HashMap) map).put("com.tencent.mm:View:drawable_alpha", Integer.valueOf(background != null ? background.getAlpha() : 0));
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo159771S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        mo159771S(oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r6.f324391a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r5, p853i4.C108353o r6, p853i4.C108353o r7) {
        /*
            r4 = this;
            java.lang.String r0 = "sceneRoot"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r5 = "com.tencent.mm:View:drawable_alpha"
            r0 = 0
            if (r6 == 0) goto L_0x0015
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f324391a
            if (r1 == 0) goto L_0x0015
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r5)
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x001d
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x001e
        L_0x001d:
            r1 = r0
        L_0x001e:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0027
            int r1 = r1.intValue()
            goto L_0x0029
        L_0x0027:
            r1 = 255(0xff, float:3.57E-43)
        L_0x0029:
            if (r7 == 0) goto L_0x0036
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.f324391a
            if (r3 == 0) goto L_0x0036
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r5 = r3.get(r5)
            goto L_0x0037
        L_0x0036:
            r5 = r0
        L_0x0037:
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x003e
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x003f
        L_0x003e:
            r5 = r0
        L_0x003f:
            if (r5 == 0) goto L_0x0045
            int r2 = r5.intValue()
        L_0x0045:
            if (r1 == r2) goto L_0x0062
            r5 = 2
            float[] r5 = new float[r5]
            r5 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            jk1.a$a r0 = new jk1.a$a
            r0.<init>(r7, r1, r6)
            r5.addListener(r0)
            jk1.a$b r6 = new jk1.a$b
            r6.<init>(r7, r1, r2)
            r5.addUpdateListener(r6)
            return r5
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jk1.C108751a.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }
}
