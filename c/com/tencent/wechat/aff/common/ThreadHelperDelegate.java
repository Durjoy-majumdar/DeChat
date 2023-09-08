package com.tencent.wechat.aff.common;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "", "", "isMainThread", "Lcom/tencent/wechat/aff/common/FunctionRunnable;", "runnable", "Lrx3/b0;", "runInMainThread", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public interface ThreadHelperDelegate {
    boolean isMainThread();

    void runInMainThread(FunctionRunnable functionRunnable);
}
