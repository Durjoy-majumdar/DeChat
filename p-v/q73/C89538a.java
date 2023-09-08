package q73;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import l14.C24951b;
import l14.C88368c;
import l14.C88370g;
import m14.C24981a;
import n14.C25217e;
import o14.C25346c;
import o14.C25348d;
import o14.C25349e;
import o14.C25350f;
import o40.C61926c;
import p1017od.C89153a;
import p1017od.C89157e;
import p14.C25428e0;
import p14.C25434f0;
import p14.C25440j;
import p14.C25443k0;
import p14.C25452o;
import p14.C89304i0;
import p430d.C26973c;
import q14.C25537a;
import q14.C25540f;
import r14.C26098e;
import r14.C26103j;
import r14.C26104k;
import r14.C26105l;
import r14.C26107n;
import r73.C89894f;
import r73.C89898g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: q73.a */
public final class C89538a implements C89898g, C89566v {

    /* renamed from: u */
    public static final C13601g<Boolean> f257656u = C36568h.m40985a(C35792c.f95580d);

    /* renamed from: v */
    public static final C13601g<MMKVSlotManager> f257657v = C36568h.m40985a(C47772a.f128290d);

    /* renamed from: w */
    public static final C13601g<Boolean> f257658w = C36568h.m40985a(C35791b.f95579d);

    /* renamed from: x */
    public static int f257659x;

    /* renamed from: d */
    public final String f257660d;

    /* renamed from: e */
    public final boolean f257661e;

    /* renamed from: f */
    public final WeakReference<C89547f> f257662f;

    /* renamed from: g */
    public final boolean f257663g;

    /* renamed from: h */
    public C89558k0 f257664h;

    /* renamed from: i */
    public C32224a<Float> f257665i;

    /* renamed from: j */
    public C32224a<Float> f257666j;

    /* renamed from: n */
    public C32224a<Boolean> f257667n;

    /* renamed from: o */
    public float[] f257668o;

    /* renamed from: p */
    public boolean f257669p = true;

    /* renamed from: q */
    public C35795g f257670q;

    /* renamed from: r */
    public C89539f f257671r;

    /* renamed from: s */
    public int f257672s = -1;

    /* renamed from: t */
    public C35794e f257673t;

    /* renamed from: q73.a$b */
    public static final class C35791b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35791b f95579d = new C35791b();

        public C35791b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_web_canvas_pause_on_no_view_attach, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: q73.a$c */
    public static final class C35792c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35792c f95580d = new C35792c();

        public C35792c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: q73.a$d */
    public static final class C35793d {
        public C35793d(C8480h hVar) {
        }
    }

    /* renamed from: q73.a$e */
    public static final class C35794e {

        /* renamed from: a */
        public final int f95581a;

        /* renamed from: b */
        public final int f95582b;

        /* renamed from: c */
        public final float f95583c;

        /* renamed from: d */
        public final boolean f95584d;

        /* renamed from: e */
        public final int f95585e;

