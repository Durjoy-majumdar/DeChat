package p267x;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import my3.C61595o;
import p1165z.C112527l;
import p1165z.C112528m;
import p175j0.C108494d2;
import p175j0.C108500f2;
import p175j0.C108507n2;
import p175j0.C60690y0;
import p683s0.C36601l;
import p683s0.C36602m;
import p683s0.C36606n;
import p759y.C112278q0;
import p759y.C112302z0;
import p759y.C66468h;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: x.l2 */
public final class C111932l2 implements C112302z0 {

    /* renamed from: f */
    public static final C36601l<C111932l2, ?> f335094f = C36602m.m41009a(C38423a.f101367d, C38424b.f101368d);

    /* renamed from: a */
    public final C60690y0 f335095a;

    /* renamed from: b */
    public final C112527l f335096b = new C112528m();

    /* renamed from: c */
    public C60690y0<Integer> f335097c;

    /* renamed from: d */
    public float f335098d;

    /* renamed from: e */
    public final C112302z0 f335099e;

    /* renamed from: x.l2$a */
    public static final class C38423a extends C87413o implements C32227p<C36606n, C111932l2, Integer> {

        /* renamed from: d */
        public static final C38423a f101367d = new C38423a();

        public C38423a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C111932l2 l2Var = (C111932l2) obj2;
            C87412m.m108594g((C36606n) obj, "$this$Saver");
            C87412m.m108594g(l2Var, LocaleUtil.ITALIAN);
            return Integer.valueOf(l2Var.mo163632d());
        }
    }

    /* renamed from: x.l2$b */
    public static final class C38424b extends C87413o implements C32226l<Integer, C111932l2> {

        /* renamed from: d */
        public static final C38424b f101368d = new C38424b();

        public C38424b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return new C111932l2(((Number) obj).intValue());
        }
    }

    /* renamed from: x.l2$c */
    public static final class C111933c extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public final /* synthetic */ C111932l2 f335100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111933c(C111932l2 l2Var) {
            super(1);
            this.f335100d = l2Var;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            C111932l2 l2Var = this.f335100d;
            float d = ((float) this.f335100d.mo163632d()) + floatValue + l2Var.f335098d;
            float d2 = C61595o.m72296d(d, 0.0f, (float) ((Number) ((C108494d2) l2Var.f335097c).getValue()).intValue());
            boolean z = !(d == d2);
            float d3 = d2 - ((float) this.f335100d.mo163632d());
            int b = C60641c.m70921b(d3);
            C111932l2 l2Var2 = this.f335100d;
            ((C108494d2) l2Var2.f335095a).setValue(Integer.valueOf(l2Var2.mo163632d() + b));
            this.f335100d.f335098d = d3 - ((float) b);
            if (z) {
                floatValue = d3;
            }
            return Float.valueOf(floatValue);
        }
    }

    public C111932l2(int i) {
        Integer valueOf = Integer.valueOf(i);
        C108507n2 n2Var = C108507n2.f324831a;
        this.f335095a = C108500f2.m146995b(valueOf, n2Var);
        this.f335097c = C108500f2.m146995b(Integer.MAX_VALUE, n2Var);
        this.f335099e = new C66468h(new C111933c(this));
    }

    /* renamed from: a */
    public boolean mo90552a() {
        return ((C66468h) this.f335099e).mo90552a();
    }

    /* renamed from: b */
    public float mo90553b(float f) {
        return ((C66468h) this.f335099e).mo90553b(f);
    }

    /* renamed from: c */
    public Object mo90554c(C38426u1 u1Var, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        Object c = ((C66468h) this.f335099e).mo90554c(u1Var, pVar, dVar);
        return c == C15911a.COROUTINE_SUSPENDED ? c : C13598b0.f38549a;
    }

    /* renamed from: d */
    public final int mo163632d() {
        return ((Number) this.f335095a.getValue()).intValue();
    }
}
