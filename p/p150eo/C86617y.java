package p150eo;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import di3.C86301e;
import ei3.C86522b;
import f70.C86764b;
import f70.C86776g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p467co.C80110a;
import p467co.C80111b;
import p493do.C86383j;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

@C86522b
/* renamed from: eo.y */
public final class C86617y extends C86301e implements C86383j {

    /* renamed from: d */
    public final C13601g f251580d = C36568h.m40985a(C86620c.f251586d);

    /* renamed from: e */
    public final C13601g f251581e = C36568h.m40985a(new C86619b(this));

    /* renamed from: f */
    public final C13601g f251582f = C36568h.m40985a(new C86618a(this));

    /* renamed from: g */
    public final C13601g f251583g = C36568h.m40985a(new C86621d(this));

    /* renamed from: eo.y$a */
    public static final class C86618a extends C87413o implements C32224a<C80110a> {

        /* renamed from: d */
        public final /* synthetic */ C86617y f251584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86618a(C86617y yVar) {
            super(0);
            this.f251584d = yVar;
        }

        public Object invoke() {
            return new C80110a((C86764b) ((C36570n) this.f251584d.f251580d).getValue());
        }
    }

    /* renamed from: eo.y$b */
    public static final class C86619b extends C87413o implements C32224a<C80111b> {

        /* renamed from: d */
        public final /* synthetic */ C86617y f251585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86619b(C86617y yVar) {
            super(0);
            this.f251585d = yVar;
        }

        public Object invoke() {
            return new C80111b((C86764b) ((C36570n) this.f251585d.f251580d).getValue());
        }
    }

    /* renamed from: eo.y$c */
    public static final class C86620c extends C87413o implements C32224a<C86764b> {

        /* renamed from: d */
        public static final C86620c f251586d = new C86620c();

        public C86620c() {
            super(0);
        }

        public Object invoke() {
            return new C86764b();
        }
    }

    /* renamed from: eo.y$d */
    public static final class C86621d extends C87413o implements C32224a<C86776g> {

        /* renamed from: d */
        public final /* synthetic */ C86617y f251587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86621d(C86617y yVar) {
            super(0);
            this.f251587d = yVar;
        }

        public Object invoke() {
            C80111b bVar = (C80111b) ((C36570n) this.f251587d.f251581e).getValue();
            C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.flutter.IMagicSclHandler");
            C80110a aVar = (C80110a) ((C36570n) this.f251587d.f251582f).getValue();
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.flutter.IMagicSclHandler");
            return new C86776g(C90364q0.m113147f(new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE, bVar), new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, aVar)));
        }
    }

    /* renamed from: lx */
    public C80111b mo120806lx() {
        return (C80111b) ((C36570n) this.f251581e).getValue();
    }

    /* renamed from: tl */
    public C86776g mo120807tl() {
        return (C86776g) ((C36570n) this.f251583g).getValue();
    }

    /* renamed from: xK */
    public C86764b mo120808xK() {
        return (C86764b) ((C36570n) this.f251580d).getValue();
    }

    public C80110a yh0() {
        return (C80110a) ((C36570n) this.f251582f).getValue();
    }
}
