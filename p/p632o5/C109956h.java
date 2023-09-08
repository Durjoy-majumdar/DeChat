package p632o5;

import a14.C53896h0;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import coil.memory.MemoryCache$Key;
import coil.size.OriginalSize;
import d24.C20419r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p1126j5.C108576g;
import p1144q5.C110366b;
import p1144q5.C110367c;
import p1147r5.C110501a;
import p1152s5.C110740c;
import p632o5.C109959i;
import p632o5.C35103l;
import p643p5.C110165a;
import p643p5.C110166b;
import p643p5.C110167d;
import p643p5.C110168e;
import p643p5.C110169f;
import p643p5.C110170g;
import p643p5.C35367c;
import p864t5.C110905d;
import p972h5.C108139e;
import rx3.C13604l;
import sx3.C64186f0;
import sx3.C90364q0;

/* renamed from: o5.h */
public final class C109956h {

    /* renamed from: A */
    public final Integer f328984A;

    /* renamed from: B */
    public final Drawable f328985B;

    /* renamed from: C */
    public final Integer f328986C;

    /* renamed from: D */
    public final Drawable f328987D;

    /* renamed from: E */
    public final Integer f328988E;

    /* renamed from: F */
    public final Drawable f328989F;

    /* renamed from: G */
    public final C109952d f328990G;

    /* renamed from: H */
    public final C109951c f328991H;

    /* renamed from: a */
    public final Context f328992a;

    /* renamed from: b */
    public final Object f328993b;

    /* renamed from: c */
    public final C110366b f328994c;

    /* renamed from: d */
    public final C109958b f328995d;

    /* renamed from: e */
    public final MemoryCache$Key f328996e;

    /* renamed from: f */
    public final MemoryCache$Key f328997f;

    /* renamed from: g */
    public final ColorSpace f328998g;

    /* renamed from: h */
    public final C13604l<C108576g<?>, Class<?>> f328999h;

    /* renamed from: i */
    public final C108139e f329000i;

    /* renamed from: j */
    public final List<C110501a> f329001j;

    /* renamed from: k */
    public final C20419r f329002k;

    /* renamed from: l */
    public final C35103l f329003l;

    /* renamed from: m */
    public final C39623j f329004m;

    /* renamed from: n */
    public final C110169f f329005n;

    /* renamed from: o */
    public final C110168e f329006o;

    /* renamed from: p */
    public final C53896h0 f329007p;

    /* renamed from: q */
    public final C110740c f329008q;

    /* renamed from: r */
    public final C110166b f329009r;

    /* renamed from: s */
    public final Bitmap.Config f329010s;

    /* renamed from: t */
    public final boolean f329011t;

    /* renamed from: u */
    public final boolean f329012u;

    /* renamed from: v */
    public final boolean f329013v;

    /* renamed from: w */
    public final boolean f329014w;

    /* renamed from: x */
    public final C109950b f329015x;

    /* renamed from: y */
    public final C109950b f329016y;

    /* renamed from: z */
    public final C109950b f329017z;

    /* renamed from: o5.h$b */
    public interface C109958b {
        /* renamed from: a */
        void mo157427a(C109956h hVar, Throwable th);

        /* renamed from: b */
        void mo157428b(C109956h hVar, C109959i.C109960a aVar);

        /* renamed from: c */
        void mo157429c(C109956h hVar);

        /* renamed from: d */
        void mo157430d(C109956h hVar);
    }

