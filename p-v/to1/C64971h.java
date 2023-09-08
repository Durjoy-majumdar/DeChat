package to1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$normalRecordFinish$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.h */
public final class C64971h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187076d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64971h(C64963d dVar, C15601d<? super C64971h> dVar2) {
        super(2, dVar2);
        this.f187076d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64971h(this.f187076d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64971h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f187076d.f187053h.setVisibility(0);
        return C13598b0.f38549a;
    }
}
