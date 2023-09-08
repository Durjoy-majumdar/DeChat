package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import android.content.Context;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103636j1;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C103691v;
import androidx.compose.p002ui.platform.C54195x1;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.paging.compose.C54222c;
import androidx.paging.compose.C54225d;
import ca0.C104344e0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import d14.C45252f;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kg3.C76577a;
import na0.C61630a;
import p009c2.C104258j0;
import p1165z.C112527l;
import p1165z.C112528m;
import p152f0.C107316e;
import p152f0.C107403r0;
import p152f0.C107409s0;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p267x.C111885b;
import p267x.C111907e1;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103161k;
import p435a0.C103165l;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p436a1.C103264s0;
import p436a1.C103266t0;
import p436a1.C103273w0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p486d2.C106974e;
import p502e0.C107074g;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32656a;
import p544h2.C32659e;
import p544h2.C32660g;
import p544h2.C32661i;
import p544h2.C32662j;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109880u0;
import p631o1.C109895y;
import p658q1.C110269a;
import p683s0.C110676d;
import p683s0.C36601l;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111699r;
import p735w1.C111703v;
import p735w1.C111705z;
import p735w1.C37958a;
import p868x0.C111979d;
import p869y0.C112339w;
import p869y0.C112341y;
import rx3.C13598b0;
import ta0.C110954a;
import te3.o74;
import um0.C22657f;
import va0.C111494a;
import va0.C111497b;
import va0.C111498c;
import va0.C111501d;
import va0.C111503f;
import va0.C14422e;
import wx3.C15601d;
import y04.C15925h;
import y04.C66483g;
import z04.C53732l;
import z04.C66716g;
import z04.C66723k;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n */
public final class C104671n {

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n$a */
    public static final class C55315a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C0125s f157539d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C0125s, C39623j.C39625b, C13598b0> f157540e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55315a(C0125s sVar, C32227p<? super C0125s, ? super C39623j.C39625b, C13598b0> pVar) {
            super(1);
            this.f157539d = sVar;
            this.f157540e = pVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            MusicSearchPanelKt$ComposableLifecycle$1$observer$1 musicSearchPanelKt$ComposableLifecycle$1$observer$1 = new MusicSearchPanelKt$ComposableLifecycle$1$observer$1(this.f157540e);
            this.f157539d.getLifecycle().addObserver(musicSearchPanelKt$ComposableLifecycle$1$observer$1);
            return new C55312m(this.f157539d, musicSearchPanelKt$ComposableLifecycle$1$observer$1);
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n$b */
    public static final class C55316b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0125s f157541d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C0125s, C39623j.C39625b, C13598b0> f157542e;

        /* renamed from: f */
        public final /* synthetic */ int f157543f;

