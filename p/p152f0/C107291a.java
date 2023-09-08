package p152f0;

import com.tencent.wxmm.v2helper;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p155g0.C107594a;
import p155g0.C32247i;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p415q0.C110261c;
import p435a0.C103129b1;
import p435a0.C103214y0;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: f0.a */
public final class C107291a {

    /* renamed from: a */
    public static final float f321015a;

    /* renamed from: b */
    public static final float f321016b;

    /* renamed from: f0.a$a */
    public static final class C107292a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321017d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f321018e;

        /* renamed from: f */
        public final /* synthetic */ int f321019f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107292a(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C65503j jVar, int i) {
            super(2);
            this.f321017d = pVar;
            this.f321018e = jVar;
            this.f321019f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && hVar.mo51575a()) {
                hVar.mo51581d();
            } else if (this.f321017d == null) {
                hVar.mo51557H(1275643833);
                C107291a.m145446b(this.f321018e, hVar, (this.f321019f >> 3) & 14);
                hVar.mo51565P();
            } else {
                hVar.mo51557H(1275643903);
                this.f321017d.invoke(hVar, Integer.valueOf((this.f321019f >> 6) & 14));
                hVar.mo51565P();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.a$b */
    public static final class C107293b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f321020d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f321021e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321022f;

        /* renamed from: g */
        public final /* synthetic */ int f321023g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107293b(long j, C65503j jVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f321020d = j;
            this.f321021e = jVar;
            this.f321022f = pVar;
            this.f321023g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107291a.m145445a(this.f321020d, this.f321021e, this.f321022f, (C108504h) obj, this.f321023g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.a$c */
    public static final class C107294c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f321024d;

        /* renamed from: e */
        public final /* synthetic */ int f321025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107294c(C65503j jVar, int i) {
            super(2);
            this.f321024d = jVar;
            this.f321025e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107291a.m145446b(this.f321024d, (C108504h) obj, this.f321025e | 1);
            return C13598b0.f38549a;
        }
    }

    static {
        float f = (float) 25;
        f321015a = f;
        f321016b = (f * 2.0f) / 2.4142137f;
    }

    /* renamed from: a */
    public static final void m145445a(long j, C65503j jVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(jVar, "modifier");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-5185995);
        if ((i & 14) == 0) {
            i2 = (z.mo51594k(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z.mo51619x(jVar) ? 32 : 16;
        }
        if ((i & C22657f.CTRL_INDEX) == 0) {
            i2 |= z.mo51619x(pVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !z.mo51575a()) {
            C107594a.m145753b(j, C32247i.TopMiddle, C110261c.m149878b(z, -1458480226, true, new C107292a(pVar, jVar, i2)), z, (i2 & 14) | v2helper.EMethodSetSendToNetworkOn);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107293b(j, jVar, pVar, i));
        }
    }

    /* renamed from: b */
    public static final void m145446b(C65503j jVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(jVar, "modifier");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(694251107);
        if ((i & 14) == 0) {
            i2 = (z.mo51619x(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            C65503j k = C103214y0.m136595k(jVar, f321016b, f321015a);
            C87412m.m108594g(k, "<this>");
            C103129b1.m136432a(C111299g.m151787b(k, (C32226l) null, C107305d.f321046d, 1, (Object) null), z, 0);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107294c(jVar, i));
        }
    }
}
