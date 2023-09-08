package p298c6;

import android.graphics.Matrix;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p298c6.C23690b;
import p298c6.C23780h;

/* renamed from: c6.g */
public class C23713g {

    /* renamed from: a */
    public C23738f0 f67934a = null;

    /* renamed from: b */
    public C23690b.C16852r f67935b = new C23690b.C16852r();

    /* renamed from: c */
    public Map<String, C23751l0> f67936c = new HashMap();

    /* renamed from: c6.g$a */
    public static class C23714a extends C23752m {
        /* renamed from: o */
        public String mo37264o() {
            return "a";
        }
    }

    /* renamed from: c6.g$a0 */
    public static class C23715a0 extends C23778z {
        /* renamed from: o */
        public String mo37264o() {
            return "polygon";
        }
    }

    /* renamed from: c6.g$a1 */
    public static abstract class C23716a1 extends C23777y0 {

        /* renamed from: o */
        public List<C23758p> f67937o;

        /* renamed from: p */
        public List<C23758p> f67938p;

        /* renamed from: q */
        public List<C23758p> f67939q;

        /* renamed from: r */
        public List<C23758p> f67940r;
    }

    /* renamed from: c6.g$b0 */
    public static class C23718b0 extends C23750l {

        /* renamed from: o */
        public C23758p f67945o;

        /* renamed from: p */
        public C23758p f67946p;

        /* renamed from: q */
        public C23758p f67947q;

        /* renamed from: r */
        public C23758p f67948r;

        /* renamed from: s */
        public C23758p f67949s;

        /* renamed from: t */
        public C23758p f67950t;

        /* renamed from: o */
        public String mo37264o() {
            return "rect";
        }
    }

    /* renamed from: c6.g$b1 */
    public interface C23719b1 {
    }

    /* renamed from: c6.g$c */
    public static class C23720c {

        /* renamed from: a */
        public C23758p f67951a;

        /* renamed from: b */
        public C23758p f67952b;

        /* renamed from: c */
        public C23758p f67953c;

        /* renamed from: d */
        public C23758p f67954d;

        public C23720c(C23758p pVar, C23758p pVar2, C23758p pVar3, C23758p pVar4) {
            this.f67951a = pVar;
            this.f67952b = pVar2;
            this.f67953c = pVar3;
            this.f67954d = pVar4;
        }
    }

    /* renamed from: c6.g$c0 */
    public static class C23721c0 extends C23751l0 implements C23747j0 {
        /* renamed from: c */
        public void mo37266c(C23755n0 n0Var) {
        }

        /* renamed from: d */
        public List<C23755n0> mo37267d() {
            return Collections.emptyList();
        }

        /* renamed from: o */
        public String mo37264o() {
            return "solidColor";
        }
    }

    /* renamed from: c6.g$c1 */
    public static class C23722c1 extends C23755n0 implements C23775x0 {

        /* renamed from: c */
        public String f67955c;

        public C23722c1(String str) {
            this.f67955c = str;
        }

        /* renamed from: a */
        public C23719b1 mo37268a() {
            return null;
        }

        public String toString() {
            return "TextChild: '" + this.f67955c + "'";
        }
    }

    /* renamed from: c6.g$d */
    public static class C23723d extends C23750l {

        /* renamed from: o */
        public C23758p f67956o;

        /* renamed from: p */
        public C23758p f67957p;

        /* renamed from: q */
        public C23758p f67958q;

        /* renamed from: o */
        public String mo37264o() {
            return "circle";
        }
    }

    /* renamed from: c6.g$d0 */
    public static class C23724d0 extends C23751l0 implements C23747j0 {

        /* renamed from: h */
        public Float f67959h;

        /* renamed from: c */
        public void mo37266c(C23755n0 n0Var) {
        }

        /* renamed from: d */
        public List<C23755n0> mo37267d() {
            return Collections.emptyList();
        }

        /* renamed from: o */
        public String mo37264o() {
            return "stop";
        }
    }

    /* renamed from: c6.g$d1 */
    public enum C23725d1 {
        px,
        em,
        ex,
        pt,
        percent
    }

    /* renamed from: c6.g$e */
    public static class C23726e extends C23752m implements C23766t {

        /* renamed from: p */
        public Boolean f67966p;

        /* renamed from: o */
        public String mo37264o() {
            return "clipPath";
        }
    }

    /* renamed from: c6.g$e0 */
    public static class C23727e0 implements Cloneable {

        /* renamed from: A */
        public C23729f f67967A;

        /* renamed from: B */
        public Boolean f67968B;

        /* renamed from: C */
        public C23720c f67969C;

        /* renamed from: D */
        public String f67970D;

        /* renamed from: E */
        public String f67971E;

        /* renamed from: F */
        public String f67972F;

        /* renamed from: G */
        public Boolean f67973G;

        /* renamed from: H */
        public Boolean f67974H;

        /* renamed from: I */
        public C23757o0 f67975I;

        /* renamed from: J */
        public Float f67976J;

        /* renamed from: K */
        public String f67977K;

        /* renamed from: L */
        public C23731a f67978L;

        /* renamed from: M */
        public String f67979M;

        /* renamed from: N */
        public C23757o0 f67980N;

        /* renamed from: P */
        public Float f67981P;

        /* renamed from: Q */
        public C23757o0 f67982Q;

        /* renamed from: R */
        public Float f67983R;

        /* renamed from: S */
        public C23735i f67984S;

        /* renamed from: T */
        public C23728e f67985T;

        /* renamed from: d */
        public long f67986d = 0;

        /* renamed from: e */
        public C23757o0 f67987e;

        /* renamed from: f */
        public C23731a f67988f;

        /* renamed from: g */
        public Float f67989g;

