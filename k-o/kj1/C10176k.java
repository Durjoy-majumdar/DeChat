package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import android.view.View;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import kotlin.ResultKt;
import lj1.C10535c;
import lj1.C10536d;
import nj3.C76912y0;
import nk1.C61791o;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C50415mk1;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.k */
public final class C10176k extends C10535c {

    /* renamed from: h */
    public final String f31131h;

    /* renamed from: kj1.k$a */
    public static final class C10177a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10177a(C10125e1 e1Var) {
            super(0);
            this.f31132d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C61926c.m72696u(((C54991o) this.f31132d.mo10534b(C54991o.class)).f154354q, 64));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorLinkMicOption$addItem$1$2", mo125469f = "AnchorLinkMicOption.kt", mo125470l = {163}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.k$b */
    public static final class C10178b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31133d;

        /* renamed from: e */
        public Object f31134e;

        /* renamed from: f */
        public int f31135f;

        /* renamed from: g */
        public /* synthetic */ boolean f31136g;

        /* renamed from: h */
        public final /* synthetic */ C10176k f31137h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f31138i;

        /* renamed from: kj1.k$b$a */
        public static final class C10179a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f31139d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f31140e;

            /* renamed from: f */
            public final /* synthetic */ C10176k f31141f;

            /* renamed from: g */
            public final /* synthetic */ SafeResume<Boolean> f31142g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10179a(boolean z, C10125e1 e1Var, C10176k kVar, SafeResume<Boolean> safeResume) {
                super(2);
                this.f31139d = z;
                this.f31140e = e1Var;
                this.f31141f = kVar;
                this.f31142g = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                C0073g0 g0Var = C0073g0.LINKMIC_SWITCH;
                Class cls = C54991o.class;
                Class cls2 = C54108o.class;
                String string = this.f31139d ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dxd) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dx_);
                C87412m.m108593f(string, "if (check) {\n           …                        }");
                C87412m.m108593f(this.f31139d ? this.f31140e.f30985d.getResources().getString(C0966R.string.drb) : this.f31140e.f30985d.getResources().getString(C0966R.string.dr_), "if (check) {\n           …                        }");
                if (booleanValue) {
                    ((C54963d0) this.f31140e.mo10534b(C54963d0.class)).f154079v = this.f31139d ? 1 : 0;
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5 j5Var = (C8777j5) c;
                    C0073g0 g0Var2 = C0073g0.LIVE_MIC_INTERCOM;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", this.f31139d ? "0" : "1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    C8777j5.C8778a.m8605f(j5Var, g0Var2, jSONObject.toString(), (String) null, 4, (Object) null);
                    if (!this.f31139d) {
                        C61791o.f175673a.mo86722d("disableLinkMic", ((C54991o) this.f31140e.mo10534b(cls)).f154354q);
                        Bundle bundle = new Bundle();
                        C10125e1 e1Var = this.f31140e;
                        bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", false);
                        e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_LINK_MIC_ANCHOR_SETTING, bundle);
                        if (this.f31140e.f30984c == 1) {
                            C7335d c2 = C86312j.m106911c(cls2);
                            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                            C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, String.valueOf(2), (String) null, 4, (Object) null);
                        }
                    } else {
                        C61791o.f175673a.mo86722d("enableLinkMic", ((C54991o) this.f31140e.mo10534b(cls)).f154354q);
                        Bundle bundle2 = new Bundle();
                        C10125e1 e1Var2 = this.f31140e;
                        bundle2.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", true);
                        e1Var2.mo10539g(C58124b.C58125b.FINDER_LIVE_LINK_MIC_ANCHOR_SETTING, bundle2);
                        if (this.f31140e.f30984c == 1) {
                            C7335d c3 = C86312j.m106911c(cls2);
                            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                            C8777j5.C8778a.m8605f((C8777j5) c3, g0Var, String.valueOf(1), (String) null, 4, (Object) null);
                        }
                    }
                    if (this.f31141f.mo10805j()) {
                        C7335d c4 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8606g((C8777j5) c4, this.f31139d ? C54067f0.C0064m.WHEAT_OPEN : C54067f0.C0064m.WHEAT_CLOSE, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
                    }
                } else {
                    MMActivity mMActivity = this.f31140e.f30985d;
                    C76912y0.m92763b(mMActivity, string + MMApplicationContext.getContext().getResources().getString(C0966R.string.f360496d80));
                }
                this.f31142g.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10178b(C10176k kVar, C10125e1 e1Var, C15601d<? super C10178b> dVar) {
            super(2, dVar);
            this.f31137h = kVar;
            this.f31138i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10178b bVar = new C10178b(this.f31137h, this.f31138i, dVar);
            bVar.f31136g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10178b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31135f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f31136g;
                C10536d.m10457e(this.f31137h, false, 1, (Object) null);
                C10125e1 e1Var = this.f31138i;
                C10176k kVar = this.f31137h;
                this.f31133d = e1Var;
                this.f31134e = kVar;
                this.f31136g = z;
                this.f31135f = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                SafeResume safeResume = new SafeResume(mVar);
                boolean u = C61926c.m72696u(((C54991o) e1Var.mo10534b(C54991o.class)).f154354q, 16384);
                String str = e1Var.f30980a;
                Log.m105924i(str, "enable/disable link mic. curEnableLinkMic:" + ((C54963d0) e1Var.mo10534b(C54963d0.class)).mo75902I3() + " isOpenMicIntercom: " + u);
                if ((u || C10209q.f31190a) && z) {
                    C76912y0.m92763b(e1Var.f30985d, MMApplicationContext.getContext().getResources().getString(C0966R.string.fps));
                    C10184l.f31150a = false;
                    safeResume.resume(Boolean.FALSE);
                } else {
                    C10184l.f31150a = z;
                    e1Var.mo10537e(64, z, kVar.mo10805j(), new C10179a(z, e1Var, kVar, safeResume));
                }
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10176k kVar2 = (C10176k) this.f31134e;
                C10125e1 e1Var2 = (C10125e1) this.f31133d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10176k(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31131h = mo10805j() ? "anchorlive.more.morefunction.connectmic" : "startlive.more.morefunction.connectmic";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31131h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C58969q b;
        C58969q b2;
        Class cls = C54991o.class;
        Class cls2 = C54963d0.class;
        C10125e1 e1Var = this.f31809a;
        C62042e eVar = C62042e.f176370a;
        boolean z = eVar.mo87027N0() && !eVar.mo87030O0();
        if (mo10805j()) {
            String str = e1Var.f30980a;
            StringBuilder sb = new StringBuilder();
            sb.append(!eVar.mo87048V0(e1Var.f30982b));
            sb.append(", ");
            sb.append(((C54963d0) e1Var.mo10534b(cls2)).f154080w);
            sb.append(',');
            sb.append(((C54963d0) e1Var.mo10534b(cls2)).f154081x);
            sb.append(", ");
            sb.append(!((C54991o) e1Var.mo10534b(cls)).mo75966J4());
            sb.append(", ");
            sb.append(!((C54991o) e1Var.mo10534b(cls)).f154305d3);
            Log.m105924i(str, sb.toString());
            if (eVar.mo87048V0(e1Var.f30982b) || !((C54963d0) e1Var.mo10534b(cls2)).f154080w || !((C54963d0) e1Var.mo10534b(cls2)).f154081x || ((C54991o) e1Var.mo10534b(cls)).mo75966J4() || ((C54991o) e1Var.mo10534b(cls)).f154305d3 || z) {
                return false;
            }
        } else {
            String str2 = e1Var.f30980a;
            StringBuilder sb4 = new StringBuilder();
            C10125e1.C10132d dVar = e1Var.f30989h;
            Long l = null;
            sb4.append(dVar != null ? Integer.valueOf(dVar.f31035a) : null);
            sb4.append(", ");
            C10125e1.C10132d dVar2 = e1Var.f30989h;
            if (!(dVar2 == null || (b2 = dVar2.mo10555b()) == null)) {
                l = Long.valueOf(b2.field_liveSwitchFlag);
            }
            sb4.append(l);
            Log.m105924i(str2, sb4.toString());
            C10125e1.C10132d dVar3 = e1Var.f30989h;
            if (!(dVar3 != null && dVar3.f31035a == 1)) {
                return false;
            }
            return C61926c.m72696u((int) ((dVar3 == null || (b = dVar3.mo10555b()) == null) ? 0 : b.field_liveSwitchFlag), 4);
        }
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C10125e1 e1Var2 = e1Var;
        C4191v0 v0Var2 = v0Var;
        C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var2, "<this>");
        C87412m.m108594g(v0Var2, "bottomSheet");
        View view = v0Var2.f18463f;
        boolean u = C61926c.m72696u(((C54991o) e1Var2.mo10534b(C54991o.class)).f154354q, 64);
        C62042e eVar = C62042e.f176370a;
        boolean z = eVar.mo87027N0() && !eVar.mo87030O0();
        String str = e1Var2.f30980a;
        Log.m105924i(str, "canShowLinkMic:$, linkMicEnable:" + u + ", isSecondDevice:" + z);
        View findViewById = view.findViewById(C0966R.C0970id.bss);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.m9f);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var2.mo10536d(view, C0966R.C0970id.o44, u);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10177a(e1Var2), new C10178b(this, e1Var2, (C15601d<? super C10178b>) null));
        }
        if (u) {
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.WHEAT_CLOSE, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
        } else {
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.WHEAT_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.f358547om1);
    }
}
