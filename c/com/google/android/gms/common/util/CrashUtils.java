package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedList;

public final class CrashUtils {
    private static final String[] zzzc = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager zzzd = null;
    private static boolean zzze = false;
    private static boolean zzzf;
    private static boolean zzzg;
    private static int zzzh = -1;
    private static int zzzi = 0;
    private static int zzzj = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorDialogData {
        public static final int AVG_CRASH_FREQ = 2;
        public static final int BINDER_CRASH = 268435456;
        public static final int DYNAMITE_CRASH = 536870912;
        public static final int FORCED_SHUSHED_BY_WRAPPER = 4;
        public static final int NONE = 0;
        public static final int POPUP_FREQ = 1;
        public static final int SUPPRESSED = 1073741824;
    }

    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th) {
        return addErrorToDropBoxInternal(context, th, 536870912);
    }

    @Deprecated
    public static boolean addErrorToDropBox(Context context, Throwable th) {
        return addDynamiteErrorToDropBox(context, th);
    }

    public static boolean addErrorToDropBoxInternal(Context context, String str, String str2, int i) {
        return zza(context, str, str2, i, (Throwable) null);
    }

    public static boolean addErrorToDropBoxInternal(Context context, Throwable th, int i) {
        boolean z;
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
            if (!isPackageSide()) {
                return false;
            }
            if (zzdb() || (th = zza(th)) != null) {
                return zza(context, Log.getStackTraceString(th), ProcessUtils.getMyProcessName(), i, th);
            }
            return false;
        } catch (Exception e) {
            try {
                z = zzdb();
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            throw e;
        }
    }

    private static boolean isPackageSide() {
        if (zzze) {
            return zzzf;
        }
        return false;
    }

    public static boolean isSystemClassPrefixInternal(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String startsWith : zzzc) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void setTestVariables(DropBoxManager dropBoxManager, boolean z, boolean z2, int i) {
        synchronized (CrashUtils.class) {
            zzze = true;
            zzzd = dropBoxManager;
            zzzg = z;
            zzzf = z2;
            zzzh = i;
            zzzi = 0;
            zzzj = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:2|3|4|(3:6|7|(1:9))|10|12|13|(3:15|(3:19|(1:21)|22)|23)|24|(1:26)|(1:28)|29|(1:31)|32|(2:34|(1:36)(1:37))(1:38)|(14:40|41|42|43|44|45|46|47|48|49|50|51|52|(2:53|(1:55)(2:56|57)))|72|73|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:58|59|(0)|66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0165, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x013e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0145 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0171 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0158 A[Catch:{ IOException -> 0x0163, all -> 0x0160 }, LOOP:0: B:53:0x0152->B:55:0x0158, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c A[SYNTHETIC, Splitter:B:56:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0165 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0168 A[SYNTHETIC, Splitter:B:64:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e A[SYNTHETIC, Splitter:B:70:0x016e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x0171=Splitter:B:72:0x0171, B:66:0x016b=Splitter:B:66:0x016b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String zza(android.content.Context r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            java.lang.Class<com.google.android.gms.common.util.CrashUtils> r0 = com.google.android.gms.common.util.CrashUtils.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r2 = "Process: "
            r1.append(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = com.google.android.gms.common.util.Strings.nullToEmpty(r8)     // Catch:{ all -> 0x0177 }
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "Package: com.google.android.gms"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            r8 = 12451009(0xbdfcc1, float:1.744758E-38)
            java.lang.String r2 = "12.4.51 (020308-{{cl}})"
            boolean r3 = zzdb()     // Catch:{ all -> 0x0177 }
            r4 = 0
            if (r3 == 0) goto L_0x003f
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r6)     // Catch:{ Exception -> 0x003f }
            java.lang.String r5 = r6.getPackageName()     // Catch:{ Exception -> 0x003f }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch:{ Exception -> 0x003f }
            int r8 = r3.versionCode     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = r3.versionName     // Catch:{ Exception -> 0x003f }
            if (r3 == 0) goto L_0x003f
            r2 = r3
        L_0x003f:
            java.lang.String r3 = " v"
            r1.append(r3)     // Catch:{ all -> 0x0177 }
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            boolean r8 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0177 }
            if (r8 != 0) goto L_0x0082
            java.lang.String r8 = "("
            boolean r8 = r2.contains(r8)     // Catch:{ all -> 0x0177 }
            if (r8 == 0) goto L_0x0075
            java.lang.String r8 = ")"
            boolean r8 = r2.contains(r8)     // Catch:{ all -> 0x0177 }
            if (r8 != 0) goto L_0x0075
            java.lang.String r8 = "-"
            boolean r8 = r2.endsWith(r8)     // Catch:{ all -> 0x0177 }
            if (r8 == 0) goto L_0x006b
            java.lang.String r8 = "111111111"
            java.lang.String r2 = r2.concat(r8)     // Catch:{ all -> 0x0177 }
        L_0x006b:
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r2 = ")"
            java.lang.String r2 = r8.concat(r2)     // Catch:{ all -> 0x0177 }
        L_0x0075:
            java.lang.String r8 = " ("
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            r1.append(r2)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = ")"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
        L_0x0082:
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "Build: "
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0177 }
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            boolean r8 = android.os.Debug.isDebuggerConnected()     // Catch:{ all -> 0x0177 }
            if (r8 == 0) goto L_0x00a1
            java.lang.String r8 = "Debugger: Connected\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
        L_0x00a1:
            if (r9 == 0) goto L_0x00b0
            java.lang.String r8 = "DD-EDD: "
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            r1.append(r9)     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
        L_0x00b0:
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0177 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0177 }
            if (r8 != 0) goto L_0x00be
            r1.append(r7)     // Catch:{ all -> 0x0177 }
        L_0x00be:
            boolean r7 = zzdb()     // Catch:{ all -> 0x0177 }
            if (r7 == 0) goto L_0x00d4
            java.lang.String r7 = "logcat_for_system_app_crash"
            int r8 = zzzh     // Catch:{ all -> 0x0177 }
            if (r8 < 0) goto L_0x00cb
            goto L_0x00d5
        L_0x00cb:
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0177 }
            int r8 = android.provider.Settings.Secure.getInt(r6, r7, r4)     // Catch:{ all -> 0x0177 }
            goto L_0x00d5
        L_0x00d4:
            r8 = 0
        L_0x00d5:
            if (r8 <= 0) goto L_0x0171
            java.lang.String r6 = "\n"
            r1.append(r6)     // Catch:{ all -> 0x0177 }
            r6 = 0
            java.lang.ProcessBuilder r7 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r9 = 13
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.lang.String r2 = "/system/bin/logcat"
            r9[r4] = r2     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.lang.String r2 = "-v"
            r3 = 1
            r9[r3] = r2     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 2
            java.lang.String r5 = "time"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 3
            java.lang.String r5 = "-b"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 4
            java.lang.String r5 = "events"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 5
            java.lang.String r5 = "-b"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 6
            java.lang.String r5 = "system"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 7
            java.lang.String r5 = "-b"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 8
            java.lang.String r5 = "main"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 9
            java.lang.String r5 = "-b"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 10
            java.lang.String r5 = "crash"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 11
            java.lang.String r5 = "-t"
            r9[r2] = r5     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r2 = 12
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r9[r2] = r8     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.lang.ProcessBuilder r7 = r7.redirectErrorStream(r3)     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.lang.Process r7 = r7.start()     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.io.OutputStream r8 = r7.getOutputStream()     // Catch:{ IOException -> 0x013e, all -> 0x0165 }
            r8.close()     // Catch:{ IOException -> 0x013e, all -> 0x0165 }
        L_0x013e:
            java.io.InputStream r8 = r7.getErrorStream()     // Catch:{ IOException -> 0x0145, all -> 0x0165 }
            r8.close()     // Catch:{ IOException -> 0x0145, all -> 0x0165 }
        L_0x0145:
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x016c, all -> 0x0165 }
            r6 = 8192(0x2000, float:1.14794E-41)
            char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0163, all -> 0x0160 }
        L_0x0152:
            int r7 = r8.read(r6)     // Catch:{ IOException -> 0x0163, all -> 0x0160 }
            if (r7 <= 0) goto L_0x015c
            r1.append(r6, r4, r7)     // Catch:{ IOException -> 0x0163, all -> 0x0160 }
            goto L_0x0152
        L_0x015c:
            r8.close()     // Catch:{ IOException -> 0x0171 }
            goto L_0x0171
        L_0x0160:
            r7 = move-exception
            r6 = r8
            goto L_0x0166
        L_0x0163:
            r6 = r8
            goto L_0x016c
        L_0x0165:
            r7 = move-exception
        L_0x0166:
            if (r6 == 0) goto L_0x016b
            r6.close()     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            throw r7     // Catch:{ all -> 0x0177 }
        L_0x016c:
            if (r6 == 0) goto L_0x0171
            r6.close()     // Catch:{ IOException -> 0x0171 }
        L_0x0171:
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0177 }
            monitor-exit(r0)
            return r6
        L_0x0177:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.CrashUtils.zza(android.content.Context, java.lang.String, java.lang.String, int):java.lang.String");
    }

    private static synchronized Throwable zza(Throwable th) {
        Throwable th4;
        boolean z;
        synchronized (CrashUtils.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th4 = null;
            z = false;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    boolean z2 = !TextUtils.isEmpty(fileName) && fileName.startsWith(":com.google.android.gms");
                    z |= z2;
                    if (!z2 && !isSystemClassPrefixInternal(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                th4 = th4 == null ? new Throwable("<filtered>") : new Throwable("<filtered>", th4);
                th4.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        if (!z) {
            return null;
        }
        return th4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean zza(android.content.Context r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.Throwable r8) {
        /*
            java.lang.Class<com.google.android.gms.common.util.CrashUtils> r0 = com.google.android.gms.common.util.CrashUtils.class
            monitor-enter(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0059 }
            boolean r1 = isPackageSide()     // Catch:{ all -> 0x0059 }
            r2 = 0
            if (r1 == 0) goto L_0x0057
            boolean r1 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r5)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0057
        L_0x0014:
            int r1 = r5.hashCode()     // Catch:{ all -> 0x0059 }
            if (r8 != 0) goto L_0x001d
            int r8 = zzzj     // Catch:{ all -> 0x0059 }
            goto L_0x0021
        L_0x001d:
            int r8 = r8.hashCode()     // Catch:{ all -> 0x0059 }
        L_0x0021:
            int r3 = zzzi     // Catch:{ all -> 0x0059 }
            if (r3 != r1) goto L_0x002b
            int r3 = zzzj     // Catch:{ all -> 0x0059 }
            if (r3 != r8) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            zzzi = r1     // Catch:{ all -> 0x0059 }
            zzzj = r8     // Catch:{ all -> 0x0059 }
            android.os.DropBoxManager r8 = zzzd     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            java.lang.String r8 = "dropbox"
            java.lang.Object r8 = r4.getSystemService(r8)     // Catch:{ all -> 0x0059 }
            android.os.DropBoxManager r8 = (android.os.DropBoxManager) r8     // Catch:{ all -> 0x0059 }
        L_0x003c:
            if (r8 == 0) goto L_0x0055
            java.lang.String r1 = "system_app_crash"
            boolean r1 = r8.isTagEnabled(r1)     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            java.lang.String r4 = zza(r4, r5, r6, r7)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "system_app_crash"
            r8.addText(r5, r4)     // Catch:{ all -> 0x0059 }
            r4 = 1
            monitor-exit(r0)
            return r4
        L_0x0055:
            monitor-exit(r0)
            return r2
        L_0x0057:
            monitor-exit(r0)
            return r2
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.CrashUtils.zza(android.content.Context, java.lang.String, java.lang.String, int, java.lang.Throwable):boolean");
    }

    private static boolean zzdb() {
        if (zzze) {
            return zzzg;
        }
        return false;
    }
}
