package pl0;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import zi0.C91755a;

/* renamed from: pl0.q */
public interface C118080q extends C118120w {

    /* renamed from: pl0.q$a */
    public static class C118081a {

        /* renamed from: a */
        public float f352975a;

        /* renamed from: b */
        public float f352976b;

        /* renamed from: c */
        public float f352977c;
    }

    /* renamed from: pl0.q$a0 */
    public static class C118082a0 {

        /* renamed from: a */
        public List<C118093j> f352978a;

        /* renamed from: b */
        public int f352979b;

        /* renamed from: c */
        public int f352980c;

        /* renamed from: d */
        public int f352981d;

        /* renamed from: e */
        public int f352982e;

        /* renamed from: f */
        public String f352983f;

        /* renamed from: g */
        public int[] f352984g;
    }

    /* renamed from: pl0.q$b */
    public static class C118083b {

        /* renamed from: a */
        public double f352985a;

        /* renamed from: b */
        public double f352986b;

        /* renamed from: c */
        public int f352987c;

        /* renamed from: d */
        public int f352988d;

        /* renamed from: e */
        public int f352989e;

        /* renamed from: f */
        public int f352990f;

        /* renamed from: g */
        public String f352991g;
    }

    /* renamed from: pl0.q$b0 */
    public static class C118084b0 {

        /* renamed from: a */
        public C118086c0 f352992a;
    }

    /* renamed from: pl0.q$c */
    public static class C118085c {

        /* renamed from: a */
        public int f352993a;

        /* renamed from: b */
        public int f352994b;

        /* renamed from: c */
        public int f352995c;

        /* renamed from: d */
        public int f352996d;

        /* renamed from: e */
        public String f352997e;

        /* renamed from: f */
        public boolean f352998f;

        /* renamed from: g */
        public String f352999g;
    }

    /* renamed from: pl0.q$c0 */
    public static class C118086c0 {

        /* renamed from: a */
        public C118094k f353000a;
    }

    /* renamed from: pl0.q$d */
    public static class C118087d {

        /* renamed from: a */
        public double f353001a;

        /* renamed from: b */
        public double f353002b;

        /* renamed from: c */
        public String f353003c;

        /* renamed from: d */
        public float f353004d;
    }

    /* renamed from: pl0.q$e */
    public static class C118088e {

        /* renamed from: a */
        public String f353005a;

        /* renamed from: b */
        public C118093j f353006b;

        /* renamed from: c */
        public C118093j f353007c;

        /* renamed from: d */
        public float f353008d;

        /* renamed from: e */
        public boolean f353009e;

        /* renamed from: f */
        public int f353010f;
    }

    /* renamed from: pl0.q$f */
    public interface C118089f {
    }

    /* renamed from: pl0.q$g */
    public static class C118090g {

        /* renamed from: a */
        public String f353011a;

        /* renamed from: b */
        public String f353012b;

        /* renamed from: c */
        public List<C118091h> f353013c;

        /* renamed from: d */
        public int f353014d;
    }

    /* renamed from: pl0.q$h */
    public static class C118091h {

        /* renamed from: a */
        public String f353015a;
    }

    /* renamed from: pl0.q$i */
    public static class C118092i {

        /* renamed from: a */
        public double f353016a;

        /* renamed from: b */
        public double f353017b;

        /* renamed from: c */
        public double f353018c;

        /* renamed from: d */
        public double f353019d;

        /* renamed from: e */
        public float f353020e;

        /* renamed from: f */
        public int f353021f;
    }

    /* renamed from: pl0.q$j */
    public static class C118093j {

        /* renamed from: a */
        public double f353022a;

        /* renamed from: b */
        public double f353023b;

        public C118093j(double d, double d2) {
            this.f353022a = d;
            this.f353023b = d2;
        }
    }

    /* renamed from: pl0.q$k */
    public static class C118094k {

        /* renamed from: a */
        public C118093j f353024a;

        /* renamed from: b */
        public C118093j f353025b;
    }

    /* renamed from: pl0.q$l */
    public static class C118095l {

        /* renamed from: a */
        public String f353026a;

        /* renamed from: b */
        public List<C118093j> f353027b;

        /* renamed from: c */
        public int f353028c;

        /* renamed from: d */
        public int f353029d;

