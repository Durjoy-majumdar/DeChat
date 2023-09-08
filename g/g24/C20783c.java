package g24;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.xweb.file.XVFSFile;
import d24.C106982e;
import d24.C116554w;
import d24.C20383a;
import d24.C20384a0;
import d24.C20387b0;
import d24.C20400e0;
import d24.C20405i;
import d24.C20414o;
import d24.C20418q;
import d24.C20421s;
import d24.C20423t;
import d24.C20425v;
import d24.C20431y;
import e24.C20507a;
import e24.C20509c;
import gy3.C87412m;
import h24.C20886c;
import h24.C20887e;
import h24.C20889g;
import i24.C21046a;
import j24.C21156b;
import j24.C21161e;
import j24.C21162f;
import j24.C21164g;
import j24.C21184q;
import j24.C21188r;
import j24.C21193u;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import l24.C117443g;
import n24.C88899d;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21767i;
import o24.C21768j;
import o24.C21777r;

/* renamed from: g24.c */
public final class C20783c extends C21164g.C21169e {

    /* renamed from: b */
    public final C20405i f58695b;

    /* renamed from: c */
    public final C20400e0 f58696c;

    /* renamed from: d */
    public Socket f58697d;

    /* renamed from: e */
    public Socket f58698e;

    /* renamed from: f */
    public C20418q f58699f;

    /* renamed from: g */
    public C116554w f58700g;

    /* renamed from: h */
    public C21164g f58701h;

    /* renamed from: i */
    public C21768j f58702i;

    /* renamed from: j */
    public C21767i f58703j;

    /* renamed from: k */
    public boolean f58704k;

    /* renamed from: l */
    public int f58705l;

    /* renamed from: m */
    public int f58706m = 1;

    /* renamed from: n */
    public final List<Reference<C20788g>> f58707n = new ArrayList();

    /* renamed from: o */
    public long f58708o = MAlarmHandler.NEXT_FIRE_INTERVAL;

