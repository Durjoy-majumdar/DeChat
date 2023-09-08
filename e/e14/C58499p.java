package e14;

import a14.C0000n0;
import c14.C54612b0;
import c14.C54625h;
import d14.C45252f;
import d14.C45253g;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import g14.C59348b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C64188i0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: e14.p */
public final class C58499p {

    @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo125469f = "Combine.kt", mo125470l = {57, 79, 82}, mo125471m = "invokeSuspend")
    /* renamed from: e14.p$a */
    public static final class C58500a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f167518d;

        /* renamed from: e */
        public Object f167519e;

        /* renamed from: f */
        public int f167520f;

        /* renamed from: g */
        public int f167521g;

        /* renamed from: h */
        public int f167522h;

        /* renamed from: i */
        public /* synthetic */ Object f167523i;

        /* renamed from: j */
        public final /* synthetic */ C45252f<T>[] f167524j;

        /* renamed from: n */
        public final /* synthetic */ C32224a<T[]> f167525n;

        /* renamed from: o */
        public final /* synthetic */ C32228q<C45253g<? super R>, T[], C15601d<? super C13598b0>, Object> f167526o;

        /* renamed from: p */
        public final /* synthetic */ C45253g<R> f167527p;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", mo125469f = "Combine.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
        /* renamed from: e14.p$a$a */
        public static final class C58501a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f167528d;

            /* renamed from: e */
            public final /* synthetic */ C45252f<T>[] f167529e;

            /* renamed from: f */
            public final /* synthetic */ int f167530f;

            /* renamed from: g */
            public final /* synthetic */ AtomicInteger f167531g;

            /* renamed from: h */
            public final /* synthetic */ C54625h<C64188i0<Object>> f167532h;

            /* renamed from: e14.p$a$a$a */
            public static final class C58502a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C54625h<C64188i0<Object>> f167533d;

                /* renamed from: e */
                public final /* synthetic */ int f167534e;

                @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", mo125469f = "Combine.kt", mo125470l = {35, 36}, mo125471m = "emit")
                /* renamed from: e14.p$a$a$a$a */
                public static final class C58503a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f167535d;

                    /* renamed from: e */
                    public final /* synthetic */ C58502a<T> f167536e;

                    /* renamed from: f */
                    public int f167537f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C58503a(C58502a<? super T> aVar, C15601d<? super C58503a> dVar) {
                        super(dVar);
                        this.f167536e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f167535d = obj;
                        this.f167537f |= Integer.MIN_VALUE;
                        return this.f167536e.emit(null, this);
                    }
                }

                public C58502a(C54625h<C64188i0<Object>> hVar, int i) {
                    this.f167533d = hVar;
                    this.f167534e = i;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r7, wx3.C15601d<? super rx3.C13598b0> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof e14.C58499p.C58500a.C58501a.C58502a.C58503a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        e14.p$a$a$a$a r0 = (e14.C58499p.C58500a.C58501a.C58502a.C58503a) r0
                        int r1 = r0.f167537f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f167537f = r1
                        goto L_0x0018
                    L_0x0013:
                        e14.p$a$a$a$a r0 = new e14.p$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f167535d
                        xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r2 = r0.f167537f
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0036
                        if (r2 == r4) goto L_0x0032
                        if (r2 != r3) goto L_0x002a
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x0054
                    L_0x002a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0032:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L_0x004b
                    L_0x0036:
                        kotlin.ResultKt.throwOnFailure(r8)
                        c14.h<sx3.i0<java.lang.Object>> r8 = r6.f167533d
                        sx3.i0 r2 = new sx3.i0
                        int r5 = r6.f167534e
                        r2.<init>(r5, r7)
                        r0.f167537f = r4
                        java.lang.Object r7 = r8.mo75536o(r2, r0)
                        if (r7 != r1) goto L_0x004b
                        return r1
                    L_0x004b:
                        r0.f167537f = r3
                        java.lang.Object r7 = a14.C53894g3.m60462a(r0)
                        if (r7 != r1) goto L_0x0054
                        return r1
                    L_0x0054:
                        rx3.b0 r7 = rx3.C13598b0.f38549a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e14.C58499p.C58500a.C58501a.C58502a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58501a(C45252f<? extends T>[] fVarArr, int i, AtomicInteger atomicInteger, C54625h<C64188i0<Object>> hVar, C15601d<? super C58501a> dVar) {
                super(2, dVar);
                this.f167529e = fVarArr;
                this.f167530f = i;
                this.f167531g = atomicInteger;
                this.f167532h = hVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C58501a(this.f167529e, this.f167530f, this.f167531g, this.f167532h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C58501a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f167528d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<T>[] fVarArr = this.f167529e;
                    int i2 = this.f167530f;
                    C45252f<T> fVar = fVarArr[i2];
                    C58502a aVar2 = new C58502a(this.f167532h, i2);
                    this.f167528d = 1;
                    if (fVar.mo31880a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        if (this.f167531g.decrementAndGet() == 0) {
                            C54612b0.C54613a.m61404a(this.f167532h, (Throwable) null, 1, (Object) null);
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.f167531g.decrementAndGet() == 0) {
                    C54612b0.C54613a.m61404a(this.f167532h, (Throwable) null, 1, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58500a(C45252f<? extends T>[] fVarArr, C32224a<T[]> aVar, C32228q<? super C45253g<? super R>, ? super T[], ? super C15601d<? super C13598b0>, ? extends Object> qVar, C45253g<? super R> gVar, C15601d<? super C58500a> dVar) {
            super(2, dVar);
            this.f167524j = fVarArr;
            this.f167525n = aVar;
            this.f167526o = qVar;
            this.f167527p = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58500a aVar = new C58500a(this.f167524j, this.f167525n, this.f167526o, this.f167527p, dVar);
            aVar.f167523i = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58500a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: f14.c0[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: f14.c0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: f14.c0[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: f14.c0[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: f14.c0[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: sx3.i0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: f14.c0[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: f14.c0[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ea A[LOOP:1: B:30:0x00ea->B:39:0x010c, LOOP_START, PHI: r5 r11 
          PHI: (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:27:0x00e5, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 sx3.i0) = (r11v2 sx3.i0), (r11v15 sx3.i0) binds: [B:27:0x00e5, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f167522h
                r3 = 2
                r4 = 3
                r5 = 0
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L_0x0069
                if (r2 == r7) goto L_0x004c
                if (r2 == r3) goto L_0x0036
                if (r2 != r4) goto L_0x002e
                int r2 = r0.f167521g
                int r5 = r0.f167520f
                java.lang.Object r8 = r0.f167519e
                byte[] r8 = (byte[]) r8
                java.lang.Object r9 = r0.f167518d
                c14.h r9 = (c14.C54625h) r9
                java.lang.Object r10 = r0.f167523i
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                kotlin.ResultKt.throwOnFailure(r25)
                r11 = r0
            L_0x0027:
                r23 = r5
                r5 = r2
                r2 = r23
                goto L_0x0170
            L_0x002e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0036:
                int r5 = r0.f167521g
                int r2 = r0.f167520f
                java.lang.Object r8 = r0.f167519e
                byte[] r8 = (byte[]) r8
                java.lang.Object r9 = r0.f167518d
                c14.h r9 = (c14.C54625h) r9
                java.lang.Object r10 = r0.f167523i
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                kotlin.ResultKt.throwOnFailure(r25)
                r11 = r0
                goto L_0x00c0
            L_0x004c:
                int r2 = r0.f167521g
                int r5 = r0.f167520f
                java.lang.Object r8 = r0.f167519e
                byte[] r8 = (byte[]) r8
                java.lang.Object r9 = r0.f167518d
                c14.h r9 = (c14.C54625h) r9
                java.lang.Object r10 = r0.f167523i
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                kotlin.ResultKt.throwOnFailure(r25)
                r11 = r25
                c14.l r11 = (c14.C54630l) r11
                java.lang.Object r11 = r11.f153153a
                r14 = r0
                r15 = r10
                goto L_0x00dd
            L_0x0069:
                kotlin.ResultKt.throwOnFailure(r25)
                java.lang.Object r2 = r0.f167523i
                a14.n0 r2 = (a14.C0000n0) r2
                d14.f<T>[] r8 = r0.f167524j
                int r14 = r8.length
                if (r14 != 0) goto L_0x0078
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0078:
                java.lang.Object[] r15 = new java.lang.Object[r14]
                f14.c0 r9 = e14.C58509v.f167542b
                r10 = 0
                r11 = 0
                r12 = 6
                r13 = 0
                r8 = r15
                sx3.C110821n.m150969p(r8, r9, r10, r11, r12, r13)
                r8 = 6
                c14.h r22 = c14.C54629k.m61479a(r14, r6, r6, r8, r6)
                java.util.concurrent.atomic.AtomicInteger r13 = new java.util.concurrent.atomic.AtomicInteger
                r13.<init>(r14)
                r12 = 0
            L_0x008f:
                if (r12 >= r14) goto L_0x00b9
                r9 = 0
                r10 = 0
                e14.p$a$a r11 = new e14.p$a$a
                d14.f<T>[] r8 = r0.f167524j
                r21 = 0
                r16 = r11
                r17 = r8
                r18 = r12
                r19 = r13
                r20 = r22
                r16.<init>(r17, r18, r19, r20, r21)
                r16 = 3
                r17 = 0
                r8 = r2
                r12 = r16
                r16 = r13
                r13 = r17
                a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
                int r12 = r18 + 1
                r13 = r16
                goto L_0x008f
            L_0x00b9:
                byte[] r8 = new byte[r14]
                r11 = r0
                r2 = r14
                r10 = r15
                r9 = r22
            L_0x00c0:
                int r5 = r5 + r7
                byte r5 = (byte) r5
                r11.f167523i = r10
                r11.f167518d = r9
                r11.f167519e = r8
                r11.f167520f = r2
                r11.f167521g = r5
                r11.f167522h = r7
                java.lang.Object r12 = r9.mo75513f(r11)
                if (r12 != r1) goto L_0x00d5
                return r1
            L_0x00d5:
                r15 = r10
                r14 = r11
                r11 = r12
                r23 = r5
                r5 = r2
                r2 = r23
            L_0x00dd:
                boolean r10 = r11 instanceof c14.C54630l.C54632b
                if (r10 != 0) goto L_0x00e2
                goto L_0x00e3
            L_0x00e2:
                r11 = r6
            L_0x00e3:
                sx3.i0 r11 = (sx3.C64188i0) r11
                if (r11 != 0) goto L_0x00ea
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x00ea:
                int r10 = r11.f181909a
                r12 = r15[r10]
                T r11 = r11.f181910b
                r15[r10] = r11
                f14.c0 r11 = e14.C58509v.f167542b
                if (r12 != r11) goto L_0x00f8
                int r5 = r5 + -1
            L_0x00f8:
                byte r11 = r8[r10]
                if (r11 == r2) goto L_0x010e
                byte r11 = (byte) r2
                r8[r10] = r11
                java.lang.Object r10 = r9.mo75518u()
                boolean r11 = r10 instanceof c14.C54630l.C54632b
                if (r11 != 0) goto L_0x0108
                goto L_0x0109
            L_0x0108:
                r10 = r6
            L_0x0109:
                r11 = r10
                sx3.i0 r11 = (sx3.C64188i0) r11
                if (r11 != 0) goto L_0x00ea
            L_0x010e:
                if (r5 != 0) goto L_0x016a
                fy3.a<T[]> r10 = r14.f167525n
                java.lang.Object r10 = r10.invoke()
                r13 = r10
                java.lang.Object[] r13 = (java.lang.Object[]) r13
                if (r13 != 0) goto L_0x013a
                fy3.q<d14.g<? super R>, T[], wx3.d<? super rx3.b0>, java.lang.Object> r10 = r14.f167526o
                d14.g<R> r11 = r14.f167527p
                r14.f167523i = r15
                r14.f167518d = r9
                r14.f167519e = r8
                r14.f167520f = r5
                r14.f167521g = r2
                r14.f167522h = r3
                java.lang.Object r10 = r10.invoke(r11, r15, r14)
                if (r10 != r1) goto L_0x0132
                return r1
            L_0x0132:
                r11 = r14
                r10 = r15
                r23 = r5
                r5 = r2
                r2 = r23
                goto L_0x00c0
            L_0x013a:
                r12 = 0
                r16 = 0
                r17 = 0
                r18 = 14
                r19 = 0
                r10 = r15
                r11 = r13
                r3 = r13
                r13 = r16
                r6 = r14
                r14 = r17
                r7 = r15
                r15 = r18
                r16 = r19
                sx3.C110821n.m150966m(r10, r11, r12, r13, r14, r15, r16)
                fy3.q<d14.g<? super R>, T[], wx3.d<? super rx3.b0>, java.lang.Object> r10 = r6.f167526o
                d14.g<R> r11 = r6.f167527p
                r6.f167523i = r7
                r6.f167518d = r9
                r6.f167519e = r8
                r6.f167520f = r5
                r6.f167521g = r2
                r6.f167522h = r4
                java.lang.Object r3 = r10.invoke(r11, r3, r6)
                if (r3 != r1) goto L_0x016c
                return r1
            L_0x016a:
                r6 = r14
                r7 = r15
            L_0x016c:
                r11 = r6
                r10 = r7
                goto L_0x0027
            L_0x0170:
                r3 = 2
                r6 = 0
                r7 = 1
                goto L_0x00c0
            */
            throw new UnsupportedOperationException("Method not decompiled: e14.C58499p.C58500a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <R, T> Object m67934a(C45253g<? super R> gVar, C45252f<? extends T>[] fVarArr, C32224a<T[]> aVar, C32228q<? super C45253g<? super R>, ? super T[], ? super C15601d<? super C13598b0>, ? extends Object> qVar, C15601d<? super C13598b0> dVar) {
        C58500a aVar2 = new C58500a(fVarArr, aVar, qVar, gVar, (C15601d<? super C58500a>) null);
        C58505r rVar = new C58505r(dVar.getContext(), dVar);
        Object a = C59348b.m69267a(rVar, rVar, aVar2);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
