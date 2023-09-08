package com.tencent.p014mm.sns_compose.page;

import a14.C0000n0;
import android.content.Context;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C103691v;
import androidx.paging.compose.C54222c;
import androidx.paging.compose.C54225d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import kg3.C76577a;
import lh3.C99474g;
import oh3.C110040a;
import oh3.C110044g;
import p004b0.C103937e;
import p004b0.C103953l0;
import p004b0.C103960n0;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C108515x;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60655g0;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p247u3.C65081m1;
import p267x.C111885b;
import p267x.C111929l;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103161k;
import p435a0.C103165l;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p436a1.C103266t0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107927c0;
import p543h0.C107944f0;
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
import rx3.C13598b0;
import ta0.C110954a;
import um0.C22657f;
import va0.C111497b;
import va0.C111503f;
import va0.C111504g;
import va0.C14422e;
import wx3.C66217g;

/* renamed from: com.tencent.mm.sns_compose.page.k */
public final class C106620k {

    /* renamed from: com.tencent.mm.sns_compose.page.k$a */
    public static final class C57575a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57589s f164865d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f164866e;

        /* renamed from: f */
        public final /* synthetic */ int f164867f;

        /* renamed from: g */
        public final /* synthetic */ C99474g f164868g;

        /* renamed from: h */
        public final /* synthetic */ C54222c<C99474g> f164869h;

        /* renamed from: i */
        public final /* synthetic */ LifecycleScope f164870i;

