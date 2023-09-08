package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83540i;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83541j;
import com.tencent.p014mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hp0.C87574a;
import java.util.Iterator;
import jk0.C87985i;
import li0.C88514d;
import p170ic.C87690d;
import zi0.C91755a;
import zi0.C91759b;
import zp0.C91831m;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$v */
public class AppBrandRuntime$$v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238200d;

    public AppBrandRuntime$$v(AppBrandRuntime appBrandRuntime) {
        this.f238200d = appBrandRuntime;
    }

    public void run() {
        AppBrandRuntime appBrandRuntime = this.f238200d;
        appBrandRuntime.mo113052e("appOnCreate", new Object[0]);
        String mainProcessName = MMApplicationContext.getMainProcessName();
        C80907o.m98779b(mainProcessName, appBrandRuntime.f238133X0);
        C80907o.m98780c(mainProcessName, appBrandRuntime.f238135Y0);
        appBrandRuntime.mo113014I0(C87985i.class, new C84262t2());
        appBrandRuntime.mo113014I0(C91831m.class, new NetworkServiceBySystemReceiver(appBrandRuntime));
        appBrandRuntime.mo113014I0(C91759b.class, new C83541j(appBrandRuntime));
        appBrandRuntime.mo113014I0(C91755a.class, new C83540i(appBrandRuntime));
        C87690d.m109091b("AppBrandRuntimeProfile|onCreate", new AppBrandRuntime$$c(appBrandRuntime));
        C87574a.m108908a(appBrandRuntime.f238147j);
        appBrandRuntime.f238113K.f255667a.mo122987s(C88514d.C88522g.TO_FOREGROUND, "onRuntimeCreate");
        C83231l.m102146g(appBrandRuntime.f238147j, C83231l.C83235e.HIDE);
        String str = appBrandRuntime.f238147j;
        if (!TextUtils.isEmpty(str)) {
            Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
            while (c.hasNext()) {
                c.next().mo109496b();
            }
        }
        C83231l.m102145f(appBrandRuntime.f238147j, C83231l.C83233c.ON_CREATE);
        ((C103766u) ((AppBrandRuntime$$u) appBrandRuntime.f238114L).f238198d).mo145136d(C39623j.C39626c.RESUMED);
        appBrandRuntime.mo113019M0();
    }
}
