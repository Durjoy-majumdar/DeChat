package to1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$updateRecordHint$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.n */
public final class C64977n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187084d;

    /* renamed from: e */
    public final /* synthetic */ String f187085e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64977n(C64963d dVar, String str, C15601d<? super C64977n> dVar2) {
        super(2, dVar2);
        this.f187084d = dVar;
        this.f187085e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64977n(this.f187084d, this.f187085e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64977n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f187084d.f187058p.mo160560q(this.f187085e, true);
        return C13598b0.f38549a;
    }
}