    public C20783c(C20405i iVar, C20400e0 e0Var) {
        this.f58695b = iVar;
        this.f58696c = e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001f, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32467a(j24.C21164g r5) {
        /*
            r4 = this;
            d24.i r0 = r4.f58695b
            monitor-enter(r0)
            monitor-enter(r5)     // Catch:{ all -> 0x0019 }
            j24.u r1 = r5.f59873y     // Catch:{ all -> 0x001b }
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.f59962a     // Catch:{ all -> 0x001b }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0014
            int[] r1 = r1.f59963b     // Catch:{ all -> 0x001b }
            r2 = 4
            r2 = r1[r2]     // Catch:{ all -> 0x001b }
        L_0x0014:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            r4.f58706m = r2     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r5 = move-exception
            goto L_0x001e
        L_0x001b:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20783c.mo32467a(j24.g):void");
    }

    /* renamed from: b */
    public void mo32468b(C21184q qVar) {
        qVar.mo33145c(C21156b.REFUSED_STREAM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0174, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0174, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0174, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0178 A[EDGE_INSN: B:107:0x0178->B:100:0x0178 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0144  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32469c(int r16, int r17, int r18, int r19, boolean r20, d24.C106982e r21, d24.C20414o r22) {
        /*
            r15 = this;
            r7 = r15
            r8 = r21
            r9 = r22
            d24.w r0 = r7.f58700g
            if (r0 != 0) goto L_0x0186
            d24.e0 r0 = r7.f58696c
            d24.a r0 = r0.f57199a
            java.util.List<d24.j> r1 = r0.f57118f
            g24.b r10 = new g24.b
            r10.<init>(r1)
            javax.net.ssl.SSLSocketFactory r2 = r0.f57121i
            if (r2 != 0) goto L_0x005f
            d24.j r0 = d24.C20407j.f57239f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0052
            d24.e0 r0 = r7.f58696c
            d24.a r0 = r0.f57199a
            d24.s r0 = r0.f57113a
            java.lang.String r0 = r0.f57268d
            l24.g r1 = l24.C117443g.f351507a
            boolean r1 = r1.mo182133k(r0)
            if (r1 == 0) goto L_0x0031
            goto L_0x0069
        L_0x0031:
            g24.e r1 = new g24.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0052:
            g24.e r0 = new g24.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.util.List<d24.w> r0 = r0.f57117e
            d24.w r1 = d24.C116554w.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0179
        L_0x0069:
            r11 = 0
            r12 = r11
        L_0x006b:
            r13 = 1
            r14 = 0
            d24.e0 r0 = r7.f58696c     // Catch:{ IOException -> 0x0109 }
            d24.a r1 = r0.f57199a     // Catch:{ IOException -> 0x0109 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f57121i     // Catch:{ IOException -> 0x0109 }
            if (r1 == 0) goto L_0x0087
            java.net.Proxy r0 = r0.f57200b     // Catch:{ IOException -> 0x0109 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x0109 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x0109 }
            if (r0 != r1) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0081:
            r1 = r16
            r2 = r17
            goto L_0x0106
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00a2
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r1.mo32471e(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0109 }
            java.net.Socket r0 = r7.f58697d     // Catch:{ IOException -> 0x0109 }
            if (r0 != 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            r1 = r16
            r2 = r17
            goto L_0x00a9
        L_0x00a2:
            r1 = r16
            r2 = r17
            r15.mo32470d(r1, r2, r8, r9)     // Catch:{ IOException -> 0x0105 }
        L_0x00a9:
            r3 = r19
            r15.mo32472f(r10, r3, r8, r9)     // Catch:{ IOException -> 0x0103 }
            d24.e0 r0 = r7.f58696c     // Catch:{ IOException -> 0x0103 }
            java.net.InetSocketAddress r0 = r0.f57201c     // Catch:{ IOException -> 0x0103 }
            r22.getClass()     // Catch:{ IOException -> 0x0103 }
        L_0x00b5:
            d24.e0 r0 = r7.f58696c
            d24.a r1 = r0.f57199a
            javax.net.ssl.SSLSocketFactory r1 = r1.f57121i
            if (r1 == 0) goto L_0x00c8
            java.net.Proxy r0 = r0.f57200b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            if (r13 == 0) goto L_0x00dd
            java.net.Socket r0 = r7.f58697d
            if (r0 == 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            g24.e r1 = new g24.e
            r1.<init>(r0)
            throw r1
        L_0x00dd:
            j24.g r0 = r7.f58701h
            if (r0 == 0) goto L_0x0102
            d24.i r1 = r7.f58695b
            monitor-enter(r1)
            j24.g r2 = r7.f58701h     // Catch:{ all -> 0x00ff }
            monitor-enter(r2)     // Catch:{ all -> 0x00ff }
            j24.u r0 = r2.f59873y     // Catch:{ all -> 0x00fc }
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r0.f59962a     // Catch:{ all -> 0x00fc }
            r4 = r4 & 16
            if (r4 == 0) goto L_0x00f7
            int[] r0 = r0.f59963b     // Catch:{ all -> 0x00fc }
            r3 = 4
            r3 = r0[r3]     // Catch:{ all -> 0x00fc }
        L_0x00f7:
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            r7.f58706m = r3     // Catch:{ all -> 0x00ff }
            monitor-exit(r1)     // Catch:{ all -> 0x00ff }
            goto L_0x0102
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ff }
            throw r0
        L_0x0102:
            return
        L_0x0103:
            r0 = move-exception
            goto L_0x010c
        L_0x0105:
            r0 = move-exception
        L_0x0106:
            r3 = r19
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            goto L_0x0081
        L_0x010c:
            java.net.Socket r4 = r7.f58698e
            e24.C20509c.m22198d(r4)
            java.net.Socket r4 = r7.f58697d
            e24.C20509c.m22198d(r4)
            r7.f58698e = r11
            r7.f58697d = r11
            r7.f58702i = r11
            r7.f58703j = r11
            r7.f58699f = r11
            r7.f58700g = r11
            r7.f58701h = r11
            d24.e0 r4 = r7.f58696c
            java.net.InetSocketAddress r4 = r4.f57201c
            r22.getClass()
            if (r12 != 0) goto L_0x0133
            g24.e r12 = new g24.e
            r12.<init>(r0)
            goto L_0x0142
        L_0x0133:
            java.io.IOException r4 = r12.f58710d
            java.lang.reflect.Method r5 = e24.C20509c.f57735g
            if (r5 == 0) goto L_0x0140
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0140 }
            r6[r14] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0140 }
            r5.invoke(r4, r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0140 }
        L_0x0140:
            r12.f58711e = r0
        L_0x0142:
            if (r20 == 0) goto L_0x0178
            r10.f58694d = r13
            boolean r4 = r10.f58693c
            if (r4 != 0) goto L_0x014b
            goto L_0x0174
        L_0x014b:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L_0x0150
            goto L_0x0174
        L_0x0150:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L_0x0155
            goto L_0x0174
        L_0x0155:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x0162
            java.lang.Throwable r5 = r0.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x0162
            goto L_0x0174
        L_0x0162:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x0167
            goto L_0x0174
        L_0x0167:
            if (r4 != 0) goto L_0x0173
            boolean r4 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r4 != 0) goto L_0x0173
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r13 = 0
        L_0x0173:
            r14 = r13
        L_0x0174:
            if (r14 == 0) goto L_0x0178
            goto L_0x006b
        L_0x0178:
            throw r12
        L_0x0179:
            g24.e r0 = new g24.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0186:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20783c.mo32469c(int, int, int, int, boolean, d24.e, d24.o):void");
    }

    /* renamed from: d */
    public final void mo32470d(int i, int i2, C106982e eVar, C20414o oVar) {
        C20400e0 e0Var = this.f58696c;
        Proxy proxy = e0Var.f57200b;
        this.f58697d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? e0Var.f57199a.f57115c.createSocket() : new Socket(proxy);
        InetSocketAddress inetSocketAddress = this.f58696c.f57201c;
        oVar.getClass();
        this.f58697d.setSoTimeout(i2);
        try {
            C117443g.f351507a.mo182130g(this.f58697d, this.f58696c.f57201c, i);
            try {
                this.f58702i = C21777r.m24935b(C21777r.m24940g(this.f58697d));
                this.f58703j = C21777r.m24934a(C21777r.m24937d(this.f58697d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f58696c.f57201c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: e */
    public final void mo32471e(int i, int i2, int i3, C106982e eVar, C20414o oVar) {
        C20431y.C20432a aVar = new C20431y.C20432a();
        aVar.mo31973e(this.f58696c.f57199a.f57113a);
        aVar.mo31971c("CONNECT", (C20384a0) null);
        aVar.f57347c.mo31938e("Host", C20509c.m22205k(this.f58696c.f57199a.f57113a, true));
        aVar.f57347c.mo31938e("Proxy-Connection", "Keep-Alive");
        aVar.f57347c.mo31938e("User-Agent", "okhttp/3.12.13");
        C20431y a = aVar.mo31969a();
        C20387b0.C20388a aVar2 = new C20387b0.C20388a();
        aVar2.f57138a = a;
        aVar2.f57139b = C116554w.HTTP_1_1;
        aVar2.f57140c = 407;
        aVar2.f57141d = "Preemptive Authenticate";
        aVar2.f57144g = C20509c.f57731c;
        aVar2.f57148k = -1;
        aVar2.f57149l = -1;
        aVar2.f57143f.mo31938e("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.mo31889a();
        this.f58696c.f57199a.f57116d.getClass();
        C20421s sVar = a.f57340a;
        mo32470d(i, i2, eVar, oVar);
        String str = "CONNECT " + C20509c.m22205k(sVar, true) + " HTTP/1.1";
        C21768j jVar = this.f58702i;
        C21046a aVar3 = new C21046a((C20425v) null, (C20788g) null, jVar, this.f58703j);
        C21762e0 f = jVar.mo32328f();
        long j = (long) i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f.mo34108g(j, timeUnit);
        this.f58703j.mo32770f().mo34108g((long) i3, timeUnit);
        aVar3.mo32768j(a.f57342c, str);
        aVar3.mo32597c();
        C20387b0.C20388a e = aVar3.mo32600e(false);
        e.f57138a = a;
        C20387b0 a2 = e.mo31889a();
        long a3 = C20887e.m22965a(a2);
        if (a3 == -1) {
            a3 = 0;
        }
        C21760d0 h = aVar3.mo32766h(a3);
        C20509c.m22211q(h, Integer.MAX_VALUE, timeUnit);
        ((C21046a.C21052f) h).close();
        int i4 = a2.f57127f;
        if (i4 != 200) {
            if (i4 == 407) {
                this.f58696c.f57199a.f57116d.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException("Unexpected response code for CONNECT: " + a2.f57127f);
        } else if (!this.f58702i.mo34147p().mo34134e0() || !this.f58703j.mo34147p().mo34134e0()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012c A[Catch:{ all -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0132 A[Catch:{ all -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32472f(g24.C20782b r7, int r8, d24.C106982e r9, d24.C20414o r10) {
        /*
            r6 = this;
            d24.w r9 = d24.C116554w.HTTP_1_1
            d24.e0 r0 = r6.f58696c
            d24.a r0 = r0.f57199a
            javax.net.ssl.SSLSocketFactory r1 = r0.f57121i
            if (r1 != 0) goto L_0x0025
            java.util.List<d24.w> r7 = r0.f57117e
            d24.w r10 = d24.C116554w.H2_PRIOR_KNOWLEDGE
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x001e
            java.net.Socket r7 = r6.f58697d
            r6.f58698e = r7
            r6.f58700g = r10
            r6.mo32475i(r8)
            return
        L_0x001e:
            java.net.Socket r7 = r6.f58697d
            r6.f58698e = r7
            r6.f58700g = r9
            return
        L_0x0025:
            r10.getClass()
            d24.e0 r10 = r6.f58696c
            d24.a r10 = r10.f57199a
            javax.net.ssl.SSLSocketFactory r0 = r10.f57121i
            r1 = 0
            java.net.Socket r2 = r6.f58697d     // Catch:{ AssertionError -> 0x0125 }
            d24.s r3 = r10.f57113a     // Catch:{ AssertionError -> 0x0125 }
            java.lang.String r4 = r3.f57268d     // Catch:{ AssertionError -> 0x0125 }
            int r3 = r3.f57269e     // Catch:{ AssertionError -> 0x0125 }
            r5 = 1
            java.net.Socket r0 = r0.createSocket(r2, r4, r3, r5)     // Catch:{ AssertionError -> 0x0125 }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ AssertionError -> 0x0125 }
            d24.j r7 = r7.mo32466a(r0)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            boolean r2 = r7.f57241b     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            if (r2 == 0) goto L_0x0051
            l24.g r2 = l24.C117443g.f351507a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.s r3 = r10.f57113a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r3 = r3.f57268d     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.util.List<d24.w> r4 = r10.f57117e     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r2.mo182126f(r0, r3, r4)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
        L_0x0051:
            r0.startHandshake()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            javax.net.ssl.SSLSession r2 = r0.getSession()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.q r3 = d24.C20418q.m21970a(r2)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            javax.net.ssl.HostnameVerifier r4 = r10.f57122j     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.s r5 = r10.f57113a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r5 = r5.f57268d     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            boolean r2 = r4.verify(r5, r2)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            if (r2 != 0) goto L_0x00d8
            java.util.List<java.security.cert.Certificate> r7 = r3.f57260c     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            boolean r8 = r7.isEmpty()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = "Hostname "
            if (r8 != 0) goto L_0x00ba
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.<init>()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.s r9 = r10.f57113a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = r9.f57268d     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = " not verified:\n    certificate: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = d24.C116552g.m164391b(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = "\n    DN: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.security.Principal r9 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = r9.getName()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = "\n    subjectAltNames: "
            r1.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.util.List r7 = n24.C88899d.m110979a(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r1.append(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r7 = r1.toString()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r8.<init>(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            throw r8     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
        L_0x00ba:
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r8.<init>()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r8.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.s r9 = r10.f57113a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = r9.f57268d     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r8.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r9 = " not verified (no certificates)"
            r8.append(r9)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r8 = r8.toString()     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r7.<init>(r8)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            throw r7     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
        L_0x00d8:
            d24.g r2 = r10.f57123k     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            d24.s r10 = r10.f57113a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r10 = r10.f57268d     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.util.List<java.security.cert.Certificate> r4 = r3.f57260c     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r2.mo180529a(r10, r4)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            boolean r7 = r7.f57241b     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            if (r7 == 0) goto L_0x00ed
            l24.g r7 = l24.C117443g.f351507a     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.lang.String r1 = r7.mo182127i(r0)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
        L_0x00ed:
            r6.f58698e = r0     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            o24.d0 r7 = o24.C21777r.m24940g(r0)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            o24.j r7 = o24.C21777r.m24935b(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r6.f58702i = r7     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            java.net.Socket r7 = r6.f58698e     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            o24.b0 r7 = o24.C21777r.m24937d(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            o24.i r7 = o24.C21777r.m24934a(r7)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r6.f58703j = r7     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            r6.f58699f = r3     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            if (r1 == 0) goto L_0x010d
            d24.w r9 = d24.C116554w.m164395a(r1)     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
        L_0x010d:
            r6.f58700g = r9     // Catch:{ AssertionError -> 0x0120, all -> 0x011e }
            l24.g r7 = l24.C117443g.f351507a
            r7.mo182144a(r0)
            d24.w r7 = r6.f58700g
            d24.w r9 = d24.C116554w.HTTP_2
            if (r7 != r9) goto L_0x011d
            r6.mo32475i(r8)
        L_0x011d:
            return
        L_0x011e:
            r7 = move-exception
            goto L_0x0134
        L_0x0120:
            r7 = move-exception
            r1 = r0
            goto L_0x0126
        L_0x0123:
            r7 = move-exception
            goto L_0x0133
        L_0x0125:
            r7 = move-exception
        L_0x0126:
            boolean r8 = e24.C20509c.m22209o(r7)     // Catch:{ all -> 0x0123 }
            if (r8 == 0) goto L_0x0132
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            r8.<init>(r7)     // Catch:{ all -> 0x0123 }
            throw r8     // Catch:{ all -> 0x0123 }
        L_0x0132:
            throw r7     // Catch:{ all -> 0x0123 }
        L_0x0133:
            r0 = r1
        L_0x0134:
            if (r0 == 0) goto L_0x013b
            l24.g r8 = l24.C117443g.f351507a
            r8.mo182144a(r0)
        L_0x013b:
            e24.C20509c.m22198d(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20783c.mo32472f(g24.b, int, d24.e, d24.o):void");
    }

    /* renamed from: g */
    public boolean mo32473g(C20383a aVar, C20400e0 e0Var) {
        if (((ArrayList) this.f58707n).size() < this.f58706m && !this.f58704k) {
            C20507a aVar2 = C20507a.f57727a;
            C20383a aVar3 = this.f58696c.f57199a;
            ((C20425v.C20426a) aVar2).getClass();
            if (!aVar3.mo31881a(aVar)) {
                return false;
            }
            if (aVar.f57113a.f57268d.equals(this.f58696c.f57199a.f57113a.f57268d)) {
                return true;
            }
            if (this.f58701h == null || e0Var == null || e0Var.f57200b.type() != Proxy.Type.DIRECT || this.f58696c.f57200b.type() != Proxy.Type.DIRECT || !this.f58696c.f57201c.equals(e0Var.f57201c) || e0Var.f57199a.f57122j != C88899d.f256398a || !mo32476j(aVar.f57113a)) {
                return false;
            }
            try {
                aVar.f57123k.mo180529a(aVar.f57113a.f57268d, this.f58699f.f57260c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public C20886c mo32474h(C20425v vVar, C20423t.C20424a aVar, C20788g gVar) {
        if (this.f58701h != null) {
            return new C21162f(vVar, aVar, gVar, this.f58701h);
        }
        this.f58698e.setSoTimeout(((C20889g) aVar).f59025j);
        C20889g gVar2 = (C20889g) aVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f58702i.mo32328f().mo34108g((long) gVar2.f59025j, timeUnit);
        this.f58703j.mo32770f().mo34108g((long) gVar2.f59026k, timeUnit);
        return new C21046a(vVar, gVar, this.f58702i, this.f58703j);
    }

    /* renamed from: i */
    public final void mo32475i(int i) {
        this.f58698e.setSoTimeout(0);
        C21164g.C21167c cVar = new C21164g.C21167c(true);
        Socket socket = this.f58698e;
        String str = this.f58696c.f57199a.f57113a.f57268d;
        C21768j jVar = this.f58702i;
        C21767i iVar = this.f58703j;
        cVar.f59881a = socket;
        cVar.f59882b = str;
        cVar.f59883c = jVar;
        cVar.f59884d = iVar;
        cVar.f59885e = this;
        cVar.f59886f = i;
        C21164g gVar = new C21164g(cVar);
        this.f58701h = gVar;
        C21188r rVar = gVar.f59852A;
        synchronized (rVar) {
            if (rVar.f59952h) {
                throw new IOException("closed");
            } else if (rVar.f59949e) {
                Logger logger = C21188r.f59947j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C20509c.m22204j(">> CONNECTION %s", C21161e.f59837a.mo34086g()));
                }
                C21767i iVar2 = rVar.f59948d;
                byte[] bArr = C21161e.f59837a.f61700f;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
                iVar2.write(copyOf);
                rVar.f59948d.flush();
            }
        }
        C21188r rVar2 = gVar.f59852A;
        C21193u uVar = gVar.f59872x;
        synchronized (rVar2) {
            if (!rVar2.f59952h) {
                rVar2.mo33155c(0, Integer.bitCount(uVar.f59962a) * 6, (byte) 4, (byte) 0);
                int i2 = 0;
                while (i2 < 10) {
                    if (((1 << i2) & uVar.f59962a) != 0) {
                        rVar2.f59948d.mo34122J0(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                        rVar2.f59948d.mo34150r0(uVar.f59963b[i2]);
                    }
                    i2++;
                }
                rVar2.f59948d.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = gVar.f59872x.mo33163a();
        if (a != 65535) {
            gVar.f59852A.mo33161j(0, (long) (a - 65535));
        }
        new Thread(gVar.f59853B).start();
    }

    /* renamed from: j */
    public boolean mo32476j(C20421s sVar) {
        int i = sVar.f57269e;
        C20421s sVar2 = this.f58696c.f57199a.f57113a;
        if (i != sVar2.f57269e) {
            return false;
        }
        if (sVar.f57268d.equals(sVar2.f57268d)) {
            return true;
        }
        C20418q qVar = this.f58699f;
        return qVar != null && C88899d.f256398a.mo123285c(sVar.f57268d, (X509Certificate) qVar.f57260c.get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f58696c.f57199a.f57113a.f57268d);
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append(this.f58696c.f57199a.f57113a.f57269e);
        sb.append(", proxy=");
        sb.append(this.f58696c.f57200b);
        sb.append(" hostAddress=");
        sb.append(this.f58696c.f57201c);
        sb.append(" cipherSuite=");
        C20418q qVar = this.f58699f;
        sb.append(qVar != null ? qVar.f57259b : "none");
        sb.append(" protocol=");
        sb.append(this.f58700g);
        sb.append('}');
        return sb.toString();
    }
}
