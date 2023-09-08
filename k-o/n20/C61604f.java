package n20;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineCallback;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.pipeline.PipelineController;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import gy3.C87412m;
import java.util.List;

/* renamed from: n20.f */
public class C61604f {

    /* renamed from: a */
    public final List<Class<? extends PipelineComponent>> f175191a;

    public C61604f(List<Class<? extends PipelineComponent>> list) {
        C87412m.m108594g(list, "ppcList");
        this.f175191a = list;
    }

    /* renamed from: a */
    public final PipelineController mo86542a(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "pipelineState");
        return Pipeline.Companion.startUIPipelineForResult$default(Pipeline.Companion, this.f175191a, pipelineState, "ImageLoader", (PipelineCallback) null, 8, (Object) null);
    }
}
