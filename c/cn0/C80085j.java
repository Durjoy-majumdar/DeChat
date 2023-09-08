package cn0;

import android.text.TextUtils;
import cn0.C80089l;
import dn0.C86358b;
import fn0.C86998c;
import fn0.C86999d;
import fn0.C87002g;
import fn0.C87003h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: cn0.j */
public class C80085j implements C80089l {

    /* renamed from: v */
    public static final Pattern f234538v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: w */
    public static final AtomicReference<byte[]> f234539w = new AtomicReference<>();

    /* renamed from: a */
    public String f234540a;

    /* renamed from: b */
    public final boolean f234541b;

    /* renamed from: c */
    public final int f234542c;

    /* renamed from: d */
    public final int f234543d;

    /* renamed from: e */
    public final String f234544e;

    /* renamed from: f */
    public final C87003h<String> f234545f;

    /* renamed from: g */
    public final HashMap<String, String> f234546g;

    /* renamed from: h */
    public final C80108s f234547h;

    /* renamed from: i */
    public final C86999d<Map<String, List<String>>> f234548i;

    /* renamed from: j */
    public C80081g f234549j;

    /* renamed from: k */
    public HttpURLConnection f234550k;

    /* renamed from: l */
    public InputStream f234551l;

    /* renamed from: m */
    public boolean f234552m;

    /* renamed from: n */
    public long f234553n;

    /* renamed from: o */
    public long f234554o;

    /* renamed from: p */
    public long f234555p;

    /* renamed from: q */
    public long f234556q;

    /* renamed from: r */
    public long f234557r;

    /* renamed from: s */
    public String f234558s;

    /* renamed from: t */
    public long f234559t;

    /* renamed from: u */
    public String f234560u;

    /* renamed from: cn0.j$a */
    public static class C80086a implements Callable<Integer> {

        /* renamed from: d */
        public HttpURLConnection f234561d;

        public C80086a(HttpURLConnection httpURLConnection) {
            this.f234561d = httpURLConnection;
        }

        public Object call() {
            return Integer.valueOf(this.f234561d.getResponseCode());
        }
    }

    public C80085j(String str, C87003h<String> hVar, C86999d<Map<String, List<String>>> dVar) {
        this(str, hVar, (C80108s) null, 30000, 12000, false, dVar);
    }

    /* renamed from: a */
    public long mo109835a() {
        return this.f234559t;
    }

    public long available() {
        return this.f234557r;
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        return mo110342k(gVar, (String) null);
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        try {
            mo110344m();
            return mo110343l(bArr, i, i2);
        } catch (IOException e) {
            throw new C80089l.C80090a(e, this.f234549j);
        }
    }

    public void close() {
        try {
            if (this.f234551l != null) {
                HttpURLConnection httpURLConnection = this.f234550k;
                long j = this.f234554o;
                if (j != -1) {
                    j -= this.f234556q;
                }
                C87002g.m108024r(httpURLConnection, j);
                this.f234551l.close();
                this.f234551l = null;
            }
            if (this.f234552m) {
                this.f234552m = false;
                C80108s sVar = this.f234547h;
                if (sVar != null) {
                    ((C80082h) sVar).mo110330b();
                }
            }
            mo110336f();
        } catch (IOException e) {
            throw new C80089l.C80090a(e, this.f234549j);
        } catch (Throwable th) {
            if (this.f234552m) {
                this.f234552m = false;
                C80108s sVar2 = this.f234547h;
                if (sVar2 != null) {
                    ((C80082h) sVar2).mo110330b();
                }
            }
            mo110336f();
            throw th;
        }
    }

