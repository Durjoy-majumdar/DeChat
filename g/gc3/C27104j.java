package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.j */
public final class C27104j extends C27102h {

    /* renamed from: i */
    public final C27102h f75356i = new C27102h();

    /* renamed from: j */
    public C101656f f75357j;

    /* renamed from: k */
    public String f75358k;

    /* renamed from: l */
    public C101656f.C101657a f75359l;

    /* renamed from: m */
    public final C13601g f75360m;

    /* renamed from: n */
    public final C13601g f75361n;

    /* renamed from: o */
    public final C13601g f75362o;

    /* renamed from: gc3.j$a */
    public static final class C27105a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27104j f75363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27105a(C27104j jVar) {
            super(0);
            this.f75363d = jVar;
        }

        public Object invoke() {
            String H = C27104j.m36398H(this.f75363d, "cdnattachurl_pd");
            C27104j.m36397G(this.f75363d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75363d.f75357j;
            if (fVar != null) {
                C27104j jVar = this.f75363d;
                Integer w = jVar.mo141115w(fVar.mo141123b().get(H), Integer.valueOf(jVar.f75356i.f75355h));
                return Integer.valueOf(w != null ? w.intValue() : this.f75363d.f75356i.f75355h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.j$b */
    public static final class C27106b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27104j f75364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27106b(C27104j jVar) {
            super(0);
            this.f75364d = jVar;
        }

        public Object invoke() {
            String H = C27104j.m36398H(this.f75364d, "cdnattachurl_pd_pri");
            C27104j.m36397G(this.f75364d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75364d.f75357j;
            if (fVar != null) {
                C27104j jVar = this.f75364d;
                Integer w = jVar.mo141115w(fVar.mo141123b().get(H), Integer.valueOf(jVar.f75356i.f75354g));
                return Integer.valueOf(w != null ? w.intValue() : this.f75364d.f75356i.f75354g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.j$c */
    public static final class C27107c extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27104j f75365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27107c(C27104j jVar) {
            super(0);
            this.f75365d = jVar;
        }

        public Object invoke() {
            String H = C27104j.m36398H(this.f75365d, "cdnattachurl_size");
            C27104j.m36397G(this.f75365d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75365d.f75357j;
            if (fVar != null) {
                C27104j jVar = this.f75365d;
                Long x = jVar.mo141116x(fVar.mo141123b().get(H), Long.valueOf(jVar.f75356i.f75353f));
                return Long.valueOf(x != null ? x.longValue() : this.f75365d.f75356i.f75353f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27104j(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75360m = C36568h.m40986b(iVar, new C27107c(this));
        this.f75361n = C36568h.m40986b(iVar, new C27106b(this));
        this.f75362o = C36568h.m40986b(iVar, new C27105a(this));
        this.f75357j = fVar;
        this.f75358k = str;
    }

    /* renamed from: G */
    public static final void m36397G(C27104j jVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = jVar.f75357j;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && jVar.f75359l != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = jVar.f75357j;
            if (fVar2 != null) {
                jVar.f75359l = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static final String m36398H(C27104j jVar, String str) {
        String str2;
        jVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = jVar.f75358k;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = jVar.f75358k;
                if (str4 != null) {
                    sb4.append(str4);
                    sb4.append('.');
                    sb4.append(str);
                    str2 = sb4.toString();
                } else {
                    C87412m.m108603p("__xmlPrefixTag__");
                    throw null;
                }
            } else {
                str2 = String.valueOf(str);
            }
            sb.append(str2);
            return sb.toString();
        }
        C87412m.m108603p("__xmlPrefixTag__");
        throw null;
    }

    /* renamed from: A */
    public int mo54638A() {
        return ((Number) this.f75362o.getValue()).intValue();
    }

    /* renamed from: B */
    public int mo54639B() {
        return ((Number) this.f75361n.getValue()).intValue();
    }

    /* renamed from: C */
    public long mo54640C() {
        return ((Number) this.f75360m.getValue()).longValue();
    }

    /* renamed from: D */
    public void mo54641D(int i) {
    }

    /* renamed from: E */
    public void mo54642E(int i) {
    }

    /* renamed from: F */
    public void mo54643F(long j) {
    }
}
