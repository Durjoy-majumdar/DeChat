package de2;

import android.app.ActivityManager;
import android.os.Build;
import android.text.TextUtils;
import ce2.C28545b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C45114t1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;
import s24.C90125c;

/* renamed from: de2.b */
public final class C86230b {
    /* renamed from: a */
    public static String m106828a(String str) {
        if (TextUtils.equals(str, "armeabi") || TextUtils.equals(str, XWalkEnvironment.RUNTIME_ABI_ARM32_STR)) {
            return "arm";
        }
        if (TextUtils.equals(str, XWalkEnvironment.RUNTIME_ABI_ARM64_STR)) {
            return "arm64";
        }
        if (TextUtils.equals(str, "mips")) {
            return "mips";
        }
        if (TextUtils.equals(str, "mips64")) {
            return "mips64";
        }
        if (TextUtils.equals(str, "x86")) {
            return "x86";
        }
        if (TextUtils.equals(str, "x86_64")) {
            return "x86_64";
        }
        throw new IllegalArgumentException("unknown abi: " + str);
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106829b(com.tencent.p014mm.vfs.C86009m1 r7, com.tencent.p014mm.vfs.C86009m1 r8, com.tencent.p014mm.vfs.C86011o1 r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "/"
            r1 = 0
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00ec }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ec }
            java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106426H(r8)     // Catch:{ all -> 0x00ec }
            r3.<init>(r8)     // Catch:{ all -> 0x00ec }
            r2.<init>(r3)     // Catch:{ all -> 0x00ec }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00e9 }
            r8.<init>()     // Catch:{ all -> 0x00e9 }
            boolean r3 = r7.mo119977o()     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x0031
            if (r9 == 0) goto L_0x0023
            com.tencent.mm.vfs.m1[] r3 = r7.mo119985v(r9)     // Catch:{ all -> 0x00e9 }
            goto L_0x0027
        L_0x0023:
            com.tencent.mm.vfs.m1[] r3 = r7.mo119984u()     // Catch:{ all -> 0x00e9 }
        L_0x0027:
            if (r3 == 0) goto L_0x0034
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x00e9 }
            r8.addAll(r3)     // Catch:{ all -> 0x00e9 }
            goto L_0x0034
        L_0x0031:
            r8.add(r7)     // Catch:{ all -> 0x00e9 }
        L_0x0034:
            boolean r3 = r8.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r3 != 0) goto L_0x00dc
            r3 = 0
            java.lang.Object r4 = r8.remove(r3)     // Catch:{ all -> 0x00e9 }
            com.tencent.mm.vfs.m1 r4 = (com.tencent.p014mm.vfs.C86009m1) r4     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r4.mo119971i()     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = r7.mo119971i()     // Catch:{ all -> 0x00e9 }
            int r6 = r6.length()     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r5.substring(r6)     // Catch:{ all -> 0x00e9 }
            boolean r6 = r5.startsWith(r0)     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x005c
            r6 = 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ all -> 0x00e9 }
        L_0x005c:
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x0066
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x00e9 }
        L_0x0066:
            boolean r6 = r4.mo119977o()     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x0081
            boolean r6 = r5.endsWith(r0)     // Catch:{ all -> 0x00e9 }
            if (r6 != 0) goto L_0x0081
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r6.<init>()     // Catch:{ all -> 0x00e9 }
            r6.append(r5)     // Catch:{ all -> 0x00e9 }
            r6.append(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00e9 }
        L_0x0081:
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00e9 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e9 }
            r5 = 8
            r6.setMethod(r5)     // Catch:{ all -> 0x00e9 }
            r2.putNextEntry(r6)     // Catch:{ all -> 0x00cb }
            boolean r5 = r4.mo119977o()     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x009b
            com.tencent.mm.vfs.m1[] r3 = r4.mo119985v(r9)     // Catch:{ all -> 0x00cb }
            goto L_0x009f
        L_0x009b:
            com.tencent.mm.vfs.m1[] r3 = r4.mo119984u()     // Catch:{ all -> 0x00cb }
        L_0x009f:
            if (r3 == 0) goto L_0x00c6
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x00cb }
            r8.addAll(r3)     // Catch:{ all -> 0x00cb }
            goto L_0x00c6
        L_0x00a9:
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00cb }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00d0 }
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106422D(r4)     // Catch:{ all -> 0x00d0 }
            r6.<init>(r4)     // Catch:{ all -> 0x00d0 }
        L_0x00b6:
            int r4 = r6.read(r5)     // Catch:{ all -> 0x00cd }
            if (r4 <= 0) goto L_0x00c0
            r2.write(r5, r3, r4)     // Catch:{ all -> 0x00cd }
            goto L_0x00b6
        L_0x00c0:
            r2.flush()     // Catch:{ all -> 0x00cb }
            s24.C90125c.m112774a(r6)     // Catch:{ all -> 0x00cb }
        L_0x00c6:
            r2.closeEntry()     // Catch:{ all -> 0x00e9 }
            goto L_0x0034
        L_0x00cb:
            r7 = move-exception
            goto L_0x00d8
        L_0x00cd:
            r7 = move-exception
            r1 = r6
            goto L_0x00d1
        L_0x00d0:
            r7 = move-exception
        L_0x00d1:
            r2.flush()     // Catch:{ all -> 0x00cb }
            s24.C90125c.m112774a(r1)     // Catch:{ all -> 0x00cb }
            throw r7     // Catch:{ all -> 0x00cb }
        L_0x00d8:
            r2.closeEntry()     // Catch:{ all -> 0x00e9 }
            throw r7     // Catch:{ all -> 0x00e9 }
        L_0x00dc:
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x00e9 }
            if (r7 != 0) goto L_0x00e5
            r2.setComment(r10)     // Catch:{ all -> 0x00e9 }
        L_0x00e5:
            s24.C90125c.m112774a(r2)
            return
        L_0x00e9:
            r7 = move-exception
            r1 = r2
            goto L_0x00ed
        L_0x00ec:
            r7 = move-exception
        L_0x00ed:
            s24.C90125c.m112774a(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: de2.C86230b.m106829b(com.tencent.mm.vfs.m1, com.tencent.mm.vfs.m1, com.tencent.mm.vfs.o1, java.lang.String):void");
    }

    /* renamed from: c */
    public static C86009m1 m106830c(String str, String str2) {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getExternalCacheDir(), C28545b.m38262a("¢´½¾¤¨£¤"));
        C86009m1 m1Var2 = new C86009m1(m1Var, str + str2);
        m1Var2.mo119974l().mo119987x();
        if (m1Var2.mo119964e()) {
            return m1Var2;
        }
        throw new IOException("cannot createNewFile:" + m1Var2.mo119971i());
    }

    /* renamed from: d */
    public static int m106831d(String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (TextUtils.equals(next.processName, str)) {
                    return next.pid;
                }
            }
        }
        for (C86009m1 m1Var : new C86009m1("/proc").mo119984u()) {
            if (TextUtils.isDigitsOnly(m1Var.getName()) && m1Var.mo119961a()) {
                C86009m1 m1Var2 = new C86009m1(m1Var, "cmdline");
                if (!m1Var2.mo119961a()) {
                    continue;
                } else {
                    BufferedReader bufferedReader = null;
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new C45114t1(m1Var2));
                        try {
                            if (str.equals(bufferedReader2.readLine().trim())) {
                                try {
                                    int parseInt = Integer.parseInt(m1Var.getName().trim(), 10);
                                    C90125c.m112774a(bufferedReader2);
                                    return parseInt;
                                } catch (Throwable unused) {
                                    C90125c.m112774a(bufferedReader2);
                                    return 0;
                                }
                            } else {
                                C90125c.m112774a(bufferedReader2);
                            }
                        } catch (Throwable unused2) {
                            bufferedReader = bufferedReader2;
                            C90125c.m112774a(bufferedReader);
                        }
                    } catch (Throwable unused3) {
                        C90125c.m112774a(bufferedReader);
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static C86009m1 m106832e() {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getApplicationInfo().sourceDir);
        m106838k(m1Var);
        return m1Var;
    }

    /* renamed from: f */
    public static C86009m1 m106833f() {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getApplicationInfo().sourceDir);
        for (String str : Build.SUPPORTED_ABIS) {
            C86009m1 m1Var2 = new C86009m1(m1Var.mo119974l(), "lib/" + m106828a(str));
            if (m1Var2.mo119961a()) {
                return m1Var2;
            }
        }
        throw new IOException("cannot find readable lib dir.");
    }

    /* renamed from: g */
    public static C86009m1 m106834g() {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getApplicationInfo().sourceDir);
        for (String str : Build.SUPPORTED_ABIS) {
            C86009m1 m1Var2 = new C86009m1(m1Var.mo119974l(), "oat/" + m106828a(str) + "/base.odex");
            if (m1Var2.mo119961a()) {
                return m1Var2;
            }
        }
        throw new IOException("cannot find readable base odex path.");
    }

    /* renamed from: h */
    public static C86009m1 m106835h() {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getApplicationInfo().sourceDir);
        for (String str : Build.SUPPORTED_ABIS) {
            C86009m1 m1Var2 = new C86009m1(m1Var.mo119974l(), "oat/" + m106828a(str) + "/base.vdex");
            if (m1Var2.mo119961a()) {
                return m1Var2;
            }
        }
        throw new IOException("cannot find readable base vdex path.");
    }

    /* renamed from: i */
    public static C86009m1 m106836i(String str) {
        int d = m106831d(str);
        if (d != 0) {
            C86009m1 m1Var = new C86009m1("/proc/" + d + "/maps");
            m106838k(m1Var);
            return m1Var;
        }
        throw new IOException("cannot find process: " + str);
    }

    /* renamed from: j */
    public static C86009m1 m106837j(String str) {
        int d = m106831d(str);
        if (d != 0) {
            C86009m1 m1Var = new C86009m1("/proc/" + d + "/smaps");
            m106838k(m1Var);
            return m1Var;
        }
        throw new IOException("cannot find process: " + str);
    }

    /* renamed from: k */
    public static C86009m1 m106838k(C86009m1 m1Var) {
        if (m1Var.mo119961a()) {
            return m1Var;
        }
        throw new IOException("cannot read file: " + m1Var.mo119971i());
    }
}
