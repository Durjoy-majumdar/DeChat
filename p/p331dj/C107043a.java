package p331dj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import p206nj.C11171e;

/* renamed from: dj.a */
public class C107043a {
    /* renamed from: a */
    public static void m144903a(AudioManager audioManager, int i, int i2, int i3) {
        if (C11171e.m11046c(24)) {
            Log.m105924i("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume()");
            try {
                audioManager.adjustStreamVolume(i, i2, i3);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume() Exception: %s", e.getMessage());
                m144904b();
            }
        } else {
            audioManager.adjustStreamVolume(i, i2, i3);
        }
    }

    /* renamed from: b */
    public static void m144904b() {
        if (Build.VERSION.SDK_INT >= 23) {
            boolean isNotificationPolicyAccessGranted = ((NotificationManager) MMApplicationContext.getContext().getSystemService("notification")).isNotificationPolicyAccessGranted();
            Log.m105925i("MicroMsg.AudioAdaptNHelp", "requestPermission() result:%s", Boolean.valueOf(isNotificationPolicyAccessGranted));
            if (!isNotificationPolicyAccessGranted) {
                try {
                    Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", MMApplicationContext.getPackageName());
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/compatible/audio/AudioAdaptNHelp", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/compatible/audio/AudioAdaptNHelp", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AudioAdaptNHelp", "requestPermission() Exception:%s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m144905c(AudioManager audioManager, int i, int i2, int i3) {
        if (C11171e.m11046c(24)) {
            Log.m105924i("MicroMsg.AudioAdaptNHelp", "setStreamVolume()");
            try {
                audioManager.setStreamVolume(i, i2, i3);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AudioAdaptNHelp", "setStreamVolume() Exception:%s", e.getMessage());
                m144904b();
            }
        } else {
            audioManager.setStreamVolume(i, i2, i3);
        }
    }
}
