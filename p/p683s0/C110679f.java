package p683s0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p175j0.C108499f1;
import p175j0.C108502g1;
import p175j0.C108504h;
import p175j0.C108513w;
import p175j0.C33487v1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import rx3.C13598b0;
import sx3.C90364q0;

/* renamed from: s0.f */
public final class C110679f implements C110678e {

    /* renamed from: d */
    public static final C36601l<C110679f, ?> f331091d = C36602m.m41009a(C110680a.f331095d, C110681b.f331096d);

    /* renamed from: a */
    public final Map<Object, Map<String, List<Object>>> f331092a;

    /* renamed from: b */
    public final Map<Object, C110682c> f331093b;

    /* renamed from: c */
    public C110688i f331094c;

    /* renamed from: s0.f$a */
    public static final class C110680a extends C87413o implements C32227p<C36606n, C110679f, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: d */
        public static final C110680a f331095d = new C110680a();

        public C110680a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C110679f fVar = (C110679f) obj2;
            C87412m.m108594g((C36606n) obj, "$this$Saver");
            C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
            Map<Object, Map<String, List<Object>>> n = C90364q0.m113155n(fVar.f331092a);
            for (C110682c cVar : ((LinkedHashMap) fVar.f331093b).values()) {
                cVar.getClass();
                if (cVar.f331098b) {
                    n.put(cVar.f331097a, ((C36599j) cVar.f331099c).mo60746c());
                }
            }
            return n;
        }
    }

    /* renamed from: s0.f$b */
    public static final class C110681b extends C87413o implements C32226l<Map<Object, Map<String, ? extends List<? extends Object>>>, C110679f> {

        /* renamed from: d */
        public static final C110681b f331096d = new C110681b();

        public C110681b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map map = (Map) obj;
            C87412m.m108594g(map, LocaleUtil.ITALIAN);
            return new C110679f(map);
        }
    }

    /* renamed from: s0.f$c */
    public final class C110682c {

        /* renamed from: a */
        public final Object f331097a;

        /* renamed from: b */
        public boolean f331098b = true;

        /* renamed from: c */
        public final C110688i f331099c;

        /* renamed from: s0.f$c$a */
        public static final class C110683a extends C87413o implements C32226l<Object, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C110679f f331100d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110683a(C110679f fVar) {
                super(1);
                this.f331100d = fVar;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g(obj, LocaleUtil.ITALIAN);
                C110688i iVar = this.f331100d.f331094c;
                return Boolean.valueOf(iVar == null ? true : iVar.mo60744a(obj));
            }
        }

        public C110682c(C110679f fVar, Object obj) {
            C87412m.m108594g(fVar, "this$0");
            C87412m.m108594g(obj, "key");
            this.f331097a = obj;
            C110683a aVar = new C110683a(fVar);
            C108499f1<C110688i> f1Var = C110690k.f331112a;
            this.f331099c = new C36599j(fVar.f331092a.get(obj), aVar);
        }
    }

    /* renamed from: s0.f$d */
    public static final class C110684d extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C110679f f331101d;

        /* renamed from: e */
        public final /* synthetic */ Object f331102e;

        /* renamed from: f */
        public final /* synthetic */ C110682c f331103f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110684d(C110679f fVar, Object obj, C110682c cVar) {
            super(1);
            this.f331101d = fVar;
            this.f331102e = obj;
            this.f331103f = cVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            boolean z = !this.f331101d.f331093b.containsKey(this.f331102e);
            Object obj2 = this.f331102e;
            if (z) {
                this.f331101d.f331092a.remove(obj2);
                this.f331101d.f331093b.put(this.f331102e, this.f331103f);
                return new C110686g(this.f331103f, this.f331101d, this.f331102e);
            }
            throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
    }

    /* renamed from: s0.f$e */
    public static final class C110685e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110679f f331104d;

        /* renamed from: e */
        public final /* synthetic */ Object f331105e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f331106f;

        /* renamed from: g */
        public final /* synthetic */ int f331107g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110685e(C110679f fVar, Object obj, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f331104d = fVar;
            this.f331105e = obj;
            this.f331106f = pVar;
            this.f331107g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f331104d.mo162239a(this.f331105e, this.f331106f, (C108504h) obj, this.f331107g | 1);
            return C13598b0.f38549a;
        }
    }

    public C110679f() {
        this((Map) null, 1, (C8480h) null);
    }

    public C110679f(Map<Object, Map<String, List<Object>>> map) {
        C87412m.m108594g(map, "savedStates");
        this.f331092a = map;
        this.f331093b = new LinkedHashMap();
    }

    /* renamed from: a */
    public void mo162239a(Object obj, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        C87412m.m108594g(obj, "key");
        C87412m.m108594g(pVar, "content");
        C108504h z = hVar.mo51623z(-111644091);
        z.mo51557H(-1530021272);
        z.mo51617w(207, obj);
        z.mo51557H(1516495192);
        z.mo51557H(-3687241);
        Object q = z.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            C110688i iVar = this.f331094c;
            if (iVar == null ? true : iVar.mo60744a(obj)) {
                q = new C110682c(this, obj);
                z.mo51553F(q);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        z.mo51565P();
        C110682c cVar = (C110682c) q;
        C108513w.m147056a(new C108502g1[]{C110690k.f331112a.mo159370b(cVar.f331099c)}, pVar, z, (i & 112) | 8);
        C60655g0.m70930a(C13598b0.f38549a, new C110684d(this, obj, cVar), z, 0);
        z.mo51565P();
        z.mo51604p();
        z.mo51565P();
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C110685e(this, obj, pVar, i));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110679f(Map map, int i, C8480h hVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