        /* renamed from: h */
        public C23757o0 f67990h;

        /* renamed from: i */
        public Float f67991i;

        /* renamed from: j */
        public C23758p f67992j;

        /* renamed from: n */
        public C23732c f67993n;

        /* renamed from: o */
        public C23733d f67994o;

        /* renamed from: p */
        public Float f67995p;

        /* renamed from: q */
        public C23758p[] f67996q;

        /* renamed from: r */
        public C23758p f67997r;

        /* renamed from: s */
        public Float f67998s;

        /* renamed from: t */
        public C23737f f67999t;

        /* renamed from: u */
        public List<String> f68000u;

        /* renamed from: v */
        public C23758p f68001v;

        /* renamed from: w */
        public Integer f68002w;

        /* renamed from: x */
        public C16855b f68003x;

        /* renamed from: y */
        public C23730g f68004y;

        /* renamed from: z */
        public C23734h f68005z;

        /* renamed from: c6.g$e0$b */
        public enum C16855b {
            Normal,
            Italic,
            Oblique
        }

        /* renamed from: c6.g$e0$e */
        public enum C23728e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* renamed from: c6.g$e0$f */
        public enum C23729f {
            Start,
            Middle,
            End
        }

        /* renamed from: c6.g$e0$g */
        public enum C23730g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* renamed from: c6.g$e0$a */
        public enum C23731a {
            NonZero,
            EvenOdd
        }

        /* renamed from: c6.g$e0$c */
        public enum C23732c {
            Butt,
            Round,
            Square
        }

        /* renamed from: c6.g$e0$d */
        public enum C23733d {
            Miter,
            Round,
            Bevel
        }

        /* renamed from: c6.g$e0$h */
        public enum C23734h {
            LTR,
            RTL
        }

        /* renamed from: c6.g$e0$i */
        public enum C23735i {
            None,
            NonScalingStroke
        }

        /* renamed from: a */
        public static C23727e0 m28387a() {
            C23727e0 e0Var = new C23727e0();
            e0Var.f67986d = -1;
            C23737f fVar = C23737f.f68042e;
            e0Var.f67987e = fVar;
            C23731a aVar = C23731a.NonZero;
            e0Var.f67988f = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e0Var.f67989g = valueOf;
            e0Var.f67990h = null;
            e0Var.f67991i = valueOf;
            e0Var.f67992j = new C23758p(1.0f);
            e0Var.f67993n = C23732c.Butt;
            e0Var.f67994o = C23733d.Miter;
            e0Var.f67995p = Float.valueOf(4.0f);
            e0Var.f67996q = null;
            e0Var.f67997r = new C23758p(0.0f);
            e0Var.f67998s = valueOf;
            e0Var.f67999t = fVar;
            e0Var.f68000u = null;
            e0Var.f68001v = new C23758p(12.0f, C23725d1.pt);
            e0Var.f68002w = 400;
            e0Var.f68003x = C16855b.Normal;
            e0Var.f68004y = C23730g.None;
            e0Var.f68005z = C23734h.LTR;
            e0Var.f67967A = C23729f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f67968B = bool;
            e0Var.f67969C = null;
            e0Var.f67970D = null;
            e0Var.f67971E = null;
            e0Var.f67972F = null;
            e0Var.f67973G = bool;
            e0Var.f67974H = bool;
            e0Var.f67975I = fVar;
            e0Var.f67976J = valueOf;
            e0Var.f67977K = null;
            e0Var.f67978L = aVar;
            e0Var.f67979M = null;
            e0Var.f67980N = null;
            e0Var.f67981P = valueOf;
            e0Var.f67982Q = null;
            e0Var.f67983R = valueOf;
            e0Var.f67984S = C23735i.None;
            e0Var.f67985T = C23728e.auto;
            return e0Var;
        }

        public Object clone() {
            C23727e0 e0Var = (C23727e0) super.clone();
            C23758p[] pVarArr = this.f67996q;
            if (pVarArr != null) {
                e0Var.f67996q = (C23758p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    /* renamed from: c6.g$e1 */
    public static class C23736e1 extends C23752m {

        /* renamed from: p */
        public String f68037p;

        /* renamed from: q */
        public C23758p f68038q;

        /* renamed from: r */
        public C23758p f68039r;

        /* renamed from: s */
        public C23758p f68040s;

        /* renamed from: t */
        public C23758p f68041t;

        /* renamed from: o */
        public String mo37264o() {
            return "use";
        }
    }

    /* renamed from: c6.g$f */
    public static class C23737f extends C23757o0 {

        /* renamed from: e */
        public static final C23737f f68042e = new C23737f(-16777216);

        /* renamed from: f */
        public static final C23737f f68043f = new C23737f(0);

        /* renamed from: d */
        public int f68044d;

        public C23737f(int i) {
            this.f68044d = i;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.f68044d)});
        }
    }

    /* renamed from: c6.g$f0 */
    public static class C23738f0 extends C23763r0 {

        /* renamed from: q */
        public C23758p f68045q;

        /* renamed from: r */
        public C23758p f68046r;

        /* renamed from: s */
        public C23758p f68047s;

        /* renamed from: t */
        public C23758p f68048t;

        /* renamed from: o */
        public String mo37264o() {
            return "svg";
        }
    }

    /* renamed from: c6.g$f1 */
    public static class C23739f1 extends C23763r0 implements C23766t {
        /* renamed from: o */
        public String mo37264o() {
            return "view";
        }
    }

    /* renamed from: c6.g$g */
    public static class C23740g extends C23757o0 {

        /* renamed from: d */
        public static C23740g f68049d = new C23740g();
    }

    /* renamed from: c6.g$g0 */
    public interface C23741g0 {
        /* renamed from: b */
        void mo37272b(Set<String> set);

