package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.ClientLaunchEntry */
public final class ClientLaunchEntry extends C83285a {
    /* renamed from: e */
    public boolean mo115585e(Context context, LaunchParcel launchParcel) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        Intent intent = new Intent(context, AppBrandLaunchProxyUI.class);
        if (castActivityOrNull == null) {
            intent.addFlags(268435456);
        } else {
            C83435s.m102389f(intent, (Activity) context);
        }
        intent.putExtra("extra_from_mm", false);
        intent.putExtra("extra_launch_parcel", launchParcel);
        intent.putExtra("extra_launch_source_context", context.getClass().getName());
        intent.putExtra("extra_launch_source_process_name", MMApplicationContext.getProcessName());
        if (castActivityOrNull != null && (castActivityOrNull instanceof AppBrandUI) && !(castActivityOrNull instanceof AppBrandPluginUI) && launchParcel.f243738o.f245533f == 1090) {
            new Application.ActivityLifecycleCallbacks(this, context, new WeakReference(castActivityOrNull)) {

                /* renamed from: d */
                public final Application f243750d;

                /* renamed from: e */
                public final /* synthetic */ Context f243751e;

                /* renamed from: f */
                public final /* synthetic */ WeakReference f243752f;

                {
                    this.f243751e = r2;
                    this.f243752f = r3;
                    Application application = (Application) r2.getApplicationContext();
                    this.f243750d = application;
                    alive();
                    application.registerActivityLifecycleCallbacks(this);
                    this.__eventId = 551436157;
                }

                public boolean callback(IEvent iEvent) {
                    AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent = (AppBrandUIEnterAnimationCompleteEvent) iEvent;
                    Activity activity = (Activity) this.f243752f.get();
                    if (activity != null) {
                        activity.moveTaskToBack(true);
                    }
                    dead();
                    this.f243750d.unregisterActivityLifecycleCallbacks(this);
                    return false;
                }

                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public void onActivityDestroyed(Activity activity) {
                    if (activity == this.f243752f.get()) {
                        dead();
                        this.f243750d.unregisterActivityLifecycleCallbacks(this);
                    }
                }

                public void onActivityPaused(Activity activity) {
                }

                public void onActivityResumed(Activity activity) {
                    if (activity == this.f243752f.get()) {
                        dead();
                        this.f243750d.unregisterActivityLifecycleCallbacks(this);
                    }
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                    if (activity == this.f243752f.get()) {
                        dead();
                        this.f243750d.unregisterActivityLifecycleCallbacks(this);
                    }
                }

                public void onActivityStopped(Activity activity) {
                }
            };
        }
        if (launchParcel.f243745v != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags(-268435457 & flags);
                ActivityStarterIpcDelegate activityStarterIpcDelegate = launchParcel.f243745v;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activityStarterIpcDelegate, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                intent.setFlags(flags);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (castActivityOrNull != null) {
            int i = launchParcel.f243748y;
            if (i < 0) {
                i = -1;
            }
            castActivityOrNull.startActivityForResult(intent, i, (Bundle) null);
        } else {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
