package w42;

import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import p237sp.C90271s;

/* renamed from: w42.b */
public final class C90896b<T extends C7594e> extends C86430i<T> {

    /* renamed from: w42.b$a */
    public static final class C90897a implements C90271s.C13751b {

        /* renamed from: a */
        public final /* synthetic */ C90896b<T> f260884a;

        /* renamed from: b */
        public final /* synthetic */ C8478d0 f260885b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f260886c;

        public C90897a(C90896b<T> bVar, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f260884a = bVar;
            this.f260885b = d0Var;
            this.f260886c = f0Var;
        }

        /* renamed from: b */
        public final void mo13120b(int i, T t) {
            if (i == 0) {
                this.f260884a.mo120840p().invoke(this.f260884a.mo120844i());
                return;
            }
            this.f260885b.f27483d = i;
            C8479f0<String> f0Var = this.f260886c;
            if (t == null) {
                t = "";
            }
            f0Var.f27484d = t;
            this.f260884a.mo120840p().invoke(this.f260884a.mo120842g(this.f260885b.f27483d, (String) this.f260886c.f27484d));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "launchApplication";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        C90271s sVar = (C90271s) C86312j.m106911c(C90271s.class);
        T t = this.f251227a;
        sVar.mo12602Yn(t != null ? t.mo8720e0() : null, hVar, new C90897a(this, d0Var, f0Var));
    }
}
