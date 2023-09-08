package li0;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI$$g;
import com.tencent.p014mm.plugin.appbrand.task.C84287e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.lang.ref.WeakReference;

/* renamed from: li0.h */
public abstract class C88535h {

    /* renamed from: a */
    public final BroadcastReceiver f255737a = new C88536a();

    /* renamed from: li0.h$a */
    public class C88536a extends BroadcastReceiver {
        public C88536a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (intent != null && "android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) && (stringExtra = intent.getStringExtra(TPReportKeys.PlayerStep.PLAYER_REASON)) != null) {
                Log.m105925i("MicroMsg.BaseAppBrandUIHomePressReceiver", "[home_pressed] action: %s, reason: %s", intent.getAction(), stringExtra);
                if (stringExtra.equals("homekey")) {
                    AppBrandUI$$g.C84457a aVar = (AppBrandUI$$g.C84457a) C88535h.this;
                    C84287e0.f246157a.mo116975a(AppBrandUI$$g.this.f246518d, "onHomePressed");
                    AppBrandUI appBrandUI = AppBrandUI$$g.this.f246518d;
                    appBrandUI.f246484B = true;
                    AppBrandRuntime activeRuntime = appBrandUI.mRuntimeContainer.getActiveRuntime();
                    if (activeRuntime != null) {
                        C81820e3 e3Var = activeRuntime.f238142e;
                        if (e3Var != null && e3Var.getActiveRuntime() == activeRuntime) {
                            activeRuntime.mo113090y();
                        }
                        C83231l.m102146g(activeRuntime.f238147j, C83231l.C83235e.HOME_PRESSED);
                    }
                } else if (stringExtra.equals("recentapps")) {
                    AppBrandUI$$g.C84457a aVar2 = (AppBrandUI$$g.C84457a) C88535h.this;
                    C84287e0.f246157a.mo116975a(AppBrandUI$$g.this.f246518d, "onRecentAppsPressed");
                    AppBrandRuntime activeRuntime2 = AppBrandUI$$g.this.f246518d.mRuntimeContainer.getActiveRuntime();
                    if (activeRuntime2 != null) {
                        C83231l.m102146g(activeRuntime2.f238147j, C83231l.C83235e.RECENT_APPS_PRESSED);
                    }
                }
            }
        }
    }

    public C88535h(Activity activity) {
        new WeakReference(activity);
    }
}
