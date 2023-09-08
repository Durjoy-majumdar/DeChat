package qj1;

import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C45348d0;
import dj1.C45381p0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49747hs1;
import te3.C49890is1;

/* renamed from: qj1.zg */
public final class C63176zg extends C62660c {

    /* renamed from: p */
    public final C58124b f179255p;

    /* renamed from: q */
    public final String f179256q = "Finder.FinderLiveVisitorGameRankSwitchGuidePlugin";

    /* renamed from: r */
    public View f179257r;

    /* renamed from: s */
    public LiveBottomSheetPanel f179258s;

    /* renamed from: t */
    public TextView f179259t;

    /* renamed from: u */
    public ImageView f179260u;

    /* renamed from: v */
    public View f179261v;

    /* renamed from: w */
    public C49890is1 f179262w;

    /* renamed from: qj1.zg$a */
    public static final class C63177a implements View.OnClickListener {

        /* renamed from: d */
        public static final C63177a f179263d = new C63177a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.zg$b */
    public static final class C63178b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63176zg f179264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63178b(C63176zg zgVar) {
            super(1);
            this.f179264d = zgVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f179264d.mo10792g(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.zg$c */
    public static final class C63179c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63176zg f179265d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f179266e;

        /* renamed from: qj1.zg$c$a */
        public static final class C63180a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63176zg f179267d;

            /* renamed from: e */
            public final /* synthetic */ C49747hs1 f179268e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63180a(C63176zg zgVar, C49747hs1 hs12) {
                super(1);
                this.f179267d = zgVar;
                this.f179268e = hs12;
            }

            public Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C63176zg.m74539Z0(this.f179267d, this.f179268e, true);
                    this.f179267d.mo88101b1(true, this.f179268e);
                } else {
                    C63176zg.m74539Z0(this.f179267d, this.f179268e, false);
                    this.f179267d.mo88101b1(false, this.f179268e);
                }
                return C13598b0.f38549a;
            }
        }

        public C63179c(C63176zg zgVar, ViewGroup viewGroup) {
            this.f179265d = zgVar;
            this.f179266e = viewGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.dy0((C54116w) c, 2, (String) null, 0, 6, (Object) null);
            C49747hs1 F3 = ((C54991o) this.f179265d.mo87696x0(C54991o.class)).mo75958F3();
            if (F3 != null) {
                C63176zg zgVar = this.f179265d;
                ViewGroup viewGroup = this.f179266e;
                C62042e eVar = C62042e.f176370a;
                if (eVar.mo87125w(true, F3)) {
                    zgVar.mo88100a1();
                    Context context = viewGroup.getContext();
                    C87412m.m108593f(context, "root.context");
                    eVar.mo87044T1(context, F3, new C63180a(zgVar, F3));
                } else {
                    C63176zg.m74539Z0(zgVar, F3, true);
                    zgVar.mo88101b1(true, F3);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.zg$d */
    public static final class C63181d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63176zg f179269d;

        public C63181d(C63176zg zgVar) {
            this.f179269d = zgVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.dy0((C54116w) c, 8, (String) null, 0, 6, (Object) null);
            C49747hs1 F3 = ((C54991o) this.f179269d.mo87696x0(C54991o.class)).mo75958F3();
            if (F3 != null) {
                this.f179269d.mo88101b1(false, F3);
            }
            this.f179269d.mo88100a1();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.zg$e */
    public static final class C63182e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63176zg f179270d;

        /* renamed from: e */
        public final /* synthetic */ Activity f179271e;

        public C63182e(C63176zg zgVar, Activity activity) {
            this.f179270d = zgVar;
            this.f179271e = activity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.dy0((C54116w) c, 9, (String) null, 0, 6, (Object) null);
            C54795n5 D0 = this.f179270d.mo14476D0();
            if (D0 != null) {
                D0.mo75713Q(this.f179271e, false);
            }
            C49747hs1 F3 = ((C54991o) this.f179270d.mo87696x0(C54991o.class)).mo75958F3();
            if (F3 != null) {
                this.f179270d.mo88101b1(false, F3);
            }
            this.f179270d.mo88100a1();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63176zg(ViewGroup viewGroup, C58124b bVar, Activity activity, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f179255p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bdp);
        this.f179257r = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(C63177a.f179263d);
        }
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.brh);
        this.f179258s = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new C63178b(this));
        }
        Button button = (Button) viewGroup.findViewById(C0966R.C0970id.f357756bl2);
        if (button != null) {
            button.setOnClickListener(new C63179c(this, viewGroup));
        }
        Button button2 = (Button) viewGroup.findViewById(C0966R.C0970id.apy);
        if (button2 != null) {
            button2.setOnClickListener(new C63181d(this));
        }
        this.f179259t = (TextView) viewGroup.findViewById(C0966R.C0970id.f357845c22);
        this.f179260u = (ImageView) viewGroup.findViewById(C0966R.C0970id.m6i);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.mj8);
        this.f179261v = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C63182e(this, activity));
        }
        View view = this.f179261v;
        RelativeLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        layoutParams = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : layoutParams;
        if (layoutParams != null) {
            layoutParams.bottomMargin = C75044y4.m89991c(viewGroup.getContext()) + ((int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3743cv));
        }
        View view2 = this.f179261v;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Z0 */
    public static final void m74539Z0(C63176zg zgVar, C49747hs1 hs12, boolean z) {
        long j = ((C55001u) zgVar.mo87696x0(C55001u.class)).f154420q.f182392d;
        FinderObject finderObject = ((C54991o) zgVar.mo87696x0(C54991o.class)).f154341n;
        long j2 = finderObject != null ? finderObject.f164794id : -1;
        C45381p0.C45382a aVar = C45381p0.f122894u;
        String str = hs12.f134839d;
        if (str == null) {
            str = "";
        }
        new C45381p0(j, j2, 1, aVar.mo70896b(str, z)).mo9225i().mo123420E(new C62636ah(zgVar, z, hs12));
    }

    /* renamed from: a1 */
    public final void mo88100a1() {
        Log.m105924i(this.f179256q, "back");
        View view = this.f179257r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f179258s;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.mo78802a();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo88101b1(boolean z, C49747hs1 hs12) {
        new C45348d0(1, z ? 1 : 2, mo87684A0(), hs12).mo9225i();
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        View view;
        super.mo10792g(i);
        if (i != 0 && (view = this.f179257r) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        C49747hs1 F3 = ((C54991o) mo87696x0(C54991o.class)).mo75958F3();
        if (F3 != null) {
            mo88101b1(false, F3);
        }
        mo88100a1();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
