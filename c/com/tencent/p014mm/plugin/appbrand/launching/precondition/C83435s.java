package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.Locale;
import k20.C9556a;
import ky2.C10432i;
import lg3.C76695c;
import p170ic.C87687a;
import p170ic.C87690d;
import ym0.C91516n;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.s */
public final class C83435s extends C83285a {

    /* renamed from: b */
    public static long f243811b;

    /* renamed from: f */
    public static void m102389f(Intent intent, Activity activity) {
        try {
            intent.putExtra("extra_from_activity_status_bar_color", activity.getWindow().getStatusBarColor());
            intent.putExtra("extra_from_activity_navigation_bar_color", activity.getWindow().getNavigationBarColor());
            intent.putExtra("extra_from_activity_window_attributes", activity.getWindow().getAttributes());
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: g */
    public static String m102390g(LaunchParcel launchParcel) {
        return (String) C87690d.m109090a(String.format(Locale.ENGLISH, "tryGetAppId(%s, %s)", new Object[]{launchParcel.f243730d, launchParcel.f243731e}), new s$$b(launchParcel));
    }

    /* renamed from: e */
    public boolean mo115585e(Context context, LaunchParcel launchParcel) {
        LaunchParamsOptional launchParamsOptional;
        Context context2 = context;
        LaunchParcel launchParcel2 = launchParcel;
        Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
        String g = m102390g(launchParcel);
        String e = C84201i.m103808e(launchParcel2, g, false);
        C84201i.m103809f(launchParcel2, e, g);
        C84128k0 k0Var = C84128k0.f245602a;
        k0Var.mo116794d(launchParcel2, e);
        if (C84186b0.m103776e()) {
            C84186b0.f245919a.mo116883k(g, e);
            C83226n.m102133j(cls, g);
            C83226n.m102124a(cls, g, String.format("Network:%s", new Object[]{NetStatusUtil.getNetTypeString(context)}));
        }
        int i = launchParcel2.f243733g;
        if (!Util.isNullOrNil(g) && i == 0 && AppBrandProcessesManager.m103869I().mo111385G(g, i)) {
            Log.m105925i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app without ProxyUI with username(%s) and appId(%s) and statObj(%s)", launchParcel2.f243730d, g, launchParcel2.f243738o);
            AppBrandInitConfigWC h = C81648d.m100144g().mo113992b(g);
            if (h != null && h.f239365g == i) {
                launchParcel2.mo115681b(h);
                WeAppOpenUICallbackIPCProxy.C83284b.m102229b(h, launchParcel2);
                h.f234807K = launchParcel2.f243743t;
                h.f234809M = launchParcel2.f243744u;
                h.f234813Q0 = launchParcel2.f243711C;
                LaunchParamsOptional launchParamsOptional2 = launchParcel2.f243740q;
                h.f234819T0 = launchParamsOptional2 == null ? 0 : launchParamsOptional2.f237922h;
                h.f234830Z = launchParcel2.f243710B;
                h.f239379j1 = new QualitySession(e, h, launchParcel2.f243738o);
                h.mo111298i(e);
                h.f239379j1.f245839n = false;
                h.f239384o1 = launchParcel2.f243712D;
                Parcelable parcelable = launchParcel2.f243717I;
                if (parcelable != null) {
                    h.f239391v1 = (WeAppOpenDeclarePromptBundle) parcelable;
                } else {
                    h.f239391v1 = null;
                }
                h.f234825W0 = false;
                h.f234815R0 = launchParcel2.f243713E;
                h.f234836p0 = launchParcel2.f243722N;
                h.f239395z1 = launchParcel2.f243723P;
                h.f239371A1 = launchParcel2.f243725R;
                h.f239372B1 = launchParcel2.f243724Q;
                h.f234845x0 = C76695c.m92341b();
                h.f234847y0 = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
                LaunchParamsOptional launchParamsOptional3 = launchParcel2.f243740q;
                h.f234799C = launchParamsOptional3 == null ? "" : launchParamsOptional3.f237923i;
                try {
                    C83440v.m102393a(context2, launchParcel2.f243745v, h, launchParcel2.f243738o);
                    k0Var.mo116795e(h);
                    return true;
                } finally {
                    launchParcel.mo115682c();
                }
            }
        }
        if (Math.abs(System.currentTimeMillis() - f243811b) < 200) {
            Log.m105928w("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start in 200 ms, just return");
            return false;
        }
        f243811b = Util.nowMilliSecond();
        Log.m105927v("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "[applaunch] start entered %s %d", g, Integer.valueOf(i));
        AppBrandLaunchReferrer appBrandLaunchReferrer = launchParcel2.f243739p;
        boolean z = appBrandLaunchReferrer != null && 4 == appBrandLaunchReferrer.f239396d;
        boolean a = C91516n.m114822a(g);
        String str = "Token@" + C83435s.class.hashCode() + "#" + System.nanoTime();
        boolean z2 = !a;
        if (z) {
            z2 = false;
        }
        C83426n nVar = new C83426n(context2, str, z2);
        nVar.f243764h = launchParcel2;
        C2039g2.m1988b(new C83421k(nVar, launchParcel2, e));
        Log.m105925i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app show ProxyUI with username(%s) and appId(%s) and statObj(%s)", launchParcel2.f243730d, g, launchParcel2.f243738o);
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        Intent intent = new Intent(context2, AppBrandLaunchProxyUI.class);
        if (castActivityOrNull == null) {
            intent.addFlags(268435456);
        } else {
            m102389f(intent, castActivityOrNull);
        }
        intent.putExtra("extra_from_mm", true);
        intent.putExtra("extra_entry_token", str);
        if (!(!a || (launchParamsOptional = launchParcel2.f243740q) == null || launchParamsOptional.f237921g == null)) {
            intent.putExtra("extra_launch_weishi_video", true);
            intent.putExtra("extra_launch_thumb_url", launchParcel2.f243740q.f237921g.f239421e);
            intent.putExtra("extra_launch_thumb_path", launchParcel2.f243740q.f237921g.f239422f);
        }
        int i2 = -1;
        if (castActivityOrNull != null) {
            int i3 = launchParcel2.f243748y;
            if (i3 >= 0) {
                i2 = i3;
            }
            castActivityOrNull.startActivityForResult(intent, i2, (Bundle) null);
        } else if (launchParcel2.f243745v != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags(-268435457 & flags);
                ActivityStarterIpcDelegate activityStarterIpcDelegate = launchParcel2.f243745v;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activityStarterIpcDelegate, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                intent.setFlags(flags);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Context context3 = context;
                C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (!z || !ProcessExplicitBackgroundOwner.INSTANCE.isBackground() || Build.VERSION.SDK_INT < 29 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_opensdk_launch_wxa_use_pending_intent_when_bg, 1) <= 0) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            Context context4 = context;
            C117292a.m165358d(context4, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            PendingIntent activity = PendingIntent.getActivity(context2, -1, intent, 201326592);
            try {
                Log.m105925i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), start proxyUI using PendingIntent", launchParcel2.f243730d, g, launchParcel2.f243738o);
                activity.send(C87687a.m109085a(this), new s$$a(launchParcel2, g), (Handler) null);
            } catch (Exception e2) {
                Log.m105925i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent failed by %s", launchParcel2.f243730d, g, launchParcel2.f243738o, e2);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent);
                Context context5 = context;
                C117292a.m165358d(context5, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context5, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        if (z && (castActivityOrNull instanceof MMActivity)) {
            ((MMActivity) context2).hideAllManagedDialogs();
        }
        return true;
    }
}
