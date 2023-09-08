package xp0;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;
import xp0.C38798c;
import z04.C66731x;

/* renamed from: xp0.a */
public final class C38789a implements C38798c {

    /* renamed from: b */
    public static final boolean f104613b = (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED);

    /* renamed from: a */
    public final HashMap<C38791c, C38792a> f104614a = new HashMap<>();

    /* renamed from: xp0.a$b */
    public static final class C38790b implements C38798c.C38799a {

        /* renamed from: a */
        public final C38792a f104615a;

        public C38790b(C38792a aVar) {
            C87412m.m108594g(aVar, "job");
            this.f104615a = aVar;
        }

        /* renamed from: a */
        public byte[] mo61765a() {
            Log.m105924i("MicroMsg.Verify.DefaultCertNetFetcher", "waitForResult");
            try {
                return this.f104615a.mo61771c();
            } catch (C38797b e) {
                throw e;
            } catch (Exception e2) {
                throw new C38797b((Throwable) e2);
            }
        }
    }

    /* renamed from: xp0.a$c */
    public static final class C38791c {

        /* renamed from: a */
        public final String f104616a;

        /* renamed from: b */
        public final int f104617b;

        /* renamed from: c */
        public final int f104618c;

        public C38791c(String str, int i, int i2) {
            C87412m.m108594g(str, "url");
            this.f104616a = str;
            this.f104617b = i;
            this.f104618c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38791c)) {
                return false;
            }
            C38791c cVar = (C38791c) obj;
            return C87412m.m108589b(this.f104616a, cVar.f104616a) && this.f104617b == cVar.f104617b && this.f104618c == cVar.f104618c;
        }

        public int hashCode() {
            return (((this.f104616a.hashCode() * 31) + this.f104617b) * 31) + this.f104618c;
        }

        public String toString() {
            return "RequestParams(url=" + this.f104616a + ", timeoutMills=" + this.f104617b + ", maxRespBytes=" + this.f104618c + ')';
        }
    }

    /* renamed from: xp0.a$a */
    public static final class C38792a {

        /* renamed from: i */
        public static final C38793a f104619i = new C38793a((C8480h) null);

        /* renamed from: a */
        public final C38789a f104620a;

        /* renamed from: b */
        public final C38791c f104621b;

        /* renamed from: c */
        public final HashSet<C38790b> f104622c = new HashSet<>();

        /* renamed from: d */
        public boolean f104623d;

        /* renamed from: e */
        public final ReentrantLock f104624e;

        /* renamed from: f */
        public final Condition f104625f;

        /* renamed from: g */
        public C38793a.C38794a f104626g;

        /* renamed from: h */
        public Thread f104627h;

        /* renamed from: xp0.a$a$a */
        public static final class C38793a {

            /* renamed from: xp0.a$a$a$a */
            public static abstract class C38794a {

                /* renamed from: a */
                public final Object f104628a;

                /* renamed from: xp0.a$a$a$a$a */
                public static final class C38795a extends C38794a {
                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C38795a(C38797b bVar) {
                        super(bVar, (C8480h) null);
                        C87412m.m108594g(bVar, "fetchException");
                    }
                }

                /* renamed from: xp0.a$a$a$a$b */
                public static final class C38796b extends C38794a {
                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C38796b(byte[] bArr) {
                        super(bArr, (C8480h) null);
                        C87412m.m108594g(bArr, "data");
                    }
                }

                public C38794a(Object obj, C8480h hVar) {
                    this.f104628a = obj;
                }
            }

            public C38793a(C8480h hVar) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
                r5 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
                cy3.C58003b.m67160a(r3, r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
                throw r5;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static final byte[] m41931a(xp0.C38789a.C38792a.C38793a r3, java.io.InputStream r4, java.lang.Integer r5) {
                /*
                    r3.getClass()
                    java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r5 == 0) goto L_0x000e
                    int r5 = r5.intValue()
                    goto L_0x0010
                L_0x000e:
                    r5 = 4096(0x1000, float:5.74E-42)
                L_0x0010:
                    r3.<init>(r5)
                    r5 = 0
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0034 }
                    int r1 = r4.read(r0)     // Catch:{ all -> 0x0034 }
                L_0x001a:
                    r2 = -1
                    if (r2 == r1) goto L_0x0026
                    r2 = 0
                    r3.write(r0, r2, r1)     // Catch:{ all -> 0x0034 }
                    int r1 = r4.read(r0)     // Catch:{ all -> 0x0034 }
                    goto L_0x001a
                L_0x0026:
                    byte[] r4 = r3.toByteArray()     // Catch:{ all -> 0x0034 }
                    java.lang.String r0 = "outputStream.toByteArray()"
                    gy3.C87412m.m108593f(r4, r0)     // Catch:{ all -> 0x0034 }
                    cy3.C58003b.m67160a(r3, r5)
                    return r4
                L_0x0034:
                    r4 = move-exception
                    throw r4     // Catch:{ all -> 0x0036 }
                L_0x0036:
                    r5 = move-exception
                    cy3.C58003b.m67160a(r3, r4)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xp0.C38789a.C38792a.C38793a.m41931a(xp0.a$a$a, java.io.InputStream, java.lang.Integer):byte[]");
            }
        }

        public C38792a(C38789a aVar, C38791c cVar) {
            C87412m.m108594g(aVar, "fetcher");
            C87412m.m108594g(cVar, "reqParams");
            this.f104620a = aVar;
            this.f104621b = cVar;
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f104624e = reentrantLock;
            this.f104625f = reentrantLock.newCondition();
        }

        /* renamed from: a */
        public final void mo61769a(String str, int i, int i2) {
            ReentrantLock reentrantLock;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = C38789a.f104613b;
                if (z) {
                    Log.m105918d("MicroMsg.Verify.DefaultCertNetFetcher", "doExecute, urlStr: " + str + ", timeoutMills: " + i);
                }
                URL url = new URL(str);
                C38793a aVar = f104619i;
                if (C87412m.m108589b("http", url.getProtocol())) {
                    URLConnection openConnection = url.openConnection();
                    C87412m.m108592e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (!(300 == responseCode || 301 == responseCode || 302 == responseCode || 303 == responseCode || 307 == responseCode)) {
                        if (308 != responseCode) {
                            if (200 == responseCode) {
                                String headerField = httpURLConnection.getHeaderField("Content-Length");
                                Integer e = headerField != null ? C66731x.m78731e(headerField) : null;
                                if (z) {
                                    Log.m105918d("MicroMsg.Verify.DefaultCertNetFetcher", "doExecute, lenHint: " + e);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                C87412m.m108593f(inputStream, "connection.inputStream");
                                byte[] a = C38793a.m41931a(aVar, inputStream, e);
                                if (i2 >= a.length) {
                                    reentrantLock = this.f104624e;
                                    reentrantLock.lock();
                                    this.f104626g = new C38793a.C38794a.C38796b(a);
                                    this.f104625f.signalAll();
                                    C13598b0 b0Var = C13598b0.f38549a;
                                    reentrantLock.unlock();
                                    return;
                                }
                                throw new C38797b("Response body is too large.");
                            }
                            throw new C38797b("Response code " + responseCode + " is not OK.");
                        }
                    }
                    String headerField2 = httpURLConnection.getHeaderField("Location");
                    int elapsedRealtime2 = i - ((int) (SystemClock.elapsedRealtime() - elapsedRealtime));
                    if (elapsedRealtime2 > 0) {
                        Log.m105918d("MicroMsg.Verify.DefaultCertNetFetcher", "doExecute, do redirect");
                        mo61769a(headerField2, elapsedRealtime2, i2);
                    }
                    throw new C38797b("Fetch timeout.");
                }
                throw new C38797b("Protocol " + url.getProtocol() + " fetch is not supported.");
            } catch (Exception e2) {
                reentrantLock = this.f104624e;
                reentrantLock.lock();
                try {
                    this.f104626g = new C38793a.C38794a.C38795a(e2 instanceof C38797b ? (C38797b) e2 : new C38797b((Throwable) e2));
                    this.f104625f.signalAll();
                    C13598b0 b0Var2 = C13598b0.f38549a;
                } finally {
                    reentrantLock.unlock();
                }
            } finally {
            }
        }

        /* renamed from: b */
        public final byte[] mo61770b() {
            C38793a.C38794a aVar = this.f104626g;
            if (aVar == null) {
                return null;
            }
            if (aVar instanceof C38793a.C38794a.C38796b) {
                Object obj = aVar.f104628a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                return (byte[]) obj;
            }
            Object obj2 = aVar.f104628a;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.network.workaround.fetch.FetchException");
            throw ((C38797b) obj2);
        }

        /* renamed from: c */
        public final byte[] mo61771c() {
            ReentrantLock reentrantLock = this.f104624e;
            reentrantLock.lock();
            try {
                byte[] b = mo61770b();
                if (b != null) {
                    return b;
                }
                this.f104625f.await();
                byte[] b2 = mo61770b();
                C87412m.m108591d(b2);
                reentrantLock.unlock();
                return b2;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public C38798c.C38799a mo61764a(String str, int i, int i2) {
        T t;
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.Verify.DefaultCertNetFetcher", "fetchCaIssuers, url: " + str + ", timeoutMills: " + i + ", maxRespBytes: " + i2);
        C8479f0 f0Var = new C8479f0();
        synchronized (this) {
            C38791c cVar = new C38791c(str, i, i2);
            HashMap<C38791c, C38792a> hashMap = this.f104614a;
            t = hashMap.get(cVar);
            if (t == null) {
                t = new C38792a(this, cVar);
                hashMap.put(cVar, t);
            }
            f0Var.f27484d = t;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C38792a aVar = (C38792a) t;
        C38790b bVar = new C38790b(aVar);
        synchronized (aVar) {
            aVar.f104622c.add(bVar);
            if (!aVar.f104623d) {
                aVar.f104623d = true;
                boolean z = f104613b;
                if (z) {
                    aVar.f104627h = Thread.currentThread();
                }
                C38791c cVar2 = aVar.f104621b;
                aVar.mo61769a(cVar2.f104616a, cVar2.f104617b, cVar2.f104618c);
                C38789a aVar2 = aVar.f104620a;
                C38791c cVar3 = aVar.f104621b;
                synchronized (aVar2) {
                    if (z) {
                        Log.m105918d("MicroMsg.Verify.DefaultCertNetFetcher", "markJobDone, reqParams: " + cVar3);
                    }
                    aVar2.f104614a.remove(cVar3);
                }
            } else if (f104613b) {
                Log.m105918d("MicroMsg.Verify.DefaultCertNetFetcher", "execute, already started");
                if (C87412m.m108589b(Thread.currentThread(), aVar.f104627h)) {
                    throw new C38797b("execute is non-reentrant");
                }
            }
        }
        return bVar;
    }
}
