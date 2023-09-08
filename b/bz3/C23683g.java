package bz3;

import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import k04.C24854a;
import k04.C88048d;
import mz3.C25055g;
import oz3.C25390o;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C26408b;
import z04.C112551y;

/* renamed from: bz3.g */
public final class C23683g implements C25390o {

    /* renamed from: a */
    public final ClassLoader f67873a;

    /* renamed from: b */
    public final C88048d f67874b = new C88048d();

    public C23683g(ClassLoader classLoader) {
        C87412m.m108594g(classLoader, "classLoader");
        this.f67873a = classLoader;
    }

    /* renamed from: a */
    public C25390o.C25391a mo37232a(C25055g gVar) {
        String b;
        Class<?> a;
        C23681f a2;
        C87412m.m108594g(gVar, "javaClass");
        C22826c d = gVar.mo51084d();
        if (d == null || (b = d.mo35973b()) == null || (a = C113219e.m154929a(this.f67873a, b)) == null || (a2 = C23681f.f67870c.mo37231a(a)) == null) {
            return null;
        }
        return new C25390o.C25391a.C25393b(a2, (byte[]) null, 2, (C8480h) null);
    }

    /* renamed from: b */
    public C25390o.C25391a mo37233b(C26408b bVar) {
        C23681f a;
        C87412m.m108594g(bVar, "classId");
        String b = bVar.mo53394i().mo35973b();
        C87412m.m108593f(b, "relativeClassName.asString()");
        String o = C112551y.m153815o(b, '.', '$', false, 4, (Object) null);
        if (!bVar.mo53392h().mo35975d()) {
            o = bVar.mo53392h() + '.' + o;
        }
        Class<?> a2 = C113219e.m154929a(this.f67873a, o);
        if (a2 == null || (a = C23681f.f67870c.mo37231a(a2)) == null) {
            return null;
        }
        return new C25390o.C25391a.C25393b(a, (byte[]) null, 2, (C8480h) null);
    }

    /* renamed from: c */
    public InputStream mo37234c(C22826c cVar) {
        C87412m.m108594g(cVar, "packageFqName");
        if (!cVar.mo35980h(C26343l.f73375i)) {
            return null;
        }
        return this.f67874b.mo122496a(C24854a.f70841m.mo51859a(cVar));
    }
}
