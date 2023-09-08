package com.tencent.p014mm.sdk.event;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/EmptyMvvmEvent;", "Lcom/tencent/mm/sdk/event/BaseMvvmEvent;", "", "Lrx3/b0;", "publish", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.EmptyMvvmEvent */
public abstract class EmptyMvvmEvent extends BaseMvvmEvent<Object> {
    public final void publish() {
        publish(new Object());
    }
}
