package xk1;

import a14.C0000n0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import cj1.C54754f;
import cj1.C54768h6;
import cj1.C54795n5;
import cj1.C54820t;
import cl1.C0690t1;
import cl1.C0696x;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58121a;
import d60.C58124b;
import di3.C86312j;
import f40.C86709a0;
import fe1.C58961d;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C9002h2;
import il1.C9118u;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import np1.C61817a;
import o40.C61926c;
import op1.C62075a;
import op1.C62084h;
import p671qy.C63344h;
import qj1.C12282d7;
import qj1.C12453ii;
import qj1.C12693u2;
import qj1.C62660c;
import qj1.C62861l1;
import qj1.C63100x2;
import qo3.C12925w;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.C49047ct1;
import te3.C49712hj1;
import te3.C50266li0;
import te3.C50326ly0;
import te3.C51006qs1;
import te3.C51745vv0;
import te3.C52312zv0;
import te3.C64383g31;
import te3.u94;
import wg1.C65954a0;
import wg1.C66010g0;
import wg1.C66065o0;
import wg1.C66075s0;
import wg1.C66082t0;
import wg1.C66085u0;
import wg1.C66089v;
import wg1.C66096w;
import wg1.C66098w0;
import wg1.C66109y0;
import zc1.C66785b;

/* renamed from: xk1.m */
public final class C66331m extends UIComponent {

    /* renamed from: d */
    public final String f190941d = "FinderGameLivePostContextUIC";

    /* renamed from: e */
    public final C45795b f190942e;

    /* renamed from: f */
    public final LiveRoomControllerStore f190943f;

    /* renamed from: g */
    public final C54820t f190944g;

    /* renamed from: h */
    public final C13601g f190945h;

    /* renamed from: i */
    public C12282d7 f190946i;

    /* renamed from: j */
    public C12693u2 f190947j;

    /* renamed from: n */
    public C63100x2 f190948n;

    /* renamed from: o */
    public C62861l1 f190949o;

    /* renamed from: p */
    public final C13601g f190950p;

    /* renamed from: q */
    public ViewGroup f190951q;

    /* renamed from: r */
    public C12453ii f190952r;

    /* renamed from: s */
    public final C58124b f190953s;

    /* renamed from: xk1.m$d */
    public static final class C15758d extends C12282d7 {

        /* renamed from: V0 */
        public final /* synthetic */ C66331m f42484V0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15758d(C66331m mVar, View view, C56061i iVar, C12282d7.C12288c cVar) {
            super((ViewGroup) view, iVar, cVar);
            this.f42484V0 = mVar;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        }

        /* renamed from: D0 */
        public C54795n5 mo14476D0() {
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            return n5Var == null ? this.f42484V0.f190944g : n5Var;
        }
    }

    /* renamed from: xk1.m$a */
    public static final class C66332a extends C87413o implements C32224a<C66319l> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f190954d;

        /* renamed from: e */
        public final /* synthetic */ C66331m f190955e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66332a(AppCompatActivity appCompatActivity, C66331m mVar) {
            super(0);
            this.f190954d = appCompatActivity;
            this.f190955e = mVar;
        }

