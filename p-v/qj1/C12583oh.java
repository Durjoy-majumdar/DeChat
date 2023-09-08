package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import c50.C54655b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import ht1.C8777j5;
import i50.C60251a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import l31.C61212e;
import o40.C61926c;
import ok1.C62042e;
import p447aw.C54369c;
import p50.C62193a;
import rx3.C13598b0;
import te3.C49712hj1;
import vc3.C78382a;

/* renamed from: qj1.oh */
public final class C12583oh extends C62660c {
    @Deprecated

    /* renamed from: r */
    public static boolean f36102r;

    /* renamed from: p */
    public final C58124b f36103p;

    /* renamed from: q */
    public boolean f36104q;

    /* renamed from: qj1.oh$a */
    public static final class C12584a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12583oh f36105d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f36106e;

        /* renamed from: qj1.oh$a$a */
        public static final class C12585a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12583oh f36107d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12585a(C12583oh ohVar) {
                super(0);
                this.f36107d = ohVar;
            }

            public Object invoke() {
                ((C54991o) this.f36107d.mo87696x0(C54991o.class)).f154245Q3 = 2;
                C12583oh.m12117Z0(this.f36107d);
                Log.m105924i("Finder.FinderLiveVisitorMiniWindowPlugin", "miniWindow click!");
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.FLOATING_BUTTON, (Map) null, (String) null, 6, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C12584a(C12583oh ohVar, ViewGroup viewGroup) {
            this.f36105d = ohVar;
            this.f36106e = viewGroup;
        }

        public final void onClick(View view) {
            C54067f0.C0064m mVar = C54067f0.C0064m.FLOATING_BUTTON;
            Class cls = C54108o.class;
            Class cls2 = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMiniWindowPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!((C54991o) this.f36105d.mo87696x0(cls2)).mo75990Y3()) {
                Context context = this.f36106e.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                if (!((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                    C12583oh.m12117Z0(this.f36105d);
                    Log.m105924i("Finder.FinderLiveVisitorMiniWindowPlugin", "miniWindow click!");
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, mVar, (Map) null, (String) null, 6, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMiniWindowPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
            if (!((C54991o) this.f36105d.mo87696x0(cls2)).f154236O3) {
                C60085d dVar = (C60085d) this.f36105d.mo87687E0(C60085d.class);
                if (dVar != null) {
                    dVar.mo84952d1(new C12585a(this.f36105d));
                }
            } else {
                ((C54991o) this.f36105d.mo87696x0(cls2)).f154245Q3 = 2;
                C12583oh.m12117Z0(this.f36105d);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c2, mVar, (Map) null, (String) null, 6, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMiniWindowPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.oh$b */
    public static final class C12586b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12583oh f36108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12586b(C12583oh ohVar) {
            super(0);
            this.f36108d = ohVar;
        }

        public Object invoke() {
            this.f36108d.mo12197a1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.oh$c */
    public static final class C12587c implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C12583oh f36109a;

        public C12587c(C12583oh ohVar) {
            this.f36109a = ohVar;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            C58115i iVar;
            Class cls = C54108o.class;
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            C12583oh ohVar = this.f36109a;
            if (ohVar.f36104q) {
                if (ohVar.f36103p.getLiveRole() == 1) {
                    C62042e eVar = C62042e.f176370a;
                    if (eVar.mo87073d1(this.f36109a.mo87684A0()) || eVar.mo87035Q0(this.f36109a.mo87684A0())) {
                        if (C60251a.f171781k1 == null) {
                            Log.printInfoStack("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new Object[0]);
                            C60251a.f171781k1 = new C60251a();
                        }
                        C60251a aVar = C60251a.f171781k1;
                        C87412m.m108591d(aVar);
                        aVar.f172989A.f166254a = true;
                    } else {
                        if (C54655b.f153178f1 == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar = C54655b.f153178f1;
                        C87412m.m108591d(bVar);
                        bVar.f172989A.f166254a = true;
                    }
                } else {
                    C62193a c = C62193a.f176816k1.mo87262c(((C55001u) this.f36109a.mo87696x0(C55001u.class)).f154420q.f182392d);
                    if (!(c == null || (iVar = c.f172989A) == null)) {
                        iVar.f166254a = true;
                    }
                }
                Bundle bundle = new Bundle();
                C12583oh ohVar2 = this.f36109a;
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
                ohVar2.f36103p.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
                if (this.f36109a.f36103p.getLiveRole() == 1) {
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    f0Var.f151444Z = true;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    f0Var.f151446a0 = false;
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE, String.valueOf(2), (String) null, 4, (Object) null);
                    return;
                }
                ((C54116w) C86312j.m106911c(C54116w.class)).Zx0(true, C54067f0.C54084t.LIVE_FLOAT_ACTION_COLLAPSE_ANIMATION);
            }
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            C58124b.C7172a.m7372a(this.f36109a.f36103p, C58124b.C58125b.MINI_WINDOW_CANCEL, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            C58124b.C7172a.m7372a(this.f36109a.f36103p, C58124b.C58125b.MINI_WINDOW_REFUSE, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12583oh(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        Class cls = C61212e.class;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36103p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g0x);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…or_mini_window_btn_group)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        ((C61212e) C86312j.m106911c(cls)).o30(viewGroup2, "finder_live_mini_window");
        if (bVar.getLiveRole() == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(viewGroup2, 8, 25561);
        }
        viewGroup2.setOnClickListener(new C12584a(this, viewGroup));
        C62042e.f176370a.mo87071d(this);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12117Z0(qj1.C12583oh r13) {
        /*
            r13.getClass()
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC> r0 = com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            java.lang.Class<aw.d> r2 = p447aw.C103918d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            aw.d r2 = (p447aw.C103918d) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 21
            boolean r2 = r2.mo125776TW(r3, r4)
            r3 = 0
            r4 = 0
            r5 = 2
            if (r2 != 0) goto L_0x003a
            java.lang.String r0 = "Finder.FinderLiveVisitorMiniWindowPlugin"
            java.lang.String r1 = "showVideoTalking, permission denied"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            boolean r0 = r13.mo82893g0()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE"
            qj1.C62660c.m73643W0(r13, r0, r4, r5, r4)
            f36102r = r3
            goto L_0x00b5
        L_0x0035:
            r13.mo12197a1()
            goto L_0x00b5
        L_0x003a:
            d60.b r2 = r13.f36103p
            int r2 = r2.getLiveRole()
            r6 = 1
            if (r2 != r6) goto L_0x0074
            di3.d r2 = di3.C86312j.m106911c(r1)
            ak1.o r2 = (ak1.C54108o) r2
            r2.getClass()
            ak1.f0 r2 = ak1.C54108o.f151869h
            r2.f151444Z = r6
            di3.d r7 = di3.C86312j.m106911c(r1)
            ak1.o r7 = (ak1.C54108o) r7
            r7.getClass()
            r2.f151446a0 = r3
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r7 = r1
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.g0 r8 = ak1.C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE
            java.lang.String r9 = java.lang.String.valueOf(r5)
            r10 = 0
            r11 = 4
            r12 = 0
            ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
            goto L_0x0089
        L_0x0074:
            d60.b r1 = r13.f36103p
            int r1 = r1.getLiveRole()
            if (r1 != 0) goto L_0x0089
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.w r1 = (ak1.C54116w) r1
            ak1.f0$t r2 = ak1.C54067f0.C54084t.LIVE_FLOAT_ACTION_COLLAPSE_ANIMATION
            r1.Zx0(r6, r2)
        L_0x0089:
            android.view.ViewGroup r13 = r13.f166287d
            android.content.Context r13 = r13.getContext()
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0096
            r4 = r13
            android.app.Activity r4 = (android.app.Activity) r4
        L_0x0096:
            if (r4 == 0) goto L_0x00b5
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r1 = r13.mo62443b(r4)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r1 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r1
            r1.f160022q = r6
            bl3.r$a r13 = r13.mo62443b(r4)
            androidx.lifecycle.i0 r13 = r13.mo75002a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r13 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r13
            r13.f160023r = r5
            r4.finish()
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12583oh.m12117Z0(qj1.oh):void");
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE") && !f36102r) {
            f36102r = true;
            C61926c.m72666K(500, new C12586b(this));
        }
    }

    /* renamed from: a1 */
    public final void mo12197a1() {
        C58124b.C7172a.m7372a(this.f36103p, C58124b.C58125b.MINI_WINDOW_PERMISSION, (Bundle) null, 2, (Object) null);
        ((C54369c) C86312j.m106911c(C54369c.class)).ff0(this.f166287d.getContext(), 21, this.f166287d.getContext().getString(C0966R.string.g_k), new C12587c(this), false, C78382a.m94650b());
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7 || ordinal == 30) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.FLOATING_BUTTON, (Map) null, 2, (Object) null);
            this.f36104q = true;
        } else if (ordinal == 27 || ordinal == 28) {
            mo10792g(4);
            this.f36104q = false;
        }
    }
}
