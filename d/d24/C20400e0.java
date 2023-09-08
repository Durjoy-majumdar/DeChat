package d24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: d24.e0 */
public final class C20400e0 {

    /* renamed from: a */
    public final C20383a f57199a;

    /* renamed from: b */
    public final Proxy f57200b;

    /* renamed from: c */
    public final InetSocketAddress f57201c;

    public C20400e0(C20383a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f57199a = aVar;
            this.f57200b = proxy;
            this.f57201c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C20400e0) {
            C20400e0 e0Var = (C20400e0) obj;
            return e0Var.f57199a.equals(this.f57199a) && e0Var.f57200b.equals(this.f57200b) && e0Var.f57201c.equals(this.f57201c);
        }
    }

    public int hashCode() {
        return ((((C1883v2.CTRL_INDEX + this.f57199a.hashCode()) * 31) + this.f57200b.hashCode()) * 31) + this.f57201c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f57201c + "}";
    }
}
