package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartNearbyFromLauncherRecentsListEvent;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81526t1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandNearbyEmptyUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84175n;
import com.tencent.p014mm.plugin.appbrand.report.model.C84166o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ky2.C10432i;
import p447aw.C103918d;
import te3.C49962j90;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.a0 */
public final class C84618a0 extends C84628f implements C81526t1.C81528b {

    /* renamed from: r */
    public boolean f246902r = mo117317p();

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.a0$a */
    public class C84619a implements C113177k.C79704f {

        /* renamed from: a */
        public final /* synthetic */ Activity f246903a;

        public C84619a(Activity activity) {
            this.f246903a = activity;
        }

        /* renamed from: a */
        public void mo109818a(C113177k.C79703c cVar) {
            if (cVar == C113177k.C79703c.SYSTEM_REFUSE) {
                Activity activity = this.f246903a;
                Intent putExtra = new Intent(this.f246903a, AppBrandNearbyEmptyUI.class).putExtra("extra_enter_reason", 1);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(3);
                aVar.mo10233c(putExtra);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader$1", "onResult", "(Lcom/tencent/mm/sensitive/IPluginSensitive$PERMISSION_RESULT;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else if (cVar == C113177k.C79703c.GRANTED) {
                C84618a0 a0Var = C84618a0.this;
                a0Var.f246902r = a0Var.mo117317p();
                C84618a0.this.mo117318q(this.f246903a);
            }
        }
    }

    public C84618a0(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
    }

    /* renamed from: a */
    public void mo113805a(C49962j90 j902) {
        mo117339n(j902);
    }

    /* renamed from: b */
    public C81526t1.C81527a mo113806b() {
        return C81526t1.C81527a.ENTRANCE_ID_NEARBY;
    }

    /* renamed from: e */
    public void mo117280e() {
        boolean z = true;
        mo117321l(true);
        Class cls = C10432i.class;
        if (((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).Oh0() != 1) {
            z = false;
        }
        mo117321l(z);
    }

    /* renamed from: h */
    public void mo117281h() {
        super.mo117281h();
        if (!this.f246902r && mo117317p()) {
            this.f246902r = true;
            mo117280e();
        }
    }

    /* renamed from: j */
    public void mo117282j(WeImageView weImageView) {
        weImageView.setVisibility(0);
        weImageView.setImageResource(C0966R.raw.icons_outlined_location);
        weImageView.setIconColor(this.f246909e.getResources().getColor(C0966R.color.f2933h));
    }

    /* renamed from: m */
    public String mo117283m() {
        return this.f246909e.getResources().getString(C0966R.string.f7763qv);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FragmentActivity fragmentActivity = this.f246909e;
        if (fragmentActivity == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (!this.f246902r) {
            mo117319r();
            ((C113177k) C86312j.m106911c(C113177k.class)).mo165713kx(fragmentActivity, "nearby", "android.permission.ACCESS_FINE_LOCATION", C113177k.C113178a.NEARBY_APPBRAND.f338662e, new C84619a(fragmentActivity));
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            mo117318q(fragmentActivity);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListNearByHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: p */
    public final boolean mo117317p() {
        return ((C103918d) C86312j.m106911c(C103918d.class)).Lb0(this.f246909e, "android.permission.ACCESS_FINE_LOCATION") && ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.NEARBY_APPBRAND);
    }

    /* renamed from: q */
    public final void mo117318q(Context context) {
        new StartNearbyFromLauncherRecentsListEvent().publish();
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1001;
        ((C83285a) C83428o.f243800a).mo115583c(context, "gh_2b2e3862a1fb@app", (String) null, "pages/index/index.html", 0, 0, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
        mo117319r();
        C84166o oVar = new C84166o();
        oVar.f245741a = C84166o.C84168b.TOP_ENTRANCE_IN_DESKTOP;
        oVar.f245742b = 0;
        oVar.f245743c = "";
        oVar.f245745e = C84166o.C84167a.NEARBY_MINI_PROGRAM;
        oVar.mo116840a();
    }

    /* renamed from: r */
    public final void mo117319r() {
        FragmentActivity fragmentActivity = this.f246909e;
        if (fragmentActivity != null) {
            C81481f0.C81485d dVar = ((AppBrandLauncherUI) fragmentActivity).f246387h;
            if (dVar != null) {
                dVar.f239081a[8] = "1";
            }
            if (this.f246918q != null) {
                AppBrandLauncherDesktopReporter a = C84175n.f245826d.mo116851a(fragmentActivity);
                C115669n.INSTANCE.mo160131h(19468, 2, "", "", "", "", "", Long.valueOf(a.f158155d));
            }
        }
    }
}
