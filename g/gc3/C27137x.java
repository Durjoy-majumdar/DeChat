package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.x */
public final class C27137x extends C27079a {

    /* renamed from: A */
    public final C13601g f75435A;

    /* renamed from: B */
    public final C13601g f75436B;

    /* renamed from: C */
    public final C13601g f75437C;

    /* renamed from: D */
    public final C13601g f75438D;

    /* renamed from: E */
    public final C13601g f75439E;

    /* renamed from: F */
    public final C13601g f75440F;

    /* renamed from: G */
    public final C13601g f75441G;

    /* renamed from: H */
    public final C13601g f75442H;

    /* renamed from: I */
    public final C13601g f75443I;

    /* renamed from: J */
    public final C13601g f75444J;

    /* renamed from: K */
    public final C13601g f75445K;

    /* renamed from: L */
    public final C13601g f75446L;

    /* renamed from: M */
    public final C13601g f75447M;

    /* renamed from: u */
    public final C27079a f75448u = new C27079a();

    /* renamed from: v */
    public C101656f f75449v;

    /* renamed from: w */
    public String f75450w;

    /* renamed from: x */
    public C101656f.C101657a f75451x;

    /* renamed from: y */
    public final C13601g f75452y;

    /* renamed from: z */
    public final C13601g f75453z;

