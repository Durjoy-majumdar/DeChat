package cn0;

import bn0.C79716b;
import dn0.C86358b;
import fn0.C87002g;
import java.util.List;

/* renamed from: cn0.r */
public final class C80107r implements C80079e {

    /* renamed from: a */
    public final C80079e f234599a;

    /* renamed from: b */
    public final C80078d f234600b;

    /* renamed from: c */
    public boolean f234601c;

    /* renamed from: d */
    public boolean f234602d;

    /* renamed from: e */
    public String f234603e = "";

    public C80107r(C80079e eVar, C80078d dVar) {
        eVar.getClass();
        this.f234599a = eVar;
        dVar.getClass();
        this.f234600b = dVar;
    }

    /* renamed from: a */
    public long mo109835a() {
        return this.f234599a.mo109835a();
    }

    public long available() {
        return this.f234599a.available();
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        long j;
        long j2;
        long j3;
        boolean z;
        C80081g gVar2 = gVar;
        long b = this.f234599a.mo109837b(gVar2);
        C86358b bVar = C86358b.f251077c;
        C80079e eVar = this.f234599a;
        if (eVar instanceof C80089l) {
            long a = eVar.mo109835a();
            List list = ((C80089l) this.f234599a).mo110334d().get("Content-Type");
            if (list != null && !list.isEmpty()) {
                bVar = C86358b.m106987a((String) list.get(0));
            }
            j = a;
        } else {
            j = -1;
        }
        if (gVar2.f234522d != -1 || b == -1) {
            j2 = j;
            j3 = b;
            z = false;
        } else {
            j2 = j;
            j3 = b;
            z = false;
            gVar2 = new C80081g(gVar2.f234519a, gVar2.f234520b, gVar2.f234521c, b, gVar2.f234523e, gVar2.f234524f, gVar2.f234525g, gVar2.f234526h);
        }
        this.f234601c = z;
        long j4 = j2;
        if (j4 != -1) {
            try {
                this.f234600b.mo109830b(gVar2, j4, bVar);
                this.f234602d = true;
            } catch (C79716b.C79717a e) {
                this.f234601c = true;
                C87002g.m108023q(5, mo110350f(), "error open dataSink " + e.toString(), e);
            }
        } else {
            this.f234601c = true;
        }
        return j3;
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        int c = this.f234599a.mo109838c(bArr, i, i2);
        if (c <= 0 || this.f234601c) {
            return c;
        }
        try {
            if (this.f234602d) {
                this.f234600b.mo109829a(bArr, i, c);
            }
        } catch (C79716b.C79717a e) {
            this.f234601c = true;
            String f = mo110350f();
            C87002g.m108023q(5, f, "error write dataSink " + e.toString(), e);
        }
        return c;
    }

    public void close() {
        try {
            this.f234599a.close();
            try {
            } catch (C79716b.C79717a e) {
                String f = mo110350f();
                C87002g.m108023q(5, f, "error close dataSink " + e.toString(), e);
            }
        } finally {
            try {
                if (this.f234602d) {
                    this.f234600b.close();
                }
            } catch (C79716b.C79717a e2) {
                String f2 = mo110350f();
                C87002g.m108023q(5, f2, "error close dataSink " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: f */
    public String mo110350f() {
        return this.f234603e + "TeeDataSource";
    }

    public C86358b getFileType() {
        return this.f234599a.getFileType();
    }
}
