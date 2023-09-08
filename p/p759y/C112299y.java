package p759y;

import c14.C54612b0;
import gy3.C8480h;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p190l1.C109085c;
import p190l1.C109111s;
import p604m1.C109464f;
import p759y.C112236i;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: y.y */
public final class C112299y {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: y.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: m1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: j0.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: j0.k2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m153174a(p190l1.C109085c r9, p175j0.C60667k2 r10, p175j0.C60667k2 r11, p604m1.C109464f r12, p759y.C112218f0 r13, wx3.C15601d r14) {
        /*
            boolean r0 = r14 instanceof p759y.C112272p
            if (r0 == 0) goto L_0x0013
            r0 = r14
            y.p r0 = (p759y.C112272p) r0
            int r1 = r0.f336194j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336194j = r1
            goto L_0x0018
        L_0x0013:
            y.p r0 = new y.p
            r0.<init>(r14)
        L_0x0018:
            r14 = r0
            java.lang.Object r0 = r14.f336193i
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r14.f336194j
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0076
            if (r2 == r7) goto L_0x005a
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r9 = r14.f336188d
            gy3.c0 r9 = (gy3.C59741c0) r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0125
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r14.f336188d
            gy3.c0 r9 = (gy3.C59741c0) r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x010c
        L_0x0049:
            java.lang.Object r9 = r14.f336190f
            y.f0 r9 = (p759y.C112218f0) r9
            java.lang.Object r10 = r14.f336189e
            m1.f r10 = (p604m1.C109464f) r10
            java.lang.Object r11 = r14.f336188d
            l1.c r11 = (p190l1.C109085c) r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00e3
        L_0x005a:
            java.lang.Object r9 = r14.f336192h
            r13 = r9
            y.f0 r13 = (p759y.C112218f0) r13
            java.lang.Object r9 = r14.f336191g
            r12 = r9
            m1.f r12 = (p604m1.C109464f) r12
            java.lang.Object r9 = r14.f336190f
            r11 = r9
            j0.k2 r11 = (p175j0.C60667k2) r11
            java.lang.Object r9 = r14.f336189e
            r10 = r9
            j0.k2 r10 = (p175j0.C60667k2) r10
            java.lang.Object r9 = r14.f336188d
            l1.c r9 = (p190l1.C109085c) r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008f
        L_0x0076:
            kotlin.ResultKt.throwOnFailure(r0)
            l1.n r0 = p190l1.C109108n.Initial
            r14.f336188d = r9
            r14.f336189e = r10
            r14.f336190f = r11
            r14.f336191g = r12
            r14.f336192h = r13
            r14.f336194j = r7
            java.lang.Object r0 = p759y.C112205c1.m153110b(r9, r0, r3, r14)
            if (r0 != r1) goto L_0x008f
            goto L_0x0137
        L_0x008f:
            l1.s r0 = (p190l1.C109111s) r0
            java.lang.Object r10 = r10.getValue()
            fy3.l r10 = (fy3.C32226l) r10
            java.lang.Object r10 = r10.invoke(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00a5
            goto L_0x0136
        L_0x00a5:
            java.lang.Object r10 = r11.getValue()
            fy3.a r10 = (fy3.C32224a) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cb
            r0.mo160354a()
            p604m1.C109465g.m148683a(r12, r0)
            r9 = 0
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            rx3.l r9 = new rx3.l
            r9.<init>(r0, r10)
        L_0x00c8:
            r1 = r9
            goto L_0x0137
        L_0x00cb:
            r14.f336188d = r9
            r14.f336189e = r12
            r14.f336190f = r13
            r14.f336191g = r8
            r14.f336192h = r8
            r14.f336194j = r6
            l1.n r10 = p190l1.C109108n.Main
            java.lang.Object r0 = p759y.C112205c1.m153110b(r9, r10, r3, r14)
            if (r0 != r1) goto L_0x00e0
            goto L_0x0137
        L_0x00e0:
            r11 = r9
            r10 = r12
            r9 = r13
        L_0x00e3:
            l1.s r0 = (p190l1.C109111s) r0
            p604m1.C109465g.m148683a(r10, r0)
            gy3.c0 r2 = new gy3.c0
            r2.<init>()
            y.q r13 = new y.q
            r13.<init>(r10, r2)
            y.f0 r10 = p759y.C112218f0.Vertical
            if (r9 != r10) goto L_0x010f
            long r3 = r0.f326717a
            int r12 = r0.f326724h
            r14.f336188d = r2
            r14.f336189e = r8
            r14.f336190f = r8
            r14.f336194j = r5
            r9 = r11
            r10 = r3
            java.lang.Object r0 = p759y.C112242j.m153144e(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x010b
            goto L_0x0137
        L_0x010b:
            r9 = r2
        L_0x010c:
            l1.s r0 = (p190l1.C109111s) r0
            goto L_0x0127
        L_0x010f:
            long r5 = r0.f326717a
            int r12 = r0.f326724h
            r14.f336188d = r2
            r14.f336189e = r8
            r14.f336190f = r8
            r14.f336194j = r4
            r9 = r11
            r10 = r5
            java.lang.Object r0 = p759y.C112242j.m153142c(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x0124
            goto L_0x0137
        L_0x0124:
            r9 = r2
        L_0x0125:
            l1.s r0 = (p190l1.C109111s) r0
        L_0x0127:
            if (r0 == 0) goto L_0x0136
            float r9 = r9.f170634d
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            rx3.l r9 = new rx3.l
            r9.<init>(r0, r10)
            goto L_0x00c8
        L_0x0136:
            r1 = r8
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112299y.m153174a(l1.c, j0.k2, j0.k2, m1.f, y.f0, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m153175b(C109085c cVar, C13604l lVar, C109464f fVar, C54612b0 b0Var, boolean z, C112218f0 f0Var, C15601d dVar) {
        float floatValue = ((Number) lVar.f38556e).floatValue();
        C109111s sVar = (C109111s) lVar.f38555d;
        C112218f0 f0Var2 = C112218f0.Vertical;
        long a = f0Var == f0Var2 ? C112540f.m153745a(0.0f, floatValue) : C112540f.m153745a(floatValue, 0.0f);
        long j = sVar.f326719c;
        long f = C112539e.m153741f(j, C112539e.m153743h(a, Math.signum(f0Var == f0Var2 ? C112539e.m153739d(j) : C112539e.m153738c(j))));
        b0Var.mo75539t(new C112236i.C112239c(f, (C8480h) null));
        if (z) {
            floatValue *= (float) -1;
        }
        b0Var.mo75539t(new C112236i.C112238b(floatValue, f, (C8480h) null));
        C112279r rVar = new C112279r(fVar, f0Var, b0Var, z);
        return f0Var == f0Var2 ? C112242j.m153149j(cVar, sVar.f326717a, rVar, dVar) : C112242j.m153146g(cVar, sVar.f326717a, rVar, dVar);
    }
}