        /* renamed from: e */
        Set<String> mo37273e();

        /* renamed from: f */
        void mo37274f(Set<String> set);

        /* renamed from: g */
        void mo37275g(String str);

        /* renamed from: h */
        String mo37276h();

        /* renamed from: i */
        void mo37277i(Set<String> set);

        /* renamed from: j */
        Set<String> mo37278j();

        /* renamed from: k */
        Set<String> mo37279k();

        /* renamed from: l */
        void mo37280l(Set<String> set);

        /* renamed from: n */
        Set<String> mo37281n();
    }

    /* renamed from: c6.g$h */
    public static class C23742h extends C23752m implements C23766t {
        /* renamed from: o */
        public String mo37264o() {
            return "defs";
        }
    }

    /* renamed from: c6.g$h0 */
    public static abstract class C23743h0 extends C23749k0 implements C23747j0, C23741g0 {

        /* renamed from: i */
        public List<C23755n0> f68050i = new ArrayList();

        /* renamed from: j */
        public Set<String> f68051j = null;

        /* renamed from: k */
        public String f68052k = null;

        /* renamed from: l */
        public Set<String> f68053l;

        /* renamed from: m */
        public Set<String> f68054m = null;

        /* renamed from: n */
        public Set<String> f68055n = null;

        /* renamed from: b */
        public void mo37272b(Set<String> set) {
            this.f68053l = set;
        }

        /* renamed from: c */
        public void mo37266c(C23755n0 n0Var) {
            this.f68050i.add(n0Var);
        }

        /* renamed from: d */
        public List<C23755n0> mo37267d() {
            return this.f68050i;
        }

        /* renamed from: e */
        public Set<String> mo37273e() {
            return this.f68051j;
        }

        /* renamed from: f */
        public void mo37274f(Set<String> set) {
            this.f68054m = set;
        }

        /* renamed from: g */
        public void mo37275g(String str) {
            this.f68052k = str;
        }

        /* renamed from: h */
        public String mo37276h() {
            return this.f68052k;
        }

        /* renamed from: i */
        public void mo37277i(Set<String> set) {
            this.f68055n = set;
        }

        /* renamed from: j */
        public Set<String> mo37278j() {
            return this.f68054m;
        }

        /* renamed from: k */
        public Set<String> mo37279k() {
            return null;
        }

        /* renamed from: l */
        public void mo37280l(Set<String> set) {
            this.f68051j = set;
        }

        /* renamed from: n */
        public Set<String> mo37281n() {
            return this.f68055n;
        }
    }

    /* renamed from: c6.g$i */
    public static class C23744i extends C23750l {

        /* renamed from: o */
        public C23758p f68056o;

        /* renamed from: p */
        public C23758p f68057p;

        /* renamed from: q */
        public C23758p f68058q;

        /* renamed from: r */
        public C23758p f68059r;

        /* renamed from: o */
        public String mo37264o() {
            return "ellipse";
        }
    }

    /* renamed from: c6.g$i0 */
    public static abstract class C23745i0 extends C23749k0 implements C23741g0 {

        /* renamed from: i */
        public Set<String> f68060i = null;

        /* renamed from: j */
        public String f68061j = null;

        /* renamed from: k */
        public Set<String> f68062k = null;

        /* renamed from: l */
        public Set<String> f68063l = null;

        /* renamed from: m */
        public Set<String> f68064m = null;

        /* renamed from: b */
        public void mo37272b(Set<String> set) {
            this.f68062k = set;
        }

        /* renamed from: e */
        public Set<String> mo37273e() {
            return this.f68060i;
        }

        /* renamed from: f */
        public void mo37274f(Set<String> set) {
            this.f68063l = set;
        }

        /* renamed from: g */
        public void mo37275g(String str) {
            this.f68061j = str;
        }

        /* renamed from: h */
        public String mo37276h() {
            return this.f68061j;
        }

        /* renamed from: i */
        public void mo37277i(Set<String> set) {
            this.f68064m = set;
        }

        /* renamed from: j */
        public Set<String> mo37278j() {
            return this.f68063l;
        }

        /* renamed from: k */
        public Set<String> mo37279k() {
            return this.f68062k;
        }

        /* renamed from: l */
        public void mo37280l(Set<String> set) {
            this.f68060i = set;
        }

        /* renamed from: n */
        public Set<String> mo37281n() {
            return this.f68064m;
        }
    }

    /* renamed from: c6.g$j */
    public static abstract class C23746j extends C23751l0 implements C23747j0 {

        /* renamed from: h */
        public List<C23755n0> f68065h = new ArrayList();

        /* renamed from: i */
        public Boolean f68066i;

        /* renamed from: j */
        public Matrix f68067j;

        /* renamed from: k */
        public C23748k f68068k;

        /* renamed from: l */
        public String f68069l;

        /* renamed from: c */
        public void mo37266c(C23755n0 n0Var) {
            if (n0Var instanceof C23724d0) {
                this.f68065h.add(n0Var);
                return;
            }
            throw new C23792i("Gradient elements cannot contain " + n0Var + " elements.");
        }

        /* renamed from: d */
        public List<C23755n0> mo37267d() {
            return this.f68065h;
        }
    }

    /* renamed from: c6.g$j0 */
    public interface C23747j0 {
        /* renamed from: c */
        void mo37266c(C23755n0 n0Var);

        /* renamed from: d */
        List<C23755n0> mo37267d();
    }

    /* renamed from: c6.g$k */
    public enum C23748k {
        reflect,
        repeat
    }

    /* renamed from: c6.g$k0 */
    public static abstract class C23749k0 extends C23751l0 {

        /* renamed from: h */
        public C23717b f68073h = null;
    }

