package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId = 1;
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();
    private byte _hellAccFlag_;

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            C117292a.m165357c(wakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "completeWakefulIntent", "(Landroid/content/Intent;)Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "completeWakefulIntent", "(Landroid/content/Intent;)Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            sparseArray.remove(intExtra);
            return true;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i = mNextId;
            int i2 = i + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(EXTRA_WAKE_LOCK_ID, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(60000L);
            C117292a.m165358d(newWakeLock, aVar.mo10232b(), "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            C60958c.f173611a.set(aVar);
            long longValue = ((Long) aVar.mo10231a(0)).longValue();
            C60958c.m71441a();
            newWakeLock.acquire(longValue);
            C117292a.m165359e(newWakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
