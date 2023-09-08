package p645pj;

import a70.C112760b;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.MIUI;
import f40.C86718e;
import oa1.C117731d;
import p206nj.C11171e;
import p918s2.C77604h;

/* renamed from: pj.b */
public class C77091b {

    /* renamed from: a */
    public static int f225180a = -1;

    /* renamed from: b */
    public static String f225181b = "";

    /* renamed from: c */
    public static SharedPreferences f225182c;

    /* renamed from: d */
    public static NotificationChannel f225183d;

    /* renamed from: e */
    public static String f225184e;

    /* renamed from: f */
    public static boolean f225185f;

    /* renamed from: g */
    public static boolean f225186g;

    /* renamed from: a */
    public static boolean m93019a() {
        return m93037s().getBoolean("settings_show_detail", true);
    }

    /* renamed from: b */
    public static boolean m93020b() {
        boolean z = m93037s().getBoolean("settings_sound", true);
        if (!C11171e.m11046c(26)) {
            return z;
        }
        if (f225180a == 0) {
            boolean d = m93022d();
            if (z != d) {
                C77095h.m93067k(d);
            }
            return d;
        }
        SharedPreferences s = m93037s();
        return s.getBoolean("settings_special_scene_sound", s.getBoolean("settings_sound", true));
    }

