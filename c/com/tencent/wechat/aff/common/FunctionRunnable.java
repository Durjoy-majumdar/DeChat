package com.tencent.wechat.aff.common;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002H R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/wechat/aff/common/FunctionRunnable;", "Ljava/lang/Runnable;", "Lrx3/b0;", "run", "nativeRun", "", "nativePointer", "J", "getNativePointer", "()J", "setNativePointer", "(J)V", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class FunctionRunnable implements Runnable {
    private long nativePointer;

    public final long getNativePointer() {
        return this.nativePointer;
    }

    public final native void nativeRun();

    public void run() {
        nativeRun();
    }

    public final void setNativePointer(long j) {
        this.nativePointer = j;
    }
}
