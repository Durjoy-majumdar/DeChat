package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.FlowPipelineComponent$handleReturnAction$2 */
public final class FlowPipelineComponent$handleReturnAction$2 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ Set<WeakReference<FlowPipelineComponent>> $removeResultSet;
    public final /* synthetic */ BaseStateAction $returnAction;
    public final /* synthetic */ FlowPipelineComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowPipelineComponent$handleReturnAction$2(Set<WeakReference<FlowPipelineComponent>> set, FlowPipelineComponent flowPipelineComponent, BaseStateAction baseStateAction) {
        super(0);
        this.$removeResultSet = set;
        this.this$0 = flowPipelineComponent;
        this.$returnAction = baseStateAction;
    }

    public final void invoke() {
        Set<WeakReference<FlowPipelineComponent>> set = this.$removeResultSet;
        if (set != null) {
            BaseStateAction baseStateAction = this.$returnAction;
            for (WeakReference weakReference : set) {
                FlowPipelineComponent flowPipelineComponent = (FlowPipelineComponent) weakReference.get();
                if (flowPipelineComponent != null) {
                    BaseState cloneState = ((PipelineFailAction) baseStateAction).getPipelineState().cloneState();
                    C87412m.m108592e(cloneState, "null cannot be cast to non-null type com.tencent.mm.sdk.pipeline.PipelineState");
                    flowPipelineComponent.setResultError((PipelineState) cloneState);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("remove error ");
        sb.append(this.this$0.getUniqueKey());
        sb.append(' ');
        Set<WeakReference<FlowPipelineComponent>> set2 = this.$removeResultSet;
        sb.append(set2 != null ? Integer.valueOf(set2.size()) : null);
        Log.m105918d("MicroMsg.Pipeline.FlowPipelineComponent", sb.toString());
    }
}
