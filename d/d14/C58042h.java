package d14;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54624g;
import c14.C54625h;
import c14.C54649x;
import d14.C58032e1;
import e14.C58482g;
import e14.C58484i;
import e14.C58490l;
import e14.C58491m;
import e14.C58506s;
import e14.C58508u;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;

/* renamed from: d14.h */
public final class C58042h {
    /* renamed from: a */
    public static C45252f m67192a(C45252f fVar, int i, C54624g gVar, int i2, Object obj) {
        C54624g gVar2;
        int i3;
        C54624g gVar3 = C54624g.SUSPEND;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            gVar = gVar3;
        }
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && gVar != gVar3) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    gVar2 = C54624g.DROP_OLDEST;
                    i3 = 0;
                } else {
                    i3 = i;
                    gVar2 = gVar;
                }
                return fVar instanceof C58506s ? C58506s.C58507a.m67937a((C58506s) fVar, (C66212f) null, i3, gVar2, 1, (Object) null) : new C58490l(fVar, (C66212f) null, i3, gVar2, 2, (C8480h) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m67193b(d14.C45252f<? extends T> r4, d14.C45253g<? super T> r5, wx3.C15601d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof d14.C58086u
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d14.u r0 = (d14.C58086u) r0
            int r1 = r0.f166131f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166131f = r1
            goto L_0x0018
        L_0x0013:
            d14.u r0 = new d14.u
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f166130e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166131f
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f166129d
            gy3.f0 r4 = (gy3.C8479f0) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x004e
        L_0x002b:
            r5 = move-exception
            r1 = r5
            goto L_0x0053
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            d14.v r2 = new d14.v     // Catch:{ all -> 0x0050 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0050 }
            r0.f166129d = r6     // Catch:{ all -> 0x0050 }
            r0.f166131f = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r4.mo31880a(r2, r0)     // Catch:{ all -> 0x0050 }
            if (r4 != r1) goto L_0x004e
            goto L_0x008d
        L_0x004e:
            r1 = 0
            goto L_0x008d
        L_0x0050:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L_0x0053:
            T r4 = r4.f27484d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L_0x0062
            boolean r6 = gy3.C87412m.m108589b(r4, r1)
            if (r6 == 0) goto L_0x0062
            r6 = 1
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 != 0) goto L_0x009a
            wx3.f r6 = r0.getContext()
            a14.z1$b r0 = a14.C53973z1.C0004b.f3d
            wx3.f$b r6 = r6.get(r0)
            a14.z1 r6 = (a14.C53973z1) r6
            if (r6 == 0) goto L_0x0089
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            java.util.concurrent.CancellationException r6 = r6.mo74526Z()
            if (r6 == 0) goto L_0x0087
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r3 = 0
        L_0x0088:
            r5 = r3
        L_0x0089:
            if (r5 != 0) goto L_0x009a
            if (r4 != 0) goto L_0x008e
        L_0x008d:
            return r1
        L_0x008e:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x0096
            rx3.C90107a.m112735a(r4, r1)
            throw r4
        L_0x0096:
            rx3.C90107a.m112735a(r1, r4)
            throw r1
        L_0x009a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58042h.m67193b(d14.f, d14.g, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public static final <T> Object m67194c(C45252f<? extends T> fVar, C32227p<? super T, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        int i = C58031e0.f165996a;
        Object a = m67192a(new C58491m(new C45251d0(pVar, (C15601d<? super C45251d0>) null), fVar, C66217g.f190253d, -2, C54624g.SUSPEND), 0, (C54624g) null, 2, (Object) null).mo31880a(C58508u.f167540d, dVar);
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (a != aVar) {
            a = C13598b0.f38549a;
        }
        return a == aVar ? a : C13598b0.f38549a;
    }

    /* renamed from: d */
    public static final <T> C45252f<T> m67195d(C54649x<? extends T> xVar) {
        return new C58022c(xVar, true, (C66212f) null, 0, (C54624g) null, 28, (C8480h) null);
    }

    /* renamed from: e */
    public static final <T> C45252f<T> m67196e(C45252f<? extends T> fVar) {
        C32226l<Object, Object> lVar = C7161o.f25136a;
        if (fVar instanceof C58050i1) {
            return fVar;
        }
        C32226l<Object, Object> lVar2 = C7161o.f25136a;
        C32227p<Object, Object, Boolean> pVar = C7161o.f25137b;
        if (fVar instanceof C58028e) {
            C58028e eVar = (C58028e) fVar;
            if (eVar.f165988e == lVar2 && eVar.f165989f == pVar) {
                return fVar;
            }
        }
        return new C58028e(fVar, lVar2, pVar);
    }

    /* renamed from: f */
    public static final <T> C45252f<T> m67197f(C45252f<? extends T> fVar, int i) {
        if (i >= 0) {
            return new C58091w(fVar, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r5.mo31880a(r2, r0) == r1) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m67198g(d14.C45252f<? extends T> r5, fy3.C32227p<? super T, ? super wx3.C15601d<? super java.lang.Boolean>, ? extends java.lang.Object> r6, wx3.C15601d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof d14.C58049i0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d14.i0 r0 = (d14.C58049i0) r0
            int r1 = r0.f166037h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166037h = r1
            goto L_0x0018
        L_0x0013:
            d14.i0 r0 = new d14.i0
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f166036g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166037h
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r5 = r0.f166035f
            d14.g0 r5 = (d14.C58036g0) r5
            java.lang.Object r6 = r0.f166034e
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r0 = r0.f166033d
            fy3.p r0 = (fy3.C32227p) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ a -> 0x0033 }
            goto L_0x006a
        L_0x0033:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x0064
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r7)
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            f14.c0 r2 = e14.C58509v.f167541a
            r7.f27484d = r2
            d14.g0 r2 = new d14.g0
            r2.<init>(r6, r7)
            r0.f166033d = r6     // Catch:{ a -> 0x0061 }
            r0.f166034e = r7     // Catch:{ a -> 0x0061 }
            r0.f166035f = r2     // Catch:{ a -> 0x0061 }
            r0.f166037h = r3     // Catch:{ a -> 0x0061 }
            java.lang.Object r5 = r5.mo31880a(r2, r0)     // Catch:{ a -> 0x0061 }
            if (r5 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0061:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L_0x0064:
            d14.g<?> r1 = r0.f167452d
            if (r1 != r5) goto L_0x0088
        L_0x0068:
            r0 = r6
            r6 = r7
        L_0x006a:
            T r1 = r6.f27484d
            f14.c0 r5 = e14.C58509v.f167541a
            if (r1 == r5) goto L_0x0071
        L_0x0070:
            return r1
        L_0x0071:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0088:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58042h.m67198g(d14.f, fy3.p, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m67199h(d14.C45252f<? extends T> r4, wx3.C15601d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof d14.C58043h0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            d14.h0 r0 = (d14.C58043h0) r0
            int r1 = r0.f166019g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166019g = r1
            goto L_0x0018
        L_0x0013:
            d14.h0 r0 = new d14.h0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f166018f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166019g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.f166017e
            d14.f0 r4 = (d14.C58034f0) r4
            java.lang.Object r0 = r0.f166016d
            gy3.f0 r0 = (gy3.C8479f0) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch:{ a -> 0x002f }
            goto L_0x0061
        L_0x002f:
            r5 = move-exception
            goto L_0x005d
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r5)
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            f14.c0 r2 = e14.C58509v.f167541a
            r5.f27484d = r2
            d14.f0 r2 = new d14.f0
            r2.<init>(r5)
            r0.f166016d = r5     // Catch:{ a -> 0x0059 }
            r0.f166017e = r2     // Catch:{ a -> 0x0059 }
            r0.f166019g = r3     // Catch:{ a -> 0x0059 }
            java.lang.Object r4 = r4.mo31880a(r2, r0)     // Catch:{ a -> 0x0059 }
            if (r4 != r1) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            r0 = r5
            goto L_0x0061
        L_0x0059:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005d:
            d14.g<?> r1 = r5.f167452d
            if (r1 != r4) goto L_0x0070
        L_0x0061:
            T r1 = r0.f27484d
            f14.c0 r4 = e14.C58509v.f167541a
            if (r1 == r4) goto L_0x0068
        L_0x0067:
            return r1
        L_0x0068:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L_0x0070:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58042h.m67199h(d14.f, wx3.d):java.lang.Object");
    }

    /* renamed from: i */
    public static C45252f m67200i(C45252f fVar, int i, C32227p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C58031e0.f165996a;
        } else {
            int i3 = C58031e0.f165996a;
        }
        int i4 = i;
        C58014a0 a0Var = new C58014a0(fVar, pVar);
        if (i4 > 0) {
            return i4 == 1 ? new C58020b0(a0Var) : new C58484i(a0Var, i4, C66217g.f190253d, -2, C54624g.SUSPEND);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i4).toString());
    }

    /* renamed from: j */
    public static final <T> C45252f<T> m67201j(C45252f<? extends T> fVar, C66212f fVar2) {
        int i = C53973z1.f151221b0;
        if (fVar2.get(C53973z1.C0004b.f3d) == null) {
            return C87412m.m108589b(fVar2, C66217g.f190253d) ? fVar : fVar instanceof C58506s ? C58506s.C58507a.m67937a((C58506s) fVar, fVar2, 0, (C54624g) null, 6, (Object) null) : new C58490l(fVar, fVar2, 0, (C54624g) null, 12, (C8480h) null);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + fVar2).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m67202k(d14.C45252f<? extends T> r4, wx3.C15601d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof d14.C58051j0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            d14.j0 r0 = (d14.C58051j0) r0
            int r1 = r0.f166040f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166040f = r1
            goto L_0x0018
        L_0x0013:
            d14.j0 r0 = new d14.j0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f166039e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166040f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f166038d
            gy3.f0 r4 = (gy3.C8479f0) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0050
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            f14.c0 r2 = e14.C58509v.f167541a
            r5.f27484d = r2
            d14.k0 r2 = new d14.k0
            r2.<init>(r5)
            r0.f166038d = r5
            r0.f166040f = r3
            java.lang.Object r4 = r4.mo31880a(r2, r0)
            if (r4 != r1) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            r4 = r5
        L_0x0050:
            T r1 = r4.f27484d
            f14.c0 r4 = e14.C58509v.f167541a
            if (r1 == r4) goto L_0x0057
        L_0x0056:
            return r1
        L_0x0057:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58042h.m67202k(d14.f, wx3.d):java.lang.Object");
    }

    /* renamed from: l */
    public static final <T> C58050i1<T> m67203l(C45252f<? extends T> fVar, C0000n0 n0Var, C58032e1 e1Var, T t) {
        C58027d1 d1Var;
        C58482g gVar;
        C45252f i;
        C54624g gVar2 = C54624g.SUSPEND;
        C54625h.f153148g0.getClass();
        int i2 = C54625h.C54626a.f153150b;
        if (1 >= i2) {
            i2 = 1;
        }
        int i3 = i2 - 1;
        if (!(fVar instanceof C58482g) || (i = gVar.mo82817i()) == null) {
            d1Var = new C58027d1(fVar, i3, gVar2, C66217g.f190253d);
        } else {
            int i4 = (gVar = (C58482g) fVar).f167474e;
            if (i4 != -3 && i4 != -2 && i4 != 0) {
                i3 = i4;
            } else if (gVar.f167475f != gVar2 || i4 == 0) {
                i3 = 0;
            }
            d1Var = new C58027d1(i, i3, gVar.f167475f, gVar.f167473d);
        }
        C58087u0 a = C58056k1.m67214a(t);
        C66212f fVar2 = d1Var.f165986b;
        C45252f<T> fVar3 = d1Var.f165985a;
        int i5 = C58032e1.f165997a;
        return new C58092w0(a, C53895h.m60465c(n0Var, fVar2, C87412m.m108589b(e1Var, C58032e1.C58033a.f165998a) ? C53934p0.DEFAULT : C53934p0.UNDISPATCHED, new C58058l0(e1Var, fVar3, a, t, (C15601d<? super C58058l0>) null)));
    }
}
