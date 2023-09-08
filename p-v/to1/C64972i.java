package to1;

import a14.C0000n0;
import android.view.View;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$normalRecordStart$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.i */
public final class C64972i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187077d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64972i(C64963d dVar, C15601d<? super C64972i> dVar2) {
        super(2, dVar2);
        this.f187077d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64972i(this.f187077d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64972i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f187077d.f187053h.setVisibility(4);
        ViewGroup viewGroup = this.f187077d.f187059q;
        C87412m.m108593f(viewGroup, "templateLayout");
        C45662a.m50856b(viewGroup, 0, 0, (C32224a) null, 7, (Object) null);
        View view = this.f187077d.f187060r;
        C87412m.m108593f(view, "templateCloseBtn");
        C45662a.m50856b(view, 0, 0, (C32224a) null, 7, (Object) null);
        ViewGroup viewGroup2 = this.f187077d.f187064v;
        C87412m.m108593f(viewGroup2, "subRecordLayout");
        C45662a.m50856b(viewGroup2, 0, 0, (C32224a) null, 7, (Object) null);
        this.f187077d.f187057o.setVisibility(4);
        return C13598b0.f38549a;
    }
}
