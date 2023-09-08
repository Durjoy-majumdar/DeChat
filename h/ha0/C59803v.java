package ha0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$awaitLoadSo$2", mo125469f = "MaasManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ha0.v */
public final class C59803v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public C59803v(C15601d<? super C59803v> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59803v(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C59803v((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C108221t.f324032a.getClass();
        ((Boolean) ((C36570n) C108221t.f324033b).getValue()).booleanValue();
        return C13598b0.f38549a;
    }
}
