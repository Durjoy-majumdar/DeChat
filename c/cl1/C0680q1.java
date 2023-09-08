package cl1;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53953u0;
import a14.C53965x0;
import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cl1.q1 */
public final class C0680q1 extends C39970c<C45795b> {

    /* renamed from: f */
    public final LinkedList<C0681a> f1602f = new LinkedList<>();

    /* renamed from: g */
    public boolean f1603g;

    /* renamed from: cl1.q1$a */
    public static final class C0681a {

        /* renamed from: a */
        public final C0682b f1604a;

        /* renamed from: b */
        public final C32224a<C13598b0> f1605b;

        /* renamed from: c */
        public final C32224a<C13598b0> f1606c;

        /* renamed from: d */
        public C53953u0 f1607d;

        public C0681a(C0682b bVar, C32224a aVar, C32224a aVar2, C53953u0 u0Var, int i, C8480h hVar) {
            u0Var = (i & 8) != 0 ? null : u0Var;
            C87412m.m108594g(bVar, "state");
            C87412m.m108594g(aVar, "showBlock");
            C87412m.m108594g(aVar2, "timeOutBlock");
            this.f1604a = bVar;
            this.f1605b = aVar;
            this.f1606c = aVar2;
            this.f1607d = u0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0681a)) {
                return false;
            }
            C0681a aVar = (C0681a) obj;
            return this.f1604a == aVar.f1604a && C87412m.m108589b(this.f1605b, aVar.f1605b) && C87412m.m108589b(this.f1606c, aVar.f1606c) && C87412m.m108589b(this.f1607d, aVar.f1607d);
        }

        public int hashCode() {
            int hashCode = ((((this.f1604a.hashCode() * 31) + this.f1605b.hashCode()) * 31) + this.f1606c.hashCode()) * 31;
            C53953u0 u0Var = this.f1607d;
            return hashCode + (u0Var == null ? 0 : u0Var.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("state: ");
            sb.append(this.f1604a.f1611d);
            sb.append(" priority: ");
            sb.append(this.f1604a.f1612e);
            sb.append(" lockJob: ");
            C53953u0 u0Var = this.f1607d;
            sb.append(u0Var != null ? Boolean.valueOf(u0Var.mo74466a()) : null);
            return sb.toString();
        }
    }

    /* renamed from: cl1.q1$b */
    public enum C0682b {
        LOTTERY_RESULT_TOAST("LOTTERY_RESULT_TOAST", 1),
        LIVE_BOX_TOAST("LIVE_BOX_TOAST", 2);
        

        /* renamed from: d */
        public final String f1611d;

        /* renamed from: e */
        public final int f1612e;

        /* access modifiers changed from: public */
        C0682b(String str, int i) {
            this.f1611d = str;
            this.f1612e = i;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveToastManagerSlice$runState$2", mo125469f = "LiveToastManagerSlice.kt", mo125470l = {52, 58, 75}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.q1$c */
    public static final class C0683c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f1613d;

        /* renamed from: e */
        public Object f1614e;

        /* renamed from: f */
        public int f1615f;

        /* renamed from: g */
        public /* synthetic */ Object f1616g;

        /* renamed from: h */
        public final /* synthetic */ C0680q1 f1617h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveToastManagerSlice$runState$2$1", mo125469f = "LiveToastManagerSlice.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.q1$c$a */
        public static final class C0684a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0681a f1618d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0684a(C0681a aVar, C15601d<? super C0684a> dVar) {
                super(2, dVar);
                this.f1618d = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0684a(this.f1618d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C0684a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f1618d.f1605b.invoke();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveToastManagerSlice$runState$2$2", mo125469f = "LiveToastManagerSlice.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.q1$c$b */
        public static final class C0685b extends C91594j implements C32227p<C0000n0, C15601d<?>, Object> {

            /* renamed from: d */
            public int f1619d;

            public C0685b(C15601d<? super C0685b> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0685b(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                new C0685b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f1619d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f1619d = 1;
                    C53965x0.m60606a(this);
                    return aVar;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    throw new C13600d();
                }
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveToastManagerSlice$runState$2$timeOutJob$1", mo125469f = "LiveToastManagerSlice.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
        /* renamed from: cl1.q1$c$c */
        public static final class C0686c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f1620d;

            /* renamed from: e */
            public final /* synthetic */ C0681a f1621e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0686c(C0681a aVar, C15601d<? super C0686c> dVar) {
                super(2, dVar);
                this.f1621e = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0686c(this.f1621e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C0686c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f1620d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f1620d = 1;
                    if (C53965x0.m60607b(30000, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Log.m105924i("LiveToastManagerSlice", "job cancel timeout await, state = " + this.f1621e.f1604a);
                C53953u0 u0Var = this.f1621e.f1607d;
                if (u0Var != null) {
                    C53973z1.C53974a.m60623a(u0Var, (CancellationException) null, 1, (Object) null);
                }
                this.f1621e.f1606c.invoke();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0683c(C0680q1 q1Var, C15601d<? super C0683c> dVar) {
            super(2, dVar);
            this.f1617h = q1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C0683c cVar = new C0683c(this.f1617h, dVar);
            cVar.f1616g = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0683c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: a14.u0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: cl1.q1$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0149  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r1.f1615f
                r3 = 3
                r4 = 2
                java.lang.String r5 = "LiveToastManagerSlice"
                r6 = 1
                r7 = 0
                if (r0 == 0) goto L_0x004f
                if (r0 == r6) goto L_0x0047
                if (r0 == r4) goto L_0x0038
                if (r0 == r3) goto L_0x001c
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x001c:
                java.lang.Object r0 = r1.f1614e
                r8 = r0
                a14.u0 r8 = (a14.C53953u0) r8
                java.lang.Object r0 = r1.f1613d
                r9 = r0
                cl1.q1$a r9 = (cl1.C0680q1.C0681a) r9
                java.lang.Object r0 = r1.f1616g
                r10 = r0
                a14.n0 r10 = (a14.C0000n0) r10
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0033 }
                r11 = r10
                r10 = r8
                r8 = r1
                goto L_0x00fb
            L_0x0033:
                r0 = move-exception
                r11 = r0
                r0 = r1
                goto L_0x010f
            L_0x0038:
                java.lang.Object r0 = r1.f1613d
                cl1.q1$a r0 = (cl1.C0680q1.C0681a) r0
                java.lang.Object r8 = r1.f1616g
                a14.n0 r8 = (a14.C0000n0) r8
                kotlin.ResultKt.throwOnFailure(r18)
                r9 = r0
                r15 = r8
                r8 = r1
                goto L_0x00ae
            L_0x0047:
                java.lang.Object r0 = r1.f1616g
                a14.n0 r0 = (a14.C0000n0) r0
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x0067
            L_0x004f:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r0 = r1.f1616g
                a14.n0 r0 = (a14.C0000n0) r0
                cl1.q1 r8 = r1.f1617h
                r8.f1603g = r6
                r8 = 1000(0x3e8, double:4.94E-321)
                r1.f1616g = r0
                r1.f1615f = r6
                java.lang.Object r8 = a14.C53965x0.m60607b(r8, r1)
                if (r8 != r2) goto L_0x0067
                return r2
            L_0x0067:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "state runState toastList: "
                r8.append(r9)
                cl1.q1 r9 = r1.f1617h
                java.util.LinkedList<cl1.q1$a> r9 = r9.f1602f
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
                r8 = r1
            L_0x0081:
                cl1.q1 r9 = r8.f1617h
                java.util.LinkedList<cl1.q1$a> r9 = r9.f1602f
                int r9 = r9.size()
                if (r9 <= 0) goto L_0x0149
                cl1.q1 r9 = r8.f1617h
                java.util.LinkedList<cl1.q1$a> r9 = r9.f1602f
                java.lang.Object r9 = r9.pop()
                cl1.q1$a r9 = (cl1.C0680q1.C0681a) r9
                a14.h0 r10 = a14.C53872d1.f151117a
                a14.k2 r10 = f14.C58901s.f168555a
                cl1.q1$c$a r11 = new cl1.q1$c$a
                r11.<init>(r9, r7)
                r8.f1616g = r0
                r8.f1613d = r9
                r8.f1614e = r7
                r8.f1615f = r4
                java.lang.Object r10 = a14.C53895h.m60469g(r10, r11, r8)
                if (r10 != r2) goto L_0x00ad
                return r2
            L_0x00ad:
                r15 = r0
            L_0x00ae:
                r11 = 0
                r12 = 0
                cl1.q1$c$b r13 = new cl1.q1$c$b
                r13.<init>(r7)
                r14 = 3
                r0 = 0
                r10 = r15
                r18 = r15
                r15 = r0
                a14.u0 r0 = a14.C53895h.m60464b(r10, r11, r12, r13, r14, r15)
                r9.f1607d = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r10 = "launch await, state = "
                r0.append(r10)
                cl1.q1$b r10 = r9.f1604a
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                r11 = 0
                r12 = 0
                cl1.q1$c$c r13 = new cl1.q1$c$c
                r13.<init>(r9, r7)
                r14 = 3
                r15 = 0
                r10 = r18
                a14.u0 r10 = a14.C53895h.m60464b(r10, r11, r12, r13, r14, r15)
                a14.u0 r0 = r9.f1607d     // Catch:{ all -> 0x0105 }
                r11 = r18
                if (r0 == 0) goto L_0x0103
                r8.f1616g = r11     // Catch:{ all -> 0x0101 }
                r8.f1613d = r9     // Catch:{ all -> 0x0101 }
                r8.f1614e = r10     // Catch:{ all -> 0x0101 }
                r8.f1615f = r3     // Catch:{ all -> 0x0101 }
                java.lang.Object r0 = r0.mo74634A(r8)     // Catch:{ all -> 0x0101 }
                if (r0 != r2) goto L_0x00fb
                return r2
            L_0x00fb:
                rx3.d r0 = new rx3.d     // Catch:{ all -> 0x0101 }
                r0.<init>()     // Catch:{ all -> 0x0101 }
                throw r0     // Catch:{ all -> 0x0101 }
            L_0x0101:
                r0 = move-exception
                goto L_0x0108
            L_0x0103:
                r0 = r11
                goto L_0x012e
            L_0x0105:
                r0 = move-exception
                r11 = r18
            L_0x0108:
                r16 = r11
                r11 = r0
                r0 = r8
                r8 = r10
                r10 = r16
            L_0x010f:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "showLocationDialog cancel exception: "
                r12.append(r13)
                java.lang.String r11 = r11.getMessage()
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
                r16 = r8
                r8 = r0
                r0 = r10
                r10 = r16
            L_0x012e:
                a14.C53973z1.C53974a.m60623a(r10, r7, r6, r7)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "launch cancel, state = "
                r10.append(r11)
                cl1.q1$b r9 = r9.f1604a
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                goto L_0x0081
            L_0x0149:
                cl1.q1 r0 = r8.f1617h
                r2 = 0
                r0.f1603g = r2
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C0680q1.C0683c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0680q1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final Object mo644c3(C15601d<? super C13598b0> dVar) {
        Log.m105924i("LiveToastManagerSlice", "runState isStateDoing: " + this.f1603g);
        if (this.f1603g) {
            return C13598b0.f38549a;
        }
        Object f = C53930o0.m60559f(new C0683c(this, (C15601d<? super C0683c>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }
}
