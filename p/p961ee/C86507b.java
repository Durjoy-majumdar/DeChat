package p961ee;

import android.app.ActivityManager;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.List;
import p1190de.C116608a;
import p329d3.C58104c;

/* renamed from: ee.b */
public class C86507b extends C116608a {

    /* renamed from: ee.b$a */
    public interface C86508a {
    }

    public C86507b() {
        new SparseArray();
    }

    /* renamed from: i */
    public static float m107278i(long j, long j2) {
        return (((float) j) / (((float) j2) * 1.0f)) * 100.0f;
    }

    /* renamed from: j */
    public static String m107279j(String str, int i) {
        if (str != null && str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new String(new char[(i - (str == null ? 0 : str.length()))]).replace("\u0000", " "));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m107280k(float f, int i) {
        return String.format("%." + i + "f", new Object[]{Float.valueOf(f)});
    }

    /* renamed from: l */
    public static List<C58104c<Integer, String>> m107281l(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ArrayList arrayList = new ArrayList();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.contains(context.getPackageName())) {
                    arrayList.add(new C58104c(Integer.valueOf(next.pid), next.processName));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.TopThread";
    }
}
