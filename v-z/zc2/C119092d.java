package zc2;

import a70.C112760b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.Settings;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.Huawei;
import com.tencent.p014mm.sdk.vendor.MIUI;
import eb0.C86486e6;
import eb0.C86487f6;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;
import p331dj.C97481g;
import p645pj.C77091b;
import qe3.C89625d;
import vc3.C78382a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: zc2.d */
public class C119092d {
    /* renamed from: a */
    public static void m167893a(Context context, NotificationManager notificationManager, String str, boolean z, boolean z2, boolean z3, boolean z4, SharedPreferences sharedPreferences) {
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(C0966R.string.hbe), 4);
        notificationChannel.setDescription(context.getString(C0966R.string.hbd));
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setVibrationPattern(Util.VIRBRATOR_PATTERN);
        if (z) {
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(z3);
        }
        if (z) {
            if (z4) {
                String string = sharedPreferences.getString("settings.ringtone", (String) null);
                if (m167896d(string)) {
                    notificationChannel.setSound(Uri.parse(string), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
        } else if (z2) {
            if (z4) {
                String string2 = sharedPreferences.getString("settings.ringtone", (String) null);
                if (m167896d(string2)) {
                    notificationChannel.setSound(Uri.parse(string2), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            } else {
                notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        sharedPreferences.edit().putString("message_channel_id", str).commit();
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* renamed from: b */
    public static void m167894b(Context context, NotificationManager notificationManager, String str, boolean z, boolean z2, SharedPreferences sharedPreferences) {
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(C0966R.string.hbe), 4);
        notificationChannel.setDescription(context.getString(C0966R.string.hbd));
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setVibrationPattern(Util.VIRBRATOR_PATTERN);
        notificationChannel.enableVibration(z);
        if (z2) {
            String string = sharedPreferences.getString("settings.ringtone", (String) null);
            if (m167896d(string)) {
                Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s", Uri.parse(string));
                notificationChannel.setSound(Uri.parse(string), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        sharedPreferences.edit().putString("message_channel_id", str).commit();
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* renamed from: c */
    public static boolean m167895c(Context context, NotificationManager notificationManager, boolean z, boolean z2, SharedPreferences sharedPreferences) {
        boolean isEMUI8 = Huawei.isEMUI8();
        boolean isEMUI9 = Huawei.isEMUI9();
        if (!isEMUI8 && !isEMUI9) {
            return false;
        }
        String b = C78382a.m94650b();
        NotificationChannel e = m167897e(notificationManager, b);
        if (e == null) {
            m167893a(context, notificationManager, b, isEMUI8, isEMUI9, z, z2, sharedPreferences);
        } else {
            if (isEMUI8 && (!e.shouldVibrate() || e.getSound() == null)) {
                try {
                    if (e.getSound() != null) {
                        String uri = e.getSound().toString();
                        C77091b.m93037s().edit().putString("settings.ringtone", uri).commit();
                        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", uri);
                    }
                    notificationManager.deleteNotificationChannel(e.getId());
                    m167893a(context, notificationManager, "message_channel_compatibility_id", isEMUI8, isEMUI9, z, z2, sharedPreferences);
                    C78382a.f229695a = "message_channel_compatibility_id";
                    C77091b.f225181b = "message_channel_compatibility_id";
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", e2.getMessage());
                }
            } else {
                m167893a(context, notificationManager, b, isEMUI8, isEMUI9, z, z2, sharedPreferences);
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m167896d(String str) {
        boolean z;
        AssetFileDescriptor openAssetFileDescriptor;
        if (!Util.isNullOrNil(str)) {
            Uri parse = Uri.parse(str);
            try {
                openAssetFileDescriptor = MMApplicationContext.getContext().getContentResolver().openAssetFileDescriptor(parse, "r");
                new C97481g().setDataSource(openAssetFileDescriptor);
                if (openAssetFileDescriptor != null) {
                    openAssetFileDescriptor.close();
                }
                z = true;
            } catch (IOException | NullPointerException | SecurityException e) {
                Log.m105928w("MicroMsg.NotificationManufacturerCompatibility", "Couldn't open " + parse + ": " + e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s result = %s", Util.nullAs(str, "null"), Boolean.valueOf(z));
            return z;
        }
        z = false;
        Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s result = %s", Util.nullAs(str, "null"), Boolean.valueOf(z));
        return z;
        throw th;
    }

    /* renamed from: e */
    public static NotificationChannel m167897e(NotificationManager notificationManager, String str) {
        try {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            if (notificationChannels == null || notificationChannels.size() < 1) {
                return null;
            }
            for (NotificationChannel next : notificationChannels) {
                if (next != null && next.getId() != null && Util.isEqual(next.getId(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "deleteNoNumberNotification exception:%s", e.getMessage());
        }
    }

    /* renamed from: f */
    public static boolean m167898f(Context context, NotificationManager notificationManager, boolean z, boolean z2, SharedPreferences sharedPreferences) {
        if (!MIUI.ifMIUI()) {
            return false;
        }
        String b = C78382a.m94650b();
        NotificationChannel e = m167897e(notificationManager, b);
        if (e == null) {
            m167894b(context, notificationManager, b, z, z2, sharedPreferences);
        } else {
            String d = C112760b.m154225d();
            Future<C86487f6>[] futureArr = C86487f6.f251311d;
            synchronized (futureArr) {
                C119179t tVar = C119157j.f356862d;
                C86486e6 e6Var = new C86486e6(d);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                futureArr[0] = jVar.mo183887r(e6Var, 0, (String) null);
            }
            String a = C86487f6.m107217a(2);
            String[] split = a.split(";");
            Log.m105925i("MicroMsg.NotificationManufacturerCompatibility", "xiaomiNotificationCompatibility() lastVersion:%s curVersion:%s", a, Integer.valueOf(C89625d.f257841g));
            if (split != null && split.length == 2) {
                int parseInt = Integer.parseInt(split[0], 16);
                Log.m105925i("MicroMsg.NotificationManufacturerCompatibility", "xiaomiNotificationCompatibility() lastVersion:%s", Integer.valueOf(parseInt));
                if (654311424 <= parseInt && parseInt <= 654312247 && !Util.isEqual(e.getId(), "message_channel_compatibility_id")) {
                    if (e.getSound() == null) {
                        try {
                            notificationManager.deleteNotificationChannel(e.getId());
                            m167894b(context, notificationManager, "message_channel_compatibility_id", z, z2, sharedPreferences);
                            C78382a.f229695a = "message_channel_compatibility_id";
                            C77091b.f225181b = "message_channel_compatibility_id";
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", e2.getMessage());
                        }
                    } else {
                        m167894b(context, notificationManager, b, z, z2, sharedPreferences);
                    }
                }
            }
        }
        return true;
    }
}
