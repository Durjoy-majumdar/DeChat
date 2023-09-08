package nw3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: nw3.i0 */
public class C109803i0 {
    /* renamed from: a */
    public static int m149217a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 4;
            }
            if (activeNetworkInfo.getSubtype() == 3) {
                return 3;
            }
            if (activeNetworkInfo.getSubtype() >= 1 && activeNetworkInfo.getSubtype() < 5) {
                return 1;
            }
            if (activeNetworkInfo.getSubtype() < 5 || activeNetworkInfo.getSubtype() >= 13) {
                return activeNetworkInfo.getSubtype() >= 13 ? 5 : 2;
            }
            return 3;
        } catch (Exception unused) {
        }
    }
}
