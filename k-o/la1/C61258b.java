package la1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.StartMonitorKVEvent;
import com.tencent.p014mm.plugin.expt.p472ui.KvInfoUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C59773g;
import j20.C117292a;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;

@C86522b
/* renamed from: la1.b */
public class C61258b extends C86301e implements C59773g, Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public String f174351d;

    /* renamed from: e */
    public boolean f174352e = false;

    /* renamed from: f */
    public HashMap<String, List<C61259e>> f174353f = new HashMap<>();

    public static C61258b vx0() {
        return (C61258b) C86312j.m106911c(C61258b.class);
    }

    /* renamed from: SW */
    public void mo84744SW() {
        Log.m105925i("MicroMsg.ExptReportService", "%d sendStopMonitor [%s]", Integer.valueOf(hashCode()), this.f174351d);
        if (MMApplicationContext.isMMProcess() && !Util.isNullOrNil(this.f174351d)) {
            C46837f fVar = new C46837f();
            fVar.f125985g = this.f174351d;
            fVar.f125983e = 10000;
            fVar.f125984f = 2;
            C86709a0.m107524d().mo123460f(fVar);
        }
        this.f174351d = null;
        StartMonitorKVEvent startMonitorKVEvent = new StartMonitorKVEvent();
        startMonitorKVEvent.f154881d.f154882a = "";
        startMonitorKVEvent.publish();
    }

    /* renamed from: bA */
    public void mo84745bA(Context context, Intent intent) {
        intent.setClass(context, KvInfoUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/expt/kvdebug/ExptReportService", "showKvDebugUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: oV */
    public void mo84746oV(String str) {
        long currentTicks = Util.currentTicks();
        if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) && !Util.isNullOrNil(str) && str.startsWith(":exptdebug/")) {
            String substring = str.substring(11);
            Log.m105925i("MicroMsg.ExptReportService", "%d sendStartMonitor [%s]", Integer.valueOf(hashCode()), substring);
            this.f174351d = substring;
            if (MMApplicationContext.isMMProcess()) {
                C46837f fVar = new C46837f();
                fVar.f125985g = substring;
                fVar.f125983e = 10000;
                fVar.f125984f = 1;
                C86709a0.m107524d().mo123460f(fVar);
            }
            StartMonitorKVEvent startMonitorKVEvent = new StartMonitorKVEvent();
            startMonitorKVEvent.f154881d.f154882a = substring;
            startMonitorKVEvent.publish();
            this.f174352e = true;
        }
        Log.m105925i("MicroMsg.ExptReportService", "start expt Debug tools cost time [%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        mo84744SW();
        HashMap<String, List<C61259e>> hashMap = this.f174353f;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f174352e = false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        String className = activity.getComponentName().getClassName();
        if (MMApplicationContext.isMMProcess() && (!Util.isNullOrNil(this.f174351d))) {
            C46837f fVar = new C46837f();
            fVar.f125985g = className;
            fVar.f125983e = 10002;
            fVar.f125984f = 2;
            C86709a0.m107524d().mo123460f(fVar);
        }
    }

    public void onActivityResumed(Activity activity) {
        String className = activity.getComponentName().getClassName();
        if (MMApplicationContext.isMMProcess() && (!Util.isNullOrNil(this.f174351d))) {
            C46837f fVar = new C46837f();
            fVar.f125985g = className;
            fVar.f125983e = 10002;
            fVar.f125984f = 1;
            C86709a0.m107524d().mo123460f(fVar);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