    /* renamed from: c */
    public static boolean m93021c() {
        SharedPreferences s = m93037s();
        boolean z = s.getBoolean("settings_voip_scene_sound", m93020b());
        if (!f225185f) {
            f225185f = true;
            s.edit().putBoolean("settings_voip_scene_sound", z).commit();
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m93022d() {
        if (C11171e.m11046c(26)) {
            NotificationChannel notificationChannel = ((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(m93028j());
            if (notificationChannel == null || notificationChannel.getImportance() >= 3) {
                return notificationChannel == null || notificationChannel.getSound() != null;
            }
            return false;
        }
        int importance = Build.VERSION.SDK_INT >= 24 ? new C77604h(MMApplicationContext.getContext()).f226244b.getImportance() : -1000;
        return importance >= 3 || importance == -1000;
    }

    /* renamed from: e */
    public static boolean m93023e() {
        if (C11171e.m11046c(26)) {
            NotificationChannel notificationChannel = ((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(m93028j());
            if (notificationChannel != null) {
                return notificationChannel.getImportance() >= 3 && notificationChannel.shouldVibrate();
            }
            return true;
        }
        int importance = Build.VERSION.SDK_INT >= 24 ? new C77604h(MMApplicationContext.getContext()).f226244b.getImportance() : -1000;
        return importance >= 3 || importance == -1000;
    }

    /* renamed from: f */
    public static boolean m93024f(String str) {
        if (!C11171e.m11045b(28)) {
            return true;
        }
        NotificationChannel notificationChannel = ((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(str);
        if (notificationChannel == null || notificationChannel.getImportance() >= 3) {
            return notificationChannel == null || notificationChannel.getSound() != null;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m93025g(String str) {
        NotificationChannel notificationChannel;
        if (!C11171e.m11045b(28) || (notificationChannel = ((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(str)) == null) {
            return true;
        }
        return notificationChannel.getImportance() >= 3 && notificationChannel.shouldVibrate();
    }

    /* renamed from: h */
    public static boolean m93026h() {
        boolean z = m93037s().getBoolean("settings_shake", true);
        if (!C11171e.m11046c(26)) {
            return z;
        }
        if (f225180a == 0) {
            boolean e = m93023e();
            if (e != z) {
                C77095h.m93065h(e);
            }
            return e;
        }
        SharedPreferences s = m93037s();
        return s.getBoolean("settings_special_scene_shake", s.getBoolean("settings_shake", true));
    }

    /* renamed from: i */
    public static boolean m93027i() {
        SharedPreferences s = m93037s();
        boolean z = s.getBoolean("settings_voip_scene_shake", m93026h());
        if (!f225186g) {
            f225186g = true;
            s.edit().putBoolean("settings_voip_scene_shake", z).commit();
        }
        return z;
    }

    /* renamed from: j */
    public static String m93028j() {
        if (Util.isNullOrNil(f225181b)) {
            f225181b = C86718e.m107552u().getString("message_channel_id", "message_channel_new_id");
        }
        return f225181b;
    }

    /* renamed from: k */
    public static String m93029k(int i) {
        String str = "";
        if (i == 0 || i == -1) {
            return str;
        }
        switch (i) {
            case 1:
                str = "Toys";
                break;
            case 2:
                str = "Cupid";
                break;
            case 3:
                str = "Celestial";
                break;
            case 4:
                str = "Delight";
                break;
            case 5:
                str = "Crystals";
                break;
            case 6:
                str = "Fairy";
                break;
            case 7:
                str = "Elegance";
                break;
        }
        return C112760b.m154225d() + "newmsgringtone" + "/" + MMApplicationContext.getContext().getString(C0966R.string.inf, new Object[]{str});
    }

    /* renamed from: l */
    public static int m93030l() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("setting_notification");
        if (mmkv != null) {
            return mmkv.decodeInt("settings.ringtone.wechat", -1);
        }
        return -1;
    }

    /* renamed from: m */
    public static void m93031m() {
        if (MIUI.ifMIUI()) {
            f225180a = 1;
            Log.m105925i("MicroMsg.BaseNotificationConfig", "iniSpecialSceneSwitchEnable() mSpecialSceneSwitchEnable:%s", 1);
            return;
        }
        int i = m93037s().getInt("special_scene_enable", -1);
        if (Util.isEqual(i, -1)) {
            f225180a = 0;
        } else {
            f225180a = i;
        }
        Log.m105925i("MicroMsg.BaseNotificationConfig", "iniSpecialSceneSwitchEnable() sceneEnable:%s mSpecialSceneSwitchEnable:%s", Integer.valueOf(i), Integer.valueOf(f225180a));
    }

    /* renamed from: n */
    public static boolean m93032n(int i, int i2, Context context) {
        if (m93033o()) {
            return true;
        }
        int i3 = m93037s().getInt("settings_active_begin_time_hour", 8);
        int i4 = m93037s().getInt("settings_active_begin_time_min", 0);
        int i5 = m93037s().getInt("settings_active_end_time_hour", 23);
        int i6 = m93037s().getInt("settings_active_end_time_min", 0);
        if (i3 == i5 && i4 == i6) {
            return false;
        }
        if (i3 == i5 && i4 < i6) {
            return i == i3 && i2 > i4 && i2 < i6;
        }
        if (i5 > i3) {
            if (i > i3 && i < i5) {
                return true;
            }
            if (i != i3 || i2 <= i4) {
                return i == i5 && i2 < i6;
            }
            return true;
        } else if (i5 >= i3 && (i3 != i5 || i4 <= i6)) {
            return true;
        } else {
            if (i > i3 && i <= 23) {
                return true;
            }
            if (i == i3 && i2 > i4) {
                return true;
            }
            if (i != i5 || i2 >= i6) {
                return i > 0 && i < i5;
            }
            return true;
        }
    }

    /* renamed from: o */
    public static boolean m93033o() {
        if (C117731d.m166007c().mo182443e("clicfg_dnd_mode_switch_new", 0, true, true) == 0) {
            return true;
        }
        return m93037s().getBoolean("settings_active_time_full", true);
    }

    /* renamed from: p */
    public static boolean m93034p() {
        return m93037s().getBoolean("settings_new_msg_notification", true);
    }

    /* renamed from: q */
    public static boolean m93035q() {
        return m93037s().getBoolean("settings_new_voip_msg_notification", true);
    }

    /* renamed from: r */
    public static boolean m93036r() {
        if (!new C77604h(MMApplicationContext.getContext()).mo107781a()) {
            return false;
        }
        if (C11171e.m11046c(26)) {
            if (f225183d == null) {
                f225183d = ((NotificationManager) MMApplicationContext.getContext().getSystemService(NotificationManager.class)).getNotificationChannel(m93028j());
            }
            NotificationChannel notificationChannel = f225183d;
            return notificationChannel == null || notificationChannel.getImportance() >= 1;
        }
    }

    /* renamed from: s */
    public static SharedPreferences m93037s() {
        SharedPreferences sharedPreferences = f225182c;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences u = C86718e.m107552u();
        f225182c = u;
        return u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r4.getCursor() != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r4.getCursor() == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r4.getCursor().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        f225184e = r1;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Boolean, java.lang.String> m93038t() {
        /*
            java.lang.String r0 = "MicroMsg.BaseNotificationConfig"
            r1 = 26
            boolean r1 = p206nj.C11171e.m11046c(r1)
            if (r1 != 0) goto L_0x00bd
            int r1 = m93030l()
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0099
            android.content.SharedPreferences r1 = m93037s()
            java.lang.String r2 = "settings.ringtone"
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x0091
            java.lang.String r4 = f225184e
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0091
            android.media.RingtoneManager r4 = new android.media.RingtoneManager
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4.<init>(r5)
            r5 = 2
            r4.setType(r5)
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0060 }
            int r5 = r4.getRingtonePosition(r5)     // Catch:{ Exception -> 0x0060 }
            if (r5 >= 0) goto L_0x0056
            android.content.SharedPreferences r1 = m93037s()     // Catch:{ Exception -> 0x0054 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0054 }
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)     // Catch:{ Exception -> 0x0054 }
            r1.commit()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = "reset ringTone"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            goto L_0x0083
        L_0x0054:
            r1 = move-exception
            goto L_0x0063
        L_0x0056:
            r3 = r1
        L_0x0057:
            android.database.Cursor r0 = r4.getCursor()
            if (r0 == 0) goto L_0x005e
            goto L_0x0078
        L_0x005e:
            r1 = r3
            goto L_0x0080
        L_0x0060:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L_0x0063:
            java.lang.String r2 = "ringTone() Exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0052 }
            r6 = 0
            java.lang.String r7 = r1.getMessage()     // Catch:{ all -> 0x0052 }
            r5[r6] = r7     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r2, r5)     // Catch:{ all -> 0x0052 }
            android.database.Cursor r0 = r4.getCursor()
            if (r0 == 0) goto L_0x005e
        L_0x0078:
            android.database.Cursor r0 = r4.getCursor()
            r0.close()
            goto L_0x005e
        L_0x0080:
            f225184e = r1
            goto L_0x0091
        L_0x0083:
            android.database.Cursor r1 = r4.getCursor()
            if (r1 == 0) goto L_0x0090
            android.database.Cursor r1 = r4.getCursor()
            r1.close()
        L_0x0090:
            throw r0
        L_0x0091:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.<init>(r2, r1)
            return r0
        L_0x0099:
            if (r1 != 0) goto L_0x00a3
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.<init>(r1, r3)
            return r0
        L_0x00a3:
            java.lang.String r0 = m93029k(r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x00b5
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            return r1
        L_0x00b5:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.<init>(r1, r3)
            return r0
        L_0x00bd:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r1 = m93028j()
            android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
            if (r0 == 0) goto L_0x00e9
            android.net.Uri r1 = r0.getSound()
            if (r1 == 0) goto L_0x00e9
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            android.net.Uri r0 = r0.getSound()
            java.lang.String r0 = r0.toString()
            r1.<init>(r2, r0)
            return r1
        L_0x00e9:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pj.C77091b.m93038t():android.util.Pair");
    }
}
