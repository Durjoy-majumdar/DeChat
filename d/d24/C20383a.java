package d24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.xweb.file.XVFSFile;
import d24.C20421s;
import e24.C20509c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: d24.a */
public final class C20383a {

    /* renamed from: a */
    public final C20421s f57113a;

    /* renamed from: b */
    public final C20412n f57114b;

    /* renamed from: c */
    public final SocketFactory f57115c;

    /* renamed from: d */
    public final C20385b f57116d;

    /* renamed from: e */
    public final List<C116554w> f57117e;

    /* renamed from: f */
    public final List<C20407j> f57118f;

    /* renamed from: g */
    public final ProxySelector f57119g;

    /* renamed from: h */
    public final Proxy f57120h;

    /* renamed from: i */
    public final SSLSocketFactory f57121i;

    /* renamed from: j */
    public final HostnameVerifier f57122j;

    /* renamed from: k */
    public final C116552g f57123k;

    public C20383a(String str, int i, C20412n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C116552g gVar, C20385b bVar, Proxy proxy, List<C116554w> list, List<C20407j> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        C20412n nVar2 = nVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C20385b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        C20421s.C20422a aVar = new C20421s.C20422a();
        String str3 = sSLSocketFactory2 != null ? C113600ck.f339986i : "http";
        if (str3.equalsIgnoreCase("http")) {
            aVar.f57274a = "http";
        } else if (str3.equalsIgnoreCase(C113600ck.f339986i)) {
            aVar.f57274a = C113600ck.f339986i;
        } else {
            throw new IllegalArgumentException("unexpected scheme: " + str3);
        }
        if (str2 != null) {
            String b = C20509c.m22196b(C20421s.m21987j(str, 0, str.length(), false));
            if (b != null) {
                aVar.f57277d = b;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: " + i);
                }
                aVar.f57278e = i2;
                this.f57113a = aVar.mo31949a();
                if (nVar2 != null) {
                    this.f57114b = nVar2;
                    if (socketFactory2 != null) {
                        this.f57115c = socketFactory2;
                        if (bVar2 != null) {
                            this.f57116d = bVar2;
                            if (list != null) {
                                this.f57117e = C20509c.m22206l(list);
                                if (list2 != null) {
                                    this.f57118f = C20509c.m22206l(list2);
                                    if (proxySelector2 != null) {
                                        this.f57119g = proxySelector2;
                                        this.f57120h = proxy;
                                        this.f57121i = sSLSocketFactory2;
                                        this.f57122j = hostnameVerifier;
                                        this.f57123k = gVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }
        throw new NullPointerException("host == null");
    }

    /* renamed from: a */
    public boolean mo31881a(C20383a aVar) {
        return this.f57114b.equals(aVar.f57114b) && this.f57116d.equals(aVar.f57116d) && this.f57117e.equals(aVar.f57117e) && this.f57118f.equals(aVar.f57118f) && this.f57119g.equals(aVar.f57119g) && C20509c.m22203i(this.f57120h, aVar.f57120h) && C20509c.m22203i(this.f57121i, aVar.f57121i) && C20509c.m22203i(this.f57122j, aVar.f57122j) && C20509c.m22203i(this.f57123k, aVar.f57123k) && this.f57113a.f57269e == aVar.f57113a.f57269e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C20383a) {
            C20383a aVar = (C20383a) obj;
            return this.f57113a.equals(aVar.f57113a) && mo31881a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = (((((((((((C1883v2.CTRL_INDEX + this.f57113a.hashCode()) * 31) + this.f57114b.hashCode()) * 31) + this.f57116d.hashCode()) * 31) + this.f57117e.hashCode()) * 31) + this.f57118f.hashCode()) * 31) + this.f57119g.hashCode()) * 31;
        Proxy proxy = this.f57120h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f57121i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f57122j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C116552g gVar = this.f57123k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f57113a.f57268d);
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append(this.f57113a.f57269e);
        if (this.f57120h != null) {
            sb.append(", proxy=");
            sb.append(this.f57120h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f57119g);
        }
        sb.append("}");
        return sb.toString();
    }
}
