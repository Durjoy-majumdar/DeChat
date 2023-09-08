package qj1;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import kotlin.ResultKt;
import mj1.C61491e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveMultiStreamBubblePlugin$showBubbleTip$1", mo125469f = "FinderLiveMultiStreamBubblePlugin.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
/* renamed from: qj1.eb */
public final class C62759eb extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f178155d;

    /* renamed from: e */
    public final /* synthetic */ C62707db f178156e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62759eb(C62707db dbVar, C15601d<? super C62759eb> dVar) {
        super(2, dVar);
        this.f178156e = dbVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62759eb(this.f178156e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62759eb) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f178155d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f178155d = 1;
            if (C53965x0.m60607b(2000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f178156e.mo14483f0() == 8) {
            C61491e.m72198b(C61491e.f174819a, 1, (String) null, (String) null, 6, (Object) null);
        }
        this.f178156e.mo87718Z0();
        C62712dd ddVar = (C62712dd) this.f178156e.mo87687E0(C62712dd.class);
        if (ddVar != null) {
            ddVar.mo10792g(8);
        }
        C63084w6 w6Var = (C63084w6) this.f178156e.mo87687E0(C63084w6.class);
        if (w6Var != null) {
            w6Var.mo10792g(8);
        }
        this.f178156e.mo10792g(0);
        return C13598b0.f38549a;
    }
}