    public C109956h(Context context, Object obj, C110366b bVar, C109958b bVar2, MemoryCache$Key memoryCache$Key, MemoryCache$Key memoryCache$Key2, ColorSpace colorSpace, C13604l lVar, C108139e eVar, List list, C20419r rVar, C35103l lVar2, C39623j jVar, C110169f fVar, C110168e eVar2, C53896h0 h0Var, C110740c cVar, C110166b bVar3, Bitmap.Config config, boolean z, boolean z2, boolean z3, boolean z4, C109950b bVar4, C109950b bVar5, C109950b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C109952d dVar, C109951c cVar2, C8480h hVar) {
        this.f328992a = context;
        this.f328993b = obj;
        this.f328994c = bVar;
        this.f328995d = bVar2;
        this.f328996e = memoryCache$Key;
        this.f328997f = memoryCache$Key2;
        this.f328998g = colorSpace;
        this.f328999h = lVar;
        this.f329000i = eVar;
        this.f329001j = list;
        this.f329002k = rVar;
        this.f329003l = lVar2;
        this.f329004m = jVar;
        this.f329005n = fVar;
        this.f329006o = eVar2;
        this.f329007p = h0Var;
        this.f329008q = cVar;
        this.f329009r = bVar3;
        this.f329010s = config;
        this.f329011t = z;
        this.f329012u = z2;
        this.f329013v = z3;
        this.f329014w = z4;
        this.f329015x = bVar4;
        this.f329016y = bVar5;
        this.f329017z = bVar6;
        this.f328984A = num;
        this.f328985B = drawable;
        this.f328986C = num2;
        this.f328987D = drawable2;
        this.f328988E = num3;
        this.f328989F = drawable3;
        this.f328990G = dVar;
        this.f328991H = cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C109956h) {
            C109956h hVar = (C109956h) obj;
            return C87412m.m108589b(this.f328992a, hVar.f328992a) && C87412m.m108589b(this.f328993b, hVar.f328993b) && C87412m.m108589b(this.f328994c, hVar.f328994c) && C87412m.m108589b(this.f328995d, hVar.f328995d) && C87412m.m108589b(this.f328996e, hVar.f328996e) && C87412m.m108589b(this.f328997f, hVar.f328997f) && (Build.VERSION.SDK_INT < 26 || C87412m.m108589b(this.f328998g, hVar.f328998g)) && C87412m.m108589b(this.f328999h, hVar.f328999h) && C87412m.m108589b(this.f329000i, hVar.f329000i) && C87412m.m108589b(this.f329001j, hVar.f329001j) && C87412m.m108589b(this.f329002k, hVar.f329002k) && C87412m.m108589b(this.f329003l, hVar.f329003l) && C87412m.m108589b(this.f329004m, hVar.f329004m) && C87412m.m108589b(this.f329005n, hVar.f329005n) && this.f329006o == hVar.f329006o && C87412m.m108589b(this.f329007p, hVar.f329007p) && C87412m.m108589b(this.f329008q, hVar.f329008q) && this.f329009r == hVar.f329009r && this.f329010s == hVar.f329010s && this.f329011t == hVar.f329011t && this.f329012u == hVar.f329012u && this.f329013v == hVar.f329013v && this.f329014w == hVar.f329014w && this.f329015x == hVar.f329015x && this.f329016y == hVar.f329016y && this.f329017z == hVar.f329017z && C87412m.m108589b(this.f328984A, hVar.f328984A) && C87412m.m108589b(this.f328985B, hVar.f328985B) && C87412m.m108589b(this.f328986C, hVar.f328986C) && C87412m.m108589b(this.f328987D, hVar.f328987D) && C87412m.m108589b(this.f328988E, hVar.f328988E) && C87412m.m108589b(this.f328989F, hVar.f328989F) && C87412m.m108589b(this.f328990G, hVar.f328990G) && C87412m.m108589b(this.f328991H, hVar.f328991H);
        }
    }

    public int hashCode() {
        int hashCode = ((this.f328992a.hashCode() * 31) + this.f328993b.hashCode()) * 31;
        C110366b bVar = this.f328994c;
        int i = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C109958b bVar2 = this.f328995d;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        MemoryCache$Key memoryCache$Key = this.f328996e;
        int hashCode4 = (hashCode3 + (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode())) * 31;
        MemoryCache$Key memoryCache$Key2 = this.f328997f;
        int hashCode5 = (hashCode4 + (memoryCache$Key2 == null ? 0 : memoryCache$Key2.hashCode())) * 31;
        ColorSpace colorSpace = this.f328998g;
        int hashCode6 = (hashCode5 + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31;
        C13604l<C108576g<?>, Class<?>> lVar = this.f328999h;
        int hashCode7 = (hashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C108139e eVar = this.f329000i;
        int i2 = 1231;
        int hashCode8 = (((((((((((((((((((((((((((hashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f329001j.hashCode()) * 31) + this.f329002k.hashCode()) * 31) + this.f329003l.hashCode()) * 31) + this.f329004m.hashCode()) * 31) + this.f329005n.hashCode()) * 31) + this.f329006o.hashCode()) * 31) + this.f329007p.hashCode()) * 31) + this.f329008q.hashCode()) * 31) + this.f329009r.hashCode()) * 31) + this.f329010s.hashCode()) * 31) + (this.f329011t ? 1231 : 1237)) * 31) + (this.f329012u ? 1231 : 1237)) * 31) + (this.f329013v ? 1231 : 1237)) * 31;
        if (!this.f329014w) {
            i2 = 1237;
        }
        int hashCode9 = (((((((hashCode8 + i2) * 31) + this.f329015x.hashCode()) * 31) + this.f329016y.hashCode()) * 31) + this.f329017z.hashCode()) * 31;
        Integer num = this.f328984A;
        int intValue = (hashCode9 + (num == null ? 0 : num.intValue())) * 31;
        Drawable drawable = this.f328985B;
        int hashCode10 = (intValue + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.f328986C;
        int intValue2 = (hashCode10 + (num2 == null ? 0 : num2.intValue())) * 31;
        Drawable drawable2 = this.f328987D;
        int hashCode11 = (intValue2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num3 = this.f328988E;
        int intValue3 = (hashCode11 + (num3 == null ? 0 : num3.intValue())) * 31;
        Drawable drawable3 = this.f328989F;
        if (drawable3 != null) {
            i = drawable3.hashCode();
        }
        return ((((intValue3 + i) * 31) + this.f328990G.hashCode()) * 31) + this.f328991H.hashCode();
    }

    public String toString() {
        return "ImageRequest(context=" + this.f328992a + ", data=" + this.f328993b + ", target=" + this.f328994c + ", listener=" + this.f328995d + ", memoryCacheKey=" + this.f328996e + ", placeholderMemoryCacheKey=" + this.f328997f + ", colorSpace=" + this.f328998g + ", fetcher=" + this.f328999h + ", decoder=" + this.f329000i + ", transformations=" + this.f329001j + ", headers=" + this.f329002k + ", parameters=" + this.f329003l + ", lifecycle=" + this.f329004m + ", sizeResolver=" + this.f329005n + ", scale=" + this.f329006o + ", dispatcher=" + this.f329007p + ", transition=" + this.f329008q + ", precision=" + this.f329009r + ", bitmapConfig=" + this.f329010s + ", allowConversionToBitmap=" + this.f329011t + ", allowHardware=" + this.f329012u + ", allowRgb565=" + this.f329013v + ", premultipliedAlpha=" + this.f329014w + ", memoryCachePolicy=" + this.f329015x + ", diskCachePolicy=" + this.f329016y + ", networkCachePolicy=" + this.f329017z + ", placeholderResId=" + this.f328984A + ", placeholderDrawable=" + this.f328985B + ", errorResId=" + this.f328986C + ", errorDrawable=" + this.f328987D + ", fallbackResId=" + this.f328988E + ", fallbackDrawable=" + this.f328989F + ", defined=" + this.f328990G + ", defaults=" + this.f328991H + ')';
    }

    /* renamed from: o5.h$a */
    public static final class C109957a {

        /* renamed from: A */
        public C109950b f329018A;

        /* renamed from: B */
        public Integer f329019B;

        /* renamed from: C */
        public Drawable f329020C;

        /* renamed from: D */
        public Integer f329021D;

        /* renamed from: E */
        public Drawable f329022E;

        /* renamed from: F */
        public Integer f329023F;

        /* renamed from: G */
        public Drawable f329024G;

        /* renamed from: H */
        public C39623j f329025H;

        /* renamed from: I */
        public C110169f f329026I;

        /* renamed from: J */
        public C110168e f329027J;

        /* renamed from: a */
        public final Context f329028a;

        /* renamed from: b */
        public C109951c f329029b;

        /* renamed from: c */
        public Object f329030c;

        /* renamed from: d */
        public C110366b f329031d;

        /* renamed from: e */
        public C109958b f329032e;

        /* renamed from: f */
        public MemoryCache$Key f329033f;

        /* renamed from: g */
        public MemoryCache$Key f329034g;

        /* renamed from: h */
        public ColorSpace f329035h;

        /* renamed from: i */
        public C13604l<? extends C108576g<?>, ? extends Class<?>> f329036i;

        /* renamed from: j */
        public C108139e f329037j;

        /* renamed from: k */
        public List<? extends C110501a> f329038k;

        /* renamed from: l */
        public C20419r.C20420a f329039l;

        /* renamed from: m */
        public C35103l.C35104a f329040m;

        /* renamed from: n */
        public C39623j f329041n;

        /* renamed from: o */
        public C110169f f329042o;

        /* renamed from: p */
        public C110168e f329043p;

        /* renamed from: q */
        public C53896h0 f329044q;

        /* renamed from: r */
        public C110740c f329045r;

        /* renamed from: s */
        public C110166b f329046s;

        /* renamed from: t */
        public Bitmap.Config f329047t;

        /* renamed from: u */
        public Boolean f329048u;

        /* renamed from: v */
        public Boolean f329049v;

        /* renamed from: w */
        public boolean f329050w;

        /* renamed from: x */
        public boolean f329051x;

        /* renamed from: y */
        public C109950b f329052y;

        /* renamed from: z */
        public C109950b f329053z;

        public C109957a(Context context) {
            C87412m.m108594g(context, "context");
            this.f329028a = context;
            this.f329029b = C109951c.f328954m;
            this.f329030c = null;
            this.f329031d = null;
            this.f329032e = null;
            this.f329033f = null;
            this.f329034g = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f329035h = null;
            }
            this.f329036i = null;
            this.f329037j = null;
            this.f329038k = C64186f0.f181907d;
            this.f329039l = null;
            this.f329040m = null;
            this.f329041n = null;
            this.f329042o = null;
            this.f329043p = null;
            this.f329044q = null;
            this.f329045r = null;
            this.f329046s = null;
            this.f329047t = null;
            this.f329048u = null;
            this.f329049v = null;
            this.f329050w = true;
            this.f329051x = true;
            this.f329052y = null;
            this.f329053z = null;
            this.f329018A = null;
            this.f329019B = null;
            this.f329020C = null;
            this.f329021D = null;
            this.f329022E = null;
            this.f329023F = null;
            this.f329024G = null;
            this.f329025H = null;
            this.f329026I = null;
            this.f329027J = null;
        }

        /* renamed from: a */
        public final C109956h mo161284a() {
            C39623j jVar;
            C39623j jVar2;
            C110169f fVar;
            C110169f fVar2;
            Context context = this.f329028a;
            Object obj = this.f329030c;
            if (obj == null) {
                obj = C109961j.f329058a;
            }
            Object obj2 = obj;
            C110366b bVar = this.f329031d;
            C109958b bVar2 = this.f329032e;
            MemoryCache$Key memoryCache$Key = this.f329033f;
            MemoryCache$Key memoryCache$Key2 = this.f329034g;
            ColorSpace colorSpace = this.f329035h;
            C13604l<? extends C108576g<?>, ? extends Class<?>> lVar = this.f329036i;
            C108139e eVar = this.f329037j;
            List<? extends C110501a> list = this.f329038k;
            C20419r.C20420a aVar = this.f329039l;
            C39623j jVar3 = null;
            C20419r rVar = aVar == null ? null : new C20419r(aVar);
            if (rVar == null) {
                rVar = C110905d.f331711a;
            } else {
                C20419r rVar2 = C110905d.f331711a;
            }
            C35103l.C35104a aVar2 = this.f329040m;
            C35103l lVar2 = aVar2 == null ? null : new C35103l(C90364q0.m113154m(aVar2.f94181a));
            if (lVar2 == null) {
                lVar2 = C35103l.f94179e;
            }
            C39623j jVar4 = this.f329041n;
            if (jVar4 == null && (jVar4 = this.f329025H) == null) {
                C110366b bVar3 = this.f329031d;
                Context context2 = bVar3 instanceof C110367c ? ((C110367c) bVar3).getView().getContext() : this.f329028a;
                while (true) {
                    if (context2 instanceof C0125s) {
                        jVar3 = ((C0125s) context2).getLifecycle();
                        break;
                    } else if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                if (jVar3 == null) {
                    jVar3 = C109955g.f328982a;
                }
                jVar = jVar3;
            } else {
                jVar = jVar4;
            }
            C110169f fVar3 = this.f329042o;
            if (fVar3 == null && (fVar3 = this.f329026I) == null) {
                C110366b bVar4 = this.f329031d;
                if (bVar4 instanceof C110367c) {
                    View view = ((C110367c) bVar4).getView();
                    jVar2 = jVar;
                    if (view instanceof ImageView) {
                        ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            int i = C110169f.f329587a;
                            OriginalSize originalSize = OriginalSize.f309027d;
                            C87412m.m108594g(originalSize, "size");
                            fVar2 = new C35367c(originalSize);
                        }
                    }
                    int i2 = C110170g.f329588a;
                    C87412m.m108594g(view, "view");
                    fVar2 = new C110167d(view, true);
                } else {
                    jVar2 = jVar;
                    fVar2 = new C110165a(this.f329028a);
                }
                fVar = fVar2;
            } else {
                jVar2 = jVar;
                fVar = fVar3;
            }
            C110168e eVar2 = this.f329043p;
            if (eVar2 == null && (eVar2 = this.f329027J) == null) {
                C110169f fVar4 = this.f329042o;
                if (fVar4 instanceof C110170g) {
                    View view2 = ((C110170g) fVar4).getView();
                    if (view2 instanceof ImageView) {
                        eVar2 = C110905d.m151207c((ImageView) view2);
                    }
                }
                C110366b bVar5 = this.f329031d;
                if (bVar5 instanceof C110367c) {
                    View view3 = ((C110367c) bVar5).getView();
                    if (view3 instanceof ImageView) {
                        eVar2 = C110905d.m151207c((ImageView) view3);
                    }
                }
                eVar2 = C110168e.FILL;
            }
            C110168e eVar3 = eVar2;
            C53896h0 h0Var = this.f329044q;
            if (h0Var == null) {
                h0Var = this.f329029b.f328955a;
            }
            C53896h0 h0Var2 = h0Var;
            C110740c cVar = this.f329045r;
            if (cVar == null) {
                cVar = this.f329029b.f328956b;
            }
            C110740c cVar2 = cVar;
            C110166b bVar6 = this.f329046s;
            if (bVar6 == null) {
                bVar6 = this.f329029b.f328957c;
            }
            C110166b bVar7 = bVar6;
            Bitmap.Config config = this.f329047t;
            if (config == null) {
                config = this.f329029b.f328958d;
            }
            Bitmap.Config config2 = config;
            boolean z = this.f329051x;
            Boolean bool = this.f329048u;
            boolean booleanValue = bool == null ? this.f329029b.f328959e : bool.booleanValue();
            Boolean bool2 = this.f329049v;
            boolean booleanValue2 = bool2 == null ? this.f329029b.f328960f : bool2.booleanValue();
            boolean z2 = this.f329050w;
            C109950b bVar8 = this.f329052y;
            boolean z3 = z;
            C109950b bVar9 = bVar8 == null ? this.f329029b.f328964j : bVar8;
            C109950b bVar10 = this.f329053z;
            C110169f fVar5 = fVar;
            C109950b bVar11 = bVar10 == null ? this.f329029b.f328965k : bVar10;
            C109950b bVar12 = this.f329018A;
            C35103l lVar3 = lVar2;
            C109950b bVar13 = bVar12 == null ? this.f329029b.f328966l : bVar12;
            C109952d dVar = r35;
            List<? extends C110501a> list2 = list;
            C108139e eVar4 = eVar;
            C13604l<? extends C108576g<?>, ? extends Class<?>> lVar4 = lVar;
            ColorSpace colorSpace2 = colorSpace;
            MemoryCache$Key memoryCache$Key3 = memoryCache$Key2;
            MemoryCache$Key memoryCache$Key4 = memoryCache$Key;
            C109958b bVar14 = bVar2;
            C109952d dVar2 = new C109952d(this.f329041n, this.f329042o, this.f329043p, this.f329044q, this.f329045r, this.f329046s, this.f329047t, this.f329048u, this.f329049v, bVar8, bVar10, bVar12);
            C109951c cVar3 = this.f329029b;
            C87412m.m108593f(rVar, "orEmpty()");
            return new C109956h(context, obj2, bVar, bVar14, memoryCache$Key4, memoryCache$Key3, colorSpace2, lVar4, eVar4, list2, rVar, lVar3, jVar2, fVar5, eVar3, h0Var2, cVar2, bVar7, config2, z3, booleanValue, booleanValue2, z2, bVar9, bVar11, bVar13, this.f329019B, this.f329020C, this.f329021D, this.f329022E, this.f329023F, this.f329024G, dVar, cVar3, (C8480h) null);
        }

        public C109957a(C109956h hVar, Context context) {
            C87412m.m108594g(hVar, "request");
            C87412m.m108594g(context, "context");
            this.f329028a = context;
            this.f329029b = hVar.f328991H;
            this.f329030c = hVar.f328993b;
            this.f329031d = hVar.f328994c;
            this.f329032e = hVar.f328995d;
            this.f329033f = hVar.f328996e;
            this.f329034g = hVar.f328997f;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f329035h = hVar.f328998g;
            }
            this.f329036i = hVar.f328999h;
            this.f329037j = hVar.f329000i;
            this.f329038k = hVar.f329001j;
            this.f329039l = hVar.f329002k.mo31928e();
            C35103l lVar = hVar.f329003l;
            lVar.getClass();
            this.f329040m = new C35103l.C35104a(lVar);
            C109952d dVar = hVar.f328990G;
            this.f329041n = dVar.f328967a;
            this.f329042o = dVar.f328968b;
            this.f329043p = dVar.f328969c;
            this.f329044q = dVar.f328970d;
            this.f329045r = dVar.f328971e;
            this.f329046s = dVar.f328972f;
            this.f329047t = dVar.f328973g;
            this.f329048u = dVar.f328974h;
            this.f329049v = dVar.f328975i;
            this.f329050w = hVar.f329014w;
            this.f329051x = hVar.f329011t;
            this.f329052y = dVar.f328976j;
            this.f329053z = dVar.f328977k;
            this.f329018A = dVar.f328978l;
            this.f329019B = hVar.f328984A;
            this.f329020C = hVar.f328985B;
            this.f329021D = hVar.f328986C;
            this.f329022E = hVar.f328987D;
            this.f329023F = hVar.f328988E;
            this.f329024G = hVar.f328989F;
            if (hVar.f328992a == context) {
                this.f329025H = hVar.f329004m;
                this.f329026I = hVar.f329005n;
                this.f329027J = hVar.f329006o;
                return;
            }
            this.f329025H = null;
            this.f329026I = null;
            this.f329027J = null;
        }
    }
}
