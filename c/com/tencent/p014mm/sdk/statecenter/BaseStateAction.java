package com.tencent.p014mm.sdk.statecenter;

import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "Lcom/tencent/mm/sdk/statecenter/IStateActionResult;", "T", "Lkotlin/Function1;", "Lrx3/b0;", "handler", "checkResult", "(Lfy3/l;)Lcom/tencent/mm/sdk/statecenter/IStateActionResult;", "result", "Lcom/tencent/mm/sdk/statecenter/IStateActionResult;", "getResult", "()Lcom/tencent/mm/sdk/statecenter/IStateActionResult;", "setResult", "(Lcom/tencent/mm/sdk/statecenter/IStateActionResult;)V", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.statecenter.BaseStateAction */
public abstract class BaseStateAction implements IStateAction {
    private IStateActionResult result;

    public final <T extends IStateActionResult> T checkResult(C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(lVar, "handler");
        if (getResult() == null) {
            return null;
        }
        C87412m.m108602o();
        throw null;
    }

    public IStateActionResult getResult() {
        return this.result;
    }

    public void setResult(IStateActionResult iStateActionResult) {
        this.result = iStateActionResult;
    }
}
