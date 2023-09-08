package d14;

import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.m1 */
public final class C58066m1<T> implements C45253g<T> {

    @C91590f(mo125468c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo125469f = "Share.kt", mo125470l = {419, 423}, mo125471m = "onSubscription")
    /* renamed from: d14.m1$a */
    public static final class C58067a extends C66704d {

        /* renamed from: d */
        public Object f166076d;

        /* renamed from: e */
        public Object f166077e;

        /* renamed from: f */
        public /* synthetic */ Object f166078f;

        /* renamed from: g */
        public final /* synthetic */ C58066m1<T> f166079g;

        /* renamed from: h */
        public int f166080h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58067a(C58066m1<T> m1Var, C15601d<? super C58067a> dVar) {
            super(dVar);
            this.f166079g = m1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166078f = obj;
            this.f166080h |= Integer.MIN_VALUE;
            return this.f166079g.mo82838a(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo82838a(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof d14.C58066m1.C58067a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            d14.m1$a r0 = (d14.C58066m1.C58067a) r0
            int r1 = r0.f166080h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166080h = r1
            goto L_0x0018
        L_0x0013:
            d14.m1$a r0 = new d14.m1$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f166078f
            int r1 = r0.f166080h
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x0032
            r0 = 2
            if (r1 != r0) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0032:
            java.lang.Object r1 = r0.f166077e
            e14.w r1 = (e14.C58510w) r1
            java.lang.Object r0 = r0.f166076d
            d14.m1 r0 = (d14.C58066m1) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch:{ all -> 0x0046 }
            r1.releaseIntercepted()
            r0.getClass()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0046:
            r5 = move-exception
            goto L_0x005c
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r5)
            e14.w r1 = new e14.w
            wx3.f r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.f166076d = r4     // Catch:{ all -> 0x0046 }
            r0.f166077e = r1     // Catch:{ all -> 0x0046 }
            r0.f166080h = r2     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x005c:
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58066m1.mo82838a(wx3.d):java.lang.Object");
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        throw null;
    }
}
