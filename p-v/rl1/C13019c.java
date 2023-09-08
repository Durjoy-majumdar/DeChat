package rl1;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveAnchorLotteryEntranceWidget$setVisible$preparePanel$1", mo125469f = "FinderLiveAnchorLotteryEntranceWidget.kt", mo125470l = {174}, mo125471m = "invokeSuspend")
/* renamed from: rl1.c */
public final class C13019c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f37080d;

    /* renamed from: e */
    public final /* synthetic */ C13021d f37081e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13019c(C13021d dVar, C15601d<? super C13019c> dVar2) {
        super(2, dVar2);
        this.f37081e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13019c(this.f37081e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13019c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f37080d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f37080d = 1;
            if (((C13022d0) this.f37081e.f37086c.mo87696x0(C13022d0.class)).mo12540f3(false, this) == aVar) {
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
