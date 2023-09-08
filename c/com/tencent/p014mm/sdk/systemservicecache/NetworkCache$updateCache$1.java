package com.tencent.p014mm.sdk.systemservicecache;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.systemservicecache.NetworkCache$updateCache$1 */
public final class NetworkCache$updateCache$1 implements Runnable {
    public final /* synthetic */ Context $ctx;

    public NetworkCache$updateCache$1(Context context) {
        this.$ctx = context;
    }

    public final void run() {
        try {
            NetworkCache networkCache = NetworkCache.INSTANCE;
            NetworkCache.activeNetworkInfo = NetStatusUtil.getActiveNetworkInfo(this.$ctx);
            if (NetworkCache.activeNetworkInfo != null) {
                NetworkCache.networkType = NetStatusUtil.getNetType(NetworkCache.activeNetworkInfo);
                NetworkCache.iosNetworkType = NetStatusUtil.getIOSNetType(NetworkCache.activeNetworkInfo);
            }
        } catch (Throwable th) {
            Log.m105920e("NetWorkCache", "UpdateNetWorkCache error : " + th.getMessage());
        }
        Log.m105924i("NetWorkCache", "UpdateNetWorkCache updateCache, networkType = " + NetworkCache.networkType + ", iosNetworkType = " + NetworkCache.iosNetworkType);
    }
}