        /* renamed from: e */
        public boolean f353030e;

        /* renamed from: f */
        public int f353031f;

        /* renamed from: g */
        public int f353032g;

        /* renamed from: h */
        public boolean f353033h;

        /* renamed from: i */
        public String f353034i;

        /* renamed from: j */
        public String f353035j;

        /* renamed from: k */
        public String f353036k;

        /* renamed from: l */
        public String f353037l;

        /* renamed from: m */
        public int f353038m;

        /* renamed from: n */
        public int f353039n;

        /* renamed from: o */
        public List<Integer> f353040o;

        /* renamed from: p */
        public String f353041p;

        /* renamed from: q */
        public boolean f353042q;

        /* renamed from: r */
        public C118097b f353043r;

        /* renamed from: s */
        public List<C118096a> f353044s;

        /* renamed from: pl0.q$l$a */
        public static class C118096a {

            /* renamed from: a */
            public String f353045a;

            /* renamed from: b */
            public int f353046b;

            /* renamed from: c */
            public int f353047c;
        }

        /* renamed from: pl0.q$l$b */
        public static class C118097b {

            /* renamed from: a */
            public int f353048a;

            /* renamed from: b */
            public int f353049b;

            /* renamed from: c */
            public int f353050c;
        }
    }

    /* renamed from: pl0.q$m */
    public interface C118098m {
        /* renamed from: a */
        void mo182587a(C118107v vVar);
    }

    /* renamed from: pl0.q$n */
    public interface C118099n {
        /* renamed from: a */
        void mo182589a(double d, double d2);
    }

    /* renamed from: pl0.q$o */
    public interface C118100o {
    }

    /* renamed from: pl0.q$p */
    public interface C118101p {
        /* renamed from: a */
        boolean mo182590a(C118107v vVar);
    }

    /* renamed from: pl0.q$q */
    public interface C118102q {
        /* renamed from: a */
        boolean mo182588a(C118107v vVar);
    }

    /* renamed from: pl0.q$r */
    public interface C118103r {
        /* renamed from: a */
        void mo182578a(JSONObject jSONObject);

        /* renamed from: b */
        void mo182579b(JSONArray jSONArray);
    }

    /* renamed from: pl0.q$s */
    public interface C118104s {
        /* renamed from: a */
        void mo182583a(boolean z);

        /* renamed from: b */
        void mo182584b();
    }

    /* renamed from: pl0.q$t */
    public interface C118105t {
        /* renamed from: a */
        void mo182586a(double d, double d2);
    }

    /* renamed from: pl0.q$u */
    public static class C118106u {

        /* renamed from: a */
        public double f353051a;

        /* renamed from: b */
        public double f353052b;

        /* renamed from: c */
        public String f353053c;

        /* renamed from: d */
        public String f353054d;

        /* renamed from: e */
        public String f353055e;
    }

    /* renamed from: pl0.q$v */
    public static class C118107v {

        /* renamed from: a */
        public String f353056a;

        /* renamed from: b */
        public C118108w f353057b;
    }

    /* renamed from: pl0.q$w */
    public static class C118108w {

        /* renamed from: a */
        public boolean f353058a = false;

        /* renamed from: b */
        public int f353059b = -1;

        /* renamed from: c */
        public double f353060c;

        /* renamed from: d */
        public double f353061d;

        /* renamed from: e */
        public String f353062e;

        /* renamed from: f */
        public float f353063f;

        /* renamed from: g */
        public float f353064g;

        /* renamed from: h */
        public String f353065h;

        /* renamed from: i */
        public float f353066i;

        /* renamed from: j */
        public float f353067j;

        /* renamed from: k */
        public float f353068k;

        /* renamed from: l */
        public float f353069l;

        /* renamed from: m */
        public int f353070m;

        /* renamed from: n */
        public String f353071n;

        /* renamed from: o */
        public String f353072o;

        /* renamed from: p */
        public String f353073p;

        /* renamed from: q */
        public String f353074q;

        /* renamed from: r */
        public C118109a f353075r;

        /* renamed from: s */
        public C118110b f353076s;

        /* renamed from: pl0.q$w$b */
        public static class C118110b {

            /* renamed from: a */
            public String f353090a;

