package gx3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: gx3.a */
public final class C87404a {

    /* renamed from: a */
    public static ConnectivityManager f253292a;

    /* renamed from: a */
    public static boolean m108578a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (f253292a == null) {
            f253292a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = f253292a;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        try {
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108579b(android.content.Context r2) {
        /*
            android.net.ConnectivityManager r0 = f253292a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            f253292a = r2
        L_0x000e:
            android.net.ConnectivityManager r2 = f253292a
            r0 = 0
            if (r2 != 0) goto L_0x0014
            return r0
        L_0x0014:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            r1 = 1
            if (r2 == 0) goto L_0x0022
            int r2 = r2.getType()
            if (r2 != r1) goto L_0x0022
            r0 = 1
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx3.C87404a.m108579b(android.content.Context):boolean");
    }
}
