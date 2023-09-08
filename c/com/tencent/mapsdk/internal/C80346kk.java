package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.tencent.mapsdk.internal.kk */
public class C80346kk {

    /* renamed from: a */
    public static final /* synthetic */ boolean f235207a = true;

    /* renamed from: b */
    private static final String f235208b = "LibaryLoaderHelper";

    /* renamed from: c */
    private static boolean f235209c;

    /* renamed from: a */
    public static boolean m97857a(Context context, String str) {
        if (f235207a || context != null) {
            File b = m97858b(context, str);
            boolean exists = b.exists();
            if (Log.isLoggable(f235208b, 4)) {
                b.getAbsolutePath();
            }
            if (!exists && !m97859b(context)) {
                return false;
            }
            try {
                System.load(b.getAbsolutePath());
                return true;
            } catch (UnsatisfiedLinkError unused) {
                return false;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static File m97858b(Context context, String str) {
        return new File(m97854a(context), System.mapLibraryName(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1 A[SYNTHETIC, Splitter:B:60:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff A[Catch:{ all -> 0x00f5, all -> 0x00e1, IOException -> 0x0109 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m97859b(android.content.Context r16) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "lib/"
            java.lang.String r2 = "LibaryLoaderHelper"
            boolean r3 = f235209c
            r4 = 0
            if (r3 == 0) goto L_0x000c
            return r4
        L_0x000c:
            r3 = 1
            f235209c = r3
            java.io.File r5 = m97854a((android.content.Context) r16)
            m97856a((java.io.File) r5)
            android.content.pm.ApplicationInfo r7 = r16.getApplicationInfo()     // Catch:{ IOException -> 0x0128 }
            java.util.zip.ZipFile r8 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0128 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0128 }
            java.lang.String r7 = r7.sourceDir     // Catch:{ IOException -> 0x0128 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0128 }
            r8.<init>(r9, r3)     // Catch:{ IOException -> 0x0128 }
            java.lang.String[] r7 = com.tencent.mapsdk.internal.C80345kj.f235205a     // Catch:{ IOException -> 0x0128 }
            int r9 = r7.length     // Catch:{ IOException -> 0x0128 }
            r10 = 0
        L_0x002a:
            if (r10 >= r9) goto L_0x0124
            r11 = r7[r10]     // Catch:{ IOException -> 0x0128 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0128 }
            r12.<init>(r1)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r13 = android.os.Build.CPU_ABI     // Catch:{ IOException -> 0x0128 }
            r12.append(r13)     // Catch:{ IOException -> 0x0128 }
            r12.append(r0)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r13 = java.lang.System.mapLibraryName(r11)     // Catch:{ IOException -> 0x0128 }
            r12.append(r13)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0128 }
            java.util.zip.ZipEntry r12 = r8.getEntry(r12)     // Catch:{ IOException -> 0x0128 }
            if (r12 == 0) goto L_0x004d
            goto L_0x0069
        L_0x004d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0128 }
            r12.<init>(r1)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r13 = android.os.Build.CPU_ABI2     // Catch:{ IOException -> 0x0128 }
            r12.append(r13)     // Catch:{ IOException -> 0x0128 }
            r12.append(r0)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r13 = java.lang.System.mapLibraryName(r11)     // Catch:{ IOException -> 0x0128 }
            r12.append(r13)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0128 }
            java.util.zip.ZipEntry r12 = r8.getEntry(r12)     // Catch:{ IOException -> 0x0128 }
        L_0x0069:
            if (r12 != 0) goto L_0x0072
            r8.close()     // Catch:{ IOException -> 0x0128 }
            m97856a((java.io.File) r5)     // Catch:{ IOException -> 0x0128 }
            return r4
        L_0x0072:
            java.lang.String r13 = r12.getName()     // Catch:{ IOException -> 0x0128 }
            if (r13 == 0) goto L_0x008f
            java.lang.String r14 = "../"
            boolean r14 = r13.contains(r14)     // Catch:{ IOException -> 0x0128 }
            if (r14 != 0) goto L_0x0088
            java.lang.String r14 = ".."
            boolean r13 = r13.contains(r14)     // Catch:{ IOException -> 0x0128 }
            if (r13 == 0) goto L_0x008f
        L_0x0088:
            r8.close()     // Catch:{ IOException -> 0x0128 }
            m97856a((java.io.File) r5)     // Catch:{ IOException -> 0x0128 }
            return r4
        L_0x008f:
            r13 = r16
            java.io.File r11 = m97858b(r13, r11)     // Catch:{ IOException -> 0x0128 }
            r14 = 4
            boolean r14 = android.util.Log.isLoggable(r2, r14)     // Catch:{ IOException -> 0x0128 }
            if (r14 == 0) goto L_0x009f
            r11.getAbsolutePath()     // Catch:{ IOException -> 0x0128 }
        L_0x009f:
            boolean r14 = f235207a     // Catch:{ IOException -> 0x0128 }
            if (r14 != 0) goto L_0x00b0
            boolean r14 = r11.exists()     // Catch:{ IOException -> 0x0128 }
            if (r14 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0128 }
            r0.<init>()     // Catch:{ IOException -> 0x0128 }
            throw r0     // Catch:{ IOException -> 0x0128 }
        L_0x00b0:
            boolean r14 = r11.createNewFile()     // Catch:{ IOException -> 0x0109 }
            if (r14 == 0) goto L_0x0103
            r14 = 0
            java.io.InputStream r12 = r8.getInputStream(r12)     // Catch:{ all -> 0x00ed }
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ all -> 0x00e9 }
            r15.<init>(r11)     // Catch:{ all -> 0x00e9 }
            r14 = 16384(0x4000, float:2.2959E-41)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x00e7 }
        L_0x00c4:
            int r6 = r12.read(r14)     // Catch:{ all -> 0x00e7 }
            if (r6 <= 0) goto L_0x00ce
            r15.write(r14, r4, r6)     // Catch:{ all -> 0x00e7 }
            goto L_0x00c4
        L_0x00ce:
            r12.close()     // Catch:{ all -> 0x00e1 }
            r15.close()     // Catch:{ IOException -> 0x0109 }
            r11.setReadable(r3, r4)     // Catch:{ IOException -> 0x0109 }
            r11.setExecutable(r3, r4)     // Catch:{ IOException -> 0x0109 }
            r11.setWritable(r3)     // Catch:{ IOException -> 0x0109 }
            int r10 = r10 + 1
            goto L_0x002a
        L_0x00e1:
            r0 = move-exception
            r1 = r0
            r15.close()     // Catch:{ IOException -> 0x0109 }
            throw r1     // Catch:{ IOException -> 0x0109 }
        L_0x00e7:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e9:
            r0 = move-exception
            r15 = r14
        L_0x00eb:
            r14 = r12
            goto L_0x00ef
        L_0x00ed:
            r0 = move-exception
            r15 = r14
        L_0x00ef:
            if (r14 == 0) goto L_0x00fd
            r14.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00fd
        L_0x00f5:
            r0 = move-exception
            r1 = r0
            if (r15 == 0) goto L_0x00fc
            r15.close()     // Catch:{ IOException -> 0x0109 }
        L_0x00fc:
            throw r1     // Catch:{ IOException -> 0x0109 }
        L_0x00fd:
            if (r15 == 0) goto L_0x0102
            r15.close()     // Catch:{ IOException -> 0x0109 }
        L_0x0102:
            throw r0     // Catch:{ IOException -> 0x0109 }
        L_0x0103:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0109 }
            r0.<init>()     // Catch:{ IOException -> 0x0109 }
            throw r0     // Catch:{ IOException -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            boolean r1 = r11.exists()     // Catch:{ IOException -> 0x0128 }
            if (r1 == 0) goto L_0x0120
            boolean r1 = r11.delete()     // Catch:{ IOException -> 0x0128 }
            if (r1 != 0) goto L_0x0120
            r1 = 6
            boolean r3 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0129 }
            if (r3 == 0) goto L_0x0120
            r11.getAbsolutePath()     // Catch:{ IOException -> 0x0128 }
        L_0x0120:
            r8.close()     // Catch:{ IOException -> 0x0128 }
            throw r0     // Catch:{ IOException -> 0x0128 }
        L_0x0124:
            r8.close()     // Catch:{ IOException -> 0x0128 }
            return r3
        L_0x0128:
            r1 = 6
        L_0x0129:
            android.util.Log.isLoggable(r2, r1)
            m97856a((java.io.File) r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80346kk.m97859b(android.content.Context):boolean");
    }

    /* renamed from: a */
    private static File m97854a(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    private static ZipEntry m97855a(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
        if (entry != null) {
            return entry;
        }
        return zipFile.getEntry("lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(str));
    }

    /* renamed from: a */
    private static void m97856a(File file) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.getName();
                    if (!file2.delete() && Log.isLoggable(f235208b, 6)) {
                        file2.getAbsolutePath();
                    }
                }
            }
            if (!file.delete() && Log.isLoggable(f235208b, 6)) {
                file.getAbsolutePath();
            }
        } catch (Exception unused) {
            Log.isLoggable(f235208b, 6);
        }
    }
}
