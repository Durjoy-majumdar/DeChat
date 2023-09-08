package d14;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.j */
public final class C20380j implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ Object[] f57105d;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", mo125469f = "Builders.kt", mo125470l = {114}, mo125471m = "collect")
    /* renamed from: d14.j$a */
    public static final class C20381a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f57106d;

        /* renamed from: e */
        public int f57107e;

        /* renamed from: f */
        public final /* synthetic */ C20380j f57108f;

        /* renamed from: g */
        public Object f57109g;

        /* renamed from: h */
        public Object f57110h;

        /* renamed from: i */
        public int f57111i;

        /* renamed from: j */
        public int f57112j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20381a(C20380j jVar, C15601d dVar) {
            super(dVar);
            this.f57108f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f57106d = obj;
            this.f57107e |= Integer.MIN_VALUE;
            return this.f57108f.mo31880a((C45253g<Object>) null, this);
        }
    }

    public C20380j(Object[] objArr) {
        this.f57105d = objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<java.lang.Object> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d14.C20380j.C20381a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            d14.j$a r0 = (d14.C20380j.C20381a) r0
            int r1 = r0.f57107e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f57107e = r1
            goto L_0x0018
        L_0x0013:
            d14.j$a r0 = new d14.j$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f57106d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f57107e
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r7 = r0.f57112j
            int r2 = r0.f57111i
            java.lang.Object r4 = r0.f57110h
            d14.g r4 = (d14.C45253g) r4
            java.lang.Object r5 = r0.f57109g
            d14.j r5 = (d14.C20380j) r5
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r4
            goto L_0x005e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 0
            java.lang.Object[] r2 = r6.f57105d
            int r2 = r2.length
            r5 = r6
            r8 = r7
            r7 = r2
            r2 = 0
        L_0x0047:
            if (r2 >= r7) goto L_0x0060
            java.lang.Object[] r4 = r5.f57105d
            r4 = r4[r2]
            r0.f57109g = r5
            r0.f57110h = r8
            r0.f57111i = r2
            r0.f57112j = r7
            r0.f57107e = r3
            java.lang.Object r4 = r8.emit(r4, r0)
            if (r4 != r1) goto L_0x005e
            return r1
        L_0x005e:
            int r2 = r2 + r3
            goto L_0x0047
        L_0x0060:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C20380j.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
