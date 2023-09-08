package bn0;

import cn0.C80078d;
import cn0.C80081g;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import dn0.C86358b;
import fn0.C86996a;
import fn0.C87002g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bn0.b */
public class C79716b implements C80078d {

    /* renamed from: a */
    public final C79714a f233622a;

    /* renamed from: b */
    public final long f233623b;

    /* renamed from: c */
    public C86009m1 f233624c;

    /* renamed from: d */
    public C80081g f233625d;

    /* renamed from: e */
    public BufferedOutputStream f233626e;

    /* renamed from: f */
    public OutputStream f233627f;

    /* renamed from: g */
    public long f233628g;

    /* renamed from: h */
    public long f233629h;

    /* renamed from: i */
    public long f233630i = -1;

    /* renamed from: j */
    public C86358b f233631j = C86358b.f251077c;

    /* renamed from: k */
    public String f233632k = "";

    /* renamed from: bn0.b$a */
    public static class C79717a extends IOException {
        public C79717a(IOException iOException) {
            super(iOException);
        }
    }

    public C79716b(C79714a aVar, long j) {
        this.f233622a = aVar;
        this.f233623b = j;
    }

    /* renamed from: a */
    public void mo109829a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f233628g == this.f233623b) {
                    mo109831c();
                    mo109834e();
                }
                int min = (int) Math.min((long) (i2 - i3), this.f233623b - this.f233628g);
                this.f233626e.write(bArr, i + i3, min);
                i3 += min;
                long j = (long) min;
                this.f233628g += j;
                this.f233629h += j;
            } catch (IOException e) {
                throw new C79717a(e);
            }
        }
    }

    /* renamed from: b */
    public C80078d mo109830b(C80081g gVar, long j, C86358b bVar) {
        C86996a.m107998a(gVar.f234522d != -1);
        this.f233630i = j;
        this.f233631j = bVar;
        try {
            this.f233625d = gVar;
            this.f233629h = 0;
            mo109834e();
            return this;
        } catch (IOException e) {
            throw new C79717a(e);
        }
    }

    /* renamed from: c */
    public final void mo109831c() {
        BufferedOutputStream bufferedOutputStream = this.f233626e;
        if (bufferedOutputStream == null) {
            C87002g.m108023q(4, mo109833d(), "finish cache, outputStream is null", (Throwable) null);
            return;
        }
        try {
            bufferedOutputStream.flush();
            try {
                this.f233626e.close();
            } catch (IOException unused) {
            }
            C79714a aVar = this.f233622a;
            C86009m1 m1Var = this.f233624c;
            C79725i iVar = (C79725i) aVar;
            synchronized (iVar) {
                C79722f b = C79722f.m96852b(m1Var);
                C86996a.m107998a(b != null);
                C86996a.m107998a(iVar.f233672d.containsKey(b.f233658d));
                if (m1Var.mo119967g()) {
                    if (m1Var.mo119980r() == 0) {
                        m1Var.mo119966f();
                    } else {
                        iVar.mo109851b(b);
                        iVar.notifyAll();
                    }
                }
            }
            String d = mo109833d();
            C87002g.m108023q(4, d, "finish cache " + this.f233624c.mo119971i() + "  fileSize=" + this.f233624c.mo119980r(), (Throwable) null);
            this.f233627f = null;
            this.f233626e = null;
            this.f233624c = null;
        } catch (Throwable th) {
            try {
                this.f233626e.close();
            } catch (IOException unused2) {
            }
            this.f233624c.mo119966f();
            String d2 = mo109833d();
            C87002g.m108023q(6, d2, "close outputStream failed: " + this.f233624c.mo119971i(), (Throwable) null);
            this.f233627f = null;
            this.f233626e = null;
            this.f233624c = null;
            throw th;
        }
    }

    public void close() {
        try {
            mo109831c();
            String d = mo109833d();
            C87002g.m108023q(4, d, "close outputStream, " + String.format("total cached %d bytes", new Object[]{Long.valueOf(this.f233629h)}), (Throwable) null);
        } catch (IOException e) {
            throw new C79717a(e);
        }
    }

    /* renamed from: d */
    public String mo109833d() {
        return this.f233632k + "CacheDataSink";
    }

    /* renamed from: e */
    public void mo109834e() {
        C86009m1 c;
        C79714a aVar = this.f233622a;
        C80081g gVar = this.f233625d;
        String str = gVar.f234523e;
        long j = gVar.f234520b;
        long j2 = this.f233629h;
        long j3 = j + j2;
        long j4 = this.f233630i;
        C86358b bVar = this.f233631j;
        long min = Math.min(gVar.f234522d - j2, this.f233623b);
        C79725i iVar = (C79725i) aVar;
        synchronized (iVar) {
            C86996a.m107998a(iVar.f233672d.containsKey(str));
            if (!iVar.f233670b.mo119967g()) {
                iVar.mo109856g();
                iVar.f233670b.mo119987x();
            }
            ((C79724h) iVar.f233671c).mo109849c(iVar, min);
            c = C79722f.m96853c(iVar.f233670b, str, j3, j4, bVar, System.currentTimeMillis());
        }
        this.f233624c = c;
        String d = mo109833d();
        C87002g.m108023q(4, d, "start cache " + this.f233624c.mo119971i(), (Throwable) null);
        this.f233627f = C86013q1.m106426H(this.f233624c);
        this.f233626e = new BufferedOutputStream(this.f233627f);
        this.f233628g = 0;
    }
}
