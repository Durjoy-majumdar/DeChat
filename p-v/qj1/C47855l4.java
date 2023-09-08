package qj1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import lg1.C46854h;
import ng1.C11162c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxPlugin$stopBox$1", mo125469f = "FinderLiveBoxPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qj1.l4 */
public final class C47855l4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C47851k4 f128454d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47855l4(C47851k4 k4Var, C15601d<? super C47855l4> dVar) {
        super(2, dVar);
        this.f128454d = k4Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47855l4(this.f128454d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47855l4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f128454d.f128444t.mo62577d3();
        C46854h hVar = (C46854h) this.f128454d.mo87687E0(C46854h.class);
        if (hVar != null) {
            hVar.f126031s.setVisibility(8);
            hVar.f126034v.mo72284a();
            C11162c cVar = hVar.f126035w;
            if (cVar != null) {
                cVar.notifyDataSetChanged();
            }
        }
        return C13598b0.f38549a;
    }
}
