package zc2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86718e;
import p206nj.C11171e;
import vc3.C78382a;

/* renamed from: zc2.c */
public final class C119091c {

    /* renamed from: a */
    public static final C119091c f356647a = new C119091c();

    /* renamed from: a */
    public final void mo183768a() {
        Log.m105924i("MicroMsg.NotificationChannelFactory", "createLoginChannel");
        try {
            if (C11171e.m11046c(26)) {
                SharedPreferences u = C86718e.m107552u();
                Context context = MMApplicationContext.getContext();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                NotificationChannel notificationChannel = new NotificationChannel("login_channel_id", context.getString(C0966R.string.hba), 4);
                notificationChannel.setDescription(context.getString(C0966R.string.hb_));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.setVibrationPattern(Util.VIRBRATOR_PATTERN);
                notificationChannel.enableVibration(true);
                if (Build.VERSION.SDK_INT >= 29) {
                    notificationChannel.setAllowBubbles(true);
                }
                notificationChannel.setLockscreenVisibility(-1);
                notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                notificationManager.createNotificationChannel(notificationChannel);
                u.edit().putString("login_channel_id", "login_channel_id").commit();
                C78382a.f229697c = "login_channel_id";
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NotificationChannelFactory", "createLoginChannel " + e.getClass().getSimpleName() + ", " + e.getMessage());
        }
    }
}
