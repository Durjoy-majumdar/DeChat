package jk1;

import android.view.View;
import androidx.transition.Transition;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p853i4.C108353o;

/* renamed from: jk1.e */
public final class C108758e extends Transition {
    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        C87412m.m108594g(oVar, "transitionValues");
        Map<String, Object> map = oVar.f324391a;
        C87412m.m108593f(map, "transitionValues.values");
        Object tag = oVar.f324392b.getTag();
        ((HashMap) map).put("com.tencent.mm:View:click_listener", tag instanceof View.OnClickListener ? (View.OnClickListener) tag : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r4.f324391a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r3, p853i4.C108353o r4, p853i4.C108353o r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sceneRoot"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r3 = "com.tencent.mm:View:click_listener"
            r0 = 0
            if (r4 == 0) goto L_0x0015
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f324391a
            if (r1 == 0) goto L_0x0015
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            boolean r1 = r1 instanceof android.view.View.OnClickListener
            if (r1 == 0) goto L_0x0039
            if (r5 == 0) goto L_0x0039
            android.view.View r5 = r5.f324392b
            if (r5 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x002d
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f324391a
            if (r4 == 0) goto L_0x002d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r3 = r4.get(r3)
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            boolean r4 = r3 instanceof android.view.View.OnClickListener
            if (r4 == 0) goto L_0x0035
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            goto L_0x0036
        L_0x0035:
            r3 = r0
        L_0x0036:
            r5.setOnClickListener(r3)
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jk1.C108758e.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }
}
