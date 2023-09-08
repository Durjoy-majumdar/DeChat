package wb1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import pb1.C100746u;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnUploadServiceFSC$startCdnTask$1", mo125469f = "FavCdnUploadServiceFSC.kt", mo125470l = {74}, mo125471m = "invokeSuspend")
/* renamed from: wb1.j */
public final class C102399j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f301588d;

    /* renamed from: e */
    public final /* synthetic */ C102396i f301589e;

    /* renamed from: f */
    public final /* synthetic */ C100746u f301590f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102399j(C102396i iVar, C100746u uVar, C15601d<? super C102399j> dVar) {
        super(2, dVar);
        this.f301589e = iVar;
        this.f301590f = uVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102399j(this.f301589e, this.f301590f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102399j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f301588d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowController F3 = this.f301589e.mo141978F3();
            String str = this.f301590f.field_dataId;
            C87412m.m108593f(str, "cdnInfo.field_dataId");
            this.f301588d = 1;
            if (F3.outFlow(str, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
