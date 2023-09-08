package p811d6;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* renamed from: d6.i */
public class C116596i extends ProxySelector {

    /* renamed from: d */
    public static final List<Proxy> f349645d = Arrays.asList(new Proxy[]{Proxy.NO_PROXY});

    /* renamed from: a */
    public final ProxySelector f349646a;

    /* renamed from: b */
    public final String f349647b;

    /* renamed from: c */
    public final int f349648c;

    public C116596i(ProxySelector proxySelector, String str, int i) {
        proxySelector.getClass();
        this.f349646a = proxySelector;
        str.getClass();
        this.f349647b = str;
        this.f349648c = i;
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f349646a.connectFailed(uri, socketAddress, iOException);
    }

    public List<Proxy> select(URI uri) {
        return this.f349647b.equals(uri.getHost()) && this.f349648c == uri.getPort() ? f349645d : this.f349646a.select(uri);
    }
}
