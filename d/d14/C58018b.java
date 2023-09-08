package d14;

import c14.C54624g;
import c14.C54647v;
import e14.C58482g;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.b */
public final class C58018b<T> extends C58026d<T> {

    /* renamed from: h */
    public final C32227p<C54647v<? super T>, C15601d<? super C13598b0>, Object> f165965h;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.CallbackFlowBuilder", mo125469f = "Builders.kt", mo125470l = {336}, mo125471m = "collectTo")
    /* renamed from: d14.b$a */
    public static final class C58019a extends C66704d {

        /* renamed from: d */
        public Object f165966d;

        /* renamed from: e */
        public /* synthetic */ Object f165967e;

        /* renamed from: f */
        public final /* synthetic */ C58018b<T> f165968f;

        /* renamed from: g */
        public int f165969g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58019a(C58018b<T> bVar, C15601d<? super C58019a> dVar) {
            super(dVar);
            this.f165968f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f165967e = obj;
            this.f165969g |= Integer.MIN_VALUE;
            return this.f165968f.mo82812g((C54647v) null, this);
        }
    }

    public C58018b(C32227p<? super C54647v<? super T>, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C66212f fVar, int i, C54624g gVar) {
        super(pVar, fVar, i, gVar);
        this.f165965h = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo82812g(c14.C54647v<? super T> r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d14.C58018b.C58019a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d14.b$a r0 = (d14.C58018b.C58019a) r0
            int r1 = r0.f165969g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f165969g = r1
            goto L_0x0018
        L_0x0013:
            d14.b$a r0 = new d14.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f165967e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f165969g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f165966d
            c14.v r5 = (c14.C54647v) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f165966d = r5
            r0.f165969g = r3
            fy3.p<c14.v<? super T>, wx3.d<? super rx3.b0>, java.lang.Object> r6 = r4.f165984g
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0045:
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            boolean r5 = r5.mo75535h()
            if (r5 == 0) goto L_0x0051
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58018b.mo82812g(c14.v, wx3.d):java.lang.Object");
    }

    /* renamed from: h */
    public C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58018b(this.f165965h, fVar, i, gVar);
    }
}
