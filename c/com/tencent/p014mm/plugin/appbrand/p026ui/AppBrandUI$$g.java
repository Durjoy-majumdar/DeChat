package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84944a;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import li0.C88535h;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$g */
public class AppBrandUI$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandUI f246518d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$g$a */
    public class C84457a extends C88535h {
        public C84457a(Activity activity) {
            super(activity);
        }
    }

    public AppBrandUI$$g(AppBrandUI appBrandUI) {
        this.f246518d = appBrandUI;
    }

    public void run() {
        this.f246518d.f246503w = new Configuration(AppBrandUI.m104035Z7(this.f246518d));
        AppBrandUI appBrandUI = this.f246518d;
        appBrandUI.f246504x = false;
        AppBrandRuntimeContainerWC unused = appBrandUI.mRuntimeContainer = new AppBrandRuntimeContainerWC(this.f246518d.f246495M);
        AppBrandRuntimeContainerWC S7 = this.f246518d.mRuntimeContainer;
        AppBrandUI appBrandUI2 = this.f246518d;
        C85004y yVar = new C85004y(appBrandUI2, appBrandUI2.f247089j);
        S7.f238204i.removeView(yVar);
        S7.f238204i.addView(yVar, S7.f238204i.getChildCount(), new ViewGroup.LayoutParams(-1, -1));
        S7.f238211s = yVar;
        S7.f238204i.requestChildFocus(yVar, yVar);
        AppBrandUI appBrandUI3 = this.f246518d;
        C84944a aVar = appBrandUI3.f246496p;
        FrameLayout frameLayout = (FrameLayout) ((AppBrandUI$$b) appBrandUI3.f246495M).f246511a.f247089j;
        Activity activity = aVar.f247591a;
        if (!(activity == null || activity.getWindow() == null || frameLayout == null || frameLayout.getParent() == null || !(frameLayout.getParent() instanceof ViewGroup))) {
            aVar.f247592b = true;
            ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
        }
        AppBrandUI appBrandUI4 = this.f246518d;
        appBrandUI4.f246499s = new C84457a(appBrandUI4);
        C88535h hVar = this.f246518d.f246499s;
        hVar.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        try {
            MMApplicationContext.getContext().registerReceiver(hVar.f255737a, intentFilter);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + e);
        }
        C85875k4.m106205t(this.f246518d, false);
    }
}
