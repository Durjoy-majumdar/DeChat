package p1222y4;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
import p1014o4.C117693m;

/* renamed from: y4.m */
public class C118929m {

    /* renamed from: a */
    public static final String f356217a = C117693m.m165967e("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f356218b = new WeakHashMap<>();

    /* renamed from: a */
    public static PowerManager.WakeLock m167680a(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f356218b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
