package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import android.content.Context;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import ca0.C104345g0;
import ca0.C92387h0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import kotlin.ResultKt;
import p004b0.C103937e;
import p004b0.C103953l0;
import p004b0.C54372f0;
import p004b0.C54380k;
import p1104d1.C106969c;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60655g0;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111064a0;
import p246u1.C111072h;
import p246u1.C111082p;
import p267x.C111897d1;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103138e;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p435a0.C103214y0;
import p436a1.C103274x;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p759y.C112195b0;
import p835c1.C54601d;
import p868x0.C111983i;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import ta0.C110954a;
import ua0.C65253d;
import ua0.C65256e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1 */
public final class C104674o1 {

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$b */
    public static final class C55327b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55319n1.C55320a f157569d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f157570e;

        /* renamed from: f */
        public final /* synthetic */ int f157571f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55327b(C55319n1.C55320a aVar, C32224a<C13598b0> aVar2, int i) {
            super(2);
            this.f157569d = aVar;
            this.f157570e = aVar2;
            this.f157571f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140301a(this.f157569d, this.f157570e, (C108504h) obj, this.f157571f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$c */
    public static final class C55328c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f157572d;

        /* renamed from: e */
        public final /* synthetic */ int f157573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55328c(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f157572d = pVar;
            this.f157573e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                this.f157572d.invoke(hVar, Integer.valueOf((this.f157573e >> 12) & 14));
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$d */
    public static final class C55329d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f157574d;

        /* renamed from: e */
        public final /* synthetic */ boolean f157575e;

        /* renamed from: f */
        public final /* synthetic */ float f157576f;

        /* renamed from: g */
        public final /* synthetic */ long f157577g;

        /* renamed from: h */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f157578h;

        /* renamed from: i */
        public final /* synthetic */ int f157579i;

        /* renamed from: j */
        public final /* synthetic */ int f157580j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55329d(C65503j jVar, boolean z, float f, long j, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i, int i2) {
            super(2);
            this.f157574d = jVar;
            this.f157575e = z;
            this.f157576f = f;
            this.f157577g = j;
            this.f157578h = pVar;
            this.f157579i = i;
            this.f157580j = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140302b(this.f157574d, this.f157575e, this.f157576f, this.f157577g, this.f157578h, (C108504h) obj, this.f157579i | 1, this.f157580j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$e */
    public static final class C55330e extends C87413o implements C32226l<C111064a0, C13598b0> {

        /* renamed from: d */
        public static final C55330e f157581d = new C55330e();

        public C55330e() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111064a0) obj, "$this$semantics");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$f */
    public static final class C55331f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f157582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55331f(int i) {
            super(2);
            this.f157582d = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140303c((C108504h) obj, this.f157582d | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$g */
    public static final class C55332g extends C87413o implements C32226l<C111064a0, C13598b0> {

        /* renamed from: d */
        public static final C55332g f157583d = new C55332g();

        public C55332g() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111064a0) obj, "$this$semantics");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$h */
    public static final class C55333h extends C87413o implements C32226l<C54601d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f157584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55333h(C60690y0<Boolean> y0Var) {
            super(1);
            this.f157584d = y0Var;
        }

        public Object invoke(Object obj) {
            C54601d dVar = (C54601d) obj;
            C87412m.m108594g(dVar, "$this$drawWithContent");
            if (this.f157584d.getValue().booleanValue()) {
                dVar.mo75508h0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$j */
    public static final class C55334j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f157585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55334j(int i) {
            super(2);
            this.f157585d = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140304d((C108504h) obj, this.f157585d | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$m */
    public static final class C55335m extends C87413o implements C32226l<C111064a0, C13598b0> {

        /* renamed from: d */
        public static final C55335m f157586d = new C55335m();

        public C55335m() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111064a0) obj, "$this$semantics");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$o */
    public static final class C55336o extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55319n1.C55323d f157587d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f157588e;

        /* renamed from: f */
        public final /* synthetic */ int f157589f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55336o(C55319n1.C55323d dVar, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f157587d = dVar;
            this.f157588e = aVar;
            this.f157589f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140306f(this.f157587d, this.f157588e, (C108504h) obj, this.f157589f | 1);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.SnsTemplateListKt$SnsTemplateList$1", mo125469f = "SnsTemplateList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$p */
    public static final class C55337p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C55366y1 f157590d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f157591e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55337p(C55366y1 y1Var, C103953l0 l0Var, C15601d<? super C55337p> dVar) {
            super(2, dVar);
            this.f157590d = y1Var;
            this.f157591e = l0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55337p(this.f157590d, this.f157591e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55337p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            ResultKt.throwOnFailure(obj);
            C55366y1 y1Var = this.f157590d;
            List<C54380k> f = this.f157591e.mo145573g().mo55835f();
            ArrayList<Number> arrayList = new ArrayList<>(C36907w.m41090l(f, 10));
            for (C54380k index : f) {
                arrayList.add(new Integer(index.getIndex()));
            }
            y1Var.getClass();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (Number intValue : arrayList) {
                arrayList2.add((C55319n1) C110818d0.m150917O(y1Var.mo76619b(), intValue.intValue()));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C55319n1 n1Var = (C55319n1) next;
                if ((n1Var instanceof C55319n1.C55323d) || (n1Var instanceof C55319n1.C55321b)) {
                    arrayList3.add(next);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C55319n1 n1Var2 = (C55319n1) it4.next();
                if (!(n1Var2 == null || (str = n1Var2.f157555a) == null || y1Var.f157679o.contains(str))) {
                    C55366y1.C55367a aVar = y1Var.f157678n;
                    if (aVar != null) {
                        aVar.mo76624a(str);
                    }
                    y1Var.f157679o.add(str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$q */
    public static final class C55338q extends C87413o implements C32226l<C54372f0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C55319n1> f157592d;

        /* renamed from: e */
        public final /* synthetic */ C55366y1 f157593e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55338q(List<? extends C55319n1> list, C55366y1 y1Var) {
            super(1);
            this.f157592d = list;
            this.f157593e = y1Var;
        }

        public Object invoke(Object obj) {
            C54372f0 f0Var = (C54372f0) obj;
            C87412m.m108594g(f0Var, "$this$LazyRow");
            C54372f0.C54373a.m61063b(f0Var, this.f157592d.size(), new C55358v1(this.f157592d), (C32226l) null, C110261c.m149879c(-1228641848, true, new C55363x1(this.f157592d, this.f157593e)), 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$r */
    public static final class C55339r extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55366y1 f157594d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f157595e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f157596f;

        /* renamed from: g */
        public final /* synthetic */ int f157597g;

        /* renamed from: h */
        public final /* synthetic */ int f157598h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55339r(C55366y1 y1Var, C103953l0 l0Var, C65503j jVar, int i, int i2) {
            super(2);
            this.f157594d = y1Var;
            this.f157595e = l0Var;
            this.f157596f = jVar;
            this.f157597g = i;
            this.f157598h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140307g(this.f157594d, this.f157595e, this.f157596f, (C108504h) obj, this.f157597g | 1, this.f157598h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$a */
    public static final class C104675a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f310831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104675a(C32224a<C13598b0> aVar) {
            super(2);
            this.f310831d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                C65503j d = C111940o.m152651d(C103214y0.m136594j(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), false, (String) null, (C111072h) null, this.f310831d, 7, (Object) null);
                hVar.mo51557H(733328855);
                int i2 = C111294a.f333218a;
                C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(d);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar2);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, c, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-2137368960);
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C106969c a2 = C110954a.m151253a(C0966R.C0969drawable.coo, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_3, context), hVar, 0);
                    C65503j j = C103214y0.m136594j(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3750d1)));
                    C111294a aVar3 = C111294a.C111295a.f333222d;
                    C87412m.m108594g(j, "<this>");
                    C111897d1.m152617a(a2, "", j.mo74972i0(new C103138e(aVar3, false, C103612c1.f306063a)), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, 56, 120);
                    hVar.mo51565P();
                    hVar.mo51565P();
                    hVar.mo51610s();
                    hVar.mo51565P();
                    hVar.mo51565P();
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$i */
    public static final class C104676i extends C87413o implements C32226l<C111703v, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Double> f310832d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<Boolean> f310833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104676i(C60690y0<Double> y0Var, C60690y0<Boolean> y0Var2) {
            super(1);
            this.f310832d = y0Var;
            this.f310833e = y0Var2;
        }

        public Object invoke(Object obj) {
            C111703v vVar = (C111703v) obj;
            C87412m.m108594g(vVar, "textLayoutResult");
            if (vVar.f334372b.f334316c || ((float) C33181m.m39966b(vVar.f334373c)) < vVar.f334372b.f334318e) {
                C60690y0<Double> y0Var = this.f310832d;
                y0Var.setValue(Double.valueOf(y0Var.getValue().doubleValue() * 0.9d));
            } else {
                this.f310833e.setValue(Boolean.TRUE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$k */
    public static final class C104677k extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f310834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104677k(C32224a<C13598b0> aVar) {
            super(2);
            this.f310834d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C106969c d = C110954a.m151256d(C0966R.C0969drawable.ba_, hVar, 0);
                int i = C65503j.f188489K0;
                C111897d1.m152617a(d, (String) null, C111082p.m151475a(C111940o.m152651d(C103214y0.m136594j(C65503j.C65504a.f188490d, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), false, (String) null, (C111072h) null, this.f310834d, 7, (Object) null), C28972t1.f79453d), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, 56, 120);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$l */
    public static final class C104678l extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f310835d;

        /* renamed from: e */
        public final /* synthetic */ int f310836e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104678l(C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f310835d = aVar;
            this.f310836e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104674o1.m140305e(this.f310835d, (C108504h) obj, this.f310836e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o1$n */
    public static final class C104679n extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65253d f310837d;

        /* renamed from: e */
        public final /* synthetic */ C55319n1.C55323d f310838e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f310839f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104679n(C65253d dVar, C55319n1.C55323d dVar2, C32224a<C13598b0> aVar) {
            super(2);
            this.f310837d = dVar;
            this.f310838e = dVar2;
            this.f310839f = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                if (!((Boolean) ((C108494d2) this.f310837d.f187861o).getValue()).booleanValue()) {
                    if (!(this.f310838e.f157564f.length() == 0)) {
                        hVar.mo51557H(-23696710);
                        int i = C111294a.f333218a;
                        C111294a aVar = C111294a.C111295a.f333222d;
                        int i2 = C65503j.f188489K0;
                        C65503j j = C103214y0.m136594j(C65503j.C65504a.f188490d, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn)));
                        hVar.mo51557H(733328855);
                        C109895y c = C103141f.m136472c(aVar, false, hVar, 6);
                        hVar.mo51557H(-1323940314);
                        C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                        C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                        C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                        C110269a.f329831D0.getClass();
                        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(j);
                        if (hVar.mo51543A() instanceof C24665d) {
                            hVar.mo51615v();
                            if (hVar.mo51621y()) {
                                hVar.mo51612t(aVar2);
                            } else {
                                hVar.mo51579c();
                            }
                            hVar.mo51561L();
                            C108508o2.m147049a(hVar, c, C110269a.C110270a.f329836e);
                            C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                            C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                            C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                            hVar.mo51590i();
                            ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                            hVar.mo51557H(2058660585);
                            hVar.mo51557H(-2137368960);
                            C104345g0.m139321a("assets://sns_template_loading.pag", (C92387h0) null, hVar, 6, 2);
                            hVar.mo51565P();
                            hVar.mo51565P();
                            hVar.mo51610s();
                            hVar.mo51565P();
                            hVar.mo51565P();
                            hVar.mo51565P();
                        } else {
                            C108501g.m147000a();
                            throw null;
                        }
                    }
                }
                hVar.mo51557H(-23697130);
                int i3 = C109836f.f328763a;
                C109836f fVar = C109836f.C109837a.f328764a;
                int i4 = C65503j.f188489K0;
                C111897d1.m152617a(this.f310837d, (String) null, C111082p.m151475a(C111940o.m152651d(C103214y0.m136594j(C65503j.C65504a.f188490d, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), false, (String) null, (C111072h) null, this.f310839f, 7, (Object) null), C28973u1.f79454d), (C111294a) null, fVar, 0.0f, (C103274x) null, hVar, 24632, 104);
                hVar.mo51565P();
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m140301a(C55319n1.C55320a aVar, C32224a<C13598b0> aVar2, C108504h hVar, int i) {
        int i2;
        int i3;
        C55319n1.C55320a aVar3 = aVar;
        C32224a<C13598b0> aVar4 = aVar2;
        int i4 = i;
        C87412m.m108594g(aVar3, "snsTemplateListData");
        C87412m.m108594g(aVar4, "onClick");
        C108504h z = hVar.mo51623z(-1280502112);
        if ((i4 & 14) == 0) {
            i2 = (z.mo51619x(aVar3) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= z.mo51619x(aVar4) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            boolean booleanValue = aVar3.f157556b.getValue().booleanValue();
            int i5 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i6 = C65503j.f188489K0;
            C65503j.C65504a aVar5 = C65503j.C65504a.f188490d;
            C65503j l = C103214y0.m136596l(C103166l0.m136521e(aVar5, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null), (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn)));
            z.mo51557H(-483455358);
            C103111a aVar6 = C103111a.f304234a;
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar7 = C110269a.f329831D0;
            aVar7.getClass();
            C32224a<C110269a> aVar8 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(l);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar8);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar7.getClass();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                aVar7.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar7.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar7.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C65503j j = C103214y0.m136594j(aVar5, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn)));
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                String str = "getContext()";
                m140302b(j, booleanValue, 0.0f, C110954a.m151254b(C0966R.color.f3035cv, context), C110261c.m149878b(z, -55250135, true, new C104675a(aVar4)), z, 24576, 4);
                String string = MMApplicationContext.getString(C0966R.string.n_z);
                float f = (float) 8;
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F(((float) 1.5d) * f);
                if (booleanValue) {
                    z.mo51557H(-855386799);
                    i3 = C0966R.color.BW_100_Alpha_0_8;
                } else {
                    z.mo51557H(-855386742);
                    i3 = C0966R.color.BW_100_Alpha_0_5;
                }
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, str);
                long b = C110954a.m151254b(i3, context2);
                z.mo51565P();
                C104022q qVar = C104022q.f307650e;
                C104022q qVar2 = booleanValue ? C104022q.f307651f : C104022q.f307650e;
                C65503j h = C103214y0.m136592h(C103166l0.m136523g(aVar5, 0.0f, ((float) 0.75d) * f, 0.0f, 0.0f, 13, (Object) null), ((float) 4.25d) * f);
                C87412m.m108593f(string, "str");
                C107944f0.m146242c(string, h, b, F, (C104020o) null, qVar2, (C104014i) null, 0, (C108014f) null, new C32659e(3), 0, 0, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 3120, LVBuffer.MAX_STRING_LENGTH, 56784);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l2 = z.mo51596l();
        if (l2 != null) {
            l2.mo51650a(new C55327b(aVar, aVar4, i4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m140302b(p721v0.C65503j r22, boolean r23, float r24, long r25, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r27, p175j0.C108504h r28, int r29, int r30) {
        /*
            r6 = r27
            r7 = r29
            r0 = 474415496(0x1c470188, float:6.5845556E-22)
            r1 = r28
            j0.h r0 = r1.mo51623z(r0)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0017
            r2 = r7 | 6
            r3 = r2
            r2 = r22
            goto L_0x002b
        L_0x0017:
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0028
            r2 = r22
            boolean r3 = r0.mo51619x(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r7
            goto L_0x002b
        L_0x0028:
            r2 = r22
            r3 = r7
        L_0x002b:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r23
            boolean r8 = r0.mo51586g(r5)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r3 = r3 | r8
            goto L_0x0047
        L_0x0045:
            r5 = r23
        L_0x0047:
            r8 = r30 & 8
            if (r8 == 0) goto L_0x004e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0061
        L_0x004e:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0061
            r9 = r25
            boolean r11 = r0.mo51594k(r9)
            if (r11 == 0) goto L_0x005d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x005f
        L_0x005d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x005f:
            r3 = r3 | r11
            goto L_0x0063
        L_0x0061:
            r9 = r25
        L_0x0063:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x007c
        L_0x006a:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r7
            if (r11 != 0) goto L_0x007c
            boolean r11 = r0.mo51619x(r6)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = 46171(0xb45b, float:6.47E-41)
            r11 = r11 & r3
            r12 = 9234(0x2412, float:1.294E-41)
            if (r11 != r12) goto L_0x0095
            boolean r11 = r0.mo51575a()
            if (r11 != 0) goto L_0x008b
            goto L_0x0095
        L_0x008b:
            r0.mo51581d()
            r3 = r24
            r1 = r2
            r2 = r5
            r4 = r9
            goto L_0x01bf
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            r2 = 0
            if (r4 == 0) goto L_0x009f
            r5 = 0
        L_0x009f:
            r4 = r30 & 4
            r11 = 1
            if (r4 == 0) goto L_0x00a6
            float r4 = (float) r11
            goto L_0x00a8
        L_0x00a6:
            r4 = r24
        L_0x00a8:
            if (r8 == 0) goto L_0x00af
            long r8 = p436a1.C103272w.f304510b
            r20 = r8
            goto L_0x00b1
        L_0x00af:
            r20 = r9
        L_0x00b1:
            float r8 = (float) r11
            r9 = 8
            float r9 = (float) r9
            float r10 = r8 * r9
            e0.f r10 = p502e0.C107074g.m144958a(r10)
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo51557H(r12)
            v0.j$a r12 = p721v0.C65503j.C65504a.f188490d
            v0.a r13 = p721v0.C111294a.C111295a.f333219a
            o1.y r13 = p435a0.C103141f.m136472c(r13, r2, r0, r2)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r14)
            j0.f1<i2.d> r14 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r14 = r0.mo51598m(r14)
            i2.d r14 = (p560i2.C108322d) r14
            j0.f1<i2.o> r15 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r15 = r0.mo51598m(r15)
            i2.o r15 = (p560i2.C33183o) r15
            j0.f1<androidx.compose.ui.platform.i2> r11 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r11 = r0.mo51598m(r11)
            androidx.compose.ui.platform.i2 r11 = (androidx.compose.p002ui.platform.C103633i2) r11
            q1.a$a r16 = p658q1.C110269a.f329831D0
            r16.getClass()
            fy3.a<q1.a> r2 = p658q1.C110269a.C110270a.f329833b
            fy3.q r12 = p631o1.C109863q.m149330a(r12)
            r23 = r4
            j0.d r4 = r0.mo51543A()
            boolean r4 = r4 instanceof p175j0.C24665d
            r7 = 0
            if (r4 == 0) goto L_0x01d6
            r0.mo51615v()
            boolean r4 = r0.mo51621y()
            if (r4 == 0) goto L_0x010a
            r0.mo51612t(r2)
            goto L_0x010d
        L_0x010a:
            r0.mo51579c()
        L_0x010d:
            r0.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r2 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r13, r2)
            fy3.p<q1.a, i2.d, rx3.b0> r2 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r14, r2)
            fy3.p<q1.a, i2.o, rx3.b0> r2 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r15, r2)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r2 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r11, r2)
            r0.mo51590i()
            j0.x1 r2 = new j0.x1
            r2.<init>(r0)
            r4 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            q0.b r12 = (p415q0.C35747b) r12
            r12.invoke(r2, r0, r11)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r2)
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo51557H(r2)
            r2 = 1688866773(0x64aa0fd5, float:2.5096698E22)
            r0.mo51557H(r2)
            if (r5 == 0) goto L_0x017c
            r2 = 2131099704(0x7f060038, float:1.7811769E38)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r11 = "getContext()"
            gy3.C87412m.m108593f(r4, r11)
            long r11 = ta0.C110954a.m151254b(r2, r4)
            a1.w0 r2 = new a1.w0
            r2.<init>(r11, r7)
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            float r4 = (float) r11
            float r4 = r4 * r9
            e0.f r4 = p502e0.C107074g.m144958a(r4)
            java.lang.String r7 = "<this>"
            gy3.C87412m.m108594g(r1, r7)
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r7 = androidx.compose.p002ui.platform.C103612c1.f306063a
            x.e r11 = new x.e
            r11.<init>(r8, r4, r2)
            v0.j r2 = p721v0.C111299g.m151786a(r1, r7, r11)
            r4 = 0
            p435a0.C103141f.m136470a(r2, r0, r4)
        L_0x017c:
            r0.mo51565P()
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            float r2 = (float) r7
            float r2 = r2 * r9
            v0.j r8 = p435a0.C103166l0.m136519c(r1, r2)
            r12 = 0
            r14 = 0
            r15 = 0
            r2 = 172784074(0xa4c79ca, float:9.845149E-33)
            com.tencent.mm.mj_template.sns.compose.widget.o1$c r4 = new com.tencent.mm.mj_template.sns.compose.widget.o1$c
            r4.<init>(r6, r3)
            r7 = 1
            q0.a r16 = p415q0.C110261c.m149878b(r0, r2, r7, r4)
            r2 = 1572864(0x180000, float:2.204052E-39)
            int r3 = r3 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r18 = r3 | r2
            r19 = 56
            r9 = r10
            r10 = r20
            r17 = r0
            p543h0.C107927c0.m146232a(r8, r9, r10, r12, r14, r15, r16, r17, r18, r19)
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            r3 = r23
            r2 = r5
            r4 = r20
        L_0x01bf:
            j0.v1 r9 = r0.mo51596l()
            if (r9 != 0) goto L_0x01c6
            goto L_0x01d5
        L_0x01c6:
            com.tencent.mm.mj_template.sns.compose.widget.o1$d r10 = new com.tencent.mm.mj_template.sns.compose.widget.o1$d
            r0 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            r9.mo51650a(r10)
        L_0x01d5:
            return
        L_0x01d6:
            p175j0.C108501g.m147000a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C104674o1.m140302b(v0.j, boolean, float, long, fy3.p, j0.h, int, int):void");
    }

    /* renamed from: c */
    public static final void m140303c(C108504h hVar, int i) {
        int i2 = i;
        C108504h z = hVar.mo51623z(-1129063645);
        if (i2 != 0 || !z.mo51575a()) {
            int i3 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C65503j b = C111082p.m151476b(C103166l0.m136521e(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null), true, C55330e.f157581d);
            z.mo51557H(-483455358);
            C103111a aVar2 = C103111a.f304234a;
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar3 = C110269a.f329831D0;
            aVar3.getClass();
            C32224a<C110269a> aVar4 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(b);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar4);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar3.getClass();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                aVar3.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar3.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar3.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C65503j j = C103214y0.m136594j(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn)));
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b2 = C110954a.m151254b(C0966R.color.BW_100_Alpha_0_1_2, context);
                C32227p<C108504h, Integer, C13598b0> pVar = C104657d.f310791a;
                m140302b(j, false, 0.0f, b2, C104657d.f310792b, z, 24576, 6);
                float f = (float) 8;
                C107944f0.m146242c("", C103214y0.m136592h(C103166l0.m136523g(aVar, 0.0f, ((float) 0.75d) * f, 0.0f, 0.0f, 13, (Object) null), ((float) 4.25d) * f), 0, ((C108322d) z.mo51598m(vVar)).mo143031F(((float) 1.5d) * f), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, new C32659e(3), 0, 0, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 3126, LVBuffer.MAX_STRING_LENGTH, 56820);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55331f(i2));
        }
    }

    /* renamed from: d */
    public static final void m140304d(C108504h hVar, int i) {
        int i2 = i;
        C108504h z = hVar.mo51623z(2132733515);
        if (i2 != 0 || !z.mo51575a()) {
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C65503j b = C111082p.m151476b(C103214y0.m136596l(C103166l0.m136521e(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null), (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avq))), true, C55332g.f157583d);
            z.mo51557H(-483455358);
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(b);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar2);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C65503j j = C103214y0.m136594j(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn)));
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                m140302b(j, false, 0.0f, C110954a.m151254b(C0966R.color.f2952a9, context), C104657d.f310791a, z, 24576, 6);
                z.mo51557H(-492369756);
                Object q = z.mo51606q();
                Object obj = C108504h.C60656a.f172772a;
                if (q == obj) {
                    q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
                    z.mo51553F(q);
                }
                z.mo51565P();
                C60690y0 y0Var = (C60690y0) q;
                z.mo51557H(-492369756);
                Object q2 = z.mo51606q();
                if (q2 == obj) {
                    q2 = C108500f2.m146996c(Double.valueOf(1.5d), (C108497e2) null, 2, (Object) null);
                    z.mo51553F(q2);
                }
                z.mo51565P();
                C60690y0 y0Var2 = (C60690y0) q2;
                String string = MMApplicationContext.getString(C0966R.string.f360921m11);
                float f = (float) 8;
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F(((float) ((Number) y0Var2.getValue()).doubleValue()) * f);
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                long b2 = C110954a.m151254b(C0966R.color.BW_100_Alpha_0_5, context2);
                C65503j.C65504a aVar3 = aVar;
                C60690y0 y0Var3 = y0Var;
                C65503j h = C103214y0.m136592h(C103166l0.m136523g(aVar3, 0.0f, ((float) 0.75d) * f, 0.0f, 0.0f, 13, (Object) null), ((float) 4.25d) * f);
                z.mo51557H(1157296644);
                boolean x = z.mo51619x(y0Var3);
                Object q3 = z.mo51606q();
                if (x || q3 == obj) {
                    q3 = new C55333h(y0Var3);
                    z.mo51553F(q3);
                }
                z.mo51565P();
                C65503j c = C111983i.m152702c(h, (C32226l) q3);
                C87412m.m108593f(string, "str");
                C32659e eVar = new C32659e(3);
                z.mo51557H(511388516);
                boolean x2 = z.mo51619x(y0Var2) | z.mo51619x(y0Var3);
                Object q4 = z.mo51606q();
                if (x2 || q4 == obj) {
                    q4 = new C104676i(y0Var2, y0Var3);
                    z.mo51553F(q4);
                }
                z.mo51565P();
                long j2 = b2;
                C32659e eVar2 = eVar;
                C107944f0.m146242c(string, c, j2, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, eVar2, 0, 0, false, 0, (C32226l) q4, (C111705z) null, z, 0, 0, 48624);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55334j(i2));
        }
    }

    /* renamed from: e */
    public static final void m140305e(C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        C32224a<C13598b0> aVar2 = aVar;
        int i3 = i;
        C108504h z = hVar.mo51623z(70243466);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(aVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            int i4 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i5 = C65503j.f188489K0;
            C65503j.C65504a aVar3 = C65503j.C65504a.f188490d;
            C65503j e = C103166l0.m136521e(aVar3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null);
            z.mo51557H(-483455358);
            C103111a aVar4 = C103111a.f304234a;
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar5 = C110269a.f329831D0;
            aVar5.getClass();
            C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(e);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar6);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar5.getClass();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                aVar5.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar5.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar5.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                m140302b(C103214y0.m136594j(aVar3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), false, 0.0f, 0, C110261c.m149878b(z, 1096967379, true, new C104677k(aVar2)), z, 24576, 14);
                String string = MMApplicationContext.getString(C0966R.string.m2g);
                float f = (float) 8;
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F(((float) 1.5d) * f);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b = C110954a.m151254b(C0966R.color.BW_100_Alpha_0_8, context);
                C65503j g = C103166l0.m136523g(aVar3, 0.0f, ((float) 0.75d) * f, 0.0f, 0.0f, 13, (Object) null);
                C87412m.m108593f(string, "str");
                C107944f0.m146242c(string, g, b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, new C32659e(3), 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 3120, 0, 65008);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C104678l(aVar2, i3));
        }
    }

    /* renamed from: f */
    public static final void m140306f(C55319n1.C55323d dVar, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        int i3;
        C55319n1.C55323d dVar2 = dVar;
        C32224a<C13598b0> aVar2 = aVar;
        int i4 = i;
        C87412m.m108594g(dVar2, "snsTemplateListData");
        C87412m.m108594g(aVar2, "onClick");
        C108504h z = hVar.mo51623z(732788893);
        if ((i4 & 14) == 0) {
            i2 = (z.mo51619x(dVar2) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= z.mo51619x(aVar2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            boolean booleanValue = dVar2.f157556b.getValue().booleanValue();
            C65253d a = C65256e.m76829a(dVar2.f157564f, z, 0);
            int i5 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i6 = C65503j.f188489K0;
            C65503j.C65504a aVar3 = C65503j.C65504a.f188490d;
            C65503j b = C111082p.m151476b(C103214y0.m136596l(C103166l0.m136521e(aVar3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null), (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), true, C55335m.f157586d);
            z.mo51557H(-483455358);
            C103111a aVar4 = C103111a.f304234a;
            C109895y a2 = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar3 = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar5 = C110269a.f329831D0;
            aVar5.getClass();
            C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a3 = C109863q.m149330a(b);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar6);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar5.getClass();
                C108508o2.m147049a(z, a2, C110269a.C110270a.f329836e);
                aVar5.getClass();
                C108508o2.m147049a(z, dVar3, C110269a.C110270a.f329835d);
                aVar5.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar5.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a3).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                m140302b(C103214y0.m136594j(aVar3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), booleanValue, 0.0f, 0, C110261c.m149878b(z, 1562682598, true, new C104679n(a, dVar2, aVar2)), z, 24576, 12);
                String str = dVar2.f157563e;
                float f = (float) 8;
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F(((float) 1.5d) * f);
                if (booleanValue) {
                    z.mo51557H(326640226);
                    i3 = C0966R.color.BW_100_Alpha_0_8;
                } else {
                    z.mo51557H(326640283);
                    i3 = C0966R.color.BW_100_Alpha_0_5;
                }
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b2 = C110954a.m151254b(i3, context);
                z.mo51565P();
                C104022q qVar = C104022q.f307650e;
                C107944f0.m146242c(str, C103214y0.m136592h(C103166l0.m136523g(aVar3, 0.0f, ((float) 0.75d) * f, 0.0f, 0.0f, 13, (Object) null), ((float) 4.25d) * f), b2, F, (C104020o) null, booleanValue ? C104022q.f307651f : C104022q.f307650e, (C104014i) null, 0, (C108014f) null, new C32659e(3), 0, 0, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 3120, LVBuffer.MAX_STRING_LENGTH, 56784);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55336o(dVar, aVar, i4));
        }
    }

    /* renamed from: g */
    public static final void m140307g(C55366y1 y1Var, C103953l0 l0Var, C65503j jVar, C108504h hVar, int i, int i2) {
        C65503j.C65504a aVar;
        C55366y1 y1Var2 = y1Var;
        C103953l0 l0Var2 = l0Var;
        C87412m.m108594g(y1Var2, "snsTemplateListState");
        C87412m.m108594g(l0Var2, "lazyListState");
        C108504h z = hVar.mo51623z(-2114682211);
        if ((i2 & 4) != 0) {
            int i3 = C65503j.f188489K0;
            aVar = C65503j.C65504a.f188490d;
        } else {
            aVar = jVar;
        }
        List<C55319n1> b = y1Var.mo76619b();
        C60655g0.m70933d(Integer.valueOf(l0Var.mo145571e()), b, new C55337p(y1Var2, l0Var2, (C15601d<? super C55337p>) null), z, 576);
        C103177n0 a = C103166l0.m136517a(((float) 0.75d) * ((float) 8), 0.0f, 2, (Object) null);
        C103937e.m138657b(C103214y0.m136591g(aVar, 0.0f, 1, (Object) null), l0Var, a, false, (C103111a.C103115d) null, (C111294a.C37634c) null, (C112195b0) null, false, new C55338q(b, y1Var2), z, (i & 112) | 384, WXWebReporter.KEY_TRY_FIX_DEX_FAILED);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55339r(y1Var, l0Var, aVar, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x00e3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m140308h(com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1 r4, fy3.C32226l r5, p175j0.C108504h r6, int r7) {
        /*
            r0 = -786992592(0xffffffffd1177230, float:-4.0653488E10)
            j0.h r6 = r6.mo51623z(r0)
            r0 = r7 & 14
            if (r0 != 0) goto L_0x0016
            boolean r0 = r6.mo51619x(r4)
            if (r0 == 0) goto L_0x0013
            r0 = 4
            goto L_0x0014
        L_0x0013:
            r0 = 2
        L_0x0014:
            r0 = r0 | r7
            goto L_0x0017
        L_0x0016:
            r0 = r7
        L_0x0017:
            r1 = r7 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0027
            boolean r1 = r6.mo51619x(r5)
            if (r1 == 0) goto L_0x0024
            r1 = 32
            goto L_0x0026
        L_0x0024:
            r1 = 16
        L_0x0026:
            r0 = r0 | r1
        L_0x0027:
            r0 = r0 & 91
            r1 = 18
            if (r0 != r1) goto L_0x0039
            boolean r0 = r6.mo51575a()
            if (r0 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            r6.mo51581d()
            goto L_0x0111
        L_0x0039:
            boolean r0 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55322c
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2 = 0
            if (r0 == 0) goto L_0x0074
            r0 = -226288694(0xfffffffff2831bca, float:-5.193745E30)
            r6.mo51557H(r0)
            r6.mo51557H(r1)
            boolean r0 = r6.mo51619x(r5)
            boolean r1 = r6.mo51619x(r4)
            r0 = r0 | r1
            java.lang.Object r1 = r6.mo51606q()
            if (r0 != 0) goto L_0x005f
            int r0 = p175j0.C108504h.f324828a
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r0) goto L_0x0067
        L_0x005f:
            com.tencent.mm.mj_template.sns.compose.widget.p1 r1 = new com.tencent.mm.mj_template.sns.compose.widget.p1
            r1.<init>(r5, r4)
            r6.mo51553F(r1)
        L_0x0067:
            r6.mo51565P()
            fy3.a r1 = (fy3.C32224a) r1
            m140305e(r1, r6, r2)
            r6.mo51565P()
            goto L_0x0111
        L_0x0074:
            boolean r0 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55320a
            if (r0 == 0) goto L_0x00ad
            r0 = -226288569(0xfffffffff2831c47, float:-5.1938204E30)
            r6.mo51557H(r0)
            r0 = r4
            com.tencent.mm.mj_template.sns.compose.widget.n1$a r0 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55320a) r0
            r6.mo51557H(r1)
            boolean r1 = r6.mo51619x(r5)
            boolean r3 = r6.mo51619x(r4)
            r1 = r1 | r3
            java.lang.Object r3 = r6.mo51606q()
            if (r1 != 0) goto L_0x0099
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r1) goto L_0x00a1
        L_0x0099:
            com.tencent.mm.mj_template.sns.compose.widget.q1 r3 = new com.tencent.mm.mj_template.sns.compose.widget.q1
            r3.<init>(r5, r4)
            r6.mo51553F(r3)
        L_0x00a1:
            r6.mo51565P()
            fy3.a r3 = (fy3.C32224a) r3
            m140301a(r0, r3, r6, r2)
            r6.mo51565P()
            goto L_0x0111
        L_0x00ad:
            boolean r0 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55321b
            if (r0 == 0) goto L_0x00be
            r0 = -226288394(0xfffffffff2831cf6, float:-5.193926E30)
            r6.mo51557H(r0)
            m140304d(r6, r2)
            r6.mo51565P()
            goto L_0x0111
        L_0x00be:
            boolean r0 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d
            if (r0 == 0) goto L_0x00f7
            r0 = -226288220(0xfffffffff2831da4, float:-5.1940313E30)
            r6.mo51557H(r0)
            r0 = r4
            com.tencent.mm.mj_template.sns.compose.widget.n1$d r0 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d) r0
            r6.mo51557H(r1)
            boolean r1 = r6.mo51619x(r5)
            boolean r3 = r6.mo51619x(r4)
            r1 = r1 | r3
            java.lang.Object r3 = r6.mo51606q()
            if (r1 != 0) goto L_0x00e3
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r1) goto L_0x00eb
        L_0x00e3:
            com.tencent.mm.mj_template.sns.compose.widget.r1 r3 = new com.tencent.mm.mj_template.sns.compose.widget.r1
            r3.<init>(r5, r4)
            r6.mo51553F(r3)
        L_0x00eb:
            r6.mo51565P()
            fy3.a r3 = (fy3.C32224a) r3
            m140306f(r0, r3, r6, r2)
            r6.mo51565P()
            goto L_0x0111
        L_0x00f7:
            boolean r0 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55325e
            if (r0 == 0) goto L_0x0108
            r0 = -226288040(0xfffffffff2831e58, float:-5.19414E30)
            r6.mo51557H(r0)
            m140303c(r6, r2)
            r6.mo51565P()
            goto L_0x0111
        L_0x0108:
            r0 = -226288010(0xfffffffff2831e76, float:-5.194158E30)
            r6.mo51557H(r0)
            r6.mo51565P()
        L_0x0111:
            j0.v1 r6 = r6.mo51596l()
            if (r6 != 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            com.tencent.mm.mj_template.sns.compose.widget.s1 r0 = new com.tencent.mm.mj_template.sns.compose.widget.s1
            r0.<init>(r4, r5, r7)
            r6.mo51650a(r0)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C104674o1.m140308h(com.tencent.mm.mj_template.sns.compose.widget.n1, fy3.l, j0.h, int):void");
    }
}
