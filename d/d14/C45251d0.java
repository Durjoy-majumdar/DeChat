package d14;

import fy3.C32227p;
import fy3.C32228q;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", mo125469f = "Merge.kt", mo125470l = {214, 214}, mo125471m = "invokeSuspend")
/* renamed from: d14.d0 */
public final class C45251d0 extends C91594j implements C32228q<C45253g<Object>, Object, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f122588d;

    /* renamed from: e */
    public /* synthetic */ Object f122589e;

    /* renamed from: f */
    public /* synthetic */ Object f122590f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Object, C15601d<Object>, Object> f122591g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45251d0(C32227p<Object, ? super C15601d<Object>, ? extends Object> pVar, C15601d<? super C45251d0> dVar) {
        super(3, dVar);
        this.f122591g = pVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C45251d0 d0Var = new C45251d0(this.f122591g, (C15601d) obj3);
        d0Var.f122589e = (C45253g) obj;
        d0Var.f122590f = obj2;
        return d0Var.invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f122588d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0043
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.f122589e
            d14.g r1 = (d14.C45253g) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0037
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f122589e
            r1 = r6
            d14.g r1 = (d14.C45253g) r1
            java.lang.Object r6 = r5.f122590f
            fy3.p<java.lang.Object, wx3.d<java.lang.Object>, java.lang.Object> r4 = r5.f122591g
            r5.f122589e = r1
            r5.f122588d = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            r3 = 0
            r5.f122589e = r3
            r5.f122588d = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0043
            return r0
        L_0x0043:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C45251d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