        /* renamed from: g */
        public final /* synthetic */ int f157544g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55316b(C0125s sVar, C32227p<? super C0125s, ? super C39623j.C39625b, C13598b0> pVar, int i, int i2) {
            super(2);
            this.f157541d = sVar;
            this.f157542e = pVar;
            this.f157543f = i;
            this.f157544g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104671n.m140292a(this.f157541d, this.f157542e, (C108504h) obj, this.f157543f | 1, this.f157544g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n$c */
    public static final class C55317c extends C87413o implements C32227p<C0125s, C39623j.C39625b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55341p0 f157545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55317c(C55341p0 p0Var) {
            super(2);
            this.f157545d = p0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C39623j.C39625b bVar = (C39623j.C39625b) obj2;
            C87412m.m108594g((C0125s) obj, "lifecycleOwner");
            C87412m.m108594g(bVar, "event");
            if (bVar == C39623j.C39625b.ON_PAUSE) {
                C55341p0 p0Var = this.f157545d;
                p0Var.getClass();
                Log.m105924i("MicroMsg.MusicSearchPanel", "pausePlay: ");
                C61630a aVar = p0Var.f157611r;
                if (aVar != null) {
                    aVar.mo86578a();
                }
            } else if (bVar == C39623j.C39625b.ON_RESUME) {
                C55341p0 p0Var2 = this.f157545d;
                p0Var2.getClass();
                Log.m105924i("MicroMsg.MusicSearchPanel", "startPlay: ");
                C61630a aVar2 = p0Var2.f157611r;
                if (aVar2 != null) {
                    aVar2.mo86579b();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n$e */
    public static final class C55318e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104344e0 f157546d;

        /* renamed from: e */
        public final /* synthetic */ C55352s0 f157547e;

        /* renamed from: f */
        public final /* synthetic */ C0000n0 f157548f;

        /* renamed from: g */
        public final /* synthetic */ C55302j f157549g;

        /* renamed from: h */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f157550h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f157551i;

        /* renamed from: j */
        public final /* synthetic */ C32226l<C28971l<o74>, C13598b0> f157552j;

        /* renamed from: n */
        public final /* synthetic */ int f157553n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55318e(C104344e0 e0Var, C55352s0 s0Var, C0000n0 n0Var, C55302j jVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C32224a<C13598b0> aVar, C32226l<? super C28971l<o74>, C13598b0> lVar, int i) {
            super(2);
            this.f157546d = e0Var;
            this.f157547e = s0Var;
            this.f157548f = n0Var;
            this.f157549g = jVar;
            this.f157550h = pVar;
            this.f157551i = aVar;
            this.f157552j = lVar;
            this.f157553n = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104671n.m140293b(this.f157546d, this.f157547e, this.f157548f, this.f157549g, this.f157550h, this.f157551i, this.f157552j, (C108504h) obj, this.f157553n | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n$d */
    public static final class C104672d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54195x1 f310821d;

        /* renamed from: e */
        public final /* synthetic */ C55341p0 f310822e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f310823f;

        /* renamed from: g */
        public final /* synthetic */ int f310824g;

        /* renamed from: h */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f310825h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C28971l<o74>, C13598b0> f310826i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104672d(C54195x1 x1Var, C55341p0 p0Var, C32224a<C13598b0> aVar, int i, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C32226l<? super C28971l<o74>, C13598b0> lVar) {
            super(2);
            this.f310821d = x1Var;
            this.f310822e = p0Var;
            this.f310823f = aVar;
            this.f310824g = i;
            this.f310825h = pVar;
            this.f310826i = lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j h = C103214y0.m136592h(C103166l0.m136521e(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), ((float) 1) * ((float) 8), 0.0f, 2, (Object) null), (float) 520);
                hVar.mo51557H(-492369756);
                Object q = hVar.mo51606q();
                int i2 = C108504h.f324828a;
                Object obj3 = C108504h.C60656a.f172772a;
                if (q == obj3) {
                    q = new C112528m();
                    hVar.mo51553F(q);
                }
                hVar.mo51565P();
                C112527l lVar = (C112527l) q;
                C54195x1 x1Var = this.f310821d;
                hVar.mo51557H(1157296644);
                boolean x = hVar.mo51619x(x1Var);
                Object q2 = hVar.mo51606q();
                if (x || q2 == obj3) {
                    q2 = new C55293e0(x1Var);
                    hVar.mo51553F(q2);
                }
                hVar.mo51565P();
                C65503j c = C111940o.m152650c(h, lVar, (C111907e1) null, false, (String) null, (C111072h) null, (C32224a) q2, 28, (Object) null);
                C55341p0 p0Var = this.f310822e;
                C32224a<C13598b0> aVar = this.f310823f;
                int i3 = this.f310824g;
                C32227p<Boolean, Boolean, C13598b0> pVar = this.f310825h;
                C32226l<C28971l<o74>, C13598b0> lVar2 = this.f310826i;
                hVar.mo51557H(-483455358);
                C103111a.C103123l lVar3 = C103111a.f304237d;
                int i4 = C111294a.f333218a;
                C109895y a = C103157j.m136499a(lVar3, C111294a.C111295a.f333228j, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(c);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar2);
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
                    String str = ((o74) ((C28971l) ((C108494d2) p0Var.f157607n).getValue()).f79451a).f139006d;
                    C87412m.m108593f(str, "musicSearchPanelState.se…cInfo.value.data.music_id");
                    C104671n.m140299h(str, aVar, new C55295f0(pVar, p0Var, lVar2), hVar, (i3 >> 12) & 112);
                    C104671n.m140298g(p0Var, hVar, 8);
                    C104671n.m140297f(p0Var, hVar, 8);
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

    /* renamed from: a */
    public static final void m140292a(C0125s sVar, C32227p<? super C0125s, ? super C39623j.C39625b, C13598b0> pVar, C108504h hVar, int i, int i2) {
        C87412m.m108594g(pVar, "onEvent");
        C108504h z = hVar.mo51623z(-992749423);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= z.mo51619x(pVar) ? 32 : 16;
        }
        if (i3 == 1 && (i4 & 91) == 18 && z.mo51575a()) {
            z.mo51581d();
        } else {
            z.mo51559J();
            if ((i & 1) != 0 && !z.mo51582e()) {
                z.mo51581d();
            } else if (i3 != 0) {
                sVar = (C0125s) z.mo51598m(C103691v.f306270d);
            }
            z.mo51555G();
            C60655g0.m70930a(sVar, new C55315a(sVar, pVar), z, 8);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55316b(sVar, pVar, i, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.tencent.mm.mj_template.sns.compose.widget.p0} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004e, code lost:
        if (r6 == p175j0.C108504h.C60656a.f172772a) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m140293b(ca0.C104344e0 r17, com.tencent.p014mm.mj_template.sns.compose.widget.C55352s0 r18, a14.C0000n0 r19, com.tencent.p014mm.mj_template.sns.compose.widget.C55302j r20, fy3.C32227p<? super java.lang.Boolean, ? super java.lang.Boolean, rx3.C13598b0> r21, fy3.C32224a<rx3.C13598b0> r22, fy3.C32226l<? super com.tencent.p014mm.mj_template.sns.compose.widget.C28971l<te3.o74>, rx3.C13598b0> r23, p175j0.C108504h r24, int r25) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r12 = r21
            java.lang.String r0 = "musicSelectorTheme"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "scope"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "reporter"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "muteMusic"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "onCancelClick"
            r13 = r22
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "onConfirmClick"
            r14 = r23
            gy3.C87412m.m108594g(r14, r0)
            r0 = 1703801570(0x658df2e2, float:8.379176E22)
            r5 = r24
            j0.h r0 = r5.mo51623z(r0)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r5)
            boolean r5 = r0.mo51619x(r2)
            java.lang.Object r6 = r0.mo51606q()
            if (r5 != 0) goto L_0x0050
            int r5 = p175j0.C108504h.f324828a
            java.lang.Object r5 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r5) goto L_0x0058
        L_0x0050:
            com.tencent.mm.mj_template.sns.compose.widget.p0 r6 = new com.tencent.mm.mj_template.sns.compose.widget.p0
            r6.<init>(r3, r2, r12, r4)
            r0.mo51553F(r6)
        L_0x0058:
            r0.mo51565P()
            r7 = r6
            com.tencent.mm.mj_template.sns.compose.widget.p0 r7 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55341p0) r7
            androidx.compose.ui.platform.j1 r5 = androidx.compose.p002ui.platform.C103636j1.f306094a
            r6 = 8
            androidx.compose.ui.platform.x1 r6 = r5.mo144746a(r0, r6)
            r5 = 0
            com.tencent.mm.mj_template.sns.compose.widget.n$c r8 = new com.tencent.mm.mj_template.sns.compose.widget.n$c
            r8.<init>(r7)
            r9 = 0
            r15 = 1
            m140292a(r5, r8, r0, r9, r15)
            j0.g1[] r11 = new p175j0.C108502g1[r15]
            j0.f1<ca0.e0> r5 = ca0.C104353p.f308980a
            j0.g1 r5 = r5.mo159370b(r1)
            r11[r9] = r5
            r10 = -1602431070(0xffffffffa07cd7a2, float:-2.1416577E-19)
            com.tencent.mm.mj_template.sns.compose.widget.n$d r9 = new com.tencent.mm.mj_template.sns.compose.widget.n$d
            r5 = r9
            r8 = r22
            r1 = r9
            r9 = r25
            r2 = -1602431070(0xffffffffa07cd7a2, float:-2.1416577E-19)
            r10 = r21
            r16 = r11
            r11 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11)
            q0.a r1 = p415q0.C110261c.m149878b(r0, r2, r15, r1)
            r2 = 56
            r5 = r16
            p175j0.C108513w.m147056a(r5, r1, r0, r2)
            j0.v1 r9 = r0.mo51596l()
            if (r9 != 0) goto L_0x00a4
            goto L_0x00bd
        L_0x00a4:
            com.tencent.mm.mj_template.sns.compose.widget.n$e r10 = new com.tencent.mm.mj_template.sns.compose.widget.n$e
            r0 = r10
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo51650a(r10)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C104671n.m140293b(ca0.e0, com.tencent.mm.mj_template.sns.compose.widget.s0, a14.n0, com.tencent.mm.mj_template.sns.compose.widget.j, fy3.p, fy3.a, fy3.l, j0.h, int):void");
    }

    /* renamed from: c */
    public static final void m140294c(String str, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        String str2 = str;
        int i3 = i;
        C108504h z = hVar.mo51623z(617247122);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            long F = ((C108322d) z.mo51598m(C103645l0.f306124e)).mo143031F((float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3628l)));
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            long b = C110954a.m151254b(C0966R.color.al_, context);
            int i4 = C65503j.f188489K0;
            hVar2 = z;
            C107944f0.m146242c(str, C103166l0.m136523g(C65503j.C65504a.f188490d, 0.0f, ((float) 6) * ((float) 8), 0.0f, 0.0f, 13, (Object) null), b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, (i2 & 14) | 48, 0, 65520);
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C55326o(str, i));
        }
    }

