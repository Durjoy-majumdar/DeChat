package p247u3;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {212}, mo125471m = "invokeSuspend")
/* renamed from: u3.r0 */
public final class C65159r0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187580d;

    /* renamed from: e */
    public final /* synthetic */ C65125q0 f187581e;

    @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: u3.r0$a */
    public static final class C65160a extends C91594j implements C32227p<C65056f2, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C65159r0 f187582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65160a(C65159r0 r0Var, C15601d dVar) {
            super(2, dVar);
            this.f187582d = r0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65160a(this.f187582d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65160a) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f187582d.f187581e.f187468o.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u3.r0$b */
    public static final class C65161b implements C45252f<C65056f2> {

        /* renamed from: d */
        public final /* synthetic */ C45252f f187583d;

        /* renamed from: e */
        public final /* synthetic */ C65159r0 f187584e;

        /* renamed from: u3.r0$b$a */
        public static final class C65162a implements C45253g<C65056f2> {

            /* renamed from: d */
            public final /* synthetic */ C45253g f187585d;

            /* renamed from: e */
            public final /* synthetic */ C65161b f187586e;

            @C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {136}, mo125471m = "emit")
            /* renamed from: u3.r0$b$a$a */
            public static final class C65163a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f187587d;

                /* renamed from: e */
                public int f187588e;

                /* renamed from: f */
                public final /* synthetic */ C65162a f187589f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65163a(C65162a aVar, C15601d dVar) {
                    super(dVar);
                    this.f187589f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f187587d = obj;
                    this.f187588e |= Integer.MIN_VALUE;
                    return this.f187589f.emit((Object) null, this);
                }
            }

            public C65162a(C45253g gVar, C65161b bVar) {
                this.f187585d = gVar;
                this.f187586e = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p247u3.C65159r0.C65161b.C65162a.C65163a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    u3.r0$b$a$a r0 = (p247u3.C65159r0.C65161b.C65162a.C65163a) r0
                    int r1 = r0.f187588e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f187588e = r1
                    goto L_0x0018
                L_0x0013:
                    u3.r0$b$a$a r0 = new u3.r0$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f187587d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f187588e
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x0064
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    kotlin.ResultKt.throwOnFailure(r8)
                    d14.g r8 = r6.f187585d
                    r2 = r7
                    u3.f2 r2 = (p247u3.C65056f2) r2
                    int r4 = r2.f187252a
                    int r4 = r4 * -1
                    u3.r0$b r5 = r6.f187586e
                    u3.r0 r5 = r5.f187584e
                    u3.q0 r5 = r5.f187581e
                    u3.l1 r5 = r5.f187463j
                    int r5 = r5.f187303f
                    if (r4 > r5) goto L_0x0050
                    int r2 = r2.f187253b
                    int r2 = r2 * -1
                    if (r2 <= r5) goto L_0x004e
                    goto L_0x0050
                L_0x004e:
                    r2 = 0
                    goto L_0x0051
                L_0x0050:
                    r2 = 1
                L_0x0051:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0067
                    r0.f187588e = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0064
                    return r1
                L_0x0064:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                    goto L_0x0069
                L_0x0067:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                L_0x0069:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p247u3.C65159r0.C65161b.C65162a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        public C65161b(C45252f fVar, C65159r0 r0Var) {
            this.f187583d = fVar;
            this.f187584e = r0Var;
        }

        /* renamed from: a */
        public Object mo31880a(C45253g gVar, C15601d dVar) {
            Object a = this.f187583d.mo31880a(new C65162a(gVar, this), dVar);
            return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65159r0(C65125q0 q0Var, C15601d dVar) {
        super(2, dVar);
        this.f187581e = q0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65159r0(this.f187581e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65159r0) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187580d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65161b bVar = new C65161b(this.f187581e.f187454a, this);
            C65160a aVar2 = new C65160a(this, (C15601d) null);
            this.f187580d = 1;
            if (C58042h.m67194c(bVar, aVar2, this) == aVar) {
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
