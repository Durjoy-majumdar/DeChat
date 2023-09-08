package d24;

import d24.C106982e;
import d24.C20414o;
import e24.C20507a;
import e24.C20509c;
import g24.C20783c;
import g24.C20788g;
import java.lang.ref.Reference;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import l24.C117443g;
import m24.C117519a;
import n24.C117598c;
import n24.C88899d;

/* renamed from: d24.v */
public class C20425v implements Cloneable, C106982e.C106983a {

    /* renamed from: E */
    public static final List<C116554w> f57282E = C20509c.m22207m(C116554w.HTTP_2, C116554w.HTTP_1_1);

    /* renamed from: F */
    public static final List<C20407j> f57283F = C20509c.m22207m(C20407j.f57238e, C20407j.f57239f);

    /* renamed from: A */
    public final boolean f57284A;

    /* renamed from: B */
    public final int f57285B;

    /* renamed from: C */
    public final int f57286C;

    /* renamed from: D */
    public final int f57287D;

    /* renamed from: d */
    public final C20411m f57288d;

    /* renamed from: e */
    public final List<C116554w> f57289e;

    /* renamed from: f */
    public final List<C20407j> f57290f;

    /* renamed from: g */
    public final List<C20423t> f57291g;

    /* renamed from: h */
    public final List<C20423t> f57292h;

    /* renamed from: i */
    public final C20414o.C20416b f57293i;

    /* renamed from: j */
    public final ProxySelector f57294j;

    /* renamed from: n */
    public final C20409l f57295n;

    /* renamed from: o */
    public final C20389c f57296o;

    /* renamed from: p */
    public final SocketFactory f57297p;

    /* renamed from: q */
    public final SSLSocketFactory f57298q;

    /* renamed from: r */
    public final C117598c f57299r;

    /* renamed from: s */
    public final HostnameVerifier f57300s;

    /* renamed from: t */
    public final C116552g f57301t;

    /* renamed from: u */
    public final C20385b f57302u;

    /* renamed from: v */
    public final C20385b f57303v;

    /* renamed from: w */
    public final C20405i f57304w;

    /* renamed from: x */
    public final C20412n f57305x;

    /* renamed from: y */
    public final boolean f57306y;

    /* renamed from: z */
    public final boolean f57307z;

