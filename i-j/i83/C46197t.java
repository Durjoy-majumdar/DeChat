package i83;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.WebTransPageLogic$deBounceTransDone$1", mo125469f = "WebTransPageLogic.kt", mo125470l = {106}, mo125471m = "invokeSuspend")
/* renamed from: i83.t */
public final class C46197t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f124521d;

    /* renamed from: e */
    public final /* synthetic */ long f124522e;

    /* renamed from: f */
    public final /* synthetic */ C46198u f124523f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46197t(long j, C46198u uVar, C15601d<? super C46197t> dVar) {
        super(2, dVar);
        this.f124522e = j;
        this.f124523f = uVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46197t(this.f124522e, this.f124523f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46197t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f124521d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f124522e;
            this.f124521d = 1;
            if (C53965x0.m60607b(j, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f124523f.f124532o.setValue(C46177b0.DoneTrans);
        return C13598b0.f38549a;
    }
}
