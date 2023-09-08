package com.tencent.p014mm.sdk.statecenter;

import com.tencent.p014mm.sdk.statecenter.IStateAction;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/StateActionHandler;", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "T", "", "action", "Lrx3/b0;", "handle", "(Lcom/tencent/mm/sdk/statecenter/IStateAction;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.statecenter.StateActionHandler */
public interface StateActionHandler<T extends IStateAction> {
    void handle(T t);
}
