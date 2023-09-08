package fj0;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.xweb.file.XVFSFile;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: fj0.p */
public class C86897p {

    /* renamed from: a */
    public static List<NetworkInterface> f252214a = new ArrayList();

    /* renamed from: a */
    public static String m107912a(String str, int i, String str2) {
        if (str2.startsWith("/")) {
            return HttpWrapperBase.PROTOCAL_HTTP + str + XVFSFile.PATH_SEPARATOR + i + str2;
        }
        return HttpWrapperBase.PROTOCAL_HTTP + str + XVFSFile.PATH_SEPARATOR + i + "/" + str2;
    }

    /* renamed from: b */
    public static String m107913b() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (!inetAddresses.hasMoreElements()) {
                        break;
                    }
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!(nextElement instanceof Inet6Address)) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!"127.0.0.1".equals(hostAddress)) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Objects.toString(e.getCause());
        }
        return str;
    }

    /* renamed from: c */
    public static List<NetworkInterface> m107914c() {
        ((ArrayList) f252214a).clear();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                Iterator<T> it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    Iterator<T> it4 = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((InetAddress) it4.next()).getHostAddress().startsWith("192.168")) {
                                ((ArrayList) f252214a).add(networkInterface);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return f252214a;
    }
}