    /* renamed from: c6.g$l */
    public static abstract class C23750l extends C23745i0 implements C23754n {

        /* renamed from: n */
        public Matrix f68074n;

        /* renamed from: m */
        public void mo37282m(Matrix matrix) {
            this.f68074n = matrix;
        }
    }

    /* renamed from: c6.g$l0 */
    public static abstract class C23751l0 extends C23755n0 {

        /* renamed from: c */
        public String f68075c = null;

        /* renamed from: d */
        public Boolean f68076d = null;

        /* renamed from: e */
        public C23727e0 f68077e = null;

        /* renamed from: f */
        public C23727e0 f68078f = null;

        /* renamed from: g */
        public List<String> f68079g = null;

        public String toString() {
            return mo37264o();
        }
    }

    /* renamed from: c6.g$m */
    public static class C23752m extends C23743h0 implements C23754n {

        /* renamed from: o */
        public Matrix f68080o;

        /* renamed from: m */
        public void mo37282m(Matrix matrix) {
            this.f68080o = matrix;
        }

        /* renamed from: o */
        public String mo37264o() {
            return "group";
        }
    }

    /* renamed from: c6.g$m0 */
    public static class C23753m0 extends C23746j {

        /* renamed from: m */
        public C23758p f68081m;

        /* renamed from: n */
        public C23758p f68082n;

        /* renamed from: o */
        public C23758p f68083o;

        /* renamed from: p */
        public C23758p f68084p;

        /* renamed from: o */
        public String mo37264o() {
            return "linearGradient";
        }
    }

    /* renamed from: c6.g$n */
    public interface C23754n {
        /* renamed from: m */
        void mo37282m(Matrix matrix);
    }

    /* renamed from: c6.g$n0 */
    public static class C23755n0 {

        /* renamed from: a */
        public C23713g f68085a;

        /* renamed from: b */
        public C23747j0 f68086b;

        /* renamed from: o */
        public String mo37264o() {
            return "";
        }
    }

    /* renamed from: c6.g$o */
    public static class C23756o extends C23759p0 implements C23754n {

        /* renamed from: p */
        public String f68087p;

        /* renamed from: q */
        public C23758p f68088q;

        /* renamed from: r */
        public C23758p f68089r;

        /* renamed from: s */
        public C23758p f68090s;

        /* renamed from: t */
        public C23758p f68091t;

        /* renamed from: u */
        public Matrix f68092u;

        /* renamed from: m */
        public void mo37282m(Matrix matrix) {
            this.f68092u = matrix;
        }

        /* renamed from: o */
        public String mo37264o() {
            return "image";
        }
    }

    /* renamed from: c6.g$o0 */
    public static abstract class C23757o0 implements Cloneable {
    }

    /* renamed from: c6.g$p0 */
    public static abstract class C23759p0 extends C23743h0 {

        /* renamed from: o */
        public C23709e f68095o = null;
    }

    /* renamed from: c6.g$q */
    public static class C23760q extends C23750l {

        /* renamed from: o */
        public C23758p f68096o;

        /* renamed from: p */
        public C23758p f68097p;

        /* renamed from: q */
        public C23758p f68098q;

        /* renamed from: r */
        public C23758p f68099r;

        /* renamed from: o */
        public String mo37264o() {
            return "line";
        }
    }

    /* renamed from: c6.g$q0 */
    public static class C23761q0 extends C23746j {

        /* renamed from: m */
        public C23758p f68100m;

        /* renamed from: n */
        public C23758p f68101n;

        /* renamed from: o */
        public C23758p f68102o;

        /* renamed from: p */
        public C23758p f68103p;

        /* renamed from: q */
        public C23758p f68104q;

        /* renamed from: o */
        public String mo37264o() {
            return "radialGradient";
        }
    }

    /* renamed from: c6.g$r */
    public static class C23762r extends C23763r0 implements C23766t {

        /* renamed from: q */
        public boolean f68105q;

        /* renamed from: r */
        public C23758p f68106r;

        /* renamed from: s */
        public C23758p f68107s;

        /* renamed from: t */
        public C23758p f68108t;

        /* renamed from: u */
        public C23758p f68109u;

        /* renamed from: v */
        public Float f68110v;

        /* renamed from: o */
        public String mo37264o() {
            return "marker";
        }
    }

    /* renamed from: c6.g$r0 */
    public static abstract class C23763r0 extends C23759p0 {

        /* renamed from: p */
        public C23717b f68111p;
    }

    /* renamed from: c6.g$s */
    public static class C23764s extends C23743h0 implements C23766t {

        /* renamed from: o */
        public Boolean f68112o;

        /* renamed from: p */
        public Boolean f68113p;

        /* renamed from: q */
        public C23758p f68114q;

        /* renamed from: r */
        public C23758p f68115r;

        /* renamed from: o */
        public String mo37264o() {
            return "mask";
        }
    }

    /* renamed from: c6.g$s0 */
    public static class C23765s0 extends C23752m {
        /* renamed from: o */
        public String mo37264o() {
            return TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH;
        }
    }

    /* renamed from: c6.g$t */
    public interface C23766t {
    }

    /* renamed from: c6.g$t0 */
    public static class C23767t0 extends C23763r0 implements C23766t {
        /* renamed from: o */
        public String mo37264o() {
            return "symbol";
        }
    }

    /* renamed from: c6.g$u */
    public static class C23768u extends C23757o0 {

        /* renamed from: d */
        public String f68116d;

        /* renamed from: e */
        public C23757o0 f68117e;

        public C23768u(String str, C23757o0 o0Var) {
            this.f68116d = str;
            this.f68117e = o0Var;
        }

        public String toString() {
            return this.f68116d + " " + this.f68117e;
        }
    }

    /* renamed from: c6.g$u0 */
    public static class C23769u0 extends C23777y0 implements C23775x0 {

