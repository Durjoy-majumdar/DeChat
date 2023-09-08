package p865v3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54636p;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C45252f;
import d14.C45253g;
import d14.C58083t;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import kotlin.ResultKt;
import p865v3.C65512c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: v3.i */
public final class C65537i<T> {

    /* renamed from: a */
    public final C53973z1 f188562a;

    /* renamed from: b */
    public final C0000n0 f188563b;

    /* renamed from: c */
    public final C45252f<T> f188564c;

    /* renamed from: d */
    public final C32227p<C65512c.C65520c.C65522b<T>, C15601d<? super C13598b0>, Object> f188565d;

    @C91590f(mo125468c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1", mo125469f = "SharedFlowProducer.kt", mo125470l = {97}, mo125471m = "invokeSuspend")
    /* renamed from: v3.i$a */
    public static final class C65538a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f188566d;

        /* renamed from: e */
        public final /* synthetic */ C65537i f188567e;

        @C91590f(mo125468c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1", mo125469f = "SharedFlowProducer.kt", mo125470l = {50}, mo125471m = "invokeSuspend")
        /* renamed from: v3.i$a$a */
        public static final class C65539a extends C91594j implements C32228q<C45253g<? super T>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f188568d;

            /* renamed from: e */
            public int f188569e;

            /* renamed from: f */
            public final /* synthetic */ C65538a f188570f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65539a(C65538a aVar, C15601d dVar) {
                super(3, dVar);
                this.f188570f = aVar;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Throwable th = (Throwable) obj2;
                C15601d dVar = (C15601d) obj3;
                C87412m.m108594g((C45253g) obj, "$this$create");
                C87412m.m108594g(th, LocaleUtil.ITALIAN);
                C87412m.m108594g(dVar, "continuation");
                C65539a aVar = new C65539a(this.f188570f, dVar);
                aVar.f188568d = th;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f188569e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C32227p<C65512c.C65520c.C65522b<T>, C15601d<? super C13598b0>, Object> pVar = this.f188570f.f188567e.f188565d;
                    C65512c.C65520c.C65522b.C65523a aVar2 = new C65512c.C65520c.C65522b.C65523a((Throwable) this.f188568d);
                    this.f188569e = 1;
                    if (pVar.invoke(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: v3.i$a$b */
        public static final class C65540b implements C45253g<T> {

            /* renamed from: d */
            public final /* synthetic */ C65538a f188571d;

            @C91590f(mo125468c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1", mo125469f = "SharedFlowProducer.kt", mo125470l = {135, 141}, mo125471m = "emit")
            /* renamed from: v3.i$a$b$a */
            public static final class C65541a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f188572d;

                /* renamed from: e */
                public int f188573e;

                /* renamed from: f */
                public final /* synthetic */ C65540b f188574f;

                /* renamed from: g */
                public Object f188575g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65541a(C65540b bVar, C15601d dVar) {
                    super(dVar);
                    this.f188574f = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f188572d = obj;
                    this.f188573e |= Integer.MIN_VALUE;
                    return this.f188574f.emit((Object) null, this);
                }
            }

            public C65540b(C65538a aVar) {
                this.f188571d = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, wx3.C15601d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p865v3.C65537i.C65538a.C65540b.C65541a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    v3.i$a$b$a r0 = (p865v3.C65537i.C65538a.C65540b.C65541a) r0
                    int r1 = r0.f188573e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f188573e = r1
                    goto L_0x0018
                L_0x0013:
                    v3.i$a$b$a r0 = new v3.i$a$b$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f188572d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f188573e
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x003b
                    if (r2 == r4) goto L_0x0033
                    if (r2 != r3) goto L_0x002b
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x0065
                L_0x002b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0033:
                    java.lang.Object r8 = r0.f188575g
                    a14.u r8 = (a14.C53952u) r8
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x005a
                L_0x003b:
                    kotlin.ResultKt.throwOnFailure(r9)
                    a14.v r9 = new a14.v
                    r9.<init>(r5)
                    v3.i$a r2 = r7.f188571d
                    v3.i r2 = r2.f188567e
                    fy3.p<v3.c$c$b<T>, wx3.d<? super rx3.b0>, java.lang.Object> r2 = r2.f188565d
                    v3.c$c$b$c r6 = new v3.c$c$b$c
                    r6.<init>(r8, r9)
                    r0.f188575g = r9
                    r0.f188573e = r4
                    java.lang.Object r8 = r2.invoke(r6, r0)
                    if (r8 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    r8 = r9
                L_0x005a:
                    r0.f188575g = r5
                    r0.f188573e = r3
                    java.lang.Object r8 = r8.mo74634A(r0)
                    if (r8 != r1) goto L_0x0065
                    return r1
                L_0x0065:
                    rx3.b0 r8 = rx3.C13598b0.f38549a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p865v3.C65537i.C65538a.C65540b.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65538a(C65537i iVar, C15601d dVar) {
            super(2, dVar);
            this.f188567e = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65538a(this.f188567e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65538a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188566d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58083t tVar = new C58083t(this.f188567e.f188564c, new C65539a(this, (C15601d) null));
                C65540b bVar = new C65540b(this);
                this.f188566d = 1;
                if (tVar.mo31880a(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C54636p unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C65537i(C0000n0 n0Var, C45252f<? extends T> fVar, C32227p<? super C65512c.C65520c.C65522b<T>, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(fVar, "src");
        C87412m.m108594g(pVar, "sendUpsteamMessage");
        this.f188563b = n0Var;
        this.f188564c = fVar;
        this.f188565d = pVar;
        this.f188562a = C53895h.m60466d(n0Var, (C66212f) null, C53934p0.LAZY, new C65538a(this, (C15601d) null), 1, (Object) null);
    }
}