    /* renamed from: gc3.x$a */
    public static final class C27138a extends C87413o implements C32224a<C27084b> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27138a(C27137x xVar) {
            super(0);
            this.f75454d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75454d, "alnode");
            C27137x.m36521e0(this.f75454d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75454d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75454d.f75448u.f75291l;
            } else {
                C27137x xVar = this.f75454d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27086d(fVar2, xVar.mo54682g0("alnode"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$b */
    public static final class C27139b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27139b(C27137x xVar) {
            super(0);
            this.f75455d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75455d, "atuserlist");
            C27137x.m36521e0(this.f75455d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75455d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75455d;
                String y = xVar.mo141117y(fVar.mo141123b().get(f0), xVar.f75448u.f75293n);
                return y != null ? y : this.f75455d.f75448u.f75293n;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$c */
    public static final class C27140c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27140c(C27137x xVar) {
            super(0);
            this.f75456d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75456d, "bizflag");
            C27137x.m36521e0(this.f75456d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75456d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75456d;
                Integer w = xVar.mo141115w(fVar.mo141123b().get(f0), Integer.valueOf(xVar.f75448u.f75290k));
                return Integer.valueOf(w != null ? w.intValue() : this.f75456d.f75448u.f75290k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$d */
    public static final class C27141d extends C87413o implements C32224a<C27102h> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27141d(C27137x xVar) {
            super(0);
            this.f75457d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75457d, "appmsg_pd");
            C27137x.m36521e0(this.f75457d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75457d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75457d.f75448u.f75299t;
            } else {
                C27137x xVar = this.f75457d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27104j(fVar2, xVar.mo54682g0("appmsg_pd"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$e */
    public static final class C27142e extends C87413o implements C32224a<C27108k> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27142e(C27137x xVar) {
            super(0);
            this.f75458d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75458d, "imgmsg_pd");
            C27137x.m36521e0(this.f75458d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75458d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75458d.f75448u.f75297r;
            } else {
                C27137x xVar = this.f75458d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27110m(fVar2, xVar.mo54682g0("imgmsg_pd"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$f */
    public static final class C27143f extends C87413o implements C32224a<C98103n> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27143f(C27137x xVar) {
            super(0);
            this.f75459d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75459d, "mediaeditcontent");
            C27137x.m36521e0(this.f75459d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75459d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75459d.f75448u.f75294o;
            } else {
                C27137x xVar = this.f75459d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C98105p(fVar2, xVar.mo54682g0("mediaeditcontent"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$g */
    public static final class C27144g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27144g(C27137x xVar) {
            super(0);
            this.f75460d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75460d, "membercount");
            C27137x.m36521e0(this.f75460d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75460d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75460d;
                Integer w = xVar.mo141115w(fVar.mo141123b().get(f0), Integer.valueOf(xVar.f75448u.f75287h));
                return Integer.valueOf(w != null ? w.intValue() : this.f75460d.f75448u.f75287h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$h */
    public static final class C27145h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27145h(C27137x xVar) {
            super(0);
            this.f75461d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75461d, "NotAutoDownloadRange");
            C27137x.m36521e0(this.f75461d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75461d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75461d;
                String y = xVar.mo141117y(fVar.mo141123b().get(f0), xVar.f75448u.f75288i);
                return y != null ? y : this.f75461d.f75448u.f75288i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$i */
    public static final class C27146i extends C87413o implements C32224a<C27117q> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27146i(C27137x xVar) {
            super(0);
            this.f75462d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75462d, "passthrough");
            C27137x.m36521e0(this.f75462d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75462d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75462d.f75448u.f75295p;
            } else {
                C27137x xVar = this.f75462d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27119s(fVar2, xVar.mo54682g0("passthrough"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$j */
    public static final class C27147j extends C87413o implements C32224a<C27121t> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27147j(C27137x xVar) {
            super(0);
            this.f75463d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75463d, "sec_msg_node");
            C27137x.m36521e0(this.f75463d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75463d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75463d.f75448u.f75285f;
            } else {
                C27137x xVar = this.f75463d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27123v(fVar2, xVar.mo54682g0("sec_msg_node"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$k */
    public static final class C27148k extends C87413o implements C32224a<C27153y> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27148k(C27137x xVar) {
            super(0);
            this.f75464d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75464d, "share_msg");
            C27137x.m36521e0(this.f75464d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75464d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75464d.f75448u.f75292m;
            } else {
                C27137x xVar = this.f75464d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27080a0(fVar2, xVar.mo54682g0("share_msg"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$l */
    public static final class C27149l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27149l(C27137x xVar) {
            super(0);
            this.f75465d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75465d, "signature");
            C27137x.m36521e0(this.f75465d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75465d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75465d;
                String y = xVar.mo141117y(fVar.mo141123b().get(f0), xVar.f75448u.f75289j);
                return y != null ? y : this.f75465d.f75448u.f75289j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$m */
    public static final class C27150m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27150m(C27137x xVar) {
            super(0);
            this.f75466d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75466d, "silence");
            C27137x.m36521e0(this.f75466d, f0, C101656f.C101658b.Text);
            C101656f fVar = this.f75466d.f75449v;
            if (fVar != null) {
                C27137x xVar = this.f75466d;
                Integer w = xVar.mo141115w(fVar.mo141123b().get(f0), Integer.valueOf(xVar.f75448u.f75286g));
                return Integer.valueOf(w != null ? w.intValue() : this.f75466d.f75448u.f75286g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.x$n */
    public static final class C27151n extends C87413o implements C32224a<C98097b0> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27151n(C27137x xVar) {
            super(0);
            this.f75467d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75467d, "tmp_node");
            C27137x.m36521e0(this.f75467d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75467d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75467d.f75448u.f75296q;
            } else {
                C27137x xVar = this.f75467d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C98099d0(fVar2, xVar.mo54682g0("tmp_node"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: gc3.x$o */
    public static final class C27152o extends C87413o implements C32224a<C27090e0> {

        /* renamed from: d */
        public final /* synthetic */ C27137x f75468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27152o(C27137x xVar) {
            super(0);
            this.f75468d = xVar;
        }

        public Object invoke() {
            String f0 = C27137x.m36522f0(this.f75468d, "videomsg_pd");
            C27137x.m36521e0(this.f75468d, f0, C101656f.C101658b.Start);
            C101656f fVar = this.f75468d.f75449v;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(f0)) {
                return this.f75468d.f75448u.f75298s;
            } else {
                C27137x xVar = this.f75468d;
                C101656f fVar2 = xVar.f75449v;
                if (fVar2 != null) {
                    return new C27095g0(fVar2, xVar.mo54682g0("videomsg_pd"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    public C27137x(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75452y = C36568h.m40986b(iVar, new C27147j(this));
        this.f75453z = C36568h.m40986b(iVar, new C27150m(this));
        this.f75435A = C36568h.m40986b(iVar, new C27144g(this));
        this.f75436B = C36568h.m40986b(iVar, new C27145h(this));
        this.f75437C = C36568h.m40986b(iVar, new C27149l(this));
        this.f75438D = C36568h.m40986b(iVar, new C27140c(this));
        this.f75439E = C36568h.m40986b(iVar, new C27138a(this));
        this.f75440F = C36568h.m40986b(iVar, new C27148k(this));
        this.f75441G = C36568h.m40986b(iVar, new C27139b(this));
        this.f75442H = C36568h.m40986b(iVar, new C27143f(this));
        this.f75443I = C36568h.m40986b(iVar, new C27146i(this));
        this.f75444J = C36568h.m40986b(iVar, new C27151n(this));
        this.f75445K = C36568h.m40986b(iVar, new C27142e(this));
        this.f75446L = C36568h.m40986b(iVar, new C27152o(this));
        this.f75447M = C36568h.m40986b(iVar, new C27141d(this));
        this.f75449v = fVar;
        this.f75450w = str;
    }

    /* renamed from: e0 */
    public static final void m36521e0(C27137x xVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = xVar.f75449v;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && xVar.f75451x != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = xVar.f75449v;
            if (fVar2 != null) {
                xVar.f75451x = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: f0 */
    public static final String m36522f0(C27137x xVar, String str) {
        xVar.getClass();
        return '.' + xVar.mo54682g0(str);
    }

    /* renamed from: A */
    public C27084b mo54580A() {
        return (C27084b) this.f75439E.getValue();
    }

    /* renamed from: B */
    public String mo54581B() {
        return (String) this.f75441G.getValue();
    }

    /* renamed from: C */
    public int mo54582C() {
        return ((Number) this.f75438D.getValue()).intValue();
    }

    /* renamed from: D */
    public C27102h mo54583D() {
        return (C27102h) this.f75447M.getValue();
    }

    /* renamed from: E */
    public C27108k mo54584E() {
        return (C27108k) this.f75445K.getValue();
    }

    /* renamed from: F */
    public C98103n mo54585F() {
        return (C98103n) this.f75442H.getValue();
    }

    /* renamed from: G */
    public int mo54586G() {
        return ((Number) this.f75435A.getValue()).intValue();
    }

    /* renamed from: H */
    public String mo54587H() {
        return (String) this.f75436B.getValue();
    }

    /* renamed from: I */
    public C27117q mo54588I() {
        return (C27117q) this.f75443I.getValue();
    }

    /* renamed from: J */
    public C27121t mo54589J() {
        return (C27121t) this.f75452y.getValue();
    }

    /* renamed from: K */
    public C27153y mo54590K() {
        return (C27153y) this.f75440F.getValue();
    }

    /* renamed from: L */
    public String mo54591L() {
        return (String) this.f75437C.getValue();
    }

    /* renamed from: M */
    public int mo54592M() {
        return ((Number) this.f75453z.getValue()).intValue();
    }

    /* renamed from: N */
    public C98097b0 mo54593N() {
        return (C98097b0) this.f75444J.getValue();
    }

    /* renamed from: O */
    public C27090e0 mo54594O() {
        return (C27090e0) this.f75446L.getValue();
    }

    /* renamed from: P */
    public void mo54595P(C27084b bVar) {
    }

    /* renamed from: Q */
    public void mo54596Q(String str) {
    }

    /* renamed from: R */
    public void mo54597R(int i) {
    }

    /* renamed from: S */
    public void mo54598S(C27102h hVar) {
    }

    /* renamed from: T */
    public void mo54599T(C27108k kVar) {
    }

    /* renamed from: U */
    public void mo54600U(C98103n nVar) {
    }

    /* renamed from: V */
    public void mo54601V(int i) {
    }

    /* renamed from: W */
    public void mo54602W(String str) {
    }

    /* renamed from: X */
    public void mo54603X(C27117q qVar) {
    }

    /* renamed from: Y */
    public void mo54604Y(C27121t tVar) {
    }

    /* renamed from: Z */
    public void mo54605Z(C27153y yVar) {
    }

    /* renamed from: a0 */
    public void mo54606a0(String str) {
    }

    /* renamed from: b0 */
    public void mo54607b0(int i) {
    }

    /* renamed from: c0 */
    public void mo54608c0(C98097b0 b0Var) {
    }

    /* renamed from: d0 */
    public void mo54609d0(C27090e0 e0Var) {
    }

    /* renamed from: g0 */
    public final String mo54682g0(String str) {
        String str2 = this.f75450w;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f75450w;
            if (str3 != null) {
                sb.append(str3);
                sb.append('.');
                sb.append(str);
                return sb.toString();
            }
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        }
    }
}
