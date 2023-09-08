package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineInitAction;", "Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "startAction", "(Lcom/tencent/mm/sdk/statecenter/BaseStateAction;)V", "getStartAction", "()Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.pipeline.PipelineInitAction */
public final class PipelineInitAction extends BaseStateAction {
    private final BaseStateAction startAction;

    public PipelineInitAction(BaseStateAction baseStateAction) {
        C87412m.m108594g(baseStateAction, "startAction");
        this.startAction = baseStateAction;
    }

    public final BaseStateAction getStartAction() {
        return this.startAction;
    }
}
