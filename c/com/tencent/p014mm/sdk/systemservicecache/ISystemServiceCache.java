package com.tencent.p014mm.sdk.systemservicecache;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/systemservicecache/ISystemServiceCache;", "P", "", "p", "Lrx3/b0;", "initCache", "(Ljava/lang/Object;)V", "updateCache", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.systemservicecache.ISystemServiceCache */
public interface ISystemServiceCache<P> {
    void initCache(P p);

    void updateCache(P p);
}
