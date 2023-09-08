package fq3;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106969c;
import p175j0.C108504h;
import p175j0.C33487v1;
import p267x.C111897d1;
import p435a0.C103214y0;
import p436a1.C103274x;
import p631o1.C109836f;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: fq3.c */
public final class C107559c {

    /* renamed from: fq3.c$a */
    public static final class C107560a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106969c f321830d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f321831e;

        /* renamed from: f */
        public final /* synthetic */ String f321832f;

        /* renamed from: g */
        public final /* synthetic */ int f321833g;

        /* renamed from: h */
        public final /* synthetic */ int f321834h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107560a(C106969c cVar, C65503j jVar, String str, int i, int i2) {
            super(2);
            this.f321830d = cVar;
            this.f321831e = jVar;
            this.f321832f = str;
            this.f321833g = i;
            this.f321834h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107559c.m145728a(this.f321830d, this.f321831e, this.f321832f, (C108504h) obj, this.f321833g | 1, this.f321834h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.c$b */
    public static final class C107561b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106969c f321835d;

        /* renamed from: e */
        public final /* synthetic */ float f321836e;

        /* renamed from: f */
        public final /* synthetic */ float f321837f;

        /* renamed from: g */
        public final /* synthetic */ String f321838g;

        /* renamed from: h */
        public final /* synthetic */ int f321839h;

        /* renamed from: i */
        public final /* synthetic */ int f321840i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107561b(C106969c cVar, float f, float f2, String str, int i, int i2) {
            super(2);
            this.f321835d = cVar;
            this.f321836e = f;
            this.f321837f = f2;
            this.f321838g = str;
            this.f321839h = i;
            this.f321840i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107559c.m145729b(this.f321835d, this.f321836e, this.f321837f, this.f321838g, (C108504h) obj, this.f321839h | 1, this.f321840i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145728a(C106969c cVar, C65503j jVar, String str, C108504h hVar, int i, int i2) {
        C106969c cVar2 = cVar;
        C87412m.m108594g(cVar, "painter");
        C65503j jVar2 = jVar;
        C87412m.m108594g(jVar, "modifier");
        C108504h z = hVar.mo51623z(1959201981);
        String str2 = (i2 & 4) != 0 ? null : str;
        int i3 = C109836f.f328763a;
        C109836f fVar = C109836f.C109837a.f328764a;
        int i4 = C111294a.f333218a;
        C111897d1.m152617a(cVar, str2, jVar, C111294a.C111295a.f333222d, fVar, 0.0f, (C103274x) null, z, ((i >> 3) & 112) | 27656 | ((i << 3) & C22657f.CTRL_INDEX), 96);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107560a(cVar, jVar, str2, i, i2));
        }
    }

    /* renamed from: b */
    public static final void m145729b(C106969c cVar, float f, float f2, String str, C108504h hVar, int i, int i2) {
        C87412m.m108594g(cVar, "painter");
        C108504h z = hVar.mo51623z(-1010960939);
        if ((i2 & 8) != 0) {
            str = null;
        }
        int i3 = C65503j.f188489K0;
        m145728a(cVar, C103214y0.m136595k(C65503j.C65504a.f188490d, f, f2), str, z, ((i >> 3) & C22657f.CTRL_INDEX) | 8, 0);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107561b(cVar, f, f2, str, i, i2));
        }
    }
}
