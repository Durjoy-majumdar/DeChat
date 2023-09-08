package p152f0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import kotlin.ResultKt;
import p1165z.C112525j;
import p1165z.C112527l;
import p1165z.C112529n;
import p1165z.C112530o;
import p1165z.C112531p;
import p1166z0.C112539e;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p190l1.C109119z;
import p759y.C112205c1;
import p759y.C112209d0;
import p759y.C112219f1;
import p759y.C112255l0;
import p759y.C112260m0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", mo125469f = "TextFieldPressGestureFilter.kt", mo125470l = {55}, mo125471m = "invokeSuspend")
/* renamed from: f0.f2 */
public final class C107337f2 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f321133d;

    /* renamed from: e */
    public /* synthetic */ Object f321134e;

    /* renamed from: f */
    public final /* synthetic */ C0000n0 f321135f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<C112530o> f321136g;

    /* renamed from: h */
    public final /* synthetic */ C112527l f321137h;

    /* renamed from: i */
    public final /* synthetic */ C60667k2<C32226l<C112539e, C13598b0>> f321138i;

    @C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", mo125469f = "TextFieldPressGestureFilter.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
    /* renamed from: f0.f2$a */
    public static final class C107338a extends C91594j implements C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f321139d;

        /* renamed from: e */
        public /* synthetic */ Object f321140e;

        /* renamed from: f */
        public /* synthetic */ long f321141f;

        /* renamed from: g */
        public final /* synthetic */ C0000n0 f321142g;

        /* renamed from: h */
        public final /* synthetic */ C60690y0<C112530o> f321143h;

        /* renamed from: i */
        public final /* synthetic */ C112527l f321144i;

        @C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", mo125469f = "TextFieldPressGestureFilter.kt", mo125470l = {61, 65}, mo125471m = "invokeSuspend")
        /* renamed from: f0.f2$a$a */
        public static final class C107339a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f321145d;

            /* renamed from: e */
            public int f321146e;

            /* renamed from: f */
            public final /* synthetic */ C60690y0<C112530o> f321147f;

            /* renamed from: g */
            public final /* synthetic */ long f321148g;

            /* renamed from: h */
            public final /* synthetic */ C112527l f321149h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107339a(C60690y0<C112530o> y0Var, long j, C112527l lVar, C15601d<? super C107339a> dVar) {
                super(2, dVar);
                this.f321147f = y0Var;
                this.f321148g = j;
                this.f321149h = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C107339a(this.f321147f, this.f321148g, this.f321149h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C107339a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r7.f321146e
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r4) goto L_0x001d
                    if (r1 != r3) goto L_0x0015
                    java.lang.Object r0 = r7.f321145d
                    z.o r0 = (p1165z.C112530o) r0
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x0064
                L_0x0015:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L_0x001d:
                    java.lang.Object r1 = r7.f321145d
                    j0.y0 r1 = (p175j0.C60690y0) r1
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x0049
                L_0x0025:
                    kotlin.ResultKt.throwOnFailure(r8)
                    j0.y0<z.o> r8 = r7.f321147f
                    java.lang.Object r8 = r8.getValue()
                    z.o r8 = (p1165z.C112530o) r8
                    if (r8 == 0) goto L_0x004d
                    z.l r1 = r7.f321149h
                    j0.y0<z.o> r5 = r7.f321147f
                    z.n r6 = new z.n
                    r6.<init>(r8)
                    if (r1 == 0) goto L_0x004a
                    r7.f321145d = r5
                    r7.f321146e = r4
                    java.lang.Object r8 = r1.mo164252a(r6, r7)
                    if (r8 != r0) goto L_0x0048
                    return r0
                L_0x0048:
                    r1 = r5
                L_0x0049:
                    r5 = r1
                L_0x004a:
                    r5.setValue(r2)
                L_0x004d:
                    z.o r8 = new z.o
                    long r4 = r7.f321148g
                    r8.<init>(r4, r2)
                    z.l r1 = r7.f321149h
                    if (r1 == 0) goto L_0x0065
                    r7.f321145d = r8
                    r7.f321146e = r3
                    java.lang.Object r1 = r1.mo164252a(r8, r7)
                    if (r1 != r0) goto L_0x0063
                    return r0
                L_0x0063:
                    r0 = r8
                L_0x0064:
                    r8 = r0
                L_0x0065:
                    j0.y0<z.o> r0 = r7.f321147f
                    r0.setValue(r8)
                    rx3.b0 r8 = rx3.C13598b0.f38549a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p152f0.C107337f2.C107338a.C107339a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", mo125469f = "TextFieldPressGestureFilter.kt", mo125470l = {77}, mo125471m = "invokeSuspend")
        /* renamed from: f0.f2$a$b */
        public static final class C107340b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f321150d;

            /* renamed from: e */
            public int f321151e;

            /* renamed from: f */
            public final /* synthetic */ C60690y0<C112530o> f321152f;

            /* renamed from: g */
            public final /* synthetic */ boolean f321153g;

            /* renamed from: h */
            public final /* synthetic */ C112527l f321154h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107340b(C60690y0<C112530o> y0Var, boolean z, C112527l lVar, C15601d<? super C107340b> dVar) {
                super(2, dVar);
                this.f321152f = y0Var;
                this.f321153g = z;
                this.f321154h = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C107340b(this.f321152f, this.f321153g, this.f321154h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C107340b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C60690y0<C112530o> y0Var;
                C60690y0<C112530o> y0Var2;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f321151e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C112530o value = this.f321152f.getValue();
                    if (value != null) {
                        boolean z = this.f321153g;
                        C112527l lVar = this.f321154h;
                        y0Var = this.f321152f;
                        C112525j pVar = z ? new C112531p(value) : new C112529n(value);
                        if (lVar != null) {
                            this.f321150d = y0Var;
                            this.f321151e = 1;
                            if (lVar.mo164252a(pVar, this) == aVar) {
                                return aVar;
                            }
                            y0Var2 = y0Var;
                        }
                        y0Var.setValue(null);
                    }
                    return C13598b0.f38549a;
                } else if (i == 1) {
                    y0Var2 = (C60690y0) this.f321150d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y0Var = y0Var2;
                y0Var.setValue(null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107338a(C0000n0 n0Var, C60690y0<C112530o> y0Var, C112527l lVar, C15601d<? super C107338a> dVar) {
            super(3, dVar);
            this.f321142g = n0Var;
            this.f321143h = y0Var;
            this.f321144i = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((C112539e) obj2).f336959a;
            C107338a aVar = new C107338a(this.f321142g, this.f321143h, this.f321144i, (C15601d) obj3);
            aVar.f321140e = (C112255l0) obj;
            aVar.f321141f = j;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f321139d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f321141f;
                C53895h.m60466d(this.f321142g, (C66212f) null, (C53934p0) null, new C107339a(this.f321143h, j, this.f321144i, (C15601d<? super C107339a>) null), 3, (Object) null);
                this.f321139d = 1;
                obj = ((C112255l0) this.f321140e).mo164036o(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53895h.m60466d(this.f321142g, (C66212f) null, (C53934p0) null, new C107340b(this.f321143h, ((Boolean) obj).booleanValue(), this.f321144i, (C15601d<? super C107340b>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.f2$b */
    public static final class C107341b extends C87413o implements C32226l<C112539e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<C32226l<C112539e, C13598b0>> f321155d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107341b(C60667k2<? extends C32226l<? super C112539e, C13598b0>> k2Var) {
            super(1);
            this.f321155d = k2Var;
        }

        public Object invoke(Object obj) {
            this.f321155d.getValue().invoke(new C112539e(((C112539e) obj).f336959a));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107337f2(C0000n0 n0Var, C60690y0<C112530o> y0Var, C112527l lVar, C60667k2<? extends C32226l<? super C112539e, C13598b0>> k2Var, C15601d<? super C107337f2> dVar) {
        super(2, dVar);
        this.f321135f = n0Var;
        this.f321136g = y0Var;
        this.f321137h = lVar;
        this.f321138i = k2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C107337f2 f2Var = new C107337f2(this.f321135f, this.f321136g, this.f321137h, this.f321138i, dVar);
        f2Var.f321134e = obj;
        return f2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107337f2) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f321133d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C109119z zVar = (C109119z) this.f321134e;
            C107338a aVar2 = new C107338a(this.f321135f, this.f321136g, this.f321137h, (C15601d<? super C107338a>) null);
            C107341b bVar = new C107341b(this.f321138i);
            this.f321133d = 1;
            C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> qVar = C112205c1.f335940a;
            Object b = C112209d0.m153116b(zVar, new C112219f1(new C112260m0(zVar), aVar2, bVar, (C15601d<? super C112219f1>) null), this);
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            if (b == aVar) {
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
