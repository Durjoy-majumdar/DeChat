package p172io.flutter.plugins.connectivity.patched;

import a14.C53872d1;
import a14.C53895h;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import gy3.C87412m;
import kotlin.Metadata;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "", "", "networkTypeLegacy", "networkType", "(Lwx3/d;)Ljava/lang/Object;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivity */
public final class PatchedConnectivity {
    private final ConnectivityManager connectivityManager;

    public PatchedConnectivity(ConnectivityManager connectivityManager2) {
        C87412m.m108594g(connectivityManager2, "connectivityManager");
        this.connectivityManager = connectivityManager2;
    }

    /* access modifiers changed from: private */
    public final String networkTypeLegacy() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (!(type == 4 || type == 5)) {
                    return (type == 6 || type == 9) ? "wifi" : "none";
                }
            }
        }
        return "mobile";
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public final Object networkType(C15601d<? super String> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new PatchedConnectivity$networkType$2(this, (C15601d<? super PatchedConnectivity$networkType$2>) null), dVar);
    }
}
