package aw1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import ov1.C21891f;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.unit.FTSRelevantSearchUIUnit$1$1$1", mo125469f = "FTSRelevantSearchUIUnit.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: aw1.l */
public final class C16728l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C21891f.C21893b f45209d;

    /* renamed from: e */
    public final /* synthetic */ C16729m f45210e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16728l(C21891f.C21893b bVar, C16729m mVar, C15601d<? super C16728l> dVar) {
        super(2, dVar);
        this.f45209d = bVar;
        this.f45210e = mVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16728l(this.f45209d, this.f45210e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16728l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C21891f.C21893b bVar = this.f45209d;
        if (bVar != null) {
            C16729m mVar = this.f45210e;
            String str = mVar.f45213i;
            if (str == null) {
                str = "";
            }
            bVar.mo23811a(mVar, str, true);
        }
        return C13598b0.f38549a;
    }
}
