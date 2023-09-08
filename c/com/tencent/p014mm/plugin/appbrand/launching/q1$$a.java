package com.tencent.p014mm.plugin.appbrand.launching;

import al0.C79587a;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized;
import com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;
import com.tencent.p014mm.sdk.platformtools.Log;
import u24.C90599h;
import wq0.C91065g;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.q1$$a */
public final /* synthetic */ class q1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object f243852d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f243853e;

    public /* synthetic */ q1$$a(Object obj, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f243852d = obj;
        this.f243853e = appBrandRuntimeWC;
    }

    public final void run() {
        Object obj = this.f243852d;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f243853e;
        if (obj instanceof ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper) {
            ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper launchInfoIpcWrapper = (ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper) obj;
            if (appBrandRuntimeWC.f238147j.equals(launchInfoIpcWrapper.f243341d) && appBrandRuntimeWC.f238149o.f239365g == launchInfoIpcWrapper.f243342e) {
                Parcelable parcelable = launchInfoIpcWrapper.f243343f.f234896e;
                if (parcelable != null) {
                    AppBrandLaunchErrorAction appBrandLaunchErrorAction = (AppBrandLaunchErrorAction) parcelable;
                    Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update runtime(%s %d), error action %s ", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g), appBrandLaunchErrorAction.getClass().getName());
                    if (appBrandLaunchErrorAction.f243117e == appBrandRuntimeWC.mo113210l1().f239365g) {
                        appBrandRuntimeWC.mo113176H1(new C83315f(appBrandLaunchErrorAction, appBrandRuntimeWC.mo113026R(), appBrandRuntimeWC.mo113210l1().f234829Y0));
                    }
                    OpenBusinessViewUtil.m101148b(appBrandRuntimeWC);
                    return;
                }
                LaunchWxaAppInfoParcelized launchWxaAppInfoParcelized = launchInfoIpcWrapper.f243343f;
                Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "MMToClientEvent LaunchInfoIpcWrapper, appId:%s, permission:%s, relyCommLibUpdate:%b, restartOnAttrAsyncUpdatedWithLaunchRequestedLatestVersion:%b", appBrandRuntimeWC.f238147j, launchWxaAppInfoParcelized.f234895d, Boolean.valueOf(launchWxaAppInfoParcelized.f234898g), Boolean.valueOf(launchInfoIpcWrapper.f243343f.f234899h));
                C91065g gVar = appBrandRuntimeWC.f251968f1;
                if (gVar != null) {
                    gVar.mo125135j(launchInfoIpcWrapper.f243343f.f234895d);
                    if (!TextUtils.isEmpty(launchInfoIpcWrapper.f243343f.f234897f)) {
                        new C79587a().mo109702p(appBrandRuntimeWC, launchInfoIpcWrapper.f243343f.f234897f);
                    }
                } else if (appBrandRuntimeWC.mo113064k0()) {
                    Log.m105921e("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) destroyed", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                } else {
                    Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) add deferred action", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                    appBrandRuntimeWC.mo113171B1(new C83452r1(appBrandRuntimeWC, launchInfoIpcWrapper));
                }
                LaunchWxaAppMigrateInfoParcelized launchWxaAppMigrateInfoParcelized = launchInfoIpcWrapper.f243343f.f234900i;
                if (launchWxaAppMigrateInfoParcelized == null || C90599h.m113509b(launchWxaAppMigrateInfoParcelized.f234901d, appBrandRuntimeWC.f238147j)) {
                    if (launchInfoIpcWrapper.f243343f.f234898g && !appBrandRuntimeWC.mo113064k0() && !appBrandRuntimeWC.f238117P) {
                        appBrandRuntimeWC.mo113020N0(new C83459s1(appBrandRuntimeWC));
                    }
                    if (launchInfoIpcWrapper.f243343f.f234899h && !appBrandRuntimeWC.mo113064k0() && !appBrandRuntimeWC.f238117P) {
                        appBrandRuntimeWC.mo113020N0(new q1$$c(appBrandRuntimeWC));
                        return;
                    }
                    return;
                }
                appBrandRuntimeWC.mo113020N0(new q1$$b(appBrandRuntimeWC, launchInfoIpcWrapper));
            }
        } else if (obj instanceof ILaunchWxaAppInfoNotify.PluginIpcWrapper) {
            Log.m105924i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "MMToClientEvent.OnCustomDataNotifyListener PluginIpcWrapper");
            ILaunchWxaAppInfoNotify.PluginIpcWrapper pluginIpcWrapper = (ILaunchWxaAppInfoNotify.PluginIpcWrapper) obj;
            if (appBrandRuntimeWC.f238147j.equals(pluginIpcWrapper.f243344d) && appBrandRuntimeWC.f238149o.f239365g == pluginIpcWrapper.f243345e) {
                C91065g gVar2 = appBrandRuntimeWC.f251968f1;
                if (gVar2 != null) {
                    gVar2.mo125136k(pluginIpcWrapper.f243346f);
                } else if (appBrandRuntimeWC.mo113064k0()) {
                    Log.m105921e("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) destroyed", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                } else {
                    Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) add deferred action", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                    appBrandRuntimeWC.mo113171B1(new C83465t1(appBrandRuntimeWC, pluginIpcWrapper));
                }
            }
        } else if (obj instanceof ILaunchWxaAppInfoNotify.AppidABTestIpcWrapper) {
            Log.m105924i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "MMToClientEvent.OnCustomDataNotifyListener AppidABTestIpcWrapper");
            ILaunchWxaAppInfoNotify.AppidABTestIpcWrapper appidABTestIpcWrapper = (ILaunchWxaAppInfoNotify.AppidABTestIpcWrapper) obj;
            if (appBrandRuntimeWC.f238147j.equals(appidABTestIpcWrapper.f243338d) && appBrandRuntimeWC.f238149o.f239365g == appidABTestIpcWrapper.f243339e) {
                C91065g gVar3 = appBrandRuntimeWC.f251968f1;
                if (gVar3 != null) {
                    gVar3.mo125134i(appidABTestIpcWrapper.f243340f);
                } else if (appBrandRuntimeWC.mo113064k0()) {
                    Log.m105921e("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) destroyed", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                } else {
                    Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "try notify update, runtime(%s %d) add deferred action", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g));
                    appBrandRuntimeWC.mo113171B1(new C83495u1(appBrandRuntimeWC, appidABTestIpcWrapper));
                }
            }
        }
    }
}
