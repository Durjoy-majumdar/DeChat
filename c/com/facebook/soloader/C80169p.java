package com.facebook.soloader;

import android.content.Context;
import android.os.Build;
import com.facebook.soloader.SysUtil;
import com.tencent.xweb.file.XVFSFile;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.soloader.p */
public class C80169p {

    /* renamed from: a */
    public static final boolean f234682a = true;

    /* renamed from: b */
    public static C80168o f234683b;

    /* renamed from: c */
    public static final ReentrantReadWriteLock f234684c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static C80172q[] f234685d = null;

    /* renamed from: e */
    public static final AtomicInteger f234686e = new AtomicInteger(0);

    /* renamed from: f */
    public static C80173r[] f234687f;

    /* renamed from: g */
    public static C80148c f234688g;

    /* renamed from: h */
    public static final HashSet<String> f234689h = new HashSet<>();

    /* renamed from: i */
    public static final Map<String, Object> f234690i = new HashMap();

    /* renamed from: j */
    public static final Set<String> f234691j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    public static int f234692k;

    /* renamed from: l */
    public static int f234693l = 0;

    /* renamed from: com.facebook.soloader.p$b */
    public static class C67441b {
        /* renamed from: a */
        public static String m79839a() {
            ClassLoader classLoader = C80169p.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    /* renamed from: com.facebook.soloader.p$a */
    public static class C80170a implements C80168o {

        /* renamed from: a */
        public final /* synthetic */ boolean f234694a;

        /* renamed from: b */
        public final /* synthetic */ String f234695b;

        /* renamed from: c */
        public final /* synthetic */ String f234696c;

        /* renamed from: d */
        public final /* synthetic */ Runtime f234697d;

        /* renamed from: e */
        public final /* synthetic */ Method f234698e;

        public C80170a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f234694a = z;
            this.f234695b = str;
            this.f234696c = str2;
            this.f234697d = runtime;
            this.f234698e = method;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo110984a(java.lang.String r7) {
            /*
                r6 = this;
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                r0.<init>(r7)     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                java.lang.String r7 = "MD5"
                java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                r1.<init>(r0)     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            L_0x0014:
                int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                r3 = 0
                if (r2 <= 0) goto L_0x001f
                r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                goto L_0x0014
            L_0x001f:
                java.lang.String r0 = "%32x"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                r4[r3] = r5     // Catch:{ all -> 0x0037 }
                java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
                goto L_0x004c
            L_0x0037:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r1 = move-exception
                r7.addSuppressed(r1)     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
            L_0x0042:
                throw r0     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045, NoSuchAlgorithmException -> 0x0043 }
            L_0x0043:
                r7 = move-exception
                goto L_0x0048
            L_0x0045:
                r7 = move-exception
                goto L_0x0048
            L_0x0047:
                r7 = move-exception
            L_0x0048:
                java.lang.String r7 = r7.toString()
            L_0x004c:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.C80170a.mo110984a(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r10 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            mo110984a(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo110985b(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f234694a
                if (r0 == 0) goto L_0x007a
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto L_0x000c
                r10 = 1
                goto L_0x000d
            L_0x000c:
                r10 = 0
            L_0x000d:
                if (r10 == 0) goto L_0x0012
                java.lang.String r10 = r8.f234695b
                goto L_0x0014
            L_0x0012:
                java.lang.String r10 = r8.f234696c
            L_0x0014:
                r0 = 0
                java.lang.Runtime r3 = r8.f234697d     // Catch:{ IllegalAccessException -> 0x0058, IllegalArgumentException -> 0x0056, InvocationTargetException -> 0x0054, all -> 0x004f }
                monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0058, IllegalArgumentException -> 0x0056, InvocationTargetException -> 0x0054, all -> 0x004f }
                java.lang.reflect.Method r4 = r8.f234698e     // Catch:{ all -> 0x0041 }
                java.lang.Runtime r5 = r8.f234697d     // Catch:{ all -> 0x0041 }
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0041 }
                r6[r2] = r9     // Catch:{ all -> 0x0041 }
                java.lang.Class<com.facebook.soloader.p> r2 = com.facebook.soloader.C80169p.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0041 }
                r6[r1] = r2     // Catch:{ all -> 0x0041 }
                r1 = 2
                r6[r1] = r10     // Catch:{ all -> 0x0041 }
                java.lang.Object r10 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0041 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0041 }
                if (r10 != 0) goto L_0x003b
                monitor-exit(r3)     // Catch:{ all -> 0x004d }
                if (r10 == 0) goto L_0x007d
                r8.mo110984a(r9)
                goto L_0x007d
            L_0x003b:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x004d }
                r0.<init>(r10)     // Catch:{ all -> 0x004d }
                throw r0     // Catch:{ all -> 0x004d }
            L_0x0041:
                r10 = move-exception
                r7 = r0
                r0 = r10
                r10 = r7
            L_0x0045:
                monitor-exit(r3)     // Catch:{ all -> 0x004d }
                throw r0     // Catch:{ IllegalAccessException -> 0x004b, IllegalArgumentException -> 0x0049, InvocationTargetException -> 0x0047 }
            L_0x0047:
                r0 = move-exception
                goto L_0x005c
            L_0x0049:
                r0 = move-exception
                goto L_0x005c
            L_0x004b:
                r0 = move-exception
                goto L_0x005c
            L_0x004d:
                r0 = move-exception
                goto L_0x0045
            L_0x004f:
                r10 = move-exception
                r7 = r0
                r0 = r10
                r10 = r7
                goto L_0x0074
            L_0x0054:
                r10 = move-exception
                goto L_0x0059
            L_0x0056:
                r10 = move-exception
                goto L_0x0059
            L_0x0058:
                r10 = move-exception
            L_0x0059:
                r7 = r0
                r0 = r10
                r10 = r7
            L_0x005c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r1.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r2 = "Error: Cannot load "
                r1.append(r2)     // Catch:{ all -> 0x0073 }
                r1.append(r9)     // Catch:{ all -> 0x0073 }
                java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0073 }
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0073 }
                r1.<init>(r10, r0)     // Catch:{ all -> 0x0073 }
                throw r1     // Catch:{ all -> 0x0073 }
            L_0x0073:
                r0 = move-exception
            L_0x0074:
                if (r10 == 0) goto L_0x0079
                r8.mo110984a(r9)
            L_0x0079:
                throw r0
            L_0x007a:
                java.lang.System.load(r9)
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.C80170a.mo110985b(java.lang.String, int):void");
        }
    }

    /* renamed from: com.facebook.soloader.p$c */
    public static final class C80171c extends UnsatisfiedLinkError {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C80171c(java.lang.Throwable r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "APK was built for a different platform. Supported ABIs: "
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 < r2) goto L_0x0015
                java.lang.String[] r1 = com.facebook.soloader.SysUtil.C80144a.m97443a()
                goto L_0x0019
            L_0x0015:
                java.lang.String[] r1 = com.facebook.soloader.SysUtil.LollipopSysdeps.getSupportedAbis()
            L_0x0019:
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = " error: "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5)
                r3.initCause(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.C80171c.<init>(java.lang.Throwable, java.lang.String):void");
        }
    }

    /* renamed from: a */
    public static void m97477a(Context context, ArrayList<C80172q> arrayList, int i) {
        if ((f234692k & 8) != 0) {
            f234687f = null;
            File j = C80173r.m97489j(context, "lib-main");
            try {
                SysUtil.m97440a(j);
            } catch (IOException unused) {
                j.getCanonicalPath();
            }
        } else {
            File file = new File(context.getApplicationInfo().sourceDir);
            ArrayList arrayList2 = new ArrayList();
            C80146b bVar = new C80146b(context, file, "lib-main", i);
            arrayList2.add(bVar);
            bVar.toString();
            if (context.getApplicationInfo().splitSourceDirs != null) {
                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    File file2 = new File(strArr[i2]);
                    C80146b bVar2 = new C80146b(context, file2, "lib-" + i3, i);
                    bVar2.toString();
                    arrayList2.add(bVar2);
                    i2++;
                    i3++;
                }
            }
            f234687f = (C80173r[]) arrayList2.toArray(new C80173r[arrayList2.size()]);
            arrayList.addAll(0, arrayList2);
        }
    }

    /* renamed from: b */
    public static void m97478b(ArrayList<C80172q> arrayList) {
        boolean z;
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                z = SysUtil.C80144a.m97444b();
            } else {
                try {
                    z = SysUtil.LollipopSysdeps.is64Bit();
                } catch (Exception e) {
                    String.format("Could not read /proc/self/exe. Err msg: %s", new Object[]{e.getMessage()});
                    z = false;
                }
            }
            str = z ? "/vendor/lib64:/system/lib64" : "/vendor/lib:/system/lib";
        }
        for (String file : str.split(XVFSFile.PATH_SEPARATOR)) {
            arrayList.add(new C80150e(new File(file), 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r5 = r6.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r7 >= r5) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r8 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r9 = r8.mo110989i(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.f234700d = r11;
        r8.mo110961b(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        r8 = r8.mo110960a(r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        if (r8 != 1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0063, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m97479c(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            com.facebook.soloader.q[] r1 = f234685d     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0160
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.unlock()
            r1 = 1
            r2 = 0
            if (r13 != 0) goto L_0x001e
            android.os.StrictMode$ThreadPolicy r13 = android.os.StrictMode.allowThreadDiskReads()
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            boolean r4 = f234682a
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = "SoLoader.loadLibrary["
            java.lang.String r5 = "]"
            com.facebook.soloader.C80145a.m97445a(r4, r11, r5)
        L_0x002a:
            r4 = 3
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ all -> 0x0118 }
            r0.lock()     // Catch:{ all -> 0x0118 }
            r0 = 0
            r5 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x007b
            com.facebook.soloader.q[] r6 = f234685d     // Catch:{ all -> 0x006f }
            int r7 = r6.length     // Catch:{ all -> 0x006f }
            if (r5 >= r7) goto L_0x007b
            r6 = r6[r5]     // Catch:{ all -> 0x006f }
            int r0 = r6.mo110960a(r11, r12, r13)     // Catch:{ all -> 0x006f }
            if (r0 != r4) goto L_0x006c
            com.facebook.soloader.r[] r6 = f234687f     // Catch:{ all -> 0x006f }
            if (r6 == 0) goto L_0x006c
            int r5 = r6.length     // Catch:{ all -> 0x006f }
            r7 = 0
        L_0x0049:
            if (r7 >= r5) goto L_0x007b
            r8 = r6[r7]     // Catch:{ all -> 0x006f }
            monitor-enter(r8)     // Catch:{ all -> 0x006f }
            java.lang.Object r9 = r8.mo110989i(r11)     // Catch:{ all -> 0x0069 }
            monitor-enter(r9)     // Catch:{ all -> 0x0069 }
            r8.f234700d = r11     // Catch:{ all -> 0x0066 }
            r10 = 2
            r8.mo110961b(r10)     // Catch:{ all -> 0x0066 }
            monitor-exit(r9)     // Catch:{ all -> 0x0066 }
            monitor-exit(r8)     // Catch:{ all -> 0x006f }
            int r8 = r8.mo110960a(r11, r12, r13)     // Catch:{ all -> 0x006f }
            if (r8 != r1) goto L_0x0063
            r0 = r8
            goto L_0x007b
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x0049
        L_0x0066:
            r12 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0066 }
            throw r12     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r12 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006f }
            throw r12     // Catch:{ all -> 0x006f }
        L_0x006c:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x006f:
            r12 = move-exception
            r2 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f234684c     // Catch:{ all -> 0x0118 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ all -> 0x0118 }
            r0.unlock()     // Catch:{ all -> 0x0118 }
            throw r12     // Catch:{ all -> 0x0118 }
        L_0x007b:
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = f234684c     // Catch:{ all -> 0x0116 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r12.readLock()     // Catch:{ all -> 0x0116 }
            r1.unlock()     // Catch:{ all -> 0x0116 }
            boolean r1 = f234682a
            if (r1 == 0) goto L_0x008b
            android.os.Trace.endSection()
        L_0x008b:
            if (r3 == 0) goto L_0x0090
            android.os.StrictMode.setThreadPolicy(r13)
        L_0x0090:
            if (r0 == 0) goto L_0x0094
            if (r0 != r4) goto L_0x012b
        L_0x0094:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "couldn't find DSO to load: "
            r13.append(r1)
            r13.append(r11)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r12.readLock()
            r11.lock()
            r11 = 0
        L_0x00a9:
            com.facebook.soloader.q[] r12 = f234685d
            int r12 = r12.length
            if (r11 >= r12) goto L_0x00c9
            java.lang.String r12 = "\n\tSoSource "
            r13.append(r12)
            r13.append(r11)
            java.lang.String r12 = ": "
            r13.append(r12)
            com.facebook.soloader.q[] r12 = f234685d
            r12 = r12[r11]
            java.lang.String r12 = r12.toString()
            r13.append(r12)
            int r11 = r11 + 1
            goto L_0x00a9
        L_0x00c9:
            com.facebook.soloader.c r11 = f234688g
            if (r11 == 0) goto L_0x00fb
            android.content.Context r11 = r11.f234649a     // Catch:{ NameNotFoundException -> 0x00f4 }
            java.lang.String r12 = r11.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.Context r11 = r11.createPackageContext(r12, r2)     // Catch:{ NameNotFoundException -> 0x00f4 }
            java.io.File r12 = new java.io.File
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()
            java.lang.String r11 = r11.nativeLibraryDir
            r12.<init>(r11)
            java.lang.String r11 = "\n\tNative lib dir: "
            r13.append(r11)
            java.lang.String r11 = r12.getAbsolutePath()
            r13.append(r11)
            java.lang.String r11 = "\n"
            r13.append(r11)
            goto L_0x00fb
        L_0x00f4:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x00fb:
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r11.readLock()
            r11.unlock()
            java.lang.String r11 = " result: "
            r13.append(r11)
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            java.lang.UnsatisfiedLinkError r12 = new java.lang.UnsatisfiedLinkError
            r12.<init>(r11)
            throw r12
        L_0x0116:
            r12 = move-exception
            goto L_0x011a
        L_0x0118:
            r12 = move-exception
            r0 = r2
        L_0x011a:
            boolean r1 = f234682a
            if (r1 == 0) goto L_0x0121
            android.os.Trace.endSection()
        L_0x0121:
            if (r3 == 0) goto L_0x0126
            android.os.StrictMode.setThreadPolicy(r13)
        L_0x0126:
            if (r0 == 0) goto L_0x012c
            if (r0 != r4) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            return
        L_0x012c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "couldn't find DSO to load: "
            r13.append(r1)
            r13.append(r11)
            java.lang.String r11 = r12.getMessage()
            if (r11 != 0) goto L_0x0143
            java.lang.String r11 = r12.toString()
        L_0x0143:
            java.lang.String r1 = " caused by: "
            r13.append(r1)
            r13.append(r11)
            java.lang.String r11 = " result: "
            r13.append(r11)
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError
            r13.<init>(r11)
            r13.initCause(r12)
            throw r13
        L_0x0160:
            java.lang.UnsatisfiedLinkError r12 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            r13.<init>()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "couldn't find DSO to load: "
            r13.append(r0)     // Catch:{ all -> 0x0177 }
            r13.append(r11)     // Catch:{ all -> 0x0177 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0177 }
            r12.<init>(r11)     // Catch:{ all -> 0x0177 }
            throw r12     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r11 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r12.readLock()
            r12.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.m97479c(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static void m97480d(android.content.Context r5, int r6) {
        /*
            java.lang.Class<m6.a> r0 = p1003m6.C88699a.class
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskWrites()
            int r2 = f234693l     // Catch:{ all -> 0x0060 }
            r3 = 1
            if (r2 == 0) goto L_0x000c
            goto L_0x0027
        L_0x000c:
            r2 = r6 & 32
            if (r2 != 0) goto L_0x0026
            if (r5 != 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()     // Catch:{ all -> 0x0060 }
            int r2 = r2.flags     // Catch:{ all -> 0x0060 }
            r4 = r2 & 1
            if (r4 != 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0024
            r2 = 3
            goto L_0x0027
        L_0x0024:
            r2 = 2
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            f234693l = r2     // Catch:{ all -> 0x0060 }
            r2 = 0
            m97481e(r2)     // Catch:{ all -> 0x0060 }
            m97482f(r5, r6, r2)     // Catch:{ all -> 0x0060 }
            com.facebook.soloader.n r5 = new com.facebook.soloader.n     // Catch:{ all -> 0x0060 }
            r5.<init>()     // Catch:{ all -> 0x0060 }
            monitor-enter(r0)     // Catch:{ all -> 0x0060 }
            monitor-enter(r0)     // Catch:{ all -> 0x0049 }
            m6.b r6 = p1003m6.C88699a.f256049a     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0056
            monitor-enter(r0)     // Catch:{ all -> 0x0049 }
            m6.b r6 = p1003m6.C88699a.f256049a     // Catch:{ all -> 0x0053 }
            if (r6 != 0) goto L_0x004b
            p1003m6.C88699a.f256049a = r5     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0056
        L_0x0049:
            r5 = move-exception
            goto L_0x005e
        L_0x004b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0053 }
            java.lang.String r6 = "Cannot re-initialize NativeLoader."
            r5.<init>(r6)     // Catch:{ all -> 0x0053 }
            throw r5     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            android.os.StrictMode.setThreadPolicy(r1)
            return
        L_0x005b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r5     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r5 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.m97480d(android.content.Context, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0048 A[SYNTHETIC, Splitter:B:29:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m97481e(com.facebook.soloader.C80168o r11) {
        /*
            java.lang.Class<com.facebook.soloader.p> r0 = com.facebook.soloader.C80169p.class
            monitor-enter(r0)
            if (r11 != 0) goto L_0x000e
            com.facebook.soloader.o r1 = f234683b     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return
        L_0x000b:
            r11 = move-exception
            goto L_0x0083
        L_0x000e:
            if (r11 == 0) goto L_0x0014
            f234683b = r11     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x0014:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x000b }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x000b }
            r2 = 23
            r3 = 1
            r4 = 0
            r6 = 0
            if (r1 < r2) goto L_0x0040
            r2 = 27
            if (r1 <= r2) goto L_0x0028
            goto L_0x0040
        L_0x0028:
            java.lang.Class<java.lang.Runtime> r1 = java.lang.Runtime.class
            java.lang.String r2 = "nativeLoad"
            r7 = 3
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            r7[r4] = r11     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            java.lang.Class<java.lang.ClassLoader> r8 = java.lang.ClassLoader.class
            r7[r3] = r8     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            r8 = 2
            r7[r8] = r11     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            java.lang.reflect.Method r11 = r1.getDeclaredMethod(r2, r7)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            r11.setAccessible(r3)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r11 = r6
        L_0x0041:
            if (r11 == 0) goto L_0x0045
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            if (r2 == 0) goto L_0x004e
            java.lang.String r1 = com.facebook.soloader.C80169p.C67441b.m79839a()     // Catch:{ all -> 0x000b }
            r3 = r1
            goto L_0x004f
        L_0x004e:
            r3 = r6
        L_0x004f:
            if (r3 != 0) goto L_0x0053
            r4 = r6
            goto L_0x0078
        L_0x0053:
            java.lang.String r1 = ":"
            java.lang.String[] r6 = r3.split(r1)     // Catch:{ all -> 0x000b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x000b }
            int r8 = r6.length     // Catch:{ all -> 0x000b }
            r7.<init>(r8)     // Catch:{ all -> 0x000b }
            int r8 = r6.length     // Catch:{ all -> 0x000b }
        L_0x0060:
            if (r4 >= r8) goto L_0x0073
            r9 = r6[r4]     // Catch:{ all -> 0x000b }
            java.lang.String r10 = "!"
            boolean r10 = r9.contains(r10)     // Catch:{ all -> 0x000b }
            if (r10 == 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            r7.add(r9)     // Catch:{ all -> 0x000b }
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0073:
            java.lang.String r1 = android.text.TextUtils.join(r1, r7)     // Catch:{ all -> 0x000b }
            r4 = r1
        L_0x0078:
            com.facebook.soloader.p$a r7 = new com.facebook.soloader.p$a     // Catch:{ all -> 0x000b }
            r1 = r7
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x000b }
            f234683b = r7     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x0083:
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.m97481e(com.facebook.soloader.o):void");
    }

    /* renamed from: f */
    public static void m97482f(Context context, int i, C80168o oVar) {
        int i2;
        if (f234685d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f234684c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                f234692k = i;
                ArrayList arrayList = new ArrayList();
                m97478b(arrayList);
                int i3 = 1;
                if (context != null) {
                    if ((i & 1) != 0) {
                        f234687f = null;
                        arrayList.add(0, new C80154i(context, "lib-main"));
                    } else {
                        if (SysUtil.m97442c(context, f234693l)) {
                            C80149d dVar = new C80149d(context);
                            dVar.toString();
                            arrayList.add(0, dVar);
                        } else {
                            int i4 = f234693l;
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        throw new RuntimeException("Unsupported app type, we should not reach here");
                                    }
                                }
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            C80148c cVar = new C80148c(context, i2);
                            f234688g = cVar;
                            cVar.toString();
                            arrayList.add(0, f234688g);
                        }
                        m97477a(context, arrayList, 1);
                    }
                }
                C80172q[] qVarArr = (C80172q[]) arrayList.toArray(new C80172q[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                if ((f234692k & 2) == 0) {
                    i3 = 0;
                }
                reentrantReadWriteLock.writeLock().unlock();
                int length = qVarArr.length;
                while (true) {
                    int i5 = length - 1;
                    if (length > 0) {
                        Objects.toString(qVarArr[i5]);
                        qVarArr[i5].mo110961b(i3);
                        length = i5;
                    } else {
                        f234685d = qVarArr;
                        f234686e.getAndIncrement();
                        int length2 = f234685d.length;
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                f234684c.writeLock().unlock();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m97483g(java.lang.String r17, int r18) {
        /*
            r1 = r17
            com.facebook.soloader.q[] r0 = f234685d
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L_0x00bb
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r0.readLock()
            r5.lock()
            com.facebook.soloader.q[] r5 = f234685d     // Catch:{ all -> 0x00b0 }
            if (r5 != 0) goto L_0x00a8
            java.lang.String r5 = "http://www.android.com/"
            java.lang.String r6 = "java.vendor.url"
            java.lang.String r6 = java.lang.System.getProperty(r6)     // Catch:{ all -> 0x00b0 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x0050
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r0.readLock()     // Catch:{ all -> 0x00b0 }
            r5.lock()     // Catch:{ all -> 0x00b0 }
            com.facebook.soloader.q[] r5 = f234685d     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock()     // Catch:{ all -> 0x00b0 }
            r6.unlock()     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x003c
            goto L_0x00a8
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "SoLoader.init() not yet called"
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x0044:
            r0 = move-exception
            r1 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f234684c     // Catch:{ all -> 0x00b0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ all -> 0x00b0 }
            r0.unlock()     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0050:
            java.lang.Class<com.facebook.soloader.p> r5 = com.facebook.soloader.C80169p.class
            monitor-enter(r5)     // Catch:{ all -> 0x00b0 }
            java.util.HashSet<java.lang.String> r6 = f234689h     // Catch:{ all -> 0x00a5 }
            boolean r6 = r6.contains(r1)     // Catch:{ all -> 0x00a5 }
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x0098
            k20.a r7 = new k20.a     // Catch:{ all -> 0x00a5 }
            r7.<init>()     // Catch:{ all -> 0x00a5 }
            r7.mo10233c(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r16 = new java.lang.Object     // Catch:{ all -> 0x00a5 }
            r16.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.Object[] r9 = r7.mo10232b()     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = "com/facebook/soloader/SoLoader"
            java.lang.String r11 = "loadLibraryOnNonAndroid"
            java.lang.String r12 = "(Ljava/lang/String;)Ljava/lang/Boolean;"
            java.lang.String r13 = "java/lang/System_EXEC_"
            java.lang.String r14 = "loadLibrary"
            java.lang.String r15 = "(Ljava/lang/String;)V"
            r8 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r7 = r7.mo10231a(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00a5 }
            java.lang.System.loadLibrary(r7)     // Catch:{ all -> 0x00a5 }
            java.lang.String r9 = "com/facebook/soloader/SoLoader"
            java.lang.String r10 = "loadLibraryOnNonAndroid"
            java.lang.String r11 = "(Ljava/lang/String;)Ljava/lang/Boolean;"
            java.lang.String r12 = "java/lang/System_EXEC_"
            java.lang.String r13 = "loadLibrary"
            java.lang.String r14 = "(Ljava/lang/String;)V"
            r8 = r16
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00a5 }
        L_0x0098:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r5)     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            goto L_0x00bc
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00a8:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            goto L_0x00bb
        L_0x00b0:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        L_0x00bb:
            r6 = r3
        L_0x00bc:
            if (r6 == 0) goto L_0x00c3
            boolean r0 = r6.booleanValue()
            return r0
        L_0x00c3:
            int r0 = f234693l
            r5 = 2
            if (r0 == r5) goto L_0x00c9
            r5 = 3
        L_0x00c9:
            java.lang.String r5 = java.lang.System.mapLibraryName(r17)
            r6 = r18
            r7 = 0
        L_0x00d0:
            boolean r7 = m97484h(r5, r1, r3, r6, r3)     // Catch:{ UnsatisfiedLinkError -> 0x00d6 }
            r9 = 0
            goto L_0x010c
        L_0x00d6:
            r0 = move-exception
            r8 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = f234686e
            int r0 = r0.get()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r9.writeLock()
            r9.lock()
            com.facebook.soloader.c r9 = f234688g     // Catch:{ IOException -> 0x0112 }
            if (r9 == 0) goto L_0x00fa
            com.facebook.soloader.c r9 = f234688g     // Catch:{ IOException -> 0x0112 }
            boolean r9 = r9.mo110962c()     // Catch:{ IOException -> 0x0112 }
            if (r9 == 0) goto L_0x00fa
            java.util.concurrent.atomic.AtomicInteger r9 = f234686e     // Catch:{ IOException -> 0x0112 }
            r9.getAndIncrement()     // Catch:{ IOException -> 0x0112 }
            r9 = 1
            goto L_0x00fb
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r10 = r10.writeLock()
            r10.unlock()
            java.util.concurrent.atomic.AtomicInteger r10 = f234686e
            int r10 = r10.get()
            if (r10 == r0) goto L_0x010f
        L_0x010c:
            if (r9 != 0) goto L_0x00d0
            return r7
        L_0x010f:
            throw r8
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0110 }
            r1.<init>(r0)     // Catch:{ all -> 0x0110 }
            throw r1     // Catch:{ all -> 0x0110 }
        L_0x0119:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.m97483g(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r6 = f234684c;
        r6.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r1.contains(r8) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r10 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (r3 != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        m97479c(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0071, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0072, code lost:
        r9 = r8.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0076, code lost:
        if (r9 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0091, code lost:
        throw new com.facebook.soloader.C80169p.C80171c(r8, r9.substring(r9.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0092, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0098, code lost:
        if ((r11 & 16) != 0) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x009e, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00a6, code lost:
        if (f234691j.contains(r9) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00a8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00a9, code lost:
        if (r10 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ab, code lost:
        if (r2 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00af, code lost:
        if (f234682a == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00b1, code lost:
        com.facebook.soloader.C80145a.m97445a("MergedSoMapping.invokeJniOnload[", r9, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        com.facebook.soloader.C0902l.m882a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00bc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00bd, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00bf, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e3, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r9 + "', which has been merged into '" + r8 + "'.  See comment for details.", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e6, code lost:
        if (f234682a != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e8, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00eb, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00ec, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00ed, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00f6, code lost:
        return !r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00fa, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x00fb, code lost:
        f234684c.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0104, code lost:
        throw r8;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m97484h(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, android.os.StrictMode.ThreadPolicy r12) {
        /*
            java.lang.Class<com.facebook.soloader.p> r0 = com.facebook.soloader.C80169p.class
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = f234691j
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = f234689h     // Catch:{ all -> 0x0105 }
            boolean r3 = r1.contains(r8)     // Catch:{ all -> 0x0105 }
            r4 = 1
            if (r3 == 0) goto L_0x0022
            if (r10 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            return r2
        L_0x0020:
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r5 = f234690i     // Catch:{ all -> 0x0105 }
            r6 = r5
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ all -> 0x0105 }
            boolean r6 = r6.containsKey(r8)     // Catch:{ all -> 0x0105 }
            if (r6 == 0) goto L_0x0035
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x0105 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x0105 }
            goto L_0x0040
        L_0x0035:
            java.lang.Object r6 = new java.lang.Object     // Catch:{ all -> 0x0105 }
            r6.<init>()     // Catch:{ all -> 0x0105 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x0105 }
            r5.put(r8, r6)     // Catch:{ all -> 0x0105 }
            r5 = r6
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.readLock()
            r7.lock()
            monitor-enter(r5)     // Catch:{ all -> 0x00fa }
            if (r3 != 0) goto L_0x0096
            monitor-enter(r0)     // Catch:{ all -> 0x00f7 }
            boolean r7 = r1.contains(r8)     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0061
            if (r10 != 0) goto L_0x0060
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            monitor-exit(r5)     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r6.readLock()
            r8.unlock()
            return r2
        L_0x0060:
            r3 = 1
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            if (r3 != 0) goto L_0x0096
            m97479c(r8, r11, r12)     // Catch:{ UnsatisfiedLinkError -> 0x0071 }
            monitor-enter(r0)     // Catch:{ all -> 0x00f7 }
            r1.add(r8)     // Catch:{ all -> 0x006f }
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            goto L_0x0096
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r8     // Catch:{ all -> 0x00f7 }
        L_0x006f:
            r8 = move-exception
            goto L_0x006d
        L_0x0071:
            r8 = move-exception
            java.lang.String r9 = r8.getMessage()     // Catch:{ all -> 0x00f7 }
            if (r9 == 0) goto L_0x0092
            java.lang.String r10 = "unexpected e_machine:"
            boolean r10 = r9.contains(r10)     // Catch:{ all -> 0x00f7 }
            if (r10 == 0) goto L_0x0092
            java.lang.String r10 = "unexpected e_machine:"
            int r10 = r9.lastIndexOf(r10)     // Catch:{ all -> 0x00f7 }
            java.lang.String r9 = r9.substring(r10)     // Catch:{ all -> 0x00f7 }
            com.facebook.soloader.p$c r10 = new com.facebook.soloader.p$c     // Catch:{ all -> 0x00f7 }
            r10.<init>(r8, r9)     // Catch:{ all -> 0x00f7 }
            throw r10     // Catch:{ all -> 0x00f7 }
        L_0x0092:
            throw r8     // Catch:{ all -> 0x00f7 }
        L_0x0093:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x00f7 }
        L_0x0096:
            r11 = r11 & 16
            if (r11 != 0) goto L_0x00ec
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x00f7 }
            if (r11 != 0) goto L_0x00a9
            java.util.Set<java.lang.String> r11 = f234691j     // Catch:{ all -> 0x00f7 }
            boolean r11 = r11.contains(r9)     // Catch:{ all -> 0x00f7 }
            if (r11 == 0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            if (r10 == 0) goto L_0x00ec
            if (r2 != 0) goto L_0x00ec
            boolean r10 = f234682a     // Catch:{ all -> 0x00f7 }
            if (r10 == 0) goto L_0x00b8
            java.lang.String r10 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r11 = "]"
            com.facebook.soloader.C80145a.m97445a(r10, r9, r11)     // Catch:{ all -> 0x00f7 }
        L_0x00b8:
            com.facebook.soloader.C0902l.m882a(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r10 = 0
            throw r10     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
        L_0x00bd:
            r8 = move-exception
            goto L_0x00e4
        L_0x00bf:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r12.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r12.append(r0)     // Catch:{ all -> 0x00bd }
            r12.append(r9)     // Catch:{ all -> 0x00bd }
            java.lang.String r9 = "', which has been merged into '"
            r12.append(r9)     // Catch:{ all -> 0x00bd }
            r12.append(r8)     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = "'.  See comment for details."
            r12.append(r8)     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x00bd }
            r11.<init>(r8, r10)     // Catch:{ all -> 0x00bd }
            throw r11     // Catch:{ all -> 0x00bd }
        L_0x00e4:
            boolean r9 = f234682a     // Catch:{ all -> 0x00f7 }
            if (r9 == 0) goto L_0x00eb
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f7 }
        L_0x00eb:
            throw r8     // Catch:{ all -> 0x00f7 }
        L_0x00ec:
            monitor-exit(r5)     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r6.readLock()
            r8.unlock()
            r8 = r3 ^ 1
            return r8
        L_0x00f7:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f7 }
            throw r8     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = f234684c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r9.readLock()
            r9.unlock()
            throw r8
        L_0x0105:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80169p.m97484h(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