            /* renamed from: b */
            public int f353091b;

            /* renamed from: c */
            public int f353092c;

            /* renamed from: d */
            public int f353093d;

            /* renamed from: e */
            public int f353094e;

            /* renamed from: f */
            public int f353095f;

            /* renamed from: g */
            public int f353096g;

            /* renamed from: h */
            public int f353097h;

            /* renamed from: i */
            public int f353098i;

            /* renamed from: j */
            public String f353099j;

            /* renamed from: k */
            public int f353100k;

            /* renamed from: l */
            public int f353101l;

            /* renamed from: m */
            public int f353102m;

            public C118110b(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, int i9) {
                this.f353090a = str;
                this.f353091b = i;
                this.f353092c = i2;
                this.f353093d = i3;
                this.f353094e = i4;
                this.f353095f = i5;
                this.f353096g = i6;
                this.f353097h = i7;
                this.f353098i = i8;
                this.f353099j = str2;
                this.f353100k = i9;
            }
        }

        /* renamed from: pl0.q$w$a */
        public static class C118109a {

            /* renamed from: a */
            public String f353077a;

            /* renamed from: b */
            public int f353078b;

            /* renamed from: c */
            public int f353079c;

            /* renamed from: d */
            public int f353080d;

            /* renamed from: e */
            public int f353081e;

            /* renamed from: f */
            public int f353082f;

            /* renamed from: g */
            public int f353083g;

            /* renamed from: h */
            public int f353084h;

            /* renamed from: i */
            public int f353085i;

            /* renamed from: j */
            public String f353086j;

            /* renamed from: k */
            public int f353087k;

            /* renamed from: l */
            public int f353088l;

            /* renamed from: m */
            public View f353089m = null;

            public C118109a() {
            }

