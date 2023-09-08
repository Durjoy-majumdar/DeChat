package h24;

import d24.C20387b0;
import d24.C20423t;
import d24.C20431y;
import e24.C20509c;
import g24.C20783c;
import g24.C20788g;
import java.net.ProtocolException;
import o24.C21754b0;
import o24.C21766h;
import o24.C21771l;

/* renamed from: h24.b */
public final class C20884b implements C20423t {

    /* renamed from: a */
    public final boolean f59014a;

    /* renamed from: h24.b$a */
    public static final class C20885a extends C21771l {
        public C20885a(C21754b0 b0Var) {
            super(b0Var);
        }

        /* renamed from: x */
        public void mo32354x(C21766h hVar, long j) {
            super.mo32354x(hVar, j);
        }
    }

    public C20884b(boolean z) {
        this.f59014a = z;
    }

    /* renamed from: a */
    public C20387b0 mo31952a(C20423t.C20424a aVar) {
        C20387b0 b0Var;
        C20889g gVar = (C20889g) aVar;
        C20886c cVar = gVar.f59018c;
        C20788g gVar2 = gVar.f59017b;
        C20783c cVar2 = gVar.f59019d;
        C20431y yVar = gVar.f59021f;
        long currentTimeMillis = System.currentTimeMillis();
        gVar.f59023h.getClass();
        cVar.mo32599d(yVar);
        gVar.f59023h.getClass();
        if (C20888f.m22972b(yVar.f57341b)) {
            yVar.getClass();
        }
        cVar.mo32597c();
        gVar.f59023h.getClass();
        C20387b0.C20388a e = cVar.mo32600e(false);
        e.f57138a = yVar;
        e.f57142e = gVar2.mo32481b().f58699f;
        e.f57148k = currentTimeMillis;
        e.f57149l = System.currentTimeMillis();
        C20387b0 a = e.mo31889a();
        int i = a.f57127f;
        if (i == 100) {
            C20387b0.C20388a e2 = cVar.mo32600e(false);
            e2.f57138a = yVar;
            e2.f57142e = gVar2.mo32481b().f58699f;
            e2.f57148k = currentTimeMillis;
            e2.f57149l = System.currentTimeMillis();
            a = e2.mo31889a();
            i = a.f57127f;
        }
        gVar.f59023h.getClass();
        if (!this.f59014a || i != 101) {
            C20387b0.C20388a aVar2 = new C20387b0.C20388a(a);
            aVar2.f57144g = cVar.mo32601f(a);
            b0Var = aVar2.mo31889a();
        } else {
            C20387b0.C20388a aVar3 = new C20387b0.C20388a(a);
            aVar3.f57144g = C20509c.f57731c;
            b0Var = aVar3.mo31889a();
        }
        if ("close".equalsIgnoreCase(b0Var.f57125d.mo31967a("Connection")) || "close".equalsIgnoreCase(b0Var.mo31886b("Connection"))) {
            gVar2.mo32485f();
        }
        if ((i != 204 && i != 205) || b0Var.f57131j.mo31896a() <= 0) {
            return b0Var;
        }
        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + b0Var.f57131j.mo31896a());
    }
}
