package e14;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import c14.C54624g;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: e14.m */
public final class C58491m<T, R> extends C58489k<T, R> {

    /* renamed from: h */
    public final C32228q<C45253g<? super R>, T, C15601d<? super C13598b0>, Object> f167495h;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo125469f = "Merge.kt", mo125470l = {27}, mo125471m = "invokeSuspend")
    /* renamed from: e14.m$a */
    public static final class C58492a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f167496d;

        /* renamed from: e */
        public /* synthetic */ Object f167497e;

        /* renamed from: f */
        public final /* synthetic */ C58491m<T, R> f167498f;

        /* renamed from: g */
        public final /* synthetic */ C45253g<R> f167499g;

        /* renamed from: e14.m$a$a */
        public static final class C58493a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C53973z1> f167500d;

            /* renamed from: e */
            public final /* synthetic */ C0000n0 f167501e;

            /* renamed from: f */
            public final /* synthetic */ C58491m<T, R> f167502f;

            /* renamed from: g */
            public final /* synthetic */ C45253g<R> f167503g;

            @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", mo125469f = "Merge.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
            /* renamed from: e14.m$a$a$a */
            public static final class C58494a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f167504d;

                /* renamed from: e */
                public final /* synthetic */ C58491m<T, R> f167505e;

                /* renamed from: f */
                public final /* synthetic */ C45253g<R> f167506f;

                /* renamed from: g */
                public final /* synthetic */ T f167507g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C58494a(C58491m<T, R> mVar, C45253g<? super R> gVar, T t, C15601d<? super C58494a> dVar) {
                    super(2, dVar);
                    this.f167505e = mVar;
                    this.f167506f = gVar;
                    this.f167507g = t;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C58494a(this.f167505e, this.f167506f, this.f167507g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C58494a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f167504d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C32228q<C45253g<? super R>, T, C15601d<? super C13598b0>, Object> qVar = this.f167505e.f167495h;
                        C45253g<R> gVar = this.f167506f;
                        T t = this.f167507g;
                        this.f167504d = 1;
                        if (qVar.invoke(gVar, t, this) == aVar) {
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

            @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", mo125469f = "Merge.kt", mo125470l = {30}, mo125471m = "emit")
            /* renamed from: e14.m$a$a$b */
            public static final class C58495b extends C66704d {

                /* renamed from: d */
                public Object f167508d;

                /* renamed from: e */
                public Object f167509e;

                /* renamed from: f */
                public Object f167510f;

                /* renamed from: g */
                public /* synthetic */ Object f167511g;

                /* renamed from: h */
                public final /* synthetic */ C58493a<T> f167512h;

                /* renamed from: i */
                public int f167513i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C58495b(C58493a<? super T> aVar, C15601d<? super C58495b> dVar) {
                    super(dVar);
                    this.f167512h = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f167511g = obj;
                    this.f167513i |= Integer.MIN_VALUE;
                    return this.f167512h.emit(null, this);
                }
            }

            public C58493a(C8479f0<C53973z1> f0Var, C0000n0 n0Var, C58491m<T, R> mVar, C45253g<? super R> gVar) {
                this.f167500d = f0Var;
                this.f167501e = n0Var;
                this.f167502f = mVar;
                this.f167503g = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r8, wx3.C15601d<? super rx3.C13598b0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof e14.C58491m.C58492a.C58493a.C58495b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    e14.m$a$a$b r0 = (e14.C58491m.C58492a.C58493a.C58495b) r0
                    int r1 = r0.f167513i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f167513i = r1
                    goto L_0x0018
                L_0x0013:
                    e14.m$a$a$b r0 = new e14.m$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f167511g
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f167513i
                    r3 = 1
                    if (r2 == 0) goto L_0x0039
                    if (r2 != r3) goto L_0x0031
                    java.lang.Object r8 = r0.f167510f
                    a14.z1 r8 = (a14.C53973z1) r8
                    java.lang.Object r8 = r0.f167509e
                    java.lang.Object r0 = r0.f167508d
                    e14.m$a$a r0 = (e14.C58491m.C58492a.C58493a) r0
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x005c
                L_0x0031:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0039:
                    kotlin.ResultKt.throwOnFailure(r9)
                    gy3.f0<a14.z1> r9 = r7.f167500d
                    T r9 = r9.f27484d
                    a14.z1 r9 = (a14.C53973z1) r9
                    if (r9 == 0) goto L_0x005b
                    e14.o r2 = new e14.o
                    r2.<init>()
                    r9.mo74528b(r2)
                    r0.f167508d = r7
                    r0.f167509e = r8
                    r0.f167510f = r9
                    r0.f167513i = r3
                    java.lang.Object r9 = r9.mo74521O(r0)
                    if (r9 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    r0 = r7
                L_0x005c:
                    gy3.f0<a14.z1> r9 = r0.f167500d
                    a14.n0 r1 = r0.f167501e
                    r2 = 0
                    a14.p0 r3 = a14.C53934p0.UNDISPATCHED
                    e14.m$a$a$a r4 = new e14.m$a$a$a
                    e14.m<T, R> r5 = r0.f167502f
                    d14.g<R> r0 = r0.f167503g
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    a14.z1 r8 = a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
                    r9.f27484d = r8
                    rx3.b0 r8 = rx3.C13598b0.f38549a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: e14.C58491m.C58492a.C58493a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58492a(C58491m<T, R> mVar, C45253g<? super R> gVar, C15601d<? super C58492a> dVar) {
            super(2, dVar);
            this.f167498f = mVar;
            this.f167499g = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58492a aVar = new C58492a(this.f167498f, this.f167499g, dVar);
            aVar.f167497e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58492a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f167496d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0 f0Var = new C8479f0();
                C58491m<T, R> mVar = this.f167498f;
                C45252f<S> fVar = mVar.f167494g;
                C58493a aVar2 = new C58493a(f0Var, (C0000n0) this.f167497e, mVar, this.f167499g);
                this.f167496d = 1;
                if (fVar.mo31880a(aVar2, this) == aVar) {
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

    public C58491m(C32228q<? super C45253g<? super R>, ? super T, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C45252f<? extends T> fVar, C66212f fVar2, int i, C54624g gVar) {
        super(fVar, fVar2, i, gVar);
        this.f167495h = qVar;
    }

    /* renamed from: h */
    public C58482g<R> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58491m(this.f167495h, this.f167494g, fVar, i, gVar);
    }

    /* renamed from: k */
    public Object mo83428k(C45253g<? super R> gVar, C15601d<? super C13598b0> dVar) {
        Object f = C53930o0.m60559f(new C58492a(this, gVar, (C15601d<? super C58492a>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }
}
