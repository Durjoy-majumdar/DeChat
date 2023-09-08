package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "it", "Lrx3/b0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2$1$2 */
public final class Pipeline$Companion$startSyncPipelineForResult$2$1$2 extends C87413o implements C32226l<Throwable, C13598b0> {
    public final /* synthetic */ C8479f0<Pipeline> $pipeline;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pipeline$Companion$startSyncPipelineForResult$2$1$2(C8479f0<Pipeline> f0Var) {
        super(1);
        this.$pipeline = f0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(Throwable th) {
        Pipeline pipeline = (Pipeline) this.$pipeline.f27484d;
        Integer num = null;
        if (pipeline != null) {
            pipeline.setCallback((PipelineCallback) null);
        }
        Pipeline pipeline2 = (Pipeline) this.$pipeline.f27484d;
        if (pipeline2 != null) {
            pipeline2.cancel$wechat_sdk_release();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("continuation is cancel ");
        Pipeline pipeline3 = (Pipeline) this.$pipeline.f27484d;
        sb.append(pipeline3 != null ? pipeline3.getBizName() : null);
        sb.append(' ');
        Pipeline pipeline4 = (Pipeline) this.$pipeline.f27484d;
        if (pipeline4 != null) {
            num = Integer.valueOf(pipeline4.hashCode());
        }
        sb.append(num);
        Log.m105924i(Pipeline.TAG, sb.toString());
    }
}
