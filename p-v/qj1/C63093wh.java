package qj1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C49712hj1;
import tf0.C64916p1;

/* renamed from: qj1.wh */
public final class C63093wh extends C62660c {

    /* renamed from: p */
    public final C58124b f179046p;

    /* renamed from: q */
    public final String f179047q = "FinderLiveVisitorRoleGuidePlugin";

    /* renamed from: r */
    public View f179048r;

    /* renamed from: s */
    public LiveBottomSheetPanel f179049s;

    /* renamed from: t */
    public View f179050t;

    /* renamed from: u */
    public C32224a<C13598b0> f179051u;

    /* renamed from: qj1.wh$a */
    public static final class C63094a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63093wh f179052d;

        public C63094a(C63093wh whVar) {
            this.f179052d = whVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f179052d.mo88026Z0(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.wh$b */
    public static final class C63095b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63093wh f179053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63095b(C63093wh whVar) {
            super(1);
            this.f179053d = whVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f179053d.mo10792g(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.wh$c */
    public static final class C63096c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63093wh f179054d;

        /* renamed from: e */
        public final /* synthetic */ Activity f179055e;

        public C63096c(C63093wh whVar, Activity activity) {
            this.f179054d = whVar;
            this.f179055e = activity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54795n5 D0 = this.f179054d.mo14476D0();
            if (D0 != null) {
                D0.mo75713Q(this.f179055e, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.wh$d */
    public static final class C63097d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63093wh f179056d;

        public C63097d(C63093wh whVar) {
            this.f179056d = whVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f179056d.mo88026Z0(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63093wh(ViewGroup viewGroup, C58124b bVar, Activity activity, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f179046p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bdp);
        this.f179048r = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C63094a(this));
        }
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.brh);
        this.f179049s = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new C63095b(this));
        }
        this.f179050t = viewGroup.findViewById(C0966R.C0970id.f5409ec);
        int c = C75044y4.m89991c(viewGroup.getContext());
        View view = this.f179050t;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c;
        }
        Button button = (Button) viewGroup.findViewById(C0966R.C0970id.bb4);
        if (button != null) {
            button.setOnClickListener(new C63096c(this, activity));
        }
        Button button2 = (Button) viewGroup.findViewById(C0966R.C0970id.eqd);
        if (button2 != null) {
            button2.setOnClickListener(new C63097d(this));
        }
        C7335d c2 = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76437d((C64916p1) c2, 14, (C32226l) null, 2, (Object) null);
    }

    /* renamed from: Z0 */
    public final void mo88026Z0(boolean z) {
        C32224a<C13598b0> aVar;
        View view = this.f179048r;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f179049s;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.mo78802a();
        }
        if (z && (aVar = this.f179051u) != null) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        View view;
        super.mo10792g(i);
        if (i != 0 && (view = this.f179048r) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        if (i != 1009) {
            return;
        }
        if (i2 == -1) {
            boolean z = false;
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IS_FROM_SETTING", false) : false;
            String str = this.f179047q;
            Log.m105924i(str, "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + booleanExtra);
            if (booleanExtra) {
                C54795n5 D0 = mo14476D0();
                if (D0 != null) {
                    z = D0.mo75703G(intent);
                }
                mo88026Z0(!z);
                return;
            }
            return;
        }
        String str2 = this.f179047q;
        Log.m105924i(str2, "REQUEST_FINDER_LIVE_ROLE resultCode:" + i2 + ",data:" + intent);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        mo88026Z0(true);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
