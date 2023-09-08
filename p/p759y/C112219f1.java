package p759y;

import a14.C0000n0;
import a14.C53930o0;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import k14.C60942d;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p190l1.C109085c;
import p190l1.C109111s;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", mo125469f = "TapGestureDetector.kt", mo125470l = {204}, mo125471m = "invokeSuspend")
/* renamed from: y.f1 */
public final class C112219f1 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335984d;

    /* renamed from: e */
    public /* synthetic */ Object f335985e;

    /* renamed from: f */
    public final /* synthetic */ C112260m0 f335986f;

    /* renamed from: g */
    public final /* synthetic */ C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> f335987g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<C112539e, C13598b0> f335988h;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", mo125469f = "TapGestureDetector.kt", mo125470l = {206}, mo125471m = "invokeSuspend")
    /* renamed from: y.f1$a */
    public static final class C112220a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335989d;

        /* renamed from: e */
        public /* synthetic */ Object f335990e;

        /* renamed from: f */
        public final /* synthetic */ C112260m0 f335991f;

        /* renamed from: g */
        public final /* synthetic */ C109119z f335992g;

        /* renamed from: h */
        public final /* synthetic */ C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> f335993h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C112539e, C13598b0> f335994i;

        @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", mo125469f = "TapGestureDetector.kt", mo125470l = {208, 214}, mo125471m = "invokeSuspend")
        /* renamed from: y.f1$a$a */
        public static final class C112221a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

            /* renamed from: e */
            public int f335995e;

            /* renamed from: f */
            public /* synthetic */ Object f335996f;

            /* renamed from: g */
            public final /* synthetic */ C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> f335997g;

            /* renamed from: h */
            public final /* synthetic */ C0000n0 f335998h;

            /* renamed from: i */
            public final /* synthetic */ C112260m0 f335999i;

            /* renamed from: j */
            public final /* synthetic */ C32226l<C112539e, C13598b0> f336000j;

            @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", mo125469f = "TapGestureDetector.kt", mo125470l = {211}, mo125471m = "invokeSuspend")
            /* renamed from: y.f1$a$a$a */
            public static final class C112222a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f336001d;

                /* renamed from: e */
                public final /* synthetic */ C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> f336002e;

                /* renamed from: f */
                public final /* synthetic */ C112260m0 f336003f;

                /* renamed from: g */
                public final /* synthetic */ C109111s f336004g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C112222a(C32228q<? super C112255l0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C112260m0 m0Var, C109111s sVar, C15601d<? super C112222a> dVar) {
                    super(2, dVar);
                    this.f336002e = qVar;
                    this.f336003f = m0Var;
                    this.f336004g = sVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C112222a(this.f336002e, this.f336003f, this.f336004g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C112222a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f336001d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> qVar = this.f336002e;
                        C112260m0 m0Var = this.f336003f;
                        C112539e eVar = new C112539e(this.f336004g.f326719c);
                        this.f336001d = 1;
                        if (qVar.invoke(m0Var, eVar, this) == aVar) {
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

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112221a(C32228q<? super C112255l0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C0000n0 n0Var, C112260m0 m0Var, C32226l<? super C112539e, C13598b0> lVar, C15601d<? super C112221a> dVar) {
                super(2, dVar);
                this.f335997g = qVar;
                this.f335998h = n0Var;
                this.f335999i = m0Var;
                this.f336000j = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C112221a aVar = new C112221a(this.f335997g, this.f335998h, this.f335999i, this.f336000j, dVar);
                aVar.f335996f = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C112221a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: l1.c} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r13.f335995e
                    r2 = 0
                    r3 = 1
                    r4 = 2
                    if (r1 == 0) goto L_0x0021
                    if (r1 == r3) goto L_0x0019
                    if (r1 != r4) goto L_0x0011
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L_0x005c
                L_0x0011:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L_0x0019:
                    java.lang.Object r1 = r13.f335996f
                    l1.c r1 = (p190l1.C109085c) r1
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L_0x0036
                L_0x0021:
                    kotlin.ResultKt.throwOnFailure(r14)
                    java.lang.Object r14 = r13.f335996f
                    r1 = r14
                    l1.c r1 = (p190l1.C109085c) r1
                    r13.f335996f = r1
                    r13.f335995e = r3
                    l1.n r14 = p190l1.C109108n.Main
                    java.lang.Object r14 = p759y.C112205c1.m153110b(r1, r14, r3, r13)
                    if (r14 != r0) goto L_0x0036
                    return r0
                L_0x0036:
                    l1.s r14 = (p190l1.C109111s) r14
                    r14.mo160354a()
                    fy3.q<y.l0, z0.e, wx3.d<? super rx3.b0>, java.lang.Object> r5 = r13.f335997g
                    fy3.q<y.l0, z0.e, wx3.d<? super rx3.b0>, java.lang.Object> r6 = p759y.C112205c1.f335940a
                    if (r5 == r6) goto L_0x0051
                    a14.n0 r7 = r13.f335998h
                    r8 = 0
                    r9 = 0
                    y.f1$a$a$a r10 = new y.f1$a$a$a
                    y.m0 r6 = r13.f335999i
                    r10.<init>(r5, r6, r14, r2)
                    r11 = 3
                    r12 = 0
                    a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
                L_0x0051:
                    r13.f335996f = r2
                    r13.f335995e = r4
                    java.lang.Object r14 = p759y.C112205c1.m153111c(r1, r13)
                    if (r14 != r0) goto L_0x005c
                    return r0
                L_0x005c:
                    l1.s r14 = (p190l1.C109111s) r14
                    if (r14 != 0) goto L_0x006a
                    y.m0 r14 = r13.f335999i
                    r14.f336143f = r3
                    k14.c r14 = r14.f336144g
                    k14.C99088c.C99089a.m129046a(r14, r2, r3, r2)
                    goto L_0x0084
                L_0x006a:
                    r14.mo160354a()
                    y.m0 r0 = r13.f335999i
                    r0.f336142e = r3
                    k14.c r0 = r0.f336144g
                    k14.C99088c.C99089a.m129046a(r0, r2, r3, r2)
                    fy3.l<z0.e, rx3.b0> r0 = r13.f336000j
                    if (r0 == 0) goto L_0x0084
                    long r1 = r14.f326719c
                    z0.e r14 = new z0.e
                    r14.<init>(r1)
                    r0.invoke(r14)
                L_0x0084:
                    rx3.b0 r14 = rx3.C13598b0.f38549a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: p759y.C112219f1.C112220a.C112221a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112220a(C112260m0 m0Var, C109119z zVar, C32228q<? super C112255l0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C32226l<? super C112539e, C13598b0> lVar, C15601d<? super C112220a> dVar) {
            super(2, dVar);
            this.f335991f = m0Var;
            this.f335992g = zVar;
            this.f335993h = qVar;
            this.f335994i = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112220a aVar = new C112220a(this.f335991f, this.f335992g, this.f335993h, this.f335994i, dVar);
            aVar.f335990e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112220a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335989d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C112260m0 m0Var = this.f335991f;
                ((C60942d) m0Var.f336144g).mo85910d((Object) null);
                m0Var.f336142e = false;
                m0Var.f336143f = false;
                C109119z zVar = this.f335992g;
                C112221a aVar2 = new C112221a(this.f335993h, (C0000n0) this.f335990e, this.f335991f, this.f335994i, (C15601d<? super C112221a>) null);
                this.f335989d = 1;
                if (zVar.mo160337A(aVar2, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112219f1(C112260m0 m0Var, C32228q<? super C112255l0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C32226l<? super C112539e, C13598b0> lVar, C15601d<? super C112219f1> dVar) {
        super(2, dVar);
        this.f335986f = m0Var;
        this.f335987g = qVar;
        this.f335988h = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112219f1 f1Var = new C112219f1(this.f335986f, this.f335987g, this.f335988h, dVar);
        f1Var.f335985e = obj;
        return f1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112219f1) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335984d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112220a aVar2 = new C112220a(this.f335986f, (C109119z) this.f335985e, this.f335987g, this.f335988h, (C15601d<? super C112220a>) null);
            this.f335984d = 1;
            if (C53930o0.m60559f(aVar2, this) == aVar) {
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
