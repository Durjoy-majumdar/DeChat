package com.tencent.p014mm.sdk.systemservicecache;

import android.content.Context;
import android.net.NetworkInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import kotlin.Metadata;
import rx3.C13598b0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\r\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/sdk/systemservicecache/NetworkCache;", "Lcom/tencent/mm/sdk/systemservicecache/ISystemServiceCache;", "Landroid/content/Context;", "", "expt", "Lrx3/b0;", "setWifiCacheExpt", "setWapCacheExpt", "setNetworkCacheExpt", "ctx", "initCache", "updateCache", "isWifiFromCache", "isWapFromCache", "", "getIOSNetTypeFromCache", "Landroid/net/NetworkInfo;", "getActiveNetworkInfoFromCache", "", "TAG", "Ljava/lang/String;", "UPDATE_WIFI_CACHE_THREAD_NAME", "hasRegisteredNetworkBroadcast", "Z", "activeNetworkInfo", "Landroid/net/NetworkInfo;", "networkType", "I", "iosNetworkType", "wifiCacheExpt", "wapCacheExpt", "networkCacheExpt", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.systemservicecache.NetworkCache */
public final class NetworkCache implements ISystemServiceCache<Context> {
    public static final NetworkCache INSTANCE = new NetworkCache();
    private static final String TAG = "NetWorkCache";
    private static final String UPDATE_WIFI_CACHE_THREAD_NAME = "SystemServiceCallingCache-UpdateNetWorkCache";
    /* access modifiers changed from: private */
    public static NetworkInfo activeNetworkInfo;
    private static boolean hasRegisteredNetworkBroadcast;
    /* access modifiers changed from: private */
    public static int iosNetworkType = -100;
    private static boolean networkCacheExpt = true;
    /* access modifiers changed from: private */
    public static int networkType = -100;
    private static boolean wapCacheExpt = true;
    private static boolean wifiCacheExpt = true;

    private NetworkCache() {
    }

    public final NetworkInfo getActiveNetworkInfoFromCache(Context context) {
        if (!networkCacheExpt) {
            return NetStatusUtil.getActiveNetworkInfo(context);
        }
        if (activeNetworkInfo == null) {
            NetworkInfo activeNetworkInfo2 = NetStatusUtil.getActiveNetworkInfo(context);
            activeNetworkInfo = activeNetworkInfo2;
            return activeNetworkInfo2;
        }
        updateCache(context);
        Log.m105924i(TAG, "getActiveNetworkInfoFromCache");
        return activeNetworkInfo;
    }

    public final int getIOSNetTypeFromCache(Context context) {
        if (!networkCacheExpt) {
            return NetStatusUtil.getIOSNetType(context);
        }
        if (iosNetworkType == -100) {
            int iOSNetType = NetStatusUtil.getIOSNetType(context);
            iosNetworkType = iOSNetType;
            return iOSNetType;
        }
        updateCache(context);
        Log.m105924i(TAG, "getIOSNetTypeFromCache, iosNetworkType = " + iosNetworkType);
        return iosNetworkType;
    }

    public final boolean isWapFromCache(Context context) {
        if (!wapCacheExpt) {
            return NetStatusUtil.isWap(context);
        }
        if (networkType == -100) {
            int netType = NetStatusUtil.getNetType(context);
            networkType = netType;
            return NetStatusUtil.isWap(netType);
        }
        updateCache(context);
        return NetStatusUtil.isWap(networkType);
    }

    public final boolean isWifiFromCache(Context context) {
        if (!wifiCacheExpt) {
            return NetStatusUtil.isWifi(context);
        }
        if (networkType == -100) {
            int netType = NetStatusUtil.getNetType(context);
            networkType = netType;
            return NetStatusUtil.isWifi(netType);
        }
        updateCache(context);
        return NetStatusUtil.isWifi(networkType);
    }

    public final void setNetworkCacheExpt(boolean z) {
        networkCacheExpt = z;
    }

    public final void setWapCacheExpt(boolean z) {
        wapCacheExpt = z;
    }

    public final void setWifiCacheExpt(boolean z) {
        wifiCacheExpt = z;
    }

    public void initCache(Context context) {
        if (context == null) {
            Log.m105920e(TAG, "initCache error ctx is null");
            return;
        }
        synchronized (this) {
            Log.m105924i(TAG, "registerNetWorkBroadCastReceiver = " + hasRegisteredNetworkBroadcast);
            if (!hasRegisteredNetworkBroadcast) {
                ((C119157j) C119157j.f356862d).mo183875f(new NetworkCache$initCache$1$1(context));
                hasRegisteredNetworkBroadcast = true;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void updateCache(Context context) {
        ((C119157j) C119157j.f356862d).mo183876g(new NetworkCache$updateCache$1(context), UPDATE_WIFI_CACHE_THREAD_NAME);
    }
}
