package com.tencent.qqvideo.proxy.httpproxy;

import android.content.Context;
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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class TVHttpProxyLoadLibrary {
    public static final String ASSETS_LIBRARY_SRC_DIR = "libs/";
    /* access modifiers changed from: private */
    public static Context mContext = null;
    private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs = new HashMap<>();

    public static class LibraryBrokenHandler implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler mParent;

        public LibraryBrokenHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.mParent = uncaughtExceptionHandler;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof java.lang.UnsatisfiedLinkError
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0018
                boolean r0 = r6 instanceof java.lang.NoSuchMethodError
                if (r0 == 0) goto L_0x0016
                java.lang.String r0 = r6.getMessage()
                java.lang.String r3 = ".*sig(nature)?[=:].*"
                boolean r0 = r0.matches(r3)
                if (r0 != 0) goto L_0x0018
            L_0x0016:
                r0 = 0
                goto L_0x0019
            L_0x0018:
                r0 = 1
            L_0x0019:
                if (r0 == 0) goto L_0x0024
                android.content.Context r0 = com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.mContext     // Catch:{ Exception -> 0x0023 }
                com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.extractAllLibraries(r0)     // Catch:{ Exception -> 0x0023 }
                goto L_0x0025
            L_0x0023:
            L_0x0024:
                r1 = 0
            L_0x0025:
                if (r1 == 0) goto L_0x0032
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Invalid JNI libraries detected and recovered."
                r0.<init>(r1)
                java.lang.Throwable r6 = r0.initCause(r6)
            L_0x0032:
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.mParent
                r0.uncaughtException(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.LibraryBrokenHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }

    private TVHttpProxyLoadLibrary() {
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
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
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

    /* JADX INFO: finally extract failed */
    private static boolean extractLibrary(ZipFile zipFile, String str, List<String> list, File file) {
        if (file.isFile()) {
            return true;
        }
        for (String str2 : list) {
            ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/lib" + str + ".so");
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[2048];
                while (true) {
                    try {
                        int read = inputStream.read(bArr, 0, 2048);
                        if (read == -1) {
                            inputStream.close();
                            fileOutputStream.close();
                            file.setReadOnly();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        inputStream.close();
                        fileOutputStream.close();
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public static String find(String str, Context context) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            ClassLoader classLoader = TVHttpProxyLoadLibrary.class.getClassLoader();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0193 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x020b A[SYNTHETIC, Splitter:B:126:0x020b] */
    public static void load(java.lang.String r6, java.lang.ClassLoader r7, android.content.Context r8) {
        /*
            if (r6 == 0) goto L_0x0212
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0212
            if (r7 != 0) goto L_0x000c
            goto L_0x0212
        L_0x000c:
            mContext = r8
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r0 = mLoadedLibs
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x020f }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x020f }
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x020f }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x020f }
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            if (r1 == 0) goto L_0x0041
            if (r1 != r7) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x020f }
            return
        L_0x0028:
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x020f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
            java.lang.String r1 = "Library '"
            r8.<init>(r1)     // Catch:{ all -> 0x020f }
            r8.append(r6)     // Catch:{ all -> 0x020f }
            java.lang.String r6 = "' was loaded by a different ClassLoader."
            r8.append(r6)     // Catch:{ all -> 0x020f }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x020f }
            r7.<init>(r6)     // Catch:{ all -> 0x020f }
            throw r7     // Catch:{ all -> 0x020f }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x020f }
            if (r8 != 0) goto L_0x008f
            reflectSystemLoadlibrary(r6, r7)     // Catch:{ InvocationTargetException -> 0x0070, Exception -> 0x0055 }
            monitor-enter(r0)     // Catch:{ InvocationTargetException -> 0x0070, Exception -> 0x0055 }
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0052 }
            r8.<init>(r7)     // Catch:{ all -> 0x0052 }
            r0.put(r6, r8)     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r7     // Catch:{ InvocationTargetException -> 0x0070, Exception -> 0x0055 }
        L_0x0055:
            r7 = move-exception
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed loading library: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8.<init>(r6)
            java.lang.Throwable r6 = r8.initCause(r7)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x0070:
            r7 = move-exception
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed loading library: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8.<init>(r6)
            java.lang.Throwable r6 = r7.getCause()
            java.lang.Throwable r6 = r8.initCause(r6)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x008f:
            java.lang.String r1 = "recover_lib"
            r3 = 0
            java.io.File r1 = r8.getDir(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "lib"
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ".so"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r1, r4)
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0113, InvocationTargetException -> 0x00e5, all -> 0x00ca }
            reflectSystemLoad(r1, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0113, InvocationTargetException -> 0x00e5, all -> 0x00ca }
            monitor-enter(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0113, InvocationTargetException -> 0x00e5, all -> 0x00ca }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00c7 }
            r1.<init>(r7)     // Catch:{ all -> 0x00c7 }
            r0.put(r6, r1)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x0113, InvocationTargetException -> 0x00e5, all -> 0x00ca }
        L_0x00ca:
            r7 = move-exception
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed recovering native library: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8.<init>(r6)
            java.lang.Throwable r6 = r8.initCause(r7)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x00e5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.UnsatisfiedLinkError
            if (r1 == 0) goto L_0x00f5
            java.lang.Throwable r0 = r0.getCause()
            java.lang.UnsatisfiedLinkError r0 = (java.lang.UnsatisfiedLinkError) r0
            goto L_0x0114
        L_0x00f5:
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed recovering native library: "
            r8.<init>(r1)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            java.lang.Throwable r6 = r0.getCause()
            java.lang.Throwable r6 = r7.initCause(r6)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x0113:
            r0 = move-exception
        L_0x0114:
            r3.delete()
            goto L_0x0119
        L_0x0118:
            r0 = r2
        L_0x0119:
            reflectSystemLoadlibrary(r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0177, InvocationTargetException -> 0x0147, all -> 0x012c }
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r1 = mLoadedLibs     // Catch:{ UnsatisfiedLinkError -> 0x0177, InvocationTargetException -> 0x0147, all -> 0x012c }
            monitor-enter(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0177, InvocationTargetException -> 0x0147, all -> 0x012c }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0129 }
            r4.<init>(r7)     // Catch:{ all -> 0x0129 }
            r1.put(r6, r4)     // Catch:{ all -> 0x0129 }
            monitor-exit(r1)     // Catch:{ all -> 0x0129 }
            return
        L_0x0129:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0129 }
            throw r4     // Catch:{ UnsatisfiedLinkError -> 0x0177, InvocationTargetException -> 0x0147, all -> 0x012c }
        L_0x012c:
            r7 = move-exception
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed recovering native library: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8.<init>(r6)
            java.lang.Throwable r6 = r8.initCause(r7)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x0147:
            r1 = move-exception
            java.lang.Throwable r4 = r1.getCause()
            boolean r4 = r4 instanceof java.lang.UnsatisfiedLinkError
            if (r4 == 0) goto L_0x0159
            if (r0 != 0) goto L_0x017b
            java.lang.Throwable r0 = r1.getCause()
            java.lang.UnsatisfiedLinkError r0 = (java.lang.UnsatisfiedLinkError) r0
            goto L_0x017b
        L_0x0159:
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed recovering native library: "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            java.lang.Throwable r6 = r1.getCause()
            java.lang.Throwable r6 = r7.initCause(r6)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x0177:
            r1 = move-exception
            if (r0 != 0) goto L_0x017b
            r0 = r1
        L_0x017b:
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch:{ Exception -> 0x01fa }
            java.lang.String r8 = r8.sourceDir     // Catch:{ Exception -> 0x01fa }
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x01fa }
            r1.<init>(r8)     // Catch:{ Exception -> 0x01fa }
            java.util.List r8 = generateAbiList()     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            boolean r8 = extractLibrary(r1, r6, r8, r3)     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            if (r8 == 0) goto L_0x01de
            r1.close()     // Catch:{ IOException -> 0x0193 }
        L_0x0193:
            java.lang.String r8 = r3.getAbsolutePath()     // Catch:{ InvocationTargetException -> 0x01bc, Exception -> 0x01aa }
            reflectSystemLoad(r8, r7)     // Catch:{ InvocationTargetException -> 0x01bc, Exception -> 0x01aa }
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> r8 = mLoadedLibs     // Catch:{ InvocationTargetException -> 0x01bc, Exception -> 0x01aa }
            monitor-enter(r8)     // Catch:{ InvocationTargetException -> 0x01bc, Exception -> 0x01aa }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01a7 }
            r1.<init>(r7)     // Catch:{ all -> 0x01a7 }
            r8.put(r6, r1)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r8)     // Catch:{ all -> 0x01a7 }
            return
        L_0x01a7:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01a7 }
            throw r7     // Catch:{ InvocationTargetException -> 0x01bc, Exception -> 0x01aa }
        L_0x01aa:
            r6 = move-exception
            if (r0 != 0) goto L_0x01bb
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError
            java.lang.String r8 = "Failed recovering native library."
            r7.<init>(r8)
            java.lang.Throwable r6 = r7.initCause(r6)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x01bb:
            throw r0
        L_0x01bc:
            r7 = move-exception
            if (r0 != 0) goto L_0x01dd
            java.lang.UnsatisfiedLinkError r8 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed recovering native library: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8.<init>(r6)
            java.lang.Throwable r6 = r7.getCause()
            java.lang.Throwable r6 = r8.initCause(r6)
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6
            throw r6
        L_0x01dd:
            throw r0
        L_0x01de:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            java.lang.String r0 = "Can't find recover library: "
            r8.<init>(r0)     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            r8.append(r6)     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
            throw r7     // Catch:{ Exception -> 0x01f5, all -> 0x01f2 }
        L_0x01f2:
            r6 = move-exception
            r2 = r1
            goto L_0x0209
        L_0x01f5:
            r6 = move-exception
            r2 = r1
            goto L_0x01fb
        L_0x01f8:
            r6 = move-exception
            goto L_0x0209
        L_0x01fa:
            r6 = move-exception
        L_0x01fb:
            java.lang.UnsatisfiedLinkError r7 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01f8 }
            java.lang.String r8 = "Failed recovering native library."
            r7.<init>(r8)     // Catch:{ all -> 0x01f8 }
            java.lang.Throwable r6 = r7.initCause(r6)     // Catch:{ all -> 0x01f8 }
            java.lang.UnsatisfiedLinkError r6 = (java.lang.UnsatisfiedLinkError) r6     // Catch:{ all -> 0x01f8 }
            throw r6     // Catch:{ all -> 0x01f8 }
        L_0x0209:
            if (r2 == 0) goto L_0x020e
            r2.close()     // Catch:{ IOException -> 0x020e }
        L_0x020e:
            throw r6
        L_0x020f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x020f }
            throw r6
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.load(java.lang.String, java.lang.ClassLoader, android.content.Context):void");
    }

    private static void reflectSystemLoad(String str, ClassLoader classLoader) {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("load", new Class[]{String.class, ClassLoader.class});
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, new Object[]{str, classLoader});
    }

    private static void reflectSystemLoadlibrary(String str, ClassLoader classLoader) {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("loadLibrary", new Class[]{String.class, ClassLoader.class});
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, new Object[]{str, classLoader});
    }

    public static void setupBrokenLibraryHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new LibraryBrokenHandler(Thread.getDefaultUncaughtExceptionHandler()));
    }
}
