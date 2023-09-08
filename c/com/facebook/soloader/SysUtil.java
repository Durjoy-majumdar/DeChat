package com.facebook.soloader;

import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import org.xwalk.core.XWalkEnvironment;

public final class SysUtil {

    public static final class LollipopSysdeps {
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
                    treeSet.add("x86_64");
                } else {
                    treeSet.add(XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
                    treeSet.add("x86");
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", new Object[]{Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()});
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* renamed from: com.facebook.soloader.SysUtil$a */
    public static final class C80144a {
        /* renamed from: a */
        public static String[] m97443a() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (Process.is64Bit()) {
                treeSet.add(XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
                treeSet.add("x86_64");
            } else {
                treeSet.add(XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        /* renamed from: b */
        public static boolean m97444b() {
            return Process.is64Bit();
        }
    }

    /* renamed from: a */
    public static void m97440a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    m97440a(a);
                }
            } else {
                return;
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m97441b(java.io.File r3) {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002f
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L_0x0018
            r3 = 0
        L_0x000d:
            int r1 = r0.length
            if (r3 >= r1) goto L_0x004e
            r1 = r0[r3]
            m97441b(r1)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0018:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot list directory "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002f:
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x003c
            goto L_0x004e
        L_0x003c:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x004f }
            r3.sync()     // Catch:{ all -> 0x004f }
            r0.close()
        L_0x004e:
            return
        L_0x004f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x005a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.m97441b(java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r6.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m97442c(android.content.Context r5, int r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 1
            r2 = 2
            if (r6 != r2) goto L_0x005d
            java.io.File r6 = new java.io.File
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.String r5 = r5.sourceDir
            r6.<init>(r5)
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
            r5.<init>(r6)
            java.util.Enumeration r6 = r5.entries()     // Catch:{ all -> 0x0051 }
        L_0x0020:
            boolean r2 = r6.hasMoreElements()     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r6.nextElement()     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0020
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = ".so"
            boolean r3 = r3.endsWith(r4)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0020
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "/lib"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0020
            int r6 = r2.getMethod()     // Catch:{ all -> 0x0051 }
            if (r6 != 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            r5.close()
            goto L_0x0069
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r5 = move-exception
            r6.addSuppressed(r5)
        L_0x005c:
            throw r0
        L_0x005d:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.flags
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0069
            r1 = 1
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.m97442c(android.content.Context, int):boolean");
    }
}
