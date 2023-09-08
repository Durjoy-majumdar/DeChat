package d14;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.i */
public final class C58047i implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ Iterable f166027d;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", mo125469f = "Builders.kt", mo125470l = {115}, mo125471m = "collect")
    /* renamed from: d14.i$a */
    public static final class C58048a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166028d;

        /* renamed from: e */
        public int f166029e;

        /* renamed from: f */
        public final /* synthetic */ C58047i f166030f;

        /* renamed from: g */
        public Object f166031g;

        /* renamed from: h */
        public Object f166032h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58048a(C58047i iVar, C15601d dVar) {
            super(dVar);
            this.f166030f = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166028d = obj;
            this.f166029e |= Integer.MIN_VALUE;
            return this.f166030f.mo31880a((C45253g<Object>) null, this);
        }
    }

    public C58047i(Iterable iterable) {
        this.f166027d = iterable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<java.lang.Object> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d14.C58047i.C58048a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d14.i$a r0 = (d14.C58047i.C58048a) r0
            int r1 = r0.f166029e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166029e = r1
            goto L_0x0018
        L_0x0013:
            d14.i$a r0 = new d14.i$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f166028d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166029e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f166032h
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f166031g
            d14.g r2 = (d14.C45253g) r2
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r2
            goto L_0x0044
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Iterable r7 = r5.f166027d
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0044:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r6.next()
            r0.f166031g = r7
            r0.f166032h = r6
            r0.f166029e = r3
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L_0x0044
            return r1
        L_0x005b:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58047i.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