            public C118109a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, String str2, int i18, int i19) {
                this.f353077a = str;
                this.f353078b = i;
                this.f353079c = i2;
                this.f353080d = i3;
                this.f353081e = i5;
                this.f353082f = i6;
                this.f353083g = i4;
                this.f353084h = i7;
                this.f353085i = i17;
                this.f353086j = str2;
                this.f353087k = i18;
                this.f353088l = i19;
            }
        }
    }

    /* renamed from: pl0.q$x */
    public interface C118111x {
        /* renamed from: a */
        void mo182592a(C118081a aVar, boolean z);

        /* renamed from: b */
        void mo182593b(C118081a aVar, boolean z);
    }

    /* renamed from: pl0.q$y */
    public interface C118112y {
        /* renamed from: a */
        void mo182585a(C118090g gVar);
    }

    /* renamed from: pl0.q$z */
    public interface C118113z {
        /* renamed from: a */
        void mo182591a(C118106u uVar);
    }

    /* renamed from: A */
    float mo182791A();

    /* renamed from: B */
    void mo182793B(String str);

    /* renamed from: C */
    void mo182795C(double d, double d2, float f, float f2, float f3);

    /* renamed from: D */
    void mo182796D(double d, double d2, float f, float f2, float f3, boolean z);

    /* renamed from: E */
    Point mo182797E(C118093j jVar);

    /* renamed from: F */
    void mo182799F();

    /* renamed from: G */
    void mo182801G(String str, int i, C118093j jVar, boolean z);

    /* renamed from: H */
    void mo182803H(boolean z);

    /* renamed from: I */
    void mo182805I(float f, float f2, boolean z);

    /* renamed from: J */
    void mo182807J(double d, double d2);

    /* renamed from: K */
    void mo182809K(boolean z);

    /* renamed from: L */
    void mo182811L(String str, ArrayList<C118093j> arrayList, long j, boolean z, C118104s sVar);

    /* renamed from: N */
    void mo182815N(String str, C91755a aVar);

    /* renamed from: O */
    C118090g mo182817O();

    /* renamed from: P */
    void mo182819P(String str);

    /* renamed from: Q */
    void mo182820Q(C118111x xVar);

    /* renamed from: R */
    void mo182821R(String str, String str2);

    /* renamed from: S */
    void mo182822S(boolean z);

    /* renamed from: T */
    void mo182823T(int i);

    /* renamed from: U */
    void mo182824U();

    /* renamed from: W */
    void mo182826W(boolean z);

    /* renamed from: X */
    boolean mo182827X(boolean z, boolean z2, int i, int i2, C118103r rVar);

    /* renamed from: Z */
    boolean mo182829Z(int i, C118093j jVar, C118093j jVar2, C118093j jVar3, float f, float f2, int i2);

    /* renamed from: a */
    void mo182830a(boolean z);

    /* renamed from: a0 */
    void mo182831a0();

    /* renamed from: b */
    void mo182356b(int i, int i2);

    /* renamed from: b0 */
    void mo182832b0(C118098m mVar);

    /* renamed from: c */
    void mo182833c();

    /* renamed from: c0 */
    void mo182834c0(boolean z);

    /* renamed from: d */
    void mo182835d(List<C118093j> list, int i, int i2, int i3, int i4);

    /* renamed from: e */
    void mo182836e(C118089f fVar);

    /* renamed from: e0 */
    void mo182837e0(C118102q qVar);

    void enableAutoMaxOverlooking(boolean z);

    void enableIndoorLevelPick(boolean z);

    /* renamed from: f */
    void mo182840f(C118112y yVar);

    /* renamed from: f0 */
    boolean mo182841f0();

    C118093j fromScreenLocation(Point point);

    /* renamed from: g */
    String mo182843g(String str, String str2);

    /* renamed from: g0 */
    boolean mo182844g0(C118094k kVar);

    C118093j getMapCenter();

    C118084b0 getProjection();

    View getView();

    float getZoom();

    /* renamed from: h */
    boolean mo182849h();

    /* renamed from: h0 */
    void mo182850h0(C118083b bVar);

    /* renamed from: i */
    boolean mo182851i(String str);

    /* renamed from: i0 */
    boolean mo182852i0(String str);

    /* renamed from: j */
    void mo182853j(C118113z zVar);

    /* renamed from: j0 */
    boolean mo182854j0(C118087d dVar, C91755a aVar);

    /* renamed from: k */
    boolean mo182855k(C118082a0 a0Var);

    /* renamed from: k0 */
    void mo182856k0(boolean z);

    /* renamed from: l */
    boolean mo182857l(int i, C118088e eVar, C91755a aVar);

    /* renamed from: l0 */
    void mo182858l0(boolean z);

    /* renamed from: m */
    boolean mo182859m(int i, C118088e eVar, C91755a aVar);

    /* renamed from: m0 */
    boolean mo182860m0(String str);

    /* renamed from: n */
    void mo182861n(String str, C118108w wVar, C91755a aVar);

    /* renamed from: n0 */
    boolean mo182862n0(int i);

    /* renamed from: o */
    void mo182863o(C118105t tVar);

    /* renamed from: o0 */
    void mo182357o0(Surface surface);

    void onDestroy();

    void onPause();

    void onResume();

    void onTouchEvent(MotionEvent motionEvent);

    /* renamed from: p */
    void mo182867p();

    /* renamed from: p0 */
    void mo182868p0(boolean z);

    /* renamed from: q */
    boolean mo182869q(String str, int i, double d, int i2, String str2);

    /* renamed from: q0 */
    void mo182870q0(C118101p pVar);

    /* renamed from: r */
    float mo182871r();

    /* renamed from: r0 */
    void mo182872r0();

    /* renamed from: s */
    void mo182873s();

    /* renamed from: s0 */
    boolean mo182874s0();

    void setBuilding3dEffectEnable(boolean z);

    void setIndoorMaskColor(int i);

    void setMapStyle(int i);

    void setMaxZoomLevel(int i);

    void setMinZoomLevel(int i);

    void setPoisEnabled(boolean z);

    /* renamed from: t */
    boolean mo182881t(C118085c cVar, C118100o oVar, C91755a aVar);

    /* renamed from: t0 */
    void mo182882t0(boolean z);

    /* renamed from: v */
    void mo182885v(String str, C118108w wVar, C91755a aVar);

    /* renamed from: w */
    void mo182886w(C118095l lVar, C91755a aVar);

    /* renamed from: x */
    void mo182887x(boolean z);

    /* renamed from: y */
    void mo182889y(C118099n nVar);

    /* renamed from: z */
    void mo182891z(String str, LinkedList<C118092i> linkedList, C118104s sVar);
}
