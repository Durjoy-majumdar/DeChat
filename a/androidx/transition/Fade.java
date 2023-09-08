package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p1050v2.C111331h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108348j;
import p853i4.C108353o;
import p853i4.C108360v;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    public class C103810a extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ View f306689d;

        public C103810a(Fade fade, View view) {
            this.f306689d = view;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C108360v.m146765c(this.f306689d, 1.0f);
            C108360v.f324401a.getClass();
            transition.mo145310C(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    public static class C103811b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final View f306690d;

        /* renamed from: e */
        public boolean f306691e = false;

        public C103811b(View view) {
            this.f306690d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C108360v.m146765c(this.f306690d, 1.0f);
            if (this.f306691e) {
                this.f306690d.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f306690d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107208b.m145180h(view) && this.f306690d.getLayerType() == 0) {
                this.f306691e = true;
                this.f306690d.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i) {
        if ((i & -4) == 0) {
            this.f306746K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = (java.lang.Float) ((java.util.HashMap) r4.f324391a).get("android:fade:transitionAlpha");
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145299U(android.view.ViewGroup r2, android.view.View r3, p853i4.C108353o r4, p853i4.C108353o r5) {
        /*
            r1 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0016
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f324391a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.String r5 = "android:fade:transitionAlpha"
            java.lang.Object r4 = r4.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0016
            float r4 = r4.floatValue()
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = r4
        L_0x001f:
            android.animation.Animator r2 = r1.mo145302W(r3, r2, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.mo145299U(android.view.ViewGroup, android.view.View, i4.o, i4.o):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = (java.lang.Float) ((java.util.HashMap) r3.f324391a).get("android:fade:transitionAlpha");
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145300V(android.view.ViewGroup r1, android.view.View r2, p853i4.C108353o r3, p853i4.C108353o r4) {
        /*
            r0 = this;
            i4.z r1 = p853i4.C108360v.f324401a
            r1.getClass()
            if (r3 == 0) goto L_0x001a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x001a
            float r1 = r1.floatValue()
            goto L_0x001c
        L_0x001a:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x001c:
            r3 = 0
            android.animation.Animator r1 = r0.mo145302W(r2, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.mo145300V(android.view.ViewGroup, android.view.View, i4.o, i4.o):android.animation.Animator");
    }

    /* renamed from: W */
    public final Animator mo145302W(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C108360v.m146765c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C108360v.f324404d, new float[]{f2});
        ofFloat.addListener(new C103811b(view));
        mo145324a(new C103810a(this, view));
        return ofFloat;
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145352S(oVar);
        Map<String, Object> map = oVar.f324391a;
        HashMap hashMap = (HashMap) map;
        hashMap.put("android:fade:transitionAlpha", Float.valueOf(C108360v.f324401a.mo158854a(oVar.f324392b)));
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324379e);
        int d = C111331h.m151817d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f306746K);
        if ((d & -4) == 0) {
            this.f306746K = d;
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
