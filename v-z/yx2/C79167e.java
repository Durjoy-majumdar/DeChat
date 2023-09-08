package yx2;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import vx2.C78493o;

/* renamed from: yx2.e */
public class C79167e {

    /* renamed from: a */
    public static SharedPreferences f232467a = MMApplicationContext.getDefaultPreference();

    /* renamed from: b */
    public static boolean f232468b = false;

    /* renamed from: c */
    public static boolean f232469c = false;

    /* renamed from: d */
    public static boolean f232470d = true;

    /* renamed from: a */
    public static void m95837a() {
        if (f232470d) {
            Log.m105924i("MicroMsg.DynamicBgCrashHelper", "alvinluo markDrawEndPoint");
            f232467a.edit().putInt("dynamic_bg_draw_start_point_count", 0).apply();
            f232467a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
            C78493o.m94792c(true);
            f232470d = false;
        }
    }

    /* renamed from: b */
    public static void m95838b() {
        Log.m105924i("MicroMsg.DynamicBgCrashHelper", "alvinluo markInitCrash");
        C78493o.m94792c(false);
        if (f232467a == null) {
            f232467a = MMApplicationContext.getDefaultPreference();
        }
        SharedPreferences sharedPreferences = f232467a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("dynamic_bg_init_crash", true).apply();
        }
        f232469c = true;
    }

    /* renamed from: c */
    public static void m95839c() {
        if (f232467a == null) {
            f232467a = MMApplicationContext.getDefaultPreference();
        }
        SharedPreferences sharedPreferences = f232467a;
        if (sharedPreferences != null) {
            int i = sharedPreferences.getInt("dynamic_bg_init_start_point_count", 0);
            Log.m105925i("MicroMsg.DynamicBgCrashHelper", "alvinluo markInitStartPoint current: %d", Integer.valueOf(i));
            if (i > 2) {
                C78493o.m94792c(false);
                f232467a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            f232467a.edit().putInt("dynamic_bg_init_start_point_count", i + 1).apply();
        }
    }

    /* renamed from: d */
    public static void m95840d() {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = f232467a;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null)) {
            edit.putInt("dynamic_bg_init_start_point_count", 0);
            edit.putInt("dynamic_bg_draw_start_point_count", 0);
            edit.putBoolean("dynamic_bg_init_crash", false);
            edit.putBoolean("dynamic_bg_will_crash", false);
            edit.apply();
        }
        f232469c = false;
        f232468b = false;
    }
}
