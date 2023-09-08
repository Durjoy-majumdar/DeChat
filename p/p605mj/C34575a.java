package p605mj;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: mj.a */
public class C34575a {

    /* renamed from: a */
    public static int f92986a;

    /* renamed from: a */
    public static boolean m40396a() {
        if (f92986a == 0) {
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if (defaultPreference == null || !defaultPreference.getBoolean("settings_support_swipe", true)) {
                f92986a = 2;
            } else {
                f92986a = 1;
            }
        }
        return f92986a == 1;
    }

    /* renamed from: b */
    public static void m40397b(boolean z) {
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        boolean z2 = defaultPreference.getBoolean("settings_support_swipe", true);
        if (z2 != z) {
            defaultPreference.edit().putBoolean("settings_support_swipe", z).commit();
        }
        Log.m105925i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", Boolean.valueOf(z2), Boolean.valueOf(z));
    }
}
