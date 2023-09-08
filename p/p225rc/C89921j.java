package p225rc;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import p156gj.C87198e0;

/* renamed from: rc.j */
public class C89921j {
    /* renamed from: a */
    public static String m112462a() {
        int i = 0;
        try {
            i = C87198e0.m108253a();
        } catch (Exception e) {
            Log.m105921e("Luggage.LuggageNetUtil", "getSelfIp, call NetworkDetailInfo.getNetType(), exp = %s", e);
        }
        if (i == 0) {
            return "127.0.0.1";
        }
        if (i == 1) {
            return m112463b(MMApplicationContext.getContext());
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 != null) {
                            if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                                return Util.isNullOrNil(nextElement2.getHostAddress()) ? "127.0.0.1" : nextElement2.getHostAddress();
                            }
                        }
                    }
                    continue;
                }
            }
            return "127.0.0.1";
        } catch (Exception unused) {
            return "127.0.0.1";
        }
    }

    /* renamed from: b */
    public static String m112463b(Context context) {
        int wiFiIpAddress = ConnectivityCompat.Companion.getWiFiIpAddress();
        if (wiFiIpAddress == 0) {
            return "127.0.0.1";
        }
        return String.format("%d.%d.%d.%d", new Object[]{Integer.valueOf(wiFiIpAddress & 255), Integer.valueOf((wiFiIpAddress >> 8) & 255), Integer.valueOf((wiFiIpAddress >> 16) & 255), Integer.valueOf((wiFiIpAddress >> 24) & 255)});
    }
}
