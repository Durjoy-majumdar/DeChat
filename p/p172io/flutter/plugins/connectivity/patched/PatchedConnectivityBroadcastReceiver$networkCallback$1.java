package p172io.flutter.plugins.connectivity.patched;

import android.net.ConnectivityManager;
import android.net.Network;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo182094d2 = {"io/flutter/plugins/connectivity/patched/PatchedConnectivityBroadcastReceiver$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lrx3/b0;", "onAvailable", "onLost", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$networkCallback$1 */
public final class PatchedConnectivityBroadcastReceiver$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ PatchedConnectivityBroadcastReceiver this$0;

    public PatchedConnectivityBroadcastReceiver$networkCallback$1(PatchedConnectivityBroadcastReceiver patchedConnectivityBroadcastReceiver) {
        this.this$0 = patchedConnectivityBroadcastReceiver;
    }

    public void onAvailable(Network network) {
        C87412m.m108594g(network, "network");
        this.this$0.sendEvent();
    }

    public void onLost(Network network) {
        C87412m.m108594g(network, "network");
        this.this$0.sendEvent();
    }
}
