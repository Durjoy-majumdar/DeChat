package p723vf;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: vf.a */
public class C90773a {

    /* renamed from: a */
    public static C90775b f260670a;

    /* renamed from: b */
    public static long f260671b;

    /* renamed from: c */
    public static long f260672c;

    /* renamed from: d */
    public static int f260673d;

    /* renamed from: e */
    public static final FileFilter f260674e = new C90774a();

    /* renamed from: vf.a$a */
    public class C90774a implements FileFilter {
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* renamed from: vf.a$b */
    public enum C90775b {
        BEST(5),
        HIGH(4),
        MIDDLE(3),
        LOW(2),
        BAD(1),
        UN_KNOW(-1);
        

        /* renamed from: d */
        public int f260682d;

        /* access modifiers changed from: public */
        C90775b(int i) {
            this.f260682d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f A[SYNTHETIC, Splitter:B:19:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107 A[SYNTHETIC, Splitter:B:44:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014d A[SYNTHETIC, Splitter:B:56:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0164 A[SYNTHETIC, Splitter:B:64:0x0164] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double m113835a() {
        /*
            java.lang.String r1 = " "
            java.lang.String r2 = "r"
            java.lang.String r3 = "close app reader %s"
            java.lang.String r4 = "close process reader %s"
            java.lang.String r5 = "Matrix.DeviceUtil"
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 0
            r9 = 0
            r11 = 1
            r12 = 0
            java.io.RandomAccessFile r13 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            java.lang.String r0 = "/proc/stat"
            r13.<init>(r0, r2)     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            java.lang.String r0 = r13.readLine()     // Catch:{ Exception -> 0x0078 }
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0078 }
            r14 = 2
            r14 = r0[r14]     // Catch:{ Exception -> 0x0078 }
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ Exception -> 0x0078 }
            r16 = 3
            r16 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r16)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r16 = 4
            r16 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r16)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r16 = 5
            r16 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r16)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r16 = 6
            r16 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r16)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r16 = 7
            r16 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r16)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r16 = 8
            r0 = r0[r16]     // Catch:{ Exception -> 0x0078 }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0078 }
            long r14 = r14 + r16
            r13.close()     // Catch:{ Exception -> 0x006a }
            goto L_0x00a1
        L_0x006a:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r13 = r13.toString()
            r0[r12] = r13
            p723vf.C118672d.m167353c(r5, r4, r0)
            goto L_0x00a1
        L_0x0078:
            r0 = move-exception
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            r1 = r0
            goto L_0x0162
        L_0x007e:
            r0 = move-exception
            r13 = r8
        L_0x0080:
            java.lang.String r14 = "RandomAccessFile(Process Stat) reader fail, error: %s"
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x015f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x015f }
            r15[r12] = r0     // Catch:{ all -> 0x015f }
            p723vf.C118672d.m167353c(r5, r14, r15)     // Catch:{ all -> 0x015f }
            if (r13 == 0) goto L_0x00a0
            r13.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x00a0
        L_0x0093:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r13 = r13.toString()
            r0[r12] = r13
            p723vf.C118672d.m167353c(r5, r4, r0)
        L_0x00a0:
            r14 = r9
        L_0x00a1:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00f3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f3 }
            r0.<init>()     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r13 = "/proc/"
            r0.append(r13)     // Catch:{ Exception -> 0x00f3 }
            int r13 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00f3 }
            r0.append(r13)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r13 = "/stat"
            r0.append(r13)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f3 }
            r4.<init>(r0, r2)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            r1 = 13
            r1 = r0[r1]     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            r8 = 14
            r0 = r0[r8]     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            long r1 = r1 + r16
            r4.close()     // Catch:{ Exception -> 0x00de }
            goto L_0x0119
        L_0x00de:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r4 = r4.toString()
            r0[r12] = r4
            p723vf.C118672d.m167353c(r5, r3, r0)
            goto L_0x0119
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            r8 = r4
            goto L_0x014b
        L_0x00f0:
            r0 = move-exception
            r8 = r4
            goto L_0x00f8
        L_0x00f3:
            r0 = move-exception
            goto L_0x00f8
        L_0x00f5:
            r0 = move-exception
            r1 = r0
            goto L_0x014b
        L_0x00f8:
            java.lang.String r1 = "RandomAccessFile(App Stat) reader fail, error: %s"
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f5 }
            r2[r12] = r0     // Catch:{ all -> 0x00f5 }
            p723vf.C118672d.m167353c(r5, r1, r2)     // Catch:{ all -> 0x00f5 }
            if (r8 == 0) goto L_0x0118
            r8.close()     // Catch:{ Exception -> 0x010b }
            goto L_0x0118
        L_0x010b:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r1.toString()
            r0[r12] = r1
            p723vf.C118672d.m167353c(r5, r3, r0)
        L_0x0118:
            r1 = r9
        L_0x0119:
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            double r0 = (double) r1
            double r2 = (double) r14
            double r0 = r0 / r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            goto L_0x0127
        L_0x0125:
            r0 = 0
        L_0x0127:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAppCpuRate cost:"
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r6
            r2.append(r3)
            java.lang.String r3 = ",rate:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r5, r2, r3)
            return r0
        L_0x014b:
            if (r8 == 0) goto L_0x015e
            r8.close()     // Catch:{ Exception -> 0x0151 }
            goto L_0x015e
        L_0x0151:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = r2.toString()
            r0[r12] = r2
            p723vf.C118672d.m167353c(r5, r3, r0)
        L_0x015e:
            throw r1
        L_0x015f:
            r0 = move-exception
            r1 = r0
            r8 = r13
        L_0x0162:
            if (r8 == 0) goto L_0x0175
            r8.close()     // Catch:{ Exception -> 0x0168 }
            goto L_0x0175
        L_0x0168:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r2 = r2.toString()
            r0[r12] = r2
            p723vf.C118672d.m167353c(r5, r4, r0)
        L_0x0175:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90773a.m113835a():double");
    }

    /* renamed from: b */
    public static Debug.MemoryInfo m113836b(Context context) {
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length > 0) {
                return processMemoryInfo[0];
            }
            return null;
        } catch (Exception e) {
            C118672d.m167353c("Matrix.DeviceUtil", "getProcessMemoryInfo fail, error: %s", e.toString());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[SYNTHETIC, Splitter:B:30:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f A[SYNTHETIC, Splitter:B:36:0x007f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m113837c(java.lang.String r7) {
        /*
            java.lang.String r0 = "[getCoresFromFile] error! %s"
            java.lang.String r1 = "Matrix.DeviceUtil"
            r2 = 1
            r3 = 0
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005e }
            r5.<init>(r7)     // Catch:{ IOException -> 0x005e }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = "UTF-8"
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r7.<init>(r4)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = r7.readLine()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r7.close()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r4 == 0) goto L_0x0045
            java.lang.String r7 = "0-[\\d]+$"
            boolean r7 = r4.matches(r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r7 != 0) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            r7 = 2
            java.lang.String r7 = r4.substring(r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            int r7 = r7 + r2
            r5.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0044
        L_0x0038:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r4.toString()
            r2[r3] = r4
            p723vf.C118672d.m167353c(r1, r0, r2)
        L_0x0044:
            return r7
        L_0x0045:
            r5.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0055
        L_0x0049:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.toString()
            r2[r3] = r7
            p723vf.C118672d.m167353c(r1, r0, r2)
        L_0x0055:
            return r3
        L_0x0056:
            r7 = move-exception
            r4 = r5
            goto L_0x007d
        L_0x0059:
            r7 = move-exception
            r4 = r5
            goto L_0x005f
        L_0x005c:
            r7 = move-exception
            goto L_0x007d
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x005c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x005c }
            r5[r3] = r7     // Catch:{ all -> 0x005c }
            p723vf.C118672d.m167353c(r1, r0, r5)     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x007c
            r4.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x007c
        L_0x0070:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.toString()
            r2[r3] = r7
            p723vf.C118672d.m167353c(r1, r0, r2)
        L_0x007c:
            return r3
        L_0x007d:
            if (r4 == 0) goto L_0x008f
            r4.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x008f
        L_0x0083:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r4.toString()
            r2[r3] = r4
            p723vf.C118672d.m167353c(r1, r0, r2)
        L_0x008f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90773a.m113837c(java.lang.String):int");
    }

    /* renamed from: d */
    public static JSONObject m113838d(JSONObject jSONObject, Application application) {
        try {
            jSONObject.put("machine", m113839e(application));
            jSONObject.put("cpu_app", m113835a());
            jSONObject.put("mem", m113841g(application));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) application.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
            jSONObject.put("mem_free", memoryInfo.availMem / 1024);
        } catch (JSONException e) {
            C118672d.m167352b("Matrix.DeviceUtil", "[JSONException for stack, error: %s", e);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static C90775b m113839e(Context context) {
        int i;
        C90775b bVar = C90775b.MIDDLE;
        C90775b bVar2 = f260670a;
        if (bVar2 != null) {
            return bVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long g = m113841g(context);
        try {
            i = m113837c("/sys/devices/system/cpu/possible");
            if (i == 0) {
                i = m113837c("/sys/devices/system/cpu/present");
            }
            if (i == 0) {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(f260674e);
                i = listFiles == null ? 0 : listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (i == 0) {
            i = 1;
        }
        C118672d.m167353c("Matrix.DeviceUtil", "[getLevel] totalMemory:%s coresNum:%s", Long.valueOf(g), Integer.valueOf(i));
        if (g >= 8589934592L) {
            f260670a = C90775b.BEST;
        } else if (g >= 6442450944L) {
            f260670a = C90775b.HIGH;
        } else if (g >= 4294967296L) {
            f260670a = bVar;
        } else if (g >= 2147483648L) {
            if (i >= 4) {
                f260670a = bVar;
            } else if (i > 0) {
                f260670a = C90775b.LOW;
            }
        } else if (g >= 0) {
            f260670a = C90775b.BAD;
        } else {
            f260670a = C90775b.UN_KNOW;
        }
        C118672d.m167353c("Matrix.DeviceUtil", "getLevel, cost:" + (System.currentTimeMillis() - currentTimeMillis) + ", level:" + f260670a, new Object[0]);
        return f260670a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[SYNTHETIC, Splitter:B:20:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m113840f(java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            r5 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0043 }
            r1.<init>(r0)     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x003c }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x003c }
            r2.<init>(r3)     // Catch:{ all -> 0x003c }
        L_0x001c:
            java.lang.String r5 = r2.readLine()     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x002b
            r0.append(r5)     // Catch:{ all -> 0x0038 }
            r5 = 10
            r0.append(r5)     // Catch:{ all -> 0x0038 }
            goto L_0x001c
        L_0x002b:
            r2.close()     // Catch:{ all -> 0x0036 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0036 }
            r1.close()
            return r5
        L_0x0036:
            r5 = move-exception
            goto L_0x0046
        L_0x0038:
            r5 = move-exception
            r0 = r5
            r5 = r2
            goto L_0x003d
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            if (r5 == 0) goto L_0x0042
            r5.close()     // Catch:{ all -> 0x0036 }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0043:
            r0 = move-exception
            r1 = r5
            r5 = r0
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90773a.m113840f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static long m113841g(Context context) {
        long j = f260671b;
        if (0 != j) {
            return j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        activityManager.getMemoryInfo(memoryInfo);
        f260671b = memoryInfo.totalMem;
        f260672c = memoryInfo.threshold;
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            f260673d = activityManager.getMemoryClass();
        } else {
            f260673d = (int) (maxMemory / 1048576);
        }
        C118672d.m167353c("Matrix.DeviceUtil", "getTotalMemory cost:" + (System.currentTimeMillis() - currentTimeMillis) + ", total_mem:" + f260671b + ", LowMemoryThresold:" + f260672c + ", Memory Class:" + f260673d, new Object[0]);
        return f260671b;
    }

    /* renamed from: h */
    public static boolean m113842h() {
        String str = Build.CPU_ABI;
        return XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }
}
