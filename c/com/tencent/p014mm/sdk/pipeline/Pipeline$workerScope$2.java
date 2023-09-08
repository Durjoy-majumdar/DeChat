package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$workerScope$2 */
public final class Pipeline$workerScope$2 extends C87413o implements C32224a<LifecycleScope> {
    public final /* synthetic */ Pipeline this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pipeline$workerScope$2(Pipeline pipeline) {
        super(0);
        this.this$0 = pipeline;
    }

    public final LifecycleScope invoke() {
        return new LifecycleScope("Pipeline_" + this.this$0.getBizName().hashCode() + "_Main", this.this$0, 0, 4, (C8480h) null);
    }
}
