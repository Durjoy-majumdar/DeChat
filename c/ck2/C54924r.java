package ck2;

import a14.C0000n0;
import bl3.C39818r;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import nj2.C61768p;
import q40.C62580c;
import r13.C63358c;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import xx3.C15911a;
import yj2.C66655a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalDataUIC$deleteRingtone$2$1", mo125469f = "RingtoneGlobalDataUIC.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
/* renamed from: ck2.r */
public final class C54924r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f153938d;

    /* renamed from: e */
    public int f153939e;

    /* renamed from: f */
    public final /* synthetic */ C54925s f153940f;

    /* renamed from: g */
    public final /* synthetic */ C15601d<Boolean> f153941g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54924r(C54925s sVar, C15601d<? super Boolean> dVar, C15601d<? super C54924r> dVar2) {
        super(2, dVar2);
        this.f153940f = sVar;
        this.f153941g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54924r(this.f153940f, this.f153941g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54924r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C66132f fVar;
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153939e;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fVar = C61768p.m72478f();
            this.f153938d = fVar;
            this.f153939e = 1;
            obj2 = C66655a.f191654a.mo90708d(2, 1, 0, 0, "", 0, 0, 0, "", this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            fVar = (C66132f) this.f153938d;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C54925s sVar = this.f153940f;
        C15601d<Boolean> dVar = this.f153941g;
        if (((C62580c) obj2).f177733a) {
            C61768p.m72484l("", (C66132f) null);
            if (fVar.f190095r == null || fVar.mo90178i().f170150b == null || !C63358c.m74700b(fVar.mo90178i())) {
                z = false;
            }
            ((C54914j0) C39818r.f106831a.mo62444c(sVar.getActivity()).mo75002a(C54914j0.class)).mo75844d3(fVar, (String) null, z);
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            C61768p.m72486n(s, (C66132f) null, 0, 4, (Object) null);
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            Result.Companion companion2 = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        return C13598b0.f38549a;
    }
}
