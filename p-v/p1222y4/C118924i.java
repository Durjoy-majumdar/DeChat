package p1222y4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C113038a;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p1014o4.C117693m;

/* renamed from: y4.i */
public class C118924i {

    /* renamed from: a */
    public static final String f356203a = C117693m.m165967e("ProcessUtils");

    /* renamed from: a */
    public static boolean m167678a(Context context, C113038a aVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C118924i.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                C117693m.m165966c().mo182389a(f356203a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str = next.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        aVar.getClass();
        return !TextUtils.isEmpty((CharSequence) null) ? TextUtils.equals(str, (CharSequence) null) : TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
