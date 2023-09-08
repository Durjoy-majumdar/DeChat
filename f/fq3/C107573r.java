package fq3;

import a14.C0000n0;
import a14.C53965x0;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import de3.C58258h;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gq3.C59629h;
import gq3.C59648q;
import gy3.C87412m;
import gy3.C87413o;
import ig3.C60282d;
import ig3.C60283e;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p004b0.C103937e;
import p004b0.C103953l0;
import p004b0.C54372f0;
import p009c2.C54652b0;
import p152f0.C58866q0;
import p157gk.C32467x;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p267x.C111885b;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p435a0.C103214y0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p502e0.C107074g;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p759y.C112195b0;
import p863r0.C63352a;
import p869y0.C112304b;
import p869y0.C112339w;
import p869y0.C112341y;
import p869y0.C66476a0;
import p869y0.C66478i;
import rx3.C13598b0;
import ta0.C110954a;
import um0.C22657f;
import va0.C111504g;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: fq3.r */
public final class C107573r {

    /* renamed from: fq3.r$b */
    public static final class C59291b extends C87413o implements C32226l<C66476a0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f169547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59291b(C60690y0<Boolean> y0Var) {
            super(1);
            this.f169547d = y0Var;
        }

        public Object invoke(Object obj) {
            C66476a0 a0Var = (C66476a0) obj;
            C87412m.m108594g(a0Var, LocaleUtil.ITALIAN);
            if (this.f169547d.getValue().booleanValue() != a0Var.mo90559a()) {
                this.f169547d.setValue(Boolean.valueOf(a0Var.mo90559a()));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$c */
    public static final class C59292c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169548d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<C59648q> f169549e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59292c(C59629h hVar, C60667k2<? extends C59648q> k2Var) {
            super(1);
            this.f169548d = hVar;
            this.f169549e = k2Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r14, r0)
                gq3.h r0 = r13.f169548d
                r0.getClass()
                int r1 = r14.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0016
                r1 = 1
                goto L_0x0017
            L_0x0016:
                r1 = 0
            L_0x0017:
                if (r1 == 0) goto L_0x0177
                androidx.lifecycle.z<java.util.ArrayList<gk.x>> r6 = r0.f170400d
                gk.z r0 = new gk.z
                r0.<init>()
                gk.r r1 = p157gk.C59503r.f170040a
                java.util.ArrayList r1 = r1.mo84586g(r14, r3)
                if (r1 == 0) goto L_0x0031
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                r4 = 0
                goto L_0x0032
            L_0x0031:
                r4 = 1
            L_0x0032:
                if (r4 == 0) goto L_0x0054
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "getLabelList: "
                r1.append(r4)
                r1.append(r14)
                java.lang.String r4 = " isNullOrEmpty"
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "MicroMsg.SearchConnectDataManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                java.util.ArrayList r0 = r0.mo84591a(r14)
                goto L_0x009b
            L_0x0054:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x005d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0091
                java.lang.Object r5 = r1.next()
                android.util.Pair r5 = (android.util.Pair) r5
                java.lang.Object r7 = r5.second
                java.lang.String r8 = "it.second"
                gy3.C87412m.m108593f(r7, r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                boolean r7 = r0.mo84592b(r7)
                if (r7 == 0) goto L_0x005d
                gk.x r7 = new gk.x
                java.lang.Object r9 = r5.first
                java.lang.String r10 = "it.first"
                gy3.C87412m.m108593f(r9, r10)
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r5 = r5.second
                gy3.C87412m.m108593f(r5, r8)
                java.util.List r5 = (java.util.List) r5
                r7.<init>(r9, r5)
                r4.add(r7)
                goto L_0x005d
            L_0x0091:
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto L_0x009d
                java.util.ArrayList r0 = r0.mo84591a(r14)
            L_0x009b:
                r7 = r0
                goto L_0x009e
            L_0x009d:
                r7 = r4
            L_0x009e:
                if (r7 == 0) goto L_0x00a8
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L_0x00a7
                goto L_0x00a8
            L_0x00a7:
                r3 = 0
            L_0x00a8:
                if (r3 == 0) goto L_0x00ac
                goto L_0x0173
            L_0x00ac:
                java.util.TreeMap r8 = new java.util.TreeMap
                gk.y<T> r0 = p157gk.C8327y.f27286d
                r8.<init>(r0)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r10 = r7.iterator()
                r11 = 0
            L_0x00bd:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x011b
                java.lang.Object r0 = r10.next()
                int r12 = r11 + 1
                if (r11 < 0) goto L_0x0116
                gk.x r0 = (p157gk.C32467x) r0
                java.lang.String r0 = r0.f86263a
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r1 = r14
                int r0 = z04.C112550d0.m153769E(r0, r1, r2, r3, r4, r5)
                r1 = -1
                if (r0 != r1) goto L_0x00e3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9.add(r0)
                goto L_0x0114
            L_0x00e3:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                boolean r1 = r8.containsKey(r1)
                if (r1 == 0) goto L_0x0101
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r8.get(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L_0x0114
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                r0.add(r1)
                goto L_0x0114
            L_0x0101:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r1.add(r2)
                r8.put(r0, r1)
            L_0x0114:
                r11 = r12
                goto L_0x00bd
            L_0x0116:
                sx3.C64197v.m75542k()
                r14 = 0
                throw r14
            L_0x011b:
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Set r0 = r8.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0128:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0156
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x013e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0128
                java.lang.Object r2 = r1.next()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r2 = r7.get(r2)
                r14.add(r2)
                goto L_0x013e
            L_0x0156:
                java.util.Iterator r0 = r9.iterator()
            L_0x015a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0172
                java.lang.Object r1 = r0.next()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                java.lang.Object r1 = r7.get(r1)
                r14.add(r1)
                goto L_0x015a
            L_0x0172:
                r7 = r14
            L_0x0173:
                r6.setValue(r7)
                goto L_0x0181
            L_0x0177:
                androidx.lifecycle.z<java.util.ArrayList<gk.x>> r14 = r0.f170400d
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r14.setValue(r0)
            L_0x0181:
                j0.k2<gq3.q> r14 = r13.f169549e
                java.lang.Object r14 = r14.getValue()
                gq3.q r14 = (gq3.C59648q) r14
                java.lang.String r14 = r14.name()
                gq3.q r0 = gq3.C59648q.NO_START
                java.lang.String r1 = "NO_START"
                boolean r14 = gy3.C87412m.m108589b(r14, r1)
                if (r14 != 0) goto L_0x01a1
                gq3.h r14 = r13.f169548d
                r14.getClass()
                androidx.lifecycle.z<gq3.q> r14 = r14.f170402f
                r14.setValue(r0)
            L_0x01a1:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: fq3.C107573r.C59292c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: fq3.r$d */
    public static final class C59293d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59293d(C59629h hVar) {
            super(1);
            this.f169550d = hVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            C60283e.f171878a.mo85271b(7);
            C60282d dVar = C60282d.f171857a;
            dVar.mo85266c(56);
            dVar.mo85266c(57);
            C59629h hVar = this.f169550d;
            List<String> list = C59629h.f170395E;
            hVar.mo84639e3(str, (List<Integer>) null);
            C60283e.f171890m = (long) 2;
            String valueOf = String.valueOf(System.currentTimeMillis());
            C87412m.m108594g(valueOf, "sessionId");
            C60283e.f171889l = valueOf;
            C60283e.f171901x = str;
            dVar.mo85269f();
            C60282d.f171867k = 1;
            dVar.mo85268e(str);
            dVar.mo85266c(52);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$e */
    public static final class C59294e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169551d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<C59648q> f169552e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<Boolean> f169553f;

        /* renamed from: g */
        public final /* synthetic */ C54652b0 f169554g;

        /* renamed from: h */
        public final /* synthetic */ C112339w f169555h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59294e(C59629h hVar, C60667k2<? extends C59648q> k2Var, C60690y0<Boolean> y0Var, C54652b0 b0Var, C112339w wVar) {
            super(0);
            this.f169551d = hVar;
            this.f169552e = k2Var;
            this.f169553f = y0Var;
            this.f169554g = b0Var;
            this.f169555h = wVar;
        }

        public Object invoke() {
            this.f169551d.mo84636J3("");
            String name = this.f169552e.getValue().name();
            C59648q qVar = C59648q.NO_START;
            if (!C87412m.m108589b(name, "NO_START")) {
                C59629h hVar = this.f169551d;
                hVar.getClass();
                hVar.f170402f.setValue(qVar);
            }
            if (!this.f169553f.getValue().booleanValue()) {
                if (this.f169554g == null) {
                    Log.m105920e("MicroMsg.ImageQuerySearchBar", "input service is null");
                }
                C54652b0 b0Var = this.f169554g;
                if (!(b0Var == null || b0Var.f153174b.get() == null)) {
                    b0Var.f153173a.mo145865e();
                }
                this.f169555h.mo164065a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$f */
    public static final class C59295f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66478i f169556d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f169557e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59295f(C66478i iVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f169556d = iVar;
            this.f169557e = aVar;
        }

        public Object invoke() {
            C60282d.f171857a.mo85266c(53);
            C66478i.C66479a.m78437a(this.f169556d, false, 1, (Object) null);
            this.f169557e.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$g */
    public static final class C59296g extends C87413o implements C32226l<C32467x, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169558d;

        /* renamed from: e */
        public final /* synthetic */ C66478i f169559e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59296g(C59629h hVar, C66478i iVar) {
            super(1);
            this.f169558d = hVar;
            this.f169559e = iVar;
        }

        public Object invoke(Object obj) {
            C32467x xVar = (C32467x) obj;
            C87412m.m108594g(xVar, LocaleUtil.ITALIAN);
            C60283e.f171878a.mo85271b(7);
            C60282d dVar = C60282d.f171857a;
            dVar.mo85266c(56);
            dVar.mo85266c(57);
            this.f169558d.mo84639e3(xVar.f86263a, xVar.f86264b);
            C60283e.f171890m = (long) 3;
            String valueOf = String.valueOf(System.currentTimeMillis());
            C87412m.m108594g(valueOf, "sessionId");
            C60283e.f171889l = valueOf;
            String str = xVar.f86263a;
            C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
            C60283e.f171893p = str;
            dVar.mo85269f();
            dVar.mo85268e(xVar.f86263a);
            C60282d.f171867k = 2;
            dVar.mo85266c(52);
            C66478i.C66479a.m78437a(this.f169559e, false, 1, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.view.item.SearchBarViewKt$ImageQuerySearchBar$1$3", mo125469f = "SearchBarView.kt", mo125470l = {142}, mo125471m = "invokeSuspend")
    /* renamed from: fq3.r$h */
    public static final class C59297h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f169560d;

        /* renamed from: e */
        public final /* synthetic */ C54652b0 f169561e;

        /* renamed from: f */
        public final /* synthetic */ C59629h f169562f;

        /* renamed from: g */
        public final /* synthetic */ C112339w f169563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59297h(C54652b0 b0Var, C59629h hVar, C112339w wVar, C15601d<? super C59297h> dVar) {
            super(2, dVar);
            this.f169561e = b0Var;
            this.f169562f = hVar;
            this.f169563g = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59297h(this.f169561e, this.f169562f, this.f169563g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59297h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f169560d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f169560d = 1;
                if (C53965x0.m60607b(200, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f169561e == null) {
                Log.m105920e("MicroMsg.ImageQuerySearchBar", "input service is null");
            }
            this.f169562f.f170399D = false;
            C54652b0 b0Var = this.f169561e;
            if (!(b0Var == null || b0Var.f153174b.get() == null)) {
                b0Var.f153173a.mo145865e();
            }
            this.f169563g.mo164065a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$i */
    public static final class C59298i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169564d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f169565e;

        /* renamed from: f */
        public final /* synthetic */ int f169566f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59298i(C59629h hVar, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f169564d = hVar;
            this.f169565e = aVar;
            this.f169566f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107573r.m145745b(this.f169564d, this.f169565e, (C108504h) obj, this.f169566f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$j */
    public static final class C59299j extends C87413o implements C32226l<C58866q0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66478i f169567d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f169568e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<String> f169569f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59299j(C66478i iVar, C32226l<? super String, C13598b0> lVar, C60667k2<String> k2Var) {
            super(1);
            this.f169567d = iVar;
            this.f169568e = lVar;
            this.f169569f = k2Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C58866q0) obj, "$this$$receiver");
            C66478i.C66479a.m78437a(this.f169567d, false, 1, (Object) null);
            C32226l<String, C13598b0> lVar = this.f169568e;
            String value = this.f169569f.getValue();
            C87412m.m108593f(value, "textState.value");
            lVar.invoke(value);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$k */
    public static final class C59300k extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f169570d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f169571e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59300k(C59629h hVar, C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f169570d = hVar;
            this.f169571e = lVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Class cls = C58258h.class;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            if (((C58258h) C86312j.m106911c(cls)).mo83005R2(str) || ((C58258h) C86312j.m106911c(cls)).mo83003L3(str)) {
                Log.m105924i("MicroMsg.ImageQuerySearchBar", "input is emoji, return");
            } else if (!TextUtils.equals(str, " ")) {
                this.f169570d.mo84636J3(str);
                this.f169571e.invoke(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$m */
    public static final class C59301m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f169572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59301m(C32224a<C13598b0> aVar) {
            super(0);
            this.f169572d = aVar;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f169572d;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$n */
    public static final class C59302n extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f169573d;

        /* renamed from: e */
        public final /* synthetic */ String f169574e;

        /* renamed from: f */
        public final /* synthetic */ String f169575f;

        /* renamed from: g */
        public final /* synthetic */ C59629h f169576g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<String, C13598b0> f169577h;

        /* renamed from: i */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f169578i;

        /* renamed from: j */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f169579j;

        /* renamed from: n */
        public final /* synthetic */ C111705z f169580n;

        /* renamed from: o */
        public final /* synthetic */ C111705z f169581o;

        /* renamed from: p */
        public final /* synthetic */ long f169582p;

        /* renamed from: q */
        public final /* synthetic */ boolean f169583q;

        /* renamed from: r */
        public final /* synthetic */ C32226l<String, C13598b0> f169584r;

        /* renamed from: s */
        public final /* synthetic */ C32224a<C13598b0> f169585s;

        /* renamed from: t */
        public final /* synthetic */ int f169586t;

        /* renamed from: u */
        public final /* synthetic */ int f169587u;

        /* renamed from: v */
        public final /* synthetic */ int f169588v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59302n(C65503j jVar, String str, String str2, C59629h hVar, C32226l<? super String, C13598b0> lVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar2, C111705z zVar, C111705z zVar2, long j, boolean z, C32226l<? super String, C13598b0> lVar2, C32224a<C13598b0> aVar, int i, int i2, int i3) {
            super(2);
            this.f169573d = jVar;
            this.f169574e = str;
            this.f169575f = str2;
            this.f169576g = hVar;
            this.f169577h = lVar;
            this.f169578i = pVar;
            this.f169579j = pVar2;
            this.f169580n = zVar;
            this.f169581o = zVar2;
            this.f169582p = j;
            this.f169583q = z;
            this.f169584r = lVar2;
            this.f169585s = aVar;
            this.f169586t = i;
            this.f169587u = i2;
            this.f169588v = i3;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C65503j jVar = this.f169573d;
            C65503j jVar2 = jVar;
            C107573r.m145746c(jVar2, this.f169574e, this.f169575f, this.f169576g, this.f169577h, this.f169578i, this.f169579j, this.f169580n, this.f169581o, this.f169582p, this.f169583q, this.f169584r, this.f169585s, (C108504h) obj, this.f169586t | 1, this.f169587u, this.f169588v);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$q */
    public static final class C59303q extends C87413o implements C32226l<C54372f0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C32467x> f169589d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C32467x, C13598b0> f169590e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59303q(ArrayList<C32467x> arrayList, C32226l<? super C32467x, C13598b0> lVar) {
            super(1);
            this.f169589d = arrayList;
            this.f169590e = lVar;
        }

        public Object invoke(Object obj) {
            C54372f0 f0Var = (C54372f0) obj;
            C87412m.m108594g(f0Var, "$this$LazyColumn");
            C54372f0.C54373a.m61063b(f0Var, this.f169589d.size(), (C32226l) null, (C32226l) null, C110261c.m149879c(1666582332, true, new C107578t(this.f169589d, this.f169590e)), 6, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$r */
    public static final class C59304r extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C32467x> f169591d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C32467x, C13598b0> f169592e;

        /* renamed from: f */
        public final /* synthetic */ int f169593f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59304r(ArrayList<C32467x> arrayList, C32226l<? super C32467x, C13598b0> lVar, int i) {
            super(2);
            this.f169591d = arrayList;
            this.f169592e = lVar;
            this.f169593f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107573r.m145748e(this.f169591d, this.f169592e, (C108504h) obj, this.f169593f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$a */
    public static final class C107574a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f321863d;

        /* renamed from: e */
        public final /* synthetic */ String f321864e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<String, C13598b0> f321865f;

        /* renamed from: g */
        public final /* synthetic */ String f321866g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<String, C13598b0> f321867h;

        /* renamed from: i */
        public final /* synthetic */ C59629h f321868i;

        /* renamed from: j */
        public final /* synthetic */ C32224a<C13598b0> f321869j;

        /* renamed from: n */
        public final /* synthetic */ int f321870n;

        /* renamed from: o */
        public final /* synthetic */ int f321871o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107574a(C65503j jVar, String str, C32226l<? super String, C13598b0> lVar, String str2, C32226l<? super String, C13598b0> lVar2, C59629h hVar, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f321863d = jVar;
            this.f321864e = str;
            this.f321865f = lVar;
            this.f321866g = str2;
            this.f321867h = lVar2;
            this.f321868i = hVar;
            this.f321869j = aVar;
            this.f321870n = i;
            this.f321871o = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107573r.m145744a(this.f321863d, this.f321864e, this.f321865f, this.f321866g, this.f321867h, this.f321868i, this.f321869j, (C108504h) obj, this.f321870n | 1, this.f321871o);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$l */
    public static final class C107575l extends C87413o implements C32228q<C32227p<? super C108504h, ? super Integer, ? extends C13598b0>, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<String> f321872d;

        /* renamed from: e */
        public final /* synthetic */ String f321873e;

        /* renamed from: f */
        public final /* synthetic */ C111705z f321874f;

        /* renamed from: g */
        public final /* synthetic */ int f321875g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107575l(C60667k2<String> k2Var, String str, C111705z zVar, int i) {
            super(3);
            this.f321872d = k2Var;
            this.f321873e = str;
            this.f321874f = zVar;
            this.f321875g = i;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C32227p pVar = (C32227p) obj;
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(pVar, "innerTextField");
            if ((intValue & 14) == 0) {
                intValue |= hVar.mo51619x(pVar) ? 4 : 2;
            }
            if ((intValue & 91) != 18 || !hVar.mo51575a()) {
                String value = this.f321872d.getValue();
                C87412m.m108593f(value, "textState.value");
                if (C112551y.m153811k(value)) {
                    String str = this.f321873e;
                    if (!(str == null || str.length() == 0)) {
                        hVar.mo51557H(-2026264481);
                        int i = C65503j.f188489K0;
                        C65503j f = C103214y0.m136590f(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null);
                        int i2 = C111294a.f333218a;
                        C111294a aVar = C111294a.C111295a.f333221c;
                        String str2 = this.f321873e;
                        C111705z zVar = this.f321874f;
                        int i3 = this.f321875g;
                        hVar.mo51557H(733328855);
                        C109895y c = C103141f.m136472c(aVar, false, hVar, 6);
                        hVar.mo51557H(-1323940314);
                        C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                        C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                        C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                        C110269a.f329831D0.getClass();
                        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(f);
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
                            pVar.invoke(hVar, Integer.valueOf(intValue & 14));
                            int i4 = i3;
                            C108504h hVar2 = hVar;
                            C111504g.m152005a(str2, (C65503j) null, 0, 0, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 1, (C32226l<? super C111703v, C13598b0>) null, zVar, hVar2, (i4 >> 6) & 14, ((i4 >> 9) & 458752) | 3120, 22526);
                            hVar2.mo51565P();
                            hVar2.mo51565P();
                            hVar2.mo51610s();
                            hVar2.mo51565P();
                            hVar2.mo51565P();
                            hVar2.mo51565P();
                        } else {
                            C108501g.m147000a();
                            throw null;
                        }
                    }
                }
                C108504h hVar3 = hVar;
                hVar3.mo51557H(-2026264128);
                pVar.invoke(hVar3, Integer.valueOf(intValue & 14));
                hVar3.mo51565P();
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$o */
    public static final class C107576o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f321876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107576o(C32224a<C13598b0> aVar) {
            super(0);
            this.f321876d = aVar;
        }

        public Object invoke() {
            this.f321876d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.r$p */
    public static final class C107577p extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f321877d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f321878e;

        /* renamed from: f */
        public final /* synthetic */ int f321879f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107577p(String str, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f321877d = str;
            this.f321878e = aVar;
            this.f321879f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107573r.m145747d(this.f321877d, this.f321878e, (C108504h) obj, this.f321879f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145744a(C65503j jVar, String str, C32226l<? super String, C13598b0> lVar, String str2, C32226l<? super String, C13598b0> lVar2, C59629h hVar, C32224a<C13598b0> aVar, C108504h hVar2, int i, int i2) {
        C87412m.m108594g(jVar, "modifier");
        C87412m.m108594g(str, "value");
        C87412m.m108594g(lVar, "onValueChange");
        C87412m.m108594g(str2, "placeHolder");
        C87412m.m108594g(lVar2, "onConfirm");
        C87412m.m108594g(hVar, "viewModel");
        C108504h z = hVar2.mo51623z(165242663);
        C32224a<C13598b0> aVar2 = (i2 & 64) != 0 ? null : aVar;
        C32227p<C108504h, Integer, C13598b0> pVar = C107556a.f321826a;
        m145746c(jVar, str, str2, hVar, lVar, C107556a.f321826a, C107556a.f321827b, (C111705z) null, (C111705z) null, 0, true, lVar2, aVar2, z, 1773568 | (i & 14) | (i & 112) | ((i >> 3) & C22657f.CTRL_INDEX) | (57344 & (i << 6)), ((i >> 9) & 112) | 6 | ((i >> 12) & C22657f.CTRL_INDEX), C22657f.CTRL_INDEX);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107574a(jVar, str, lVar, str2, lVar2, hVar, aVar2, i, i2));
        }
    }

    /* renamed from: b */
    public static final void m145745b(C59629h hVar, C32224a<C13598b0> aVar, C108504h hVar2, int i) {
        C59629h hVar3 = hVar;
        C87412m.m108594g(hVar3, "viewModel");
        C87412m.m108594g(aVar, "onBackClick");
        C108504h z = hVar2.mo51623z(383074299);
        z.mo51557H(1732794728);
        C60667k2<R> a = C63352a.m74693a(hVar3.f170400d, new ArrayList(), z, 72);
        z.mo51565P();
        C60667k2<String> k3 = hVar3.mo84644k3(z, 8);
        C60667k2<C59648q> j3 = hVar3.mo84643j3(z, 8);
        C66478i iVar = (C66478i) z.mo51598m(C103645l0.f306125f);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        int i2 = C108504h.f324828a;
        Object obj = C108504h.C60656a.f172772a;
        if (q == obj) {
            q = new C112339w();
            z.mo51553F(q);
        }
        z.mo51565P();
        C112339w wVar = (C112339w) q;
        C54652b0 b0Var = (C54652b0) z.mo51598m(C103645l0.f306131l);
        z.mo51557H(-492369756);
        Object q2 = z.mo51606q();
        if (q2 == obj) {
            q2 = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            z.mo51553F(q2);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q2;
        z.mo51557H(-483455358);
        int i3 = C65503j.f188489K0;
        C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
        C103111a aVar3 = C103111a.f304234a;
        C103111a.C103123l lVar = C103111a.f304237d;
        int i4 = C111294a.f333218a;
        C109895y a2 = C103157j.m136499a(lVar, C111294a.C111295a.f333228j, z, 0);
        z.mo51557H(-1323940314);
        C60686v vVar = C103645l0.f306124e;
        C108322d dVar = (C108322d) z.mo51598m(vVar);
        C60686v vVar2 = C103645l0.f306130k;
        C33183o oVar = (C33183o) z.mo51598m(vVar2);
        C60686v vVar3 = C103645l0.f306134o;
        C66478i iVar2 = iVar;
        C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
        C110269a.C110270a aVar4 = C110269a.f329831D0;
        aVar4.getClass();
        C54652b0 b0Var2 = b0Var;
        C32224a<C110269a> aVar5 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a3 = C109863q.m149330a(aVar2);
        C60667k2<C59648q> k2Var = j3;
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar5);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            aVar4.getClass();
            C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
            C108508o2.m147049a(z, a2, pVar);
            aVar4.getClass();
            C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
            C108508o2.m147049a(z, dVar, pVar2);
            aVar4.getClass();
            C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
            C108508o2.m147049a(z, oVar, pVar3);
            aVar4.getClass();
            C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
            C108508o2.m147049a(z, i2Var, pVar4);
            z.mo51590i();
            Object obj2 = obj;
            C60690y0 y0Var2 = y0Var;
            ((C35747b) a3).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            C112339w wVar2 = wVar;
            C65503j.C65504a aVar6 = aVar2;
            C65503j m = C103214y0.m136597m(C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null), (C111294a.C37634c) null, false, 3, (Object) null);
            float f = (float) 8;
            float f2 = ((float) 1) * f;
            C65503j g = C103166l0.m136523g(m, f2, 0.0f, ((float) 2) * f, 0.0f, 10, (Object) null);
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            z.mo51557H(693286680);
            float f3 = f2;
            C109895y a4 = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
            z.mo51557H(-1323940314);
            C108322d dVar2 = (C108322d) z.mo51598m(vVar);
            C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
            C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
            aVar4.getClass();
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a5 = C109863q.m149330a(g);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar5);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar4.getClass();
                C108508o2.m147049a(z, a4, pVar);
                aVar4.getClass();
                C108508o2.m147049a(z, dVar2, pVar2);
                aVar4.getClass();
                C108508o2.m147049a(z, oVar2, pVar3);
                aVar4.getClass();
                C108508o2.m147049a(z, i2Var2, pVar4);
                z.mo51590i();
                ((C35747b) a5).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-678309503);
                C103206u0 u0Var = C103206u0.f304394a;
                String value = k3.getValue();
                String string = MMApplicationContext.getString(hVar3.f170418y ? C0966R.string.m56 : C0966R.string.m55);
                C112339w wVar3 = wVar2;
                C65503j a6 = C112341y.m153266a(C103203t0.C103204a.m136583a(u0Var, aVar6, 1.0f, false, 2, (Object) null), wVar3);
                z.mo51557H(1157296644);
                C60690y0 y0Var3 = y0Var2;
                boolean x = z.mo51619x(y0Var3);
                Object q3 = z.mo51606q();
                if (x || q3 == obj2) {
                    q3 = new C59291b(y0Var3);
                    z.mo51553F(q3);
                }
                z.mo51565P();
                C65503j a7 = C112304b.m153184a(a6, (C32226l) q3);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                float f4 = ((float) 1.5d) * f;
                C65503j g2 = C103166l0.m136523g(C103214y0.m136592h(C111885b.m152606b(a7, C110954a.m151254b(C0966R.color.f2949a6, context), C107074g.m144958a(((float) 0.5d) * f)), ((float) 4.5d) * f), f3, 0.0f, f4, 0.0f, 10, (Object) null);
                C87412m.m108593f(value, "value");
                C60667k2<C59648q> k2Var2 = k2Var;
                C59292c cVar2 = new C59292c(hVar3, k2Var2);
                C87412m.m108593f(string, "getSearchHint()");
                C60686v vVar4 = vVar;
                C54652b0 b0Var3 = b0Var2;
                m145744a(g2, value, cVar2, string, new C59293d(hVar3), hVar, new C59294e(hVar, k2Var2, y0Var3, b0Var2, wVar3), z, 262144, 0);
                int i5 = C65503j.f188489K0;
                C65503j.C65504a aVar7 = aVar6;
                C103129b1.m136432a(C103214y0.m136596l(aVar7, f4), z, 6);
                C32224a<C13598b0> aVar8 = aVar;
                C66478i iVar3 = iVar2;
                C65503j d = C111940o.m152651d(aVar7, false, (String) null, (C111072h) null, new C59295f(iVar3, aVar8), 7, (Object) null);
                String string2 = MMApplicationContext.getString(C0966R.string.m54);
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                long b = C110954a.m151254b(C0966R.color.am4, context2);
                long F = ((C108322d) z.mo51598m(vVar4)).mo143031F(((float) 2.13d) * f);
                C87412m.m108593f(string2, "str");
                C112339w wVar4 = wVar3;
                C65503j jVar = d;
                C108504h hVar4 = z;
                C111504g.m152005a(string2, jVar, b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar4, LVBuffer.MAX_STRING_LENGTH, 0, 65520);
                hVar4.mo51565P();
                hVar4.mo51565P();
                hVar4.mo51610s();
                hVar4.mo51565P();
                hVar4.mo51565P();
                C103129b1.m136432a(C103214y0.m136592h(aVar7, f3), hVar4, 6);
                C59629h hVar5 = hVar;
                m145748e((ArrayList) a.getValue(), new C59296g(hVar5, iVar3), hVar4, 8);
                if (!hVar5.f170398C && hVar5.f170399D) {
                    C60655g0.m70932c("MicroMsg.ImageQuerySearchBar", new C59297h(b0Var3, hVar5, wVar4, (C15601d<? super C59297h>) null), hVar4, 70);
                }
                hVar4.mo51565P();
                hVar4.mo51565P();
                hVar4.mo51610s();
                hVar4.mo51565P();
                hVar4.mo51565P();
                C33487v1 l = hVar4.mo51596l();
                if (l != null) {
                    l.mo51650a(new C59298i(hVar5, aVar8, i));
                    return;
                }
                return;
            }
            C108501g.m147000a();
            throw null;
        }
        C108501g.m147000a();
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: fy3.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x034f, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x0351;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145746c(p721v0.C65503j r62, java.lang.String r63, java.lang.String r64, gq3.C59629h r65, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r66, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r67, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r68, p735w1.C111705z r69, p735w1.C111705z r70, long r71, boolean r73, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r74, fy3.C32224a<rx3.C13598b0> r75, p175j0.C108504h r76, int r77, int r78, int r79) {
        /*
            r4 = r65
            r5 = r66
            r13 = r74
            r15 = r79
            java.lang.String r0 = "modifier"
            r1 = r62
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "viewModel"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "onTextChange"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "onConfirm"
            gy3.C87412m.m108594g(r13, r0)
            r0 = -1120067223(0xffffffffbd3d2169, float:-0.04617444)
            r2 = r76
            j0.h r0 = r2.mo51623z(r0)
            r2 = r15 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x002f
            r2 = r3
            goto L_0x0031
        L_0x002f:
            r2 = r63
        L_0x0031:
            r6 = r15 & 4
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r3 = r64
        L_0x0038:
            r6 = r15 & 32
            if (r6 == 0) goto L_0x003e
            r6 = 0
            goto L_0x0040
        L_0x003e:
            r6 = r67
        L_0x0040:
            r8 = r15 & 64
            if (r8 == 0) goto L_0x0046
            r8 = 0
            goto L_0x0048
        L_0x0046:
            r8 = r68
        L_0x0048:
            r9 = r15 & 128(0x80, float:1.794E-43)
            r10 = 4611978752403166986(0x40010a3d70a3d70a, double:2.13)
            java.lang.String r12 = "getContext()"
            r14 = 8
            if (r9 == 0) goto L_0x00aa
            float r9 = (float) r10
            float r7 = (float) r14
            float r9 = r9 * r7
            j0.f1<i2.d> r7 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r7 = r0.mo51598m(r7)
            i2.d r7 = (p560i2.C108322d) r7
            long r19 = r7.mo143031F(r9)
            r7 = 2131099940(0x7f060124, float:1.7812247E38)
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r9, r12)
            long r17 = ta0.C110954a.m151254b(r7, r9)
            w1.z r7 = new w1.z
            r16 = r7
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 262140(0x3fffc, float:3.67336E-40)
            r41 = 0
            r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r39, r40, r41)
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r9 = r77 & r9
            r61 = r9
            r9 = r7
            r7 = r61
            goto L_0x00ae
        L_0x00aa:
            r9 = r69
            r7 = r77
        L_0x00ae:
            r14 = r15 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0103
            float r10 = (float) r10
            r11 = 8
            float r14 = (float) r11
            float r10 = r10 * r14
            j0.f1<i2.d> r11 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r11 = r0.mo51598m(r11)
            i2.d r11 = (p560i2.C108322d) r11
            long r19 = r11.mo143031F(r10)
            r10 = 2131100970(0x7f06052a, float:1.7814336E38)
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r11, r12)
            long r17 = ta0.C110954a.m151254b(r10, r11)
            w1.z r10 = new w1.z
            r16 = r10
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 262140(0x3fffc, float:3.67336E-40)
            r41 = 0
            r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r39, r40, r41)
            r11 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r11
            goto L_0x0105
        L_0x0103:
            r10 = r70
        L_0x0105:
            r11 = r15 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x011c
            r11 = 2131099931(0x7f06011b, float:1.781223E38)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r14, r12)
            long r11 = ta0.C110954a.m151254b(r11, r14)
            r14 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r7 = r7 & r14
            goto L_0x011e
        L_0x011c:
            r11 = r71
        L_0x011e:
            r14 = r15 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0124
            r14 = 0
            goto L_0x0126
        L_0x0124:
            r14 = r73
        L_0x0126:
            r1 = r15 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x012e
            r76 = r2
            r1 = 0
            goto L_0x0132
        L_0x012e:
            r1 = r75
            r76 = r2
        L_0x0132:
            r15 = 8
            j0.k2 r2 = r4.mo84644k3(r0, r15)
            r4.mo84643j3(r0, r15)
            j0.f1<y0.i> r15 = androidx.compose.p002ui.platform.C103645l0.f306125f
            java.lang.Object r15 = r0.mo51598m(r15)
            y0.i r15 = (p869y0.C66478i) r15
            int r16 = p721v0.C111294a.f333218a
            r68 = r8
            v0.a$c r8 = p721v0.C111294a.C111295a.f333227i
            r35 = r1
            r1 = r7 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r69 = r14
            r14 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo51557H(r14)
            a0.a r14 = p435a0.C103111a.f304234a
            a0.a$d r14 = p435a0.C103111a.f304235b
            int r16 = r1 >> 3
            r17 = r16 & 14
            r16 = r16 & 112(0x70, float:1.57E-43)
            r36 = r9
            r9 = r17 | r16
            o1.y r8 = p435a0.C103199s0.m136579a(r14, r8, r0, r9)
            int r9 = r1 << 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r14)
            j0.f1<i2.d> r14 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r16 = r0.mo51598m(r14)
            r71 = r14
            r14 = r16
            i2.d r14 = (p560i2.C108322d) r14
            r37 = r3
            j0.f1<i2.o> r3 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r16 = r0.mo51598m(r3)
            r72 = r3
            r3 = r16
            i2.o r3 = (p560i2.C33183o) r3
            r38 = r10
            j0.f1<androidx.compose.ui.platform.i2> r10 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r16 = r0.mo51598m(r10)
            r73 = r10
            r10 = r16
            androidx.compose.ui.platform.i2 r10 = (androidx.compose.p002ui.platform.C103633i2) r10
            q1.a$a r39 = p658q1.C110269a.f329831D0
            r39.getClass()
            fy3.a<q1.a> r4 = p658q1.C110269a.C110270a.f329833b
            fy3.q r16 = p631o1.C109863q.m149330a(r62)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r5 = 6
            r9 = r9 | r5
            j0.d r5 = r0.mo51543A()
            boolean r5 = r5 instanceof p175j0.C24665d
            if (r5 == 0) goto L_0x0465
            r0.mo51615v()
            boolean r5 = r0.mo51621y()
            if (r5 == 0) goto L_0x01c1
            r0.mo51612t(r4)
            goto L_0x01c4
        L_0x01c1:
            r0.mo51579c()
        L_0x01c4:
            r0.mo51561L()
            r39.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r5 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r8, r5)
            r39.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r8 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r14, r8)
            r39.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r14 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r3, r14)
            r39.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r3 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r10, r3)
            r0.mo51590i()
            j0.x1 r10 = new j0.x1
            r10.<init>(r0)
            int r17 = r9 >> 3
            r17 = r17 & 112(0x70, float:1.57E-43)
            r19 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r40 = r3
            r3 = r16
            q0.b r3 = (p415q0.C35747b) r3
            r3.invoke(r10, r0, r4)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r3)
            int r4 = r9 >> 9
            r4 = r4 & 14
            r9 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r0.mo51557H(r9)
            r4 = r4 & 11
            r9 = 2
            if (r4 != r9) goto L_0x0229
            boolean r4 = r0.mo51575a()
            if (r4 != 0) goto L_0x021e
            goto L_0x0229
        L_0x021e:
            r0.mo51581d()
        L_0x0221:
            r7 = r68
            r13 = r37
            r15 = r38
            goto L_0x0421
        L_0x0229:
            a0.u0 r4 = p435a0.C103206u0.f304394a
            r10 = 6
            int r1 = r1 >> r10
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r10
            r16 = r1 & 14
            if (r16 != 0) goto L_0x023c
            boolean r16 = r0.mo51619x(r4)
            if (r16 == 0) goto L_0x023b
            r9 = 4
        L_0x023b:
            r1 = r1 | r9
        L_0x023c:
            r1 = r1 & 91
            r9 = 18
            if (r1 != r9) goto L_0x024d
            boolean r1 = r0.mo51575a()
            if (r1 != 0) goto L_0x0249
            goto L_0x024d
        L_0x0249:
            r0.mo51581d()
            goto L_0x0221
        L_0x024d:
            r1 = 377887269(0x16861a25, float:2.1665367E-25)
            r0.mo51557H(r1)
            if (r6 != 0) goto L_0x0256
            goto L_0x0263
        L_0x0256:
            int r1 = r7 >> 15
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.invoke(r0, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0263:
            r0.mo51565P()
            java.lang.Object r1 = r2.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r16 = p721v0.C65503j.f188489K0
            v0.j$a r10 = p721v0.C65503j.C65504a.f188490d
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r24 = 2
            r25 = 0
            r20 = r4
            r21 = r10
            v0.j r26 = p435a0.C103203t0.C103204a.m136583a(r20, r21, r22, r23, r24, r25)
            r4 = 1
            float r9 = (float) r4
            r3 = 8
            float r3 = (float) r3
            float r27 = r9 * r3
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 14
            r32 = 0
            v0.j r18 = p435a0.C103166l0.m136523g(r26, r27, r28, r29, r30, r31, r32)
            a1.w0 r3 = new a1.w0
            r29 = r3
            r9 = 0
            r3.<init>(r11, r9)
            f0.s0 r42 = new f0.s0
            r22 = r42
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 3
            r47 = 7
            r48 = 0
            r42.<init>(r43, r44, r45, r46, r47, r48)
            f0.r0 r49 = new f0.r0
            r23 = r49
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            fq3.r$j r3 = new fq3.r$j
            r3.<init>(r15, r13, r2)
            r55 = 0
            r56 = 47
            r57 = 0
            r54 = r3
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57)
            java.lang.String r3 = "value"
            gy3.C87412m.m108593f(r1, r3)
            fq3.r$k r3 = new fq3.r$k
            r17 = r3
            r9 = r65
            r15 = r66
            r58 = r19
            r3.<init>(r9, r15)
            r19 = 0
            r20 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r3 = -377127652(0xffffffffe9857d1c, float:-2.0172243E25)
            fq3.r$l r9 = new fq3.r$l
            r13 = r37
            r15 = r38
            r9.<init>(r2, r13, r15, r7)
            q0.a r30 = p415q0.C110261c.m149878b(r0, r3, r4, r9)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = 458752(0x70000, float:6.42848E-40)
            int r16 = r7 >> 6
            r9 = r16 & r9
            r3 = r3 | r9
            r9 = 0
            r32 = r3 | 0
            r33 = 24576(0x6000, float:3.4438E-41)
            r34 = 7704(0x1e18, float:1.0796E-41)
            r16 = r1
            r21 = r36
            r31 = r0
            p152f0.C107316e.m145463a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r1 = r2.getValue()
            java.lang.String r2 = "textState.value"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0327
            goto L_0x0328
        L_0x0327:
            r4 = 0
        L_0x0328:
            if (r4 == 0) goto L_0x041f
            if (r69 == 0) goto L_0x041f
            r1 = 3
            r2 = 0
            r3 = 0
            v0.j r16 = p435a0.C103214y0.m136598n(r10, r3, r2, r1, r3)
            r17 = 0
            r18 = 0
            r19 = 0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r1)
            r1 = r35
            boolean r2 = r0.mo51619x(r1)
            java.lang.Object r3 = r0.mo51606q()
            if (r2 != 0) goto L_0x0351
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x0359
        L_0x0351:
            fq3.r$m r3 = new fq3.r$m
            r3.<init>(r1)
            r0.mo51553F(r3)
        L_0x0359:
            r0.mo51565P()
            r20 = r3
            fy3.a r20 = (fy3.C32224a) r20
            r21 = 7
            r22 = 0
            v0.j r2 = p267x.C111940o.m152651d(r16, r17, r18, r19, r20, r21, r22)
            int r3 = p721v0.C111294a.f333218a
            v0.a r3 = p721v0.C111294a.C111295a.f333221c
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo51557H(r4)
            r4 = 6
            r9 = 0
            o1.y r3 = p435a0.C103141f.m136472c(r3, r9, r0, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r4)
            r4 = r71
            java.lang.Object r4 = r0.mo51598m(r4)
            i2.d r4 = (p560i2.C108322d) r4
            r9 = r72
            java.lang.Object r9 = r0.mo51598m(r9)
            i2.o r9 = (p560i2.C33183o) r9
            r10 = r73
            java.lang.Object r10 = r0.mo51598m(r10)
            androidx.compose.ui.platform.i2 r10 = (androidx.compose.p002ui.platform.C103633i2) r10
            r39.getClass()
            fy3.q r2 = p631o1.C109863q.m149330a(r2)
            r35 = r1
            j0.d r1 = r0.mo51543A()
            boolean r1 = r1 instanceof p175j0.C24665d
            if (r1 == 0) goto L_0x041a
            r0.mo51615v()
            boolean r1 = r0.mo51621y()
            if (r1 == 0) goto L_0x03b6
            r1 = r58
            r0.mo51612t(r1)
            goto L_0x03b9
        L_0x03b6:
            r0.mo51579c()
        L_0x03b9:
            r0.mo51561L()
            r39.getClass()
            p175j0.C108508o2.m147049a(r0, r3, r5)
            r39.getClass()
            p175j0.C108508o2.m147049a(r0, r4, r8)
            r39.getClass()
            p175j0.C108508o2.m147049a(r0, r9, r14)
            r39.getClass()
            r1 = r40
            p175j0.C108508o2.m147049a(r0, r10, r1)
            r0.mo51590i()
            j0.x1 r1 = new j0.x1
            r1.<init>(r0)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            q0.b r2 = (p415q0.C35747b) r2
            r2.invoke(r1, r0, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r1)
            r1 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo51557H(r1)
            if (r68 != 0) goto L_0x03f9
            r7 = r68
            goto L_0x040a
        L_0x03f9:
            r1 = 18
            int r1 = r7 >> 18
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = r68
            r7.invoke(r0, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x040a:
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            goto L_0x0421
        L_0x041a:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        L_0x041f:
            r7 = r68
        L_0x0421:
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            j0.v1 r14 = r0.mo51596l()
            if (r14 != 0) goto L_0x0437
            goto L_0x0464
        L_0x0437:
            fq3.r$n r10 = new fq3.r$n
            r0 = r10
            r16 = r35
            r1 = r62
            r2 = r76
            r3 = r13
            r4 = r65
            r5 = r66
            r8 = r36
            r9 = r15
            r15 = r10
            r10 = r11
            r12 = r69
            r13 = r74
            r59 = r14
            r14 = r16
            r60 = r15
            r15 = r77
            r16 = r78
            r17 = r79
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            r0 = r59
            r1 = r60
            r0.mo51650a(r1)
        L_0x0464:
            return
        L_0x0465:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fq3.C107573r.m145746c(v0.j, java.lang.String, java.lang.String, gq3.h, fy3.l, fy3.p, fy3.p, w1.z, w1.z, long, boolean, fy3.l, fy3.a, j0.h, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: fy3.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x00a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145747d(java.lang.String r28, fy3.C32224a<rx3.C13598b0> r29, p175j0.C108504h r30, int r31) {
        /*
            r0 = r28
            r15 = r29
            r13 = r31
            java.lang.String r1 = "text"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "onClick"
            gy3.C87412m.m108594g(r15, r1)
            r1 = 1977428759(0x75dd2b17, float:5.607283E32)
            r2 = r30
            j0.h r14 = r2.mo51623z(r1)
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r14.mo51619x(r0)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r13
            goto L_0x0029
        L_0x0028:
            r1 = r13
        L_0x0029:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0039
            boolean r2 = r14.mo51619x(r15)
            if (r2 == 0) goto L_0x0036
            r2 = 32
            goto L_0x0038
        L_0x0036:
            r2 = 16
        L_0x0038:
            r1 = r1 | r2
        L_0x0039:
            r20 = r1
            r1 = r20 & 91
            r2 = 18
            if (r1 != r2) goto L_0x004f
            boolean r1 = r14.mo51575a()
            if (r1 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            r14.mo51581d()
            r24 = r14
            goto L_0x01e3
        L_0x004f:
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            r2 = 2131100971(0x7f06052b, float:1.7814339E38)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "getContext()"
            gy3.C87412m.m108593f(r3, r9)
            long r3 = ta0.C110954a.m151254b(r2, r3)
            r5 = 0
            r6 = 2
            r7 = 0
            r2 = r1
            v0.j r21 = p267x.C111885b.m152607c(r2, r3, r5, r6, r7)
            r2 = 4611978752403166986(0x40010a3d70a3d70a, double:2.13)
            float r2 = (float) r2
            r3 = 8
            float r10 = (float) r3
            float r11 = r2 * r10
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r22 = r11
            v0.j r2 = p435a0.C103166l0.m136523g(r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            r4 = 1
            r5 = 0
            v0.j r21 = p435a0.C103214y0.m136591g(r2, r3, r4, r5)
            r22 = 0
            r23 = 0
            r24 = 0
            r2 = 1157296644(0x44faf204, float:2007.563)
            r14.mo51557H(r2)
            boolean r2 = r14.mo51619x(r15)
            java.lang.Object r3 = r14.mo51606q()
            if (r2 != 0) goto L_0x00a9
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x00b1
        L_0x00a9:
            fq3.r$o r3 = new fq3.r$o
            r3.<init>(r15)
            r14.mo51553F(r3)
        L_0x00b1:
            r14.mo51565P()
            r25 = r3
            fy3.a r25 = (fy3.C32224a) r25
            r26 = 7
            r27 = 0
            v0.j r2 = p267x.C111940o.m152651d(r21, r22, r23, r24, r25, r26, r27)
            r3 = 7
            float r3 = (float) r3
            float r3 = r3 * r10
            v0.j r2 = p435a0.C103214y0.m136592h(r2, r3)
            int r3 = p721v0.C111294a.f333218a
            v0.a$c r3 = p721v0.C111294a.C111295a.f333227i
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo51557H(r4)
            a0.a r4 = p435a0.C103111a.f304234a
            a0.a$d r4 = p435a0.C103111a.f304235b
            r6 = 48
            o1.y r3 = p435a0.C103199s0.m136579a(r4, r3, r14, r6)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo51557H(r4)
            j0.f1<i2.d> r12 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r4 = r14.mo51598m(r12)
            i2.d r4 = (p560i2.C108322d) r4
            j0.f1<i2.o> r6 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r6 = r14.mo51598m(r6)
            i2.o r6 = (p560i2.C33183o) r6
            j0.f1<androidx.compose.ui.platform.i2> r7 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r7 = r14.mo51598m(r7)
            androidx.compose.ui.platform.i2 r7 = (androidx.compose.p002ui.platform.C103633i2) r7
            q1.a$a r8 = p658q1.C110269a.f329831D0
            r8.getClass()
            fy3.a<q1.a> r5 = p658q1.C110269a.C110270a.f329833b
            fy3.q r2 = p631o1.C109863q.m149330a(r2)
            j0.d r0 = r14.mo51543A()
            boolean r0 = r0 instanceof p175j0.C24665d
            if (r0 == 0) goto L_0x01f9
            r14.mo51615v()
            boolean r0 = r14.mo51621y()
            if (r0 == 0) goto L_0x011a
            r14.mo51612t(r5)
            goto L_0x011d
        L_0x011a:
            r14.mo51579c()
        L_0x011d:
            r14.mo51561L()
            r8.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r0 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r14, r3, r0)
            r8.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r0 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r14, r4, r0)
            r8.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r0 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r14, r6, r0)
            r8.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r0 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r14, r7, r0)
            r14.mo51590i()
            j0.x1 r0 = new j0.x1
            r0.<init>(r14)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            q0.b r2 = (p415q0.C35747b) r2
            r2.invoke(r0, r14, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo51557H(r0)
            r0 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r14.mo51557H(r0)
            r0 = 2131756442(0x7f10059a, float:1.9143792E38)
            r2 = 2131099699(0x7f060033, float:1.7811759E38)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r4, r9)
            long r4 = ta0.C110954a.m151254b(r2, r4)
            d1.c r2 = ta0.C110954a.m151253a(r0, r4, r14, r3)
            r0 = 3
            float r0 = (float) r0
            float r4 = r0 * r10
            r5 = 0
            r7 = 440(0x1b8, float:6.17E-43)
            r8 = 8
            r3 = r4
            r6 = r14
            fq3.C107559c.m145729b(r2, r3, r4, r5, r6, r7, r8)
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            float r0 = (float) r2
            float r0 = r0 * r10
            v0.j r0 = p435a0.C103214y0.m136596l(r1, r0)
            r1 = 6
            p435a0.C103129b1.m136432a(r0, r14, r1)
            java.lang.Object r0 = r14.mo51598m(r12)
            i2.d r0 = (p560i2.C108322d) r0
            long r4 = r0.mo143031F(r11)
            r0 = 2131099930(0x7f06011a, float:1.7812227E38)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r9)
            long r2 = ta0.C110954a.m151254b(r0, r1)
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r0 = r13
            r24 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r1 = r20 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r21 = r1
            r22 = 0
            r23 = 65522(0xfff2, float:9.1816E-41)
            r1 = r28
            r0 = r28
            r20 = r24
            r1 = 0
            va0.C111504g.m152005a(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r24.mo51565P()
            r24.mo51565P()
            r24.mo51610s()
            r24.mo51565P()
            r24.mo51565P()
        L_0x01e3:
            j0.v1 r0 = r24.mo51596l()
            if (r0 != 0) goto L_0x01ea
            goto L_0x01f8
        L_0x01ea:
            fq3.r$p r1 = new fq3.r$p
            r2 = r28
            r3 = r29
            r4 = r31
            r1.<init>(r2, r3, r4)
            r0.mo51650a(r1)
        L_0x01f8:
            return
        L_0x01f9:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fq3.C107573r.m145747d(java.lang.String, fy3.a, j0.h, int):void");
    }

    /* renamed from: e */
    public static final void m145748e(ArrayList<C32467x> arrayList, C32226l<? super C32467x, C13598b0> lVar, C108504h hVar, int i) {
        ArrayList<C32467x> arrayList2 = arrayList;
        C32226l<? super C32467x, C13598b0> lVar2 = lVar;
        C87412m.m108594g(lVar2, "onClick");
        C108504h z = hVar.mo51623z(-182850764);
        if (!(arrayList2 == null || arrayList.isEmpty())) {
            int i2 = C65503j.f188489K0;
            C103937e.m138656a(C103214y0.m136592h(C65503j.C65504a.f188490d, ((float) 28) * ((float) 8)), (C103953l0) null, (C103177n0) null, false, (C103111a.C103123l) null, (C111294a.C37633b) null, (C112195b0) null, false, new C59303q(arrayList, lVar2), z, 6, 254);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C59304r(arrayList, lVar2, i));
        }
    }
}
