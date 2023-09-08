package zc2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C31543z5;
import f40.C86718e;
import java.io.File;
import p645pj.C77091b;
import vc3.C78382a;

/* renamed from: zc2.b */
public class C119090b {
    /* renamed from: a */
    public static void m167891a(String str) {
        Log.m105925i("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel ringtonePath:%s", Util.nullAs(str, ""));
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                SharedPreferences u = C86718e.m107552u();
                Context context = MMApplicationContext.getContext();
                NotificationManager notificationManager = null;
                if (i >= 23) {
                    notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(C78382a.m94650b());
                String str2 = "message_channel_" + C31543z5.m39451a();
                NotificationChannel notificationChannel2 = new NotificationChannel(str2, context.getString(C0966R.string.hbe), notificationChannel.getImportance());
                notificationChannel2.setDescription(context.getString(C0966R.string.hbd));
                notificationChannel2.enableLights(true);
                notificationChannel2.setLightColor(-16711936);
                notificationChannel2.setVibrationPattern(Util.VIRBRATOR_PATTERN);
                notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
                if (i >= 29) {
                    notificationChannel2.setAllowBubbles(notificationChannel.canBubble());
                }
                notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
                notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
                notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
                if (Util.isNullOrNil(str)) {
                    notificationChannel2.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                } else {
                    Uri uriForFile = FileProviderHelper.getUriForFile(context, C86009m1.m106378c(new File(str)));
                    context.grantUriPermission("com.android.systemui", uriForFile, 1);
                    notificationChannel2.setSound(uriForFile, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
                notificationManager.deleteNotificationChannel(C78382a.m94650b());
                notificationManager.createNotificationChannel(notificationChannel2);
                u.edit().putString("message_channel_id", str2).commit();
                C78382a.f229695a = str2;
                C77091b.f225181b = str2;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel %s, %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
