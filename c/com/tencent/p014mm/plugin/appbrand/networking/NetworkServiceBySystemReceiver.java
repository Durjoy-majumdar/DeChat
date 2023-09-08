package com.tencent.p014mm.plugin.appbrand.networking;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import rx3.C13598b0;
import zp0.C91833o;

/* renamed from: com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver */
public final class NetworkServiceBySystemReceiver extends C91833o {

    /* renamed from: f */
    public final String f244335f = "Luggage.WXA.NetworkServiceBySystemReceiver";

    /* renamed from: g */
    public final NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 f244336g = new NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkServiceBySystemReceiver(AppBrandRuntime appBrandRuntime) {
        super(appBrandRuntime);
        C87412m.m108594g(appBrandRuntime, "rt");
    }

    /* renamed from: a */
    public void mo109766a() {
        super.mo109766a();
        try {
            Context context = MMApplicationContext.getContext();
            C87412m.m108591d(context);
            context.unregisterReceiver(this.f244336g);
        } catch (Throwable th) {
            String str = this.f244335f;
            Log.m105920e(str, "unregister network receiver, t=" + th);
        }
    }

    /* renamed from: b */
    public void mo109767b() {
        super.mo109767b();
        try {
            Context context = MMApplicationContext.getContext();
            C87412m.m108591d(context);
            NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 networkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 = this.f244336g;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C13598b0 b0Var = C13598b0.f38549a;
            context.registerReceiver(networkServiceBySystemReceiver$mNetworkStateChangedReceiver$1, intentFilter);
        } catch (Throwable th) {
            String str = this.f244335f;
            Log.m105920e(str, "register network receiver, t=" + th);
        }
    }
}
