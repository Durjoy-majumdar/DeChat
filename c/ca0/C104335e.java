package ca0;

import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p1166z0.C112540f;
import p152f0.C107353j0;
import p175j0.C108504h;
import p175j0.C33487v1;
import p175j0.C60690y0;
import p267x.C111885b;
import p415q0.C110261c;
import p435a0.C103141f;
import p435a0.C103214y0;
import p436a1.C103233f0;
import p436a1.C103266t0;
import p436a1.C103272w;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109899z;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p735w1.C37958a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import um0.C22657f;

/* renamed from: ca0.e */
public final class C104335e {

    /* renamed from: ca0.e$a */
    public static final class C104336a extends C87413o implements C32226l<C111703v, C13598b0> {

        /* renamed from: d */
        public static final C104336a f308851d = new C104336a();

        public C104336a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111703v) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.e$b */
    public static final class C104337b extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

        /* renamed from: d */
        public final /* synthetic */ boolean f308852d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<C28516i0> f308853e;

        /* renamed from: f */
        public final /* synthetic */ C32228q<C65503j, C108504h, Integer, C13598b0> f308854f;

        /* renamed from: g */
        public final /* synthetic */ C60690y0<Integer> f308855g;

        /* renamed from: h */
        public final /* synthetic */ long f308856h;

