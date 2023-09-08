package j24;

import d24.C106982e;
import d24.C116554w;
import d24.C20387b0;
import d24.C20399d0;
import d24.C20414o;
import d24.C20419r;
import d24.C20423t;
import d24.C20425v;
import d24.C20431y;
import e24.C20509c;
import g24.C20788g;
import h24.C20886c;
import h24.C20887e;
import h24.C20889g;
import h24.C20890h;
import h24.C20891i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o24.C21754b0;
import o24.C21760d0;
import o24.C21766h;
import o24.C21769k;
import o24.C21772m;
import o24.C21777r;

/* renamed from: j24.f */
public final class C21162f implements C20886c {

    /* renamed from: f */
    public static final List<String> f59841f = C20509c.m22207m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g */
    public static final List<String> f59842g = C20509c.m22207m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final C20423t.C20424a f59843a;

    /* renamed from: b */
    public final C20788g f59844b;

    /* renamed from: c */
    public final C21164g f59845c;

    /* renamed from: d */
    public C21184q f59846d;

    /* renamed from: e */
    public final C116554w f59847e;

    /* renamed from: j24.f$a */
    public class C21163a extends C21772m {

        /* renamed from: e */
        public boolean f59848e = false;

        /* renamed from: f */
        public long f59849f = 0;

        public C21163a(C21760d0 d0Var) {
            super(d0Var);
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            try {
                long L0 = this.f61702d.mo32327L0(hVar, j);
                if (L0 > 0) {
                    this.f59849f += L0;
                }
                return L0;
            } catch (IOException e) {
                if (!this.f59848e) {
                    this.f59848e = true;
                    C21162f fVar = C21162f.this;
                    fVar.f59844b.mo32488i(false, fVar, this.f59849f, e);
                }
                throw e;
            }
        }

        public void close() {
            super.close();
            if (!this.f59848e) {
                this.f59848e = true;
                C21162f fVar = C21162f.this;
                fVar.f59844b.mo32488i(false, fVar, this.f59849f, (IOException) null);
            }
        }
    }

    public C21162f(C20425v vVar, C20423t.C20424a aVar, C20788g gVar, C21164g gVar2) {
        this.f59843a = aVar;
        this.f59844b = gVar;
        this.f59845c = gVar2;
        List<C116554w> list = vVar.f57289e;
        C116554w wVar = C116554w.H2_PRIOR_KNOWLEDGE;
        this.f59847e = !list.contains(wVar) ? C116554w.HTTP_2 : wVar;
    }

