package p583k2;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1094c4.C104292c;
import p1166z0.C112539e;
import p175j0.C108504h;
import p175j0.C24721r;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p246u1.C111064a0;
import p560i2.C108322d;
import p560i2.C108330s;
import p560i2.C33183o;
import p582k1.C108796a;
import p582k1.C108797b;
import p658q1.C110298h0;
import p658q1.C110301j;
import p683s0.C110688i;
import p721v0.C65503j;
import rx3.C13598b0;
import rx3.C13603j;
import wx3.C15601d;

/* renamed from: k2.c */
public final class C108846c {

    /* renamed from: a */
    public static final C32226l<View, C13598b0> f325971a = C33814m.f91417d;

    /* renamed from: k2.c$m */
    public static final class C33814m extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C33814m f91417d = new C33814m();

        public C33814m() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, "$this$null");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$a */
    public static final class C60955a extends C87413o implements C32224a<C110301j> {

        /* renamed from: d */
        public final /* synthetic */ C32224a f173604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60955a(C32224a aVar) {
            super(0);
            this.f173604d = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [q1.j, java.lang.Object] */
        public final C110301j invoke() {
            return this.f173604d.invoke();
        }
    }

    /* renamed from: k2.c$j */
    public static final class C60956j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Context, T> f173605d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f173606e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<T, C13598b0> f173607f;

        /* renamed from: g */
        public final /* synthetic */ int f173608g;

        /* renamed from: h */
        public final /* synthetic */ int f173609h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60956j(C32226l<? super Context, ? extends T> lVar, C65503j jVar, C32226l<? super T, C13598b0> lVar2, int i, int i2) {
            super(2);
            this.f173605d = lVar;
            this.f173606e = jVar;
            this.f173607f = lVar2;
            this.f173608g = i;
            this.f173609h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C108846c.m147713a(this.f173605d, this.f173606e, this.f173607f, (C108504h) obj, this.f173608g | 1, this.f173609h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$k */
    public static final class C60957k extends C87413o implements C32226l<C111064a0, C13598b0> {

        /* renamed from: d */
        public static final C60957k f173610d = new C60957k();

        public C60957k() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111064a0) obj, "$this$semantics");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$b */
    public static final class C108847b extends C87413o implements C32224a<C110301j> {

        /* renamed from: d */
        public final /* synthetic */ Context f325972d;

        /* renamed from: e */
        public final /* synthetic */ C24721r f325973e;

        /* renamed from: f */
        public final /* synthetic */ C108797b f325974f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Context, T> f325975g;

        /* renamed from: h */
        public final /* synthetic */ C110688i f325976h;

        /* renamed from: i */
        public final /* synthetic */ String f325977i;

        /* renamed from: j */
        public final /* synthetic */ C110298h0<C108858f<T>> f325978j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108847b(Context context, C24721r rVar, C108797b bVar, C32226l<? super Context, ? extends T> lVar, C110688i iVar, String str, C110298h0<C108858f<T>> h0Var) {
            super(0);
            this.f325972d = context;
            this.f325973e = rVar;
            this.f325974f = bVar;
            this.f325975g = lVar;
            this.f325976h = iVar;
            this.f325977i = str;
            this.f325978j = h0Var;
        }

        public Object invoke() {
            View typedView$ui_release;
            T fVar = new C108858f(this.f325972d, this.f325973e, this.f325974f);
            fVar.setFactory(this.f325975g);
            C110688i iVar = this.f325976h;
            SparseArray sparseArray = null;
            Object d = iVar != null ? iVar.mo60747d(this.f325977i) : null;
            if (d instanceof SparseArray) {
                sparseArray = (SparseArray) d;
            }
            if (!(sparseArray == null || (typedView$ui_release = fVar.getTypedView$ui_release()) == null)) {
                typedView$ui_release.restoreHierarchyState(sparseArray);
            }
            this.f325978j.f329878a = fVar;
            return fVar.getLayoutNode();
        }
    }

    /* renamed from: k2.c$c */
    public static final class C108848c extends C87413o implements C32227p<C110301j, C65503j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108848c(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325979d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C65503j jVar = (C65503j) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            T t = this.f325979d.f329878a;
            C87412m.m108591d(t);
            ((C108858f) t).setModifier(jVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$d */
    public static final class C108849d extends C87413o implements C32227p<C110301j, C108322d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325980d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108849d(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325980d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C108322d dVar = (C108322d) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            T t = this.f325980d.f329878a;
            C87412m.m108591d(t);
            ((C108858f) t).setDensity(dVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$e */
    public static final class C108850e extends C87413o implements C32227p<C110301j, C0125s, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108850e(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325981d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C0125s sVar = (C0125s) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
            T t = this.f325981d.f329878a;
            C87412m.m108591d(t);
            ((C108858f) t).setLifecycleOwner(sVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$f */
    public static final class C108851f extends C87413o implements C32227p<C110301j, C104292c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108851f(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325982d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C104292c cVar = (C104292c) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            T t = this.f325982d.f329878a;
            C87412m.m108591d(t);
            ((C108858f) t).setSavedStateRegistryOwner(cVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$g */
    public static final class C108852g extends C87413o implements C32227p<C110301j, C32226l<? super T, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108852g(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325983d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C32226l lVar = (C32226l) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
            T t = this.f325983d.f329878a;
            C87412m.m108591d(t);
            ((C108858f) t).setUpdateBlock(lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$h */
    public static final class C108853h extends C87413o implements C32227p<C110301j, C33183o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110298h0<C108858f<T>> f325984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108853h(C110298h0<C108858f<T>> h0Var) {
            super(2);
            this.f325984d = h0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C33183o oVar = (C33183o) obj2;
            C87412m.m108594g((C110301j) obj, "$this$set");
            C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
            T t = this.f325984d.f329878a;
            C87412m.m108591d(t);
            C108858f fVar = (C108858f) t;
            int ordinal = oVar.ordinal();
            int i = 1;
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new C13603j();
            }
            fVar.setLayoutDirection(i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.c$i */
    public static final class C108854i extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C110688i f325985d;

        /* renamed from: e */
        public final /* synthetic */ String f325986e;

        /* renamed from: f */
        public final /* synthetic */ C110298h0<C108858f<T>> f325987f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108854i(C110688i iVar, String str, C110298h0<C108858f<T>> h0Var) {
            super(1);
            this.f325985d = iVar;
            this.f325986e = str;
            this.f325987f = h0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C108856d(this.f325985d.mo60745b(this.f325986e, new C108857e(this.f325987f)));
        }
    }

    /* renamed from: k2.c$l */
    public static final class C108855l implements C108796a {
        /* renamed from: b */
        public long mo159896b(long j, long j2, int i) {
            return C112539e.f336955b;
        }

        /* renamed from: d */
        public Object mo159897d(long j, long j2, C15601d<? super C108330s> dVar) {
            return new C108330s(C108330s.f324354b);
        }

        /* renamed from: e */
        public long mo159898e(long j, int i) {
            return C112539e.f336955b;
        }

        /* renamed from: f */
        public Object mo159899f(long j, C15601d<? super C108330s> dVar) {
            return new C108330s(C108330s.f324354b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void m147713a(fy3.C32226l<? super android.content.Context, ? extends T> r17, p721v0.C65503j r18, fy3.C32226l<? super T, rx3.C13598b0> r19, p175j0.C108504h r20, int r21, int r22) {
        /*
            r8 = r17
            r9 = r21
            java.lang.String r0 = "factory"
            gy3.C87412m.m108594g(r8, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r1 = r20
            j0.h r10 = r1.mo51623z(r0)
            r0 = r22 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x002a
            boolean r0 = r10.mo51619x(r8)
            if (r0 == 0) goto L_0x0027
            r0 = 4
            goto L_0x0028
        L_0x0027:
            r0 = 2
        L_0x0028:
            r0 = r0 | r9
            goto L_0x002b
        L_0x002a:
            r0 = r9
        L_0x002b:
            r1 = r22 & 2
            if (r1 == 0) goto L_0x0032
            r0 = r0 | 48
            goto L_0x0045
        L_0x0032:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0045
            r2 = r18
            boolean r3 = r10.mo51619x(r2)
            if (r3 == 0) goto L_0x0041
            r3 = 32
            goto L_0x0043
        L_0x0041:
            r3 = 16
        L_0x0043:
            r0 = r0 | r3
            goto L_0x0047
        L_0x0045:
            r2 = r18
        L_0x0047:
            r3 = r22 & 4
            if (r3 == 0) goto L_0x004e
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0061
            r4 = r19
            boolean r5 = r10.mo51619x(r4)
            if (r5 == 0) goto L_0x005d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r0 = r0 | r5
            goto L_0x0063
        L_0x0061:
            r4 = r19
        L_0x0063:
            r0 = r0 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r0 != r5) goto L_0x0076
            boolean r0 = r10.mo51575a()
            if (r0 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r10.mo51581d()
            r3 = r4
            goto L_0x01ad
        L_0x0076:
            if (r1 == 0) goto L_0x007e
            int r0 = p721v0.C65503j.f188489K0
            v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
            r11 = r0
            goto L_0x007f
        L_0x007e:
            r11 = r2
        L_0x007f:
            if (r3 == 0) goto L_0x0085
            fy3.l<android.view.View, rx3.b0> r0 = f325971a
            r12 = r0
            goto L_0x0086
        L_0x0085:
            r12 = r4
        L_0x0086:
            j0.f1<android.content.Context> r0 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r0 = r10.mo51598m(r0)
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo51557H(r0)
            java.lang.Object r2 = r10.mo51606q()
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r3) goto L_0x00a7
            k2.c$l r2 = new k2.c$l
            r2.<init>()
            r10.mo51553F(r2)
        L_0x00a7:
            r10.mo51565P()
            k2.c$l r2 = (p583k2.C108846c.C108855l) r2
            r10.mo51557H(r0)
            java.lang.Object r4 = r10.mo51606q()
            if (r4 != r3) goto L_0x00bd
            k1.b r4 = new k1.b
            r4.<init>()
            r10.mo51553F(r4)
        L_0x00bd:
            r10.mo51565P()
            k1.b r4 = (p582k1.C108797b) r4
            int r5 = p721v0.C65503j.f188489K0
            v0.j$a r5 = p721v0.C65503j.C65504a.f188490d
            v0.j r2 = p582k1.C108801c.m147665a(r5, r2, r4)
            v0.j r2 = r11.mo74972i0(r2)
            k2.c$k r5 = p583k2.C108846c.C60957k.f173610d
            r6 = 1
            v0.j r2 = p246u1.C111082p.m151476b(r2, r6, r5)
            v0.j r13 = p721v0.C111299g.m151788c(r10, r2)
            j0.f1<i2.d> r2 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r2 = r10.mo51598m(r2)
            r14 = r2
            i2.d r14 = (p560i2.C108322d) r14
            j0.f1<i2.o> r2 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r2 = r10.mo51598m(r2)
            r15 = r2
            i2.o r15 = (p560i2.C33183o) r15
            r2 = 0
            j0.r r2 = p175j0.C108501g.m147001b(r10, r2)
            j0.f1<s0.i> r5 = p683s0.C110690k.f331112a
            java.lang.Object r5 = r10.mo51598m(r5)
            r7 = r5
            s0.i r7 = (p683s0.C110688i) r7
            int r5 = r10.mo51563N()
            java.lang.String r6 = java.lang.String.valueOf(r5)
            r10.mo51557H(r0)
            java.lang.Object r0 = r10.mo51606q()
            if (r0 != r3) goto L_0x0112
            q1.h0 r0 = new q1.h0
            r0.<init>()
            r10.mo51553F(r0)
        L_0x0112:
            r10.mo51565P()
            r5 = r0
            q1.h0 r5 = (p658q1.C110298h0) r5
            j0.f1<androidx.lifecycle.s> r0 = androidx.compose.p002ui.platform.C103691v.f306270d
            java.lang.Object r0 = r10.mo51598m(r0)
            r3 = r0
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
            j0.f1<c4.c> r0 = androidx.compose.p002ui.platform.C103691v.f306271e
            java.lang.Object r0 = r10.mo51598m(r0)
            c4.c r0 = (p1094c4.C104292c) r0
            k2.c$b r8 = new k2.c$b
            r9 = r0
            r0 = r8
            r18 = r11
            r11 = r3
            r3 = r4
            r4 = r17
            r19 = r5
            r5 = r7
            r20 = r6
            r16 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r10.mo51557H(r0)
            j0.d r0 = r10.mo51543A()
            boolean r0 = r0 instanceof p658q1.C110304l0
            if (r0 == 0) goto L_0x01c4
            r10.mo51545B()
            boolean r0 = r10.mo51621y()
            if (r0 == 0) goto L_0x015f
            k2.c$a r0 = new k2.c$a
            r0.<init>(r8)
            r10.mo51612t(r0)
            goto L_0x0162
        L_0x015f:
            r10.mo51579c()
        L_0x0162:
            k2.c$c r0 = new k2.c$c
            r1 = r19
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r13, r0)
            k2.c$d r0 = new k2.c$d
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r14, r0)
            k2.c$e r0 = new k2.c$e
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r11, r0)
            k2.c$f r0 = new k2.c$f
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r9, r0)
            k2.c$g r0 = new k2.c$g
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r12, r0)
            k2.c$h r0 = new k2.c$h
            r0.<init>(r1)
            p175j0.C108508o2.m147049a(r10, r15, r0)
            r10.mo51610s()
            r10.mo51565P()
            r5 = r16
            if (r5 == 0) goto L_0x01aa
            k2.c$i r0 = new k2.c$i
            r2 = r20
            r0.<init>(r5, r2, r1)
            r1 = 8
            p175j0.C60655g0.m70931b(r5, r2, r0, r10, r1)
        L_0x01aa:
            r2 = r18
            r3 = r12
        L_0x01ad:
            j0.v1 r6 = r10.mo51596l()
            if (r6 != 0) goto L_0x01b4
            goto L_0x01c3
        L_0x01b4:
            k2.c$j r7 = new k2.c$j
            r0 = r7
            r1 = r17
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x01c3:
            return
        L_0x01c4:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p583k2.C108846c.m147713a(fy3.l, v0.j, fy3.l, j0.h, int, int):void");
    }
}
