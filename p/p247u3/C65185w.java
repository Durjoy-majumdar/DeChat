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

@C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleScan$1", mo125469f = "FlowExt.kt", mo125470l = {42, 102}, mo125471m = "invokeSuspend")
/* renamed from: u3.w */
public final class C65185w extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f187669d;

    /* renamed from: e */
    public Object f187670e;

    /* renamed from: f */
    public int f187671f;

    /* renamed from: g */
    public final /* synthetic */ C45252f f187672g;

    /* renamed from: h */
    public final /* synthetic */ Object f187673h;

    /* renamed from: i */
    public final /* synthetic */ C32228q f187674i;

    /* renamed from: u3.w$a */
    public static final class C65186a implements C45253g<Object> {

        /* renamed from: d */
        public final /* synthetic */ C65185w f187675d;

        /* renamed from: e */
        public final /* synthetic */ C45253g f187676e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f187677f;

        @C91590f(mo125468c = "androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", mo125469f = "FlowExt.kt", mo125470l = {133, 134}, mo125471m = "emit")
        /* renamed from: u3.w$a$a */
        public static final class C65187a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187678d;

            /* renamed from: e */
            public int f187679e;

            /* renamed from: f */
            public final /* synthetic */ C65186a f187680f;

            /* renamed from: g */
            public Object f187681g;

            /* renamed from: h */
            public Object f187682h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65187a(C65186a aVar, C15601d dVar) {
                super(dVar);
                this.f187680f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187678d = obj;
                this.f187679e |= Integer.MIN_VALUE;
                return this.f187680f.emit((Object) null, this);
            }
        }

        public C65186a(C65185w wVar, C45253g gVar, C8479f0 f0Var) {
            this.f187675d = wVar;
            this.f187676e = gVar;
            this.f187677f = f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r8, wx3.C15601d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p247u3.C65185w.C65186a.C65187a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                u3.w$a$a r0 = (p247u3.C65185w.C65186a.C65187a) r0
                int r1 = r0.f187679e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187679e = r1
                goto L_0x0018
            L_0x0013:
                u3.w$a$a r0 = new u3.w$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f187678d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187679e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0070
            L_0x002a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0032:
                java.lang.Object r8 = r0.f187682h
                gy3.f0 r8 = (gy3.C8479f0) r8
                java.lang.Object r2 = r0.f187681g
                u3.w$a r2 = (p247u3.C65185w.C65186a) r2
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x005a
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r9)
                gy3.f0 r9 = r7.f187677f
                u3.w r2 = r7.f187675d
                fy3.q r2 = r2.f187674i
                T r5 = r9.f27484d
                r0.f187681g = r7
                r0.f187682h = r9
                r0.f187679e = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L_0x0056
                return r1
            L_0x0056:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x005a:
                r8.f27484d = r9
                d14.g r8 = r2.f187676e
                gy3.f0 r9 = r2.f187677f
                T r9 = r9.f27484d
                r2 = 0
                r0.f187681g = r2
                r0.f187682h = r2
                r0.f187679e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L_0x0070
                return r1
            L_0x0070:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65185w.C65186a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65185w(C45252f fVar, Object obj, C32228q qVar, C15601d dVar) {
        super(2, dVar);
        this.f187672g = fVar;
        this.f187673h = obj;
        this.f187674i = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        C65185w wVar = new C65185w(this.f187672g, this.f187673h, this.f187674i, dVar);
        wVar.f187669d = obj;
        return wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65185w) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C45253g gVar;
        C8479f0 f0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187671f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45253g gVar2 = (C45253g) this.f187669d;
            f0Var = new C8479f0();
            T t = this.f187673h;
            f0Var.f27484d = t;
            this.f187669d = gVar2;
            this.f187670e = f0Var;
            this.f187671f = 1;
            if (gVar2.emit(t, this) == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else if (i == 1) {
            f0Var = (C8479f0) this.f187670e;
            gVar = (C45253g) this.f187669d;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C45252f fVar = this.f187672g;
        C65186a aVar2 = new C65186a(this, gVar, f0Var);
        this.f187669d = null;
        this.f187670e = null;
        this.f187671f = 2;
        if (fVar.mo31880a(aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
