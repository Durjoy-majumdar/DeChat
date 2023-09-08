package d24;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import d24.C20419r;
import e24.C20509c;
import e24.C86420d;
import f24.C20648c;
import f24.C20650e;
import f24.C20658g;
import gy3.C87412m;
import h24.C20887e;
import h24.C20893k;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k24.C117371a;
import l24.C117443g;
import o24.C21754b0;
import o24.C21760d0;
import o24.C21765g;
import o24.C21766h;
import o24.C21767i;
import o24.C21768j;
import o24.C21769k;
import o24.C21771l;
import o24.C21772m;
import o24.C21777r;
import o24.C21781v;
import o24.C21783x;

/* renamed from: d24.c */
public final class C20389c implements Closeable, Flushable {

    /* renamed from: d */
    public final C20658g f57150d = new C20390a();

    /* renamed from: e */
    public final C20650e f57151e;

    /* renamed from: d24.c$a */
    public class C20390a implements C20658g {
        public C20390a() {
        }
    }

    /* renamed from: d24.c$b */
    public final class C20391b implements C20648c {

        /* renamed from: a */
        public final C20650e.C20653c f57153a;

        /* renamed from: b */
        public C21754b0 f57154b;

        /* renamed from: c */
        public C21754b0 f57155c;

        /* renamed from: d */
        public boolean f57156d;

        /* renamed from: d24.c$b$a */
        public class C20392a extends C21771l {

            /* renamed from: e */
            public final /* synthetic */ C20650e.C20653c f57158e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20392a(C21754b0 b0Var, C20389c cVar, C20650e.C20653c cVar2) {
                super(b0Var);
                this.f57158e = cVar2;
            }

            public void close() {
                synchronized (C20389c.this) {
                    C20391b bVar = C20391b.this;
                    if (!bVar.f57156d) {
                        bVar.f57156d = true;
                        C20389c.this.getClass();
                        super.close();
                        this.f57158e.mo32348b();
                    }
                }
            }
        }

        public C20391b(C20650e.C20653c cVar) {
            this.f57153a = cVar;
            C21754b0 d = cVar.mo32350d(1);
            this.f57154b = d;
            this.f57155c = new C20392a(d, C20389c.this, cVar);
        }

