package com.tencent.p014mm.sdk.storage;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/ISQLCancelable;", "", "", "isCanceled", "Lrx3/b0;", "throwIfCanceled", "cancel", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.ISQLCancelable */
public interface ISQLCancelable {
    void cancel();

    boolean isCanceled();

    void throwIfCanceled();
}
