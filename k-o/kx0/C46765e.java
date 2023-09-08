package kx0;

import a14.C0000n0;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import mx0.C11094b;
import mx0.C47110d;
import mx0.C47111e;
import mx0.C47114g;
import rx3.C13598b0;
import te3.C49280eg;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadRvUIC$deleteItem$1", mo125469f = "BizPCRecentReadRvUIC.kt", mo125470l = {286}, mo125471m = "invokeSuspend")
/* renamed from: kx0.e */
public final class C46765e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f125868d;

    /* renamed from: e */
    public final /* synthetic */ C46754a f125869e;

    /* renamed from: f */
    public final /* synthetic */ C47111e f125870f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46765e(C46754a aVar, C47111e eVar, C15601d<? super C46765e> dVar) {
        super(2, dVar);
        this.f125869e = aVar;
        this.f125870f = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46765e(this.f125869e, this.f125870f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46765e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f125868d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppCompatActivity activity = this.f125869e.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            C47110d dVar = ((BizPCRecentReadUI) activity).f109268f;
            C49280eg egVar = this.f125870f.f126587d;
            this.f125868d = 1;
            dVar.getClass();
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            new C47114g(egVar).mo9225i().mo123420E(new C11094b(dVar, hVar));
            if (hVar.mo90314b() == aVar) {
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
