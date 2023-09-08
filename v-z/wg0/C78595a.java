package wg0;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;

/* renamed from: wg0.a */
public class C78595a {
    /* renamed from: a */
    public static String m94981a() {
        return MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("reg_last_exit_ui", "");
    }

    /* renamed from: b */
    public static void m94982b(int i, String str) {
        C117407d.INSTANCE.mo160126c(i, str + "," + Util.nowMilliSecond() + "," + m94981a(), true, true);
    }

    /* renamed from: c */
    public static void m94983c(int i, boolean z, String str) {
        String str2;
        if (z) {
            str2 = str + "," + Util.nowMilliSecond() + "," + m94981a();
        } else {
            str2 = str + "," + Util.nowMilliSecond() + "," + MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("reg_next_enter_ui", "");
        }
        C117407d.INSTANCE.mo160126c(i, str2, true, true);
    }

    /* renamed from: d */
    public static void m94984d(String str) {
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putString("reg_last_exit_ui", str).commit();
    }

    /* renamed from: e */
    public static void m94985e(String str) {
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putString("reg_next_enter_ui", str).commit();
    }
}
