package jh1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneLotteryWidget$attendLottery$$inlined$fail$default$1", mo125469f = "MileStoneLotteryWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: jh1.k */
public final class C9407k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f29358d;

    /* renamed from: e */
    public final /* synthetic */ C60834n f29359e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9407k(C0287e eVar, C15601d dVar, C60834n nVar) {
        super(2, dVar);
        this.f29358d = eVar;
        this.f29359e = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9407k(this.f29358d, dVar, this.f29359e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9407k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String str = this.f29359e.f173303c;
        Log.m105920e(str, "attendLottery failed. " + ((C0280a) ((C0281b) this.f29358d).f843b));
        C76912y0.m92767f(this.f29359e.f173301a.getContext(), this.f29359e.f173301a.getContext().getString(C0966R.string.nd_));
        return C13598b0.f38549a;
    }
}
