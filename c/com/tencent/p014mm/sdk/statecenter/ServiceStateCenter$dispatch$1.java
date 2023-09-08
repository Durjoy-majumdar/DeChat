package com.tencent.p014mm.sdk.statecenter;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/BaseState;", "State", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.statecenter.ServiceStateCenter$dispatch$1", mo125469f = "ServiceStateCenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.statecenter.ServiceStateCenter$dispatch$1 */
public final class ServiceStateCenter$dispatch$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ IStateAction $action;
    public int label;
    public final /* synthetic */ ServiceStateCenter<State> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceStateCenter$dispatch$1(ServiceStateCenter<State> serviceStateCenter, IStateAction iStateAction, C15601d<? super ServiceStateCenter$dispatch$1> dVar) {
        super(2, dVar);
        this.this$0 = serviceStateCenter;
        this.$action = iStateAction;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new ServiceStateCenter$dispatch$1(this.this$0, this.$action, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((ServiceStateCenter$dispatch$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BaseState cloneState = this.this$0._state.cloneState();
            C87412m.m108592e(cloneState, "null cannot be cast to non-null type State of com.tencent.mm.sdk.statecenter.ServiceStateCenter");
            cloneState.setAction(this.$action);
            this.this$0.rootProcessor.process(cloneState);
            this.this$0._state = cloneState;
            BaseState cloneState2 = cloneState.cloneState();
            C87412m.m108592e(cloneState2, "null cannot be cast to non-null type State of com.tencent.mm.sdk.statecenter.ServiceStateCenter");
            this.this$0.observerOwner.notify(cloneState2);
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