        /* renamed from: o */
        public String f68118o;

        /* renamed from: p */
        public C23719b1 f68119p;

        /* renamed from: a */
        public C23719b1 mo37268a() {
            return this.f68119p;
        }

        /* renamed from: o */
        public String mo37264o() {
            return "tref";
        }
    }

    /* renamed from: c6.g$v */
    public static class C23770v extends C23750l {

        /* renamed from: o */
        public C23772w f68120o;

        /* renamed from: o */
        public String mo37264o() {
            return "path";
        }
    }

    /* renamed from: c6.g$v0 */
    public static class C23771v0 extends C23716a1 implements C23775x0 {

        /* renamed from: s */
        public C23719b1 f68121s;

        /* renamed from: a */
        public C23719b1 mo37268a() {
            return this.f68121s;
        }

        /* renamed from: o */
        public String mo37264o() {
            return "tspan";
        }
    }

    /* renamed from: c6.g$w */
    public static class C23772w implements C23774x {

        /* renamed from: a */
        public byte[] f68122a = new byte[8];

        /* renamed from: b */
        public int f68123b = 0;

        /* renamed from: c */
        public float[] f68124c = new float[16];

        /* renamed from: d */
        public int f68125d = 0;

        /* renamed from: a */
        public void mo37293a(float f, float f2) {
            mo37299f((byte) 0);
            mo37300g(2);
            float[] fArr = this.f68124c;
            int i = this.f68125d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f68125d = i2 + 1;
            fArr[i2] = f2;
        }

        /* renamed from: b */
        public void mo37294b(float f, float f2, float f3, float f4, float f5, float f6) {
            mo37299f((byte) 2);
            mo37300g(6);
            float[] fArr = this.f68124c;
            int i = this.f68125d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            fArr[i5] = f5;
            this.f68125d = i6 + 1;
            fArr[i6] = f6;
        }

        /* renamed from: c */
        public void mo37295c(float f, float f2) {
            mo37299f((byte) 1);
            mo37300g(2);
            float[] fArr = this.f68124c;
            int i = this.f68125d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f68125d = i2 + 1;
            fArr[i2] = f2;
        }

        public void close() {
            mo37299f((byte) 8);
        }

        /* renamed from: d */
        public void mo37297d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            mo37299f(((z ? (char) 2 : 0) | true) | z2 ? (byte) 1 : 0);
            mo37300g(5);
            float[] fArr = this.f68124c;
            int i = this.f68125d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            this.f68125d = i5 + 1;
            fArr[i5] = f5;
        }

        /* renamed from: e */
        public void mo37298e(float f, float f2, float f3, float f4) {
            mo37299f((byte) 3);
            mo37300g(4);
            float[] fArr = this.f68124c;
            int i = this.f68125d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            this.f68125d = i4 + 1;
            fArr[i4] = f4;
        }

        /* renamed from: f */
        public final void mo37299f(byte b) {
            int i = this.f68123b;
            byte[] bArr = this.f68122a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f68122a = bArr2;
            }
            byte[] bArr3 = this.f68122a;
            int i2 = this.f68123b;
            this.f68123b = i2 + 1;
            bArr3[i2] = b;
        }

        /* renamed from: g */
        public final void mo37300g(int i) {
            float[] fArr = this.f68124c;
            if (fArr.length < this.f68125d + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f68124c = fArr2;
            }
        }