        /* renamed from: i */
        public final /* synthetic */ int f308857i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104337b(boolean z, C60690y0<C28516i0> y0Var, C32228q<? super C65503j, ? super C108504h, ? super Integer, C13598b0> qVar, C60690y0<Integer> y0Var2, long j, int i) {
            super(2);
            this.f308852d = z;
            this.f308853e = y0Var;
            this.f308854f = qVar;
            this.f308855g = y0Var2;
            this.f308856h = j;
            this.f308857i = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C109894x0 x0Var = (C109894x0) obj;
            long j = ((C108319b) obj2).f324343a;
            C104332c cVar = C104332c.SecondaryText;
            C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
            long a = C108319b.m146690a(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(C104332c.MainText, C110261c.m149879c(-1839527020, true, new C54685j(this.f308854f))))).mo161155K(a);
            C8479f0 f0Var2 = new C8479f0();
            C8479f0 f0Var3 = new C8479f0();
            if (!this.f308852d || ((C109854n0) f0Var.f27484d).f328779d > C108319b.m146697h(j)) {
                int h = (C108319b.m146697h(j) * 2) / 3;
                this.f308853e.setValue(new C28516i0(((C109854n0) f0Var.f27484d).f328779d + h, C108319b.m146697h(j)));
                int intValue = ((C109854n0) f0Var.f27484d).f328779d + this.f308855g.getValue().intValue() + h;
                if (C108319b.m146697h(j) - intValue > 0) {
                    f0Var3.f27484d = new C13604l(((C109893x) C110818d0.m150914L(x0Var.mo161192q0(cVar, C110261c.m149879c(-1548098074, true, new C54684g(this.f308854f))))).mo161155K(a), Integer.valueOf(intValue));
                }
                f0Var2.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(C104332c.EdgesGradient, C110261c.m149879c(1354852161, true, new C104346h(this.f308856h, this.f308857i))))).mo161155K(C108319b.m146690a(j, 0, 0, 0, ((C109854n0) f0Var.f27484d).f328780e, 7, (Object) null));
            } else {
                f0Var.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(cVar, C110261c.m149879c(549271310, true, new C54682f(this.f308854f))))).mo161155K(j);
                this.f308853e.setValue(null);
            }
            return C109827a0.C109828a.m149247b(x0Var, C108319b.m146697h(j), ((C109854n0) f0Var.f27484d).f328780e, (Map) null, new C104347i(f0Var, f0Var3, f0Var2, this.f308855g), 4, (Object) null);
        }
    }

    /* renamed from: ca0.e$c */
    public static final class C104338c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: A */
        public final /* synthetic */ int f308858A;

        /* renamed from: d */
        public final /* synthetic */ String f308859d;

        /* renamed from: e */
        public final /* synthetic */ boolean f308860e;

        /* renamed from: f */
        public final /* synthetic */ long f308861f;

        /* renamed from: g */
        public final /* synthetic */ C65503j f308862g;

        /* renamed from: h */
        public final /* synthetic */ boolean f308863h;

        /* renamed from: i */
        public final /* synthetic */ long f308864i;

        /* renamed from: j */
        public final /* synthetic */ long f308865j;

        /* renamed from: n */
        public final /* synthetic */ C104020o f308866n;

        /* renamed from: o */
        public final /* synthetic */ C104022q f308867o;

        /* renamed from: p */
        public final /* synthetic */ C104014i f308868p;

        /* renamed from: q */
        public final /* synthetic */ long f308869q;

        /* renamed from: r */
        public final /* synthetic */ C108014f f308870r;

        /* renamed from: s */
        public final /* synthetic */ int f308871s;

        /* renamed from: t */
        public final /* synthetic */ long f308872t;

        /* renamed from: u */
        public final /* synthetic */ int f308873u;

        /* renamed from: v */
        public final /* synthetic */ boolean f308874v;

        /* renamed from: w */
        public final /* synthetic */ C32226l<C111703v, C13598b0> f308875w;

        /* renamed from: x */
        public final /* synthetic */ C111705z f308876x;

        /* renamed from: y */
        public final /* synthetic */ int f308877y;

        /* renamed from: z */
        public final /* synthetic */ int f308878z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104338c(String str, boolean z, long j, C65503j jVar, boolean z2, long j2, long j3, C104020o oVar, C104022q qVar, C104014i iVar, long j4, C108014f fVar, int i, long j5, int i2, boolean z3, C32226l<? super C111703v, C13598b0> lVar, C111705z zVar, int i3, int i4, int i5) {
            super(2);
            this.f308859d = str;
            this.f308860e = z;
            this.f308861f = j;
            this.f308862g = jVar;
            this.f308863h = z2;
            this.f308864i = j2;
            this.f308865j = j3;
            this.f308866n = oVar;
            this.f308867o = qVar;
            this.f308868p = iVar;
            this.f308869q = j4;
            this.f308870r = fVar;
            this.f308871s = i;
            this.f308872t = j5;
            this.f308873u = i2;
            this.f308874v = z3;
            this.f308875w = lVar;
            this.f308876x = zVar;
            this.f308877y = i3;
            this.f308878z = i4;
            this.f308858A = i5;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            String str = this.f308859d;
            boolean z = this.f308860e;
            String str2 = str;
            boolean z2 = z;
            C104335e.m139318a(str2, z2, this.f308861f, this.f308862g, this.f308863h, this.f308864i, this.f308865j, this.f308866n, this.f308867o, this.f308868p, this.f308869q, this.f308870r, this.f308871s, this.f308872t, this.f308873u, this.f308874v, this.f308875w, this.f308876x, (C108504h) obj, this.f308877y | 1, this.f308878z, this.f308858A);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.e$d */
    public static final class C104339d extends C87413o implements C32226l<C111703v, C13598b0> {

        /* renamed from: d */
        public static final C104339d f308879d = new C104339d();

        public C104339d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111703v) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.e$e */
    public static final class C104340e extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

        /* renamed from: d */
        public final /* synthetic */ boolean f308880d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<C28516i0> f308881e;

        /* renamed from: f */
        public final /* synthetic */ boolean f308882f;

        /* renamed from: g */
        public final /* synthetic */ C32228q<C65503j, C108504h, Integer, C13598b0> f308883g;

        /* renamed from: h */
        public final /* synthetic */ C60690y0<Integer> f308884h;

        /* renamed from: i */
        public final /* synthetic */ long f308885i;

        /* renamed from: j */
        public final /* synthetic */ int f308886j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104340e(boolean z, C60690y0<C28516i0> y0Var, boolean z2, C32228q<? super C65503j, ? super C108504h, ? super Integer, C13598b0> qVar, C60690y0<Integer> y0Var2, long j, int i) {
            super(2);
            this.f308880d = z;
            this.f308881e = y0Var;
            this.f308882f = z2;
            this.f308883g = qVar;
            this.f308884h = y0Var2;
            this.f308885i = j;
            this.f308886j = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C109894x0 x0Var = (C109894x0) obj;
            long j = ((C108319b) obj2).f324343a;
            C104332c cVar = C104332c.SecondaryText;
            C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
            long a = C108319b.m146690a(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(C104332c.MainText, C110261c.m149879c(190276066, true, new C54692o(this.f308883g))))).mo161155K(a);
            C8479f0 f0Var2 = new C8479f0();
            C8479f0 f0Var3 = new C8479f0();
            if (!this.f308880d || ((C109854n0) f0Var.f27484d).f328779d > C108319b.m146697h(j)) {
                int h = (C108319b.m146697h(j) * 2) / 3;
                this.f308881e.setValue(new C28516i0(((C109854n0) f0Var.f27484d).f328779d + h, C108319b.m146697h(j)));
                int intValue = ((C109854n0) f0Var.f27484d).f328779d + this.f308884h.getValue().intValue() + h;
                if (C108319b.m146697h(j) - intValue > 0) {
                    f0Var3.f27484d = new C13604l(((C109893x) C110818d0.m150914L(x0Var.mo161192q0(cVar, C110261c.m149879c(1838416848, true, new C54691l(this.f308883g))))).mo161155K(a), Integer.valueOf(intValue));
                }
                if (this.f308882f) {
                    f0Var2.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(C104332c.EdgesGradient, C110261c.m149879c(-1032107069, true, new C104350m(this.f308885i, this.f308886j))))).mo161155K(C108319b.m146690a(j, 0, 0, 0, ((C109854n0) f0Var.f27484d).f328780e, 7, (Object) null));
                }
            } else {
                f0Var.f27484d = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(cVar, C110261c.m149879c(1278574504, true, new C54690k(this.f308883g))))).mo161155K(j);
                this.f308881e.setValue(null);
            }
            return C109827a0.C109828a.m149247b(x0Var, C108319b.m146697h(j), ((C109854n0) f0Var.f27484d).f328780e, (Map) null, new C104352n(f0Var, f0Var3, f0Var2, this.f308884h), 4, (Object) null);
        }
    }

    /* renamed from: ca0.e$f */
    public static final class C104341f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: A */
        public final /* synthetic */ int f308887A;

        /* renamed from: d */
        public final /* synthetic */ C37958a f308888d;

        /* renamed from: e */
        public final /* synthetic */ boolean f308889e;

        /* renamed from: f */
        public final /* synthetic */ long f308890f;

        /* renamed from: g */
        public final /* synthetic */ C65503j f308891g;

        /* renamed from: h */
        public final /* synthetic */ boolean f308892h;

        /* renamed from: i */
        public final /* synthetic */ long f308893i;

        /* renamed from: j */
        public final /* synthetic */ long f308894j;

        /* renamed from: n */
        public final /* synthetic */ C104020o f308895n;

        /* renamed from: o */
        public final /* synthetic */ C104022q f308896o;

        /* renamed from: p */
        public final /* synthetic */ C104014i f308897p;

        /* renamed from: q */
        public final /* synthetic */ long f308898q;

        /* renamed from: r */
        public final /* synthetic */ C108014f f308899r;

        /* renamed from: s */
        public final /* synthetic */ int f308900s;

        /* renamed from: t */
        public final /* synthetic */ long f308901t;

        /* renamed from: u */
        public final /* synthetic */ int f308902u;

        /* renamed from: v */
        public final /* synthetic */ boolean f308903v;

        /* renamed from: w */
        public final /* synthetic */ C32226l<C111703v, C13598b0> f308904w;

        /* renamed from: x */
        public final /* synthetic */ C111705z f308905x;

        /* renamed from: y */
        public final /* synthetic */ int f308906y;

        /* renamed from: z */
        public final /* synthetic */ int f308907z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104341f(C37958a aVar, boolean z, long j, C65503j jVar, boolean z2, long j2, long j3, C104020o oVar, C104022q qVar, C104014i iVar, long j4, C108014f fVar, int i, long j5, int i2, boolean z3, C32226l<? super C111703v, C13598b0> lVar, C111705z zVar, int i3, int i4, int i5) {
            super(2);
            this.f308888d = aVar;
            this.f308889e = z;
            this.f308890f = j;
            this.f308891g = jVar;
            this.f308892h = z2;
            this.f308893i = j2;
            this.f308894j = j3;
            this.f308895n = oVar;
            this.f308896o = qVar;
            this.f308897p = iVar;
            this.f308898q = j4;
            this.f308899r = fVar;
            this.f308900s = i;
            this.f308901t = j5;
            this.f308902u = i2;
            this.f308903v = z3;
            this.f308904w = lVar;
            this.f308905x = zVar;
            this.f308906y = i3;
            this.f308907z = i4;
            this.f308887A = i5;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C37958a aVar = this.f308888d;
            boolean z = this.f308889e;
            C37958a aVar2 = aVar;
            boolean z2 = z;
            C104335e.m139319b(aVar2, z2, this.f308890f, this.f308891g, this.f308892h, this.f308893i, this.f308894j, this.f308895n, this.f308896o, this.f308897p, this.f308898q, this.f308899r, this.f308900s, this.f308901t, this.f308902u, this.f308903v, this.f308904w, this.f308905x, (C108504h) obj, this.f308906y | 1, this.f308907z, this.f308887A);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.e$g */
    public static final class C104342g extends C87413o implements C32228q<C65503j, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f308908d;

        /* renamed from: e */
        public final /* synthetic */ long f308909e;

        /* renamed from: f */
        public final /* synthetic */ long f308910f;

        /* renamed from: g */
        public final /* synthetic */ C104020o f308911g;

        /* renamed from: h */
        public final /* synthetic */ C104022q f308912h;

        /* renamed from: i */
        public final /* synthetic */ C104014i f308913i;

        /* renamed from: j */
        public final /* synthetic */ long f308914j;

        /* renamed from: n */
        public final /* synthetic */ C108014f f308915n;

        /* renamed from: o */
        public final /* synthetic */ int f308916o;

        /* renamed from: p */
        public final /* synthetic */ long f308917p;

        /* renamed from: q */
        public final /* synthetic */ int f308918q;

        /* renamed from: r */
        public final /* synthetic */ boolean f308919r;

        /* renamed from: s */
        public final /* synthetic */ C32226l<C111703v, C13598b0> f308920s;

        /* renamed from: t */
        public final /* synthetic */ C111705z f308921t;

        /* renamed from: u */
        public final /* synthetic */ int f308922u;

        /* renamed from: v */
        public final /* synthetic */ int f308923v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104342g(String str, long j, long j2, C104020o oVar, C104022q qVar, C104014i iVar, long j3, C108014f fVar, int i, long j4, int i2, boolean z, C32226l<? super C111703v, C13598b0> lVar, C111705z zVar, int i3, int i4) {
            super(3);
            this.f308908d = str;
            this.f308909e = j;
            this.f308910f = j2;
            this.f308911g = oVar;
            this.f308912h = qVar;
            this.f308913i = iVar;
            this.f308914j = j3;
            this.f308915n = fVar;
            this.f308916o = i;
            this.f308917p = j4;
            this.f308918q = i2;
            this.f308919r = z;
            this.f308920s = lVar;
            this.f308921t = zVar;
            this.f308922u = i3;
            this.f308923v = i4;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C65503j jVar = (C65503j) obj;
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(jVar, "localModifier");
            if ((intValue & 14) == 0) {
                intValue |= hVar.mo51619x(jVar) ? 4 : 2;
            }
            int i = intValue;
            if ((i & 91) != 18 || !hVar.mo51575a()) {
                String str = this.f308908d;
                long j = this.f308909e;
                long j2 = this.f308910f;
                C104020o oVar = this.f308911g;
                C104022q qVar = this.f308912h;
                C104014i iVar = this.f308913i;
                long j3 = this.f308914j;
                C108014f fVar = this.f308915n;
                C108504h hVar2 = hVar;
                C32659e eVar = new C32659e(this.f308916o);
                long j4 = this.f308917p;
                C108504h hVar3 = hVar2;
                String str2 = str;
                int i2 = this.f308918q;
                boolean z = this.f308919r;
                C32226l<C111703v, C13598b0> lVar = this.f308920s;
                C111705z zVar = this.f308921t;
                int i3 = this.f308922u;
                int i4 = i3 >> 9;
                long j5 = j;
                int i5 = this.f308923v;
                int i6 = i5 << 21;
                int i7 = (i4 & 3670016) | (i3 & 14) | ((i << 3) & 112) | (i4 & C22657f.CTRL_INDEX) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192);
                int i8 = i5 >> 9;
                int i9 = i5 >> 6;
                C107944f0.m146242c(str2, jVar, j5, j2, oVar, qVar, iVar, j3, fVar, eVar, j4, i2, z, 1, lVar, zVar, hVar3, i7, (i8 & C22657f.CTRL_INDEX) | (i8 & 14) | LVBuffer.MAX_STRING_LENGTH | (i8 & 112) | (57344 & i9) | (i9 & 458752), 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.e$h */
    public static final class C104343h extends C87413o implements C32228q<C65503j, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C37958a f308924d;

        /* renamed from: e */
        public final /* synthetic */ long f308925e;

        /* renamed from: f */
        public final /* synthetic */ long f308926f;

        /* renamed from: g */
        public final /* synthetic */ C104020o f308927g;

        /* renamed from: h */
        public final /* synthetic */ C104022q f308928h;

        /* renamed from: i */
        public final /* synthetic */ C104014i f308929i;

        /* renamed from: j */
        public final /* synthetic */ long f308930j;

        /* renamed from: n */
        public final /* synthetic */ C108014f f308931n;

        /* renamed from: o */
        public final /* synthetic */ int f308932o;

        /* renamed from: p */
        public final /* synthetic */ long f308933p;

        /* renamed from: q */
        public final /* synthetic */ int f308934q;

        /* renamed from: r */
        public final /* synthetic */ boolean f308935r;

        /* renamed from: s */
        public final /* synthetic */ C32226l<C111703v, C13598b0> f308936s;

        /* renamed from: t */
        public final /* synthetic */ C111705z f308937t;

        /* renamed from: u */
        public final /* synthetic */ int f308938u;

        /* renamed from: v */
        public final /* synthetic */ int f308939v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104343h(C37958a aVar, long j, long j2, C104020o oVar, C104022q qVar, C104014i iVar, long j3, C108014f fVar, int i, long j4, int i2, boolean z, C32226l<? super C111703v, C13598b0> lVar, C111705z zVar, int i3, int i4) {
            super(3);
            this.f308924d = aVar;
            this.f308925e = j;
            this.f308926f = j2;
            this.f308927g = oVar;
            this.f308928h = qVar;
            this.f308929i = iVar;
            this.f308930j = j3;
            this.f308931n = fVar;
            this.f308932o = i;
            this.f308933p = j4;
            this.f308934q = i2;
            this.f308935r = z;
            this.f308936s = lVar;
            this.f308937t = zVar;
            this.f308938u = i3;
            this.f308939v = i4;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C65503j jVar = (C65503j) obj;
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(jVar, "localModifier");
            if ((intValue & 14) == 0) {
                intValue |= hVar.mo51619x(jVar) ? 4 : 2;
            }
            int i = intValue;
            if ((i & 91) != 18 || !hVar.mo51575a()) {
                C37958a aVar = this.f308924d;
                long j = this.f308925e;
                long j2 = this.f308926f;
                C104020o oVar = this.f308927g;
                C104022q qVar = this.f308928h;
                C104014i iVar = this.f308929i;
                long j3 = this.f308930j;
                C108014f fVar = this.f308931n;
                C108504h hVar2 = hVar;
                C32659e eVar = new C32659e(this.f308932o);
                long j4 = this.f308933p;
                C108504h hVar3 = hVar2;
                C37958a aVar2 = aVar;
                int i2 = this.f308934q;
                boolean z = this.f308935r;
                C32226l<C111703v, C13598b0> lVar = this.f308936s;
                C111705z zVar = this.f308937t;
                int i3 = this.f308938u;
                int i4 = i3 >> 9;
                long j5 = j;
                int i5 = this.f308939v;
                int i6 = i5 << 21;
                int i7 = (i4 & 3670016) | (i3 & 14) | ((i << 3) & 112) | (i4 & C22657f.CTRL_INDEX) | (i4 & 7168) | (57344 & i4) | (i4 & 458752) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192);
                int i8 = i5 >> 9;
                int i9 = i5 >> 3;
                C107944f0.m146241b(aVar2, jVar, j5, j2, oVar, qVar, iVar, j3, fVar, eVar, j4, i2, z, 1, (Map<String, C107353j0>) null, lVar, zVar, hVar3, i7, (i8 & C22657f.CTRL_INDEX) | (i8 & 14) | LVBuffer.MAX_STRING_LENGTH | (i8 & 112) | (458752 & i9) | (i9 & 3670016), 16384);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: ca0.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: ca0.e$b} */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0402, code lost:
        if (r9 == p175j0.C108504h.C60656a.f172772a) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x043a, code lost:
        if (r10 == p175j0.C108504h.C60656a.f172772a) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04ed, code lost:
        if (r6 == p175j0.C108504h.C60656a.f172772a) goto L_0x04ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04d9 A[LOOP:0: B:276:0x04d7->B:277:0x04d9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0131  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139318a(java.lang.String r47, boolean r48, long r49, p721v0.C65503j r51, boolean r52, long r53, long r55, p451b2.C104020o r57, p451b2.C104022q r58, p451b2.C104014i r59, long r60, p544h2.C108014f r62, int r63, long r64, int r66, boolean r67, fy3.C32226l<? super p735w1.C111703v, rx3.C13598b0> r68, p735w1.C111705z r69, p175j0.C108504h r70, int r71, int r72, int r73) {
        /*
            r15 = r47
            r13 = r48
            r11 = r49
            r14 = r71
            r9 = r72
            r10 = r73
            java.lang.String r0 = "text"
            gy3.C87412m.m108594g(r15, r0)
            r0 = -684166474(0xffffffffd73872b6, float:-2.02802819E14)
            r1 = r70
            j0.h r8 = r1.mo51623z(r0)
            r0 = r10 & 1
            r21 = 4
            if (r0 == 0) goto L_0x0023
            r0 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r0 = r14 & 14
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.mo51619x(r15)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x0030
        L_0x002f:
            r0 = 2
        L_0x0030:
            r0 = r0 | r14
            goto L_0x0033
        L_0x0032:
            r0 = r14
        L_0x0033:
            r1 = r10 & 2
            if (r1 == 0) goto L_0x003a
            r0 = r0 | 48
            goto L_0x004a
        L_0x003a:
            r1 = r14 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004a
            boolean r1 = r8.mo51586g(r13)
            if (r1 == 0) goto L_0x0047
            r1 = 32
            goto L_0x0049
        L_0x0047:
            r1 = 16
        L_0x0049:
            r0 = r0 | r1
        L_0x004a:
            r1 = r10 & 4
            if (r1 == 0) goto L_0x0051
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0061
            boolean r1 = r8.mo51594k(r11)
            if (r1 == 0) goto L_0x005e
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r0 = r0 | r1
        L_0x0061:
            r1 = r10 & 8
            r16 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006a:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007e
            r2 = r51
            boolean r17 = r8.mo51619x(r2)
            if (r17 == 0) goto L_0x0079
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r17
            goto L_0x0080
        L_0x007e:
            r2 = r51
        L_0x0080:
            r17 = r10 & 16
            r18 = 16384(0x4000, float:2.2959E-41)
            r19 = 8192(0x2000, float:1.14794E-41)
            if (r17 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r3 = r52
            goto L_0x00a3
        L_0x008d:
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r14 & r20
            r3 = r52
            if (r20 != 0) goto L_0x00a3
            boolean r22 = r8.mo51586g(r3)
            if (r22 == 0) goto L_0x009f
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r22
        L_0x00a3:
            r22 = r10 & 32
            r23 = 65536(0x10000, float:9.18355E-41)
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00b2
            r25 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r25
            r4 = r53
            goto L_0x00c7
        L_0x00b2:
            r25 = 458752(0x70000, float:6.42848E-40)
            r25 = r14 & r25
            r4 = r53
            if (r25 != 0) goto L_0x00c7
            boolean r27 = r8.mo51594k(r4)
            if (r27 == 0) goto L_0x00c3
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r0 = r0 | r27
        L_0x00c7:
            r27 = r10 & 64
            if (r27 == 0) goto L_0x00d2
            r28 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r28
            r6 = r55
            goto L_0x00e7
        L_0x00d2:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r14 & r28
            r6 = r55
            if (r28 != 0) goto L_0x00e7
            boolean r30 = r8.mo51594k(r6)
            if (r30 == 0) goto L_0x00e3
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r0 = r0 | r30
        L_0x00e7:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00f2
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r30
            r3 = r57
            goto L_0x0107
        L_0x00f2:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r14 & r30
            r3 = r57
            if (r30 != 0) goto L_0x0107
            boolean r30 = r8.mo51619x(r3)
            if (r30 == 0) goto L_0x0103
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r0 = r0 | r30
        L_0x0107:
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0112
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r30
            r4 = r58
            goto L_0x0126
        L_0x0112:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r14 & r30
            r4 = r58
            if (r30 != 0) goto L_0x0126
            boolean r5 = r8.mo51619x(r4)
            if (r5 == 0) goto L_0x0123
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r0 = r0 | r5
        L_0x0126:
            r5 = r10 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0131
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r30
            r4 = r59
            goto L_0x0146
        L_0x0131:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r14 & r30
            r4 = r59
            if (r30 != 0) goto L_0x0146
            boolean r30 = r8.mo51619x(r4)
            if (r30 == 0) goto L_0x0142
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r0 = r0 | r30
        L_0x0146:
            r30 = r0
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0151
            r31 = r9 | 6
            r6 = r60
            goto L_0x0167
        L_0x0151:
            r31 = r9 & 14
            r6 = r60
            if (r31 != 0) goto L_0x0165
            boolean r31 = r8.mo51594k(r6)
            if (r31 == 0) goto L_0x0160
            r31 = 4
            goto L_0x0162
        L_0x0160:
            r31 = 2
        L_0x0162:
            r31 = r9 | r31
            goto L_0x0167
        L_0x0165:
            r31 = r9
        L_0x0167:
            r4 = r10 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0170
            r31 = r31 | 48
            r6 = r62
            goto L_0x0183
        L_0x0170:
            r32 = r9 & 112(0x70, float:1.57E-43)
            r6 = r62
            if (r32 != 0) goto L_0x0183
            boolean r7 = r8.mo51619x(r6)
            if (r7 == 0) goto L_0x017f
            r20 = 32
            goto L_0x0181
        L_0x017f:
            r20 = 16
        L_0x0181:
            r31 = r31 | r20
        L_0x0183:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x019d
            r7 = r10 & 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L_0x0196
            r7 = r63
            boolean r20 = r8.mo51592j(r7)
            if (r20 == 0) goto L_0x0198
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x019a
        L_0x0196:
            r7 = r63
        L_0x0198:
            r25 = 128(0x80, float:1.794E-43)
        L_0x019a:
            r31 = r31 | r25
            goto L_0x019f
        L_0x019d:
            r7 = r63
        L_0x019f:
            r6 = r31
            r7 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01a8
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bc
        L_0x01a8:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01bc
            r11 = r64
            boolean r20 = r8.mo51594k(r11)
            if (r20 == 0) goto L_0x01b7
            r29 = 2048(0x800, float:2.87E-42)
            goto L_0x01b9
        L_0x01b7:
            r29 = 1024(0x400, float:1.435E-42)
        L_0x01b9:
            r6 = r6 | r29
            goto L_0x01be
        L_0x01bc:
            r11 = r64
        L_0x01be:
            r11 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c5
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d9
        L_0x01c5:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x01d9
            r12 = r66
            boolean r16 = r8.mo51592j(r12)
            if (r16 == 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01d6:
            r6 = r6 | r18
            goto L_0x01db
        L_0x01d9:
            r12 = r66
        L_0x01db:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r10 & r16
            if (r16 == 0) goto L_0x01e9
            r18 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r18
            r12 = r67
            goto L_0x01fe
        L_0x01e9:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r9 & r18
            r12 = r67
            if (r18 != 0) goto L_0x01fe
            boolean r18 = r8.mo51586g(r12)
            if (r18 == 0) goto L_0x01fa
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fc
        L_0x01fa:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01fc:
            r6 = r6 | r18
        L_0x01fe:
            r18 = r10 & r23
            if (r18 == 0) goto L_0x0209
            r19 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r19
            r12 = r68
            goto L_0x021e
        L_0x0209:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r9 & r19
            r12 = r68
            if (r19 != 0) goto L_0x021e
            boolean r19 = r8.mo51619x(r12)
            if (r19 == 0) goto L_0x021a
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021c
        L_0x021a:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x021c:
            r6 = r6 | r19
        L_0x021e:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x0238
            r19 = r10 & r24
            r9 = r69
            if (r19 != 0) goto L_0x0233
            boolean r19 = r8.mo51619x(r9)
            if (r19 == 0) goto L_0x0233
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0235
        L_0x0233:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0235:
            r6 = r6 | r19
            goto L_0x023a
        L_0x0238:
            r9 = r69
        L_0x023a:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r30 & r19
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x027b
            r9 = 23967451(0x16db6db, float:4.3661218E-38)
            r9 = r9 & r6
            r12 = 4793490(0x492492, float:6.71711E-39)
            if (r9 != r12) goto L_0x027b
            boolean r9 = r8.mo51575a()
            if (r9 != 0) goto L_0x0254
            goto L_0x027b
        L_0x0254:
            r8.mo51581d()
            r11 = r49
            r5 = r51
            r6 = r52
            r9 = r55
            r29 = r57
            r31 = r58
            r13 = r59
            r16 = r62
            r17 = r63
            r18 = r64
            r20 = r66
            r21 = r67
            r22 = r68
            r23 = r69
            r0 = r8
            r4 = r15
            r7 = r53
            r14 = r60
            goto L_0x0527
        L_0x027b:
            r8.mo51559J()
            r9 = r14 & 1
            r15 = 0
            if (r9 == 0) goto L_0x02df
            boolean r9 = r8.mo51582e()
            if (r9 == 0) goto L_0x028a
            goto L_0x02df
        L_0x028a:
            r8.mo51581d()
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0293
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0293:
            r0 = r10 & r24
            if (r0 == 0) goto L_0x02bd
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r6
            r22 = r51
            r23 = r52
            r24 = r53
            r26 = r55
            r29 = r57
            r31 = r58
            r32 = r59
            r33 = r60
            r35 = r62
            r36 = r63
            r37 = r64
            r39 = r66
            r40 = r67
            r41 = r68
            r42 = r69
            r20 = r0
            goto L_0x0385
        L_0x02bd:
            r22 = r51
            r23 = r52
            r24 = r53
            r26 = r55
            r29 = r57
            r31 = r58
            r32 = r59
            r33 = r60
            r35 = r62
            r36 = r63
            r37 = r64
            r39 = r66
            r40 = r67
            r41 = r68
            r42 = r69
            r20 = r6
            goto L_0x0385
        L_0x02df:
            if (r1 == 0) goto L_0x02e6
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x02e8
        L_0x02e6:
            r1 = r51
        L_0x02e8:
            if (r17 == 0) goto L_0x02ec
            r9 = 0
            goto L_0x02ee
        L_0x02ec:
            r9 = r52
        L_0x02ee:
            if (r22 == 0) goto L_0x02f5
            int r17 = p436a1.C103272w.f304516h
            long r19 = p436a1.C103272w.f304515g
            goto L_0x02f7
        L_0x02f5:
            r19 = r53
        L_0x02f7:
            if (r27 == 0) goto L_0x02fe
            i2.r[] r17 = p560i2.C33184p.f90061b
            long r22 = p560i2.C33184p.f90062c
            goto L_0x0300
        L_0x02fe:
            r22 = r55
        L_0x0300:
            if (r2 == 0) goto L_0x0304
            r2 = 0
            goto L_0x0306
        L_0x0304:
            r2 = r57
        L_0x0306:
            if (r3 == 0) goto L_0x030a
            r3 = 0
            goto L_0x030c
        L_0x030a:
            r3 = r58
        L_0x030c:
            if (r5 == 0) goto L_0x0310
            r5 = 0
            goto L_0x0312
        L_0x0310:
            r5 = r59
        L_0x0312:
            if (r0 == 0) goto L_0x0319
            i2.r[] r0 = p560i2.C33184p.f90061b
            long r25 = p560i2.C33184p.f90062c
            goto L_0x031b
        L_0x0319:
            r25 = r60
        L_0x031b:
            if (r4 == 0) goto L_0x031f
            r0 = 0
            goto L_0x0321
        L_0x031f:
            r0 = r62
        L_0x0321:
            r4 = r10 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0329
            r4 = 3
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x032b
        L_0x0329:
            r4 = r63
        L_0x032b:
            if (r7 == 0) goto L_0x0332
            i2.r[] r7 = p560i2.C33184p.f90061b
            long r31 = p560i2.C33184p.f90062c
            goto L_0x0334
        L_0x0332:
            r31 = r64
        L_0x0334:
            if (r11 == 0) goto L_0x0338
            r7 = 1
            goto L_0x033a
        L_0x0338:
            r7 = r66
        L_0x033a:
            if (r16 == 0) goto L_0x033e
            r11 = 1
            goto L_0x0340
        L_0x033e:
            r11 = r67
        L_0x0340:
            if (r18 == 0) goto L_0x0345
            ca0.e$a r16 = ca0.C104335e.C104336a.f308851d
            goto L_0x0347
        L_0x0345:
            r16 = r68
        L_0x0347:
            r17 = r10 & r24
            if (r17 == 0) goto L_0x0365
            j0.f1<w1.z> r12 = p543h0.C107944f0.f323233a
            java.lang.Object r12 = r8.mo51598m(r12)
            w1.z r12 = (p735w1.C111705z) r12
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r18
            r35 = r0
            r29 = r2
            r36 = r4
            r39 = r7
            r40 = r11
            r42 = r12
            goto L_0x0371
        L_0x0365:
            r42 = r69
            r35 = r0
            r29 = r2
            r36 = r4
            r39 = r7
            r40 = r11
        L_0x0371:
            r41 = r16
            r33 = r25
            r37 = r31
            r31 = r3
            r32 = r5
            r24 = r19
            r26 = r22
            r22 = r1
            r20 = r6
            r23 = r9
        L_0x0385:
            r8.mo51555G()
            r12 = 874084476(0x3419787c, float:1.4293067E-7)
            ca0.e$g r11 = new ca0.e$g
            r0 = r11
            r1 = r47
            r2 = r24
            r4 = r26
            r6 = r29
            r9 = 2
            r7 = r31
            r43 = r8
            r8 = r32
            r9 = r33
            r44 = r11
            r11 = r35
            r12 = r36
            r13 = r37
            r59 = 0
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r30
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r0 = r43
            r2 = r44
            r1 = 874084476(0x3419787c, float:1.4293067E-7)
            r3 = 1
            q0.a r1 = p415q0.C110261c.m149878b(r0, r1, r3, r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r2)
            r4 = r47
            boolean r5 = r0.mo51619x(r4)
            java.lang.Object r6 = r0.mo51606q()
            if (r5 != 0) goto L_0x03df
            int r5 = p175j0.C108504h.f324828a
            java.lang.Object r5 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r5) goto L_0x03db
            goto L_0x03df
        L_0x03db:
            r5 = r6
            r6 = 2
            r7 = 0
            goto L_0x03ec
        L_0x03df:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r59)
            r6 = 2
            r7 = 0
            j0.y0 r5 = p175j0.C108500f2.m146996c(r5, r7, r6, r7)
            r0.mo51553F(r5)
        L_0x03ec:
            r0.mo51565P()
            j0.y0 r5 = (p175j0.C60690y0) r5
            r0.mo51557H(r2)
            boolean r8 = r0.mo51619x(r4)
            java.lang.Object r9 = r0.mo51606q()
            if (r8 != 0) goto L_0x0404
            int r8 = p175j0.C108504h.f324828a
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r8) goto L_0x040b
        L_0x0404:
            j0.y0 r9 = p175j0.C108500f2.m146996c(r7, r7, r6, r7)
            r0.mo51553F(r9)
        L_0x040b:
            r0.mo51565P()
            r8 = r9
            j0.y0 r8 = (p175j0.C60690y0) r8
            java.lang.Object r9 = r8.getValue()
            ca0.i0 r9 = (ca0.C28516i0) r9
            r10 = -1907421125(0xffffffff8e4f103b, float:-2.5522535E-30)
            r0.mo51557H(r10)
            if (r48 == 0) goto L_0x04ae
            if (r9 == 0) goto L_0x04ae
            int r10 = r9.f78344a
            int r11 = r9.f78345b
            if (r10 < r11) goto L_0x04ae
            if (r11 == 0) goto L_0x04ae
            r0.mo51557H(r2)
            boolean r2 = r0.mo51619x(r9)
            java.lang.Object r10 = r0.mo51606q()
            if (r2 != 0) goto L_0x043c
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r2) goto L_0x044a
        L_0x043c:
            int r2 = r9.f78344a
            int r2 = r2 * 7500
            int r10 = r9.f78345b
            int r2 = r2 / r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r0.mo51553F(r10)
        L_0x044a:
            r0.mo51565P()
            java.lang.Number r10 = (java.lang.Number) r10
            int r2 = r10.intValue()
            r10 = 0
            w.i0 r11 = p257w.C111648j0.m152176b(r0, r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            int r9 = r9.f78344a
            int r9 = -r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            w.k1<java.lang.Float, w.l> r13 = p257w.C111656m1.f334256a
            w.k1<java.lang.Integer, w.l> r13 = p257w.C111656m1.f334257b
            w.z r14 = p257w.C37890a0.f100293a
            w.a0$a r14 = p257w.C37890a0.C37891a.f100294a
            w.j1 r2 = p257w.C37903i.m41595c(r2, r10, r14, r6, r7)
            w.q0 r7 = p257w.C37924q0.Restart
            r14 = 0
            r16 = 4
            r17 = 0
            r51 = r2
            r52 = r7
            r53 = r14
            r55 = r16
            r56 = r17
            w.h0 r2 = p257w.C37903i.m41593a(r51, r52, r53, r55, r56)
            r7 = 36920(0x9038, float:5.1736E-41)
            r51 = r11
            r52 = r12
            r53 = r9
            r54 = r13
            r55 = r2
            r56 = r0
            r57 = r7
            j0.k2 r2 = p257w.C111648j0.m152175a(r51, r52, r53, r54, r55, r56, r57)
            w.i0$a r2 = (p257w.C65915i0.C65920a) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.setValue(r2)
            goto L_0x04af
        L_0x04ae:
            r10 = 0
        L_0x04af:
            r0.mo51565P()
            v0.j r2 = p868x0.C111979d.m152691b(r22)
            r7 = 5
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r10] = r1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r9[r3] = r11
            r9[r6] = r8
            r3 = 3
            r9[r3] = r5
            a1.w r3 = new a1.w
            r11 = r49
            r3.<init>(r11)
            r9[r21] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo51557H(r3)
            r3 = 0
            r15 = 0
        L_0x04d7:
            if (r15 >= r7) goto L_0x04e3
            r6 = r9[r15]
            boolean r6 = r0.mo51619x(r6)
            r3 = r3 | r6
            int r15 = r15 + 1
            goto L_0x04d7
        L_0x04e3:
            java.lang.Object r6 = r0.mo51606q()
            if (r3 != 0) goto L_0x04ef
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r3) goto L_0x0505
        L_0x04ef:
            ca0.e$b r6 = new ca0.e$b
            r51 = r6
            r52 = r23
            r53 = r8
            r54 = r1
            r55 = r5
            r56 = r49
            r58 = r30
            r51.<init>(r52, r53, r54, r55, r56, r58)
            r0.mo51553F(r6)
        L_0x0505:
            r0.mo51565P()
            fy3.p r6 = (fy3.C32227p) r6
            p631o1.C109880u0.m149371b(r2, r6, r0, r10, r10)
            r5 = r22
            r6 = r23
            r7 = r24
            r9 = r26
            r13 = r32
            r14 = r33
            r16 = r35
            r17 = r36
            r18 = r37
            r20 = r39
            r21 = r40
            r22 = r41
            r23 = r42
        L_0x0527:
            j0.v1 r3 = r0.mo51596l()
            if (r3 != 0) goto L_0x052e
            goto L_0x0550
        L_0x052e:
            ca0.e$c r2 = new ca0.e$c
            r0 = r2
            r1 = r47
            r4 = r2
            r2 = r48
            r45 = r3
            r46 = r4
            r3 = r49
            r11 = r29
            r12 = r31
            r24 = r71
            r25 = r72
            r26 = r73
            r0.<init>(r1, r2, r3, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            r0 = r45
            r1 = r46
            r0.mo51650a(r1)
        L_0x0550:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104335e.m139318a(java.lang.String, boolean, long, v0.j, boolean, long, long, b2.o, b2.q, b2.i, long, h2.f, int, long, int, boolean, fy3.l, w1.z, j0.h, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: ca0.e$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: ca0.e$e} */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0402, code lost:
        if (r9 == p175j0.C108504h.C60656a.f172772a) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x043a, code lost:
        if (r10 == p175j0.C108504h.C60656a.f172772a) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04f4, code lost:
        if (r6 == p175j0.C108504h.C60656a.f172772a) goto L_0x04f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04e0 A[LOOP:0: B:276:0x04de->B:277:0x04e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0131  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139319b(p735w1.C37958a r47, boolean r48, long r49, p721v0.C65503j r51, boolean r52, long r53, long r55, p451b2.C104020o r57, p451b2.C104022q r58, p451b2.C104014i r59, long r60, p544h2.C108014f r62, int r63, long r64, int r66, boolean r67, fy3.C32226l<? super p735w1.C111703v, rx3.C13598b0> r68, p735w1.C111705z r69, p175j0.C108504h r70, int r71, int r72, int r73) {
        /*
            r15 = r47
            r13 = r48
            r11 = r49
            r14 = r71
            r9 = r72
            r10 = r73
            java.lang.String r0 = "text"
            gy3.C87412m.m108594g(r15, r0)
            r0 = -312549120(0xffffffffed5ee100, float:-4.311105E27)
            r1 = r70
            j0.h r8 = r1.mo51623z(r0)
            r0 = r10 & 1
            r21 = 4
            if (r0 == 0) goto L_0x0023
            r0 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r0 = r14 & 14
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.mo51619x(r15)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x0030
        L_0x002f:
            r0 = 2
        L_0x0030:
            r0 = r0 | r14
            goto L_0x0033
        L_0x0032:
            r0 = r14
        L_0x0033:
            r1 = r10 & 2
            if (r1 == 0) goto L_0x003a
            r0 = r0 | 48
            goto L_0x004a
        L_0x003a:
            r1 = r14 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004a
            boolean r1 = r8.mo51586g(r13)
            if (r1 == 0) goto L_0x0047
            r1 = 32
            goto L_0x0049
        L_0x0047:
            r1 = 16
        L_0x0049:
            r0 = r0 | r1
        L_0x004a:
            r1 = r10 & 4
            if (r1 == 0) goto L_0x0051
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0061
            boolean r1 = r8.mo51594k(r11)
            if (r1 == 0) goto L_0x005e
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r0 = r0 | r1
        L_0x0061:
            r1 = r10 & 8
            r16 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006a:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007e
            r2 = r51
            boolean r17 = r8.mo51619x(r2)
            if (r17 == 0) goto L_0x0079
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r17
            goto L_0x0080
        L_0x007e:
            r2 = r51
        L_0x0080:
            r17 = r10 & 16
            r18 = 16384(0x4000, float:2.2959E-41)
            r19 = 8192(0x2000, float:1.14794E-41)
            if (r17 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r3 = r52
            goto L_0x00a3
        L_0x008d:
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r14 & r20
            r3 = r52
            if (r20 != 0) goto L_0x00a3
            boolean r22 = r8.mo51586g(r3)
            if (r22 == 0) goto L_0x009f
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r22
        L_0x00a3:
            r22 = r10 & 32
            r23 = 65536(0x10000, float:9.18355E-41)
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00b2
            r25 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r25
            r4 = r53
            goto L_0x00c7
        L_0x00b2:
            r25 = 458752(0x70000, float:6.42848E-40)
            r25 = r14 & r25
            r4 = r53
            if (r25 != 0) goto L_0x00c7
            boolean r27 = r8.mo51594k(r4)
            if (r27 == 0) goto L_0x00c3
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r0 = r0 | r27
        L_0x00c7:
            r27 = r10 & 64
            if (r27 == 0) goto L_0x00d2
            r28 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r28
            r6 = r55
            goto L_0x00e7
        L_0x00d2:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r14 & r28
            r6 = r55
            if (r28 != 0) goto L_0x00e7
            boolean r30 = r8.mo51594k(r6)
            if (r30 == 0) goto L_0x00e3
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r0 = r0 | r30
        L_0x00e7:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00f2
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r30
            r3 = r57
            goto L_0x0107
        L_0x00f2:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r14 & r30
            r3 = r57
            if (r30 != 0) goto L_0x0107
            boolean r30 = r8.mo51619x(r3)
            if (r30 == 0) goto L_0x0103
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r0 = r0 | r30
        L_0x0107:
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0112
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r30
            r4 = r58
            goto L_0x0126
        L_0x0112:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r14 & r30
            r4 = r58
            if (r30 != 0) goto L_0x0126
            boolean r5 = r8.mo51619x(r4)
            if (r5 == 0) goto L_0x0123
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r0 = r0 | r5
        L_0x0126:
            r5 = r10 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0131
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r30
            r4 = r59
            goto L_0x0146
        L_0x0131:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r14 & r30
            r4 = r59
            if (r30 != 0) goto L_0x0146
            boolean r30 = r8.mo51619x(r4)
            if (r30 == 0) goto L_0x0142
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r0 = r0 | r30
        L_0x0146:
            r30 = r0
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0151
            r31 = r9 | 6
            r6 = r60
            goto L_0x0167
        L_0x0151:
            r31 = r9 & 14
            r6 = r60
            if (r31 != 0) goto L_0x0165
            boolean r31 = r8.mo51594k(r6)
            if (r31 == 0) goto L_0x0160
            r31 = 4
            goto L_0x0162
        L_0x0160:
            r31 = 2
        L_0x0162:
            r31 = r9 | r31
            goto L_0x0167
        L_0x0165:
            r31 = r9
        L_0x0167:
            r4 = r10 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0170
            r31 = r31 | 48
            r6 = r62
            goto L_0x0183
        L_0x0170:
            r32 = r9 & 112(0x70, float:1.57E-43)
            r6 = r62
            if (r32 != 0) goto L_0x0183
            boolean r7 = r8.mo51619x(r6)
            if (r7 == 0) goto L_0x017f
            r20 = 32
            goto L_0x0181
        L_0x017f:
            r20 = 16
        L_0x0181:
            r31 = r31 | r20
        L_0x0183:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x019d
            r7 = r10 & 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L_0x0196
            r7 = r63
            boolean r20 = r8.mo51592j(r7)
            if (r20 == 0) goto L_0x0198
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x019a
        L_0x0196:
            r7 = r63
        L_0x0198:
            r25 = 128(0x80, float:1.794E-43)
        L_0x019a:
            r31 = r31 | r25
            goto L_0x019f
        L_0x019d:
            r7 = r63
        L_0x019f:
            r6 = r31
            r7 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01a8
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bc
        L_0x01a8:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01bc
            r11 = r64
            boolean r20 = r8.mo51594k(r11)
            if (r20 == 0) goto L_0x01b7
            r29 = 2048(0x800, float:2.87E-42)
            goto L_0x01b9
        L_0x01b7:
            r29 = 1024(0x400, float:1.435E-42)
        L_0x01b9:
            r6 = r6 | r29
            goto L_0x01be
        L_0x01bc:
            r11 = r64
        L_0x01be:
            r11 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c5
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d9
        L_0x01c5:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x01d9
            r12 = r66
            boolean r16 = r8.mo51592j(r12)
            if (r16 == 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01d6:
            r6 = r6 | r18
            goto L_0x01db
        L_0x01d9:
            r12 = r66
        L_0x01db:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r10 & r16
            if (r16 == 0) goto L_0x01e9
            r18 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r18
            r12 = r67
            goto L_0x01fe
        L_0x01e9:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r9 & r18
            r12 = r67
            if (r18 != 0) goto L_0x01fe
            boolean r18 = r8.mo51586g(r12)
            if (r18 == 0) goto L_0x01fa
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fc
        L_0x01fa:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01fc:
            r6 = r6 | r18
        L_0x01fe:
            r18 = r10 & r23
            if (r18 == 0) goto L_0x0209
            r19 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r19
            r12 = r68
            goto L_0x021e
        L_0x0209:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r9 & r19
            r12 = r68
            if (r19 != 0) goto L_0x021e
            boolean r19 = r8.mo51619x(r12)
            if (r19 == 0) goto L_0x021a
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021c
        L_0x021a:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x021c:
            r6 = r6 | r19
        L_0x021e:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x0238
            r19 = r10 & r24
            r9 = r69
            if (r19 != 0) goto L_0x0233
            boolean r19 = r8.mo51619x(r9)
            if (r19 == 0) goto L_0x0233
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0235
        L_0x0233:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0235:
            r6 = r6 | r19
            goto L_0x023a
        L_0x0238:
            r9 = r69
        L_0x023a:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r30 & r19
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x027b
            r9 = 23967451(0x16db6db, float:4.3661218E-38)
            r9 = r9 & r6
            r12 = 4793490(0x492492, float:6.71711E-39)
            if (r9 != r12) goto L_0x027b
            boolean r9 = r8.mo51575a()
            if (r9 != 0) goto L_0x0254
            goto L_0x027b
        L_0x0254:
            r8.mo51581d()
            r11 = r49
            r5 = r51
            r6 = r52
            r9 = r55
            r29 = r57
            r31 = r58
            r13 = r59
            r16 = r62
            r17 = r63
            r18 = r64
            r20 = r66
            r21 = r67
            r22 = r68
            r23 = r69
            r0 = r8
            r4 = r15
            r7 = r53
            r14 = r60
            goto L_0x0530
        L_0x027b:
            r8.mo51559J()
            r9 = r14 & 1
            r15 = 0
            if (r9 == 0) goto L_0x02df
            boolean r9 = r8.mo51582e()
            if (r9 == 0) goto L_0x028a
            goto L_0x02df
        L_0x028a:
            r8.mo51581d()
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0293
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0293:
            r0 = r10 & r24
            if (r0 == 0) goto L_0x02bd
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r6
            r22 = r51
            r23 = r52
            r24 = r53
            r26 = r55
            r29 = r57
            r31 = r58
            r32 = r59
            r33 = r60
            r35 = r62
            r36 = r63
            r37 = r64
            r39 = r66
            r40 = r67
            r41 = r68
            r42 = r69
            r20 = r0
            goto L_0x0385
        L_0x02bd:
            r22 = r51
            r23 = r52
            r24 = r53
            r26 = r55
            r29 = r57
            r31 = r58
            r32 = r59
            r33 = r60
            r35 = r62
            r36 = r63
            r37 = r64
            r39 = r66
            r40 = r67
            r41 = r68
            r42 = r69
            r20 = r6
            goto L_0x0385
        L_0x02df:
            if (r1 == 0) goto L_0x02e6
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x02e8
        L_0x02e6:
            r1 = r51
        L_0x02e8:
            if (r17 == 0) goto L_0x02ec
            r9 = 0
            goto L_0x02ee
        L_0x02ec:
            r9 = r52
        L_0x02ee:
            if (r22 == 0) goto L_0x02f5
            int r17 = p436a1.C103272w.f304516h
            long r19 = p436a1.C103272w.f304515g
            goto L_0x02f7
        L_0x02f5:
            r19 = r53
        L_0x02f7:
            if (r27 == 0) goto L_0x02fe
            i2.r[] r17 = p560i2.C33184p.f90061b
            long r22 = p560i2.C33184p.f90062c
            goto L_0x0300
        L_0x02fe:
            r22 = r55
        L_0x0300:
            if (r2 == 0) goto L_0x0304
            r2 = 0
            goto L_0x0306
        L_0x0304:
            r2 = r57
        L_0x0306:
            if (r3 == 0) goto L_0x030a
            r3 = 0
            goto L_0x030c
        L_0x030a:
            r3 = r58
        L_0x030c:
            if (r5 == 0) goto L_0x0310
            r5 = 0
            goto L_0x0312
        L_0x0310:
            r5 = r59
        L_0x0312:
            if (r0 == 0) goto L_0x0319
            i2.r[] r0 = p560i2.C33184p.f90061b
            long r25 = p560i2.C33184p.f90062c
            goto L_0x031b
        L_0x0319:
            r25 = r60
        L_0x031b:
            if (r4 == 0) goto L_0x031f
            r0 = 0
            goto L_0x0321
        L_0x031f:
            r0 = r62
        L_0x0321:
            r4 = r10 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0329
            r4 = 3
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x032b
        L_0x0329:
            r4 = r63
        L_0x032b:
            if (r7 == 0) goto L_0x0332
            i2.r[] r7 = p560i2.C33184p.f90061b
            long r31 = p560i2.C33184p.f90062c
            goto L_0x0334
        L_0x0332:
            r31 = r64
        L_0x0334:
            if (r11 == 0) goto L_0x0338
            r7 = 1
            goto L_0x033a
        L_0x0338:
            r7 = r66
        L_0x033a:
            if (r16 == 0) goto L_0x033e
            r11 = 1
            goto L_0x0340
        L_0x033e:
            r11 = r67
        L_0x0340:
            if (r18 == 0) goto L_0x0345
            ca0.e$d r16 = ca0.C104335e.C104339d.f308879d
            goto L_0x0347
        L_0x0345:
            r16 = r68
        L_0x0347:
            r17 = r10 & r24
            if (r17 == 0) goto L_0x0365
            j0.f1<w1.z> r12 = p543h0.C107944f0.f323233a
            java.lang.Object r12 = r8.mo51598m(r12)
            w1.z r12 = (p735w1.C111705z) r12
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r18
            r35 = r0
            r29 = r2
            r36 = r4
            r39 = r7
            r40 = r11
            r42 = r12
            goto L_0x0371
        L_0x0365:
            r42 = r69
            r35 = r0
            r29 = r2
            r36 = r4
            r39 = r7
            r40 = r11
        L_0x0371:
            r41 = r16
            r33 = r25
            r37 = r31
            r31 = r3
            r32 = r5
            r24 = r19
            r26 = r22
            r22 = r1
            r20 = r6
            r23 = r9
        L_0x0385:
            r8.mo51555G()
            r12 = -576652806(0xffffffffdda0f9fa, float:-1.44994715E18)
            ca0.e$h r11 = new ca0.e$h
            r0 = r11
            r1 = r47
            r2 = r24
            r4 = r26
            r6 = r29
            r9 = 2
            r7 = r31
            r43 = r8
            r8 = r32
            r9 = r33
            r44 = r11
            r11 = r35
            r12 = r36
            r13 = r37
            r60 = 0
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r30
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r0 = r43
            r2 = r44
            r1 = -576652806(0xffffffffdda0f9fa, float:-1.44994715E18)
            r3 = 1
            q0.a r1 = p415q0.C110261c.m149878b(r0, r1, r3, r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r2)
            r4 = r47
            boolean r5 = r0.mo51619x(r4)
            java.lang.Object r6 = r0.mo51606q()
            if (r5 != 0) goto L_0x03df
            int r5 = p175j0.C108504h.f324828a
            java.lang.Object r5 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r5) goto L_0x03db
            goto L_0x03df
        L_0x03db:
            r5 = r6
            r6 = 2
            r7 = 0
            goto L_0x03ec
        L_0x03df:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r60)
            r6 = 2
            r7 = 0
            j0.y0 r5 = p175j0.C108500f2.m146996c(r5, r7, r6, r7)
            r0.mo51553F(r5)
        L_0x03ec:
            r0.mo51565P()
            j0.y0 r5 = (p175j0.C60690y0) r5
            r0.mo51557H(r2)
            boolean r8 = r0.mo51619x(r4)
            java.lang.Object r9 = r0.mo51606q()
            if (r8 != 0) goto L_0x0404
            int r8 = p175j0.C108504h.f324828a
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r9 != r8) goto L_0x040b
        L_0x0404:
            j0.y0 r9 = p175j0.C108500f2.m146996c(r7, r7, r6, r7)
            r0.mo51553F(r9)
        L_0x040b:
            r0.mo51565P()
            r8 = r9
            j0.y0 r8 = (p175j0.C60690y0) r8
            java.lang.Object r9 = r8.getValue()
            ca0.i0 r9 = (ca0.C28516i0) r9
            r10 = -1907416584(0xffffffff8e4f21f8, float:-2.5531075E-30)
            r0.mo51557H(r10)
            if (r48 == 0) goto L_0x04ae
            if (r9 == 0) goto L_0x04ae
            int r10 = r9.f78344a
            int r11 = r9.f78345b
            if (r10 < r11) goto L_0x04ae
            if (r11 == 0) goto L_0x04ae
            r0.mo51557H(r2)
            boolean r2 = r0.mo51619x(r9)
            java.lang.Object r10 = r0.mo51606q()
            if (r2 != 0) goto L_0x043c
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r2) goto L_0x044a
        L_0x043c:
            int r2 = r9.f78344a
            int r2 = r2 * 7500
            int r10 = r9.f78345b
            int r2 = r2 / r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r0.mo51553F(r10)
        L_0x044a:
            r0.mo51565P()
            java.lang.Number r10 = (java.lang.Number) r10
            int r2 = r10.intValue()
            r10 = 0
            w.i0 r11 = p257w.C111648j0.m152176b(r0, r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            int r9 = r9.f78344a
            int r9 = -r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            w.k1<java.lang.Float, w.l> r13 = p257w.C111656m1.f334256a
            w.k1<java.lang.Integer, w.l> r13 = p257w.C111656m1.f334257b
            w.z r14 = p257w.C37890a0.f100293a
            w.a0$a r14 = p257w.C37890a0.C37891a.f100294a
            w.j1 r2 = p257w.C37903i.m41595c(r2, r10, r14, r6, r7)
            w.q0 r7 = p257w.C37924q0.Restart
            r14 = 0
            r16 = 4
            r17 = 0
            r51 = r2
            r52 = r7
            r53 = r14
            r55 = r16
            r56 = r17
            w.h0 r2 = p257w.C37903i.m41593a(r51, r52, r53, r55, r56)
            r7 = 36920(0x9038, float:5.1736E-41)
            r51 = r11
            r52 = r12
            r53 = r9
            r54 = r13
            r55 = r2
            r56 = r0
            r57 = r7
            j0.k2 r2 = p257w.C111648j0.m152175a(r51, r52, r53, r54, r55, r56, r57)
            w.i0$a r2 = (p257w.C65915i0.C65920a) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.setValue(r2)
            goto L_0x04af
        L_0x04ae:
            r10 = 0
        L_0x04af:
            r0.mo51565P()
            v0.j r2 = p868x0.C111979d.m152691b(r22)
            r7 = 6
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r10] = r1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r9[r3] = r11
            r9[r6] = r8
            r3 = 3
            r9[r3] = r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r48)
            r9[r21] = r3
            r3 = 5
            a1.w r6 = new a1.w
            r11 = r49
            r6.<init>(r11)
            r9[r3] = r6
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo51557H(r3)
            r3 = 0
            r15 = 0
        L_0x04de:
            if (r15 >= r7) goto L_0x04ea
            r6 = r9[r15]
            boolean r6 = r0.mo51619x(r6)
            r3 = r3 | r6
            int r15 = r15 + 1
            goto L_0x04de
        L_0x04ea:
            java.lang.Object r6 = r0.mo51606q()
            if (r3 != 0) goto L_0x04f6
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r3) goto L_0x050e
        L_0x04f6:
            ca0.e$e r6 = new ca0.e$e
            r51 = r6
            r52 = r23
            r53 = r8
            r54 = r48
            r55 = r1
            r56 = r5
            r57 = r49
            r59 = r30
            r51.<init>(r52, r53, r54, r55, r56, r57, r59)
            r0.mo51553F(r6)
        L_0x050e:
            r0.mo51565P()
            fy3.p r6 = (fy3.C32227p) r6
            p631o1.C109880u0.m149371b(r2, r6, r0, r10, r10)
            r5 = r22
            r6 = r23
            r7 = r24
            r9 = r26
            r13 = r32
            r14 = r33
            r16 = r35
            r17 = r36
            r18 = r37
            r20 = r39
            r21 = r40
            r22 = r41
            r23 = r42
        L_0x0530:
            j0.v1 r3 = r0.mo51596l()
            if (r3 != 0) goto L_0x0537
            goto L_0x0559
        L_0x0537:
            ca0.e$f r2 = new ca0.e$f
            r0 = r2
            r1 = r47
            r4 = r2
            r2 = r48
            r45 = r3
            r46 = r4
            r3 = r49
            r11 = r29
            r12 = r31
            r24 = r71
            r25 = r72
            r26 = r73
            r0.<init>(r1, r2, r3, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            r0 = r45
            r1 = r46
            r0.mo51650a(r1)
        L_0x0559:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104335e.m139319b(w1.a, boolean, long, v0.j, boolean, long, long, b2.o, b2.q, b2.i, long, h2.f, int, long, int, boolean, fy3.l, w1.z, j0.h, int, int, int):void");
    }

    /* renamed from: c */
    public static final void m139320c(long j, long j2, C108504h hVar, int i) {
        int i2;
        long j3 = j;
        long j4 = j2;
        C108504h z = hVar.mo51623z(1364391032);
        if ((i & 14) == 0) {
            i2 = i | (z.mo51594k(j3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z.mo51594k(j4) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            int i3 = C65503j.f188489K0;
            C65503j e = C103214y0.m136589e(C103214y0.m136596l(C65503j.C65504a.f188490d, ((float) 3.5d) * ((float) 8)), 0.0f, 1, (Object) null);
            C13604l[] lVarArr = (C13604l[]) Arrays.copyOf(new C13604l[]{new C13604l(Float.valueOf(0.0f), new C103272w(j3)), new C13604l(Float.valueOf(1.0f), new C103272w(j4))}, 2);
            long a = C112540f.m153745a(0.0f, 0.0f);
            long a2 = C112540f.m153745a(Float.POSITIVE_INFINITY, 0.0f);
            C87412m.m108594g(lVarArr, "colorStops");
            ArrayList arrayList = new ArrayList(r6);
            for (C13604l lVar : lVarArr) {
                arrayList.add(new C103272w(((C103272w) lVar.f38556e).f304517a));
            }
            ArrayList arrayList2 = new ArrayList(r6);
            for (C13604l lVar2 : lVarArr) {
                arrayList2.add(Float.valueOf(((Number) lVar2.f38555d).floatValue()));
            }
            C103141f.m136470a(C111885b.m152605a(e, new C103233f0(arrayList, arrayList2, a, a2, 0, (C8480h) null), (C103266t0) null, 0.0f, 6, (Object) null), z, 0);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C104334d(j, j2, i));
        }
    }
}
