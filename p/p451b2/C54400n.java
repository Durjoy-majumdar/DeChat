package p451b2;

import a14.C0000n0;
import a14.C53901i0;
import a14.C53930o0;
import a14.C53955u2;
import a14.C53973z1;
import gy3.C8480h;
import gy3.C87412m;
import wx3.C66206a;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: b2.n */
public final class C54400n {

    /* renamed from: b */
    public static final C53901i0 f152603b = new C54401a(C53901i0.C39480a.f106019d);

    /* renamed from: a */
    public C0000n0 f152604a;

    /* renamed from: b2.n$a */
    public static final class C54401a extends C66206a implements C53901i0 {
        public C54401a(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
        }
    }

    public C54400n(C104012e eVar, C66212f fVar, int i, C8480h hVar) {
        eVar = (i & 1) != 0 ? new C104012e() : eVar;
        fVar = (i & 2) != 0 ? C66217g.f190253d : fVar;
        C87412m.m108594g(eVar, "asyncTypefaceCache");
        C87412m.m108594g(fVar, "injectedContext");
        this.f152604a = C53930o0.m60554a(f152603b.plus(fVar).plus(new C53955u2((C53973z1) fVar.get(C53973z1.C0004b.f3d))));
    }
}
