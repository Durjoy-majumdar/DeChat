package zr3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import bs3.C104161b;
import bs3.C104162c;

/* renamed from: zr3.i */
public final class C112683i {
    /* renamed from: a */
    public static boolean m154066a() {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) C104162c.f308396a.getSystemService("connectivity");
        } catch (Exception unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            try {
                C104161b.m138997f("getSystemService(Context.CONNECTIVITY_SERVICE) null", new Object[0]);
            } catch (Exception unused2) {
                return true;
            }
        } else {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (Throwable th) {
                C104161b.m138997f("getActiveNetworkInfo exception:", th);
            }
        }
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isConnected();
    }
}