        /* renamed from: h */
        public void mo37301h(C23774x xVar) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f68123b; i3++) {
                byte b = this.f68122a[i3];
                if (b == 0) {
                    float[] fArr = this.f68124c;
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    xVar.mo37293a(fArr[i2], fArr[i4]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.f68124c;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        xVar.mo37294b(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.f68124c;
                        int i15 = i2 + 1;
                        int i16 = i15 + 1;
                        int i17 = i16 + 1;
                        xVar.mo37298e(fArr3[i2], fArr3[i15], fArr3[i16], fArr3[i17]);
                        i2 = i17 + 1;
                    } else if (b != 8) {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        float[] fArr4 = this.f68124c;
                        int i18 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i19 = i18 + 1;
                        float f7 = fArr4[i18];
                        int i25 = i19 + 1;
                        float f8 = fArr4[i19];
                        int i26 = i25 + 1;
                        xVar.mo37297d(f6, f7, f8, z, z2, fArr4[i25], fArr4[i26]);
                        i2 = i26 + 1;
                    } else {
                        xVar.close();
                    }
                } else {
                    float[] fArr5 = this.f68124c;
                    int i27 = i2 + 1;
                    i = i27 + 1;
                    xVar.mo37295c(fArr5[i2], fArr5[i27]);
                }
                i2 = i;
            }
        }
    }

    /* renamed from: c6.g$w0 */
    public static class C23773w0 extends C23716a1 implements C23719b1, C23754n {

        /* renamed from: s */
        public Matrix f68126s;

        /* renamed from: m */
        public void mo37282m(Matrix matrix) {
            this.f68126s = matrix;
        }

        /* renamed from: o */
        public String mo37264o() {
            return MimeTypes.BASE_TYPE_TEXT;
        }
    }

    /* renamed from: c6.g$x */
    public interface C23774x {
        /* renamed from: a */
        void mo37293a(float f, float f2);

        /* renamed from: b */
        void mo37294b(float f, float f2, float f3, float f4, float f5, float f6);

        /* renamed from: c */
        void mo37295c(float f, float f2);

        void close();

        /* renamed from: d */
        void mo37297d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        /* renamed from: e */
        void mo37298e(float f, float f2, float f3, float f4);
    }

    /* renamed from: c6.g$x0 */
    public interface C23775x0 {
        /* renamed from: a */
        C23719b1 mo37268a();
    }

    /* renamed from: c6.g$y */
    public static class C23776y extends C23763r0 implements C23766t {

        /* renamed from: q */
        public Boolean f68127q;

        /* renamed from: r */
        public Boolean f68128r;

        /* renamed from: s */
        public Matrix f68129s;

        /* renamed from: t */
        public C23758p f68130t;

        /* renamed from: u */
        public C23758p f68131u;

        /* renamed from: v */
        public C23758p f68132v;

        /* renamed from: w */
        public C23758p f68133w;

        /* renamed from: x */
        public String f68134x;

        /* renamed from: o */
        public String mo37264o() {
            return "pattern";
        }
    }

    /* renamed from: c6.g$y0 */
    public static abstract class C23777y0 extends C23743h0 {
        /* renamed from: c */
        public void mo37266c(C23755n0 n0Var) {
            if (n0Var instanceof C23775x0) {
                this.f68050i.add(n0Var);
                return;
            }
            throw new C23792i("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    /* renamed from: c6.g$z */
    public static class C23778z extends C23750l {

        /* renamed from: o */
        public float[] f68135o;

        /* renamed from: o */
        public String mo37264o() {
            return "polyline";
        }
    }

    /* renamed from: c6.g$z0 */
    public static class C23779z0 extends C23777y0 implements C23775x0 {

        /* renamed from: o */
        public String f68136o;

        /* renamed from: p */
        public C23758p f68137p;

        /* renamed from: q */
        public C23719b1 f68138q;

        /* renamed from: a */
        public C23719b1 mo37268a() {
            return this.f68138q;
        }

        /* renamed from: o */
        public String mo37264o() {
            return "textPath";
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p298c6.C23713g m28369d(java.io.BufferedInputStream r5) {
        /*
            c6.j r0 = new c6.j
            r0.<init>()
            boolean r1 = r5.markSupported()
            if (r1 != 0) goto L_0x0011
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r5)
            r5 = r1
        L_0x0011:
            r1 = 3
            r5.mark(r1)     // Catch:{ IOException -> 0x0033 }
            int r1 = r5.read()     // Catch:{ IOException -> 0x0033 }
            int r2 = r5.read()     // Catch:{ IOException -> 0x0033 }
            int r2 = r2 << 8
            int r1 = r1 + r2
            r5.reset()     // Catch:{ IOException -> 0x0033 }
            r2 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r2) goto L_0x0033
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0033 }
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0033 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0033 }
            r5 = r1
        L_0x0033:
            r1 = 4096(0x1000, float:5.74E-42)
            r5.mark(r1)     // Catch:{ IOException -> 0x0060 }
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x0060 }
            int r2 = r5.read(r1)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0060 }
            r4 = 0
            r3.<init>(r1, r4, r2)     // Catch:{ IOException -> 0x0060 }
            r5.reset()     // Catch:{ IOException -> 0x0060 }
            java.lang.String r1 = "<!ENTITY "
            int r1 = r3.indexOf(r1)     // Catch:{ IOException -> 0x0060 }
            if (r1 < 0) goto L_0x0058
            r0.mo37355E(r5)     // Catch:{ IOException -> 0x0060 }
            c6.g r0 = r0.f68186a     // Catch:{ IOException -> 0x0060 }
        L_0x0054:
            r5.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0066
        L_0x0058:
            r0.mo37356F(r5)     // Catch:{ IOException -> 0x0060 }
            c6.g r0 = r0.f68186a     // Catch:{ IOException -> 0x0060 }
            goto L_0x0054
        L_0x005e:
            r0 = move-exception
            goto L_0x0067
        L_0x0060:
            r0.mo37356F(r5)     // Catch:{ all -> 0x005e }
            c6.g r0 = r0.f68186a     // Catch:{ all -> 0x005e }
            goto L_0x0054
        L_0x0066:
            return r0
        L_0x0067:
            r5.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23713g.m28369d(java.io.InputStream):c6.g");
    }

    /* renamed from: a */
    public final C23717b mo37259a(float f) {
        C23725d1 d1Var;
        C23725d1 d1Var2;
        C23725d1 d1Var3;
        C23725d1 d1Var4;
        float f2;
        C23725d1 d1Var5;
        C23738f0 f0Var = this.f67934a;
        C23758p pVar = f0Var.f68047s;
        C23758p pVar2 = f0Var.f68048t;
        if (pVar == null || pVar.mo37290g() || (d1Var = pVar.f68094e) == (d1Var2 = C23725d1.percent) || d1Var == (d1Var3 = C23725d1.em) || d1Var == (d1Var4 = C23725d1.ex)) {
            return new C23717b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a = pVar.mo37284a(f);
        if (pVar2 == null) {
            C23717b bVar = this.f67934a.f68111p;
            f2 = bVar != null ? (bVar.f67944d * a) / bVar.f67943c : a;
        } else if (pVar2.mo37290g() || (d1Var5 = pVar2.f68094e) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
            return new C23717b(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = pVar2.mo37284a(f);
        }
        return new C23717b(0.0f, 0.0f, a, f2);
    }

    /* renamed from: b */
    public final C23751l0 mo37260b(C23747j0 j0Var, String str) {
        C23751l0 b;
        C23751l0 l0Var = (C23751l0) j0Var;
        if (str.equals(l0Var.f68075c)) {
            return l0Var;
        }
        for (C23755n0 next : j0Var.mo37267d()) {
            if (next instanceof C23751l0) {
                C23751l0 l0Var2 = (C23751l0) next;
                if (str.equals(l0Var2.f68075c)) {
                    return l0Var2;
                }
                if ((next instanceof C23747j0) && (b = mo37260b((C23747j0) next, str)) != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public C23751l0 mo37261c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f67934a.f68075c)) {
            return this.f67934a;
        }
        if (((HashMap) this.f67936c).containsKey(str)) {
            return (C23751l0) ((HashMap) this.f67936c).get(str);
        }
        C23751l0 b = mo37260b(this.f67934a, str);
        ((HashMap) this.f67936c).put(str, b);
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture mo37262e(int r9, int r10, p298c6.C23712f r11) {
        /*
            r8 = this;
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r1 = r0.beginRecording(r9, r10)
            if (r11 == 0) goto L_0x000f
            c6.g$b r2 = r11.f67933e
            if (r2 != 0) goto L_0x0027
        L_0x000f:
            if (r11 != 0) goto L_0x0017
            c6.f r11 = new c6.f
            r11.<init>()
            goto L_0x001d
        L_0x0017:
            c6.f r2 = new c6.f
            r2.<init>(r11)
            r11 = r2
        L_0x001d:
            float r9 = (float) r9
            float r10 = (float) r10
            c6.g$b r2 = new c6.g$b
            r3 = 0
            r2.<init>(r3, r3, r9, r10)
            r11.f67933e = r2
        L_0x0027:
            c6.h r9 = new c6.h
            r10 = 1119879168(0x42c00000, float:96.0)
            r9.<init>(r1, r10)
            r9.f68141b = r8
            c6.g$f0 r10 = r8.f67934a
            r1 = 0
            if (r10 != 0) goto L_0x003e
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "Nothing to render. Document is empty."
            java.lang.String.format(r10, r9)
            goto L_0x014f
        L_0x003e:
            java.lang.String r2 = r11.f67932d
            r3 = 1
            if (r2 == 0) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x0076
            c6.g$l0 r2 = r8.mo37261c(r2)
            if (r2 == 0) goto L_0x0069
            boolean r4 = r2 instanceof p298c6.C23713g.C23739f1
            if (r4 != 0) goto L_0x0053
            goto L_0x0069
        L_0x0053:
            c6.g$f1 r2 = (p298c6.C23713g.C23739f1) r2
            c6.g$b r4 = r2.f68111p
            if (r4 != 0) goto L_0x0066
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r10 = r11.f67932d
            r9[r1] = r10
            java.lang.String r10 = "View element with id \"%s\" is missing a viewBox attribute."
            java.lang.String.format(r10, r9)
            goto L_0x014f
        L_0x0066:
            c6.e r2 = r2.f68095o
            goto L_0x008f
        L_0x0069:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r10 = r11.f67932d
            r9[r1] = r10
            java.lang.String r10 = "View element with id \"%s\" not found."
            java.lang.String.format(r10, r9)
            goto L_0x014f
        L_0x0076:
            c6.g$b r2 = r11.f67931c
            if (r2 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r4 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            c6.g$b r2 = r10.f68111p
        L_0x0082:
            r4 = r2
            c6.e r2 = r11.f67930b
            if (r2 == 0) goto L_0x0089
            r5 = 1
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            c6.e r2 = r10.f68095o
        L_0x008f:
            c6.b$r r5 = r11.f67929a
            if (r5 == 0) goto L_0x00a3
            java.util.List<c6.b$p> r5 = r5.f45541a
            if (r5 == 0) goto L_0x009e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            goto L_0x009f
        L_0x009e:
            r5 = 0
        L_0x009f:
            if (r5 <= 0) goto L_0x00a3
            r5 = 1
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 == 0) goto L_0x00ad
            c6.b$r r5 = r11.f67929a
            c6.b$r r6 = r8.f67935b
            r6.mo17904b(r5)
        L_0x00ad:
            c6.h$h r5 = new c6.h$h
            r5.<init>(r9)
            r9.f68142c = r5
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r9.f68143d = r5
            c6.h$h r5 = r9.f68142c
            c6.g$e0 r6 = p298c6.C23713g.C23727e0.m28387a()
            r9.mo37320S(r5, r6)
            c6.h$h r5 = r9.f68142c
            r6 = 0
            r5.f68177f = r6
            r5.f68179h = r1
            java.util.Stack<c6.h$h> r6 = r9.f68143d
            c6.h$h r7 = new c6.h$h
            r7.<init>(r9, r5)
            r6.push(r7)
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r9.f68145f = r5
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r9.f68144e = r5
            java.lang.Boolean r5 = r10.f68076d
            if (r5 == 0) goto L_0x00ef
            c6.h$h r6 = r9.f68142c
            boolean r5 = r5.booleanValue()
            r6.f68179h = r5
        L_0x00ef:
            r9.mo37317P()
            c6.g$b r5 = new c6.g$b
            c6.g$b r6 = r11.f67933e
            r5.<init>(r6)
            c6.g$p r6 = r10.f68047s
            if (r6 == 0) goto L_0x0105
            float r7 = r5.f67943c
            float r6 = r6.mo37286c(r9, r7)
            r5.f67943c = r6
        L_0x0105:
            c6.g$p r6 = r10.f68048t
            if (r6 == 0) goto L_0x0111
            float r7 = r5.f67944d
            float r6 = r6.mo37286c(r9, r7)
            r5.f67944d = r6
        L_0x0111:
            r9.mo37308G(r10, r5, r4, r2)
            r9.mo37316O()
            c6.b$r r9 = r11.f67929a
            if (r9 == 0) goto L_0x012a
            java.util.List<c6.b$p> r9 = r9.f45541a
            if (r9 == 0) goto L_0x0126
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            goto L_0x0127
        L_0x0126:
            r9 = 0
        L_0x0127:
            if (r9 <= 0) goto L_0x012a
            r1 = 1
        L_0x012a:
            if (r1 == 0) goto L_0x014f
            c6.b$r r9 = r8.f67935b
            c6.b$u r10 = p298c6.C23690b.C16854u.RenderOptions
            java.util.List<c6.b$p> r9 = r9.f45541a
            if (r9 != 0) goto L_0x0135
            goto L_0x014f
        L_0x0135:
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x013b:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x014f
            java.lang.Object r11 = r9.next()
            c6.b$p r11 = (p298c6.C23690b.C16851p) r11
            c6.b$u r11 = r11.f45540c
            if (r11 != r10) goto L_0x013b
            r9.remove()
            goto L_0x013b
        L_0x014f:
            r0.endRecording()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23713g.mo37262e(int, int, c6.f):android.graphics.Picture");
    }

    /* renamed from: f */
    public C23755n0 mo37263f(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(FastJsonResponse.QUOTE) && str.endsWith(FastJsonResponse.QUOTE)) {
            str = str.substring(1, str.length() - 1).replace("\\\"", FastJsonResponse.QUOTE);
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return mo37261c(replace.substring(1));
    }

    /* renamed from: c6.g$p */
    public static class C23758p implements Cloneable {

        /* renamed from: d */
        public float f68093d;

        /* renamed from: e */
        public C23725d1 f68094e;

        public C23758p(float f, C23725d1 d1Var) {
            this.f68093d = f;
            this.f68094e = d1Var;
        }

        /* renamed from: a */
        public float mo37284a(float f) {
            int ordinal = this.f68094e.ordinal();
            return ordinal != 0 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? this.f68093d : (this.f68093d * f) / 6.0f : (this.f68093d * f) / 72.0f : (this.f68093d * f) / 25.4f : (this.f68093d * f) / 2.54f : this.f68093d * f : this.f68093d;
        }

        /* renamed from: b */
        public float mo37285b(C23780h hVar) {
            float f;
            if (this.f68094e != C23725d1.percent) {
                return mo37287d(hVar);
            }
            C23780h.C23788h hVar2 = hVar.f68142c;
            C23717b bVar = hVar2.f68178g;
            if (bVar == null) {
                bVar = hVar2.f68177f;
            }
            if (bVar == null) {
                return this.f68093d;
            }
            float f2 = bVar.f67943c;
            float f3 = bVar.f67944d;
            if (f2 == f3) {
                f = this.f68093d;
            } else {
                f2 = (float) (Math.sqrt((double) ((f2 * f2) + (f3 * f3))) / 1.414213562373095d);
                f = this.f68093d;
            }
            return (f * f2) / 100.0f;
        }

        /* renamed from: c */
        public float mo37286c(C23780h hVar, float f) {
            return this.f68094e == C23725d1.percent ? (this.f68093d * f) / 100.0f : mo37287d(hVar);
        }

        /* renamed from: d */
        public float mo37287d(C23780h hVar) {
            switch (this.f68094e.ordinal()) {
                case 0:
                    return this.f68093d;
                case 1:
                    return this.f68093d * hVar.f68142c.f68175d.getTextSize();
                case 2:
                    return this.f68093d * (hVar.f68142c.f68175d.getTextSize() / 2.0f);
                case 3:
                    float f = this.f68093d;
                    hVar.getClass();
                    return f * 96.0f;
                case 4:
                    float f2 = this.f68093d;
                    hVar.getClass();
                    return (f2 * 96.0f) / 2.54f;
                case 5:
                    float f3 = this.f68093d;
                    hVar.getClass();
                    return (f3 * 96.0f) / 25.4f;
                case 6:
                    float f4 = this.f68093d;
                    hVar.getClass();
                    return (f4 * 96.0f) / 72.0f;
                case 7:
                    float f5 = this.f68093d;
                    hVar.getClass();
                    return (f5 * 96.0f) / 6.0f;
                case 8:
                    C23780h.C23788h hVar2 = hVar.f68142c;
                    C23717b bVar = hVar2.f68178g;
                    if (bVar == null) {
                        bVar = hVar2.f68177f;
                    }
                    return bVar == null ? this.f68093d : (this.f68093d * bVar.f67943c) / 100.0f;
                default:
                    return this.f68093d;
            }
        }

        /* renamed from: e */
        public float mo37288e(C23780h hVar) {
            if (this.f68094e != C23725d1.percent) {
                return mo37287d(hVar);
            }
            C23780h.C23788h hVar2 = hVar.f68142c;
            C23717b bVar = hVar2.f68178g;
            if (bVar == null) {
                bVar = hVar2.f68177f;
            }
            return bVar == null ? this.f68093d : (this.f68093d * bVar.f67944d) / 100.0f;
        }

        /* renamed from: f */
        public boolean mo37289f() {
            return this.f68093d < 0.0f;
        }

        /* renamed from: g */
        public boolean mo37290g() {
            return this.f68093d == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f68093d) + this.f68094e;
        }

        public C23758p(float f) {
            this.f68093d = f;
            this.f68094e = C23725d1.px;
        }
    }

    /* renamed from: c6.g$b */
    public static class C23717b {

        /* renamed from: a */
        public float f67941a;

        /* renamed from: b */
        public float f67942b;

        /* renamed from: c */
        public float f67943c;

        /* renamed from: d */
        public float f67944d;

        public C23717b(float f, float f2, float f3, float f4) {
            this.f67941a = f;
            this.f67942b = f2;
            this.f67943c = f3;
            this.f67944d = f4;
        }

        public String toString() {
            return "[" + this.f67941a + " " + this.f67942b + " " + this.f67943c + " " + this.f67944d + "]";
        }

        public C23717b(C23717b bVar) {
            this.f67941a = bVar.f67941a;
            this.f67942b = bVar.f67942b;
            this.f67943c = bVar.f67943c;
            this.f67944d = bVar.f67944d;
        }
    }
}