    /* renamed from: d */
    public static final void m140295d(C108504h hVar, int i) {
        C32224a<C110269a> aVar;
        int i2 = i;
        C108504h z = hVar.mo51623z(1777298792);
        if (i2 != 0 || !z.mo51575a()) {
            int i3 = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
            C65503j g = C103166l0.m136523g(C103214y0.m136589e(C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null), 0.0f, 1, (Object) null), 0.0f, ((float) 14) * ((float) 8), 0.0f, 0.0f, 13, (Object) null);
            z.mo51557H(-483455358);
            C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar3);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(z, a, pVar);
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(z, dVar, pVar2);
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(z, oVar, pVar3);
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
                C32224a<C110269a> aVar4 = aVar3;
                C65503j a3 = C103161k.C103162a.m136505a(lVar, aVar2, 0.3f, false, 2, (Object) null);
                z.mo51557H(733328855);
                C111294a aVar5 = C111294a.C111295a.f333219a;
                C109895y c = C103141f.m136472c(aVar5, false, z, 0);
                z.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) z.mo51598m(vVar);
                C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(a3);
                if (z.mo51543A() instanceof C24665d) {
                    z.mo51615v();
                    if (z.mo51621y()) {
                        aVar = aVar4;
                        z.mo51612t(aVar);
                    } else {
                        aVar = aVar4;
                        z.mo51579c();
                    }
                    z.mo51561L();
                    C111294a aVar6 = aVar5;
                    C32227p<C110269a, C109895y, C13598b0> pVar8 = pVar7;
                    C108508o2.m147049a(z, c, pVar8);
                    C108508o2.m147049a(z, dVar2, pVar2);
                    C108508o2.m147049a(z, oVar2, pVar6);
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
                    C65503j.C65504a aVar7 = aVar2;
                    C32227p<C110269a, C109895y, C13598b0> pVar11 = pVar8;
                    C65503j a5 = C103161k.C103162a.m136505a(lVar, aVar7, 0.7f, false, 2, (Object) null);
                    z.mo51557H(733328855);
                    C109895y c2 = C103141f.m136472c(aVar6, false, z, 0);
                    z.mo51557H(-1323940314);
                    C108322d dVar3 = (C108322d) z.mo51598m(vVar);
                    C33183o oVar3 = (C33183o) z.mo51598m(vVar2);
                    C103633i2 i2Var3 = (C103633i2) z.mo51598m(vVar3);
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a6 = C109863q.m149330a(a5);
                    if (z.mo51543A() instanceof C24665d) {
                        z.mo51615v();
                        if (z.mo51621y()) {
                            z.mo51612t(aVar);
                        } else {
                            z.mo51579c();
                        }
                        z.mo51561L();
                        C108508o2.m147049a(z, c2, pVar11);
                        C108508o2.m147049a(z, dVar3, pVar9);
                        C108508o2.m147049a(z, oVar3, pVar10);
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
            l.mo51650a(new C55340p(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0129, code lost:
        if (r7 == p175j0.C108504h.C60656a.f172772a) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m140296e(float r28, java.lang.String r29, java.lang.String r30, fy3.C32224a r31, boolean r32, java.lang.String r33, fy3.C32224a r34, p175j0.C108504h r35, int r36, int r37) {
        /*
            r1 = r28
            r13 = r32
            r14 = r36
            r0 = 1209597640(0x4818fec8, float:156667.12)
            r2 = r35
            j0.h r0 = r2.mo51623z(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0016
            r2 = r14 | 6
            goto L_0x0026
        L_0x0016:
            r2 = r14 & 14
            if (r2 != 0) goto L_0x0025
            boolean r2 = r0.mo51588h(r1)
            if (r2 == 0) goto L_0x0022
            r2 = 4
            goto L_0x0023
        L_0x0022:
            r2 = 2
        L_0x0023:
            r2 = r2 | r14
            goto L_0x0026
        L_0x0025:
            r2 = r14
        L_0x0026:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x002f
            r2 = r2 | 48
            r15 = r29
            goto L_0x0041
        L_0x002f:
            r4 = r14 & 112(0x70, float:1.57E-43)
            r15 = r29
            if (r4 != 0) goto L_0x0041
            boolean r4 = r0.mo51619x(r15)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r2 = r2 | r4
        L_0x0041:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x004a
            r2 = r2 | 384(0x180, float:5.38E-43)
            r12 = r30
            goto L_0x005c
        L_0x004a:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r12 = r30
            if (r4 != 0) goto L_0x005c
            boolean r4 = r0.mo51619x(r12)
            if (r4 == 0) goto L_0x0059
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r2 = r2 | r4
        L_0x005c:
            r4 = r37 & 8
            if (r4 == 0) goto L_0x0065
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r10 = r31
            goto L_0x0077
        L_0x0065:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r10 = r31
            if (r4 != 0) goto L_0x0077
            boolean r4 = r0.mo51619x(r10)
            if (r4 == 0) goto L_0x0074
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r2 = r2 | r4
        L_0x0077:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x007e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0090
        L_0x007e:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r14
            if (r4 != 0) goto L_0x0090
            boolean r4 = r0.mo51586g(r13)
            if (r4 == 0) goto L_0x008d
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r2 = r2 | r4
        L_0x0090:
            r4 = r37 & 32
            if (r4 == 0) goto L_0x009a
            r4 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r4
            r11 = r33
            goto L_0x00ad
        L_0x009a:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r14
            r11 = r33
            if (r4 != 0) goto L_0x00ad
            boolean r4 = r0.mo51619x(r11)
            if (r4 == 0) goto L_0x00aa
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r2 = r2 | r4
        L_0x00ad:
            r4 = r37 & 64
            if (r4 == 0) goto L_0x00b5
            r5 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r5
            goto L_0x00c9
        L_0x00b5:
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r14
            if (r5 != 0) goto L_0x00c9
            r5 = r34
            boolean r6 = r0.mo51619x(r5)
            if (r6 == 0) goto L_0x00c5
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r2 = r2 | r6
            goto L_0x00cb
        L_0x00c9:
            r5 = r34
        L_0x00cb:
            r6 = r2
            r2 = 2995931(0x2db6db, float:4.198194E-39)
            r2 = r2 & r6
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r7) goto L_0x00e2
            boolean r2 = r0.mo51575a()
            if (r2 != 0) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            r0.mo51581d()
            r7 = r5
            goto L_0x01cf
        L_0x00e2:
            if (r4 == 0) goto L_0x00e8
            r2 = 0
            r27 = r2
            goto L_0x00ea
        L_0x00e8:
            r27 = r5
        L_0x00ea:
            if (r13 == 0) goto L_0x00fd
            r2 = -1390848227(0xffffffffad19571d, float:-8.716386E-12)
            r0.mo51557H(r2)
            j0.f1<ca0.e0> r2 = ca0.C104353p.f308980a
            java.lang.Object r2 = r0.mo51598m(r2)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r4 = r2.f308944c
            goto L_0x010d
        L_0x00fd:
            r2 = -1390848162(0xffffffffad19575e, float:-8.7164425E-12)
            r0.mo51557H(r2)
            j0.f1<ca0.e0> r2 = ca0.C104353p.f308980a
            java.lang.Object r2 = r0.mo51598m(r2)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r4 = r2.f308943b
        L_0x010d:
            r0.mo51565P()
            a1.w r2 = new a1.w
            r2.<init>(r4)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r7)
            boolean r2 = r0.mo51619x(r2)
            java.lang.Object r7 = r0.mo51606q()
            if (r2 != 0) goto L_0x012b
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r7 != r2) goto L_0x0146
        L_0x012b:
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            r16 = r4
            long r7 = p436a1.C103272w.m136780b(r16, r18, r19, r20, r21, r22, r23)
            a1.w r2 = new a1.w
            r2.<init>(r7)
            r0.mo51553F(r2)
            r7 = r2
        L_0x0146:
            r0.mo51565P()
            a1.w r7 = (p436a1.C103272w) r7
            long r7 = r7.f304517a
            r2 = 2131101709(0x7f06080d, float:1.7815835E38)
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r9, r3)
            long r23 = ta0.C110954a.m151254b(r2, r9)
            r2 = 2
            float r2 = (float) r2
            r3 = 8
            float r3 = (float) r3
            float r2 = r2 * r3
            e0.f r25 = p502e0.C107074g.m144958a(r2)
            int r2 = p721v0.C65503j.f188489K0
            if (r27 == 0) goto L_0x017f
            v0.j$a r16 = p721v0.C65503j.C65504a.f188490d
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 7
            r22 = 0
            r20 = r27
            v0.j r2 = p267x.C111940o.m152651d(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0196
        L_0x017f:
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            r9 = 11
            float r9 = (float) r9
            float r9 = r9 * r3
            v0.j r2 = p435a0.C103214y0.m136592h(r2, r9)
            v0.j r2 = p435a0.C103214y0.m136596l(r2, r1)
            float r3 = p436a1.C103272w.m136782d(r4)
            v0.j r2 = p868x0.C111976a.m152678a(r2, r3)
        L_0x0196:
            r16 = r2
            r19 = 0
            r21 = 0
            r22 = 0
            com.tencent.mm.mj_template.sns.compose.widget.q r9 = new com.tencent.mm.mj_template.sns.compose.widget.q
            r5 = 662891780(0x2782ed04, float:3.633922E-15)
            r2 = r9
            r3 = r29
            r4 = r30
            r1 = 662891780(0x2782ed04, float:3.633922E-15)
            r5 = r32
            r17 = r7
            r13 = r9
            r9 = r33
            r10 = r23
            r12 = r31
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r12)
            r2 = 1
            q0.a r23 = p415q0.C110261c.m149878b(r0, r1, r2, r13)
            r1 = 1572864(0x180000, float:2.204052E-39)
            r26 = 56
            r15 = r16
            r16 = r25
            r24 = r0
            r25 = r1
            p543h0.C107927c0.m146232a(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26)
            r7 = r27
        L_0x01cf:
            j0.v1 r10 = r0.mo51596l()
            if (r10 != 0) goto L_0x01d6
            goto L_0x01ef
        L_0x01d6:
            com.tencent.mm.mj_template.sns.compose.widget.r r11 = new com.tencent.mm.mj_template.sns.compose.widget.r
            r0 = r11
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo51650a(r11)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C104671n.m140296e(float, java.lang.String, java.lang.String, fy3.a, boolean, java.lang.String, fy3.a, j0.h, int, int):void");
    }

    /* renamed from: f */
    public static final void m140297f(C55341p0 p0Var, C108504h hVar, int i) {
        C55341p0 p0Var2 = p0Var;
        int i2 = i;
        C108504h z = hVar.mo51623z(-1769087608);
        C45252f fVar = (C45252f) ((C108494d2) p0Var2.f157610q).getValue();
        z.mo51557H(-112840764);
        C54222c a = fVar == null ? null : C54225d.m60913a(fVar, z, 8);
        z.mo51565P();
        if (a == null) {
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C104660d0(p0Var2, i2));
                return;
            }
            return;
        }
        float density = ((C108322d) z.mo51598m(C103645l0.f306124e)).getDensity();
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C60655g0.m70932c(a.mo75007c().f187304a, new C55350s(a, y0Var, (C15601d<? super C55350s>) null), z, 72);
        C65503j e = C103166l0.m136521e(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), 0.0f, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3895i6)), 1, (Object) null);
        boolean z2 = ((C32224a) y0Var.getValue()) != null;
        C32224a aVar = (C32224a) y0Var.getValue();
        if (aVar == null) {
            aVar = C1287t.f10386d;
        }
        C109880u0.m149371b(C111940o.m152651d(e, z2, (String) null, (C111072h) null, aVar, 6, (Object) null), new C104654b0(density, p0Var2, a), z, 0, 0);
        C33487v1 l2 = z.mo51596l();
        if (l2 != null) {
            l2.mo51650a(new C104655c0(p0Var2, i2));
        }
    }

