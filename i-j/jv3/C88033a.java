package jv3;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import fv3.C87095a;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: jv3.a */
public class C88033a extends ShareTinkerInternals {

    /* renamed from: a */
    public static String f254653a;

    /* renamed from: a */
    public static String m109600a(Context context) {
        String str;
        String str2 = f254653a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = context.getPackageManager().getServiceInfo(new ComponentName(context, TinkerPatchService.class), 0).processName;
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        f254653a = str;
        return str;
    }

    /* renamed from: b */
    public static boolean m109601b(Context context) {
        int i;
        C87095a aVar = TinkerPatchService.f250525d;
        try {
            String a = m109600a(context);
            if (a == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            if (runningAppProcesses.size() == 0) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.processName.equals(a)) {
                    i = next.pid;
                    break;
                }
            }
            if (i == 0) {
                return false;
            }
            File patchDirectory = SharePatchFileUtil.getPatchDirectory(context);
            return new File(patchDirectory, "patch_service_status/running_" + i).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m109602c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String a = m109600a(context);
        if (a != null && (runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(a)) {
                    Process.killProcess(next.pid);
                }
            }
        }
    }
}
