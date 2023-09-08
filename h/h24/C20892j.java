package h24;

import d24.C106982e;
import d24.C116552g;
import d24.C20383a;
import d24.C20384a0;
import d24.C20387b0;
import d24.C20400e0;
import d24.C20414o;
import d24.C20421s;
import d24.C20423t;
import d24.C20425v;
import d24.C20431y;
import e24.C20509c;
import g24.C20783c;
import g24.C20785e;
import g24.C20788g;
import j24.C21155a;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: h24.j */
public final class C20892j implements C20423t {

    /* renamed from: a */
    public final C20425v f59031a;

    /* renamed from: b */
    public volatile C20788g f59032b;

    /* renamed from: c */
    public Object f59033c;

    /* renamed from: d */
    public volatile boolean f59034d;

    public C20892j(C20425v vVar, boolean z) {
        this.f59031a = vVar;
    }

    /* renamed from: a */
    public C20387b0 mo31952a(C20423t.C20424a aVar) {
        C20886c cVar;
        C20431y yVar = ((C20889g) aVar).f59021f;
        C20889g gVar = (C20889g) aVar;
        C106982e eVar = gVar.f59022g;
        C20414o oVar = gVar.f59023h;
        C20788g gVar2 = new C20788g(this.f59031a.f57304w, mo32603b(yVar.f57340a), eVar, oVar, this.f59033c);
        this.f59032b = gVar2;
        C20387b0 b0Var = null;
        int i = 0;
        while (!this.f59034d) {
            try {
                C20387b0 a = gVar.mo32602a(yVar, gVar2, (C20886c) null, (C20783c) null);
                if (b0Var != null) {
                    C20387b0.C20388a aVar2 = new C20387b0.C20388a(a);
                    C20387b0.C20388a aVar3 = new C20387b0.C20388a(b0Var);
                    aVar3.f57144g = null;
                    C20387b0 a2 = aVar3.mo31889a();
                    if (a2.f57131j == null) {
                        aVar2.f57147j = a2;
                        a = aVar2.mo31889a();
                    } else {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                }
                try {
                    C20431y c = mo32604c(a, gVar2.f58724c);
                    if (c == null) {
                        gVar2.mo32486g();
                        return a;
                    }
                    C20509c.m22197c(a.f57131j);
                    int i2 = i + 1;
                    if (i2 <= 20) {
                        if (!mo32607f(a, c.f57340a)) {
                            gVar2.mo32486g();
                            gVar2 = new C20788g(this.f59031a.f57304w, mo32603b(c.f57340a), eVar, oVar, this.f59033c);
                            this.f59032b = gVar2;
                        } else {
                            synchronized (gVar2.f58725d) {
                                cVar = gVar2.f58735n;
                            }
                            if (cVar != null) {
                                throw new IllegalStateException("Closing the body of " + a + " didn't close its backing stream. Bad interceptor?");
                            }
                        }
                        b0Var = a;
                        yVar = c;
                        i = i2;
                    } else {
                        gVar2.mo32486g();
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                } catch (IOException e) {
                    gVar2.mo32486g();
                    throw e;
                }
            } catch (C20785e e2) {
                if (!mo32605d(e2.f58711e, gVar2, false, yVar)) {
                    throw e2.f58710d;
                }
            } catch (IOException e3) {
                if (!mo32605d(e3, gVar2, !(e3 instanceof C21155a), yVar)) {
                    throw e3;
                }
            } catch (Throwable th) {
                gVar2.mo32487h((IOException) null);
                gVar2.mo32486g();
                throw th;
            }
        }
        gVar2.mo32486g();
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public final C20383a mo32603b(C20421s sVar) {
        C116552g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C20421s sVar2 = sVar;
        if (sVar2.f57265a.equals(C113600ck.f339986i)) {
            C20425v vVar = this.f59031a;
            SSLSocketFactory sSLSocketFactory2 = vVar.f57298q;
            HostnameVerifier hostnameVerifier2 = vVar.f57300s;
            gVar = vVar.f57301t;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        String str = sVar2.f57268d;
        int i = sVar2.f57269e;
        C20425v vVar2 = this.f59031a;
        return new C20383a(str, i, vVar2.f57305x, vVar2.f57297p, sSLSocketFactory, hostnameVerifier, gVar, vVar2.f57302u, (Proxy) null, vVar2.f57289e, vVar2.f57290f, vVar2.f57294j);
    }

    /* renamed from: c */
    public final C20431y mo32604c(C20387b0 b0Var, C20400e0 e0Var) {
        String b;
        C20421s.C20422a aVar;
        if (b0Var != null) {
            int i = b0Var.f57127f;
            String str = b0Var.f57125d.f57341b;
            C20384a0 a0Var = null;
            if (i == 307 || i == 308) {
                if (!str.equals("GET") && !str.equals("HEAD")) {
                    return null;
                }
            } else if (i == 401) {
                this.f59031a.f57303v.getClass();
                return null;
            } else if (i == 503) {
                C20387b0 b0Var2 = b0Var.f57134p;
                if ((b0Var2 == null || b0Var2.f57127f != 503) && mo32606e(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.f57125d;
                }
                return null;
            } else if (i != 407) {
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!this.f59031a.f57284A) {
                    return null;
                } else {
                    C20387b0 b0Var3 = b0Var.f57134p;
                    if ((b0Var3 == null || b0Var3.f57127f != 408) && mo32606e(b0Var, 0) <= 0) {
                        return b0Var.f57125d;
                    }
                    return null;
                }
            } else if (e0Var.f57200b.type() == Proxy.Type.HTTP) {
                this.f59031a.f57302u.getClass();
                return null;
            } else {
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (!this.f59031a.f57307z || (b = b0Var.mo31886b("Location")) == null) {
                return null;
            }
            C20421s sVar = b0Var.f57125d.f57340a;
            sVar.getClass();
            try {
                aVar = new C20421s.C20422a();
                aVar.mo31950b(sVar, b);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            C20421s a = aVar != null ? aVar.mo31949a() : null;
            if (a == null) {
                return null;
            }
            if (!a.f57265a.equals(b0Var.f57125d.f57340a.f57265a) && !this.f59031a.f57306y) {
                return null;
            }
            C20431y yVar = b0Var.f57125d;
            yVar.getClass();
            C20431y.C20432a aVar2 = new C20431y.C20432a(yVar);
            if (C20888f.m22972b(str)) {
                boolean equals = str.equals("PROPFIND");
                if (!str.equals("PROPFIND")) {
                    aVar2.mo31971c("GET", (C20384a0) null);
                } else {
                    if (equals) {
                        a0Var = null;
                        b0Var.f57125d.getClass();
                    }
                    aVar2.mo31971c(str, a0Var);
                }
                if (!equals) {
                    aVar2.mo31972d("Transfer-Encoding");
                    aVar2.mo31972d("Content-Length");
                    aVar2.mo31972d("Content-Type");
                }
            }
            if (!mo32607f(b0Var, a)) {
                aVar2.mo31972d("Authorization");
            }
            aVar2.mo31973e(a);
            return aVar2.mo31969a();
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if ((r3.f58721b < r3.f58720a.size()) == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32605d(java.io.IOException r3, g24.C20788g r4, boolean r5, d24.C20431y r6) {
        /*
            r2 = this;
            r4.mo32487h(r3)
            d24.v r0 = r2.f59031a
            boolean r0 = r0.f57284A
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            if (r5 == 0) goto L_0x0015
            r6.getClass()
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r6 = r3 instanceof java.net.ProtocolException
            r0 = 1
            if (r6 == 0) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L_0x0026
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L_0x0037
            if (r5 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0026:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x0033
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0039
        L_0x0037:
            r3 = 0
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            d24.e0 r3 = r4.f58724c
            if (r3 != 0) goto L_0x0078
            g24.f$a r3 = r4.f58723b
            if (r3 == 0) goto L_0x0054
            int r5 = r3.f58721b
            java.util.List<d24.e0> r3 = r3.f58720a
            int r3 = r3.size()
            if (r5 >= r3) goto L_0x0051
            r3 = 1
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            if (r3 != 0) goto L_0x0078
        L_0x0054:
            g24.f r3 = r4.f58729h
            int r4 = r3.f58717f
            java.util.List<java.net.Proxy> r5 = r3.f58716e
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            if (r4 != 0) goto L_0x0072
            java.util.List<d24.e0> r3 = r3.f58719h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r3 = 0
            goto L_0x0073
        L_0x0072:
            r3 = 1
        L_0x0073:
            if (r3 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r3 = 0
            goto L_0x0079
        L_0x0078:
            r3 = 1
        L_0x0079:
            if (r3 != 0) goto L_0x007c
            return r1
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h24.C20892j.mo32605d(java.io.IOException, g24.g, boolean, d24.y):boolean");
    }

    /* renamed from: e */
    public final int mo32606e(C20387b0 b0Var, int i) {
        String b = b0Var.mo31886b("Retry-After");
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public final boolean mo32607f(C20387b0 b0Var, C20421s sVar) {
        C20421s sVar2 = b0Var.f57125d.f57340a;
        return sVar2.f57268d.equals(sVar.f57268d) && sVar2.f57269e == sVar.f57269e && sVar2.f57265a.equals(sVar.f57265a);
    }
}
