package vo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import bp1.C54515a;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import gy3.C87412m;
import il1.C8968f2;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qj1.C12322e5;
import qj1.C12399ff;
import qj1.C12669t4;
import qj1.C62632a6;
import qj1.C62905o2;
import qj1.C62979sf;
import qj1.C63163zd;
import rx3.C13598b0;
import rx3.C36570n;
import sk1.C63947a;
import sx3.C64197v;
import te3.C48779ay0;
import te3.C49712hj1;
import vo1.C65770a0;
import wo1.C66146d;
import wo1.C66154f;
import wo1.C66155g;
import wo1.C66158l;
import zo1.C16344b0;
import zo1.C16361r;
import zo1.C66917d;
import zo1.C66919e;
import zo1.C66921h;
import zo1.C66923i;
import zo1.C66924j;
import zo1.C66928k;
import zo1.C66930l;
import zo1.C66932m;
import zo1.C66933n;
import zo1.C66938o;
import zo1.C66943p;
import zo1.C66949y;

/* renamed from: vo1.t */
public final class C65820t extends C65795g0 {

    /* renamed from: g */
    public final String f189277g = "FinderLiveReplayDecorateUIC";

    /* renamed from: h */
    public C66933n f189278h;

    /* renamed from: i */
    public C12399ff f189279i;

    /* renamed from: j */
    public C62979sf f189280j;

    /* renamed from: n */
    public C66921h f189281n;

    /* renamed from: o */
    public C62632a6 f189282o;

    /* renamed from: p */
    public C62905o2 f189283p;

    /* renamed from: q */
    public C12322e5 f189284q;

    /* renamed from: r */
    public C63163zd f189285r;

    /* renamed from: s */
    public C12669t4 f189286s;

    /* renamed from: t */
    public C66917d f189287t;

    /* renamed from: u */
    public C66949y f189288u;

    /* renamed from: v */
    public C16344b0 f189289v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65820t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: l */
    public static /* synthetic */ void m77534l(C65820t tVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        tVar.mo89857k(z, z2, z3);
    }

