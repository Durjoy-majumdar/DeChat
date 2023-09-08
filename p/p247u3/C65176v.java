package p247u3;

import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", mo125469f = "FlowExt.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
/* renamed from: u3.v */
public final class C65176v extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187642d;

    /* renamed from: e */
    public int f187643e;

    /* renamed from: f */
    public final /* synthetic */ C45252f f187644f;

    /* renamed from: g */
    public final /* synthetic */ C32228q f187645g;

    /* renamed from: u3.v$a */
    public static final class C65177a implements C45253g<Object> {

        /* renamed from: d */
        public final /* synthetic */ C65176v f187646d;

        /* renamed from: e */
        public final /* synthetic */ C45253g f187647e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f187648f;

        @C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", mo125469f = "FlowExt.kt", mo125470l = {137, 140}, mo125471m = "emit")
        /* renamed from: u3.v$a$a */
        public static final class C65178a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187649d;

            /* renamed from: e */
            public int f187650e;

            /* renamed from: f */
            public final /* synthetic */ C65177a f187651f;

            /* renamed from: g */
            public Object f187652g;

            /* renamed from: h */
            public Object f187653h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65178a(C65177a aVar, C15601d dVar) {
                super(dVar);
                this.f187651f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187649d = obj;
                this.f187650e |= Integer.MIN_VALUE;
                return this.f187651f.emit((Object) null, this);
            }
        }

        public C65177a(C65176v vVar, C45253g gVar, C8479f0 f0Var) {
            this.f187646d = vVar;
            this.f187647e = gVar;
            this.f187648f = f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r8, wx3.C15601d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p247u3.C65176v.C65177a.C65178a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                u3.v$a$a r0 = (p247u3.C65176v.C65177a.C65178a) r0
                int r1 = r0.f187650e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187650e = r1
                goto L_0x0018
            L_0x0013:
                u3.v$a$a r0 = new u3.v$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f187649d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187650e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0041
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0075
            L_0x002a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0032:
                java.lang.Object r8 = r0.f187653h
                gy3.f0 r8 = (gy3.C8479f0) r8
                java.lang.Object r2 = r0.f187652g
                u3.v$a r2 = (p247u3.C65176v.C65177a) r2
                kotlin.ResultKt.throwOnFailure(r9)
                r6 = r9
                r9 = r8
                r8 = r6
                goto L_0x005f
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r9)
                gy3.f0 r9 = r7.f187648f
                T r2 = r9.f27484d
                java.lang.Object r5 = p247u3.C65197y.f187697a
                if (r2 != r5) goto L_0x004e
            L_0x004c:
                r2 = r7
                goto L_0x005f
            L_0x004e:
                u3.v r5 = r7.f187646d
                fy3.q r5 = r5.f187645g
                r0.f187652g = r7
                r0.f187653h = r9
                r0.f187650e = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L_0x004c
                return r1
            L_0x005f:
                r9.f27484d = r8
                d14.g r8 = r2.f187647e
                gy3.f0 r9 = r2.f187648f
                T r9 = r9.f27484d
                r2 = 0
                r0.f187652g = r2
                r0.f187653h = r2
                r0.f187650e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L_0x0075
                return r1
            L_0x0075:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65176v.C65177a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65176v(C45252f fVar, C32228q qVar, C15601d dVar) {
        super(2, dVar);
        this.f187644f = fVar;
        this.f187645g = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65176v vVar = new C65176v(this.f187644f, this.f187645g, dVar);
        vVar.f187642d = obj;
        return vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65176v) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187643e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = C65197y.f187697a;
            C45252f fVar = this.f187644f;
            C65177a aVar2 = new C65177a(this, (C45253g) this.f187642d, f0Var);
            this.f187643e = 1;
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
