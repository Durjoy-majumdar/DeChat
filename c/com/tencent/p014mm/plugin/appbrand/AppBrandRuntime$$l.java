package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C80937y;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$l */
public class AppBrandRuntime$$l implements C80937y {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntime f238184a;

    public AppBrandRuntime$$l(AppBrandRuntime appBrandRuntime) {
        this.f238184a = appBrandRuntime;
    }

    /* renamed from: r0 */
    public void mo112722r0() {
        if (this.f238184a.f238103A.getAndSet(false)) {
            AppBrandRuntime appBrandRuntime = this.f238184a;
            Log.m105925i("MicroMsg.AppBrandRuntime", "onServiceReconnected: %s", appBrandRuntime.f238147j);
            if (appBrandRuntime.f238116N) {
                appBrandRuntime.mo113009F0();
                String str = appBrandRuntime.f238147j;
                Iterator<C83231l.C83234d> it = C83231l.f243081a;
                if (!TextUtils.isEmpty(str)) {
                    Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
                    while (c.hasNext()) {
                        c.next().getClass();
                    }
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.AppBrandRuntime", "Main Process Restarted, start prepare again");
            appBrandRuntime.mo113024P0(new C81597c0(appBrandRuntime));
        }
    }
}
