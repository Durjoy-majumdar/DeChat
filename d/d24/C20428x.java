package d24;

import d24.C20421s;
import e24.C20508b;
import e24.C20509c;
import f24.C20647b;
import g24.C20781a;
import g24.C20783c;
import g24.C20788g;
import h24.C20883a;
import h24.C20884b;
import h24.C20886c;
import h24.C20889g;
import h24.C20892j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import l24.C117443g;
import o24.C21755c;

/* renamed from: d24.x */
public final class C20428x implements C106982e {

    /* renamed from: d */
    public final C20425v f57330d;

    /* renamed from: e */
    public final C20892j f57331e;

    /* renamed from: f */
    public final C21755c f57332f;

    /* renamed from: g */
    public C20414o f57333g;

    /* renamed from: h */
    public final C20431y f57334h;

    /* renamed from: i */
    public final boolean f57335i;

    /* renamed from: j */
    public boolean f57336j;

    /* renamed from: d24.x$a */
    public class C20429a extends C21755c {
        public C20429a() {
        }

        /* renamed from: k */
        public void mo31965k() {
            C20428x.this.cancel();
        }
    }

    /* renamed from: d24.x$b */
    public final class C20430b extends C20508b {

        /* renamed from: e */
        public final C20401f f57338e;

        static {
            Class<C20428x> cls = C20428x.class;
        }

