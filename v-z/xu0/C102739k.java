package xu0;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineFailAction;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.PipelineSuccessAction;
import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C8480h;
import gy3.C87412m;
import vu0.C102292b;
import wb0.C102382b;
import wb0.C102383c;

/* renamed from: xu0.k */
public final class C102739k extends C102725b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102739k(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    @PipelineFlow
    public BaseStateAction handleAvatarCheckExpired(PipelineState pipelineState, C102292b bVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        C86009m1 m1Var = (C86009m1) pipelineState.getOrInterrupt("Common_TempFolder");
        String stringOrInterrupt = pipelineState.getStringOrInterrupt("Avatar_Username");
        int ordinal = bVar.f301271a.ordinal();
        if (ordinal == 0) {
            String i = new C86009m1(m1Var, bVar.f301272b).mo119971i();
            C87412m.m108593f(i, "VFSFile(tempFolder, action.checkKey).absolutePath");
            PipelineState pipelineState2 = new PipelineState();
            pipelineState2.put("Avatar_HdImgPath", i);
            return new PipelineSuccessAction(pipelineState2);
        } else if (ordinal != 1) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        } else {
            String i2 = new C86009m1(m1Var, bVar.f301272b).mo119971i();
            C87412m.m108593f(i2, "VFSFile(tempFolder, action.checkKey).absolutePath");
            return new C102382b(stringOrInterrupt, i2);
        }
    }

    @PipelineFlow
    public BaseStateAction handleAvatarImgFlag(PipelineState pipelineState, C102727d dVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(dVar, "action");
        return super.handleAvatarImgFlag(pipelineState, dVar);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromRemote(PipelineState pipelineState, C102383c cVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(cVar, "action");
        if (cVar.f301544c == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        PipelineState pipelineState2 = new PipelineState();
        pipelineState2.put("Avatar_HdImgPath", cVar.f301543b);
        return new PipelineSuccessAction(pipelineState2);
    }

    public BaseStateAction start(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "state");
        return new C78989c(pipelineState.getStringOrInterrupt("Avatar_Username"));
    }
}
