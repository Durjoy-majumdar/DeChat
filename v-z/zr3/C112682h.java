package zr3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import bs3.C104161b;
import bs3.C104162c;
import j20.C117292a;

/* renamed from: zr3.h */
public class C112682h {

    /* renamed from: a */
    public NetworkInfo f337399a = null;

    /* renamed from: b */
    public WifiInfo f337400b = null;

    /* renamed from: c */
    public int f337401c = 1;

    /* renamed from: a */
    public synchronized boolean mo164418a() {
        WifiInfo wifiInfo;
        int i;
        boolean z;
        WifiInfo wifiInfo2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C104162c.f308396a.getSystemService("connectivity");
            if (connectivityManager == null) {
                C104161b.m138997f("NetworkChangeMgr", "can't get ConnectivityManager");
                this.f337401c = 1;
                this.f337400b = null;
                this.f337399a = null;
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                this.f337401c = 1;
                this.f337400b = null;
                this.f337399a = null;
                return true;
            }
            C104161b.m138993b("NetworkChangeMgr", "NetworkChangeMgr ", activeNetworkInfo);
            if (!activeNetworkInfo.isConnected()) {
                wifiInfo = null;
                i = 1;
            } else if (activeNetworkInfo.getType() == 1) {
                wifiInfo = (WifiInfo) C117292a.m165363i((WifiManager) C104162c.f308396a.getSystemService("wifi"), "com/tencent/pb/common/network/NetworkChangeMgr", "isNetWorkChange", "()Z", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                i = 2;
            } else {
                i = 3;
                wifiInfo = null;
            }
            if (i == this.f337401c) {
                if (i != 1) {
                    if (i != 2) {
                        NetworkInfo networkInfo = this.f337399a;
                        if (networkInfo == null || networkInfo.getExtraInfo() == null || activeNetworkInfo.getExtraInfo() == null || !this.f337399a.getExtraInfo().equals(activeNetworkInfo.getExtraInfo()) || this.f337399a.getSubtype() != activeNetworkInfo.getSubtype() || this.f337399a.getType() != activeNetworkInfo.getType()) {
                            NetworkInfo networkInfo2 = this.f337399a;
                            if (networkInfo2 != null && networkInfo2.getExtraInfo() == null && activeNetworkInfo.getExtraInfo() == null && this.f337399a.getSubtype() == activeNetworkInfo.getSubtype() && this.f337399a.getType() == activeNetworkInfo.getType()) {
                            }
                        }
                    } else if (wifiInfo != null && (wifiInfo2 = this.f337400b) != null && wifiInfo2.getBSSID().equals(wifiInfo.getBSSID()) && this.f337400b.getSSID().equals(wifiInfo.getSSID()) && this.f337400b.getNetworkId() == wifiInfo.getNetworkId()) {
                    }
                }
                z = false;
                this.f337401c = i;
                this.f337400b = wifiInfo;
                this.f337399a = activeNetworkInfo;
                return z;
            }
            z = true;
            this.f337401c = i;
            this.f337400b = wifiInfo;
            this.f337399a = activeNetworkInfo;
            return z;
        } catch (Exception e) {
            C104161b.m138997f("NetworkChangeMgr", e);
            this.f337401c = 1;
            this.f337400b = null;
            this.f337399a = null;
            return true;
        }
    }
}