    /* renamed from: g */
    public static final void m140298g(C55341p0 p0Var, C108504h hVar, int i) {
        C55341p0 p0Var2 = p0Var;
        C108504h z = hVar.mo51623z(-2108222352);
        C54195x1 a = C103636j1.f306094a.mo144746a(z, 8);
        C60690y0 y0Var = (C60690y0) C110676d.m150647a(new Object[0], (C36601l) null, (String) null, C55313m0.f157535d, z, 3080, 6);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            q = new C112339w();
            z.mo51553F(q);
        }
        z.mo51565P();
        C112339w wVar = (C112339w) q;
        C65503j a2 = C111979d.m152690a(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), C107074g.m144958a((float) 10));
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C65503j a3 = C112341y.m153266a(C111885b.m152607c(a2, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_1, context), (C103266t0) null, 2, (Object) null), wVar);
        C107409s0 s0Var = r22;
        C107409s0 s0Var2 = new C107409s0(0, false, 1, 3, 3, (C8480h) null);
        C55297g0 g0Var = new C55297g0(p0Var2, a, y0Var);
        C107403r0 r0Var = r36;
        C107403r0 r0Var2 = new C107403r0(g0Var, g0Var, g0Var, g0Var, g0Var, g0Var);
        int f = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3628l);
        long F = ((C108322d) z.mo51598m(C103645l0.f306124e)).mo143031F((float) C76577a.m92152c(MMApplicationContext.getContext(), f));
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108593f(context2, "getContext()");
        C111705z zVar = r29;
        C111705z zVar2 = new C111705z(C110954a.m151254b(C0966R.color.f356996ai0, context2), F, (C104022q) null, (C104020o) null, (C104021p) null, (C104014i) null, (String) null, 0, (C32656a) null, (C32661i) null, (C106974e) null, 0, (C108014f) null, (C103264s0) null, (C32659e) null, (C32660g) null, 0, (C32662j) null, 262140, (C8480h) null);
        C103273w0 w0Var = r3;
        Context context3 = MMApplicationContext.getContext();
        C87412m.m108593f(context3, "getContext()");
        C103273w0 w0Var2 = new C103273w0(C110954a.m151254b(C0966R.color.akw, context3), (C8480h) null);
        C55298h0 h0Var = r5;
        C55298h0 h0Var2 = new C55298h0(p0Var2, y0Var);
        C112339w wVar2 = wVar;
        C107316e.m145463a((String) y0Var.getValue(), h0Var, a3, false, false, zVar, s0Var, r0Var, true, 0, (C104258j0) null, (C32226l<? super C111703v, C13598b0>) null, (C112527l) null, w0Var, C110261c.m149878b(z, 1741349113, true, new C104668j0(y0Var)), z, 100663296, 24576, 7704);
        C60655g0.m70932c(C13598b0.f38549a, new C55309k0(wVar2, (C15601d<? super C55309k0>) null), z, 64);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C104670l0(p0Var2, i));
        }
    }

    /* renamed from: h */
    public static final void m140299h(String str, C32224a aVar, C32224a aVar2, C108504h hVar, int i) {
        int i2;
        C32224a aVar3;
        int i3;
        C108504h hVar2;
        String str2 = str;
        C32224a aVar4 = aVar;
        C32224a aVar5 = aVar2;
        int i4 = i;
        C108504h z = hVar.mo51623z(-721510651);
        if ((i4 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= z.mo51619x(aVar4) ? 32 : 16;
        }
        if ((i4 & C22657f.CTRL_INDEX) == 0) {
            i2 |= z.mo51619x(aVar5) ? 256 : 128;
        }
        int i5 = i2;
        if ((i5 & 731) != 146 || !z.mo51575a()) {
            C103111a.C103116e eVar = C103111a.f304241h;
            int i6 = C111294a.f333218a;
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            int i7 = C65503j.f188489K0;
            C65503j.C65504a aVar6 = C65503j.C65504a.f188490d;
            C65503j e = C103166l0.m136521e(C103214y0.m136591g(aVar6, 0.0f, 1, (Object) null), 0.0f, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3627k)), 1, (Object) null);
            z.mo51557H(693286680);
            C109895y a = C103199s0.m136579a(eVar, cVar, z, 54);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar7 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(e);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar7);
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
                z.mo51557H(-678309503);
                C65503j d = C111940o.m152651d(aVar6, false, (String) null, (C111072h) null, aVar, 7, (Object) null);
                String string = MMApplicationContext.getString(C0966R.string.f7926wf);
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F((float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3628l)));
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b = C110954a.m151254b(C0966R.color.f356996ai0, context);
                C87412m.m108593f(string, "str");
                C108504h hVar3 = z;
                C107944f0.m146242c(string, d, b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, 0, 0, 65520);
                String string2 = MMApplicationContext.getString(C0966R.string.jpv);
                long F2 = ((C108322d) z.mo51598m(vVar)).mo143031F((float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3628l)));
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                long b2 = C110954a.m151254b(C0966R.color.f356996ai0, context2);
                C87412m.m108593f(string2, "str");
                C107944f0.m146242c(string2, (C65503j) null, b2, F2, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, 0, 0, ShareElfFile.SectionHeader.SHN_COMMON);
                C111498c.C111499a aVar8 = C111498c.C111499a.f333809e;
                boolean z2 = str.length() > 0;
                String string3 = MMApplicationContext.getString(C0966R.string.f8014z_);
                C87412m.m108593f(string3, "app_finish.str");
                hVar2 = z;
                boolean z3 = z2;
                i3 = i4;
                String str3 = string3;
                aVar3 = aVar5;
                C111494a.m152003a(aVar2, (C65503j) null, aVar8, (C111501d) null, z3, str3, (C32227p<? super C108504h, ? super Integer, C13598b0>) null, hVar2, ((i5 >> 6) & 14) | 512, 74);
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
            z.mo51581d();
            hVar2 = z;
            i3 = i4;
            aVar3 = aVar5;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C104673n0(str2, aVar4, aVar3, i3));
        }
    }

    /* renamed from: i */
    public static final C37958a m140300i(String str, String str2, long j) {
        String str3;
        String str4 = str;
        String str5 = str2;
        Pattern compile = Pattern.compile("[.*+?^{}$()|\\[\\]]");
        C87412m.m108593f(compile, "compile(pattern)");
        C1286o0 o0Var = C1286o0.f10385d;
        C87412m.m108594g(str5, "input");
        C87412m.m108594g(o0Var, "transform");
        Matcher matcher = compile.matcher(str5);
        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
        C66716g a = C53732l.m60231a(matcher, 0, str5);
        if (a == null) {
            str3 = str2.toString();
        } else {
            int length = str2.length();
            StringBuilder sb = new StringBuilder(length);
            int i = 0;
            do {
                sb.append(str5, i, a.mo90753c().mo59687f0().intValue());
                sb.append((CharSequence) o0Var.invoke(a));
                i = a.mo90753c().mo59688g0().intValue() + 1;
                a = a.next();
                if (i >= length) {
                    break;
                }
            } while (a != null);
            if (i < length) {
                sb.append(str5, i, length);
            }
            str3 = sb.toString();
            C87412m.m108593f(str3, "sb.toString()");
        }
        C15925h b = C66723k.m78722b(new C66723k(str3), str4, 0, 2, (Object) null);
        C37958a.C37959a aVar = new C37958a.C37959a(0, 1, (C8480h) null);
        aVar.mo61449b(str4);
        C66483g.C66484a aVar2 = new C66483g.C66484a((C66483g) b);
        while (aVar2.hasNext()) {
            C66716g gVar = (C66716g) aVar2.next();
            aVar.mo61448a(new C111699r(j, 0, (C104022q) null, (C104020o) null, (C104021p) null, (C104014i) null, (String) null, 0, (C32656a) null, (C32661i) null, (C106974e) null, 0, (C108014f) null, (C103264s0) null, 16382, (C8480h) null), gVar.mo90753c().mo59687f0().intValue(), gVar.mo90753c().mo59688g0().intValue() + 1);
        }
        return aVar.mo61453f();
    }
}
