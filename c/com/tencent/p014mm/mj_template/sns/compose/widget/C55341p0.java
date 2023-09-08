package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C45252f;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import ga0.C59402e;
import ga0.C59405g;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import kotlin.ResultKt;
import na0.C61630a;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p247u3.C14111b2;
import p247u3.C14117j1;
import p247u3.C14119k1;
import p247u3.C37336s1;
import p247u3.C65073j;
import p247u3.C65078l1;
import p247u3.C65081m1;
import p247u3.C65097o0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.o74;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.p0 */
public final class C55341p0 implements C24725u1 {

    /* renamed from: d */
    public final C0000n0 f157600d;

    /* renamed from: e */
    public final C55352s0 f157601e;

    /* renamed from: f */
    public final C32227p<Boolean, Boolean, C13598b0> f157602f;

    /* renamed from: g */
    public final C55302j f157603g;

    /* renamed from: h */
    public final C28971l<o74> f157604h;

    /* renamed from: i */
    public final C13601g f157605i = C36568h.m40985a(C55342a.f157613d);

    /* renamed from: j */
    public final C60690y0<C28971l<o74>> f157606j;

    /* renamed from: n */
    public final C60667k2<C28971l<o74>> f157607n;

    /* renamed from: o */
    public String f157608o;

    /* renamed from: p */
    public final C60690y0<C45252f<C65081m1<C28971l<o74>>>> f157609p;

    /* renamed from: q */
    public final C60667k2<C45252f<C65081m1<C28971l<o74>>>> f157610q;

    /* renamed from: r */
    public C61630a f157611r;

    /* renamed from: s */
    public boolean f157612s;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.p0$a */
    public static final class C55342a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C55342a f157613d = new C55342a();

        public C55342a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_music_search_direct_search_enabel, C104160f.RepairerConfig_Maas_DirectSearchEnable_Int, 1) != 1) {
                z = false;
            }
            Log.m105924i("MicroMsg.MaasAlbumTemplateGlobalConfig", "enableDirectSearch: " + z);
            return Boolean.valueOf(z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelState$onForgotten$1", mo125469f = "MusicSearchPanel.kt", mo125470l = {571}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.p0$b */
    public static final class C55343b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f157614d;

        /* renamed from: e */
        public final /* synthetic */ C55341p0 f157615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55343b(C55341p0 p0Var, C15601d<? super C55343b> dVar) {
            super(2, dVar);
            this.f157615e = p0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55343b(this.f157615e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55343b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157614d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C55341p0 p0Var = this.f157615e;
                C61630a aVar2 = p0Var.f157611r;
                if (aVar2 != null) {
                    if (!p0Var.f157612s) {
                        p0Var.f157602f.invoke(Boolean.FALSE, Boolean.TRUE);
                    }
                    this.f157614d = 1;
                    if (aVar2.mo86581d(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C55341p0(C0000n0 n0Var, C55352s0 s0Var, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C55302j jVar) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(s0Var, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(pVar, "muteMusic");
        C87412m.m108594g(jVar, "reporter");
        this.f157600d = n0Var;
        this.f157601e = s0Var;
        this.f157602f = pVar;
        this.f157603g = jVar;
        o74 o74 = new o74();
        o74.f139006d = "";
        o74.f139009g = "";
        o74.f139010h = "";
        o74.f139007e = "";
        C28971l<o74> lVar = new C28971l<>(o74, 0);
        this.f157604h = lVar;
        C60690y0<C28971l<o74>> c = C108500f2.m146996c(lVar, (C108497e2) null, 2, (Object) null);
        this.f157606j = c;
        this.f157607n = c;
        this.f157608o = "";
        C60690y0<C45252f<C65081m1<C28971l<o74>>>> c2 = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f157609p = c2;
        this.f157610q = c2;
    }

    /* renamed from: a */
    public static void m62893a(C55341p0 p0Var, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        p0Var.getClass();
        C87412m.m108594g(str, "keyword");
        Log.m105924i("MicroMsg.MusicSearchPanel", "search: " + str);
        if (str.length() == 0) {
            Log.m105928w("MicroMsg.MusicSearchPanel", "search: can not search empty keyword");
        } else if (C87412m.m108589b(p0Var.f157608o, str)) {
            Log.m105928w("MicroMsg.MusicSearchPanel", "search: now is searching this key");
        } else {
            C53895h.m60466d(p0Var.f157600d, (C66212f) null, (C53934p0) null, new C55345q0(p0Var, (C15601d<? super C55345q0>) null), 3, (Object) null);
            p0Var.f157608o = str;
            p0Var.f157603g.mo76612c(str);
            ((C108494d2) p0Var.f157606j).setValue(p0Var.f157604h);
            C55352s0 s0Var = p0Var.f157601e;
            if (s0Var == C55352s0.Sns) {
                C60690y0<C45252f<C65081m1<C28971l<o74>>>> y0Var = p0Var.f157609p;
                C65078l1 l1Var = new C65078l1(10, 0, false, 10, 0, 0, 50, (C8480h) null);
                C59402e eVar = new C59402e(str);
                ((C108494d2) y0Var).setValue(C65073j.m76697a(new C65097o0(eVar instanceof C14111b2 ? new C14117j1(eVar) : new C14119k1(eVar, (C15601d) null), null, l1Var, (C37336s1) null).f187369c, p0Var.f157600d));
            } else if (s0Var == C55352s0.Finder) {
                C60690y0<C45252f<C65081m1<C28971l<o74>>>> y0Var2 = p0Var.f157609p;
                C65078l1 l1Var2 = new C65078l1(10, 0, false, 10, 0, 0, 50, (C8480h) null);
                C59405g gVar = new C59405g(str, j);
                ((C108494d2) y0Var2).setValue(C65073j.m76697a(new C65097o0(gVar instanceof C14111b2 ? new C14117j1(gVar) : new C14119k1(gVar, (C15601d) null), null, l1Var2, (C37336s1) null).f187369c, p0Var.f157600d));
            }
        }
    }

    /* renamed from: b */
    public void mo51625b() {
        Log.m105924i("MicroMsg.MusicSearchPanel", "onAbandoned: ");
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        Log.m105924i("MicroMsg.MusicSearchPanel", "onRemembered: ");
    }

    /* renamed from: d */
    public void mo51627d() {
        Log.m105924i("MicroMsg.MusicSearchPanel", "onForgotten: ");
        C53895h.m60466d(this.f157600d, (C66212f) null, (C53934p0) null, new C55343b(this, (C15601d<? super C55343b>) null), 3, (Object) null);
    }
}
