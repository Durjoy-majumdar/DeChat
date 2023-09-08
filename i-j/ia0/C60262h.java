package ia0;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$showErrorTips$2", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ia0.h */
public final class C60262h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C108438c f171803d;

    /* renamed from: e */
    public final /* synthetic */ String f171804e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60262h(C108438c cVar, String str, C15601d<? super C60262h> dVar) {
        super(2, dVar);
        this.f171803d = cVar;
        this.f171804e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60262h(this.f171803d, this.f171804e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60262h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C76912y0.m92767f(this.f171803d.f324700g, this.f171804e);
        return C13598b0.f38549a;
    }
}
