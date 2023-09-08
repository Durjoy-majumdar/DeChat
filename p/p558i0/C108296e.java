package p558i0;

import gy3.C8480h;
import p175j0.C60667k2;

/* renamed from: i0.e */
public final class C108296e extends C108297f {
    public C108296e(boolean z, float f, C60667k2 k2Var, C8480h hVar) {
        super(z, f, k2Var, (C8480h) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: i0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: i0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: i0.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: i0.c} */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0081, code lost:
        if (r15 == p175j0.C108504h.C60656a.f172772a) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        if (r15 == p175j0.C108504h.C60656a.f172772a) goto L_0x00e8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p558i0.C108307o mo158755b(p1165z.C112526k r9, boolean r10, float r11, p175j0.C60667k2<p436a1.C103272w> r12, p175j0.C60667k2<p558i0.C108300g> r13, p175j0.C108504h r14, int r15) {
        /*
            r8 = this;
            java.lang.String r15 = "interactionSource"
            gy3.C87412m.m108594g(r9, r15)
            java.lang.String r15 = "color"
            gy3.C87412m.m108594g(r12, r15)
            java.lang.String r15 = "rippleAlpha"
            gy3.C87412m.m108594g(r13, r15)
            r15 = 331259447(0x13be9e37, float:4.8118755E-27)
            r14.mo51557H(r15)
            r15 = -1737891121(0xffffffff9869e2cf, float:-3.0229053E-24)
            r14.mo51557H(r15)
            j0.f1<android.view.View> r15 = androidx.compose.p002ui.platform.C103691v.f306272f
            java.lang.Object r15 = r14.mo51598m(r15)
        L_0x0021:
            boolean r0 = r15 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0057
            r0 = r15
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0037
            java.lang.String r15 = "parent"
            gy3.C87412m.m108593f(r0, r15)
            r15 = r0
            goto L_0x0021
        L_0x0037:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Couldn't find a valid parent for "
            r9.append(r10)
            r9.append(r15)
            java.lang.String r10 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L_0x0057:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r14.mo51565P()
            r0 = 1643267286(0x61f244d6, float:5.5863403E20)
            r14.mo51557H(r0)
            boolean r0 = r15.isInEditMode()
            if (r0 == 0) goto L_0x009d
            r15 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.mo51557H(r15)
            boolean r9 = r14.mo51619x(r9)
            boolean r15 = r14.mo51619x(r8)
            r9 = r9 | r15
            java.lang.Object r15 = r14.mo51606q()
            if (r9 != 0) goto L_0x0083
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r15 != r9) goto L_0x0091
        L_0x0083:
            i0.c r15 = new i0.c
            r5 = 0
            r0 = r15
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r14.mo51553F(r15)
        L_0x0091:
            r14.mo51565P()
            i0.c r15 = (p558i0.C108293c) r15
            r14.mo51565P()
            r14.mo51565P()
            return r15
        L_0x009d:
            r14.mo51565P()
            r0 = 0
            r1 = 0
            int r2 = r15.getChildCount()
        L_0x00a6:
            if (r1 >= r2) goto L_0x00b5
            android.view.View r3 = r15.getChildAt(r1)
            boolean r4 = r3 instanceof p558i0.C108304l
            if (r4 == 0) goto L_0x00b2
            r0 = r3
            goto L_0x00b5
        L_0x00b2:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00b5:
            if (r0 != 0) goto L_0x00c8
            i0.l r0 = new i0.l
            android.content.Context r1 = r15.getContext()
            java.lang.String r2 = "view.context"
            gy3.C87412m.m108593f(r1, r2)
            r0.<init>(r1)
            r15.addView(r0)
        L_0x00c8:
            r15 = -3686095(0xffffffffffc7c131, float:NaN)
            r14.mo51557H(r15)
            boolean r9 = r14.mo51619x(r9)
            boolean r15 = r14.mo51619x(r8)
            r9 = r9 | r15
            boolean r15 = r14.mo51619x(r0)
            r9 = r9 | r15
            java.lang.Object r15 = r14.mo51606q()
            if (r9 != 0) goto L_0x00e8
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r15 != r9) goto L_0x00f9
        L_0x00e8:
            i0.b r15 = new i0.b
            r6 = r0
            i0.l r6 = (p558i0.C108304l) r6
            r7 = 0
            r1 = r15
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.mo51553F(r15)
        L_0x00f9:
            r14.mo51565P()
            i0.b r15 = (p558i0.C108292b) r15
            r14.mo51565P()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p558i0.C108296e.mo158755b(z.k, boolean, float, j0.k2, j0.k2, j0.h, int):i0.o");
    }
}
