package rv3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: rv3.f */
public class C118243f {
    /* renamed from: a */
    public static byte m166797a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTING || activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 0;
                    }
                    if (activeNetworkInfo.getType() != 0) {
                        return activeNetworkInfo.getType() == 9 ? (byte) 0 : -1;
                    }
                    if (Proxy.getDefaultHost() == null) {
                        return Proxy.getHost(context) != null ? (byte) 2 : 1;
                    }
                    return 2;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (C118245h.f353423a) {
                Log.m105921e("sensor_NetworkUtil", "", th);
            }
        }
    }
}