        /* renamed from: a */
        public void mo31894a() {
            synchronized (C20389c.this) {
                if (!this.f57156d) {
                    this.f57156d = true;
                    C20389c.this.getClass();
                    C20509c.m22197c(this.f57154b);
                    try {
                        this.f57153a.mo32347a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d24.c$c */
    public static class C20393c extends C20399d0 {

        /* renamed from: d */
        public final C20650e.C20656e f57160d;

        /* renamed from: e */
        public final C21768j f57161e;

        /* renamed from: f */
        public final String f57162f;

        /* renamed from: g */
        public final String f57163g;

        /* renamed from: d24.c$c$a */
        public class C20394a extends C21772m {

            /* renamed from: e */
            public final /* synthetic */ C20650e.C20656e f57164e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20394a(C20393c cVar, C21760d0 d0Var, C20650e.C20656e eVar) {
                super(d0Var);
                this.f57164e = eVar;
            }

            public void close() {
                this.f57164e.close();
                super.close();
            }
        }

        public C20393c(C20650e.C20656e eVar, String str, String str2) {
            this.f57160d = eVar;
            this.f57162f = str;
            this.f57163g = str2;
            this.f57161e = C21777r.m24935b(new C20394a(this, eVar.f58168f[1], eVar));
        }

        /* renamed from: a */
        public long mo31896a() {
            try {
                String str = this.f57163g;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public C106984u mo31897b() {
            String str = this.f57162f;
            if (str == null) {
                return null;
            }
            try {
                return C106984u.m144738a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public C21768j mo31898c() {
            return this.f57161e;
        }
    }

    public C20389c(File file, long j) {
        C117371a aVar = C117371a.f351376a;
        Pattern pattern = C20650e.f58130A;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            byte[] bArr = C20509c.f57729a;
            this.f57151e = new C20650e(aVar, file, 201105, 2, j, new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new C86420d("OkHttp DiskLruCache", true)));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public static String m21939a(C20421s sVar) {
        return C21769k.f61697h.mo34164a(sVar.f57273i).mo34083e("MD5").mo34086g();
    }

    /* renamed from: b */
    public static int m21940b(C21768j jVar) {
        try {
            long m0 = jVar.mo34144m0();
            String Y = jVar.mo34127Y();
            if (m0 >= 0 && m0 <= 2147483647L && Y.isEmpty()) {
                return (int) m0;
            }
            throw new IOException("expected an int but was \"" + m0 + Y + FastJsonResponse.QUOTE);
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31891c(d24.C20431y r7) {
        /*
            r6 = this;
            f24.e r0 = r6.f57151e
            d24.s r7 = r7.f57340a
            java.lang.String r7 = m21939a(r7)
            monitor-enter(r0)
            r0.mo32334e()     // Catch:{ all -> 0x002e }
            r0.mo32329a()     // Catch:{ all -> 0x002e }
            r0.mo32344s(r7)     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r1 = r0.f58141q     // Catch:{ all -> 0x002e }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x002e }
            f24.e$d r7 = (f24.C20650e.C20655d) r7     // Catch:{ all -> 0x002e }
            r1 = 0
            if (r7 != 0) goto L_0x001f
            monitor-exit(r0)
            goto L_0x002d
        L_0x001f:
            r0.mo32342q(r7)     // Catch:{ all -> 0x002e }
            long r2 = r0.f58139o     // Catch:{ all -> 0x002e }
            long r4 = r0.f58137j     // Catch:{ all -> 0x002e }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x002c
            r0.f58146v = r1     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r0)
        L_0x002d:
            return
        L_0x002e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d24.C20389c.mo31891c(d24.y):void");
    }

    public void close() {
        this.f57151e.close();
    }

    public void flush() {
        this.f57151e.flush();
    }

    /* renamed from: d24.c$d */
    public static final class C20395d {

        /* renamed from: k */
        public static final String f57165k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        public static final String f57166l = "OkHttp-Received-Millis";

        /* renamed from: a */
        public final String f57167a;

        /* renamed from: b */
        public final C20419r f57168b;

        /* renamed from: c */
        public final String f57169c;

        /* renamed from: d */
        public final C116554w f57170d;

        /* renamed from: e */
        public final int f57171e;

        /* renamed from: f */
        public final String f57172f;

        /* renamed from: g */
        public final C20419r f57173g;

        /* renamed from: h */
        public final C20418q f57174h;

        /* renamed from: i */
        public final long f57175i;

        /* renamed from: j */
        public final long f57176j;

        static {
            C117443g gVar = C117443g.f351507a;
            gVar.getClass();
            gVar.getClass();
        }

        public C20395d(C21760d0 d0Var) {
            C20402f0 f0Var;
            try {
                C21768j b = C21777r.m24935b(d0Var);
                C21783x xVar = (C21783x) b;
                this.f57167a = xVar.mo34127Y();
                this.f57169c = xVar.mo34127Y();
                C20419r.C20420a aVar = new C20419r.C20420a();
                int b2 = C20389c.m21940b(b);
                for (int i = 0; i < b2; i++) {
                    aVar.mo31934a(xVar.mo34127Y());
                }
                this.f57168b = new C20419r(aVar);
                C20893k a = C20893k.m22984a(xVar.mo34127Y());
                this.f57170d = a.f59035a;
                this.f57171e = a.f59036b;
                this.f57172f = a.f59037c;
                C20419r.C20420a aVar2 = new C20419r.C20420a();
                int b3 = C20389c.m21940b(b);
                for (int i2 = 0; i2 < b3; i2++) {
                    aVar2.mo31934a(xVar.mo34127Y());
                }
                String str = f57165k;
                String c = aVar2.mo31936c(str);
                String str2 = f57166l;
                String c2 = aVar2.mo31936c(str2);
                aVar2.mo31937d(str);
                aVar2.mo31937d(str2);
                long j = 0;
                this.f57175i = c != null ? Long.parseLong(c) : 0;
                this.f57176j = c2 != null ? Long.parseLong(c2) : j;
                this.f57173g = new C20419r(aVar2);
                if (this.f57167a.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                    String Y = xVar.mo34127Y();
                    if (Y.length() <= 0) {
                        C20403h a2 = C20403h.m21959a(xVar.mo34127Y());
                        List<Certificate> a3 = mo31900a(b);
                        List<Certificate> a4 = mo31900a(b);
                        if (!xVar.mo34134e0()) {
                            f0Var = C20402f0.m21958a(xVar.mo34127Y());
                        } else {
                            f0Var = C20402f0.SSL_3_0;
                        }
                        this.f57174h = new C20418q(f0Var, a2, C20509c.m22206l(a3), C20509c.m22206l(a4));
                    } else {
                        throw new IOException("expected \"\" but was \"" + Y + FastJsonResponse.QUOTE);
                    }
                } else {
                    this.f57174h = null;
                }
            } finally {
                d0Var.close();
            }
        }

        /* renamed from: a */
        public final List<Certificate> mo31900a(C21768j jVar) {
            int b = C20389c.m21940b(jVar);
            if (b == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b);
                for (int i = 0; i < b; i++) {
                    String Y = jVar.mo34127Y();
                    C21766h hVar = new C21766h();
                    C21769k b2 = C21769k.m24900b(Y);
                    C87412m.m108594g(b2, "byteString");
                    b2.mo34093o(hVar, 0, b2.mo34085f());
                    arrayList.add(instance.generateCertificate(new C21765g(hVar)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo31901b(C21767i iVar, List<Certificate> list) {
            try {
                iVar.mo34119F((long) list.size()).mo34146o(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    iVar.mo34126W(C21769k.m24902j(list.get(i).getEncoded()).mo34082a()).mo34146o(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: c */
        public void mo31902c(C20650e.C20653c cVar) {
            C21767i a = C21777r.m24934a(cVar.mo32350d(0));
            C21781v vVar = (C21781v) a;
            vVar.mo34126W(this.f57167a);
            vVar.mo34146o(10);
            vVar.mo34126W(this.f57169c);
            vVar.mo34146o(10);
            vVar.mo34119F((long) (this.f57168b.f57262a.length / 2));
            vVar.mo34146o(10);
            int length = this.f57168b.f57262a.length / 2;
            for (int i = 0; i < length; i++) {
                vVar.mo34126W(this.f57168b.mo31927d(i));
                vVar.mo34126W(": ");
                vVar.mo34126W(this.f57168b.mo31930f(i));
                vVar.mo34146o(10);
            }
            C116554w wVar = this.f57170d;
            int i2 = this.f57171e;
            String str = this.f57172f;
            StringBuilder sb = new StringBuilder();
            sb.append(wVar == C116554w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(' ');
            sb.append(i2);
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
            vVar.mo34126W(sb.toString());
            vVar.mo34146o(10);
            vVar.mo34119F((long) ((this.f57173g.f57262a.length / 2) + 2));
            vVar.mo34146o(10);
            int length2 = this.f57173g.f57262a.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                vVar.mo34126W(this.f57173g.mo31927d(i3));
                vVar.mo34126W(": ");
                vVar.mo34126W(this.f57173g.mo31930f(i3));
                vVar.mo34146o(10);
            }
            vVar.mo34126W(f57165k);
            vVar.mo34126W(": ");
            vVar.mo34119F(this.f57175i);
            vVar.mo34146o(10);
            vVar.mo34126W(f57166l);
            vVar.mo34126W(": ");
            vVar.mo34119F(this.f57176j);
            vVar.mo34146o(10);
            if (this.f57167a.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                vVar.mo34146o(10);
                vVar.mo34126W(this.f57174h.f57259b.f57229a);
                vVar.mo34146o(10);
                mo31901b(a, this.f57174h.f57260c);
                mo31901b(a, this.f57174h.f57261d);
                vVar.mo34126W(this.f57174h.f57258a.f57208d);
                vVar.mo34146o(10);
            }
            vVar.close();
        }

        public C20395d(C20387b0 b0Var) {
            C20419r rVar;
            this.f57167a = b0Var.f57125d.f57340a.f57273i;
            int i = C20887e.f59015a;
            C20419r rVar2 = b0Var.f57132n.f57125d.f57342c;
            Set<String> f = C20887e.m22970f(b0Var.f57130i);
            if (f.isEmpty()) {
                rVar = new C20419r(new C20419r.C20420a());
            } else {
                C20419r.C20420a aVar = new C20419r.C20420a();
                int length = rVar2.f57262a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String d = rVar2.mo31927d(i2);
                    if (f.contains(d)) {
                        String f2 = rVar2.mo31930f(i2);
                        C20419r.m21971a(d);
                        C20419r.m21972b(f2, d);
                        aVar.mo31935b(d, f2);
                    }
                }
                rVar = new C20419r(aVar);
            }
            this.f57168b = rVar;
            this.f57169c = b0Var.f57125d.f57341b;
            this.f57170d = b0Var.f57126e;
            this.f57171e = b0Var.f57127f;
            this.f57172f = b0Var.f57128g;
            this.f57173g = b0Var.f57130i;
            this.f57174h = b0Var.f57129h;
            this.f57175i = b0Var.f57135q;
            this.f57176j = b0Var.f57136r;
        }
    }
}
