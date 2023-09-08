package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/net/Network;", "kotlin.jvm.PlatformType", "network", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/net/Network;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.utils.k2 */
final class C2041k2<InputType, ResultType> implements C80883e {
    static {
        new C2041k2();
    }

    public void invoke(Object obj, C1256g gVar) {
        Network network = (Network) obj;
        Log.m105924i("MicroMsg.AppBrand.WeChatConnectWifiWorkaround", "invoke#IPCAsyncInvokeTask, network: " + network);
        if (network != null) {
            Context context = MMApplicationContext.getContext();
            ConnectivityManager connectivityManager = null;
            Object systemService = context != null ? context.getSystemService("connectivity") : null;
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            }
            if (connectivityManager == null) {
                Log.m105928w("MicroMsg.AppBrand.WeChatConnectWifiWorkaround", "invoke#IPCAsyncInvokeTask, connectivityManager is null");
                return;
            }
            boolean bindProcessToNetwork = connectivityManager.bindProcessToNetwork(network);
            Log.m105924i("MicroMsg.AppBrand.WeChatConnectWifiWorkaround", "invoke#IPCAsyncInvokeTask, success: " + bindProcessToNetwork);
        }
    }
}
