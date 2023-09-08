package to1;

import a14.C0000n0;
import android.view.ViewGroup;
import ej3.C45662a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$subRecordFinish$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.k */
public final class C64974k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187081d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64974k(C64963d dVar, C15601d<? super C64974k> dVar2) {
        super(2, dVar2);
        this.f187081d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64974k(this.f187081d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64974k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f187081d.f187053h.setVisibility(0);
        this.f187081d.f187058p.mo160556m(false);
        this.f187081d.f187058p.reset();
        ViewGroup viewGroup = this.f187081d.f187064v;
        C87412m.m108593f(viewGroup, "subRecordLayout");
        C45662a.m50855a(viewGroup, 0.0f, 0, (C32224a) null, 7, (Object) null);
        return C13598b0.f38549a;
    }
}
