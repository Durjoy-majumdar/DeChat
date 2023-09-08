package p631o1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import p175j0.C108504h;
import p175j0.C24721r;
import p410k0.C108793e;
import p560i2.C108319b;
import p658q1.C110301j;
import rx3.C13598b0;

/* renamed from: o1.w0 */
public final class C109888w0 {

    /* renamed from: a */
    public final C109897y0 f328836a;

    /* renamed from: b */
    public C109874t f328837b;

    /* renamed from: c */
    public final C32227p<C110301j, C109888w0, C13598b0> f328838c;

    /* renamed from: d */
    public final C32227p<C110301j, C24721r, C13598b0> f328839d;

    /* renamed from: e */
    public final C32227p<C110301j, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z>, C13598b0> f328840e;

    /* renamed from: o1.w0$a */
    public interface C109889a {
        /* renamed from: a */
        void mo161193a(int i, long j);

        /* renamed from: b */
        int mo161194b();

        void dispose();
    }

    /* renamed from: o1.w0$b */
    public static final class C109890b extends C87413o implements C32227p<C110301j, C24721r, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109888w0 f328841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109890b(C109888w0 w0Var) {
            super(2);
            this.f328841d = w0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C24721r rVar = (C24721r) obj2;
            C87412m.m108594g((C110301j) obj, "$this$null");
            C87412m.m108594g(rVar, LocaleUtil.ITALIAN);
            this.f328841d.mo161196a().f328798b = rVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.w0$c */
    public static final class C109891c extends C87413o implements C32227p<C110301j, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109888w0 f328842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109891c(C109888w0 w0Var) {
            super(2);
            this.f328842d = w0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C110301j jVar = (C110301j) obj;
            C32227p pVar = (C32227p) obj2;
            C87412m.m108594g(jVar, "$this$null");
            C87412m.m108594g(pVar, LocaleUtil.ITALIAN);
            C109874t a = this.f328842d.mo161196a();
            jVar.mo161677e(new C109878u(a, pVar, a.f328808l));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.w0$d */
    public static final class C109892d extends C87413o implements C32227p<C110301j, C109888w0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109888w0 f328843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109892d(C109888w0 w0Var) {
            super(2);
            this.f328843d = w0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, "$this$null");
            C87412m.m108594g((C109888w0) obj2, LocaleUtil.ITALIAN);
            C109888w0 w0Var = this.f328843d;
            C109874t tVar = jVar.f329898L;
            if (tVar == null) {
                tVar = new C109874t(jVar, w0Var.f328836a);
                jVar.f329898L = tVar;
            }
            w0Var.f328837b = tVar;
            this.f328843d.mo161196a().mo161189b();
            C109874t a = this.f328843d.mo161196a();
            C109897y0 y0Var = this.f328843d.f328836a;
            C87412m.m108594g(y0Var, "value");
            if (a.f328799c != y0Var) {
                a.f328799c = y0Var;
                a.mo161188a(0);
            }
            return C13598b0.f38549a;
        }
    }

    public C109888w0(C109897y0 y0Var) {
        C87412m.m108594g(y0Var, "slotReusePolicy");
        this.f328836a = y0Var;
        this.f328838c = new C109892d(this);
        this.f328839d = new C109890b(this);
        this.f328840e = new C109891c(this);
    }

    /* renamed from: a */
    public final C109874t mo161196a() {
        C109874t tVar = this.f328837b;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    /* renamed from: b */
    public final C109889a mo161197b(Object obj, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        C109874t a = mo161196a();
        a.mo161189b();
        if (!a.f328802f.containsKey(obj)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) a.f328804h;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = a.mo161191d(obj);
                if (obj2 != null) {
                    int indexOf = ((C108793e.C108794a) a.f328797a.mo161722r()).indexOf(obj2);
                    int i = ((C108793e.C108794a) a.f328797a.mo161722r()).f325787d.f325786f;
                    C110301j jVar = a.f328797a;
                    jVar.f329922q = true;
                    jVar.mo161705E(indexOf, i, 1);
                    jVar.f329922q = false;
                    a.f328807k++;
                } else {
                    int i2 = ((C108793e.C108794a) a.f328797a.mo161722r()).f325787d.f325786f;
                    C110301j jVar2 = new C110301j(true);
                    C110301j jVar3 = a.f328797a;
                    jVar3.f329922q = true;
                    jVar3.mo161728w(i2, jVar2);
                    jVar3.f329922q = false;
                    a.f328807k++;
                    obj2 = jVar2;
                }
                linkedHashMap.put(obj, obj2);
            }
            a.mo161190c((C110301j) obj2, obj, pVar);
        }
        return new C109885v(a, obj);
    }

    public C109888w0() {
        this(C109842f0.f328768a);
    }
}
