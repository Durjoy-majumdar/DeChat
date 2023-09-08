package m01;

import gy3.C87412m;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: m01.b */
public final class C34456b {
    /* renamed from: a */
    public static final String m40354a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            C87412m.m108593f(networkInterfaces, "getNetworkInterfaces()");
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                C87412m.m108593f(nextElement, "en.nextElement()");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                C87412m.m108593f(inetAddresses, "intf.inetAddresses");
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        C87412m.m108593f(nextElement2, "enumIpAddr.nextElement()");
                        InetAddress inetAddress = nextElement2;
                        if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                            return inetAddress.getHostAddress().toString();
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
