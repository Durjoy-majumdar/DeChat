package sp0;

import android.net.ConnectivityManager;
import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import sp0.C90275c0;

/* renamed from: sp0.e0 */
public final class C90286e0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C90275c0 f259177a;

    public C90286e0(C90275c0 c0Var) {
        this.f259177a = c0Var;
    }

    public void onAvailable(Network network) {
        C87412m.m108594g(network, "network");
        Log.m105924i("MicroMsg.NetworkProvider", "onAvailable, network: " + network);
        super.onAvailable(network);
        this.f259177a.f259153b = network;
        C90275c0 c0Var = this.f259177a;
        c0Var.getClass();
        Log.m105924i("MicroMsg.NetworkProvider", "consumePendingCallbacks, network: " + network);
        Iterator<C90275c0.C90276a> it = c0Var.f259152a.iterator();
        while (it.hasNext()) {
            it.next().mo13125a(network);
        }
        c0Var.f259152a.clear();
    }

    public void onLost(Network network) {
        C87412m.m108594g(network, "network");
        Log.m105924i("MicroMsg.NetworkProvider", "onLost, network: " + network);
        super.onLost(network);
        this.f259177a.f259153b = null;
    }

    public void onUnavailable() {
        Log.m105924i("MicroMsg.NetworkProvider", "onUnavailable");
        super.onUnavailable();
        this.f259177a.f259153b = null;
    }
}
