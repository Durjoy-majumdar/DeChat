package n20;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import wx3.C15601d;
import z04.C112551y;

/* renamed from: n20.k */
public final class C100038k extends ProcessorPipelineComponent<C100036i, C100037j> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100038k(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public Object processAction(PipelineState pipelineState, BaseStateAction baseStateAction, C15601d dVar) {
        byte[] bArr;
        C100036i iVar = (C100036i) baseStateAction;
        String string = pipelineState.getString("Common_TargetPath", "");
        if (C86013q1.m106450k(iVar.f293063b)) {
            bArr = C86013q1.m106433O(iVar.f293063b, 0, -1);
            if ((!C112551y.m153811k(string)) && !C86013q1.m106450k(string)) {
                C86013q1.m106443d(iVar.f293063b, string, true);
            }
        } else {
            bArr = (!C86013q1.m106450k(string) || C86013q1.m106443d(string, iVar.f293063b, true) <= 0) ? null : C86013q1.m106433O(iVar.f293063b, 0, -1);
        }
        return new C100037j(iVar.f293062a, iVar.f293063b, bArr);
    }
}
