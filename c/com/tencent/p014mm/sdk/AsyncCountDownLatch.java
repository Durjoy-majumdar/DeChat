package com.tencent.p014mm.sdk;

import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/sdk/AsyncCountDownLatch;", "", "Lrx3/b0;", "countDown", "", "cancel", "Ljava/util/concurrent/atomic/AtomicInteger;", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/lang/Runnable;", "callback", "Ljava/lang/Runnable;", "getCallback", "()Ljava/lang/Runnable;", "setCallback", "(Ljava/lang/Runnable;)V", "", "<init>", "(I)V", "(ILjava/lang/Runnable;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.AsyncCountDownLatch */
public final class AsyncCountDownLatch {
    public Runnable callback;
    private final AtomicInteger count;

    public AsyncCountDownLatch(int i) {
        if (i > 0) {
            this.count = new AtomicInteger(i);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean cancel() {
        return this.count.getAndSet(-1) > 0;
    }

    public final void countDown() {
        if (this.count.decrementAndGet() == 0 && this.callback != null) {
            getCallback().run();
        }
    }

    public final Runnable getCallback() {
        Runnable runnable = this.callback;
        if (runnable != null) {
            return runnable;
        }
        C87412m.m108603p("callback");
        throw null;
    }

    public final void setCallback(Runnable runnable) {
        C87412m.m108594g(runnable, "<set-?>");
        this.callback = runnable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AsyncCountDownLatch(int i, Runnable runnable) {
        this(i);
        C87412m.m108594g(runnable, "callback");
        setCallback(runnable);
    }
}
