package com.tencent.p014mm.plugin.finder.view;

import android.animation.ObjectAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.z4 */
public final class C4239z4 {

    /* renamed from: a */
    public ObjectAnimator f18556a;

    /* renamed from: b */
    public C4124n6 f18557b;

    /* renamed from: c */
    public ObjectAnimator f18558c;

    /* renamed from: d */
    public C4124n6 f18559d;

    /* renamed from: e */
    public ObjectAnimator f18560e;

    /* renamed from: f */
    public C4142o8 f18561f;

    /* renamed from: a */
    public final void mo5104a(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i(str + "(Debug)", str2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5105b(android.view.View r6, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r6, r0)
            android.animation.ObjectAnimator r0 = r5.f18556a
            if (r0 == 0) goto L_0x003d
            r1 = 0
            java.lang.Object r0 = r0.getTarget()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0016
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x0016:
            boolean r0 = gy3.C87412m.m108589b(r1, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "slideFromRight view:"
            r0.append(r1)
            int r1 = r6.hashCode()
            r0.append(r1)
            java.lang.String r1 = " reuseAnim"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveSlideAnimHelper"
            r5.mo5104a(r1, r0)
            goto L_0x0075
        L_0x003d:
            r0 = 1
            r1 = 0
            r2 = 0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
            int r3 = r3.x
            float r3 = (float) r3
            r4 = 2
            float[] r4 = new float[r4]
            r4[r1] = r3
            r4[r0] = r2
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r0, r4)
            r5.f18556a = r0
            com.tencent.mm.plugin.finder.view.n6 r0 = r5.f18557b
            if (r0 != 0) goto L_0x0064
            com.tencent.mm.plugin.finder.view.n6 r0 = new com.tencent.mm.plugin.finder.view.n6
            r0.<init>()
        L_0x0064:
            r5.f18557b = r0
            android.animation.ObjectAnimator r1 = r5.f18556a
            if (r1 == 0) goto L_0x006d
            r1.addListener(r0)
        L_0x006d:
            android.animation.ObjectAnimator r0 = r5.f18556a
            if (r0 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r0.setTarget(r6)
        L_0x0075:
            com.tencent.mm.plugin.finder.view.n6 r0 = r5.f18557b
            if (r0 == 0) goto L_0x007d
            r0.f18298d = r6
            r0.f18299e = r7
        L_0x007d:
            android.animation.ObjectAnimator r6 = r5.f18556a
            if (r6 == 0) goto L_0x0084
            r6.start()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4239z4.mo5105b(android.view.View, fy3.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5106c(android.view.View r6, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r6, r0)
            android.animation.ObjectAnimator r0 = r5.f18558c
            if (r0 == 0) goto L_0x003d
            r1 = 0
            java.lang.Object r0 = r0.getTarget()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0016
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x0016:
            boolean r0 = gy3.C87412m.m108589b(r1, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "slideToRightAnim view:"
            r0.append(r1)
            int r1 = r6.hashCode()
            r0.append(r1)
            java.lang.String r1 = " reuseAnim"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveSlideAnimHelper"
            r5.mo5104a(r1, r0)
            goto L_0x0075
        L_0x003d:
            r0 = 1
            r1 = 0
            r2 = 0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
            int r3 = r3.x
            float r3 = (float) r3
            r4 = 2
            float[] r4 = new float[r4]
            r4[r1] = r2
            r4[r0] = r3
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r0, r4)
            r5.f18558c = r0
            com.tencent.mm.plugin.finder.view.n6 r0 = r5.f18559d
            if (r0 != 0) goto L_0x0064
            com.tencent.mm.plugin.finder.view.n6 r0 = new com.tencent.mm.plugin.finder.view.n6
            r0.<init>()
        L_0x0064:
            r5.f18559d = r0
            android.animation.ObjectAnimator r1 = r5.f18558c
            if (r1 == 0) goto L_0x006d
            r1.addListener(r0)
        L_0x006d:
            android.animation.ObjectAnimator r0 = r5.f18558c
            if (r0 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r0.setTarget(r6)
        L_0x0075:
            com.tencent.mm.plugin.finder.view.n6 r0 = r5.f18559d
            if (r0 == 0) goto L_0x007d
            r0.f18298d = r6
            r0.f18299e = r7
        L_0x007d:
            android.animation.ObjectAnimator r6 = r5.f18558c
            if (r6 == 0) goto L_0x0084
            r6.start()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4239z4.mo5106c(android.view.View, fy3.a):void");
    }
}
