package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0017J#\u0010\u000b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/ProcessorPipelineComponent;", "Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "InAction", "OutAction", "Lcom/tencent/mm/sdk/pipeline/PipelineComponent;", "Lrx3/b0;", "initAttachClazz", "onCreate", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "action", "processAction", "(Lcom/tencent/mm/sdk/pipeline/PipelineState;Lcom/tencent/mm/sdk/statecenter/BaseStateAction;Lwx3/d;)Ljava/lang/Object;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "scope$delegate", "Lrx3/g;", "getScope", "()Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "scope", "Ljava/lang/Class;", "attachInActionClazz", "Ljava/lang/Class;", "attachOutActionClazz", "Lcom/tencent/mm/sdk/pipeline/Pipeline;", "pipeline", "<init>", "(Lcom/tencent/mm/sdk/pipeline/Pipeline;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent */
public abstract class ProcessorPipelineComponent<InAction extends BaseStateAction, OutAction extends BaseStateAction> extends PipelineComponent {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.Pipeline.ProcessorPipelineComponent";
    /* access modifiers changed from: private */
    public Class<InAction> attachInActionClazz;
    private Class<OutAction> attachOutActionClazz;
    private final C13601g scope$delegate;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/ProcessorPipelineComponent$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessorPipelineComponent(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
        this.scope$delegate = C36568h.m40985a(new ProcessorPipelineComponent$scope$2(pipeline));
    }

    /* access modifiers changed from: private */
    public final void initAttachClazz() {
        if (this.attachInActionClazz == null) {
            Class<?> parameterizedTypeClass = CommonKt.getParameterizedTypeClass(getClass(), 0);
            C87412m.m108592e(parameterizedTypeClass, "null cannot be cast to non-null type java.lang.Class<InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
            this.attachInActionClazz = parameterizedTypeClass;
        }
        if (this.attachOutActionClazz == null) {
            Class<?> parameterizedTypeClass2 = CommonKt.getParameterizedTypeClass(getClass(), 1);
            C87412m.m108592e(parameterizedTypeClass2, "null cannot be cast to non-null type java.lang.Class<OutAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
            this.attachOutActionClazz = parameterizedTypeClass2;
        }
    }

    public final LifecycleScope getScope() {
        return (LifecycleScope) this.scope$delegate.getValue();
    }

    public void onCreate() {
        process(new ProcessorPipelineComponent$onCreate$1(this));
        observe(new ProcessorPipelineComponent$onCreate$2(this));
    }

    public abstract Object processAction(PipelineState pipelineState, InAction inaction, C15601d<? super OutAction> dVar);
}
