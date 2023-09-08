package xu0;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import n20.C100036i;
import n20.C100037j;
import wx3.C15601d;

/* renamed from: xu0.g */
public final class C102731g extends ProcessorPipelineComponent<C100036i, C100037j> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102731g(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public Object processAction(PipelineState pipelineState, BaseStateAction baseStateAction, C15601d dVar) {
        C100036i iVar = (C100036i) baseStateAction;
        return new C100037j(iVar.f293062a, iVar.f293063b, C86013q1.m106450k(iVar.f293063b) ? C86013q1.m106433O(iVar.f293063b, 0, -1) : null);
    }
}
