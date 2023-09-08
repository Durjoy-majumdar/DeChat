package ic3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: ic3.c */
public final class C27485c extends C98663a {

    /* renamed from: F */
    public final C98663a f76194F = new C98663a();

    /* renamed from: G */
    public C101656f f76195G;

    /* renamed from: H */
    public String f76196H;

    /* renamed from: I */
    public C101656f.C101657a f76197I;

    /* renamed from: J */
    public final C13601g f76198J;

    /* renamed from: K */
    public final C13601g f76199K;

    /* renamed from: L */
    public final C13601g f76200L;

    /* renamed from: M */
    public final C13601g f76201M;

    /* renamed from: N */
    public final C13601g f76202N;

    /* renamed from: O */
    public final C13601g f76203O;

    /* renamed from: P */
    public final C13601g f76204P;

    /* renamed from: Q */
    public final C13601g f76205Q;

    /* renamed from: R */
    public final C13601g f76206R;

    /* renamed from: S */
    public final C13601g f76207S;

    /* renamed from: T */
    public final C13601g f76208T;

    /* renamed from: U */
    public final C13601g f76209U;

    /* renamed from: V */
    public final C13601g f76210V;

    /* renamed from: W */
    public final C13601g f76211W;

    /* renamed from: X */
    public final C13601g f76212X;

    /* renamed from: Y */
    public final C13601g f76213Y;

    /* renamed from: Z */
    public final C13601g f76214Z;

    /* renamed from: a0 */
    public final C13601g f76215a0;

    /* renamed from: b0 */
    public final C13601g f76216b0;

    /* renamed from: c0 */
    public final C13601g f76217c0;

    /* renamed from: d0 */
    public final C13601g f76218d0;

    /* renamed from: e0 */
    public final C13601g f76219e0;

    /* renamed from: f0 */
    public final C13601g f76220f0;

    /* renamed from: g0 */
    public final C13601g f76221g0;

    /* renamed from: h0 */
    public final C13601g f76222h0;

    /* renamed from: i0 */
    public final C13601g f76223i0;

