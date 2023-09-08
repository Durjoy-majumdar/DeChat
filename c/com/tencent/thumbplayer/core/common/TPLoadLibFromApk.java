package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class TPLoadLibFromApk {
    /* access modifiers changed from: private */
    public static Context mContext = null;
    private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs = new HashMap<>();

    public static class LibraryBrokenHandler implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler mParent;

        public LibraryBrokenHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.mParent = uncaughtExceptionHandler;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof java.lang.UnsatisfiedLinkError
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0019
                boolean r0 = r6 instanceof java.lang.NoSuchMethodError
                if (r0 == 0) goto L_0x0017
                java.lang.String r0 = r6.getMessage()
                java.lang.String r3 = ".*sig(nature)?[=:].*"
                boolean r0 = r0.matches(r3)
                if (r0 == 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                if (r0 == 0) goto L_0x0025
                android.content.Context r0 = com.tencent.thumbplayer.core.common.TPLoadLibFromApk.mContext     // Catch:{ Exception -> 0x0024 }
                com.tencent.thumbplayer.core.common.TPLoadLibFromApk.extractAllLibraries(r0)     // Catch:{ Exception -> 0x0024 }
                goto L_0x0026
            L_0x0024:
            L_0x0025:
                r1 = 0
            L_0x0026:
                if (r1 == 0) goto L_0x0033
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Invalid so detected and recovered."
                r0.<init>(r1)
                java.lang.Throwable r6 = r0.initCause(r6)
            L_0x0033:
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.mParent
                r0.uncaughtException(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPLoadLibFromApk.LibraryBrokenHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }

    private TPLoadLibFromApk() {
    }

    /* access modifiers changed from: private */
    public static void extractAllLibraries(Context context) {
        if (context != null) {
            List<String> generateAbiList = generateAbiList();
            File dir = context.getDir("recover_lib", 0);
            ZipFile zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
            try {
                HashSet hashSet = new HashSet();
                Pattern compile = Pattern.compile("lib/[A-Za-z0-9-_=]+/lib([A-Za-z0-9-_=]+)\\.so");
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (!TextUtils.isEmpty(name)) {
                        if (name.contains("../")) {
                            throw new Exception("contain ../, throw err");
                        }
                    }
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        if (!hashSet.contains(group)) {
                            extractLibrary(zipFile, group, generateAbiList, new File(dir, "lib" + group + ".so"));
                            hashSet.add(group);
                        }
                    }
                }
            } finally {
                zipFile.close();
            }
        }
    }

    private static boolean extractLibrary(ZipFile zipFile, String str, List<String> list, File file) {
        if (file.isFile()) {
            return true;
        }
        Iterator<String> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        ZipEntry entry = zipFile.getEntry("lib/" + it.next() + "/lib" + str + ".so");
        if (entry == null) {
            return false;
        }
        String name = entry.getName();
        if (!TextUtils.isEmpty(name) && name.contains("../")) {
            return false;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        file.setReadOnly();
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            } finally {
                inputStream.close();
                fileOutputStream.close();
            }
        }
    }

    public static String find(String str, Context context) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            ClassLoader classLoader = TPLoadLibFromApk.class.getClassLoader();
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            str2 = (String) declaredMethod.invoke(classLoader, new Object[]{str});
        } catch (Exception unused) {
        }
        if (str2 != null) {
            return str2;
        }
        File dir = context.getDir("recover_lib", 0);
        File file = new File(dir, "lib" + str + ".so");
        return file.canRead() ? file.getAbsolutePath() : str2;
    }

    private static List<String> generateAbiList() {
        ArrayList arrayList = new ArrayList(3);
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
        String str = (String) method.invoke((Object) null, new Object[]{"ro.product.cpu.abi"});
        if (str != null && str.length() > 0) {
            arrayList.add(str);
        }
        String str2 = (String) method.invoke((Object) null, new Object[]{"ro.product.cpu.abi2"});
        if (str2 != null && str2.length() > 0) {
            arrayList.add(str2);
        }
        arrayList.add("armeabi");
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r7 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "context is null,load by System.loadLibrary,name= " + r5);
        reflectSystemLoadLibrary(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.put(r5, new java.lang.ref.WeakReference(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed loading library: " + r5).initCause(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed loading library: " + r5).initCause(r6.getCause()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r0 = r7.getDir("recover_lib", 0);
        r1 = new java.io.File(r0, "lib" + r5 + ".so");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = loadFromRecovery(r5, r6, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r0 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        return loadFromApk(r5, r6, r7, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean load(java.lang.String r5, java.lang.ClassLoader r6, android.content.Context r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x00f6
            int r1 = r5.length()
            if (r1 == 0) goto L_0x00f6
            if (r6 != 0) goto L_0x000d
            goto L_0x00f6
        L_0x000d:
            mContext = r7
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r1 = mLoadedLibs
            monitor-enter(r1)
            r2 = 0
            java.lang.Object r3 = r1.get(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x0021
            java.lang.Object r2 = r3.get()     // Catch:{ all -> 0x00f3 }
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch:{ all -> 0x00f3 }
        L_0x0021:
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 != r6) goto L_0x003d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r6.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = "callerClassLoader has already load ! name="
            r6.append(r7)     // Catch:{ all -> 0x00f3 }
            r6.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00f3 }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r3, r5)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return r4
        L_0x003d:
            java.lang.UnsatisfiedLinkError r6 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r7.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "Library '"
            r7.append(r0)     // Catch:{ all -> 0x00f3 }
            r7.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "' was loaded by a different ClassLoader."
            r7.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x00f3 }
            r6.<init>(r5)     // Catch:{ all -> 0x00f3 }
            throw r6     // Catch:{ all -> 0x00f3 }
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            if (r7 != 0) goto L_0x00c1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            r7.<init>()     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            java.lang.String r0 = "context is null,load by System.loadLibrary,name= "
            r7.append(r0)     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            r7.append(r5)     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            java.lang.String r7 = r7.toString()     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r3, r7)     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            reflectSystemLoadLibrary(r5, r6)     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            monitor-enter(r1)     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x007e }
            r7.<init>(r6)     // Catch:{ all -> 0x007e }
            r1.put(r5, r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            return r4
        L_0x007e:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r6     // Catch:{ InvocationTargetException -> 0x009f, Exception -> 0x0081 }
        L_0x0081:
            r6 = move-exception
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed loading library: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            java.lang.Throwable r5 = r7.initCause(r6)
            java.lang.UnsatisfiedLinkError r5 = (java.lang.UnsatisfiedLinkError) r5
            throw r5
        L_0x009f:
            r6 = move-exception
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed loading library: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            java.lang.Throwable r5 = r6.getCause()
            java.lang.Throwable r5 = r7.initCause(r5)
            java.lang.UnsatisfiedLinkError r5 = (java.lang.UnsatisfiedLinkError) r5
            throw r5
        L_0x00c1:
            java.lang.String r1 = "recover_lib"
            java.io.File r0 = r7.getDir(r1, r0)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lib"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ".so"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            java.lang.UnsatisfiedLinkError r0 = loadFromRecovery(r5, r6, r7, r1)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00ea
            return r4
        L_0x00ea:
            boolean r5 = loadFromApk(r5, r6, r7, r1, r0)     // Catch:{ all -> 0x00ef }
            return r5
        L_0x00ef:
            r5 = move-exception
            throw r5
        L_0x00f1:
            r5 = move-exception
            throw r5
        L_0x00f3:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            throw r5
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPLoadLibFromApk.load(java.lang.String, java.lang.ClassLoader, android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc A[SYNTHETIC, Splitter:B:44:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean loadFromApk(java.lang.String r4, java.lang.ClassLoader r5, android.content.Context r6, java.io.File r7, java.lang.UnsatisfiedLinkError r8) {
        /*
            r0 = 0
            r1 = 0
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r6 = r6.sourceDir     // Catch:{ Exception -> 0x00bb }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00bb }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r1.<init>()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r3 = "unzip apk,name= "
            r1.append(r3)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r1.append(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r3 = "apkPath="
            r1.append(r3)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r1.append(r6)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r1 = 2
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r6)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.util.List r6 = generateAbiList()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            boolean r6 = extractLibrary(r2, r4, r6, r7)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            if (r6 == 0) goto L_0x009c
            r2.close()     // Catch:{ IOException -> 0x009b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            r6.<init>()     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            java.lang.String r0 = "load from unzip apk,name= "
            r6.append(r0)     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            r6.append(r4)     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            java.lang.String r6 = r6.toString()     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r6)     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            java.lang.String r6 = r7.getAbsolutePath()     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            reflectSystemLoad(r6, r5)     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r6 = mLoadedLibs     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            monitor-enter(r6)     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0061 }
            r7.<init>(r5)     // Catch:{ all -> 0x0061 }
            r6.put(r4, r7)     // Catch:{ all -> 0x0061 }
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            r4 = 1
            return r4
        L_0x0061:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ InvocationTargetException -> 0x0076, Exception -> 0x0064 }
        L_0x0064:
            r4 = move-exception
            if (r8 != 0) goto L_0x0075
            java.lang.UnsatisfiedLinkError r5 = new java.lang.UnsatisfiedLinkError
            java.lang.String r6 = "Failed recovering native library."
            r5.<init>(r6)
            java.lang.Throwable r4 = r5.initCause(r4)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x0075:
            throw r8
        L_0x0076:
            r5 = move-exception
            if (r8 != 0) goto L_0x009a
            java.lang.UnsatisfiedLinkError r6 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed recovering native library: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            java.lang.Throwable r4 = r5.getCause()
            java.lang.Throwable r4 = r6.initCause(r4)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x009a:
            throw r8
        L_0x009b:
            return r0
        L_0x009c:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r6.<init>()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r7 = "Can't find recover library: "
            r6.append(r7)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r6.append(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            throw r5     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
        L_0x00b3:
            r4 = move-exception
            r1 = r2
            goto L_0x00ca
        L_0x00b6:
            r4 = move-exception
            r1 = r2
            goto L_0x00bc
        L_0x00b9:
            r4 = move-exception
            goto L_0x00ca
        L_0x00bb:
            r4 = move-exception
        L_0x00bc:
            java.lang.UnsatisfiedLinkError r5 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "Failed recovering native library."
            r5.<init>(r6)     // Catch:{ all -> 0x00b9 }
            java.lang.Throwable r4 = r5.initCause(r4)     // Catch:{ all -> 0x00b9 }
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4     // Catch:{ all -> 0x00b9 }
            throw r4     // Catch:{ all -> 0x00b9 }
        L_0x00ca:
            if (r1 == 0) goto L_0x00d1
            r1.close()     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00d1
        L_0x00d0:
            return r0
        L_0x00d1:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPLoadLibFromApk.loadFromApk(java.lang.String, java.lang.ClassLoader, android.content.Context, java.io.File, java.lang.UnsatisfiedLinkError):boolean");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private static java.lang.UnsatisfiedLinkError loadFromRecovery(java.lang.String r4, java.lang.ClassLoader r5, android.content.Context r6, java.io.File r7) {
        /*
            boolean r6 = r7.isFile()
            r0 = 2
            r1 = 0
            if (r6 == 0) goto L_0x00a4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            r6.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.lang.String r2 = "load by recover_lib,name= "
            r6.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            r6.append(r4)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.lang.String r2 = "recoverfile="
            r6.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            r6.append(r7)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.lang.String r6 = r6.toString()     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r0, r6)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.lang.String r6 = r7.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            reflectSystemLoad(r6, r5)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r6 = mLoadedLibs     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            monitor-enter(r6)     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0039 }
            r2.<init>(r5)     // Catch:{ all -> 0x0039 }
            r6.put(r4, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r6)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0039:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0039 }
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x008b, InvocationTargetException -> 0x005a, all -> 0x003c }
        L_0x003c:
            r5 = move-exception
            java.lang.UnsatisfiedLinkError r6 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed recovering native library: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            java.lang.Throwable r4 = r6.initCause(r5)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x005a:
            r6 = move-exception
            java.lang.Throwable r2 = r6.getCause()
            boolean r2 = r2 instanceof java.lang.UnsatisfiedLinkError
            if (r2 == 0) goto L_0x006a
            java.lang.Throwable r6 = r6.getCause()
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            goto L_0x008c
        L_0x006a:
            java.lang.UnsatisfiedLinkError r5 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed recovering native library: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
            java.lang.Throwable r4 = r6.getCause()
            java.lang.Throwable r4 = r5.initCause(r4)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x008b:
            r6 = move-exception
        L_0x008c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load by recover_lib failed!,name= "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r0, r2)
            r7.delete()
            goto L_0x00a5
        L_0x00a4:
            r6 = r1
        L_0x00a5:
            reflectSystemLoadLibrary(r4, r5)     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            r7.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            java.lang.String r2 = "load by reflectSystemLoadLibrary,name= "
            r7.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            r7.append(r4)     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            java.lang.String r7 = r7.toString()     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r0, r7)     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r7 = mLoadedLibs     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            monitor-enter(r7)     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00c9 }
            r0.<init>(r5)     // Catch:{ all -> 0x00c9 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
            return r1
        L_0x00c9:
            r5 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
            throw r5     // Catch:{ UnsatisfiedLinkError -> 0x011e, InvocationTargetException -> 0x00ea, all -> 0x00cc }
        L_0x00cc:
            r5 = move-exception
            java.lang.UnsatisfiedLinkError r6 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed recovering native library: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            java.lang.Throwable r4 = r6.initCause(r5)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x00ea:
            r5 = move-exception
            java.lang.Throwable r7 = r5.getCause()
            boolean r7 = r7 instanceof java.lang.UnsatisfiedLinkError
            if (r7 == 0) goto L_0x00fd
            if (r6 != 0) goto L_0x0122
            java.lang.Throwable r4 = r5.getCause()
            r6 = r4
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            goto L_0x0122
        L_0x00fd:
            java.lang.UnsatisfiedLinkError r6 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed recovering native library: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            java.lang.Throwable r4 = r5.getCause()
            java.lang.Throwable r4 = r6.initCause(r4)
            java.lang.UnsatisfiedLinkError r4 = (java.lang.UnsatisfiedLinkError) r4
            throw r4
        L_0x011e:
            r4 = move-exception
            if (r6 != 0) goto L_0x0122
            r6 = r4
        L_0x0122:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPLoadLibFromApk.loadFromRecovery(java.lang.String, java.lang.ClassLoader, android.content.Context, java.io.File):java.lang.UnsatisfiedLinkError");
    }

    private static void reflectSystemLoad(String str, ClassLoader classLoader) {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("load", new Class[]{String.class, ClassLoader.class});
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, new Object[]{str, classLoader});
    }

    private static void reflectSystemLoadLibrary(String str, ClassLoader classLoader) {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("loadLibrary", new Class[]{String.class, ClassLoader.class});
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, new Object[]{str, classLoader});
    }

    public static void setupBrokenLibraryHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new LibraryBrokenHandler(Thread.getDefaultUncaughtExceptionHandler()));
    }
}
