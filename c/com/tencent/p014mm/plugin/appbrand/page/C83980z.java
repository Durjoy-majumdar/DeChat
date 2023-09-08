package com.tencent.p014mm.plugin.appbrand.page;

import android.util.Pair;
import android.view.View;
import at0.C103915c;
import bu0.C79819c;
import bu0.C79832e;
import bu0.C79833f;
import bu0.C79834g;
import bu0.C79835h;
import bu0.C79836i;
import bu0.C79837j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z */
public class C83980z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83966x f245167d;

    public C83980z(C83966x xVar) {
        this.f245167d = xVar;
    }

    public void run() {
        C83782d3 d3Var = (C83782d3) this.f245167d.getContainer().getRuntime().mo113027R0(C83782d3.class);
        C83966x xVar = this.f245167d;
        xVar.getClass();
        C79819c cVar = d3Var == null ? null : (C79819c) d3Var.G90(C79819c.class, xVar.getContext());
        if (cVar == null) {
            cVar = (C79819c) xVar.getContainer().getDecorWidgetFactory().mo116271a(xVar.getContext(), C79819c.class);
        }
        cVar.setId(C0966R.C0970id.f5950t5);
        C81634a.C81643i d = xVar.getContainer().getAppConfig().mo113985d();
        cVar.setPosition(d.f239638a);
        cVar.mo110002e(new C79832e(cVar, d.f239639b, d.f239640c, d.f239641d, d.f239642e));
        Iterator<C81634a.C81644j> it = d.f239644g.iterator();
        while (it.hasNext()) {
            C81634a.C81644j next = it.next();
            AppBrandTabBarItem appBrandTabBarItem = d3Var == null ? null : (AppBrandTabBarItem) d3Var.G90(AppBrandTabBarItem.class, xVar.getContext());
            if (appBrandTabBarItem == null) {
                appBrandTabBarItem = (AppBrandTabBarItem) xVar.getContainer().getDecorWidgetFactory().mo116271a(xVar.getContext(), AppBrandTabBarItem.class);
            }
            String str = next.f239645a;
            String str2 = next.f239646b;
            String str3 = next.f239647c;
            String str4 = next.f239648d;
            C79819c.C79829i iVar = new C79819c.C79829i();
            iVar.f233970b = new C79837j(str3, new C79833f(cVar));
            iVar.f233971c = new C79837j(str4, new C79834g(cVar));
            iVar.f233972d = str2;
            iVar.f233969a = str;
            cVar.f233946j.add(new Pair(iVar.f233970b, iVar.f233971c));
            if (iVar.f233972d == null && (iVar.f233970b.mo110027a() == null || iVar.f233971c.mo110027a() == null)) {
                Log.m105920e("MicroMsg.AppBrandPageTabBar", "illegal data");
            } else {
                if (appBrandTabBarItem == null) {
                    appBrandTabBarItem = new AppBrandTabBarItem(cVar.getContext());
                }
                cVar.mo110004g(appBrandTabBarItem, iVar);
                C103915c.m138604a(appBrandTabBarItem, (Class<? extends View>) null, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, new C79835h(cVar, iVar), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
                appBrandTabBarItem.setOnClickListener(new C79836i(cVar));
                cVar.f233945i.add(iVar);
                cVar.f233941e.addView(appBrandTabBarItem);
            }
        }
        cVar.setClickListener(new C83754a0(xVar, d));
        xVar.f245122P = cVar;
    }
}
