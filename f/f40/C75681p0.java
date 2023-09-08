package f40;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: f40.p0 */
public class C75681p0 {
    /* renamed from: a */
    public static void m90934a(Context context, boolean z) {
        if (context == null) {
            Log.m105920e("MicroMsg.WeChatAppStatus", "editFullExitStatus context == null");
            return;
        }
        MultiProcessMMKV.getMMKV("system_config_prefs").edit().putBoolean("settings_fully_exit", z);
        Log.m105924i("MicroMsg.WeChatAppStatus", "editFullExitStatus to " + z);
    }

    /* renamed from: b */
    public static void m90935b(Context context, boolean z) {
        if (context == null) {
            Log.m105920e("MicroMsg.WeChatAppStatus", "editShutDownWxStatus context == null");
            return;
        }
        context.getSharedPreferences("system_config_prefs_showdown", 4).edit().putBoolean("shut_down_weixin", z).commit();
        Log.m105924i("MicroMsg.WeChatAppStatus", "editShutDownWxStatus to " + z);
    }

    /* renamed from: c */
    public static boolean m90936c(Context context) {
        if (context != null) {
            return MultiProcessMMKV.getMMKV("system_config_prefs").getBoolean("settings_fully_exit", true);
        }
        Log.m105920e("MicroMsg.WeChatAppStatus", "getFullExitStatus context == null");
        return false;
    }

    /* renamed from: d */
    public static boolean m90937d(Context context) {
        if (context != null) {
            return context.getSharedPreferences("system_config_prefs_showdown", 4).getBoolean("shut_down_weixin", false);
        }
        Log.m105920e("MicroMsg.WeChatAppStatus", "getShutDownWxStatus context == null");
        return false;
    }
}