        public Object invoke() {
            C66319l lVar = new C66319l(this.f190954d, this.f190955e);
            lVar.setBuContext(this.f190955e.f190942e);
            return lVar;
        }
    }

    /* renamed from: xk1.m$b */
    public static final class C66333b extends C87413o implements C32224a<C61817a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f190956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66333b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f190956d = appCompatActivity;
        }

        public Object invoke() {
            return ((C66344r) C39818r.f106831a.mo62444c(this.f190956d).mo75002a(C66344r.class)).f190977d;
        }
    }

    /* renamed from: xk1.m$c */
    public static final class C66334c implements C58124b {

        /* renamed from: d */
        public final /* synthetic */ C66331m f190957d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f190958e;

        /* renamed from: xk1.m$c$a */
        public static final class C15757a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ View f42483d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15757a(View view) {
                super(0);
                this.f42483d = view;
            }

            public Object invoke() {
                View view = this.f42483d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostContextUIC$liveStatus$1$statusChange$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostContextUIC$liveStatus$1$statusChange$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return C13598b0.f38549a;
            }
        }

        public C66334c(C66331m mVar, AppCompatActivity appCompatActivity) {
            this.f190957d = mVar;
            this.f190958e = appCompatActivity;
        }

        public int getLiveRole() {
            return 1;
        }

        public boolean isLiving() {
            return true;
        }

        public void registerPlugin(C58121a aVar) {
        }

        public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
            C10125e1.C10132d dVar;
            Bundle bundle2 = bundle;
            Class cls = C54979h1.class;
            C12282d7.C12288c cVar = C12282d7.C12288c.ANCHOR_SELECT;
            Class cls2 = C66340p.class;
            Class cls3 = C66338o.class;
            C87412m.m108594g(bVar, "status");
            int ordinal = bVar.ordinal();
            boolean z = false;
            Integer num = null;
            if (ordinal == 27) {
                C61817a e3 = this.f190957d.mo90444e3();
                if (e3 != null) {
                    C54979h1 h1Var = (C54979h1) e3.f175774g.mo71262a(cls);
                    h1Var.f154110B = false;
                    h1Var.f154111C = null;
                    h1Var.f154146u = 0;
                    h1Var.f154140o.f127225a.clear();
                    C62660c cVar2 = e3.f175776i;
                    if (cVar2 != null) {
                        cVar2.mo10792g(8);
                    }
                }
            } else if (ordinal == 199) {
                C39818r rVar = C39818r.f106831a;
                C10125e1 e1Var = ((C15715a2) rVar.mo62444c(this.f190958e).mo75002a(C15715a2.class)).f42407i;
                C9118u uVar = (e1Var == null || (dVar = e1Var.f30989h) == null) ? null : dVar.f31037c;
                if (uVar == null) {
                    AppCompatActivity appCompatActivity = this.f190958e;
                    View findViewById = appCompatActivity.findViewById(16908290);
                    C87412m.m108593f(findViewById, "activity.findViewById(android.R.id.content)");
                    uVar = new C9118u(appCompatActivity, (ViewGroup) findViewById, (C45795b) null);
                    C0000n0 mainScope = this.f190957d.getMainScope();
                    C87412m.m108594g(mainScope, "scope");
                    uVar.f28732b.setScope(mainScope);
                    uVar.f28733c.setScope(mainScope);
                    C15715a2 a2Var = (C15715a2) rVar.mo62444c(this.f190958e).mo75002a(C15715a2.class);
                    a2Var.getClass();
                    C10125e1 e1Var2 = a2Var.f42407i;
                    C10125e1.C10132d dVar2 = e1Var2 != null ? e1Var2.f30989h : null;
                    if (dVar2 != null) {
                        dVar2.f31037c = uVar;
                    }
                }
                C9002h2 h2Var = uVar.f28733c;
                if (h2Var != null) {
                    h2Var.setFromWish(bundle2 != null ? bundle2.getBoolean("PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH") : false);
                }
                C50326ly0 ly02 = ((C0696x) this.f190957d.f190942e.mo71262a(C0696x.class)).f1644g;
                boolean z2 = true;
                if (ly02 == null || !ly02.f137707e) {
                    z2 = false;
                }
                if (z2) {
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY");
                    }
                    uVar.f28732b.mo9759e((C12925w) null, z);
                    return;
                }
                C9002h2 h2Var2 = uVar.f28733c;
                if (h2Var2 != null) {
                    h2Var2.mo9810c();
                }
            } else if (ordinal == 68) {
                C66331m mVar = this.f190957d;
                if (mVar.f190946i == null) {
                    C66331m mVar2 = this.f190957d;
                    mVar.f190946i = new C12282d7((ViewGroup) mVar2.mo90442c3(C0966R.C0970id.dms, mVar2.mo90445f3()), this.f190957d.mo90443d3(), cVar);
                    C12282d7 d7Var = this.f190957d.f190946i;
                    if (d7Var != null) {
                        d7Var.mo10792g(8);
                    }
                    C12282d7 d7Var2 = this.f190957d.f190946i;
                    if (d7Var2 != null) {
                        d7Var2.mo8357i0();
                    }
                }
            } else if (ordinal == 69) {
                C66331m mVar3 = this.f190957d;
                if (mVar3.f190946i == null) {
                    C66331m mVar4 = this.f190957d;
                    mVar3.f190946i = new C12282d7((ViewGroup) mVar4.mo90442c3(C0966R.C0970id.dms, mVar4.mo90445f3()), this.f190957d.mo90443d3(), cVar);
                    C12282d7 d7Var3 = this.f190957d.f190946i;
                    if (d7Var3 != null) {
                        d7Var3.mo10792g(8);
                    }
                    C12282d7 d7Var4 = this.f190957d.f190946i;
                    if (d7Var4 != null) {
                        d7Var4.mo8357i0();
                    }
                }
            } else if (ordinal == 100) {
                C62861l1 l1Var = this.f190957d.f190949o;
                if (l1Var != null) {
                    l1Var.mo87815b1();
                }
            } else if (ordinal != 101) {
                switch (ordinal) {
                    case 81:
                        C61817a e35 = this.f190957d.mo90444e3();
                        if (e35 != null) {
                            e35.mo86736C(bundle2);
                            return;
                        }
                        return;
                    case 82:
                        C61817a e36 = this.f190957d.mo90444e3();
                        if (e36 != null) {
                            e36.mo86735B(bundle2);
                            return;
                        }
                        return;
                    case 83:
                        C61817a e37 = this.f190957d.mo90444e3();
                        if (e37 != null) {
                            e37.mo86734A(bundle2);
                            return;
                        }
                        return;
                    case 84:
                        C61817a e38 = this.f190957d.mo90444e3();
                        if (e38 != null) {
                            e38.mo86740G();
                            return;
                        }
                        return;
                    case 85:
                        C61817a e39 = this.f190957d.mo90444e3();
                        if (e39 != null) {
                            e39.mo86743J(((C54979h1) this.f190957d.f190942e.mo71262a(cls)).f154140o, (Bundle) null);
                            return;
                        }
                        return;
                    default:
                        switch (ordinal) {
                            case 87:
                                C66338o oVar = (C66338o) C39818r.f106831a.mo62444c(this.f190958e).mo75002a(cls3);
                                oVar.mo90446c3().setVisibility(0);
                                C66089v vVar = oVar.f190964d;
                                if (vVar != null) {
                                    ((C65954a0) vVar).mo89996Y();
                                    return;
                                }
                                return;
                            case 88:
                                C66338o oVar2 = (C66338o) C39818r.f106831a.mo62444c(this.f190958e).mo75002a(cls3);
                                oVar2.mo90446c3().setVisibility(8);
                                C66089v vVar2 = oVar2.f190964d;
                                if (vVar2 != null) {
                                    ((C65954a0) vVar2).mo90007x();
                                    return;
                                }
                                return;
                            case 89:
                                C66331m mVar5 = this.f190957d;
                                C12693u2 u2Var = mVar5.f190947j;
                                if (u2Var != null) {
                                    View findViewById2 = mVar5.getRootView().findViewById(C0966R.C0970id.dvn);
                                    u2Var.mo12267b1(new C15757a(findViewById2));
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(4);
                                    View view = findViewById2;
                                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostContextUIC$liveStatus$1", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostContextUIC$liveStatus$1", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                }
                                return;
                            case 90:
                                C12693u2 u2Var2 = this.f190957d.f190947j;
                                if (u2Var2 != null) {
                                    u2Var2.mo10792g(8);
                                    return;
                                }
                                return;
                            case 91:
                                C63100x2 x2Var = this.f190957d.f190948n;
                                if (x2Var != null) {
                                    x2Var.mo10792g(0);
                                    C66109y0 y0Var = x2Var.f179062r;
                                    if (y0Var != null) {
                                        ((C66010g0) y0Var).mo90047P0(false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 92:
                                C63100x2 x2Var2 = this.f190957d.f190948n;
                                if (x2Var2 != null) {
                                    x2Var2.mo10792g(8);
                                    return;
                                }
                                return;
                            default:
                                switch (ordinal) {
                                    case 109:
                                        if (bundle2 != null) {
                                            num = Integer.valueOf(bundle2.getInt("PARAM_FINDER_LIVE_MUSIC_ID"));
                                        }
                                        C13604l<C54768h6, Integer> a = ((C54991o) this.f190957d.f190942e.mo71262a(C54991o.class)).f154232N2.mo75644a(num != null ? num.intValue() : 0);
                                        C54768h6 h6Var = (C54768h6) a.f38555d;
                                        if (h6Var != null) {
                                            C66089v vVar3 = ((C66338o) C39818r.f106831a.mo62444c(this.f190958e).mo75002a(cls3)).f190964d;
                                            if (vVar3 != null) {
                                                ((C65954a0) vVar3).mo89994O(h6Var, ((Number) a.f38556e).intValue(), false);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 110:
                                        C66340p pVar = (C66340p) C39818r.f106831a.mo62444c(this.f190958e).mo75002a(cls2);
                                        View view2 = pVar.f190971f;
                                        if (view2 != null) {
                                            C9556a aVar2 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                            aVar2.mo10233c(0);
                                            View view3 = view2;
                                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostSearchMusicUIC", "showSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostSearchMusicUIC", "showSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            C66075s0 s0Var = pVar.f190969d;
                                            if (s0Var != null) {
                                                ((C66085u0) s0Var).mo90137j();
                                                return;
                                            }
                                            return;
                                        }
                                        C87412m.m108603p("pluginView");
                                        throw null;
                                    case 111:
                                        View view4 = ((C66340p) C39818r.f106831a.mo62444c(this.f190958e).mo75002a(cls2)).f190971f;
                                        if (view4 != null) {
                                            C9556a aVar3 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                            aVar3.mo10233c(8);
                                            View view5 = view4;
                                            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostSearchMusicUIC", "hideSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostSearchMusicUIC", "hideSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            return;
                                        }
                                        C87412m.m108603p("pluginView");
                                        throw null;
                                    default:
                                        return;
                                }
                        }
                }
            } else {
                C62861l1 l1Var2 = this.f190957d.f190949o;
                if (l1Var2 != null) {
                    l1Var2.mo87813Z0();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66331m(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        bVar = bVar == null ? new C45795b("TAG") : bVar;
        this.f190942e = bVar;
        finderLiveService.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        this.f190943f = liveRoomControllerStore == null ? new LiveRoomControllerStore(bVar) : liveRoomControllerStore;
        this.f190944g = new C54820t(new WeakReference(appCompatActivity), bVar, (C49712hj1) null);
        this.f190945h = C36568h.m40985a(new C66333b(appCompatActivity));
        this.f190950p = C36568h.m40985a(new C66332a(appCompatActivity, this));
        this.f190953s = new C66334c(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public final View mo90442c3(int i, View view) {
        C87412m.m108594g(view, "root");
        View inflate = ((ViewStub) view.findViewById(i)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return inflate;
    }

    /* renamed from: d3 */
    public final C56061i mo90443d3() {
        return (C56061i) ((C36570n) this.f190950p).getValue();
    }

    /* renamed from: e3 */
    public final C61817a mo90444e3() {
        return (C61817a) ((C36570n) this.f190945h).getValue();
    }

    /* renamed from: f3 */
    public final ViewGroup mo90445f3() {
        ViewGroup viewGroup = this.f190951q;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("rootLayoutView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        C62075a aVar;
        C62084h hVar;
        C62084h hVar2;
        Class cls = C54991o.class;
        View findViewById = getActivity().findViewById(C0966R.C0970id.f358361en2);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.game_post_root)");
        this.f190951q = (ViewGroup) findViewById;
        C103766u uVar = this.f190942e.f123701h;
        C87412m.m108592e(uVar, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        uVar.mo145138f(C39623j.C39626c.RESUMED);
        if (getActivity().getIntent() != null) {
            C51006qs1 qs12 = new C51006qs1();
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("GameUserInfo");
            int i = 0;
            if (byteArrayExtra != null) {
                try {
                    qs12.parseFrom(byteArrayExtra);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            C49047ct1 ct12 = qs12.f140527i;
            if (ct12 != null) {
                ((C54991o) this.f190942e.mo71262a(cls)).f154340m3 = ct12.f131939d;
                C0690t1 t1Var = (C0690t1) this.f190942e.mo71262a(C0690t1.class);
                LinkedList<C51745vv0> linkedList = ct12.f131940e;
                C87412m.m108593f(linkedList, "it.visibility_file_list");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C51745vv0 byteArray : linkedList) {
                    arrayList.add(byteArray.toByteArray());
                }
                t1Var.f1627g = arrayList;
                ((C54991o) this.f190942e.mo71262a(cls)).f154180A2 = ct12.f131941f;
                C64383g31 g312 = new C64383g31();
                g312.f183271d = ct12.f131942g;
                g312.f183272e = ct12.f131943h;
                ((C54991o) this.f190942e.mo71262a(cls)).f154372u2 = g312;
                ((C54991o) this.f190942e.mo71262a(cls)).f154184B2 = ct12.f131944i;
                C54754f fVar = ((C54991o) this.f190942e.mo71262a(cls)).f154232N2;
                C52312zv0 zv02 = ct12.f131945j;
                fVar.mo75653j(zv02 != null ? zv02.f146240d : null);
                ((C54979h1) this.f190942e.mo71262a(C54979h1.class)).mo75943j3(ct12.f131947o != 1);
                String str = this.f190941d;
                Log.m105924i(str, "[saveFuncSwitchFlag] flags = " + ct12.f131948p);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, Long.valueOf(ct12.f131948p));
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC;
                u94 u94 = ct12.f131951s;
                i2.mo119677K(aVar2, Boolean.valueOf(u94 != null ? u94.f142690f : false));
                String str2 = this.f190941d;
                Log.m105924i(str2, "[saveGameLiveGlobalFlag] flags = " + ct12.f131954v);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, Integer.valueOf(ct12.f131954v));
                if (((C54991o) this.f190942e.mo71262a(cls)).f154354q == 0) {
                    C54991o oVar = (C54991o) this.f190942e.mo71262a(cls);
                    C50266li0 li02 = ct12.f131949q;
                    oVar.f154354q = li02 != null ? (int) li02.f137430d : 0;
                }
                C54991o oVar2 = (C54991o) this.f190942e.mo71262a(cls);
                C50266li0 li03 = ct12.f131949q;
                if (li03 != null) {
                    i = li03.f137431e;
                }
                oVar2.f154251S = i;
                ((C54991o) this.f190942e.mo71262a(cls)).f154256T = C61926c.m72696u(((C54991o) this.f190942e.mo71262a(cls)).f154251S, 16);
                ((C0696x) this.f190942e.mo71262a(C0696x.class)).mo659c3(ct12.f131950r);
                ((C54991o) this.f190942e.mo71262a(cls)).f154259T2 = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
                ((C63344h) C86312j.m106911c(C63344h.class)).mo88249xp();
                if (this.f190949o == null) {
                    View findViewById2 = mo90445f3().findViewById(C0966R.C0970id.nlt);
                    C87412m.m108593f(findViewById2, "rootLayoutView.findViewB…me_together_ui_root_stub)");
                    C62861l1 l1Var = new C62861l1((ViewGroup) findViewById2, mo90443d3());
                    this.f190949o = l1Var;
                    l1Var.mo10792g(8);
                    C62861l1 l1Var2 = this.f190949o;
                    if (l1Var2 != null) {
                        l1Var2.mo8357i0();
                    }
                }
                ((C54991o) this.f190942e.mo71262a(cls)).f154290Z3.setValue(Boolean.valueOf(ct12.f131952t));
                ((C54991o) this.f190942e.mo71262a(cls)).f154294a4 = ct12.f131953u;
            }
        }
        ((C54991o) this.f190942e.mo71262a(cls)).f154305d3 = true;
        Class cls2 = C66331m.class;
        View findViewById3 = findViewById(C0966R.C0970id.f358361en2);
        C39818r rVar = C39818r.f106831a;
        C45795b bVar = ((C66331m) rVar.mo62444c(getActivity()).mo75002a(cls2)).f190942e;
        C56061i d3 = ((C66331m) rVar.mo62444c(getActivity()).mo75002a(cls2)).mo90443d3();
        C87412m.m108593f(findViewById3, "rootView");
        ((C15715a2) rVar.mo62444c(getActivity()).mo75002a(C15715a2.class)).mo14435c3(2, findViewById3, d3, bVar);
        ((C15798z1) rVar.mo62444c(getActivity()).mo75002a(C15798z1.class)).mo14497c3(2, findViewById3, d3, bVar);
        ((C15717b2) rVar.mo62444c(getActivity()).mo75002a(C15717b2.class)).mo14441c3(2, findViewById3, d3, bVar);
        ((C15775s1) rVar.mo62444c(getActivity()).mo75002a(C15775s1.class)).mo14491d3(2, findViewById3, d3, bVar);
        C66344r rVar2 = (C66344r) rVar.mo62444c(getActivity()).mo75002a(C66344r.class);
        rVar2.getClass();
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0966R.C0970id.dz7);
        C54820t tVar = ((C66331m) rVar.mo62444c(rVar2.getActivity()).mo75002a(cls2)).f190944g;
        C56061i d35 = ((C66331m) rVar.mo62444c(rVar2.getActivity()).mo75002a(cls2)).mo90443d3();
        C87412m.m108593f(viewGroup, "view");
        C61817a aVar3 = r9;
        C66344r rVar3 = rVar2;
        C56061i iVar = d3;
        C61817a aVar4 = new C61817a(2, viewGroup, d3, bVar, tVar, new C15769q(viewGroup, d3, d35));
        rVar3.f190977d = aVar3;
        aVar3.mo86764t();
        C61817a aVar5 = rVar3.f190977d;
        if (aVar5 != null) {
            aVar5.mo86762r();
        }
        C61817a aVar6 = rVar3.f190977d;
        if (aVar6 != null) {
            aVar6.mo86763s();
        }
        C61817a aVar7 = rVar3.f190977d;
        if (!(aVar7 == null || (hVar2 = aVar7.f175761C) == null)) {
            hVar2.f176542s = aVar7;
        }
        if (!(aVar7 == null || (hVar = aVar7.f175763E) == null)) {
            hVar.f176542s = aVar7;
        }
        if (!(aVar7 == null || (aVar = aVar7.f175762D) == null)) {
            aVar.f176495n = aVar7;
        }
        C66338o oVar3 = (C66338o) rVar.mo62444c(getActivity()).mo75002a(C66338o.class);
        oVar3.getClass();
        if (oVar3.f190964d == null || oVar3.f190965e == null) {
            C56061i d36 = ((C66331m) rVar.mo62444c(oVar3.getActivity()).mo75002a(cls2)).mo90443d3();
            View findViewById4 = findViewById3.findViewById(C0966R.C0970id.f358092dd0);
            C87412m.m108593f(findViewById4, "rootView.findViewById<Vi…ive_anchor_music_ui_root)");
            oVar3.f190966f = (ViewGroup) findViewById4;
            Context context = findViewById3.getContext();
            C87412m.m108593f(context, "rootView.context");
            oVar3.f190964d = new C65954a0(context, bVar, iVar, new C66336n(iVar, d36, oVar3, oVar3.mo90446c3()));
            ViewGroup c3 = oVar3.mo90446c3();
            Context context2 = oVar3.mo90446c3().getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            oVar3.f190965e = new C66065o0(c3, (MMActivity) context2, bVar, oVar3.f190964d);
        }
        C66089v vVar = oVar3.f190964d;
        if (vVar != null) {
            C66096w wVar = oVar3.f190965e;
            C87412m.m108591d(wVar);
            ((C65954a0) vVar).onAttach(wVar);
        }
        C66089v vVar2 = oVar3.f190964d;
        if (vVar2 != null) {
            ((C65954a0) vVar2).mo89992H0();
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C66089v vVar3 = oVar3.f190964d;
        finderLiveService.getClass();
        FinderLiveService.f159363Q = vVar3;
        C66340p pVar = (C66340p) rVar.mo62444c(getActivity()).mo75002a(C66340p.class);
        pVar.getClass();
        View findViewById5 = findViewById3.findViewById(C0966R.C0970id.ddc);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…hor_search_music_ui_root)");
        pVar.f190971f = findViewById5;
        if (pVar.f190969d == null || pVar.f190970e == null) {
            pVar.f190969d = new C66085u0(pVar.getActivity(), bVar, iVar);
            View view = pVar.f190971f;
            if (view != null) {
                AppCompatActivity activity = pVar.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                pVar.f190970e = new C66098w0(view, (MMActivity) activity, pVar.f190969d);
            } else {
                C87412m.m108603p("pluginView");
                throw null;
            }
        }
        C66075s0 s0Var = pVar.f190969d;
        if (s0Var != null) {
            C66082t0 t0Var = pVar.f190970e;
            C87412m.m108591d(t0Var);
            ((C66085u0) s0Var).onAttach(t0Var);
        }
        ((C15794y1) rVar.mo62444c(getActivity()).mo75002a(C15794y1.class)).mo14496c3(2, findViewById3, iVar, bVar);
        ((C54991o) this.f190942e.mo71262a(cls)).f154295b1 = 1;
        String O5 = C66785b.f191882e.mo90662O5();
        C87412m.m108594g(O5, "<set-?>");
        ((C54991o) this.f190942e.mo71262a(cls)).f154345o = O5;
        C12453ii iiVar = new C12453ii(mo90445f3(), mo90443d3());
        this.f190952r = iiVar;
        iiVar.mo8357i0();
        if (this.f190946i == null) {
            C15758d dVar = new C15758d(this, mo90442c3(C0966R.C0970id.dms, mo90445f3()), mo90443d3(), C12282d7.C12288c.ANCHOR_SELECT);
            this.f190946i = dVar;
            dVar.mo10792g(8);
            C12282d7 d7Var = this.f190946i;
            if (d7Var != null) {
                d7Var.mo8357i0();
            }
        }
        if (this.f190947j == null) {
            View findViewById6 = mo90445f3().findViewById(C0966R.C0970id.mrl);
            C87412m.m108593f(findViewById6, "rootLayoutView.findViewB…sic_select_panel_ui_root)");
            C12693u2 u2Var = new C12693u2((ViewGroup) findViewById6, mo90443d3());
            this.f190947j = u2Var;
            u2Var.mo10792g(8);
            C12693u2 u2Var2 = this.f190947j;
            if (u2Var2 != null) {
                u2Var2.mo8357i0();
            }
        }
        if (this.f190948n == null) {
            View findViewById7 = mo90445f3().findViewById(C0966R.C0970id.mqj);
            C87412m.m108593f(findViewById7, "rootLayoutView.findViewB…r_sing_song_list_ui_root)");
            C63100x2 x2Var = new C63100x2((ViewGroup) findViewById7, mo90443d3());
            this.f190948n = x2Var;
            x2Var.mo10792g(8);
            C63100x2 x2Var2 = this.f190948n;
            if (x2Var2 != null) {
                x2Var2.mo8357i0();
            }
        }
    }

    public void onDestroy() {
        C45795b bVar = this.f190942e;
        FinderLiveService.f159376d.getClass();
        if (!C87412m.m108589b(bVar, FinderLiveService.f159348A)) {
            this.f190942e.mo71263b();
        }
        C12453ii iiVar = this.f190952r;
        if (iiVar != null) {
            iiVar.mo3211w0();
        }
        C12282d7 d7Var = this.f190946i;
        if (d7Var != null) {
            d7Var.mo3211w0();
        }
    }

    public void onResume() {
        C62861l1 l1Var = this.f190949o;
        if (l1Var != null) {
            l1Var.onResume();
        }
        super.onResume();
    }
}
