package p935cb;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import java.util.Map;
import java.util.Objects;
import p977hj.C87526a;

/* renamed from: cb.m */
public enum C79991m {
    INST;
    

    /* renamed from: e */
    public static String[] f234282e;

    /* renamed from: cb.m$a */
    public static class C79992a {

        /* renamed from: a */
        public int f234284a;

        /* renamed from: b */
        public int f234285b;

        /* renamed from: c */
        public int f234286c;

        /* renamed from: d */
        public int f234287d;

        /* renamed from: e */
        public int f234288e;

        /* renamed from: f */
        public int f234289f;

        /* renamed from: g */
        public int f234290g;

        /* renamed from: h */
        public int f234291h;

        /* renamed from: i */
        public int f234292i;

        /* renamed from: j */
        public int f234293j;

        /* renamed from: k */
        public String f234294k;
    }

    /* access modifiers changed from: public */
    static {
        f234282e = new String[]{"summary.native-heap", "summary.graphics"};
    }

    /* renamed from: a */
    public static C79992a m97210a(Debug.MemoryInfo memoryInfo) {
        C79992a aVar = new C79992a();
        if (memoryInfo == null) {
            return aVar;
        }
        aVar.f234284a = memoryInfo.getTotalPss() / 1024;
        aVar.f234285b = memoryInfo.nativePss / 1024;
        aVar.f234286c = memoryInfo.dalvikPss / 1024;
        if (Build.VERSION.SDK_INT >= 23) {
            aVar.f234287d = Util.safeParseInt(memoryInfo.getMemoryStat("summary.graphics")) / 1024;
            aVar.f234288e = Util.safeParseInt(memoryInfo.getMemoryStat("summary.system")) / 1024;
            aVar.f234289f = Util.safeParseInt(memoryInfo.getMemoryStat("summary.total-swap")) / 1024;
            aVar.f234290g = Util.safeParseInt(memoryInfo.getMemoryStat("summary.java-heap")) / 1024;
            aVar.f234291h = Util.safeParseInt(memoryInfo.getMemoryStat("summary.private-other")) / 1024;
            aVar.f234292i = Util.safeParseInt(memoryInfo.getMemoryStat("summary.code")) / 1024;
            aVar.f234293j = Util.safeParseInt(memoryInfo.getMemoryStat("summary.stack")) / 1024;
            StringBuilder sb = new StringBuilder(100);
            Map<String, String> memoryStats = memoryInfo.getMemoryStats();
            for (String next : memoryStats.keySet()) {
                if (!Util.isNullOrNil(next) && C87526a.m108857b(f234282e, next)) {
                    sb.append(next);
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    String str = memoryStats.get(next);
                    Objects.requireNonNull(str);
                    sb.append(Util.safeParseInt(str) / 1024);
                    sb.append("m ");
                    sb.append(System.getProperty("line.separator"));
                }
            }
            aVar.f234294k = sb.toString();
        }
        return aVar;
    }

    /* renamed from: b */
    public C79992a mo110171b() {
        Debug.MemoryInfo[] processMemoryInfo;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Debug.MemoryInfo memoryInfo = null;
        if (!(activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid})) == null || processMemoryInfo.length <= 0)) {
            memoryInfo = processMemoryInfo[0];
        }
        return m97210a(memoryInfo);
    }
}
