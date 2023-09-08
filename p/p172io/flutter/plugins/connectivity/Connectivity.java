package p172io.flutter.plugins.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: io.flutter.plugins.connectivity.Connectivity */
public class Connectivity {
    private ConnectivityManager connectivityManager;

    public Connectivity(ConnectivityManager connectivityManager2) {
        this.connectivityManager = connectivityManager2;
    }

    private String getNetworkTypeLegacy() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? (type == 4 || type == 5) ? "mobile" : (type == 6 || type == 9) ? "wifi" : "none" : "wifi" : "mobile";
    }

    public ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public String getNetworkType() {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = null;
            try {
                networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
            } catch (Exception unused) {
            }
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
        }
        return getNetworkTypeLegacy();
    }
}
