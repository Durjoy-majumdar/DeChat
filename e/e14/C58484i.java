package e14;

import a14.C0000n0;
import a14.C53876e0;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54624g;
import c14.C54629k;
import c14.C54646u;
import c14.C54647v;
import c14.C54649x;
import d14.C45252f;
import d14.C45253g;
import fy3.C32226l;
import fy3.C32227p;
import k14.C60950g;
import k14.C60951h;
import k14.C60953i;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: e14.i */
public final class C58484i<T> extends C58482g<T> {

    /* renamed from: g */
    public final C45252f<C45252f<T>> f167476g;

    /* renamed from: h */
    public final int f167477h;

    /* renamed from: e14.i$a */
    public static final class C58485a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C53973z1 f167478d;

        /* renamed from: e */
        public final /* synthetic */ C60950g f167479e;

        /* renamed from: f */
        public final /* synthetic */ C54647v<T> f167480f;

        /* renamed from: g */
        public final /* synthetic */ C58515z<T> f167481g;

        @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", mo125469f = "Merge.kt", mo125470l = {69}, mo125471m = "invokeSuspend")
        /* renamed from: e14.i$a$a */
        public static final class C58486a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f167482d;

            /* renamed from: e */
            public final /* synthetic */ C45252f<T> f167483e;

            /* renamed from: f */
            public final /* synthetic */ C58515z<T> f167484f;

            /* renamed from: g */
            public final /* synthetic */ C60950g f167485g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58486a(C45252f<? extends T> fVar, C58515z<T> zVar, C60950g gVar, C15601d<? super C58486a> dVar) {
                super(2, dVar);
                this.f167483e = fVar;
                this.f167484f = zVar;
                this.f167485g = gVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C58486a(this.f167483e, this.f167484f, this.f167485g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C58486a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f167482d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<T> fVar = this.f167483e;
                    C58515z<T> zVar = this.f167484f;
                    this.f167482d = 1;
                    if (fVar.mo31880a(zVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        this.f167485g.release();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f167485g.release();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", mo125469f = "Merge.kt", mo125470l = {66}, mo125471m = "emit")
        /* renamed from: e14.i$a$b */
        public static final class C58487b extends C66704d {

            /* renamed from: d */
            public Object f167486d;

            /* renamed from: e */
            public Object f167487e;

            /* renamed from: f */
            public /* synthetic */ Object f167488f;

            /* renamed from: g */
            public final /* synthetic */ C58485a<T> f167489g;

            /* renamed from: h */
            public int f167490h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58487b(C58485a<? super T> aVar, C15601d<? super C58487b> dVar) {
                super(dVar);
                this.f167489g = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f167488f = obj;
                this.f167490h |= Integer.MIN_VALUE;
                return this.f167489g.emit((C45252f) null, this);
            }
        }

        public C58485a(C53973z1 z1Var, C60950g gVar, C54647v<? super T> vVar, C58515z<T> zVar) {
            this.f167478d = z1Var;
            this.f167479e = gVar;
            this.f167480f = vVar;
            this.f167481g = zVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(d14.C45252f<? extends T> r8, wx3.C15601d<? super rx3.C13598b0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof e14.C58484i.C58485a.C58487b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                e14.i$a$b r0 = (e14.C58484i.C58485a.C58487b) r0
                int r1 = r0.f167490h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f167490h = r1
                goto L_0x0018
            L_0x0013:
                e14.i$a$b r0 = new e14.i$a$b
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f167488f
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f167490h
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r8 = r0.f167487e
                d14.f r8 = (d14.C45252f) r8
                java.lang.Object r0 = r0.f167486d
                e14.i$a r0 = (e14.C58484i.C58485a) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x005a
            L_0x002f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r9)
                a14.z1 r9 = r7.f167478d
                if (r9 == 0) goto L_0x004a
                boolean r2 = r9.mo74466a()
                if (r2 == 0) goto L_0x0045
                goto L_0x004a
            L_0x0045:
                java.util.concurrent.CancellationException r8 = r9.mo74526Z()
                throw r8
            L_0x004a:
                k14.g r9 = r7.f167479e
                r0.f167486d = r7
                r0.f167487e = r8
                r0.f167490h = r3
                java.lang.Object r9 = r9.mo85914a(r0)
                if (r9 != r1) goto L_0x0059
                return r1
            L_0x0059:
                r0 = r7
            L_0x005a:
                c14.v<T> r1 = r0.f167480f
                r2 = 0
                r3 = 0
                e14.i$a$a r4 = new e14.i$a$a
                e14.z<T> r9 = r0.f167481g
                k14.g r0 = r0.f167479e
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: e14.C58484i.C58485a.emit(d14.f, wx3.d):java.lang.Object");
        }
    }

    public C58484i(C45252f<? extends C45252f<? extends T>> fVar, int i, C66212f fVar2, int i2, C54624g gVar) {
        super(fVar2, i2, gVar);
        this.f167476g = fVar;
        this.f167477h = i;
    }

    /* renamed from: f */
    public String mo82816f() {
        return "concurrency=" + this.f167477h;
    }

    /* renamed from: g */
    public Object mo82812g(C54647v<? super T> vVar, C15601d<? super C13598b0> dVar) {
        int i = this.f167477h;
        int i2 = C60953i.f173597a;
        C60951h hVar = new C60951h(i, 0);
        C58515z zVar = new C58515z(vVar);
        C66212f context = dVar.getContext();
        int i3 = C53973z1.f151221b0;
        Object a = this.f167476g.mo31880a(new C58485a((C53973z1) context.get(C53973z1.C0004b.f3d), hVar, vVar, zVar), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: h */
    public C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58484i(this.f167476g, this.f167477h, fVar, i, gVar);
    }

    /* renamed from: j */
    public C54649x<T> mo82818j(C0000n0 n0Var) {
        C66212f fVar = this.f167473d;
        int i = this.f167474e;
        C58481f fVar2 = new C58481f(this, (C15601d<? super C58481f>) null);
        C54624g gVar = C54624g.SUSPEND;
        C53934p0 p0Var = C53934p0.DEFAULT;
        C54646u uVar = new C54646u(C53876e0.m60398b(n0Var, fVar), C54629k.m61479a(i, gVar, (C32226l) null, 4, (Object) null));
        uVar.mo74473y0(p0Var, uVar, fVar2);
        return uVar;
    }
}