        public C35794e(int i, int i2, float f, boolean z, int i3) {
            this.f95581a = i;
            this.f95582b = i2;
            this.f95583c = f;
            this.f95584d = z;
            this.f95585e = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35794e)) {
                return false;
            }
            C35794e eVar = (C35794e) obj;
            return this.f95581a == eVar.f95581a && this.f95582b == eVar.f95582b && C87412m.m108589b(Float.valueOf(this.f95583c), Float.valueOf(eVar.f95583c)) && this.f95584d == eVar.f95584d && this.f95585e == eVar.f95585e;
        }

        public int hashCode() {
            int floatToIntBits = ((((this.f95581a * 31) + this.f95582b) * 31) + Float.floatToIntBits(this.f95583c)) * 31;
            boolean z = this.f95584d;
            if (z) {
                z = true;
            }
            return ((floatToIntBits + (z ? 1 : 0)) * 31) + this.f95585e;
        }

        public String toString() {
            return "DrawInfo(width=" + this.f95581a + ", height=" + this.f95582b + ", fontSize=" + this.f95583c + ", isDarkMode=" + this.f95584d + ", orientation=" + this.f95585e + ')';
        }
    }

    /* renamed from: q73.a$g */
    public static final class C35795g {

        /* renamed from: a */
        public final int f95586a;

        /* renamed from: b */
        public final long f95587b;

        public C35795g(int i, long j) {
            this.f95586a = i;
            this.f95587b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35795g)) {
                return false;
            }
            C35795g gVar = (C35795g) obj;
            return this.f95586a == gVar.f95586a && this.f95587b == gVar.f95587b;
        }

        public int hashCode() {
            long j = this.f95587b;
            return (this.f95586a * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "SyncBarrierInfo(token=" + this.f95586a + ", start=" + this.f95587b + ')';
        }
    }

    /* renamed from: q73.a$a */
    public static final class C47772a extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C47772a f128290d = new C47772a();

        public C47772a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__webcanvans__");
            C87412m.m108593f(mmkv, "getMMKV(\"__webcanvans__\")");
            return new MMKVSlotManager(mmkv, 259200);
        }
    }

    /* renamed from: q73.a$f */
    public static final class C89539f {

        /* renamed from: a */
        public String f257674a;

        /* renamed from: b */
        public int f257675b;

        /* renamed from: c */
        public int f257676c;

        /* renamed from: d */
        public int f257677d;

        /* renamed from: e */
        public int f257678e;

        /* renamed from: f */
        public String f257679f;

        /* renamed from: q73.a$f$a */
        public static final class C25545a implements C25440j<C89539f> {

            /* renamed from: a */
            public static final C25545a f72236a;

            /* renamed from: b */
            public static final /* synthetic */ C25217e f72237b;

            static {
                C25545a aVar = new C25545a();
                f72236a = aVar;
                C25428e0 e0Var = new C25428e0("com.tencent.mm.plugin.webcanvas.WebCanvasContext.LayoutCache", aVar, 6);
                e0Var.mo52664a("canvasId", false);
                e0Var.mo52664a("height", false);
                e0Var.mo52664a("width", true);
                e0Var.mo52664a("left", true);
                e0Var.mo52664a("top", true);
                e0Var.mo52664a("layout", true);
                f72237b = e0Var;
            }

            /* renamed from: a */
            public C25217e mo51996a() {
                return f72237b;
            }

            /* renamed from: c */
            public C24951b<?>[] mo52672c() {
                return C25434f0.f72032a;
            }

            /* renamed from: d */
            public Object mo51997d(C25349e eVar) {
                int i;
                int i2;
                int i3;
                int i4;
                String str;
                int i5;
                Object obj;
                int i6;
                C25349e eVar2 = eVar;
                C87412m.m108594g(eVar2, "decoder");
                C25217e eVar3 = f72237b;
                C25346c b = eVar2.mo52515b(eVar3);
                Object obj2 = null;
                if (b.mo52512m()) {
                    String r = b.mo52496r(eVar3, 0);
                    int i7 = b.mo52493i(eVar3, 1);
                    int i8 = b.mo52493i(eVar3, 2);
                    int i9 = b.mo52493i(eVar3, 3);
                    int i15 = b.mo52493i(eVar3, 4);
                    obj = b.mo52492g(eVar3, 5, C25443k0.f72046b, null);
                    str = r;
                    i2 = i9;
                    i3 = i8;
                    i = i15;
                    i4 = i7;
                    i5 = 63;
                } else {
                    String str2 = null;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i25 = 0;
                    boolean z = true;
                    while (z) {
                        int e = b.mo52510e(eVar3);
                        switch (e) {
                            case -1:
                                z = false;
                                continue;
                            case 0:
                                str2 = b.mo52496r(eVar3, 0);
                                i17 |= 1;
                                continue;
                            case 1:
                                i25 = b.mo52493i(eVar3, 1);
                                i6 = i17 | 2;
                                break;
                            case 2:
                                i18 = b.mo52493i(eVar3, 2);
                                i6 = i17 | 4;
                                break;
                            case 3:
                                i16 = b.mo52493i(eVar3, 3);
                                i6 = i17 | 8;
                                break;
                            case 4:
                                i19 = b.mo52493i(eVar3, 4);
                                i6 = i17 | 16;
                                break;
                            case 5:
                                obj2 = b.mo52492g(eVar3, 5, C25443k0.f72046b, obj2);
                                i6 = i17 | 32;
                                break;
                            default:
                                throw new C88370g(e);
                        }
                        i17 = i6;
                    }
                    i2 = i16;
                    obj = obj2;
                    i = i19;
                    i4 = i25;
                    i3 = i18;
                    str = str2;
                    i5 = i17;
                }
                b.mo52508a(eVar3);
                return new C89539f(i5, str, i4, i3, i2, i, (String) obj, (C89304i0) null);
            }

            /* renamed from: e */
            public C24951b<?>[] mo52673e() {
                C25443k0 k0Var = C25443k0.f72046b;
                C25452o oVar = C25452o.f72061b;
                return new C24951b[]{k0Var, oVar, oVar, oVar, oVar, C24981a.m31596a(k0Var)};
            }

            /* renamed from: f */
            public void mo51999b(C25350f fVar, C89539f fVar2) {
                C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
                C87412m.m108594g(fVar2, "value");
                C25217e eVar = f72237b;
                C25348d b = fVar.mo52523b(eVar);
                C87412m.m108594g(b, "output");
                C87412m.m108594g(eVar, "serialDesc");
                boolean z = false;
                b.mo52502h(eVar, 0, fVar2.f257674a);
                b.mo52504o(eVar, 1, fVar2.f257675b);
                if (b.mo52514d(eVar, 2) || fVar2.f257676c != 0) {
                    b.mo52504o(eVar, 2, fVar2.f257676c);
                }
                if (b.mo52514d(eVar, 3) || fVar2.f257677d != 0) {
                    b.mo52504o(eVar, 3, fVar2.f257677d);
                }
                if (b.mo52514d(eVar, 4) || fVar2.f257678e != 0) {
                    b.mo52504o(eVar, 4, fVar2.f257678e);
                }
                if (b.mo52514d(eVar, 5) || fVar2.f257679f != null) {
                    z = true;
                }
                if (z) {
                    b.mo52503k(eVar, 5, C25443k0.f72046b, fVar2.f257679f);
                }
                b.mo52513a(eVar);
            }
        }

        public /* synthetic */ C89539f(int i, String str, int i2, int i3, int i4, int i5, String str2, C89304i0 i0Var) {
            if ((i & 1) != 0) {
                this.f257674a = str;
                if ((i & 2) != 0) {
                    this.f257675b = i2;
                    if ((i & 4) == 0) {
                        this.f257676c = 0;
                    } else {
                        this.f257676c = i3;
                    }
                    if ((i & 8) == 0) {
                        this.f257677d = 0;
                    } else {
                        this.f257677d = i4;
                    }
                    if ((i & 16) == 0) {
                        this.f257678e = 0;
                    } else {
                        this.f257678e = i5;
                    }
                    if ((i & 32) == 0) {
                        this.f257679f = null;
                    } else {
                        this.f257679f = str2;
                    }
                } else {
                    throw new C88368c("height");
                }
            } else {
                throw new C88368c("canvasId");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C89539f)) {
                return false;
            }
            C89539f fVar = (C89539f) obj;
            return C87412m.m108589b(this.f257674a, fVar.f257674a) && this.f257675b == fVar.f257675b && this.f257676c == fVar.f257676c && this.f257677d == fVar.f257677d && this.f257678e == fVar.f257678e && C87412m.m108589b(this.f257679f, fVar.f257679f);
        }

        public int hashCode() {
            int hashCode = ((((((((this.f257674a.hashCode() * 31) + this.f257675b) * 31) + this.f257676c) * 31) + this.f257677d) * 31) + this.f257678e) * 31;
            String str = this.f257679f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LayoutCache(canvasId=" + this.f257674a + ", height=" + this.f257675b + ", width=" + this.f257676c + ", left=" + this.f257677d + ", top=" + this.f257678e + ", layout=" + this.f257679f + ')';
        }

        public C89539f(String str, int i, int i2, int i3, int i4, String str2) {
            C87412m.m108594g(str, "canvasId");
            this.f257674a = str;
            this.f257675b = i;
            this.f257676c = i2;
            this.f257677d = i3;
            this.f257678e = i4;
            this.f257679f = str2;
        }
    }

    /* renamed from: q73.a$h */
    public static final class C89540h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89538a f257680d;

        public C89540h(C89538a aVar) {
            this.f257680d = aVar;
        }

        public final void run() {
            if (this.f257680d.mo123850m()) {
                C13601g<Boolean> gVar = C89538a.f257656u;
                Log.m105920e("MicroMsg.WebCanvasContext", "removeSyncBarrier by delay:" + this.f257680d.f257660d);
            }
        }
    }

    /* renamed from: q73.a$i */
    public static final class C89541i implements MBRuntime.C80300l {

        /* renamed from: a */
        public final /* synthetic */ C89538a f257681a;

        /* renamed from: b */
        public final /* synthetic */ int f257682b;

        /* renamed from: c */
        public final /* synthetic */ Number f257683c;

        /* renamed from: q73.a$i$a */
        public static final class C89542a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89538a f257684d;

            /* renamed from: e */
            public final /* synthetic */ int f257685e;

            /* renamed from: f */
            public final /* synthetic */ Number f257686f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89542a(C89538a aVar, int i, Number number) {
                super(0);
                this.f257684d = aVar;
                this.f257685e = i;
                this.f257686f = number;
            }

            public Object invoke() {
                C89538a aVar = this.f257684d;
                C13601g<Boolean> gVar = C89538a.f257656u;
                MagicBrushView g = aVar.mo123840g();
                if (g != null) {
                    int i = this.f257685e;
                    C89538a aVar2 = this.f257684d;
                    Number number = this.f257686f;
                    if (g.isShown() && g.getLayoutParams() != null) {
                        ViewGroup.LayoutParams layoutParams = g.getLayoutParams();
                        layoutParams.height = i;
                        Log.m105924i("MicroMsg.WebCanvasContext", "update layout height:#" + aVar2.f257660d + ", " + number);
                        g.setLayoutParams(layoutParams);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C89541i(C89538a aVar, int i, Number number) {
            this.f257681a = aVar;
            this.f257682b = i;
            this.f257683c = number;
        }

        /* renamed from: a */
        public final void mo111577a(boolean z) {
            C61926c.m72668M(new C89542a(this.f257681a, this.f257682b, this.f257683c));
        }
    }

    static {
        new C35793d((C8480h) null);
    }

    public C89538a(String str, boolean z, WeakReference<C89547f> weakReference, boolean z2) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(weakReference, "logicJsEngineReference");
        this.f257660d = str;
        this.f257661e = z;
        this.f257662f = weakReference;
        this.f257663g = z2;
    }

    /* renamed from: a */
    public static final void m111916a(MagicBrushView magicBrushView, C89538a aVar) {
        boolean isShown = magicBrushView.isShown();
        Log.m105926v("MicroMsg.WebCanvasContext", "check layout height:#" + aVar.f257660d + ", " + magicBrushView.getHeight() + ", " + isShown);
        C89539f fVar = aVar.f257671r;
        int i = fVar != null ? fVar.f257675b : -1;
        if (isShown && magicBrushView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = magicBrushView.getLayoutParams();
            boolean z = false;
            if (layoutParams != null && layoutParams.height == i) {
                z = true;
            }
            if (!z && i > 0) {
                ViewGroup.LayoutParams layoutParams2 = magicBrushView.getLayoutParams();
                layoutParams2.height = i;
                Log.m105924i("MicroMsg.WebCanvasContext", "check layout height:#" + aVar.f257660d + ", " + layoutParams2.height);
                magicBrushView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: e */
    public static final C89539f m111917e(String str) {
        String string;
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) f257657v).getValue()).findSlot(str);
        if (multiProcessMMKV == null || (string = multiProcessMMKV.getString(str, "")) == null) {
            return null;
        }
        boolean z = true;
        if (!(!C112551y.m153811k(string))) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        C25537a.C25538a aVar = C25537a.f72230b;
        C89539f.C25545a aVar2 = C89539f.C25545a.f72236a;
        aVar.getClass();
        C26098e eVar = new C26098e(string);
        Object a = C26103j.m33474a(new C26104k(aVar, C26107n.OBJ, eVar), aVar2);
        if (eVar.f72951b != 12) {
            z = false;
        }
        if (z) {
            return (C89539f) a;
        }
        throw new IllegalStateException(("Reader has not consumed the whole input: " + eVar).toString());
    }

    /* renamed from: D */
    public int mo123830D() {
        C89153a aVar;
        C89157e eVar = mo123848j().f257761K.f235059h;
        synchronized (eVar.f256898a) {
            aVar = eVar.f256900c;
        }
        return (int) aVar.f256873a;
    }

    /* renamed from: H0 */
    public boolean mo123831H0() {
        if (!((Boolean) ((C36570n) f257656u).getValue()).booleanValue()) {
            return true;
        }
        Log.m105924i("MicroMsg.WebCanvasContext", "canVideoAutoPlay videoCanAutoPlayNow=" + this.f257669p);
        return this.f257669p;
    }

    /* renamed from: S0 */
    public int mo123832S0() {
        ViewGroup h;
        Integer p;
        MagicBrushView g = mo123840g();
        if (g == null || (h = mo123846h(g)) == null || (p = mo123855p(Integer.valueOf(h.getMeasuredHeight()))) == null) {
            return 0;
        }
        return C89894f.f258347d.mo124201a(p);
    }

    /* renamed from: T */
    public void mo123833T(String str, Number number, Number number2, Number number3, Number number4, String str2) {
        String str3 = str;
        Number number5 = number;
        Number number6 = number2;
        Number number7 = number3;
        Number number8 = number4;
        C87412m.m108594g(str3, "canvasId");
        C87412m.m108594g(number5, "left");
        C87412m.m108594g(number6, "top");
        C87412m.m108594g(number7, "width");
        C87412m.m108594g(number8, "height");
        C87412m.m108594g(str2, "layout");
        Log.m105924i("MicroMsg.WebCanvasContext", "saveLayout:#" + str3 + " location:[" + number5 + ", " + number6 + "], size:[" + number7 + ", " + number8 + ']');
        if (!C87412m.m108589b(number7, 0) || !C87412m.m108589b(number8, 0)) {
            MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) f257657v).getValue()).getSlotForWrite();
            String c = mo123837c(str);
            C25537a.C25538a aVar = C25537a.f72230b;
            C89539f.C25545a aVar2 = C89539f.C25545a.f72236a;
            int i = -2;
            if (!C87412m.m108589b(number8, 0)) {
                i = C89894f.f258347d.mo124205e(number8);
            }
            C89539f fVar = new C89539f(str, i, C87412m.m108589b(number7, 0) ? -1 : C89894f.f258347d.mo124205e(number7), number.intValue(), number2.intValue(), str2);
            if (C87412m.m108589b(str3, this.f257660d)) {
                mo123834W(number8);
                this.f257671r = fVar;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            aVar.getClass();
            StringBuilder sb = new StringBuilder();
            C26107n nVar = C26107n.OBJ;
            C87412m.m108594g(nVar, "mode");
            new C26105l(new C26105l.C26106a(sb, aVar), aVar, nVar, new C25540f[C26107n.values().length]).mo52506t(aVar2, fVar);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "result.toString()");
            multiProcessMMKV.putString(c, sb4);
            return;
        }
        Log.m105920e("MicroMsg.WebCanvasContext", "saveLayout:#" + str3 + " invalid params");
    }

    /* renamed from: W */
    public void mo123834W(Number number) {
        C87412m.m108594g(number, "height");
        if (this.f257663g) {
            boolean z = false;
            if (!C87412m.m108589b(number, 0)) {
                C32224a<Boolean> aVar = this.f257667n;
                if (aVar != null) {
                    Boolean invoke = aVar.invoke();
                }
                int e = C89894f.f258347d.mo124205e(number);
                StringBuilder sb = new StringBuilder();
                sb.append("#setHeight# pixelHeight=");
                sb.append(e);
                sb.append(", cacheHeight=");
                C89539f fVar = this.f257671r;
                sb.append(fVar != null ? Integer.valueOf(fVar.f257675b) : null);
                sb.append(" canvasId=#");
                sb.append(this.f257660d);
                sb.append(' ');
                sb.append(hashCode());
                sb.append(" onSetHeight:");
                sb.append(this.f257667n == null);
                Log.m105918d("MicroMsg.WebCanvasContext", sb.toString());
                C26973c cVar = C26973c.f74981a;
                String str = this.f257660d;
                synchronized (cVar) {
                    C87412m.m108594g(str, "canvasId");
                    long currentTimeMillis = System.currentTimeMillis();
                    C26973c.C26974a aVar2 = C26973c.f74982b.get(str);
                    if (aVar2 != null) {
                        if (!aVar2.f74983a) {
                            Log.m105924i("MicroMsg.WebCanvasRenderTimeReport", "reportPreloadFinish " + str + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - aVar2.f74984b));
                            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0("BizWebCanvasPreloadCost", (int) (currentTimeMillis - aVar2.f74984b), str);
                        }
                        aVar2.f74983a = true;
                    }
                }
                C89539f fVar2 = this.f257671r;
                if (fVar2 != null && e == fVar2.f257675b) {
                    z = true;
                }
                if (!z) {
                    this.f257671r = new C89539f(this.f257660d, e, fVar2 != null ? fVar2.f257676c : -1, fVar2 != null ? fVar2.f257677d : -1, fVar2 != null ? fVar2.f257678e : -1, fVar2 != null ? fVar2.f257679f : null);
                    C89567w j = mo123848j();
                    String str2 = this.f257660d;
                    j.getClass();
                    C87412m.m108594g(str2, "canvasId");
                    C89547f.m111945Y1(j.f257752B, str2, 0, 2, (Object) null);
                    mo123848j().f257761K.mo111514j(new C89541i(this, e, number));
                }
                Log.m105924i("MicroMsg.WebCanvasContext", "setHeight:#" + this.f257660d + ", " + number);
            }
        }
    }

    /* renamed from: a0 */
    public String mo123835a0(String str) {
        C87412m.m108594g(str, "canvasId");
        C89539f d = mo123838d(str);
        if (d != null) {
            return d.f257679f;
        }
        return null;
    }

    /* renamed from: b */
    public final int mo123836b() {
        return C89894f.f258347d.mo124202b().getResources().getConfiguration().orientation;
    }

    /* renamed from: c */
    public final String mo123837c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('-');
        sb.append(mo123836b());
        sb.append('-');
        sb.append(getWidth());
        sb.append('-');
        sb.append(getFontSize());
        sb.append('-');
        C89894f.C89897c cVar = C89894f.f258347d;
        sb.append(C85875k4.m106211z());
        return sb.toString();
    }

    /* renamed from: d */
    public final C89539f mo123838d(String str) {
        String c = mo123837c(str);
        Log.m105918d("MicroMsg.WebCanvasContext", "getLayoutCache: #" + str);
        if (!C87412m.m108589b(str, this.f257660d)) {
            return m111917e(c);
        }
        C89539f fVar = this.f257671r;
        if (fVar != null) {
            return fVar;
        }
        C89539f e = m111917e(c);
        if (e == null) {
            return null;
        }
        this.f257671r = e;
        return e;
    }

    /* renamed from: f */
    public final C89547f mo123839f() {
        C89547f fVar = this.f257662f.get();
        C87412m.m108591d(fVar);
        return fVar;
    }

    /* renamed from: g */
    public final MagicBrushView mo123840g() {
        C89558k0 k0Var = this.f257664h;
        if (k0Var != null) {
            return k0Var.mo123872b();
        }
        return null;
    }

    public float getFontSize() {
        C32224a<Float> aVar = this.f257665i;
        if (aVar != null) {
            return aVar.invoke().floatValue();
        }
        C89894f.C89897c cVar = C89894f.f258347d;
        return C76577a.m92165p(MMApplicationContext.getContext());
    }

    public int getHeight() {
        int i;
        Integer p;
        C89539f fVar = this.f257671r;
        Integer num = null;
        if (fVar == null || (p = mo123855p(Integer.valueOf(fVar.f257675b))) == null) {
            MagicBrushView g = mo123840g();
            Integer p2 = mo123855p(g != null ? Integer.valueOf(g.getMeasuredHeight()) : null);
            i = p2 != null ? C89894f.f258347d.mo124201a(p2) : 0;
        } else {
            i = C89894f.f258347d.mo124201a(p);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getHeight canvasId=");
        sb.append(this.f257660d);
        sb.append(" measuredHeight = ");
        MagicBrushView g2 = mo123840g();
        Integer p3 = mo123855p(g2 != null ? Integer.valueOf(g2.getMeasuredHeight()) : null);
        if (p3 != null) {
            num = Integer.valueOf(C89894f.f258347d.mo124201a(p3));
        }
        sb.append(num);
        sb.append(" height=");
        sb.append(i);
        Log.m105926v("MicroMsg.WebCanvasContext", sb.toString());
        return i;
    }

    public String getId() {
        return this.f257660d;
    }

    public View getView() {
        return mo123840g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWidth() {
        /*
            r6 = this;
            q73.a$f r0 = r6.f257671r
            r1 = 0
            if (r0 == 0) goto L_0x0047
            int r0 = r0.f257676c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0037
            int r0 = r0.intValue()
            r73.f$c r2 = r73.C89894f.f258347d
            android.content.Context r2 = r2.mo124202b()
            com.tencent.mm.ui.i3$a r2 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r2)
            r3 = -1
            if (r0 != r3) goto L_0x0032
            com.tencent.magicbrush.ui.MagicBrushView r3 = r6.mo123840g()
            r4 = 0
            if (r3 == 0) goto L_0x002e
            int r3 = r3.getMeasuredWidth()
            int r5 = r2.f24705b
            if (r3 != r5) goto L_0x002e
            r4 = 1
        L_0x002e:
            if (r4 == 0) goto L_0x0032
            int r0 = r2.f24704a
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r0 = r6.mo123855p(r0)
            if (r0 == 0) goto L_0x0047
            r73.f$c r2 = r73.C89894f.f258347d
            int r0 = r2.mo124201a(r0)
            goto L_0x0089
        L_0x0047:
            fy3.a<java.lang.Float> r0 = r6.f257666j
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = iy3.C60641c.m70921b(r0)
            goto L_0x0089
        L_0x005a:
            com.tencent.magicbrush.ui.MagicBrushView r0 = r6.mo123840g()
            if (r0 == 0) goto L_0x0069
            int r0 = r0.getMeasuredWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x006a
        L_0x0069:
            r0 = r1
        L_0x006a:
            java.lang.Integer r0 = r6.mo123855p(r0)
            if (r0 == 0) goto L_0x007b
            r73.f$c r2 = r73.C89894f.f258347d
            int r0 = r2.mo124201a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x007c
        L_0x007b:
            r0 = r1
        L_0x007c:
            if (r0 == 0) goto L_0x0083
            int r0 = r0.intValue()
            goto L_0x0089
        L_0x0083:
            r73.f$c r0 = r73.C89894f.f258347d
            int r0 = r0.mo124204d()
        L_0x0089:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getWidth canvasId="
            r2.append(r3)
            java.lang.String r3 = r6.f257660d
            r2.append(r3)
            java.lang.String r3 = " measuredWidth = "
            r2.append(r3)
            com.tencent.magicbrush.ui.MagicBrushView r3 = r6.mo123840g()
            if (r3 == 0) goto L_0x00ac
            int r3 = r3.getMeasuredWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00ad
        L_0x00ac:
            r3 = r1
        L_0x00ad:
            java.lang.Integer r3 = r6.mo123855p(r3)
            if (r3 == 0) goto L_0x00bd
            r73.f$c r1 = r73.C89894f.f258347d
            int r1 = r1.mo124201a(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00bd:
            r2.append(r1)
            java.lang.String r1 = " viewportWidth="
            r2.append(r1)
            r73.f$c r1 = r73.C89894f.f258347d
            int r1 = r1.mo124204d()
            r2.append(r1)
            java.lang.String r1 = " width="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            int r2 = r6.f257672s
            java.lang.String r3 = "MicroMsg.WebCanvasContext"
            if (r2 != r0) goto L_0x00e4
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            goto L_0x00e7
        L_0x00e4:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x00e7:
            r6.f257672s = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q73.C89538a.getWidth():int");
    }

    /* renamed from: h */
    public final ViewGroup mo123846h(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ListView ? (ListView) parent : null;
        if (viewGroup == null) {
            ViewParent parent2 = view.getParent();
            viewGroup = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
            if (viewGroup == null) {
                ViewParent parent3 = view.getParent();
                View view2 = parent3 instanceof View ? (View) parent3 : null;
                if (view2 != null) {
                    return mo123846h(view2);
                }
                return null;
            }
        }
        return viewGroup;
    }

    /* renamed from: i */
    public V8Object mo123847i() {
        try {
            C89567w j = mo123848j();
            C89558k0 k0Var = this.f257664h;
            C87412m.m108591d(k0Var);
            V8Object executeObjectFunction = j.f242939g.mo112501e().getGlobalObject().getObject("NativeGlobal").executeObjectFunction("findElementById", j.f242939g.mo112501e().newV8Array().push(k0Var.f257725d));
            C87412m.m108593f(executeObjectFunction, "v8Context.globalObject.g…8Array().push(elementId))");
            return executeObjectFunction;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebCanvasContext", e, "getCanvas", new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    public final C89567w mo123848j() {
        return mo123839f().mo118087S1();
    }

    /* renamed from: k */
    public final void mo123849k() {
        synchronized (this) {
            if (this.f257670q != null) {
                Log.m105920e("MicroMsg.WebCanvasContext", "barrier exists");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183879j(new C89540h(this), 100, "MicroMsg.WebCanvasContext");
            Object invoke = Build.VERSION.SDK_INT >= 23 ? MessageQueue.class.getMethod("postSyncBarrier", new Class[0]).invoke(Looper.getMainLooper().getQueue(), new Object[0]) : Looper.class.getMethod("postSyncBarrier", new Class[0]).invoke(Looper.getMainLooper(), new Object[0]);
            Log.m105918d("MicroMsg.WebCanvasContext", "postSyncBarrier " + this.f257660d + " token:" + invoke);
            C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Int");
            this.f257670q = new C35795g(((Integer) invoke).intValue(), MMSlotKt.now());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: m */
    public final boolean mo123850m() {
        boolean z;
        synchronized (this) {
            C35795g gVar = this.f257670q;
            z = true;
            if (gVar != null) {
                int i = gVar.f95586a;
                if (Build.VERSION.SDK_INT >= 23) {
                    MessageQueue.class.getMethod("removeSyncBarrier", new Class[]{Integer.TYPE}).invoke(Looper.getMainLooper().getQueue(), new Object[]{Integer.valueOf(i)});
                } else {
                    Looper.class.getMethod("removeSyncBarrier", new Class[]{Integer.TYPE}).invoke(Looper.getMainLooper(), new Object[]{Integer.valueOf(i)});
                }
                Log.m105918d("MicroMsg.WebCanvasContext", "removeSyncBarrier " + this.f257660d + " token:" + i);
                this.f257670q = null;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: n */
    public final void mo123851n(MagicBrushView magicBrushView) {
        C89539f d = mo123838d(this.f257660d);
        if (d != null) {
            if (!((d.f257676c == 0 || d.f257675b == 0 || magicBrushView.getWidth() == d.f257676c || magicBrushView.getHeight() == d.f257675b) ? false : true)) {
                d = null;
            }
            if (d != null) {
                ViewGroup.LayoutParams layoutParams = magicBrushView.getLayoutParams();
                layoutParams.width = d.f257676c;
                layoutParams.height = d.f257675b;
                Log.m105924i("MicroMsg.WebCanvasContext", "resume layout:#" + this.f257660d + " size:[" + layoutParams.width + ", " + layoutParams.height + ']');
                magicBrushView.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: n1 */
    public int mo123852n1() {
        C89558k0 k0Var = this.f257664h;
        C87412m.m108591d(k0Var);
        return k0Var.f257725d;
    }

    /* renamed from: o */
    public final void mo123853o() {
        C89539f fVar = this.f257671r;
        if (fVar != null) {
            int i = fVar.f257676c;
            int i2 = fVar.f257675b;
            float fontSize = getFontSize();
            C89894f.C89897c cVar = C89894f.f258347d;
            this.f257673t = new C35794e(i, i2, fontSize, C85875k4.m106211z(), mo123836b());
            StringBuilder sb = new StringBuilder();
            sb.append("saveLastDraw:[");
            sb.append(fVar.f257676c);
            sb.append(", ");
            sb.append(fVar.f257675b);
            sb.append(", ");
            C35794e eVar = this.f257673t;
            sb.append(eVar != null ? Integer.valueOf(eVar.f95585e) : null);
            sb.append(']');
            Log.m105918d("MicroMsg.WebCanvasContext", sb.toString());
        }
    }

    /* renamed from: o0 */
    public int mo123854o0() {
        ViewGroup h;
        MagicBrushView g = mo123840g();
        if (g == null || (h = mo123846h(g)) == null) {
            return 0;
        }
        return C89894f.f258347d.mo124201a(Integer.valueOf(C61926c.m72690o(g)[1] - C61926c.m72690o(h)[1]));
    }

    /* renamed from: p */
    public final Integer mo123855p(Integer num) {
        if (num != null) {
            if (num.intValue() > 0) {
                return num;
            }
        }
        return null;
    }

    /* renamed from: q1 */
    public void mo123856q1(Number number, Number number2) {
        C87412m.m108594g(number, "top");
        C87412m.m108594g(number2, "bottom");
        Log.m105918d("MicroMsg.WebCanvasContext", "setVideo:" + this.f257660d + " to " + number + ' ' + number2);
        this.f257668o = new float[]{number.floatValue(), number2.floatValue()};
    }

    /* renamed from: r0 */
    public boolean mo123857r0() {
        MagicBrushView b;
        Context context;
        C89558k0 k0Var = this.f257664h;
        if (k0Var == null || (b = k0Var.mo123872b()) == null) {
            return false;
        }
        if (!b.isShown() && !b.isAttachedToWindow()) {
            return false;
        }
        Context context2 = b.getContext();
        MMActivity mMActivity = null;
        MutableContextWrapper mutableContextWrapper = context2 instanceof MutableContextWrapper ? (MutableContextWrapper) context2 : null;
        if (mutableContextWrapper == null || (context = mutableContextWrapper.getBaseContext()) == null) {
            context = b.getContext();
        }
        if (context instanceof MMActivity) {
            mMActivity = (MMActivity) context;
        }
        return !(mMActivity != null ? mMActivity.isPaused() : false);
    }
}
