package com.tencent.p014mm.plugin.appbrand.networking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/networking/NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1", "Landroid/content/BroadcastReceiver;", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 */
public final class NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ NetworkServiceBySystemReceiver f244337a;

    public NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1(NetworkServiceBySystemReceiver networkServiceBySystemReceiver) {
        this.f244337a = networkServiceBySystemReceiver;
    }

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        this.f244337a.mo125665c();
    }
}
