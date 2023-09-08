package d14;

import fy3.C32228q;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", mo125469f = "Zip.kt", mo125470l = {33, 33}, mo125471m = "invokeSuspend")
/* renamed from: d14.r0 */
public final class C45255r0 extends C91594j implements C32228q<C45253g<Object>, Object[], C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f122595d;

    /* renamed from: e */
    public /* synthetic */ Object f122596e;

    /* renamed from: f */
    public /* synthetic */ Object f122597f;

    /* renamed from: g */
    public final /* synthetic */ C32228q<Object, Object, C15601d<Object>, Object> f122598g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45255r0(C32228q<Object, Object, ? super C15601d<Object>, ? extends Object> qVar, C15601d<? super C45255r0> dVar) {
        super(3, dVar);
        this.f122598g = qVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C45255r0 r0Var = new C45255r0(this.f122598g, (C15601d) obj3);
        r0Var.f122596e = (C45253g) obj;
        r0Var.f122597f = (Object[]) obj2;
        return r0Var.invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f122595d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004a
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            java.lang.Object r1 = r6.f122596e
            d14.g r1 = (d14.C45253g) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x003e
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f122596e
            r1 = r7
            d14.g r1 = (d14.C45253g) r1
            java.lang.Object r7 = r6.f122597f
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            fy3.q<java.lang.Object, java.lang.Object, wx3.d<java.lang.Object>, java.lang.Object> r4 = r6.f122598g
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.f122596e = r1
            r6.f122595d = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r3 = 0
            r6.f122596e = r3
            r6.f122595d = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x004a
            return r0
        L_0x004a:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C45255r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
