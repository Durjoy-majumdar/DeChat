package xu0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineFailAction;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.PipelineSuccessAction;
import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import n20.C100032b;
import n20.C100037j;
import p196ln.C76707h;
import vu0.C102292b;
import wb0.C102383c;

/* renamed from: xu0.f */
public final class C102730f extends C102725b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102730f(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public String getUniqueKey() {
        return state().getStringOrInterrupt("Common_ImageKey");
    }

    @PipelineFlow
    public BaseStateAction handleAvatarCheckExpired(PipelineState pipelineState, C102292b bVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        return super.handleAvatarCheckExpired(pipelineState, bVar);
    }

    @PipelineFlow
    public BaseStateAction handleAvatarImgFlag(PipelineState pipelineState, C102727d dVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(dVar, "action");
        return super.handleAvatarImgFlag(pipelineState, dVar);
    }

    @PipelineFlow
    public BaseStateAction handleConvertDataToBitmap(PipelineState pipelineState, C100032b bVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        Bitmap bitmap = bVar.f293061b;
        if (bitmap == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        ((C76707h) C86312j.m106911c(C76707h.class)).mo106984CO(bVar.f293060a, bitmap);
        Log.m105924i("MicroMsg.Avatar.AvatarLoadBitmapFlowPPC", "put small bitmap to cache " + bVar.f293060a);
        PipelineState pipelineState2 = new PipelineState();
        pipelineState2.put("Avatar_ImgBitmap", bitmap);
        return new PipelineSuccessAction(pipelineState2);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromFile(PipelineState pipelineState, C100037j jVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(jVar, "action");
        return super.handleDataFromFile(pipelineState, jVar);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromRemote(PipelineState pipelineState, C102383c cVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(cVar, "action");
        return super.handleDataFromRemote(pipelineState, cVar);
    }

    public BaseStateAction start(PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "state");
        String stringOrInterrupt = pipelineState.getStringOrInterrupt("Common_ImageKey");
        String stringOrInterrupt2 = pipelineState.getStringOrInterrupt("Avatar_Username");
        Bitmap W2 = ((C76707h) C86312j.m106911c(C76707h.class)).mo106988W2(stringOrInterrupt);
        if (W2 == null) {
            return new C78989c(stringOrInterrupt2);
        }
        Log.m105924i("MicroMsg.Avatar.AvatarLoadBitmapFlowPPC", "hit small bitmap cache " + stringOrInterrupt);
        PipelineState pipelineState2 = new PipelineState();
        pipelineState2.put("Avatar_ImgBitmap", W2);
        return new PipelineSuccessAction(pipelineState2);
    }
}
