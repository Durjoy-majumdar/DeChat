package fc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: fc3.f */
public final class C27068f extends C97856d {

    /* renamed from: l */
    public final C97856d f75264l = new C97856d();

    /* renamed from: m */
    public C101656f f75265m;

    /* renamed from: n */
    public String f75266n;

    /* renamed from: o */
    public C101656f.C101657a f75267o;

    /* renamed from: p */
    public final C13601g f75268p;

    /* renamed from: q */
    public final C13601g f75269q;

    /* renamed from: r */
    public final C13601g f75270r;

    /* renamed from: s */
    public final C13601g f75271s;

    /* renamed from: t */
    public final C13601g f75272t;

    /* renamed from: u */
    public final C13601g f75273u;

    /* renamed from: fc3.f$a */
    public static final class C27069a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27069a(C27068f fVar) {
            super(0);
            this.f75274d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75274d, "cdnthumbkey");
            C27068f.m36257M(this.f75274d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75274d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75274d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(N), fVar2.f75264l.f287027i);
                return y != null ? y : this.f75274d.f75264l.f287027i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: fc3.f$b */
    public static final class C27070b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75275d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27070b(C27068f fVar) {
            super(0);
            this.f75275d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75275d, "cdnthumburl");
            C27068f.m36257M(this.f75275d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75275d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75275d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(N), fVar2.f75264l.f287026h);
                return y != null ? y : this.f75275d.f75264l.f287026h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: fc3.f$c */
    public static final class C27071c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27071c(C27068f fVar) {
            super(0);
            this.f75276d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75276d, "desc");
            C27068f.m36257M(this.f75276d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75276d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75276d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(N), fVar2.f75264l.f287025g);
                return y != null ? y : this.f75276d.f75264l.f287025g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: fc3.f$d */
    public static final class C27072d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27072d(C27068f fVar) {
            super(0);
            this.f75277d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75277d, "thumbfullmd5");
            C27068f.m36257M(this.f75277d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75277d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75277d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(N), fVar2.f75264l.f287028j);
                return y != null ? y : this.f75277d.f75264l.f287028j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: fc3.f$e */
    public static final class C27073e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27073e(C27068f fVar) {
            super(0);
            this.f75278d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75278d, "thumbsize");
            C27068f.m36257M(this.f75278d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75278d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75278d;
                Long x = fVar2.mo141116x(fVar.mo141123b().get(N), Long.valueOf(fVar2.f75264l.f287029k));
                return Long.valueOf(x != null ? x.longValue() : this.f75278d.f75264l.f287029k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: fc3.f$f */
    public static final class C27074f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27068f f75279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27074f(C27068f fVar) {
            super(0);
            this.f75279d = fVar;
        }

        public Object invoke() {
            String N = C27068f.m36258N(this.f75279d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C27068f.m36257M(this.f75279d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75279d.f75265m;
            if (fVar != null) {
                C27068f fVar2 = this.f75279d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(N), fVar2.f75264l.f287024f);
                return y != null ? y : this.f75279d.f75264l.f287024f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27068f(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75268p = C36568h.m40986b(iVar, new C27074f(this));
        this.f75269q = C36568h.m40986b(iVar, new C27071c(this));
        this.f75270r = C36568h.m40986b(iVar, new C27070b(this));
        this.f75271s = C36568h.m40986b(iVar, new C27069a(this));
        this.f75272t = C36568h.m40986b(iVar, new C27072d(this));
        this.f75273u = C36568h.m40986b(iVar, new C27073e(this));
        this.f75265m = fVar;
        this.f75266n = str;
    }

    /* renamed from: M */
    public static final void m36257M(C27068f fVar, String str, C101656f.C101658b bVar) {
        C101656f fVar2 = fVar.f75265m;
        if (fVar2 == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar2.mo141123b().containsKey(str) && fVar.f75267o != C101656f.C101657a.ParseEnd) {
            C101656f fVar3 = fVar.f75265m;
            if (fVar3 != null) {
                fVar.f75267o = fVar3.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: N */
    public static final String m36258N(C27068f fVar, String str) {
        String str2;
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = fVar.f75266n;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = fVar.f75266n;
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
    public String mo54566A() {
        return (String) this.f75271s.getValue();
    }

    /* renamed from: B */
    public String mo54567B() {
        return (String) this.f75270r.getValue();
    }

    /* renamed from: C */
    public String mo54568C() {
        return (String) this.f75269q.getValue();
    }

    /* renamed from: D */
    public String mo54569D() {
        return (String) this.f75272t.getValue();
    }

    /* renamed from: E */
    public long mo54570E() {
        return ((Number) this.f75273u.getValue()).longValue();
    }

    /* renamed from: F */
    public String mo54571F() {
        return (String) this.f75268p.getValue();
    }

    /* renamed from: G */
    public void mo54572G(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: H */
    public void mo54573H(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: I */
    public void mo54574I(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: J */
    public void mo54575J(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: K */
    public void mo54576K(long j) {
    }

    /* renamed from: L */
    public void mo54577L(String str) {
        C87412m.m108594g(str, "value");
    }
}