    /* renamed from: ic3.c$a */
    public static final class C27486a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27486a(C27485c cVar) {
            super(0);
            this.f76224d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76224d, "aeskey");
            C27485c.m37390A0(this.f76224d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76224d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76224d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76250f);
                return y != null ? y : this.f76224d.f76194F.f76250f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$b */
    public static final class C27487b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27487b(C27485c cVar) {
            super(0);
            this.f76225d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76225d, "cdnrawvideoaeskey");
            C27485c.m37390A0(this.f76225d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76225d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76225d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76266v);
                return y != null ? y : this.f76225d.f76194F.f76266v;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$c */
    public static final class C27488c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27488c(C27485c cVar) {
            super(0);
            this.f76226d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76226d, "cdnthumbaeskey");
            C27485c.m37390A0(this.f76226d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76226d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76226d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76252h);
                return y != null ? y : this.f76226d.f76194F.f76252h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$d */
    public static final class C27489d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27489d(C27485c cVar) {
            super(0);
            this.f76227d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76227d, "cdnthumbheight");
            C27485c.m37390A0(this.f76227d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76227d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76227d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76258n));
                return Integer.valueOf(w != null ? w.intValue() : this.f76227d.f76194F.f76258n);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$e */
    public static final class C27490e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27490e(C27485c cVar) {
            super(0);
            this.f76228d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76228d, "cdnthumblength");
            C27485c.m37390A0(this.f76228d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76228d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76228d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76256l));
                return Integer.valueOf(w != null ? w.intValue() : this.f76228d.f76194F.f76256l);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$f */
    public static final class C27491f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27491f(C27485c cVar) {
            super(0);
            this.f76229d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76229d, "cdnthumburl");
            C27485c.m37390A0(this.f76229d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76229d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76229d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76253i);
                return y != null ? y : this.f76229d.f76194F.f76253i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$g */
    public static final class C27492g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27492g(C27485c cVar) {
            super(0);
            this.f76230d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76230d, "cdnthumbwidth");
            C27485c.m37390A0(this.f76230d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76230d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76230d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76257m));
                return Integer.valueOf(w != null ? w.intValue() : this.f76230d.f76194F.f76257m);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$h */
    public static final class C27493h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27493h(C27485c cVar) {
            super(0);
            this.f76231d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76231d, "cdnvideourl");
            C27485c.m37390A0(this.f76231d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76231d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76231d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76251g);
                return y != null ? y : this.f76231d.f76194F.f76251g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$i */
    public static final class C27494i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27494i(C27485c cVar) {
            super(0);
            this.f76232d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76232d, "cdnrawvideourl");
            C27485c.m37390A0(this.f76232d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76232d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76232d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76265u);
                return y != null ? y : this.f76232d.f76194F.f76265u;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$j */
    public static final class C27495j extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27495j(C27485c cVar) {
            super(0);
            this.f76233d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76233d, FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
            C27485c.m37390A0(this.f76233d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76233d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76233d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f289279C);
                return y != null ? y : this.f76233d.f76194F.f289279C;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$k */
    public static final class C27496k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27496k(C27485c cVar) {
            super(0);
            this.f76234d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76234d, "fromusername");
            C27485c.m37390A0(this.f76234d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76234d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76234d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76259o);
                return y != null ? y : this.f76234d.f76194F.f76259o;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$l */
    public static final class C27497l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27497l(C27485c cVar) {
            super(0);
            this.f76235d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76235d, "isad");
            C27485c.m37390A0(this.f76235d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76235d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76235d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76268x));
                return Integer.valueOf(w != null ? w.intValue() : this.f76235d.f76194F.f76268x);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$m */
    public static final class C27498m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27498m(C27485c cVar) {
            super(0);
            this.f76236d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76236d, "isplaceholder");
            C27485c.m37390A0(this.f76236d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76236d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76236d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76262r));
                return Integer.valueOf(w != null ? w.intValue() : this.f76236d.f76194F.f76262r);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$n */
    public static final class C27499n extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27499n(C27485c cVar) {
            super(0);
            this.f76237d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76237d, "length");
            C27485c.m37390A0(this.f76237d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76237d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76237d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76254j));
                return Integer.valueOf(w != null ? w.intValue() : this.f76237d.f76194F.f76254j);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$o */
    public static final class C27500o extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27500o(C27485c cVar) {
            super(0);
            this.f76238d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76238d, "md5");
            C27485c.m37390A0(this.f76238d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76238d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76238d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76260p);
                return y != null ? y : this.f76238d.f76194F.f76260p;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$p */
    public static final class C27501p extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27501p(C27485c cVar) {
            super(0);
            this.f76239d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76239d, "newmd5");
            C27485c.m37390A0(this.f76239d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76239d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76239d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76261q);
                return y != null ? y : this.f76239d.f76194F.f76261q;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$q */
    public static final class C27502q extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27502q(C27485c cVar) {
            super(0);
            this.f76240d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76240d, "offset");
            C27485c.m37390A0(this.f76240d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76240d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76240d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f289280D));
                return Integer.valueOf(w != null ? w.intValue() : this.f76240d.f76194F.f289280D);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$r */
    public static final class C27503r extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27503r(C27485c cVar) {
            super(0);
            this.f76241d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76241d, "overwritenewmsgid");
            C27485c.m37390A0(this.f76241d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76241d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76241d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76267w));
                return Integer.valueOf(w != null ? w.intValue() : this.f76241d.f76194F.f76267w);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$s */
    public static final class C27504s extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27504s(C27485c cVar) {
            super(0);
            this.f76242d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76242d, "playlength");
            C27485c.m37390A0(this.f76242d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76242d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76242d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76255k));
                return Integer.valueOf(w != null ? w.intValue() : this.f76242d.f76194F.f76255k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$t */
    public static final class C27505t extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27505t(C27485c cVar) {
            super(0);
            this.f76243d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76243d, "rawfilename");
            C27485c.m37390A0(this.f76243d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76243d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76243d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f289283z);
                return y != null ? y : this.f76243d.f76194F.f289283z;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$u */
    public static final class C27506u extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27506u(C27485c cVar) {
            super(0);
            this.f76244d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76244d, "rawlength");
            C27485c.m37390A0(this.f76244d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76244d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76244d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f76264t));
                return Integer.valueOf(w != null ? w.intValue() : this.f76244d.f76194F.f76264t);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$v */
    public static final class C27507v extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27507v(C27485c cVar) {
            super(0);
            this.f76245d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76245d, "rawmd5");
            C27485c.m37390A0(this.f76245d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76245d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76245d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f76263s);
                return y != null ? y : this.f76245d.f76194F.f76263s;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$w */
    public static final class C27508w extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27508w(C27485c cVar) {
            super(0);
            this.f76246d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76246d, "rawoffset");
            C27485c.m37390A0(this.f76246d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76246d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76246d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f289277A));
                return Integer.valueOf(w != null ? w.intValue() : this.f76246d.f76194F.f289277A);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$x */
    public static final class C27509x extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76247d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27509x(C27485c cVar) {
            super(0);
            this.f76247d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76247d, "rawtotallen");
            C27485c.m37390A0(this.f76247d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76247d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76247d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f289278B));
                return Integer.valueOf(w != null ? w.intValue() : this.f76247d.f76194F.f289278B);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$y */
    public static final class C27510y extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27510y(C27485c cVar) {
            super(0);
            this.f76248d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76248d, "thumbfullmd5");
            C27485c.m37390A0(this.f76248d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76248d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76248d;
                String y = cVar.mo141117y(fVar.mo141123b().get(B0), cVar.f76194F.f289282y);
                return y != null ? y : this.f76248d.f76194F.f289282y;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ic3.c$z */
    public static final class C27511z extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27485c f76249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27511z(C27485c cVar) {
            super(0);
            this.f76249d = cVar;
        }

        public Object invoke() {
            String B0 = C27485c.m37391B0(this.f76249d, "totallen");
            C27485c.m37390A0(this.f76249d, B0, C101656f.C101658b.Text);
            C101656f fVar = this.f76249d.f76195G;
            if (fVar != null) {
                C27485c cVar = this.f76249d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(B0), Integer.valueOf(cVar.f76194F.f289281E));
                return Integer.valueOf(w != null ? w.intValue() : this.f76249d.f76194F.f289281E);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27485c(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76198J = C36568h.m40986b(iVar, new C27486a(this));
        this.f76199K = C36568h.m40986b(iVar, new C27493h(this));
        this.f76200L = C36568h.m40986b(iVar, new C27488c(this));
        this.f76201M = C36568h.m40986b(iVar, new C27491f(this));
        this.f76202N = C36568h.m40986b(iVar, new C27499n(this));
        this.f76203O = C36568h.m40986b(iVar, new C27504s(this));
        this.f76204P = C36568h.m40986b(iVar, new C27490e(this));
        this.f76205Q = C36568h.m40986b(iVar, new C27492g(this));
        this.f76206R = C36568h.m40986b(iVar, new C27489d(this));
        this.f76207S = C36568h.m40986b(iVar, new C27496k(this));
        this.f76208T = C36568h.m40986b(iVar, new C27500o(this));
        this.f76209U = C36568h.m40986b(iVar, new C27501p(this));
        this.f76210V = C36568h.m40986b(iVar, new C27498m(this));
        this.f76211W = C36568h.m40986b(iVar, new C27507v(this));
        this.f76212X = C36568h.m40986b(iVar, new C27506u(this));
        this.f76213Y = C36568h.m40986b(iVar, new C27494i(this));
        this.f76214Z = C36568h.m40986b(iVar, new C27487b(this));
        this.f76215a0 = C36568h.m40986b(iVar, new C27503r(this));
        this.f76216b0 = C36568h.m40986b(iVar, new C27497l(this));
        this.f76217c0 = C36568h.m40986b(iVar, new C27510y(this));
        this.f76218d0 = C36568h.m40986b(iVar, new C27505t(this));
        this.f76219e0 = C36568h.m40986b(iVar, new C27508w(this));
        this.f76220f0 = C36568h.m40986b(iVar, new C27509x(this));
        this.f76221g0 = C36568h.m40986b(iVar, new C27495j(this));
        this.f76222h0 = C36568h.m40986b(iVar, new C27502q(this));
        this.f76223i0 = C36568h.m40986b(iVar, new C27511z(this));
        this.f76195G = fVar;
        this.f76196H = str;
    }

    /* renamed from: A0 */
    public static final void m37390A0(C27485c cVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = cVar.f76195G;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && cVar.f76197I != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = cVar.f76195G;
            if (fVar2 != null) {
                cVar.f76197I = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: B0 */
    public static final String m37391B0(C27485c cVar, String str) {
        String str2;
        cVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = cVar.f76196H;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = cVar.f76196H;
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
    public String mo55190A() {
        return (String) this.f76198J.getValue();
    }

    /* renamed from: B */
    public String mo55191B() {
        return (String) this.f76214Z.getValue();
    }

    /* renamed from: C */
    public String mo55192C() {
        return (String) this.f76200L.getValue();
    }

    /* renamed from: D */
    public int mo55193D() {
        return ((Number) this.f76206R.getValue()).intValue();
    }

    /* renamed from: E */
    public int mo55194E() {
        return ((Number) this.f76204P.getValue()).intValue();
    }

    /* renamed from: F */
    public String mo55195F() {
        return (String) this.f76201M.getValue();
    }

    /* renamed from: G */
    public int mo55196G() {
        return ((Number) this.f76205Q.getValue()).intValue();
    }

    /* renamed from: H */
    public String mo55197H() {
        return (String) this.f76199K.getValue();
    }

    /* renamed from: I */
    public String mo55198I() {
        return (String) this.f76213Y.getValue();
    }

    /* renamed from: J */
    public String mo55199J() {
        return (String) this.f76207S.getValue();
    }

    /* renamed from: K */
    public int mo55200K() {
        return ((Number) this.f76202N.getValue()).intValue();
    }

    /* renamed from: L */
    public String mo55201L() {
        return (String) this.f76208T.getValue();
    }

    /* renamed from: M */
    public String mo55202M() {
        return (String) this.f76209U.getValue();
    }

    /* renamed from: N */
    public int mo55203N() {
        return ((Number) this.f76215a0.getValue()).intValue();
    }

    /* renamed from: O */
    public int mo55204O() {
        return ((Number) this.f76203O.getValue()).intValue();
    }

    /* renamed from: P */
    public int mo55205P() {
        return ((Number) this.f76212X.getValue()).intValue();
    }

    /* renamed from: Q */
    public String mo55206Q() {
        return (String) this.f76211W.getValue();
    }

    /* renamed from: R */
    public int mo55207R() {
        return ((Number) this.f76216b0.getValue()).intValue();
    }

    /* renamed from: S */
    public int mo55208S() {
        return ((Number) this.f76210V.getValue()).intValue();
    }

    /* renamed from: T */
    public void mo55209T(int i) {
    }

    /* renamed from: U */
    public void mo55210U(String str) {
    }

    /* renamed from: V */
    public void mo55211V(String str) {
    }

    /* renamed from: W */
    public void mo55212W(String str) {
    }

    /* renamed from: X */
    public void mo55213X(int i) {
    }

    /* renamed from: Y */
    public void mo55214Y(int i) {
    }

    /* renamed from: Z */
    public void mo55215Z(String str) {
    }

    /* renamed from: a0 */
    public void mo55216a0(int i) {
    }

    /* renamed from: b0 */
    public void mo55217b0(String str) {
    }

    /* renamed from: c0 */
    public void mo55218c0(String str) {
    }

    /* renamed from: d0 */
    public void mo55219d0(String str) {
    }

    /* renamed from: e0 */
    public void mo55220e0(int i) {
    }

    /* renamed from: f0 */
    public void mo55221f0(String str) {
    }

    /* renamed from: g0 */
    public void mo55222g0(String str) {
    }

    /* renamed from: h0 */
    public void mo55223h0(int i) {
    }

    /* renamed from: i0 */
    public void mo55224i0(int i) {
    }

    /* renamed from: j0 */
    public void mo55225j0(int i) {
    }

    /* renamed from: k0 */
    public void mo55226k0(int i) {
    }

    /* renamed from: l0 */
    public void mo55227l0(String str) {
    }

    /* renamed from: m0 */
    public String mo55228m0() {
        return (String) this.f76221g0.getValue();
    }

    /* renamed from: n0 */
    public int mo55229n0() {
        return ((Number) this.f76222h0.getValue()).intValue();
    }

    /* renamed from: o0 */
    public String mo55230o0() {
        return (String) this.f76218d0.getValue();
    }

    /* renamed from: p0 */
    public int mo55231p0() {
        return ((Number) this.f76219e0.getValue()).intValue();
    }

    /* renamed from: q0 */
    public int mo55232q0() {
        return ((Number) this.f76220f0.getValue()).intValue();
    }

    /* renamed from: r0 */
    public String mo55233r0() {
        return (String) this.f76217c0.getValue();
    }

    /* renamed from: s0 */
    public int mo55234s0() {
        return ((Number) this.f76223i0.getValue()).intValue();
    }

    /* renamed from: t0 */
    public void mo55235t0(String str) {
    }

    /* renamed from: u0 */
    public void mo55236u0(int i) {
    }

    /* renamed from: v0 */
    public void mo55237v0(String str) {
    }

    /* renamed from: w0 */
    public void mo55238w0(int i) {
    }

    /* renamed from: x0 */
    public void mo55239x0(int i) {
    }

    /* renamed from: y0 */
    public void mo55240y0(String str) {
    }

    /* renamed from: z0 */
    public void mo55241z0(int i) {
    }
}