    /* renamed from: i */
    public void mo89855i(boolean z, boolean z2) {
        C62979sf sfVar;
        C66949y yVar;
        C66949y yVar2;
        C66917d dVar;
        C16344b0 b0Var;
        ViewGroup.LayoutParams layoutParams;
        boolean z3 = z;
        Class cls = C54991o.class;
        Class cls2 = C16344b0.class;
        Class cls3 = C66917d.class;
        Class cls4 = C54519d.class;
        Class cls5 = C66949y.class;
        C56032b bVar = this.f189238f;
        if (bVar != null) {
            C12399ff ffVar = (C12399ff) bVar.getPlugin(C12399ff.class);
            if (ffVar == null) {
                View genRootViewByStub = bVar.genRootViewByStub(C0966R.C0970id.e6n, bVar);
                C87412m.m108592e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
                ffVar = new C12399ff((ViewGroup) genRootViewByStub, bVar, (C49712hj1) null);
            }
            this.f189279i = ffVar;
            C62979sf sfVar2 = (C62979sf) bVar.getPlugin(C62979sf.class);
            if (sfVar2 == null) {
                View genRootViewByStub2 = bVar.genRootViewByStub(C0966R.C0970id.e6o, bVar);
                C87412m.m108592e(genRootViewByStub2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) genRootViewByStub2;
                View findViewById = viewGroup.findViewById(C0966R.C0970id.l6k);
                C87412m.m108593f(findViewById, "orientationRoot.findView…id.video_orientation_btn)");
                sfVar2 = new C62979sf(viewGroup, (ImageView) findViewById, viewGroup, bVar);
            }
            this.f189280j = sfVar2;
            C16361r rVar = (C16361r) bVar.getPlugin(C16361r.class);
            if (rVar == null) {
                View findViewById2 = bVar.findViewById(C0966R.C0970id.e6m);
                C87412m.m108593f(findViewById2, "it.findViewById(R.id.fin…play_more_action_ui_root)");
                rVar = new C16361r((ViewGroup) findViewById2, bVar);
            }
            rVar.mo10792g(0);
            C66943p pVar = (C66943p) bVar.getPlugin(C66943p.class);
            if (pVar == null) {
                View findViewById3 = bVar.findViewById(C0966R.C0970id.e6q);
                C87412m.m108593f(findViewById3, "it.findViewById(R.id.fin…itor_mini_window_ui_root)");
                pVar = new C66943p((ViewGroup) findViewById3, bVar);
            }
            pVar.mo10792g(0);
            C66921h hVar = (C66921h) bVar.getPlugin(C66921h.class);
            if (hVar == null) {
                View findViewById4 = bVar.findViewById(C0966R.C0970id.e6p);
                C87412m.m108593f(findViewById4, "it.findViewById(R.id.fin…ay_visitor_close_ui_root)");
                hVar = new C66921h((ViewGroup) findViewById4, bVar);
            }
            this.f189281n = hVar;
            hVar.mo10792g(0);
            C62632a6 a6Var = (C62632a6) bVar.getPlugin(C62632a6.class);
            if (a6Var == null) {
                View genRootViewByStub3 = bVar.genRootViewByStub(C0966R.C0970id.ftd, bVar);
                C87412m.m108592e(genRootViewByStub3, "null cannot be cast to non-null type android.view.ViewGroup");
                a6Var = new C62632a6((ViewGroup) genRootViewByStub3, bVar);
            }
            this.f189282o = a6Var;
            String str = this.f189277g;
            Log.m105920e(str, "initCommonInfoPlugin isLandscape = " + bVar.isLandscape() + " anchorLiveStatePlugin: " + this.f189283p);
            C62905o2 o2Var = (C62905o2) bVar.getPlugin(C62905o2.class);
            if (o2Var == null) {
                View findViewById5 = bVar.findViewById(C0966R.C0970id.jza);
                C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.view.ViewGroup");
                o2Var = new C62905o2((ViewGroup) findViewById5, bVar);
            }
            this.f189283p = o2Var;
            C12322e5 e5Var = (C12322e5) bVar.getPlugin(C12322e5.class);
            if (e5Var == null) {
                View genRootViewByStub4 = bVar.genRootViewByStub(C0966R.C0970id.e6j, bVar);
                C87412m.m108592e(genRootViewByStub4, "null cannot be cast to non-null type android.view.ViewGroup");
                e5Var = new C12322e5((ViewGroup) genRootViewByStub4, bVar, (ViewGroup) null);
            }
            this.f189284q = e5Var;
            C66933n nVar = (C66933n) bVar.getPlugin(C66933n.class);
            if (nVar == null) {
                View findViewById6 = bVar.findViewById(C0966R.C0970id.nvl);
                C87412m.m108593f(findViewById6, "it.findViewById(R.id.fin…r_replay_living_top_area)");
                nVar = new C66933n((ViewGroup) findViewById6, bVar);
            }
            this.f189278h = nVar;
            C63163zd zdVar = (C63163zd) bVar.getPlugin(C63163zd.class);
            if (zdVar == null) {
                View genRootViewByStub5 = bVar.genRootViewByStub(C0966R.C0970id.dyb, bVar);
                C87412m.m108592e(genRootViewByStub5, "null cannot be cast to non-null type android.view.ViewGroup");
                zdVar = new C63163zd((ViewGroup) genRootViewByStub5, bVar);
            }
            this.f189285r = zdVar;
            if (bVar.isLandscape()) {
                C62979sf sfVar3 = this.f189280j;
                if (sfVar3 != null) {
                    sfVar3.mo10792g(0);
                }
                View findViewById7 = bVar.findViewById(C0966R.C0970id.fyh);
                if (!(findViewById7 == null || (layoutParams = findViewById7.getLayoutParams()) == null)) {
                    int measuredHeight = bVar.findViewById(C0966R.C0970id.fyh) != null ? bVar.findViewById(C0966R.C0970id.fyh).getMeasuredHeight() : 0;
                    if (measuredHeight <= 0) {
                        measuredHeight = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3711c4);
                    }
                    layoutParams.height = measuredHeight;
                }
            } else {
                C62979sf sfVar4 = this.f189280j;
                if (sfVar4 != null) {
                    sfVar4.mo10792g(8);
                }
            }
            if (((C54519d) mo83051g(cls4)).f152861x) {
                C66933n nVar2 = this.f189278h;
                if (nVar2 != null) {
                    nVar2.mo10792g(0);
                    View view = (View) ((C36570n) nVar2.f192315s).getValue();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    nVar2.mo90922Z0(((C54991o) nVar2.mo87696x0(cls)).f154345o);
                    ((View) ((C36570n) nVar2.f192314r).getValue()).setOnClickListener(new C66938o(nVar2));
                }
            } else {
                C66933n nVar3 = this.f189278h;
                if (nVar3 != null) {
                    nVar3.mo10792g(8);
                    View view3 = (View) ((C36570n) nVar3.f192315s).getValue();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        C56032b bVar2 = this.f189238f;
        if (bVar2 != null) {
            bVar2.registerLazyInitPluginTask("Finder.Live:" + cls3.getCanonicalName(), new C65804l(this, bVar2));
            bVar2.registerLazyInitPluginTask("Finder.Live:" + C12669t4.class.getCanonicalName(), new C14918m(this, bVar2));
            bVar2.registerLazyInitPluginTask("Finder.Live:" + cls5.getCanonicalName(), new C65807n(this, bVar2));
            bVar2.registerLazyInitPluginTask("Finder.Live:" + cls2.getCanonicalName(), new C65811o(this, bVar2));
        }
        C12399ff ffVar2 = this.f189279i;
        if (ffVar2 != null) {
            C12399ff.m11974v1(ffVar2, (String) null, false, 3, (Object) null);
        }
        if (z2) {
            String str2 = this.f189277g;
            Log.m105924i(str2, "ReplayTransition0:showReplayTransition fromFloat:" + z3);
            C56032b bVar3 = this.f189238f;
            if (bVar3 != null && (b0Var = (C16344b0) bVar3.getPlugin(cls2)) != null) {
                C66921h hVar2 = this.f189281n;
                ViewGroup viewGroup2 = hVar2 != null ? hVar2.f166287d : null;
                String str3 = b0Var.f43699r;
                Log.m105924i(str3, "ReplayTransition0.1:showCover,requireTouchView:" + viewGroup2 + ",fromFloat:" + z3);
                ((C54519d) b0Var.mo87696x0(cls4)).f152842D = true;
                b0Var.f166287d.setVisibility(0);
                View a1 = b0Var.mo14822a1();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view5 = a1;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a1.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Object value = ((C36570n) b0Var.f43703v).getValue();
                C87412m.m108593f(value, "<get-countDownGroup>(...)");
                View view6 = (View) value;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "showCover", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z3) {
                    b0Var.mo14823b1().setVisibility(0);
                    C16344b0.m15193e1(b0Var, b0Var.mo14823b1(), "...", C64197v.m75537f("", ".", "..", "..."), 0, 8, (Object) null);
                    return;
                }
                b0Var.mo14825d1().setVisibility(0);
                b0Var.mo14825d1().setAlpha(1.0f);
                b0Var.mo14824c1().setVisibility(0);
                b0Var.mo14824c1().setAlpha(1.0f);
                b0Var.mo14484z0().showBlurBg();
                return;
            }
            return;
        }
        C56032b bVar4 = this.f189238f;
        if (!(bVar4 == null || (dVar = (C66917d) bVar4.getPlugin(cls3)) == null)) {
            C65770a0.C65771b bVar5 = C65770a0.f189184r;
            if (((Boolean) ((C36570n) C65770a0.f189186t).getValue()).booleanValue()) {
                dVar.mo10792g(0);
                LiveDanmakuView liveDanmakuView = dVar.f192279s;
                if (liveDanmakuView == null) {
                    liveDanmakuView = (LiveDanmakuView) dVar.f166287d.findViewById(C0966R.C0970id.bys);
                }
                dVar.f192279s = liveDanmakuView;
                if (liveDanmakuView != null) {
                    liveDanmakuView.setAnchorView(dVar.f166287d.findViewById(C0966R.C0970id.f357592nk3));
                }
                LiveDanmakuView liveDanmakuView2 = dVar.f192279s;
                if (liveDanmakuView2 != null) {
                    C66155g gVar = (C66155g) ((C36570n) dVar.f192282v).getValue();
                    if (dVar.f192281u == null) {
                        C66158l lVar = new C66158l(liveDanmakuView2, dVar.mo87684A0(), gVar);
                        lVar.f190128h = new C66919e(lVar, dVar);
                        dVar.f192281u = lVar;
                    }
                    C66154f fVar = dVar.f192281u;
                    C87412m.m108591d(fVar);
                    liveDanmakuView2.mo78677a(fVar, (C66155g) ((C36570n) dVar.f192282v).getValue(), ((C54515a) dVar.mo87684A0().mo71262a(C54515a.class)).mo75355c3());
                    C66154f fVar2 = dVar.f192281u;
                    C87412m.m108591d(fVar2);
                    if (dVar.f192280t == null) {
                        Context context = dVar.f166287d.getContext();
                        C87412m.m108593f(context, "root.context");
                        dVar.f192280t = new C66146d(context, dVar.mo87684A0(), fVar2);
                    }
                }
            }
        }
        C56032b bVar6 = this.f189238f;
        if (!(bVar6 == null || (yVar2 = (C66949y) bVar6.getPlugin(cls5)) == null)) {
            ViewGroup viewGroup3 = yVar2.f166287d;
            View findViewById8 = viewGroup3.findViewById(C0966R.C0970id.j8u);
            if (findViewById8 == null) {
                findViewById8 = LayoutInflater.from(viewGroup3.getContext()).inflate(C0966R.C0971layout.ah5, viewGroup3, false);
                Log.m105924i("ReplayScreenDragLazyPlugin", "seekTimeLayoutGenerator " + findViewById8.hashCode());
                if (viewGroup3 instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 17;
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    viewGroup3.addView(findViewById8, layoutParams2);
                } else if (viewGroup3 instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                    viewGroup3.addView(findViewById8, layoutParams3);
                }
            }
            yVar2.f192342r = findViewById8;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view8 = findViewById8;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "activate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "activate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C63163zd zdVar2 = this.f189285r;
        if (zdVar2 != null) {
            C56032b bVar7 = this.f189238f;
            zdVar2.mo88083b1((bVar7 == null || (yVar = (C66949y) bVar7.getPlugin(cls5)) == null) ? null : (C66949y.C66950a) ((C36570n) yVar.f192344t).getValue());
        }
        if (((C54519d) mo83051g(cls4)).f152850j != 3 && (sfVar = this.f189280j) != null) {
            sfVar.mo87915d1(((C54991o) mo83051g(cls)).mo75966J4());
        }
    }

    /* renamed from: j */
    public void mo89856j(C56032b bVar) {
        C87412m.m108594g(bVar, "baseRouter");
        C45795b buContext = bVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f189238f = bVar;
    }

    /* renamed from: k */
    public final void mo89857k(boolean z, boolean z2, boolean z3) {
        Class cls = C66923i.class;
        Class cls2 = C54519d.class;
        C56032b bVar = this.f189238f;
        if (bVar != null) {
            String str = this.f189277g;
            Log.printInfoStack(str, "liveinfo:" + C63947a.f181274a.mo88736v(((C54519d) mo83051g(cls2)).mo75372e3()), new Object[0]);
            if (((C66923i) bVar.getPlugin(cls)) == null) {
                FrameLayout frameLayout = new FrameLayout(bVar.getContext());
                frameLayout.setElevation(2.0f);
                bVar.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                new C66923i(frameLayout, bVar);
            }
            if (z) {
                C66923i iVar = (C66923i) bVar.getPlugin(cls);
                if (iVar != null) {
                    String c3 = ((C54519d) mo83051g(cls2)).mo75370c3();
                    String str2 = iVar.f192294r;
                    Log.m105924i(str2, "showPrivateCount anchorUserName:" + c3);
                    iVar.f166287d.setVisibility(0);
                    iVar.mo90913Z0(c3);
                    C8968f2 f2Var = iVar.f192295s;
                    if (f2Var != null) {
                        C8968f2.m8755d(f2Var, 9, (C48779ay0) null, 0, new C66930l(iVar), 6, (Object) null);
                    }
                }
            } else if (z2) {
                C66923i iVar2 = (C66923i) bVar.getPlugin(cls);
                if (iVar2 != null) {
                    String c35 = ((C54519d) mo83051g(cls2)).mo75370c3();
                    String str3 = iVar2.f192294r;
                    Log.m105924i(str3, "showPrivateCount anchorUserName:" + c35);
                    iVar2.f166287d.setVisibility(0);
                    iVar2.mo90913Z0(c35);
                    C8968f2 f2Var2 = iVar2.f192295s;
                    if (f2Var2 != null) {
                        C8968f2.m8755d(f2Var2, 11, (C48779ay0) null, 0, new C66932m(iVar2), 6, (Object) null);
                    }
                }
            } else if (z3) {
                C66923i iVar3 = (C66923i) bVar.getPlugin(cls);
                if (iVar3 != null) {
                    String c36 = ((C54519d) mo83051g(cls2)).mo75370c3();
                    String str4 = iVar3.f192294r;
                    Log.m105924i(str4, "showLiveEnd anchorUserName:" + c36);
                    iVar3.f166287d.setVisibility(0);
                    iVar3.mo90913Z0(c36);
                    C8968f2 f2Var3 = iVar3.f192295s;
                    if (f2Var3 != null) {
                        C8968f2.m8755d(f2Var3, 13, (C48779ay0) null, 0, new C66924j(iVar3), 6, (Object) null);
                    }
                }
            } else {
                C66923i iVar4 = (C66923i) bVar.getPlugin(cls);
                if (iVar4 != null) {
                    String c37 = ((C54519d) mo83051g(cls2)).mo75370c3();
                    String str5 = iVar4.f192294r;
                    Log.m105924i(str5, "showPrivateCount anchorUserName:" + c37);
                    iVar4.f166287d.setVisibility(0);
                    iVar4.mo90913Z0(c37);
                    C8968f2 f2Var4 = iVar4.f192295s;
                    if (f2Var4 != null) {
                        C8968f2.m8755d(f2Var4, 10, (C48779ay0) null, 0, new C66928k(iVar4), 6, (Object) null);
                    }
                }
            }
        }
    }
}
