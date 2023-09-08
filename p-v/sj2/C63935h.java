package sj2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53953u0;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: sj2.h */
public final class C63935h extends C63924f {

    /* renamed from: e */
    public long f181229e;

    /* renamed from: f */
    public long f181230f;

    /* renamed from: g */
    public boolean f181231g = true;

    /* renamed from: h */
    public int f181232h = -1;

    /* renamed from: i */
    public C53953u0<C63923e> f181233i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader", mo125469f = "RingtoneSelectDataLoader.kt", mo125470l = {27, 59}, mo125471m = "load")
    /* renamed from: sj2.h$a */
    public static final class C63936a extends C66704d {

        /* renamed from: d */
        public Object f181234d;

        /* renamed from: e */
        public boolean f181235e;

        /* renamed from: f */
        public /* synthetic */ Object f181236f;

        /* renamed from: g */
        public final /* synthetic */ C63935h f181237g;

        /* renamed from: h */
        public int f181238h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63936a(C63935h hVar, C15601d<? super C63936a> dVar) {
            super(dVar);
            this.f181237g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f181236f = obj;
            this.f181238h |= Integer.MIN_VALUE;
            return this.f181237g.mo13066a(0, false, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader$load$2", mo125469f = "RingtoneSelectDataLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.h$b */
    public static final class C63937b extends C91594j implements C32227p<C0000n0, C15601d<? super C53953u0<? extends C63923e>>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f181239d;

        /* renamed from: e */
        public final /* synthetic */ boolean f181240e;

        /* renamed from: f */
        public final /* synthetic */ C63935h f181241f;

        /* renamed from: g */
        public final /* synthetic */ int f181242g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader$load$2$1", mo125469f = "RingtoneSelectDataLoader.kt", mo125470l = {33, 38, 45}, mo125471m = "invokeSuspend")
        /* renamed from: sj2.h$b$a */
        public static final class C63938a extends C91594j implements C32227p<C0000n0, C15601d<? super C63923e>, Object> {

            /* renamed from: d */
            public Object f181243d;

            /* renamed from: e */
            public Object f181244e;

            /* renamed from: f */
            public int f181245f;

            /* renamed from: g */
            public /* synthetic */ Object f181246g;

            /* renamed from: h */
            public final /* synthetic */ boolean f181247h;

            /* renamed from: i */
            public final /* synthetic */ C63935h f181248i;

            /* renamed from: j */
            public final /* synthetic */ int f181249j;

            @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader$load$2$1$1", mo125469f = "RingtoneSelectDataLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: sj2.h$b$a$a */
            public static final class C63939a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C63935h f181250d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C63939a(C63935h hVar, C15601d<? super C63939a> dVar) {
                    super(2, dVar);
                    this.f181250d = hVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C63939a(this.f181250d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C63939a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    ((ArrayList) this.f181250d.f181201a).clear();
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63938a(boolean z, C63935h hVar, int i, C15601d<? super C63938a> dVar) {
                super(2, dVar);
                this.f181247h = z;
                this.f181248i = hVar;
                this.f181249j = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C63938a aVar = new C63938a(this.f181247h, this.f181248i, this.f181249j, dVar);
                aVar.f181246g = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63938a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: a14.n0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[Catch:{ Exception -> 0x0127 }] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ Exception -> 0x0127 }, LOOP:1: B:37:0x00de->B:39:0x00e4, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0108 A[Catch:{ Exception -> 0x0127 }, RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0109 A[Catch:{ Exception -> 0x0127 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r14.f181245f
                    r2 = 1
                    r3 = -1
                    r4 = 3
                    r5 = 2
                    if (r1 == 0) goto L_0x0039
                    if (r1 == r2) goto L_0x0031
                    if (r1 == r5) goto L_0x0029
                    if (r1 != r4) goto L_0x0021
                    java.lang.Object r0 = r14.f181244e
                    gy3.d0 r0 = (gy3.C8478d0) r0
                    java.lang.Object r1 = r14.f181243d
                    ve3.z r1 = (ve3.C52865z) r1
                    java.lang.Object r3 = r14.f181246g
                    a14.n0 r3 = (a14.C0000n0) r3
                    kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0127 }
                    goto L_0x010e
                L_0x0021:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L_0x0029:
                    java.lang.Object r1 = r14.f181246g
                    a14.n0 r1 = (a14.C0000n0) r1
                    kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0127 }
                    goto L_0x0090
                L_0x0031:
                    java.lang.Object r1 = r14.f181246g
                    a14.n0 r1 = (a14.C0000n0) r1
                    kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0127 }
                    goto L_0x0066
                L_0x0039:
                    kotlin.ResultKt.throwOnFailure(r15)
                    java.lang.Object r15 = r14.f181246g
                    r1 = r15
                    a14.n0 r1 = (a14.C0000n0) r1
                    boolean r15 = r14.f181247h     // Catch:{ Exception -> 0x0127 }
                    if (r15 == 0) goto L_0x0066
                    sj2.h r15 = r14.f181248i     // Catch:{ Exception -> 0x0127 }
                    r15.f181232h = r3     // Catch:{ Exception -> 0x0127 }
                    long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0127 }
                    r15.f181230f = r6     // Catch:{ Exception -> 0x0127 }
                    a14.h0 r15 = a14.C53872d1.f151117a     // Catch:{ Exception -> 0x0127 }
                    a14.k2 r15 = f14.C58901s.f168555a     // Catch:{ Exception -> 0x0127 }
                    sj2.h$b$a$a r6 = new sj2.h$b$a$a     // Catch:{ Exception -> 0x0127 }
                    sj2.h r7 = r14.f181248i     // Catch:{ Exception -> 0x0127 }
                    r8 = 0
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0127 }
                    r14.f181246g = r1     // Catch:{ Exception -> 0x0127 }
                    r14.f181245f = r2     // Catch:{ Exception -> 0x0127 }
                    java.lang.Object r15 = a14.C53895h.m60469g(r15, r6, r14)     // Catch:{ Exception -> 0x0127 }
                    if (r15 != r0) goto L_0x0066
                    return r0
                L_0x0066:
                    boolean r15 = r14.f181247h     // Catch:{ Exception -> 0x0127 }
                    if (r15 == 0) goto L_0x006c
                    r15 = 1
                    goto L_0x006d
                L_0x006c:
                    r15 = 0
                L_0x006d:
                    vj2.h r6 = new vj2.h     // Catch:{ Exception -> 0x0127 }
                    sj2.h r7 = r14.f181248i     // Catch:{ Exception -> 0x0127 }
                    int r8 = r7.f181232h     // Catch:{ Exception -> 0x0127 }
                    int r8 = r8 + r2
                    long r9 = r7.f181229e     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0127 }
                    int r9 = r14.f181249j     // Catch:{ Exception -> 0x0127 }
                    r6.<init>(r15, r8, r7, r9)     // Catch:{ Exception -> 0x0127 }
                    r7 = 0
                    r9 = 0
                    r11 = 3
                    r12 = 0
                    r14.f181246g = r1     // Catch:{ Exception -> 0x0127 }
                    r14.f181245f = r5     // Catch:{ Exception -> 0x0127 }
                    r10 = r14
                    java.lang.Object r15 = q40.C89456b.m111831a(r6, r7, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0127 }
                    if (r15 != r0) goto L_0x0090
                    return r0
                L_0x0090:
                    ve3.z r15 = (ve3.C52865z) r15     // Catch:{ Exception -> 0x0127 }
                    wx3.f r5 = r1.getCoroutineContext()     // Catch:{ Exception -> 0x0127 }
                    a14.C53873d2.m60392d(r5)     // Catch:{ Exception -> 0x0127 }
                    gy3.d0 r5 = new gy3.d0     // Catch:{ Exception -> 0x0127 }
                    r5.<init>()     // Catch:{ Exception -> 0x0127 }
                    r5.f27483d = r3     // Catch:{ Exception -> 0x0127 }
                    java.util.LinkedList<ve3.x> r3 = r15.f147662e     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r6 = "response.Infos"
                    gy3.C87412m.m108593f(r3, r6)     // Catch:{ Exception -> 0x0127 }
                    java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0127 }
                    r6.<init>()     // Catch:{ Exception -> 0x0127 }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0127 }
                L_0x00b1:
                    boolean r7 = r3.hasNext()     // Catch:{ Exception -> 0x0127 }
                    if (r7 == 0) goto L_0x00cf
                    java.lang.Object r7 = r3.next()     // Catch:{ Exception -> 0x0127 }
                    ve3.x r7 = (ve3.C52861x) r7     // Catch:{ Exception -> 0x0127 }
                    int r8 = r5.f27483d     // Catch:{ Exception -> 0x0127 }
                    int r9 = r7.f147645d     // Catch:{ Exception -> 0x0127 }
                    int r8 = java.lang.Math.max(r8, r9)     // Catch:{ Exception -> 0x0127 }
                    r5.f27483d = r8     // Catch:{ Exception -> 0x0127 }
                    ve3.n0 r7 = r7.f147646e     // Catch:{ Exception -> 0x0127 }
                    if (r7 == 0) goto L_0x00b1
                    r6.add(r7)     // Catch:{ Exception -> 0x0127 }
                    goto L_0x00b1
                L_0x00cf:
                    java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0127 }
                    r7 = 10
                    int r7 = sx3.C36907w.m41090l(r6, r7)     // Catch:{ Exception -> 0x0127 }
                    r3.<init>(r7)     // Catch:{ Exception -> 0x0127 }
                    java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0127 }
                L_0x00de:
                    boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0127 }
                    if (r7 == 0) goto L_0x00f8
                    java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0127 }
                    ve3.n0 r7 = (ve3.C65685n0) r7     // Catch:{ Exception -> 0x0127 }
                    pj2.e r8 = new pj2.e     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r9 = "it"
                    gy3.C87412m.m108593f(r7, r9)     // Catch:{ Exception -> 0x0127 }
                    r8.<init>(r7)     // Catch:{ Exception -> 0x0127 }
                    r3.add(r8)     // Catch:{ Exception -> 0x0127 }
                    goto L_0x00de
                L_0x00f8:
                    sj2.h r6 = r14.f181248i     // Catch:{ Exception -> 0x0127 }
                    r14.f181246g = r1     // Catch:{ Exception -> 0x0127 }
                    r14.f181243d = r15     // Catch:{ Exception -> 0x0127 }
                    r14.f181244e = r5     // Catch:{ Exception -> 0x0127 }
                    r14.f181245f = r4     // Catch:{ Exception -> 0x0127 }
                    java.lang.Object r3 = r6.mo88699b(r3, r14)     // Catch:{ Exception -> 0x0127 }
                    if (r3 != r0) goto L_0x0109
                    return r0
                L_0x0109:
                    r0 = r5
                    r13 = r1
                    r1 = r15
                    r15 = r3
                    r3 = r13
                L_0x010e:
                    java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x0127 }
                    wx3.f r3 = r3.getCoroutineContext()     // Catch:{ Exception -> 0x0127 }
                    a14.C53873d2.m60392d(r3)     // Catch:{ Exception -> 0x0127 }
                    sj2.h r3 = r14.f181248i     // Catch:{ Exception -> 0x0127 }
                    boolean r1 = r1.f147661d     // Catch:{ Exception -> 0x0127 }
                    r3.f181231g = r1     // Catch:{ Exception -> 0x0127 }
                    int r0 = r0.f27483d     // Catch:{ Exception -> 0x0127 }
                    r3.f181232h = r0     // Catch:{ Exception -> 0x0127 }
                    sj2.e r0 = new sj2.e     // Catch:{ Exception -> 0x0127 }
                    r0.<init>(r15, r1, r2)     // Catch:{ Exception -> 0x0127 }
                    return r0
                L_0x0127:
                    r15 = move-exception
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "GetRecommendRingBack failed: "
                    r0.append(r1)
                    java.lang.String r15 = r15.getMessage()
                    r0.append(r15)
                    java.lang.String r15 = r0.toString()
                    java.lang.String r0 = "MicroMsg.RingtoneSelectDataLoader"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r15)
                    sj2.e r15 = new sj2.e
                    sx3.f0 r2 = sx3.C64186f0.f181907d
                    r3 = 0
                    r4 = 0
                    r5 = 2
                    r6 = 0
                    r1 = r15
                    r1.<init>(r2, r3, r4, r5, r6)
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: sj2.C63935h.C63937b.C63938a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63937b(boolean z, C63935h hVar, int i, C15601d<? super C63937b> dVar) {
            super(2, dVar);
            this.f181240e = z;
            this.f181241f = hVar;
            this.f181242g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63937b bVar = new C63937b(this.f181240e, this.f181241f, this.f181242g, dVar);
            bVar.f181239d = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63937b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return C53895h.m60464b((C0000n0) this.f181239d, (C66212f) null, (C53934p0) null, new C63938a(this.f181240e, this.f181241f, this.f181242g, (C15601d<? super C63938a>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:28:0x006e, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo13066a(int r7, boolean r8, boolean r9, wx3.C15601d<? super sj2.C63923e> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof sj2.C63935h.C63936a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            sj2.h$a r0 = (sj2.C63935h.C63936a) r0
            int r1 = r0.f181238h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f181238h = r1
            goto L_0x0018
        L_0x0013:
            sj2.h$a r0 = new sj2.h$a
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f181236f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181238h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0071
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            boolean r7 = r0.f181235e
            java.lang.Object r8 = r0.f181234d
            sj2.h r8 = (sj2.C63935h) r8
            kotlin.ResultKt.throwOnFailure(r10)
            r9 = r7
            goto L_0x005e
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 == 0) goto L_0x0046
            a14.u0<sj2.e> r10 = r6.f181233i
            goto L_0x0047
        L_0x0046:
            r10 = r5
        L_0x0047:
            if (r10 != 0) goto L_0x0061
            a14.h0 r10 = a14.C53872d1.f151119c
            sj2.h$b r2 = new sj2.h$b
            r2.<init>(r8, r6, r7, r5)
            r0.f181234d = r6
            r0.f181235e = r9
            r0.f181238h = r4
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r8 = r6
        L_0x005e:
            a14.u0 r10 = (a14.C53953u0) r10
            goto L_0x0062
        L_0x0061:
            r8 = r6
        L_0x0062:
            if (r9 == 0) goto L_0x0066
            r8.f181233i = r10
        L_0x0066:
            r0.f181234d = r5
            r0.f181238h = r3
            java.lang.Object r10 = r10.mo74634A(r0)
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sj2.C63935h.mo13066a(int, boolean, boolean, wx3.d):java.lang.Object");
    }
}
