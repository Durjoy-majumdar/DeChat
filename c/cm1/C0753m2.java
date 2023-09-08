package cm1;

import a14.C0000n0;
import cm1.C0742j2;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C50542nh0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SetProfileCoverViewModel$modifyProfileCoverDirect$1$onModifyResult$1", mo125469f = "SetProfileCoverViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: cm1.m2 */
public final class C0753m2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0742j2.C0743a f1771d;

    /* renamed from: e */
    public final /* synthetic */ String f1772e;

    /* renamed from: f */
    public final /* synthetic */ int f1773f;

    /* renamed from: g */
    public final /* synthetic */ C50542nh0 f1774g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0753m2(C0742j2.C0743a aVar, String str, int i, C50542nh0 nh02, C15601d<? super C0753m2> dVar) {
        super(2, dVar);
        this.f1771d = aVar;
        this.f1772e = str;
        this.f1773f = i;
        this.f1774g = nh02;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0753m2(this.f1771d, this.f1772e, this.f1773f, this.f1774g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0753m2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C0742j2.C0743a aVar = this.f1771d;
        String str = this.f1772e;
        int i = this.f1773f;
        C50542nh0 nh02 = this.f1774g;
        aVar.mo704a(str, i, nh02.f138603e, nh02.f138604f);
        return C13598b0.f38549a;
    }
}