    /* renamed from: d24.v$a */
    public class C20426a extends C20507a {
        /* renamed from: a */
        public Socket mo31954a(C20405i iVar, C20383a aVar, C20788g gVar) {
            Iterator it = ((ArrayDeque) iVar.f57234d).iterator();
            while (it.hasNext()) {
                C20783c cVar = (C20783c) it.next();
                if (cVar.mo32473g(aVar, (C20400e0) null)) {
                    if ((cVar.f58701h != null) && cVar != gVar.mo32481b()) {
                        if (gVar.f58735n == null && ((ArrayList) gVar.f58731j.f58707n).size() == 1) {
                            Socket c = gVar.mo32482c(true, false, false);
                            gVar.f58731j = cVar;
                            ((ArrayList) cVar.f58707n).add((Reference) ((ArrayList) gVar.f58731j.f58707n).get(0));
                            return c;
                        }
                        throw new IllegalStateException();
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public C20783c mo31955b(C20405i iVar, C20383a aVar, C20788g gVar, C20400e0 e0Var) {
            Iterator it = ((ArrayDeque) iVar.f57234d).iterator();
            while (it.hasNext()) {
                C20783c cVar = (C20783c) it.next();
                if (cVar.mo32473g(aVar, e0Var)) {
                    gVar.mo32480a(cVar, true);
                    return cVar;
                }
            }
            return null;
        }
    }

    /* renamed from: d24.v$b */
    public static final class C20427b {

        /* renamed from: a */
        public C20411m f57308a = new C20411m();

        /* renamed from: b */
        public List<C116554w> f57309b = C20425v.f57282E;

        /* renamed from: c */
        public List<C20407j> f57310c = C20425v.f57283F;

        /* renamed from: d */
        public final List<C20423t> f57311d = new ArrayList();

        /* renamed from: e */
        public final List<C20423t> f57312e = new ArrayList();

        /* renamed from: f */
        public C20414o.C20416b f57313f = new C20417p(C20414o.f57256a);

        /* renamed from: g */
        public ProxySelector f57314g;

        /* renamed from: h */
        public C20409l f57315h;

        /* renamed from: i */
        public C20389c f57316i;

        /* renamed from: j */
        public SocketFactory f57317j;

        /* renamed from: k */
        public HostnameVerifier f57318k;

        /* renamed from: l */
        public C116552g f57319l;

        /* renamed from: m */
        public C20385b f57320m;

        /* renamed from: n */
        public C20385b f57321n;

        /* renamed from: o */
        public C20405i f57322o;

        /* renamed from: p */
        public C20412n f57323p;

        /* renamed from: q */
        public boolean f57324q;

        /* renamed from: r */
        public boolean f57325r;

        /* renamed from: s */
        public boolean f57326s;

        /* renamed from: t */
        public int f57327t;

        /* renamed from: u */
        public int f57328u;

        /* renamed from: v */
        public int f57329v;

        public C20427b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f57314g = proxySelector;
            if (proxySelector == null) {
                this.f57314g = new C117519a();
            }
            this.f57315h = C20409l.f57248a;
            this.f57317j = SocketFactory.getDefault();
            this.f57318k = C88899d.f256398a;
            this.f57319l = C116552g.f349551c;
            C20385b bVar = C20385b.f57124a;
            this.f57320m = bVar;
            this.f57321n = bVar;
            this.f57322o = new C20405i();
            this.f57323p = C20412n.f57255a;
            this.f57324q = true;
            this.f57325r = true;
            this.f57326s = true;
            this.f57327t = 10000;
            this.f57328u = 10000;
            this.f57329v = 10000;
        }
    }

    static {
        C20507a.f57727a = new C20426a();
    }

    public C20425v() {
        this(new C20427b());
    }

    /* renamed from: a */
    public C106982e mo31953a(C20431y yVar) {
        C20428x xVar = new C20428x(this, yVar, false);
        xVar.f57333g = ((C20417p) this.f57293i).f57257a;
        return xVar;
    }

    public C20425v(C20427b bVar) {
        boolean z;
        this.f57288d = bVar.f57308a;
        this.f57289e = bVar.f57309b;
        List<C20407j> list = bVar.f57310c;
        this.f57290f = list;
        this.f57291g = C20509c.m22206l(bVar.f57311d);
        this.f57292h = C20509c.m22206l(bVar.f57312e);
        this.f57293i = bVar.f57313f;
        this.f57294j = bVar.f57314g;
        this.f57295n = bVar.f57315h;
        this.f57296o = bVar.f57316i;
        this.f57297p = bVar.f57317j;
        Iterator<C20407j> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C20407j next = it.next();
                if (z || next.f57240a) {
                    z = true;
                }
            }
        }
        if (!z) {
            this.f57298q = null;
            this.f57299r = null;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            C117443g gVar = C117443g.f351507a;
                            SSLContext h = gVar.mo182131h();
                            h.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.f57298q = h.getSocketFactory();
                            this.f57299r = gVar.mo182128c(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw C20509c.m22195a("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw C20509c.m22195a("No System TLS", e2);
            }
        }
        SSLSocketFactory sSLSocketFactory = this.f57298q;
        if (sSLSocketFactory != null) {
            C117443g.f351507a.mo182142e(sSLSocketFactory);
        }
        this.f57300s = bVar.f57318k;
        C116552g gVar2 = bVar.f57319l;
        C117598c cVar = this.f57299r;
        this.f57301t = !C20509c.m22203i(gVar2.f349553b, cVar) ? new C116552g(gVar2.f349552a, cVar) : gVar2;
        this.f57302u = bVar.f57320m;
        this.f57303v = bVar.f57321n;
        this.f57304w = bVar.f57322o;
        this.f57305x = bVar.f57323p;
        this.f57306y = bVar.f57324q;
        this.f57307z = bVar.f57325r;
        this.f57284A = bVar.f57326s;
        this.f57285B = bVar.f57327t;
        this.f57286C = bVar.f57328u;
        this.f57287D = bVar.f57329v;
        if (this.f57291g.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f57291g);
        } else if (this.f57292h.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f57292h);
        }
    }
}
