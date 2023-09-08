package dz3;

import ez3.C24472a;
import ez3.C24473b;
import ez3.C24474c;
import ez3.C31747f;
import ez3.C7956e;
import gy3.C87412m;
import vz3.C22830f;
import wy3.C26447e;
import wy3.C26465i0;
import zz3.C26794h;

/* renamed from: dz3.a */
public final class C24465a {
    /* renamed from: a */
    public static final void m30602a(C24474c cVar, C24473b bVar, C26447e eVar, C22830f fVar) {
        C24472a a;
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(bVar, "from");
        C87412m.m108594g(eVar, "scopeOwner");
        C87412m.m108594g(fVar, "name");
        if (cVar != C24474c.C24475a.f69990a && (a = bVar.mo51177a()) != null) {
            C7956e position = cVar.mo51179b() ? a.getPosition() : C7956e.f26641f;
            String filePath = a.getFilePath();
            String b = C26794h.m35219g(eVar).mo35984b();
            C87412m.m108593f(b, "getFqName(scopeOwner).asString()");
            C31747f fVar2 = C31747f.CLASSIFIER;
            String b2 = fVar.mo35995b();
            C87412m.m108593f(b2, "name.asString()");
            cVar.mo51178a(filePath, position, b, fVar2, b2);
        }
    }

    /* renamed from: b */
    public static final void m30603b(C24474c cVar, C24473b bVar, C26465i0 i0Var, C22830f fVar) {
        C24472a a;
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(bVar, "from");
        C87412m.m108594g(i0Var, "scopeOwner");
        C87412m.m108594g(fVar, "name");
        String b = i0Var.mo53444d().mo35973b();
        C87412m.m108593f(b, "scopeOwner.fqName.asString()");
        String b2 = fVar.mo35995b();
        C87412m.m108593f(b2, "name.asString()");
        if (cVar != C24474c.C24475a.f69990a && (a = bVar.mo51177a()) != null) {
            cVar.mo51178a(a.getFilePath(), cVar.mo51179b() ? a.getPosition() : C7956e.f26641f, b, C31747f.PACKAGE, b2);
        }
    }
}
