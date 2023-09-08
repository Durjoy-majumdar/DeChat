package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C68633w;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import js0.C88024r;
import oi0.C62024n;
import p1031sb.C90159e;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.d2 */
public class C84521d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246661d;

    public C84521d2(AppBrandProfileUI appBrandProfileUI) {
        this.f246661d = appBrandProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandProfileUI appBrandProfileUI = this.f246661d;
        if (appBrandProfileUI.f246452h != null) {
            Bundle bundleExtra = appBrandProfileUI.getIntent().getBundleExtra("_stat_obj");
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1024;
            int i = (!C90159e.m112823b(appBrandProfileUI.f246452h.f239584p, 1) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) != 1) ? 0 : 1;
            appBrandStatObject.f245534g = "" + i;
            appBrandStatObject.f245531d = C68633w.m80874a(appBrandStatObject.f245533f, bundleExtra);
            appBrandStatObject.f245532e = C68633w.m80875b(appBrandStatObject.f245533f, bundleExtra);
            if (appBrandProfileUI.getIntent().getIntExtra("key_from_scene", 3) == 7) {
                appBrandStatObject.f245531d = 14;
                appBrandStatObject.f245532e = appBrandProfileUI.getIntent().getStringExtra("key_scene_note");
                Bundle bundleExtra2 = appBrandProfileUI.getIntent().getBundleExtra("key_extra_bundle");
                if (!(bundleExtra2 == null || bundleExtra2.getParcelable("key_recommend_stat_obj") == null)) {
                    AppBrandRecommendStatObj appBrandRecommendStatObj = (AppBrandRecommendStatObj) bundleExtra2.getParcelable("key_recommend_stat_obj");
                    Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "recommendStatObj is got!");
                    if (appBrandRecommendStatObj != null) {
                        Set<Object> set = C84737f0.f247137a;
                        C88024r.m109571a().postToWorker(new C62024n(2, 0, 0, appBrandRecommendStatObj));
                    }
                }
            }
            LaunchParcel launchParcel = new LaunchParcel();
            launchParcel.f243730d = appBrandProfileUI.f246452h.f239575d;
            launchParcel.f243733g = 0;
            launchParcel.f243738o = appBrandStatObject;
            launchParcel.f243745v = (ActivityStarterIpcDelegate) appBrandProfileUI.getIntent().getParcelableExtra("KEY_DELEGATED_ACTIVITY_STARTER");
            ((C83285a) C83428o.f243800a).mo115582b(appBrandProfileUI, launchParcel);
            appBrandProfileUI.mo117090L7(4, 1);
            if (appBrandStatObject.f245531d == 6) {
                appBrandProfileUI.f246443Q = true;
                appBrandProfileUI.finish();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