    /* renamed from: a */
    public C21754b0 mo32595a(C20431y yVar, long j) {
        C21184q qVar = this.f59846d;
        synchronized (qVar) {
            if (!qVar.f59930f) {
                if (!qVar.mo33147e()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return qVar.f59932h;
    }

    /* renamed from: b */
    public void mo32596b() {
        this.f59845c.flush();
    }

    /* renamed from: c */
    public void mo32597c() {
        C21184q qVar = this.f59846d;
        synchronized (qVar) {
            if (!qVar.f59930f) {
                if (!qVar.mo33147e()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        qVar.f59932h.close();
    }

    public void cancel() {
        C21184q qVar = this.f59846d;
        if (qVar != null) {
            C21156b bVar = C21156b.CANCEL;
            if (qVar.mo33146d(bVar)) {
                qVar.f59928d.mo33133k(qVar.f59927c, bVar);
            }
        }
    }

    /* renamed from: d */
    public void mo32599d(C20431y yVar) {
        int i;
        C21184q qVar;
        if (this.f59846d == null) {
            yVar.getClass();
            C20419r rVar = yVar.f57342c;
            ArrayList arrayList = new ArrayList((rVar.f57262a.length / 2) + 4);
            arrayList.add(new C21157c(C21157c.f59812f, yVar.f57341b));
            arrayList.add(new C21157c(C21157c.f59813g, C20891i.m22977a(yVar.f57340a)));
            String a = yVar.mo31967a("Host");
            if (a != null) {
                arrayList.add(new C21157c(C21157c.f59815i, a));
            }
            arrayList.add(new C21157c(C21157c.f59814h, yVar.f57340a.f57265a));
            int length = rVar.f57262a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                C21769k a2 = C21769k.f61697h.mo34164a(rVar.mo31927d(i2).toLowerCase(Locale.US));
                if (!f59841f.contains(a2.mo34163n())) {
                    arrayList.add(new C21157c(a2, rVar.mo31930f(i2)));
                }
            }
            C21164g gVar = this.f59845c;
            boolean z = !false;
            synchronized (gVar.f59852A) {
                synchronized (gVar) {
                    if (gVar.f59860i > 1073741823) {
                        gVar.mo33130g(C21156b.REFUSED_STREAM);
                    }
                    if (!gVar.f59861j) {
                        i = gVar.f59860i;
                        gVar.f59860i = i + 2;
                        qVar = new C21184q(i, gVar, z, false, (C20419r) null);
                        if (qVar.mo33148f()) {
                            gVar.f59857f.put(Integer.valueOf(i), qVar);
                        }
                    } else {
                        throw new C21155a();
                    }
                }
                C21188r rVar2 = gVar.f59852A;
                synchronized (rVar2) {
                    if (!rVar2.f59952h) {
                        rVar2.mo33158e(z, i, arrayList);
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
            C21188r rVar3 = gVar.f59852A;
            synchronized (rVar3) {
                if (!rVar3.f59952h) {
                    rVar3.f59948d.flush();
                } else {
                    throw new IOException("closed");
                }
            }
            this.f59846d = qVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.f59933i.mo34108g((long) ((C20889g) this.f59843a).f59025j, timeUnit);
            this.f59846d.f59934j.mo34108g((long) ((C20889g) this.f59843a).f59026k, timeUnit);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r0.f59933i.mo33152l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d24.C20387b0.C20388a mo32600e(boolean r11) {
        /*
            r10 = this;
            j24.q r0 = r10.f59846d
            monitor-enter(r0)
            j24.q$c r1 = r0.f59933i     // Catch:{ all -> 0x00da }
            r1.mo34096h()     // Catch:{ all -> 0x00da }
        L_0x0008:
            java.util.Deque<d24.r> r1 = r0.f59929e     // Catch:{ all -> 0x00d3 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00d3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x001a
            j24.b r1 = r0.f59935k     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x001a
            r0.mo33149g()     // Catch:{ all -> 0x00d3 }
            goto L_0x0008
        L_0x001a:
            j24.q$c r1 = r0.f59933i     // Catch:{ all -> 0x00da }
            r1.mo33152l()     // Catch:{ all -> 0x00da }
            java.util.Deque<d24.r> r1 = r0.f59929e     // Catch:{ all -> 0x00da }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00da }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x00cb
            java.util.Deque<d24.r> r1 = r0.f59929e     // Catch:{ all -> 0x00da }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00da }
            d24.r r1 = (d24.C20419r) r1     // Catch:{ all -> 0x00da }
            monitor-exit(r0)
            d24.w r0 = r10.f59847e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            java.lang.String[] r4 = r1.f57262a
            int r4 = r4.length
            int r4 = r4 / 2
            r5 = 0
            r6 = r5
        L_0x0045:
            if (r3 >= r4) goto L_0x0089
            java.lang.String r7 = r1.mo31927d(r3)
            java.lang.String r8 = r1.mo31930f(r3)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x006d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            h24.k r6 = h24.C20893k.m22984a(r6)
            goto L_0x0086
        L_0x006d:
            java.util.List<java.lang.String> r9 = f59842g
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x0086
            e24.a r9 = e24.C20507a.f57727a
            d24.v$a r9 = (d24.C20425v.C20426a) r9
            r9.getClass()
            r2.add(r7)
            java.lang.String r7 = r8.trim()
            r2.add(r7)
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0089:
            if (r6 == 0) goto L_0x00c3
            d24.b0$a r1 = new d24.b0$a
            r1.<init>()
            r1.f57139b = r0
            int r0 = r6.f59036b
            r1.f57140c = r0
            java.lang.String r0 = r6.f59037c
            r1.f57141d = r0
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            d24.r$a r2 = new d24.r$a
            r2.<init>()
            java.util.List<java.lang.String> r3 = r2.f57263a
            java.util.Collections.addAll(r3, r0)
            r1.f57143f = r2
            if (r11 == 0) goto L_0x00c2
            e24.a r11 = e24.C20507a.f57727a
            d24.v$a r11 = (d24.C20425v.C20426a) r11
            r11.getClass()
            int r11 = r1.f57140c
            r0 = 100
            if (r11 != r0) goto L_0x00c2
            return r5
        L_0x00c2:
            return r1
        L_0x00c3:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00cb:
            j24.v r11 = new j24.v     // Catch:{ all -> 0x00da }
            j24.b r1 = r0.f59935k     // Catch:{ all -> 0x00da }
            r11.<init>(r1)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00d3:
            r11 = move-exception
            j24.q$c r1 = r0.f59933i     // Catch:{ all -> 0x00da }
            r1.mo33152l()     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00da:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.C21162f.mo32600e(boolean):d24.b0$a");
    }

    /* renamed from: f */
    public C20399d0 mo32601f(C20387b0 b0Var) {
        C20788g gVar = this.f59844b;
        C20414o oVar = gVar.f58727f;
        C106982e eVar = gVar.f58726e;
        oVar.getClass();
        return new C20890h(b0Var.mo31886b("Content-Type"), C20887e.m22965a(b0Var), C21777r.m24935b(new C21163a(this.f59846d.f59931g)));
    }
}
