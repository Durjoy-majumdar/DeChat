package p247u3;

import d14.C45252f;
import d14.C45253g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.e */
public final class C65049e implements C45252f<C65081m1<Object>> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f187236d;

    /* renamed from: u3.e$a */
    public static final class C65050a implements C45253g<C65077l0<Object>> {

        /* renamed from: d */
        public final /* synthetic */ C45253g f187237d;

        @C91590f(mo125468c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2", mo125469f = "CachedPagingData.kt", mo125470l = {135}, mo125471m = "emit")
        /* renamed from: u3.e$a$a */
        public static final class C65051a extends C66704d {

            /* renamed from: d */
            public /* synthetic */ Object f187238d;

            /* renamed from: e */
            public int f187239e;

            /* renamed from: f */
            public final /* synthetic */ C65050a f187240f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65051a(C65050a aVar, C15601d dVar) {
                super(dVar);
                this.f187240f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f187238d = obj;
                this.f187239e |= Integer.MIN_VALUE;
                return this.f187240f.emit((Object) null, this);
            }
        }

        public C65050a(C45253g gVar, C65049e eVar) {
            this.f187237d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r6, wx3.C15601d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p247u3.C65049e.C65050a.C65051a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                u3.e$a$a r0 = (p247u3.C65049e.C65050a.C65051a) r0
                int r1 = r0.f187239e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f187239e = r1
                goto L_0x0018
            L_0x0013:
                u3.e$a$a r0 = new u3.e$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f187238d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f187239e
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x004f
            L_0x0027:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r7)
                d14.g r7 = r5.f187237d
                u3.l0 r6 = (p247u3.C65077l0) r6
                r6.getClass()
                u3.m1 r2 = new u3.m1
                u3.c<T> r4 = r6.f187295a
                d14.f<u3.n0<T>> r4 = r4.f187166d
                u3.m1<T> r6 = r6.f187297c
                u3.e2 r6 = r6.f187315b
                r2.<init>(r4, r6)
                r0.f187239e = r3
                java.lang.Object r6 = r7.emit(r2, r0)
                if (r6 != r1) goto L_0x004f
                return r1
            L_0x004f:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p247u3.C65049e.C65050a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    public C65049e(C45252f fVar) {
        this.f187236d = fVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g gVar, C15601d dVar) {
        Object a = this.f187236d.mo31880a(new C65050a(gVar, this), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }
}
