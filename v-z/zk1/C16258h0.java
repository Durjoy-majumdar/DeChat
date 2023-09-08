package zk1;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mk1.C10906h;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLivePostBtnUIC$handleLiveMenuItemSelected$1", mo125469f = "FinderLivePostBtnUIC.kt", mo125470l = {212}, mo125471m = "invokeSuspend")
/* renamed from: zk1.h0 */
public final class C16258h0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43532d;

    /* renamed from: e */
    public final /* synthetic */ C16260i0 f43533e;

    /* renamed from: f */
    public final /* synthetic */ C10906h.C10907a f43534f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16258h0(C16260i0 i0Var, C10906h.C10907a aVar, C15601d<? super C16258h0> dVar) {
        super(2, dVar);
        this.f43533e = i0Var;
        this.f43534f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16258h0(this.f43533e, this.f43534f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16258h0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43532d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C10906h hVar = this.f43533e.f43545o;
            C10906h.C10907a aVar2 = this.f43534f;
            this.f43532d = 1;
            obj = hVar.mo11118g(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10906h.C10912c cVar = (C10906h.C10912c) obj;
        if (cVar instanceof C10906h.C10912c.C10913a) {
            String str = this.f43533e.f43537d;
            Log.m105924i(str, "startLiveCheck failed, errCode:" + ((C10906h.C10912c.C10913a) cVar).f32546a);
        } else if (cVar instanceof C10906h.C10912c.C10915c) {
            Log.m105924i(this.f43533e.f43537d, "startLiveCheck continueLive");
            this.f43533e.f43545o.mo11113b(((C10906h.C10912c.C10915c) cVar).f32548a);
        } else if (cVar instanceof C10906h.C10912c.C10914b) {
            Log.m105924i(this.f43533e.f43537d, "startLiveCheck success");
            this.f43533e.f43545o.mo11114c((Intent) null, ((C10906h.C10912c.C10914b) cVar).f32547a, false);
        }
        return C13598b0.f38549a;
    }
}
