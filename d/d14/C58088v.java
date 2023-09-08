package d14;

import gy3.C8479f0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.v */
public final class C58088v<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C45253g<T> f166132d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Throwable> f166133e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", mo125469f = "Errors.kt", mo125470l = {158}, mo125471m = "emit")
    /* renamed from: d14.v$a */
    public static final class C58089a extends C66704d {

        /* renamed from: d */
        public Object f166134d;

        /* renamed from: e */
        public /* synthetic */ Object f166135e;

        /* renamed from: f */
        public final /* synthetic */ C58088v<T> f166136f;

        /* renamed from: g */
        public int f166137g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58089a(C58088v<? super T> vVar, C15601d<? super C58089a> dVar) {
            super(dVar);
            this.f166136f = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166135e = obj;
            this.f166137g |= Integer.MIN_VALUE;
            return this.f166136f.emit(null, this);
        }
    }

    public C58088v(C45253g<? super T> gVar, C8479f0<Throwable> f0Var) {
        this.f166132d = gVar;
        this.f166133e = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d14.C58088v.C58089a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d14.v$a r0 = (d14.C58088v.C58089a) r0
            int r1 = r0.f166137g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166137g = r1
            goto L_0x0018
        L_0x0013:
            d14.v$a r0 = new d14.v$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f166135e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166137g
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f166134d
            d14.v r5 = (d14.C58088v) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0045
        L_0x002b:
            r6 = move-exception
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            d14.g<T> r6 = r4.f166132d     // Catch:{ all -> 0x0048 }
            r0.f166134d = r4     // Catch:{ all -> 0x0048 }
            r0.f166137g = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0048:
            r6 = move-exception
            r5 = r4
        L_0x004a:
            gy3.f0<java.lang.Throwable> r5 = r5.f166133e
            r5.f27484d = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58088v.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
