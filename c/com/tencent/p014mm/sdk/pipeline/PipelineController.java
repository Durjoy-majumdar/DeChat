package com.tencent.p014mm.sdk.pipeline;

import fy3.C32224a;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineController;", "", "Lrx3/b0;", "cancel", "Lkotlin/Function0;", "callback", "pause", "resume", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/sdk/pipeline/Pipeline;", "pipelineRef", "Ljava/lang/ref/WeakReference;", "getPipelineRef", "()Ljava/lang/ref/WeakReference;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineController */
public final class PipelineController {
    private final WeakReference<Pipeline> pipelineRef;

    public PipelineController(WeakReference<Pipeline> weakReference) {
        C87412m.m108594g(weakReference, "pipelineRef");
        this.pipelineRef = weakReference;
    }

    public static /* synthetic */ void pause$default(PipelineController pipelineController, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        pipelineController.pause(aVar);
    }

    public static /* synthetic */ void resume$default(PipelineController pipelineController, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        pipelineController.resume(aVar);
    }

    public final void cancel() {
        Pipeline pipeline = this.pipelineRef.get();
        if (pipeline != null) {
            pipeline.cancel$wechat_sdk_release();
        }
    }

    public final WeakReference<Pipeline> getPipelineRef() {
        return this.pipelineRef;
    }

    public final void pause(C32224a<C13598b0> aVar) {
        Pipeline pipeline = this.pipelineRef.get();
        if (pipeline != null) {
            pipeline.pause$wechat_sdk_release(aVar);
        }
    }

    public final void resume(C32224a<C13598b0> aVar) {
        Pipeline pipeline = this.pipelineRef.get();
        if (pipeline != null) {
            pipeline.resume$wechat_sdk_release(aVar);
        }
    }
}