        /* renamed from: j */
        public final /* synthetic */ int f164871j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57575a(C57589s sVar, C103953l0 l0Var, int i, C99474g gVar, C54222c<C99474g> cVar, LifecycleScope lifecycleScope, int i2) {
            super(2);
            this.f164865d = sVar;
            this.f164866e = l0Var;
            this.f164867f = i;
            this.f164868g = gVar;
            this.f164869h = cVar;
            this.f164870i = lifecycleScope;
            this.f164871j = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106620k.m143962a(this.f164865d, this.f164866e, this.f164867f, this.f164868g, this.f164869h, this.f164870i, (C108504h) obj, this.f164871j | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$c */
    public static final class C57576c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f164872d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<String> f164873e;

        /* renamed from: f */
        public final /* synthetic */ int f164874f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57576c(String str, C60690y0<String> y0Var, int i) {
            super(2);
            this.f164872d = str;
            this.f164873e = y0Var;
            this.f164874f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106620k.m143963b(this.f164872d, this.f164873e, (C108504h) obj, this.f164874f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$d */
    public static final class C57577d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f164875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57577d(int i) {
            super(2);
            this.f164875d = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106620k.m143964c((C108504h) obj, this.f164875d | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$e */
    public static final class C57578e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f164876d;

        /* renamed from: e */
        public final /* synthetic */ String f164877e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57578e(Context context, String str) {
            super(0);
            this.f164876d = context;
            this.f164877e = str;
        }

        public Object invoke() {
            Context context = this.f164876d;
            String str = this.f164877e;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "username");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$f */
    public static final class C57579f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f164878d;

        /* renamed from: e */
        public final /* synthetic */ String f164879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57579f(Context context, String str) {
            super(0);
            this.f164878d = context;
            this.f164879e = str;
        }

        public Object invoke() {
            Context context = this.f164878d;
            String str = this.f164879e;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "username");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$g */
    public static final class C57580g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f164880d;

        /* renamed from: e */
        public final /* synthetic */ int f164881e;

        /* renamed from: f */
        public final /* synthetic */ int f164882f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57580g(String str, int i, int i2) {
            super(2);
            this.f164880d = str;
            this.f164881e = i;
            this.f164882f = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106620k.m143965d(this.f164880d, this.f164881e, (C108504h) obj, this.f164882f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.k$b */
    public static final class C106621b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318608d;

        /* renamed from: e */
        public final /* synthetic */ int f318609e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<String> f318610f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106621b(String str, int i, C60690y0<String> y0Var) {
            super(2);
            this.f318608d = str;
            this.f318609e = i;
            this.f318610f = y0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                float f = (float) 8;
                float f2 = ((float) 3) * f;
                C65503j.C65504a aVar2 = aVar;
                float f3 = f2;
                C65503j g = C103166l0.m136523g(aVar2, f3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3618a)), f2, 0.0f, 8, (Object) null);
                String str = this.f318608d;
                int i = this.f318609e;
                hVar.mo51557H(-483455358);
                C109895y a = C103157j.m136499a(C103111a.f304237d, C111294a.C111295a.f333228j, hVar, 0);
                hVar.mo51557H(-1323940314);
                C60686v vVar = C103645l0.f306124e;
                C108322d dVar = (C108322d) hVar.mo51598m(vVar);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar3);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, a, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-1163856341);
                    C103129b1.m136432a(C103214y0.m136592h(aVar, ((float) 2) * f), hVar, 6);
                    long F = ((C108322d) hVar.mo51598m(vVar)).mo143031F(((float) 3.5d) * f);
                    C104022q qVar = C104022q.f307651f;
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C108504h hVar2 = hVar;
                    String str2 = str;
                    C107944f0.m146242c(str2, (C65503j) null, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_9, context), F, (C104020o) null, qVar, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, (i & 14) | 199680, 0, 65490);
                    C108504h hVar3 = hVar2;
                    hVar3.mo51557H(1597651100);
                    C65503j.C65504a aVar4 = aVar;
                    C103129b1.m136432a(C103214y0.m136592h(aVar4, ((float) 6) * f), hVar3, 6);
                    hVar3.mo51565P();
                    hVar3.mo51565P();
                    hVar3.mo51565P();
                    hVar3.mo51610s();
                    hVar3.mo51565P();
                    hVar3.mo51565P();
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

    /* renamed from: com.tencent.mm.sns_compose.page.k$h */
    public static final class C106622h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318611d;

        /* renamed from: e */
        public final /* synthetic */ C54222c<C99474g> f318612e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<String> f318613f;

        /* renamed from: g */
        public final /* synthetic */ C0000n0 f318614g;

        /* renamed from: h */
        public final /* synthetic */ C57589s f318615h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106622h(String str, C54222c<C99474g> cVar, C60690y0<String> y0Var, C0000n0 n0Var, C57589s sVar) {
            super(2);
            this.f318611d = str;
            this.f318612e = cVar;
            this.f318613f = y0Var;
            this.f318614g = n0Var;
            this.f318615h = sVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C103953l0 a = C103960n0.m138697a(0, 0, hVar, 0, 3);
                String str = this.f318611d;
                C54222c<C99474g> cVar = this.f318612e;
                C60690y0<String> y0Var = this.f318613f;
                C0000n0 n0Var = this.f318614g;
                C57589s sVar = this.f318615h;
                hVar.mo51557H(733328855);
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                int i2 = C111294a.f333218a;
                C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(aVar);
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
                    ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-2137368960);
                    C103953l0 l0Var = a;
                    C103937e.m138656a((C65503j) null, l0Var, (C103177n0) null, false, (C103111a.C103123l) null, (C111294a.C37633b) null, (C112195b0) null, false, new C57585p(cVar, y0Var, str, n0Var, sVar, a), hVar, 0, 253);
                    C87412m.m108593f(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    C110044g.m149553a(str, l0Var, (C65503j) null, 0, hVar, 0, 12);
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

    /* renamed from: com.tencent.mm.sns_compose.page.k$i */
    public static final class C106623i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57589s f318616d;

        /* renamed from: e */
        public final /* synthetic */ int f318617e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106623i(C57589s sVar, int i) {
            super(2);
            this.f318616d = sVar;
            this.f318617e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106620k.m143966e(this.f318616d, (C108504h) obj, this.f318617e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m143962a(C57589s sVar, C103953l0 l0Var, int i, C99474g gVar, C54222c<C99474g> cVar, LifecycleScope lifecycleScope, C108504h hVar, int i2) {
        C108504h hVar2;
        C99474g gVar2 = gVar;
        int i3 = i2;
        C87412m.m108594g(sVar, "withTaViewModel");
        C87412m.m108594g(l0Var, "lazyListState");
        C87412m.m108594g(gVar2, "itemBean");
        C87412m.m108594g(cVar, "lazyDemoItem");
        C87412m.m108594g(lifecycleScope, "scope");
        C108504h z = hVar.mo51623z(-1705881811);
        int i4 = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        float f = (float) 8;
        C65503j d = C103166l0.m136520d(aVar, ((float) 2) * f, ((float) 3) * f);
        z.mo51557H(-483455358);
        C103111a aVar2 = C103111a.f304234a;
        C103111a.C103123l lVar = C103111a.f304237d;
        int i5 = C111294a.f333218a;
        C111294a.C37633b bVar = C111294a.C111295a.f333228j;
        C109895y a = C103157j.m136499a(lVar, bVar, z, 0);
        z.mo51557H(-1323940314);
        C60686v vVar = C103645l0.f306124e;
        C108322d dVar = (C108322d) z.mo51598m(vVar);
        C60686v vVar2 = C103645l0.f306130k;
        C33183o oVar = (C33183o) z.mo51598m(vVar2);
        C60686v vVar3 = C103645l0.f306134o;
        C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
        C110269a.C110270a aVar3 = C110269a.f329831D0;
        aVar3.getClass();
        C32224a<C110269a> aVar4 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(d);
        C111294a.C37633b bVar2 = bVar;
        C60686v vVar4 = vVar3;
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar4);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            aVar3.getClass();
            C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
            C108508o2.m147049a(z, a, pVar);
            aVar3.getClass();
            C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
            C108508o2.m147049a(z, dVar, pVar2);
            aVar3.getClass();
            C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
            C108508o2.m147049a(z, oVar, pVar3);
            aVar3.getClass();
            C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
            C108508o2.m147049a(z, i2Var, pVar4);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            m143965d(gVar2.f291652a, gVar2.f291654c, z, 0);
            C32227p<C110269a, C33183o, C13598b0> pVar5 = pVar3;
            C32227p<C110269a, C109895y, C13598b0> pVar6 = pVar;
            C32227p<C110269a, C108322d, C13598b0> pVar7 = pVar2;
            C32227p<C110269a, C103633i2, C13598b0> pVar8 = pVar4;
            float f2 = f;
            C106602c.m143958l(sVar, l0Var, i, gVar, cVar, lifecycleScope, z, (57344 & i3) | 266248 | (i3 & 112) | (i3 & C22657f.CTRL_INDEX) | 32768);
            C65503j e = C103166l0.m136521e(aVar, ((float) 0.75d) * f2, 0.0f, 2, (Object) null);
            z.mo51557H(-483455358);
            C109895y a3 = C103157j.m136499a(lVar, bVar2, z, 0);
            z.mo51557H(-1323940314);
            C108322d dVar2 = (C108322d) z.mo51598m(vVar);
            C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
            C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar4);
            aVar3.getClass();
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(e);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar4);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar3.getClass();
                C108508o2.m147049a(z, a3, pVar6);
                aVar3.getClass();
                C108508o2.m147049a(z, dVar2, pVar7);
                aVar3.getClass();
                C108508o2.m147049a(z, oVar2, pVar5);
                aVar3.getClass();
                C108508o2.m147049a(z, i2Var2, pVar8);
                z.mo51590i();
                boolean z2 = false;
                ((C35747b) a4).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C99474g gVar3 = gVar;
                String str = gVar3.f291661j;
                float f3 = ((float) 1.75d) * f2;
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F(f3);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                C65503j.C65504a aVar5 = aVar;
                C108504h hVar3 = z;
                String str2 = str;
                C111504g.m152005a(str2, C103166l0.m136523g(aVar, 0.0f, ((float) 1) * f2, 0.0f, 0.0f, 13, (Object) null), C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context), F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, 3120, 0, 65520);
                if (gVar3.f291660i.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    String str3 = gVar3.f291660i;
                    long F2 = ((C108322d) hVar3.mo51598m(vVar)).mo143031F(f3);
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    hVar2 = hVar3;
                    C111504g.m152005a(str3, C103166l0.m136523g(aVar5, 0.0f, ((float) 0.5d) * f2, 0.0f, 0.0f, 13, (Object) null), C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context2), F2, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, 3120, 0, 65520);
                } else {
                    hVar2 = hVar3;
                }
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51610s();
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51610s();
                hVar2.mo51565P();
                hVar2.mo51565P();
                C33487v1 l = hVar2.mo51596l();
                if (l != null) {
                    l.mo51650a(new C57575a(sVar, l0Var, i, gVar, cVar, lifecycleScope, i2));
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

    /* renamed from: b */
    public static final void m143963b(String str, C60690y0<String> y0Var, C108504h hVar, int i) {
        int i2;
        String str2 = str;
        C60690y0<String> y0Var2 = y0Var;
        int i3 = i;
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(y0Var2, "withFriends");
        C108504h z = hVar.mo51623z(-925811484);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z.mo51619x(y0Var2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            int i4 = C65503j.f188489K0;
            C65503j g = C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C107927c0.m146232a(g, (C103266t0) null, C110954a.m151254b(C0966R.color.a7_, context), 0, (C111929l) null, 0.0f, C110261c.m149878b(z, 1542943264, true, new C106621b(str2, i2, y0Var2)), z, 1572870, 58);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C57576c(str2, y0Var2, i3));
        }
    }

    /* renamed from: c */
    public static final void m143964c(C108504h hVar, int i) {
        C32224a<C110269a> aVar;
        int i2 = i;
        C108504h z = hVar.mo51623z(-1109313816);
        if (i2 != 0 || !z.mo51575a()) {
            int i3 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
            C65503j g = C103166l0.m136523g(C103214y0.m136589e(C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null), 0.0f, 1, (Object) null), 0.0f, ((float) 14) * ((float) 8), 0.0f, 0.0f, 13, (Object) null);
            z.mo51557H(-483455358);
            C103111a aVar3 = C103111a.f304234a;
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
            C110269a.C110270a aVar4 = C110269a.f329831D0;
            aVar4.getClass();
            C32224a<C110269a> aVar5 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
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
                C108508o2.m147049a(z, a, pVar);
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
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C103165l lVar = C103165l.f304321a;
                C32227p<C110269a, C103633i2, C13598b0> pVar5 = pVar4;
                C32227p<C110269a, C33183o, C13598b0> pVar6 = pVar3;
                C32227p<C110269a, C109895y, C13598b0> pVar7 = pVar;
                C32224a<C110269a> aVar6 = aVar5;
                C65503j a3 = C103161k.C103162a.m136505a(lVar, aVar2, 0.3f, false, 2, (Object) null);
                z.mo51557H(733328855);
                C111294a aVar7 = C111294a.C111295a.f333219a;
                C109895y c = C103141f.m136472c(aVar7, false, z, 0);
                z.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) z.mo51598m(vVar);
                C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
                aVar4.getClass();
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(a3);
                if (z.mo51543A() instanceof C24665d) {
                    z.mo51615v();
                    if (z.mo51621y()) {
                        aVar = aVar6;
                        z.mo51612t(aVar);
                    } else {
                        aVar = aVar6;
                        z.mo51579c();
                    }
                    z.mo51561L();
                    aVar4.getClass();
                    C111294a aVar8 = aVar7;
                    C32227p<C110269a, C109895y, C13598b0> pVar8 = pVar7;
                    C108508o2.m147049a(z, c, pVar8);
                    aVar4.getClass();
                    C108508o2.m147049a(z, dVar2, pVar2);
                    aVar4.getClass();
                    C108508o2.m147049a(z, oVar2, pVar6);
                    aVar4.getClass();
                    C108508o2.m147049a(z, i2Var2, pVar5);
                    z.mo51590i();
                    ((C35747b) a4).invoke(new C33489x1(z), z, 0);
                    z.mo51557H(2058660585);
                    z.mo51557H(-2137368960);
                    z.mo51565P();
                    z.mo51565P();
                    z.mo51610s();
                    z.mo51565P();
                    z.mo51565P();
                    C32227p<C110269a, C108322d, C13598b0> pVar9 = pVar2;
                    C32227p<C110269a, C33183o, C13598b0> pVar10 = pVar6;
                    C111497b.m152004a((C65503j) null, (C111503f) null, (C14422e) null, z, 0, 7);
                    C32227p<C110269a, C109895y, C13598b0> pVar11 = pVar8;
                    C65503j a5 = C103161k.C103162a.m136505a(lVar, aVar2, 0.7f, false, 2, (Object) null);
                    z.mo51557H(733328855);
                    C109895y c2 = C103141f.m136472c(aVar8, false, z, 0);
                    z.mo51557H(-1323940314);
                    C108322d dVar3 = (C108322d) z.mo51598m(vVar);
                    C33183o oVar3 = (C33183o) z.mo51598m(vVar2);
                    C103633i2 i2Var3 = (C103633i2) z.mo51598m(vVar3);
                    aVar4.getClass();
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a6 = C109863q.m149330a(a5);
                    if (z.mo51543A() instanceof C24665d) {
                        z.mo51615v();
                        if (z.mo51621y()) {
                            z.mo51612t(aVar);
                        } else {
                            z.mo51579c();
                        }
                        z.mo51561L();
                        aVar4.getClass();
                        C108508o2.m147049a(z, c2, pVar11);
                        aVar4.getClass();
                        C108508o2.m147049a(z, dVar3, pVar9);
                        aVar4.getClass();
                        C108508o2.m147049a(z, oVar3, pVar10);
                        aVar4.getClass();
                        C108508o2.m147049a(z, i2Var3, pVar5);
                        z.mo51590i();
                        ((C35747b) a6).invoke(new C33489x1(z), z, 0);
                        z.mo51557H(2058660585);
                        z.mo51557H(-2137368960);
                        z.mo51565P();
                        z.mo51565P();
                        z.mo51610s();
                        z.mo51565P();
                        z.mo51565P();
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
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C57577d(i2));
        }
    }

    /* renamed from: d */
    public static final void m143965d(String str, int i, C108504h hVar, int i2) {
        int i3;
        C108504h hVar2;
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        C87412m.m108594g(str2, "username");
        C108504h z = hVar.mo51623z(-1293615731);
        if ((i5 & 14) == 0) {
            i3 = (z.mo51619x(str2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= z.mo51592j(i4) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !z.mo51575a()) {
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            float f = (float) 8;
            float f2 = ((float) 1) * f;
            float f3 = ((float) 0.75d) * f;
            C65503j g = C103166l0.m136523g(aVar, f3, 0.0f, f3, f2, 2, (Object) null);
            z.mo51557H(693286680);
            C103111a aVar2 = C103111a.f304234a;
            C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
            C110269a.C110270a aVar3 = C110269a.f329831D0;
            aVar3.getClass();
            C32224a<C110269a> aVar4 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar4);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar3.getClass();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(z, a, pVar);
                aVar3.getClass();
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(z, dVar, pVar2);
                aVar3.getClass();
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(z, oVar, pVar3);
                aVar3.getClass();
                C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                C108508o2.m147049a(z, i2Var, pVar4);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-678309503);
                Context context = (Context) z.mo51598m(C103691v.f306268b);
                C32227p<C110269a, C108322d, C13598b0> pVar5 = pVar2;
                C32227p<C110269a, C33183o, C13598b0> pVar6 = pVar3;
                C32227p<C110269a, C103633i2, C13598b0> pVar7 = pVar4;
                C60686v vVar4 = vVar;
                Context context2 = context;
                float f4 = f;
                C110040a.m149549a(str, ((float) 6) * f, (C65503j) null, new C57578e(context, str2), z, (i3 & 14) | 48, 4);
                z.mo51557H(1157296644);
                boolean x = z.mo51619x(str2);
                Object q = z.mo51606q();
                String str3 = "";
                if (x || q == C108504h.C60656a.f172772a) {
                    Log.m105924i("PlatformOp", "getDisplayName() called with: userName = " + str2);
                    z.mo51553F(str3);
                    q = str3;
                }
                z.mo51565P();
                String str4 = (String) q;
                Integer valueOf = Integer.valueOf(i);
                z.mo51557H(1157296644);
                boolean x2 = z.mo51619x(valueOf);
                Object q2 = z.mo51606q();
                if (x2 || q2 == C108504h.C60656a.f172772a) {
                    C87412m.m108594g(context2, "context");
                    Log.m105924i("PlatformOp", "getDisplayTime() called with: context = " + context2 + ", createTime = " + i4);
                    z.mo51553F(str3);
                } else {
                    str3 = q2;
                }
                z.mo51565P();
                String str5 = str3;
                C32227p<C110269a, C109895y, C13598b0> pVar8 = pVar;
                C32224a<C110269a> aVar5 = aVar4;
                C60686v vVar5 = vVar4;
                Context context3 = context2;
                C65503j g2 = C103166l0.m136523g(aVar, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                z.mo51557H(-483455358);
                C109895y a3 = C103157j.m136499a(C103111a.f304237d, C111294a.C111295a.f333228j, z, 0);
                z.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) z.mo51598m(vVar5);
                C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
                aVar3.getClass();
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(g2);
                if (z.mo51543A() instanceof C24665d) {
                    z.mo51615v();
                    if (z.mo51621y()) {
                        z.mo51612t(aVar5);
                    } else {
                        z.mo51579c();
                    }
                    z.mo51561L();
                    aVar3.getClass();
                    C108508o2.m147049a(z, a3, pVar8);
                    aVar3.getClass();
                    C108508o2.m147049a(z, dVar2, pVar5);
                    aVar3.getClass();
                    C108508o2.m147049a(z, oVar2, pVar6);
                    aVar3.getClass();
                    C108508o2.m147049a(z, i2Var2, pVar7);
                    z.mo51590i();
                    ((C35747b) a4).invoke(new C33489x1(z), z, 0);
                    z.mo51557H(2058660585);
                    z.mo51557H(-1163856341);
                    long F = ((C108322d) z.mo51598m(vVar5)).mo143031F(((float) 2.13d) * f4);
                    C104022q qVar = C104022q.f307650e;
                    C104022q qVar2 = C104022q.f307651f;
                    Context context4 = MMApplicationContext.getContext();
                    C87412m.m108593f(context4, "getContext()");
                    hVar2 = z;
                    C108504h hVar3 = hVar2;
                    C111504g.m152005a(str4, C111940o.m152651d(aVar, false, (String) null, (C111072h) null, new C57579f(context3, str2), 7, (Object) null), C110954a.m151254b(C0966R.color.BW_0_Alpha_0_9, context4), F, (C104020o) null, qVar2, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, 199680, 0, 65488);
                    long F2 = ((C108322d) hVar2.mo51598m(vVar5)).mo143031F(((float) 1.75d) * f4);
                    Context context5 = MMApplicationContext.getContext();
                    C87412m.m108593f(context5, "getContext()");
                    C107944f0.m146242c(str5, (C65503j) null, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context5), F2, (C104020o) null, C104022q.f307650e, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, 199680, 0, 65490);
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51610s();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51610s();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C57580g(str2, i4, i5));
        }
    }

    /* renamed from: e */
    public static final void m143966e(C57589s sVar, C108504h hVar, int i) {
        C57589s sVar2 = sVar;
        C87412m.m108594g(sVar2, "withTaViewModel");
        C108504h z = hVar.mo51623z(2131448713);
        C54222c<C65081m1<C99474g>> a = C54225d.m60913a(sVar2.f164906f, z, 8);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        Object obj = C108504h.C60656a.f172772a;
        if (q == obj) {
            q = C108500f2.m146996c("", (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        z.mo51557H(-492369756);
        Object q2 = z.mo51606q();
        if (q2 == obj) {
            String string = MMApplicationContext.getString(C0966R.string.jkj);
            C87412m.m108593f(string, "sns_withta_with_friends.str");
            q2 = String.format(string, Arrays.copyOf(new Object[]{""}, 1));
            C87412m.m108593f(q2, "format(format, *args)");
            z.mo51553F(q2);
        }
        z.mo51565P();
        String str = (String) q2;
        z.mo51557H(773894976);
        z.mo51557H(-492369756);
        Object q3 = z.mo51606q();
        if (q3 == obj) {
            C108515x xVar = new C108515x(C60655g0.m70937h(C66217g.f190253d, z));
            z.mo51553F(xVar);
            q3 = xVar;
        }
        z.mo51565P();
        C0000n0 n0Var = ((C108515x) q3).f324838d;
        z.mo51565P();
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C65503j c = C111885b.m152607c(aVar, C110954a.m151254b(C0966R.color.f2929c, context), (C103266t0) null, 2, (Object) null);
        C106622h hVar2 = r0;
        C106622h hVar3 = new C106622h(str, a, y0Var, n0Var, sVar);
        C108504h hVar4 = z;
        C107927c0.m146232a(c, (C103266t0) null, 0, 0, (C111929l) null, 0.0f, C110261c.m149878b(z, 1353434573, true, hVar2), hVar4, 1572864, 62);
        C33487v1 l = hVar4.mo51596l();
        if (l != null) {
            l.mo51650a(new C106623i(sVar2, i));
        }
    }
}
