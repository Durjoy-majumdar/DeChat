package p759y;

import fy3.C32227p;
import p190l1.C109085c;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: y.d0 */
public final class C112209d0 {

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ForEachGestureKt", mo125469f = "ForEachGesture.kt", mo125470l = {79}, mo125471m = "awaitAllPointersUp")
    /* renamed from: y.d0$a */
    public static final class C112210a extends C66704d {

        /* renamed from: d */
        public Object f335950d;

        /* renamed from: e */
        public /* synthetic */ Object f335951e;

        /* renamed from: f */
        public int f335952f;

        public C112210a(C15601d<? super C112210a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f335951e = obj;
            this.f335952f |= Integer.MIN_VALUE;
            return C112209d0.m153115a((C109085c) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ForEachGestureKt", mo125469f = "ForEachGesture.kt", mo125470l = {41, 44, 49}, mo125471m = "forEachGesture")
    /* renamed from: y.d0$b */
    public static final class C112211b extends C66704d {

        /* renamed from: d */
        public Object f335953d;

        /* renamed from: e */
        public Object f335954e;

        /* renamed from: f */
        public Object f335955f;

        /* renamed from: g */
        public /* synthetic */ Object f335956g;

        /* renamed from: h */
        public int f335957h;

        public C112211b(C15601d<? super C112211b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f335956g = obj;
            this.f335957h |= Integer.MIN_VALUE;
            return C112209d0.m153116b((C109119z) null, (C32227p<? super C109119z, ? super C15601d<? super C13598b0>, ? extends Object>) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if ((!r8) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r8 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m153115a(p190l1.C109085c r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            boolean r0 = r8 instanceof p759y.C112209d0.C112210a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            y.d0$a r0 = (p759y.C112209d0.C112210a) r0
            int r1 = r0.f335952f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335952f = r1
            goto L_0x0018
        L_0x0013:
            y.d0$a r0 = new y.d0$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f335951e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335952f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r7 = r0.f335950d
            l1.c r7 = (p190l1.C109085c) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "<this>"
            gy3.C87412m.m108594g(r7, r8)
            l1.l r8 = r7.mo160330P()
            java.util.List<l1.s> r8 = r8.f326709a
            int r2 = r8.size()
            r5 = 0
        L_0x0047:
            if (r5 >= r2) goto L_0x0058
            java.lang.Object r6 = r8.get(r5)
            l1.s r6 = (p190l1.C109111s) r6
            boolean r6 = r6.f326720d
            if (r6 == 0) goto L_0x0055
            r8 = 1
            goto L_0x0059
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0058:
            r8 = 0
        L_0x0059:
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x0086
        L_0x005c:
            l1.n r8 = p190l1.C109108n.Final
            r0.f335950d = r7
            r0.f335952f = r4
            java.lang.Object r8 = r7.mo160333e0(r8, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            l1.l r8 = (p190l1.C109106l) r8
            java.util.List<l1.s> r8 = r8.f326709a
            int r2 = r8.size()
            r5 = 0
        L_0x0072:
            if (r5 >= r2) goto L_0x0083
            java.lang.Object r6 = r8.get(r5)
            l1.s r6 = (p190l1.C109111s) r6
            boolean r6 = r6.f326720d
            if (r6 == 0) goto L_0x0080
            r8 = 1
            goto L_0x0084
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 != 0) goto L_0x005c
        L_0x0086:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112209d0.m153115a(l1.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[SYNTHETIC, Splitter:B:28:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c A[Catch:{ CancellationException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d A[Catch:{ CancellationException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m153116b(p190l1.C109119z r10, fy3.C32227p<? super p190l1.C109119z, ? super wx3.C15601d<? super rx3.C13598b0>, ? extends java.lang.Object> r11, wx3.C15601d<? super rx3.C13598b0> r12) {
        /*
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r1 = r12 instanceof p759y.C112209d0.C112211b
            if (r1 == 0) goto L_0x0015
            r1 = r12
            y.d0$b r1 = (p759y.C112209d0.C112211b) r1
            int r2 = r1.f335957h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f335957h = r2
            goto L_0x001a
        L_0x0015:
            y.d0$b r1 = new y.d0$b
            r1.<init>(r12)
        L_0x001a:
            java.lang.Object r12 = r1.f335956g
            int r2 = r1.f335957h
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x0068
            if (r2 == r4) goto L_0x0054
            if (r2 == r5) goto L_0x0042
            if (r2 != r6) goto L_0x003a
            java.lang.Object r10 = r1.f335955f
            wx3.f r10 = (wx3.C66212f) r10
            java.lang.Object r11 = r1.f335954e
            fy3.p r11 = (fy3.C32227p) r11
            java.lang.Object r2 = r1.f335953d
            l1.z r2 = (p190l1.C109119z) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0051
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            java.lang.Object r10 = r1.f335955f
            wx3.f r10 = (wx3.C66212f) r10
            java.lang.Object r11 = r1.f335954e
            fy3.p r11 = (fy3.C32227p) r11
            java.lang.Object r2 = r1.f335953d
            l1.z r2 = (p190l1.C109119z) r2
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ CancellationException -> 0x0065 }
        L_0x0051:
            r12 = r10
            r10 = r2
            goto L_0x006f
        L_0x0054:
            java.lang.Object r10 = r1.f335955f
            wx3.f r10 = (wx3.C66212f) r10
            java.lang.Object r11 = r1.f335954e
            fy3.p r11 = (fy3.C32227p) r11
            java.lang.Object r2 = r1.f335953d
            l1.z r2 = (p190l1.C109119z) r2
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ CancellationException -> 0x0065 }
            r12 = r0
            goto L_0x0089
        L_0x0065:
            r12 = move-exception
            r7 = r0
            goto L_0x00b2
        L_0x0068:
            kotlin.ResultKt.throwOnFailure(r12)
            wx3.f r12 = r1.getContext()
        L_0x006f:
            r2 = r0
        L_0x0070:
            boolean r7 = a14.C53873d2.m60394f(r12)
            if (r7 == 0) goto L_0x00d6
            r1.f335953d = r10     // Catch:{ CancellationException -> 0x00ac }
            r1.f335954e = r11     // Catch:{ CancellationException -> 0x00ac }
            r1.f335955f = r12     // Catch:{ CancellationException -> 0x00ac }
            r1.f335957h = r4     // Catch:{ CancellationException -> 0x00ac }
            java.lang.Object r7 = r11.invoke(r10, r1)     // Catch:{ CancellationException -> 0x00ac }
            if (r7 != r2) goto L_0x0085
            return r2
        L_0x0085:
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
        L_0x0089:
            r1.f335953d = r2     // Catch:{ CancellationException -> 0x00a7 }
            r1.f335954e = r11     // Catch:{ CancellationException -> 0x00a7 }
            r1.f335955f = r10     // Catch:{ CancellationException -> 0x00a7 }
            r1.f335957h = r5     // Catch:{ CancellationException -> 0x00a7 }
            y.c0 r7 = new y.c0     // Catch:{ CancellationException -> 0x00a7 }
            r7.<init>(r3)     // Catch:{ CancellationException -> 0x00a7 }
            java.lang.Object r7 = r2.mo160337A(r7, r1)     // Catch:{ CancellationException -> 0x00a7 }
            if (r7 != r0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ CancellationException -> 0x00a7 }
        L_0x009f:
            if (r7 != r12) goto L_0x00a2
            return r12
        L_0x00a2:
            r9 = r12
            r12 = r10
            r10 = r2
            r2 = r9
            goto L_0x0070
        L_0x00a7:
            r7 = move-exception
            r9 = r7
            r7 = r12
            r12 = r9
            goto L_0x00b2
        L_0x00ac:
            r7 = move-exception
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r7
            r7 = r9
        L_0x00b2:
            boolean r8 = a14.C53873d2.m60394f(r10)
            if (r8 == 0) goto L_0x00d5
            r1.f335953d = r2
            r1.f335954e = r11
            r1.f335955f = r10
            r1.f335957h = r6
            y.c0 r12 = new y.c0
            r12.<init>(r3)
            java.lang.Object r12 = r2.mo160337A(r12, r1)
            if (r12 != r0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            rx3.b0 r12 = rx3.C13598b0.f38549a
        L_0x00ce:
            if (r12 != r7) goto L_0x00d1
            return r7
        L_0x00d1:
            r12 = r10
            r10 = r2
            r2 = r7
            goto L_0x0070
        L_0x00d5:
            throw r12
        L_0x00d6:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112209d0.m153116b(l1.z, fy3.p, wx3.d):java.lang.Object");
    }
}
