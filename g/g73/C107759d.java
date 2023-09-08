package g73;

import android.app.ActivityManager;
import android.content.ComponentName;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;

/* renamed from: g73.d */
public class C107759d {
    /* renamed from: a */
    public static String m145971a() {
        ComponentName componentName = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity;
        return componentName != null ? componentName.getClassName() : "";
    }

    /* renamed from: b */
    public static boolean m145972b() {
        C107763i a = C107761f.m145984a();
        Log.m105927v("MicroMsg.GestureUtil", "alvinluo timeInfo: %d, %d", Long.valueOf(a.f322499a), Long.valueOf(a.f322500b));
        if (a.f322499a == -1) {
            return false;
        }
        C107762g.m145994b(a);
        long j = a.f322500b;
        if (j / 1000 < 600) {
            C107761f.m145990g(a.f322499a, j);
            return true;
        }
        C107761f.m145987d();
        return false;
    }

    /* renamed from: c */
    public static boolean m145973c() {
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: d */
    public static void m145974d(boolean z) {
        Log.m105925i("MicroMsg.GestureGuardManager", "alvinluo setUserSetGesturePwd: %b", Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }
}
