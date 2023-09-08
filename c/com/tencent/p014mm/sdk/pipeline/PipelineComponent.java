package com.tencent.p014mm.sdk.pipeline;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.ServiceStateCenter;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\nJ\u001a\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\nJ\u0010\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0003J\u001d\u0010\u0017\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineComponent;", "", "Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter;", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "stateCenter", "state", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "action", "Lrx3/b0;", "dispatch", "Lkotlin/Function1;", "observer", "observe", "processor", "process", "data", "setResultFinish", "setResultProcess", "setResultError", "Lkotlin/Function0;", "block", "runOnPipelineThread$wechat_sdk_release", "(Lfy3/a;)V", "runOnPipelineThread", "onCreateBefore", "onCreate", "onCreateAfter", "onDestroy", "onCancel", "onPause", "onResume", "Lcom/tencent/mm/sdk/pipeline/Pipeline;", "pipeline", "Lcom/tencent/mm/sdk/pipeline/Pipeline;", "getPipeline", "()Lcom/tencent/mm/sdk/pipeline/Pipeline;", "<init>", "(Lcom/tencent/mm/sdk/pipeline/Pipeline;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineComponent */
public class PipelineComponent {
    private final Pipeline pipeline;

    public PipelineComponent(Pipeline pipeline2) {
        C87412m.m108594g(pipeline2, "pipeline");
        this.pipeline = pipeline2;
    }

    public static /* synthetic */ void setResultError$default(PipelineComponent pipelineComponent, PipelineState pipelineState, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pipelineState = new PipelineState();
            }
            pipelineComponent.setResultError(pipelineState);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResultError");
    }

    public static /* synthetic */ void setResultFinish$default(PipelineComponent pipelineComponent, PipelineState pipelineState, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pipelineState = new PipelineState();
            }
            pipelineComponent.setResultFinish(pipelineState);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResultFinish");
    }

    public static /* synthetic */ void setResultProcess$default(PipelineComponent pipelineComponent, PipelineState pipelineState, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pipelineState = new PipelineState();
            }
            pipelineComponent.setResultProcess(pipelineState);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResultProcess");
    }

    public final void dispatch(IStateAction iStateAction) {
        C87412m.m108594g(iStateAction, "action");
        stateCenter().dispatch(iStateAction);
    }

    public final Pipeline getPipeline() {
        return this.pipeline;
    }

    public final void observe(C32226l<? super PipelineState, C13598b0> lVar) {
        C87412m.m108594g(lVar, "observer");
        stateCenter().observe((C0125s) this.pipeline, lVar);
    }

    public void onCancel() {
    }

    public void onCreate() {
    }

    public void onCreateAfter() {
    }

    public void onCreateBefore() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public final void process(C32226l<? super PipelineState, C13598b0> lVar) {
        C87412m.m108594g(lVar, "processor");
        stateCenter().process((C0125s) this.pipeline, lVar);
    }

    public final void runOnPipelineThread$wechat_sdk_release(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        this.pipeline.runOnPipelineThread$wechat_sdk_release(aVar);
    }

    public final void setResultError(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "data");
        this.pipeline.setResult$wechat_sdk_release(-1, pipelineState);
        this.pipeline.finish$wechat_sdk_release();
    }

    public final void setResultFinish(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "data");
        this.pipeline.setResult$wechat_sdk_release(0, pipelineState);
        this.pipeline.finish$wechat_sdk_release();
    }

    public final void setResultProcess(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "data");
        this.pipeline.setResult$wechat_sdk_release(0, pipelineState);
    }

    public final PipelineState state() {
        return this.pipeline.getStateCenter$wechat_sdk_release().getState();
    }

    public final ServiceStateCenter<PipelineState> stateCenter() {
        return this.pipeline.getStateCenter$wechat_sdk_release();
    }
}
