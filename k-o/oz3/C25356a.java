package oz3;

import b04.C23642a0;
import b04.C23646d;
import b04.C23649g;
import b04.C23658n;
import b04.C23667t;
import b04.C23669v;
import b04.C23671x;
import b04.C23672y;
import b04.C23673z;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j04.C24733b;
import j04.C24735c;
import j04.C24736c0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m04.C24959e;
import m04.C24975g;
import m04.C24980n;
import n04.C25143j0;
import oz3.C25366c;
import qz3.C26052n;
import sz3.C26238b;
import ty3.C26348p;
import uz3.C111238e;
import uz3.C26380h;
import wy3.C26521y0;

/* renamed from: oz3.a */
public abstract class C25356a<A, C> extends C25366c<A, C25357a<? extends A, ? extends C>> implements C24735c<A, C> {

    /* renamed from: b */
    public final C24975g<C25395q, C25357a<A, C>> f71857b;

    /* renamed from: oz3.a$a */
    public static final class C25357a<A, C> extends C25366c.C25367a<A> {

        /* renamed from: a */
        public final Map<C21909t, List<A>> f71858a;

        /* renamed from: b */
        public final Map<C21909t, C> f71859b;

        /* renamed from: c */
        public final Map<C21909t, C> f71860c;

        public C25357a(Map<C21909t, ? extends List<? extends A>> map, Map<C21909t, ? extends C> map2, Map<C21909t, ? extends C> map3) {
            C87412m.m108594g(map, "memberAnnotations");
            C87412m.m108594g(map2, "propertyConstants");
            C87412m.m108594g(map3, "annotationParametersDefaultValues");
            this.f71858a = map;
            this.f71859b = map2;
            this.f71860c = map3;
        }
    }

    /* renamed from: oz3.a$b */
    public static final class C25358b extends C87413o implements C32227p<C25357a<? extends A, ? extends C>, C21909t, C> {

        /* renamed from: d */
        public static final C25358b f71861d = new C25358b();

        public C25358b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C25357a aVar = (C25357a) obj;
            C21909t tVar = (C21909t) obj2;
            C87412m.m108594g(aVar, "$this$loadConstantFromProperty");
            C87412m.m108594g(tVar, LocaleUtil.ITALIAN);
            return aVar.f71860c.get(tVar);
        }
    }

    /* renamed from: oz3.a$c */
    public static final class C25359c extends C87413o implements C32227p<C25357a<? extends A, ? extends C>, C21909t, C> {

        /* renamed from: d */
        public static final C25359c f71862d = new C25359c();

        public C25359c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C25357a aVar = (C25357a) obj;
            C21909t tVar = (C21909t) obj2;
            C87412m.m108594g(aVar, "$this$loadConstantFromProperty");
            C87412m.m108594g(tVar, LocaleUtil.ITALIAN);
            return aVar.f71859b.get(tVar);
        }
    }

    /* renamed from: oz3.a$d */
    public static final class C25360d extends C87413o implements C32226l<C25395q, C25357a<? extends A, ? extends C>> {

        /* renamed from: d */
        public final /* synthetic */ C25356a<A, C> f71863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25360d(C25356a<A, C> aVar) {
            super(1);
            this.f71863d = aVar;
        }

        public Object invoke(Object obj) {
            C25395q qVar = (C25395q) obj;
            C87412m.m108594g(qVar, "kotlinClass");
            C25356a<A, C> aVar = this.f71863d;
            aVar.getClass();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            qVar.mo37226d(new C25362b(aVar, hashMap, qVar, hashMap3, hashMap2), (byte[]) null);
            return new C25357a(hashMap, hashMap2, hashMap3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25356a(C24980n nVar, C25390o oVar) {
        super(oVar);
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(oVar, "kotlinClassFinder");
        this.f71857b = nVar.mo52007h(new C25360d(this));
    }

    /* renamed from: b */
    public C mo51711b(C24736c0 c0Var, C26052n nVar, C25143j0 j0Var) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(j0Var, "expectedType");
        return mo52542w(c0Var, nVar, C24733b.PROPERTY, j0Var, C25359c.f71862d);
    }

    /* renamed from: i */
    public C mo51712i(C24736c0 c0Var, C26052n nVar, C25143j0 j0Var) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(j0Var, "expectedType");
        return mo52542w(c0Var, nVar, C24733b.PROPERTY_GETTER, j0Var, C25358b.f71861d);
    }

    /* renamed from: w */
    public final C mo52542w(C24736c0 c0Var, C26052n nVar, C24733b bVar, C25143j0 j0Var, C32227p<? super C25357a<? extends A, ? extends C>, ? super C21909t, ? extends C> pVar) {
        C invoke;
        C zVar;
        C25395q r = mo52555r(c0Var, true, true, C26238b.f73138A.mo53140c(nVar.f72696g), C26380h.m33951d(nVar));
        if (r == null) {
            if (c0Var instanceof C24736c0.C24737a) {
                C26521y0 y0Var = ((C24736c0.C24737a) c0Var).f70578c;
                C25402s sVar = y0Var instanceof C25402s ? (C25402s) y0Var : null;
                if (sVar != null) {
                    r = sVar.f71941b;
                }
            }
            r = null;
        }
        if (r == null) {
            return null;
        }
        C111238e eVar = r.mo37224b().f72190b;
        C111238e eVar2 = C25378g.f71918f;
        eVar.getClass();
        C87412m.m108594g(eVar2, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        C21909t n = mo52553n(nVar, c0Var.f70576a, c0Var.f70577b, bVar, eVar.mo162403a(eVar2.f331565b, eVar2.f331566c, eVar2.f331567d));
        if (n == null || (invoke = pVar.invoke(((C24959e.C24972m) this.f71857b).invoke(r), n)) == null) {
            return null;
        }
        if (!C26348p.m33867a(j0Var)) {
            return invoke;
        }
        C c = (C23649g) invoke;
        if (c instanceof C23646d) {
            zVar = new C23671x(((Number) ((C23646d) c).f67839a).byteValue());
        } else if (c instanceof C23669v) {
            zVar = new C23642a0(((Number) ((C23669v) c).f67839a).shortValue());
        } else if (c instanceof C23658n) {
            zVar = new C23672y(((Number) ((C23658n) c).f67839a).intValue());
        } else if (!(c instanceof C23667t)) {
            return c;
        } else {
            zVar = new C23673z(((Number) ((C23667t) c).f67839a).longValue());
        }
        return zVar;
    }
}
