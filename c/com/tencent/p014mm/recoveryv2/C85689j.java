package com.tencent.p014mm.recoveryv2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: com.tencent.mm.recoveryv2.j */
public final class C85689j {

    /* renamed from: com.tencent.mm.recoveryv2.j$a */
    public static class C85690a {

        /* renamed from: a */
        public static Application f249687a;
    }

    /* renamed from: com.tencent.mm.recoveryv2.j$b */
    public static final class C85691b {
        /* renamed from: a */
        public static void m105833a(File file) {
            if (file != null) {
                if (!file.exists()) {
                    file.mkdirs();
                } else if (!file.isDirectory()) {
                    if (m105836d(file)) {
                        file.mkdir();
                    } else {
                        throw new IOException("Fail to delete existing file, file = " + file.getAbsolutePath());
                    }
                } else {
                    return;
                }
                if (!file.exists() || !file.isDirectory()) {
                    throw new IOException("Fail to create dir, dir = " + file.getAbsolutePath());
                }
                return;
            }
            throw new IOException("Dir is null.");
        }

        /* renamed from: b */
        public static void m105834b(File file) {
            if (file != null) {
                if (file.exists()) {
                    m105836d(file);
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    if (!file.createNewFile()) {
                        throw new IOException("Create file fail, file already exists.");
                    } else if (C85675e.f249645i) {
                        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.fileUtils", "checkCreateFile, create path: " + file.getPath());
                    }
                } else {
                    throw new IOException("Can not create parent for current file, path = " + file.getAbsolutePath());
                }
            } else {
                throw new IOException("File is null.");
            }
        }

        /* renamed from: c */
        public static void m105835c(Object obj) {
            if (obj != null) {
                if (obj instanceof Closeable) {
                    try {
                        ((Closeable) obj).close();
                    } catch (Throwable unused) {
                    }
                } else if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                }
            }
        }

        /* renamed from: d */
        public static boolean m105836d(File file) {
            if (file == null) {
                return false;
            }
            return file.isDirectory() ? m105837e(file) : m105838f(file);
        }

        /* renamed from: e */
        public static boolean m105837e(File file) {
            File[] listFiles;
            if (file == null || !file.exists()) {
                return false;
            }
            if (file.isFile()) {
                m105838f(file);
                return true;
            } else if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return true;
            } else {
                for (File e : listFiles) {
                    m105837e(e);
                }
                m105838f(file);
                return true;
            }
        }

        /* renamed from: f */
        public static boolean m105838f(File file) {
            boolean z = true;
            if (file == null) {
                return true;
            }
            if (file.exists()) {
                if (C85675e.f249645i) {
                    C85692k.C85693a.m105840a(4, "MicroMsg.recovery.fileUtils", "safeDeleteFile, try to delete path: " + file.getPath());
                }
                z = file.delete();
                if (!z) {
                    C85692k.C85693a.m105840a(5, "MicroMsg.recovery.fileUtils", "Failed to delete file, try to delete when exit. path: " + file.getPath());
                    file.deleteOnExit();
                }
            }
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4.getStatus() == 9) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r4.getStatus() == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r5 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m105827a(android.content.Context r11, long r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 30
            if (r0 < r2) goto L_0x009d
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r11.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r2 = 0
            r3 = 16
            java.util.List r0 = r0.getHistoricalProcessExitReasons(r2, r1, r3)
            java.lang.String r11 = r11.getPackageName()
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x009d
            java.lang.Object r4 = r0.next()
            android.app.ApplicationExitInfo r4 = (android.app.ApplicationExitInfo) r4
            java.lang.String r5 = r4.getProcessName()
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0022
            android.os.UserHandle r5 = r4.getUserHandle()
            android.os.UserHandle r6 = android.os.Process.myUserHandle()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0022
            long r5 = r4.getTimestamp()
            long r5 = r2 - r5
            r7 = 0
            r9 = 1
            int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            int r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x005c
            r5 = 1
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0022
            int r5 = r4.getReason()
            if (r5 == r9) goto L_0x007b
            r6 = 2
            if (r5 == r6) goto L_0x0072
            r6 = 3
            if (r5 == r6) goto L_0x0070
            switch(r5) {
                case 8: goto L_0x0070;
                case 9: goto L_0x0070;
                case 10: goto L_0x0070;
                case 11: goto L_0x0070;
                case 12: goto L_0x0070;
                case 13: goto L_0x0070;
                case 14: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0082
        L_0x0070:
            r5 = 1
            goto L_0x0083
        L_0x0072:
            int r5 = r4.getStatus()
            r6 = 9
            if (r5 != r6) goto L_0x0082
            goto L_0x0070
        L_0x007b:
            int r5 = r4.getStatus()
            if (r5 != 0) goto L_0x0082
            goto L_0x0070
        L_0x0082:
            r5 = 0
        L_0x0083:
            if (r5 == 0) goto L_0x0022
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "exitByUser: "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r12 = 4
            java.lang.String r13 = "MicroMsg.recovery.utils"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r12, r13, r11)
            return r9
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recoveryv2.C85689j.m105827a(android.content.Context, long):boolean");
    }

    /* renamed from: b */
    public static String m105828b(Context context) {
        int myPid = Process.myPid();
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid && packageName.equals(next.processName)) {
                    return next.processName;
                }
            }
        } catch (Exception unused) {
            C85692k.C85693a.m105840a(5, "MicroMsg.recovery.utils", "get proc name by am fail, try pid cmdline");
        }
        byte[] bArr = new byte[128];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + myPid + "/cmdline");
            try {
                int read = fileInputStream2.read(bArr);
                if (read > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= read) {
                            break;
                        } else if (bArr[i] <= 0) {
                            read = i;
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = new String(bArr, 0, read);
                    C85691b.m105835c(fileInputStream2);
                    return str;
                }
                C85691b.m105835c(fileInputStream2);
                return "";
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
                try {
                    C85692k.C85693a.m105840a(5, "MicroMsg.recovery.utils", "get proc name by pid cmdline fail");
                    C85691b.m105835c(fileInputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    C85691b.m105835c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = fileInputStream2;
                C85691b.m105835c(fileInputStream);
                throw th;
            }
        } catch (Exception unused3) {
            C85692k.C85693a.m105840a(5, "MicroMsg.recovery.utils", "get proc name by pid cmdline fail");
            C85691b.m105835c(fileInputStream);
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m105829c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("-") ? TextUtils.isDigitsOnly(str.substring(1)) : TextUtils.isDigitsOnly(str);
    }

    /* renamed from: d */
    public static boolean m105830d(Context context, String str) {
        if (m105828b(context) != null) {
            String b = m105828b(context);
            if (b.equals(context.getPackageName() + str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m105831e(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE)) == null) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo next : runningTasks) {
            if (next.numActivities > 0) {
                String packageName = context.getPackageName();
                ComponentName componentName = next.topActivity;
                if (componentName != null && packageName.equals(componentName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static int m105832f(long j, int i) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        C85692k.C85693a.m105840a(5, "MicroMsg.recovery.utils", j + " cannot be cast to int without changing its value.");
        return i;
    }
}