        public C20430b(C20401f fVar) {
            super("OkHttp %s", C20428x.this.mo31959b());
            this.f57338e = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[Catch:{ IOException -> 0x004c, all -> 0x0024, all -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ IOException -> 0x004c, all -> 0x0024, all -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[Catch:{ IOException -> 0x004c, all -> 0x0024, all -> 0x0089 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo31966a() {
            /*
                r5 = this;
                d24.x r0 = d24.C20428x.this
                o24.c r0 = r0.f57332f
                r0.mo34096h()
                r0 = 0
                d24.x r1 = d24.C20428x.this     // Catch:{ IOException -> 0x004c, all -> 0x0024 }
                d24.b0 r0 = r1.mo31957a()     // Catch:{ IOException -> 0x004c, all -> 0x0024 }
                r1 = 1
                d24.f r2 = r5.f57338e     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
                d24.x r3 = d24.C20428x.this     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
                r2.mo31909b(r3, r0)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
                d24.x r0 = d24.C20428x.this
                d24.v r0 = r0.f57330d
            L_0x001a:
                d24.m r0 = r0.f57288d
                r0.mo31922a(r5)
                goto L_0x0088
            L_0x0020:
                r0 = move-exception
                goto L_0x0027
            L_0x0022:
                r0 = move-exception
                goto L_0x004f
            L_0x0024:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0027:
                d24.x r2 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                r2.cancel()     // Catch:{ all -> 0x0089 }
                if (r1 != 0) goto L_0x004b
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0089 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
                r2.<init>()     // Catch:{ all -> 0x0089 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0089 }
                r2.append(r0)     // Catch:{ all -> 0x0089 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0089 }
                r1.<init>(r2)     // Catch:{ all -> 0x0089 }
                d24.f r2 = r5.f57338e     // Catch:{ all -> 0x0089 }
                d24.x r3 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                r2.mo31908a(r3, r1)     // Catch:{ all -> 0x0089 }
            L_0x004b:
                throw r0     // Catch:{ all -> 0x0089 }
            L_0x004c:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x004f:
                d24.x r2 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                java.io.IOException r0 = r2.mo31960c(r0)     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x0075
                l24.g r1 = l24.C117443g.f351507a     // Catch:{ all -> 0x0089 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
                r3.<init>()     // Catch:{ all -> 0x0089 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0089 }
                d24.x r4 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                java.lang.String r4 = r4.mo31963d()     // Catch:{ all -> 0x0089 }
                r3.append(r4)     // Catch:{ all -> 0x0089 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0089 }
                r1.mo182134l(r2, r3, r0)     // Catch:{ all -> 0x0089 }
                goto L_0x0083
            L_0x0075:
                d24.x r1 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                d24.o r1 = r1.f57333g     // Catch:{ all -> 0x0089 }
                r1.getClass()     // Catch:{ all -> 0x0089 }
                d24.f r1 = r5.f57338e     // Catch:{ all -> 0x0089 }
                d24.x r2 = d24.C20428x.this     // Catch:{ all -> 0x0089 }
                r1.mo31908a(r2, r0)     // Catch:{ all -> 0x0089 }
            L_0x0083:
                d24.x r0 = d24.C20428x.this
                d24.v r0 = r0.f57330d
                goto L_0x001a
            L_0x0088:
                return
            L_0x0089:
                r0 = move-exception
                d24.x r1 = d24.C20428x.this
                d24.v r1 = r1.f57330d
                d24.m r1 = r1.f57288d
                r1.mo31922a(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d24.C20428x.C20430b.mo31966a():void");
        }
    }

    public C20428x(C20425v vVar, C20431y yVar, boolean z) {
        this.f57330d = vVar;
        this.f57334h = yVar;
        this.f57335i = z;
        this.f57331e = new C20892j(vVar, z);
        C20429a aVar = new C20429a();
        this.f57332f = aVar;
        vVar.getClass();
        aVar.mo34108g((long) 0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: D */
    public C20387b0 mo31956D() {
        synchronized (this) {
            if (!this.f57336j) {
                this.f57336j = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f57331e.f59033c = C117443g.f351507a.mo182132j("response.body().close()");
        this.f57332f.mo34096h();
        this.f57333g.getClass();
        try {
            C20411m mVar = this.f57330d.f57288d;
            synchronized (mVar) {
                ((ArrayDeque) mVar.f57254f).add(this);
            }
            C20387b0 a = mo31957a();
            C20411m mVar2 = this.f57330d.f57288d;
            Deque<C20428x> deque = mVar2.f57254f;
            synchronized (mVar2) {
                if (!((ArrayDeque) deque).remove(this)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            }
            mVar2.mo31923b();
            return a;
        } catch (IOException e) {
            try {
                IOException c = mo31960c(e);
                this.f57333g.getClass();
                throw c;
            } catch (Throwable th) {
                C20411m mVar3 = this.f57330d.f57288d;
                Deque<C20428x> deque2 = mVar3.f57254f;
                synchronized (mVar3) {
                    if (((ArrayDeque) deque2).remove(this)) {
                        mVar3.mo31923b();
                        throw th;
                    }
                    throw new AssertionError("Call wasn't in-flight!");
                }
            }
        }
    }

    /* renamed from: a */
    public C20387b0 mo31957a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f57330d.f57291g);
        arrayList.add(this.f57331e);
        arrayList.add(new C20883a(this.f57330d.f57295n));
        C20389c cVar = this.f57330d.f57296o;
        arrayList.add(new C20647b(cVar != null ? cVar.f57150d : null));
        arrayList.add(new C20781a(this.f57330d));
        if (!this.f57335i) {
            arrayList.addAll(this.f57330d.f57292h);
        }
        arrayList.add(new C20884b(this.f57335i));
        C20431y yVar = this.f57334h;
        C20414o oVar = this.f57333g;
        C20425v vVar = this.f57330d;
        C20431y yVar2 = yVar;
        C20387b0 a = new C20889g(arrayList, (C20788g) null, (C20886c) null, (C20783c) null, 0, yVar, this, oVar, vVar.f57285B, vVar.f57286C, vVar.f57287D).mo32602a(yVar2, (C20788g) null, (C20886c) null, (C20783c) null);
        if (!this.f57331e.f59034d) {
            return a;
        }
        C20509c.m22197c(a);
        throw new IOException("Canceled");
    }

    /* renamed from: a2 */
    public void mo31958a2(C20401f fVar) {
        synchronized (this) {
            if (!this.f57336j) {
                this.f57336j = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f57331e.f59033c = C117443g.f351507a.mo182132j("response.body().close()");
        this.f57333g.getClass();
        C20411m mVar = this.f57330d.f57288d;
        C20430b bVar = new C20430b(fVar);
        synchronized (mVar) {
            ((ArrayDeque) mVar.f57252d).add(bVar);
        }
        mVar.mo31923b();
    }

    /* renamed from: b */
    public String mo31959b() {
        C20421s.C20422a aVar;
        C20421s sVar = this.f57334h.f57340a;
        sVar.getClass();
        try {
            aVar = new C20421s.C20422a();
            aVar.mo31950b(sVar, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.f57275b = C20421s.m21984b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.f57276c = C20421s.m21984b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.mo31949a().f57273i;
    }

    /* renamed from: c */
    public IOException mo31960c(IOException iOException) {
        if (!this.f57332f.mo34097i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void cancel() {
        C20886c cVar;
        C20783c cVar2;
        C20892j jVar = this.f57331e;
        jVar.f59034d = true;
        C20788g gVar = jVar.f59032b;
        if (gVar != null) {
            synchronized (gVar.f58725d) {
                gVar.f58734m = true;
                cVar = gVar.f58735n;
                cVar2 = gVar.f58731j;
            }
            if (cVar != null) {
                cVar.cancel();
            } else if (cVar2 != null) {
                C20509c.m22198d(cVar2.f58697d);
            }
        }
    }

    public Object clone() {
        C20425v vVar = this.f57330d;
        C20428x xVar = new C20428x(vVar, this.f57334h, this.f57335i);
        xVar.f57333g = ((C20417p) vVar.f57293i).f57257a;
        return xVar;
    }

    /* renamed from: d */
    public String mo31963d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57331e.f59034d ? "canceled " : "");
        sb.append(this.f57335i ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo31959b());
        return sb.toString();
    }

    public boolean isCanceled() {
        return this.f57331e.f59034d;
    }
}
