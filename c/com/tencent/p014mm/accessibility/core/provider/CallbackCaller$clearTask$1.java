package com.tencent.p014mm.accessibility.core.provider;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.CallbackCaller$clearTask$1 */
public final class CallbackCaller$clearTask$1 implements Runnable {
    public static final CallbackCaller$clearTask$1 INSTANCE = new CallbackCaller$clearTask$1();

    public final void run() {
        CallbackCaller.hoverViewId = -1;
    }
}