    /* renamed from: d */
    public Map<String, List<String>> mo110334d() {
        List list;
        HttpURLConnection httpURLConnection = this.f234550k;
        Map<String, List<String>> headerFields = httpURLConnection == null ? null : httpURLConnection.getHeaderFields();
        C86999d<Map<String, List<String>>> dVar = this.f234548i;
        if (dVar == null) {
            return headerFields;
        }
        C86998c cVar = (C86998c) dVar;
        cVar.getClass();
        if (headerFields == null || (list = headerFields.get("Content-Type")) == null || list.size() <= 0) {
            return headerFields;
        }
        String str = (String) list.get(0);
        if (!str.equals("application/octet-stream") || TextUtils.isEmpty(cVar.f252476b)) {
            return headerFields;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : headerFields.entrySet()) {
            if (next.getKey() == null || !((String) next.getKey()).equals("Content-Type")) {
                hashMap.put((String) next.getKey(), (List) next.getValue());
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cVar.f252476b);
                hashMap.put("Content-Type", arrayList);
                String str2 = cVar.f252475a;
                C87002g.m108023q(5, str2, "fix Content-Type from " + str + " to " + cVar.f252476b, (Throwable) null);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public C87003h<String> mo110335e() {
        return this.f234545f;
    }

    /* renamed from: f */
    public final void mo110336f() {
        HttpURLConnection httpURLConnection = this.f234550k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f234550k = null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* renamed from: g */
    public final java.net.HttpURLConnection mo110337g(java.net.URL r8, long r9, long r11, boolean r13) {
        /*
            r7 = this;
            int r0 = fn0.C87002g.f252486a
            r0 = 0
            java.lang.String r1 = r8.getHost()     // Catch:{ Exception -> 0x0008 }
            goto L_0x000a
        L_0x0008:
            r1 = r0
        L_0x000a:
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r1 = r0
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            goto L_0x002e
        L_0x0019:
            boolean r4 = r1.isAnyLocalAddress()
            if (r4 != 0) goto L_0x002c
            boolean r4 = r1.isLoopbackAddress()
            if (r4 == 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            java.net.NetworkInterface r1 = java.net.NetworkInterface.getByInetAddress(r1)     // Catch:{ SocketException -> 0x002e }
            if (r1 == 0) goto L_0x002e
        L_0x002c:
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x003a
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.URLConnection r1 = r8.openConnection(r1)
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            goto L_0x0040
        L_0x003a:
            java.net.URLConnection r1 = r8.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
        L_0x0040:
            int r4 = r7.f234542c
            r1.setConnectTimeout(r4)
            int r4 = r7.f234543d
            r1.setReadTimeout(r4)
            r1.setDoOutput(r3)
            boolean r4 = r1 instanceof javax.net.ssl.HttpsURLConnection
            if (r4 == 0) goto L_0x009b
            an0.a r4 = an0.C79592a.m96648a()
            boolean r4 = r4.f233404g
            if (r4 != 0) goto L_0x009b
            r4 = r1
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            javax.net.ssl.TrustManager[] r2 = new javax.net.ssl.TrustManager[r2]
            fn0.j r5 = new fn0.j
            r5.<init>()
            r2[r3] = r5
            java.lang.String r3 = "SSL"
            javax.net.ssl.SSLContext r3 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ Exception -> 0x0083 }
            java.security.SecureRandom r5 = new java.security.SecureRandom     // Catch:{ Exception -> 0x0083 }
            r5.<init>()     // Catch:{ Exception -> 0x0083 }
            r3.init(r0, r2, r5)     // Catch:{ Exception -> 0x0083 }
            javax.net.ssl.SSLSocketFactory r2 = r3.getSocketFactory()     // Catch:{ Exception -> 0x0083 }
            r4.setSSLSocketFactory(r2)     // Catch:{ Exception -> 0x0083 }
            fn0.k r2 = new fn0.k     // Catch:{ Exception -> 0x0083 }
            r2.<init>()     // Catch:{ Exception -> 0x0083 }
            r4.setHostnameVerifier(r2)     // Catch:{ Exception -> 0x0083 }
            goto L_0x009b
        L_0x0083:
            r2 = move-exception
            r3 = 6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "disableSSLCertVerify failed "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "SSLUtil"
            fn0.C87002g.m108023q(r3, r4, r2, r0)
        L_0x009b:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r7.f234546g
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r7.f234546g     // Catch:{ all -> 0x014e }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x014e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x014e }
        L_0x00a8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x014e }
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x014e }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x014e }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x014e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x014e }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x014e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x014e }
            r1.setRequestProperty(r5, r4)     // Catch:{ all -> 0x014e }
            goto L_0x00a8
        L_0x00c4:
            monitor-exit(r2)     // Catch:{ all -> 0x014e }
            r2 = 0
            r4 = -1
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00d1
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0103
        L_0x00d1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "bytes="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "-"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00fe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            long r9 = r9 + r11
            r11 = 1
            long r9 = r9 - r11
            r3.append(r9)
            java.lang.String r2 = r3.toString()
        L_0x00fe:
            java.lang.String r9 = "Range"
            r1.setRequestProperty(r9, r2)
        L_0x0103:
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = r7.f234544e
            r1.setRequestProperty(r9, r10)
            if (r13 != 0) goto L_0x0113
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r10 = "identity"
            r1.setRequestProperty(r9, r10)
        L_0x0113:
            r9 = 4
            java.lang.String r10 = r7.mo110340i()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "send upstream request: \r\n"
            r11.append(r12)
            java.lang.String r12 = r1.getRequestMethod()
            r11.append(r12)
            java.lang.String r12 = " "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = "\r\n"
            r11.append(r8)
            java.util.Map r8 = r1.getRequestProperties()
            java.lang.String r8 = fn0.C87000e.m108001a(r8)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.String r8 = fn0.C87002g.m108029w(r8, r0)
            fn0.C87002g.m108023q(r9, r10, r8, r0)
            return r1
        L_0x014e:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.C80085j.mo110337g(java.net.URL, long, long, boolean):java.net.HttpURLConnection");
    }

    public C86358b getFileType() {
        return C86358b.m106987a(this.f234558s);
    }

    public String getUri() {
        HttpURLConnection httpURLConnection = this.f234550k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getURL().toString();
    }

    /* renamed from: h */
    public C80081g mo110339h() {
        return this.f234549j;
    }

    /* renamed from: i */
    public String mo110340i() {
        return this.f234560u + this.f234540a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0150 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection mo110341j(cn0.C80081g r21) {
        /*
            r20 = this;
            r8 = r20
            r0 = r21
            java.net.URL r2 = new java.net.URL
            android.net.Uri r1 = r0.f234519a
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            long r9 = r0.f234521c
            long r11 = r0.f234522d
            int r1 = r0.f234524f
            r13 = 1
            r1 = r1 & r13
            r14 = 0
            if (r1 == 0) goto L_0x001c
            r15 = 1
            goto L_0x001d
        L_0x001c:
            r15 = 0
        L_0x001d:
            boolean r1 = r8.f234541b
            if (r1 != 0) goto L_0x002b
            r1 = r20
            r3 = r9
            r5 = r11
            r7 = r15
            java.net.HttpURLConnection r0 = r1.mo110337g(r2, r3, r5, r7)
            return r0
        L_0x002b:
            r2.toExternalForm()
            java.lang.System.currentTimeMillis()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5 = r2
            r1 = 0
            r16 = 0
        L_0x003a:
            int r6 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x01dc
            r1 = r20
            r2 = r5
            r3 = r9
            r18 = r5
            r17 = r6
            r5 = r11
            r19 = r7
            r7 = r15
            java.net.HttpURLConnection r1 = r1.mo110337g(r2, r3, r5, r7)
            r1.setInstanceFollowRedirects(r14)
            r1.connect()
            r2 = 5
            r3 = 0
            cn0.j$a r4 = new cn0.j$a     // Catch:{ InterruptedException -> 0x01c1, ExecutionException -> 0x019a }
            r4.<init>(r1)     // Catch:{ InterruptedException -> 0x01c1, ExecutionException -> 0x019a }
            int r5 = r8.f234543d     // Catch:{ InterruptedException -> 0x01c1, ExecutionException -> 0x019a }
            java.lang.String r6 = "GetResponseCodeCallable"
            java.lang.String r7 = r20.mo110340i()     // Catch:{ InterruptedException -> 0x01c1, ExecutionException -> 0x019a }
            java.lang.Object r4 = fn0.C87008m.m108034a(r4, r5, r13, r6, r7)     // Catch:{ InterruptedException -> 0x01c1, ExecutionException -> 0x019a }
            if (r4 == 0) goto L_0x0158
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x00ab
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x00ab
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x00ab
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x00ab
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x00ab
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x008a
            goto L_0x00ab
        L_0x008a:
            if (r16 <= 0) goto L_0x00aa
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.f233411n
            if (r0 == 0) goto L_0x00aa
            java.lang.System.currentTimeMillis()
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.f233411n
            java.util.Iterator r2 = r19.iterator()
            java.lang.String r3 = "|"
            fn0.C87002g.m108021o(r2, r3)
            r0.getClass()
        L_0x00aa:
            return r1
        L_0x00ab:
            int r16 = r16 + 1
            java.lang.String r4 = "Location"
            java.lang.String r4 = r1.getHeaderField(r4)
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00c2 }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x00c2 }
            java.lang.String r5 = r5.getHost()     // Catch:{ MalformedURLException -> 0x00c2 }
            r6 = r19
            r6.add(r5)     // Catch:{ MalformedURLException -> 0x00c4 }
            goto L_0x00dc
        L_0x00c2:
            r6 = r19
        L_0x00c4:
            java.lang.String r5 = r20.mo110340i()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "MalformedURLException url="
            r7.append(r13)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            fn0.C87002g.m108023q(r2, r5, r7, r3)
        L_0x00dc:
            r1.disconnect()
            if (r4 == 0) goto L_0x0150
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r4)
            if (r1 == 0) goto L_0x00f0
            java.net.URL r1 = new java.net.URL
            r1.<init>(r4)
            r5 = r1
            r2 = r18
            goto L_0x00f8
        L_0x00f0:
            java.net.URL r1 = new java.net.URL
            r2 = r18
            r1.<init>(r2, r4)
            r5 = r1
        L_0x00f8:
            java.lang.String r1 = r5.getProtocol()
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0124
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x010d
            goto L_0x0124
        L_0x010d:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported protocol redirect: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0124:
            r1 = 2
            java.lang.String r4 = r20.mo110340i()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "redirect to url="
            r7.append(r13)
            java.lang.String r13 = r5.toString()
            r7.append(r13)
            java.lang.String r13 = ", fromUrl="
            r7.append(r13)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            fn0.C87002g.m108023q(r1, r4, r2, r3)
            r7 = r6
            r1 = r17
            r13 = 1
            goto L_0x003a
        L_0x0150:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)
            throw r0
        L_0x0158:
            r20.mo110336f()
            cn0.l$h r1 = new cn0.l$h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getResponseCode TimeoutException Unable to connect to "
            r2.append(r3)
            android.net.Uri r3 = r0.f234519a
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = " within "
            r2.append(r3)
            int r3 = r8.f234543d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getResponseCode Timeout "
            r4.append(r5)
            int r5 = r8.f234543d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            r1.<init>(r2, r3, r0)
            throw r1
        L_0x019a:
            r0 = move-exception
            java.lang.String r1 = r20.mo110340i()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "GetResponseCodeCallable ExecutionException "
            r4.append(r5)
            java.lang.String r0 = fn0.C87002g.m108014h(r0, r14)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            fn0.C87002g.m108023q(r2, r1, r0, r3)
            cn0.l$b r0 = new cn0.l$b
            cn0.g r1 = r8.f234549j
            java.lang.String r2 = "Failed To Execute GetResponseCodeCallable"
            r0.<init>(r2, r1)
            throw r0
        L_0x01c1:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 4
            java.lang.String r1 = r20.mo110340i()
            java.lang.String r2 = "GetResponseCodeCallable Interrupted"
            fn0.C87002g.m108023q(r0, r1, r2, r3)
            cn0.l$b r0 = new cn0.l$b
            cn0.g r1 = r8.f234549j
            java.lang.String r2 = "GetResponseCodeCallable interrupted"
            r0.<init>(r2, r1)
            throw r0
        L_0x01dc:
            r17 = r6
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Too many redirects: "
            r1.append(r2)
            r2 = r17
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.C80085j.mo110341j(cn0.g):java.net.HttpURLConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0139, code lost:
        if (r8 != 0) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0204 A[SYNTHETIC, Splitter:B:70:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo110342k(cn0.C80081g r26, java.lang.String r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r27
            r1.f234549j = r2
            r3 = 0
            r1.f234556q = r3
            r1.f234555p = r3
            java.net.HttpURLConnection r5 = r25.mo110341j(r26)     // Catch:{ InterruptedIOException -> 0x0372, IOException -> 0x0354 }
            r1.f234550k = r5     // Catch:{ InterruptedIOException -> 0x0372, IOException -> 0x0354 }
            if (r0 == 0) goto L_0x0019
            r5.setRequestMethod(r0)     // Catch:{ InterruptedIOException -> 0x0372, IOException -> 0x0354 }
        L_0x0019:
            r5 = 0
            r6 = 6
            r7 = 0
            java.net.HttpURLConnection r0 = r1.f234550k     // Catch:{ SocketTimeoutException -> 0x0333, InterruptedIOException -> 0x0312, IOException -> 0x02f1, ArrayIndexOutOfBoundsException -> 0x02c3 }
            int r0 = r0.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0333, InterruptedIOException -> 0x0312, IOException -> 0x02f1, ArrayIndexOutOfBoundsException -> 0x02c3 }
            r8 = 4
            java.lang.String r9 = r25.mo110340i()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "uri="
            r10.append(r11)
            java.lang.String r11 = r26.toString()
            r10.append(r11)
            java.lang.String r11 = ", response header: \r\n"
            r10.append(r11)
            java.net.HttpURLConnection r11 = r1.f234550k
            java.util.Map r11 = r11.getHeaderFields()
            java.lang.String r11 = fn0.C87000e.m108001a(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = fn0.C87002g.m108029w(r10, r7)
            fn0.C87002g.m108023q(r8, r9, r10, r7)
            r8 = 200(0xc8, float:2.8E-43)
            if (r0 < r8) goto L_0x02b4
            r9 = 299(0x12b, float:4.19E-43)
            if (r0 > r9) goto L_0x02b4
            java.net.HttpURLConnection r9 = r1.f234550k
            java.lang.String r9 = r9.getContentType()
            java.net.HttpURLConnection r10 = r1.f234550k
            java.util.Map r10 = r10.getHeaderFields()
            fn0.h<java.lang.String> r11 = r1.f234545f
            r12 = 5
            r13 = 1
            if (r11 == 0) goto L_0x00f4
            fn0.f r11 = (fn0.C87001f) r11
            r11.getClass()
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x00e1
            java.lang.String r11 = r9.toLowerCase()
            java.lang.String r14 = "video"
            boolean r14 = r11.startsWith(r14)
            if (r14 == 0) goto L_0x0089
            goto L_0x00df
        L_0x0089:
            java.lang.String r14 = "audio"
            boolean r14 = r11.startsWith(r14)
            if (r14 == 0) goto L_0x0092
            goto L_0x00df
        L_0x0092:
            an0.a r14 = an0.C79592a.m96648a()
            r14.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.String r15 = "video/mp4"
            java.lang.String r16 = "video/3gp"
            java.lang.String r17 = "audio/mp4"
            java.lang.String r18 = "application/octet-stream"
            java.lang.String r19 = "binary/octet-stream"
            java.lang.String r20 = "video/mpeg"
            java.lang.String r21 = "application/vnd.apple.mpegurl"
            java.lang.String r22 = "application/x-mpeg"
            java.lang.String r23 = "application/x-mpegURL"
            java.lang.String r24 = "video/MP2T"
            java.lang.String[] r15 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.List r15 = java.util.Arrays.asList(r15)
            r14.<init>(r15)
            java.util.Iterator r14 = r14.iterator()
        L_0x00c2:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00e8
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 == 0) goto L_0x00d5
            goto L_0x00c2
        L_0x00d5:
            java.lang.String r15 = r15.toLowerCase()
            boolean r15 = r11.startsWith(r15)
            if (r15 == 0) goto L_0x00c2
        L_0x00df:
            r5 = 1
            goto L_0x00e8
        L_0x00e1:
            java.lang.String r11 = "PassOnVideoType"
            java.lang.String r14 = "contentType is null"
            fn0.C87002g.m108023q(r12, r11, r14, r7)
        L_0x00e8:
            if (r5 == 0) goto L_0x00eb
            goto L_0x00f4
        L_0x00eb:
            r25.mo110336f()
            cn0.l$e r0 = new cn0.l$e
            r0.<init>(r9, r10, r2)
            throw r0
        L_0x00f4:
            r1.f234558s = r9
            fn0.d<java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r5 = r1.f234548i
            if (r5 == 0) goto L_0x0133
            fn0.c r5 = (fn0.C86998c) r5
            r5.getClass()
            java.lang.String r10 = "application/octet-stream"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0131
            java.lang.String r10 = r5.f252476b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0131
            java.lang.String r10 = r5.f252475a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "fix contentType from "
            r11.append(r14)
            r11.append(r9)
            java.lang.String r9 = " to "
            r11.append(r9)
            java.lang.String r9 = r5.f252476b
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            fn0.C87002g.m108023q(r12, r10, r9, r7)
            java.lang.String r9 = r5.f252476b
        L_0x0131:
            r1.f234558s = r9
        L_0x0133:
            if (r0 != r8) goto L_0x013c
            long r8 = r2.f234521c
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r8 = r3
        L_0x013d:
            r1.f234553n = r8
            int r0 = r2.f234524f
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0289
            java.net.HttpURLConnection r0 = r1.f234550k
            java.lang.String r5 = r25.mo110340i()
            java.lang.String r10 = "Content-Length"
            java.lang.String r11 = r0.getHeaderField(r10)
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r15 = "Unexpected Content-Length ["
            java.lang.String r8 = "]"
            if (r14 != 0) goto L_0x0176
            long r18 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0161 }
            r6 = r18
            goto L_0x0178
        L_0x0161:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r15)
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            fn0.C87002g.m108023q(r6, r5, r9, r7)
        L_0x0176:
            r6 = -1
        L_0x0178:
            java.lang.String r14 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r14)
            boolean r18 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r9 = "Unexpected Content-Range ["
            if (r18 != 0) goto L_0x01f2
            java.util.regex.Pattern r12 = f234538v
            java.util.regex.Matcher r12 = r12.matcher(r0)
            boolean r20 = r12.find()
            if (r20 == 0) goto L_0x01f2
            r3 = 2
            java.lang.String r3 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x01db }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01db }
            java.lang.String r12 = r12.group(r13)     // Catch:{ NumberFormatException -> 0x01db }
            long r22 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x01db }
            long r3 = r3 - r22
            r22 = 1
            long r3 = r3 + r22
            r20 = 0
            int r12 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x01b1
            r6 = r3
            goto L_0x01f2
        L_0x01b1:
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x01f2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01db }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x01db }
            java.lang.String r13 = "Inconsistent headers ["
            r12.append(r13)     // Catch:{ NumberFormatException -> 0x01db }
            r12.append(r11)     // Catch:{ NumberFormatException -> 0x01db }
            java.lang.String r11 = "] ["
            r12.append(r11)     // Catch:{ NumberFormatException -> 0x01db }
            r12.append(r0)     // Catch:{ NumberFormatException -> 0x01db }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x01db }
            java.lang.String r11 = r12.toString()     // Catch:{ NumberFormatException -> 0x01db }
            r12 = 5
            r13 = 0
            fn0.C87002g.m108023q(r12, r5, r11, r13)     // Catch:{ NumberFormatException -> 0x01db }
            long r6 = java.lang.Math.max(r6, r3)     // Catch:{ NumberFormatException -> 0x01db }
            goto L_0x01f2
        L_0x01db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = r3.toString()
            r3 = 6
            r4 = 0
            fn0.C87002g.m108023q(r3, r5, r0, r4)
        L_0x01f2:
            r1.f234557r = r6
            java.net.HttpURLConnection r0 = r1.f234550k
            java.lang.String r4 = r25.mo110340i()
            java.lang.String r5 = r0.getHeaderField(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0220
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0209 }
            goto L_0x0222
        L_0x0209:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            r6.append(r5)
            r6.append(r8)
            java.lang.String r5 = r6.toString()
            r3 = 6
            r6 = 0
            fn0.C87002g.m108023q(r3, r4, r5, r6)
        L_0x0220:
            r5 = -1
        L_0x0222:
            java.lang.String r0 = r0.getHeaderField(r14)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x026e
            java.util.regex.Pattern r7 = f234538v
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r10 = r7.find()
            if (r10 == 0) goto L_0x026c
            r10 = 3
            java.lang.String r7 = r7.group(r10)     // Catch:{ NumberFormatException -> 0x0255 }
            long r10 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0255 }
            r12 = 0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x0249
            r5 = r10
            goto L_0x026e
        L_0x0249:
            r12 = -1
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x026c
            long r3 = java.lang.Math.max(r5, r10)     // Catch:{ NumberFormatException -> 0x0255 }
            r5 = r3
            goto L_0x026e
        L_0x0255:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = r5.toString()
            r3 = 6
            r5 = 0
            fn0.C87002g.m108023q(r3, r4, r0, r5)
        L_0x026c:
            r5 = -1
        L_0x026e:
            r1.f234559t = r5
            long r3 = r2.f234522d
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x027a
            r8 = r3
            goto L_0x0286
        L_0x027a:
            long r3 = r1.f234557r
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0285
            long r5 = r1.f234553n
            long r8 = r3 - r5
            goto L_0x0286
        L_0x0285:
            r8 = r5
        L_0x0286:
            r1.f234554o = r8
            goto L_0x0293
        L_0x0289:
            r5 = -1
            long r3 = r2.f234522d
            r1.f234554o = r3
            r1.f234557r = r3
            r1.f234559t = r5
        L_0x0293:
            java.net.HttpURLConnection r0 = r1.f234550k     // Catch:{ IOException -> 0x02aa }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x02aa }
            r1.f234551l = r0     // Catch:{ IOException -> 0x02aa }
            r0 = 1
            r1.f234552m = r0
            cn0.s r0 = r1.f234547h
            if (r0 == 0) goto L_0x02a7
            cn0.h r0 = (cn0.C80082h) r0
            r0.mo110331c()
        L_0x02a7:
            long r2 = r1.f234554o
            return r2
        L_0x02aa:
            r0 = move-exception
            r25.mo110336f()
            cn0.l$a r3 = new cn0.l$a
            r3.<init>((java.io.IOException) r0, (cn0.C80081g) r2)
            throw r3
        L_0x02b4:
            java.net.HttpURLConnection r3 = r1.f234550k
            java.util.Map r3 = r3.getHeaderFields()
            r25.mo110336f()
            cn0.l$f r4 = new cn0.l$f
            r4.<init>(r0, r3, r2)
            throw r4
        L_0x02c3:
            r0 = move-exception
            r25.mo110336f()
            java.lang.String r3 = r25.mo110340i()
            java.lang.String r0 = fn0.C87002g.m108014h(r0, r5)
            r4 = 6
            r5 = 0
            fn0.C87002g.m108023q(r4, r3, r0, r5)
            cn0.l$g r0 = new cn0.l$g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getResponseCode Got malformed response when connect to "
            r3.append(r4)
            android.net.Uri r4 = r2.f234519a
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x02f1:
            r0 = move-exception
            r25.mo110336f()
            cn0.l$h r3 = new cn0.l$h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getResponseCode IOException Unable to connect to "
            r4.append(r5)
            android.net.Uri r5 = r2.f234519a
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x0312:
            r0 = move-exception
            r25.mo110336f()
            cn0.l$b r3 = new cn0.l$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getResponseCode InterruptedIOException Interrupt connection to "
            r4.append(r5)
            android.net.Uri r5 = r2.f234519a
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x0333:
            r0 = move-exception
            r25.mo110336f()
            cn0.l$h r3 = new cn0.l$h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getResponseCode SocketTimeoutException Unable to connect to "
            r4.append(r5)
            android.net.Uri r5 = r2.f234519a
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x0354:
            r0 = move-exception
            cn0.l$h r3 = new cn0.l$h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "makeConnection IOException Unable to connect to "
            r4.append(r5)
            android.net.Uri r5 = r2.f234519a
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x0372:
            r0 = move-exception
            cn0.l$b r3 = new cn0.l$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "makeConnection InterruptedIOException Interrupt connection to "
            r4.append(r5)
            android.net.Uri r5 = r2.f234519a
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.C80085j.mo110342k(cn0.g, java.lang.String):long");
    }

    /* renamed from: l */
    public final int mo110343l(byte[] bArr, int i, int i2) {
        long j = this.f234554o;
        if (j != -1) {
            i2 = (int) Math.min((long) i2, j - this.f234556q);
        }
        if (i2 == 0) {
            return -1;
        }
        int read = this.f234551l.read(bArr, i, i2);
        if (read == -1) {
            long j2 = this.f234554o;
            if (j2 == -1 || j2 == this.f234556q) {
                return -1;
            }
            throw new EOFException();
        }
        this.f234556q += (long) read;
        C80108s sVar = this.f234547h;
        if (sVar != null) {
            ((C80082h) sVar).mo110329a(read);
        }
        return read;
    }

    /* renamed from: m */
    public final void mo110344m() {
        if (this.f234555p != this.f234553n) {
            byte[] andSet = f234539w.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            mo110340i();
            while (true) {
                long j = this.f234555p;
                long j2 = this.f234553n;
                if (j != j2) {
                    int min = (int) Math.min(j2 - j, (long) andSet.length);
                    mo110340i();
                    int read = this.f234551l.read(andSet, 0, min);
                    mo110340i();
                    if (Thread.interrupted()) {
                        throw new C80089l.C80092c("skipInternal interrupted", this.f234549j);
                    } else if (read != -1) {
                        this.f234555p += (long) read;
                        C80108s sVar = this.f234547h;
                        if (sVar != null) {
                            ((C80082h) sVar).mo110329a(read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f234539w.set(andSet);
                    return;
                }
            }
        }
    }

    public C80085j(String str, C87003h<String> hVar, C80108s sVar, int i, int i2, boolean z, C86999d<Map<String, List<String>>> dVar) {
        this.f234540a = "DefaultHttpDataSource";
        this.f234557r = -1;
        this.f234559t = -1;
        this.f234560u = "";
        if (!TextUtils.isEmpty(str)) {
            this.f234544e = str;
            this.f234545f = hVar;
            this.f234547h = sVar;
            this.f234546g = new HashMap<>();
            this.f234542c = i;
            this.f234543d = i2;
            this.f234541b = z;
            this.f234548i = dVar;
            return;
        }
        throw new IllegalArgumentException();
    }
}
