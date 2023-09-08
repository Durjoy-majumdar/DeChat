package ce1;

import a14.C0000n0;
import ao1.C0145d1;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C117747y;
import q40.C12040d;
import rx3.C13598b0;
import te3.C50119ke1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$requestFinderPrepareUser$1", mo125469f = "FinderActivityParticipateUIC.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
/* renamed from: ce1.n */
public final class C0477n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f1164d;

    /* renamed from: e */
    public final /* synthetic */ FinderActivityParticipateUIC f1165e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0477n(FinderActivityParticipateUIC finderActivityParticipateUIC, C15601d<? super C0477n> dVar) {
        super(2, dVar);
        this.f1165e = finderActivityParticipateUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0477n(this.f1165e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0477n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f1164d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            this.f1164d = 1;
            obj2 = bVar.mo90679u0(13, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m168123unboximpl();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderActivityParticipateUIC finderActivityParticipateUIC = this.f1165e;
        if (Result.m168121isSuccessimpl(obj2)) {
            C50119ke1 ke12 = (C50119ke1) obj2;
            finderActivityParticipateUIC.getClass();
            C0145d1 d1Var = finderActivityParticipateUIC.f12497r;
            if (d1Var != null) {
                d1Var.mo135c3(0, 0, (String) null, ke12);
            }
        }
        FinderActivityParticipateUIC finderActivityParticipateUIC2 = this.f1165e;
        Throwable r5 = Result.m168117exceptionOrNullimpl(obj2);
        if (r5 != null) {
            C12040d dVar = r5 instanceof C12040d ? (C12040d) r5 : null;
            if (dVar != null) {
                finderActivityParticipateUIC2.getClass();
                C0145d1 d1Var2 = finderActivityParticipateUIC2.f12497r;
                if (d1Var2 != null) {
                    d1Var2.onSceneEnd(dVar.f35057e, dVar.f35058f, (String) null, (C117747y) null);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
