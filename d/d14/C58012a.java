package d14;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.a */
public abstract class C58012a<T> implements C45252f<T> {

    @C91590f(mo125468c = "kotlinx.coroutines.flow.AbstractFlow", mo125469f = "Flow.kt", mo125470l = {230}, mo125471m = "collect")
    /* renamed from: d14.a$a */
    public static final class C58013a extends C66704d {

        /* renamed from: d */
        public Object f165952d;

        /* renamed from: e */
        public /* synthetic */ Object f165953e;

        /* renamed from: f */
        public final /* synthetic */ C58012a<T> f165954f;

        /* renamed from: g */
        public int f165955g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58013a(C58012a<T> aVar, C15601d<? super C58013a> dVar) {
            super(dVar);
            this.f165954f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f165953e = obj;
            this.f165955g |= Integer.MIN_VALUE;
            return this.f165954f.mo31880a((C45253g) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31880a(d14.C45253g<? super T> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d14.C58012a.C58013a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d14.a$a r0 = (d14.C58012a.C58013a) r0
            int r1 = r0.f165955g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f165955g = r1
            goto L_0x0018
        L_0x0013:
            d14.a$a r0 = new d14.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f165953e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f165955g
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.f165952d
            e14.w r6 = (e14.C58510w) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002b }
            goto L_0x0057
        L_0x002b:
            r7 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            e14.w r7 = new e14.w
            wx3.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f165952d = r7     // Catch:{ all -> 0x005d }
            r0.f165955g = r3     // Catch:{ all -> 0x005d }
            r6 = r5
            d14.x0 r6 = (d14.C58095x0) r6     // Catch:{ all -> 0x005d }
            fy3.p<d14.g<? super T>, wx3.d<? super rx3.b0>, java.lang.Object> r6 = r6.f166149d     // Catch:{ all -> 0x005d }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x005d }
            if (r6 != r1) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005d }
        L_0x0053:
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r6 = r7
        L_0x0057:
            r6.releaseIntercepted()
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x005d:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0061:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58012a.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
