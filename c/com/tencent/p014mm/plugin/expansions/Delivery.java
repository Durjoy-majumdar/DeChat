package com.tencent.p014mm.plugin.expansions;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.soloader.C80169p;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.sdk.platformtools.ApplicationGlobal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import i20.C21043a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import p564iq.C87789a;
import p564iq.C87790d;
import p722v8.C90750b;
import u24.C90599h;
import ui3.C90664c;

/* renamed from: com.tencent.mm.plugin.expansions.Delivery */
final class Delivery {
    private static final int ERR_CODE_TIMEOUT = 10001;
    private static final int ERR_CODE_USER_CONFIRM = 10002;
    private static final String MODULE_NAME = "delivery";
    private static final int REQ_CODE_USER_CONFIRM = 10002;
    private static final String TAG = "MicroMsg.exp.Delivery";
    public static boolean postDumping;
    public static boolean preDumping;
    private static final List<File> sAllNativeLibDirs = new LinkedList();
    /* access modifiers changed from: private */
    public static WeakReference<Context> sAttachedContext;
    /* access modifiers changed from: private */
    public static C90664c sBehavior;
    /* access modifiers changed from: private */
    public static C90750b sDeliveryManager;
    private static final List<String> sLoadedLibs = new LinkedList();
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$a */
    public class C85166a implements C85169d {

        /* renamed from: a */
        public final /* synthetic */ C85170e f248159a;

        public C85166a(C85170e eVar) {
            this.f248159a = eVar;
        }

        public void onSuccess(String str) {
            this.f248159a.mo118197b(C85178q.C85181c.m105048c());
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$b */
    public class C85167b implements C85169d {

        /* renamed from: a */
        public final /* synthetic */ C85170e f248160a;

        /* renamed from: b */
        public final /* synthetic */ C87790d.C33382a f248161b;

        public C85167b(C85170e eVar, C87790d.C33382a aVar) {
            this.f248160a = eVar;
            this.f248161b = aVar;
        }

        public void onSuccess(String str) {
            this.f248160a.mo118197b(C85178q.C85181c.m105048c());
            C87790d.C33382a aVar = this.f248161b;
            if (aVar != null) {
                aVar.mo55610a(Delivery.sBehavior);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$c */
    public class C85168c implements C85169d {

        /* renamed from: a */
        public final /* synthetic */ C85170e f248162a;

        /* renamed from: b */
        public final /* synthetic */ C87789a f248163b;

        public C85168c(C85170e eVar, C87789a aVar) {
            this.f248162a = eVar;
            this.f248163b = aVar;
        }

        public void onSuccess(String str) {
            this.f248162a.mo118197b(C85178q.C85181c.m105048c());
            C87789a aVar = this.f248163b;
            if (aVar != null) {
                aVar.mo118204a(Delivery.sBehavior.getAssets());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$d */
    public interface C85169d {
        void onSuccess(String str);
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$f */
    public static final class C85171f {
        /* renamed from: a */
        public static List m105030a(ClassLoader classLoader) {
            ArrayList arrayList = new ArrayList();
            Object obj = ShareReflectUtil.findField((Object) classLoader, "pathList").get(classLoader);
            if (obj != null) {
                File[] fileArr = (File[]) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
                Log.m105924i(Delivery.TAG, "dumpV14: nativeLibraryDirectories");
                if (fileArr != null) {
                    arrayList.addAll(Arrays.asList(fileArr));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$g */
    public static final class C85172g {
        /* renamed from: a */
        public static List m105031a(ClassLoader classLoader) {
            ArrayList arrayList = new ArrayList();
            Object obj = ShareReflectUtil.findField((Object) classLoader, "pathList").get(classLoader);
            if (obj != null) {
                List list = (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
                Log.m105924i(Delivery.TAG, "dumpV23: nativeLibraryDirectories");
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            return arrayList;
        }
    }

    private static void checkInit() {
        if (sDeliveryManager == null) {
            throw new IllegalStateException("#init is not yet done!");
        }
    }

    private static void doRequest(C85169d dVar) {
        checkInit();
        Log.m105924i(TAG, "#doRequest, isInstalled = " + isInstalled());
        if (!isInstalled()) {
            new AtomicBoolean();
            new AtomicInteger(0);
            throw new RuntimeException("stub!");
        } else if (dVar != null) {
            dVar.onSuccess(MODULE_NAME);
        }
    }

    public static void dumpApkLibEntry(File file) {
        ZipFile zipFile;
        Log.m105924i(TAG, " split-apk " + file.getAbsolutePath());
        if (!file.isFile()) {
            Log.m105924i(TAG, " not file, skip");
            return;
        }
        try {
            zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                String name = ((ZipEntry) entries.nextElement()).getName();
                if (name.endsWith(".so")) {
                    Log.m105924i(TAG, " > " + name);
                }
            }
            zipFile.close();
            return;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "dumpApkLibEntry fail", new Object[0]);
            return;
        }
        throw th;
    }

    public static void dumpAppClassLoader() {
        Log.m105924i(TAG, "dumping classloader");
        for (File dumpFiles : getNativeLibraryDirectoriesCompat(Delivery.class.getClassLoader())) {
            dumpFiles(dumpFiles);
        }
    }

    public static void dumpFiles(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File dumpFiles : listFiles) {
                    dumpFiles(dumpFiles);
                }
            }
        } else if (file.getAbsolutePath().contains(".apk!/lib")) {
            dumpApkLibEntry(new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk"));
        } else {
            Log.m105924i(TAG, " > " + file.getAbsolutePath());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r2, "dumping SoLoader fail", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void dumping() {
        /*
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            java.lang.String r1 = "dumping SoLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            if (r1 != 0) goto L_0x001a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isMonkeyEnv()
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = "skip, no debug env"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x001a:
            r1 = 0
            boolean r2 = com.facebook.soloader.C80169p.f234682a     // Catch:{ all -> 0x005d }
            java.lang.Class<com.facebook.soloader.p> r2 = com.facebook.soloader.C80169p.class
            monitor-enter(r2)     // Catch:{ all -> 0x005d }
            com.facebook.soloader.q[] r3 = com.facebook.soloader.C80169p.f234685d     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            int r2 = r3.length     // Catch:{ all -> 0x005d }
            r4 = 0
        L_0x0025:
            if (r4 >= r2) goto L_0x0069
            r5 = r3[r4]     // Catch:{ all -> 0x005d }
            boolean r6 = r5 instanceof com.facebook.soloader.C80159j     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0046
            com.facebook.soloader.j r5 = (com.facebook.soloader.C80159j) r5     // Catch:{ all -> 0x005d }
            java.io.File r5 = r5.f234670f     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r6.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r7 = " - ApkSoSource: "
            r6.append(r7)     // Catch:{ all -> 0x005d }
            r6.append(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x005d }
            goto L_0x005a
        L_0x0046:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r6.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r7 = " - "
            r6.append(r7)     // Catch:{ all -> 0x005d }
            r6.append(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x005d }
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x005d:
            r2 = move-exception
            goto L_0x0062
        L_0x005f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            throw r3     // Catch:{ all -> 0x005d }
        L_0x0062:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "dumping SoLoader fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
        L_0x0069:
            dumpAppClassLoader()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.Delivery.dumping():void");
    }

    public static String findLibraryPathByName(String str) {
        List<File> list = sAllNativeLibDirs;
        if (list.isEmpty()) {
            synchronized (list) {
                if (list.isEmpty()) {
                    list.addAll(getNativeLibraryDirectoriesCompat(Delivery.class.getClassLoader()));
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        for (File recursiveFindLibraryPathByName : list) {
            String recursiveFindLibraryPathByName2 = recursiveFindLibraryPathByName(str, recursiveFindLibraryPathByName);
            if (!TextUtils.isEmpty(recursiveFindLibraryPathByName2)) {
                return recursiveFindLibraryPathByName2;
            }
        }
        return null;
    }

    public static String getAAbInfo() {
        return !isEnabled() ? "aab-disabled" : C90599h.m113512e(sDeliveryManager.mo124880b(), "|");
    }

    public static Future<?> getAssets(C87789a aVar) {
        Log.m105924i(TAG, "#getAssets, isInstalled = " + isInstalled());
        C85170e eVar = new C85170e();
        doRequest(new C85168c(eVar, aVar));
        return eVar;
    }

    public static String getLastObbErrorInfo() {
        return !isEnabled() ? "aab-disabled" : MultiProcessMMKV.getDefault().getString("delivery_request_status", "initial");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.io.File> getNativeLibraryDirectoriesCompat(java.lang.ClassLoader r7) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r2.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "classloader = "
            r2.append(r3)     // Catch:{ all -> 0x0094 }
            r2.append(r7)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0094 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            r3 = 1
            r4 = 2
            r5 = 25
            if (r2 != r5) goto L_0x0023
            int r6 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ all -> 0x0094 }
            if (r6 != 0) goto L_0x0025
        L_0x0023:
            if (r2 <= r5) goto L_0x006a
        L_0x0025:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004e }
            r2.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "pathList"
            java.lang.reflect.Field r5 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Object) r7, (java.lang.String) r5)     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x009d
            java.lang.String r6 = "nativeLibraryDirectories"
            java.lang.reflect.Field r6 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Object) r5, (java.lang.String) r6)     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x004e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "dumpV25: nativeLibraryDirectories"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x009d
            r2.addAll(r5)     // Catch:{ all -> 0x004e }
            goto L_0x009d
        L_0x004e:
            r2 = move-exception
            java.lang.String r5 = "v25 fail, sdk: %d, error: %s, try to fallback to V23"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0094 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0094 }
            r4[r1] = r6     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0094 }
            r4[r3] = r2     // Catch:{ all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r4)     // Catch:{ all -> 0x0094 }
            java.util.List r2 = com.tencent.p014mm.plugin.expansions.Delivery.C85172g.m105031a(r7)     // Catch:{ all -> 0x0094 }
            goto L_0x009d
        L_0x006a:
            r5 = 23
            if (r2 < r5) goto L_0x008f
            java.util.List r2 = com.tencent.p014mm.plugin.expansions.Delivery.C85172g.m105031a(r7)     // Catch:{ all -> 0x0073 }
            goto L_0x009d
        L_0x0073:
            r2 = move-exception
            java.lang.String r5 = "v23 fail, sdk: %d, error: %s, try to fallback to V14"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0094 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0094 }
            r4[r1] = r6     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0094 }
            r4[r3] = r2     // Catch:{ all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r4)     // Catch:{ all -> 0x0094 }
            java.util.List r2 = com.tencent.p014mm.plugin.expansions.Delivery.C85171f.m105030a(r7)     // Catch:{ all -> 0x0094 }
            goto L_0x009d
        L_0x008f:
            java.util.List r2 = com.tencent.p014mm.plugin.expansions.Delivery.C85171f.m105030a(r7)     // Catch:{ all -> 0x0094 }
            goto L_0x009d
        L_0x0094:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "dumping fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r2, r1)
            r2 = 0
        L_0x009d:
            if (r2 != 0) goto L_0x00a3
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.Delivery.getNativeLibraryDirectoriesCompat(java.lang.ClassLoader):java.util.List");
    }

    public static Future<?> getSoLibDir(C87790d.C33382a aVar) {
        throw new RuntimeException("Stub!");
    }

    public static void init(Context context) {
        if (isEnabled()) {
            Log.m105924i(TAG, "init SplitCompat for Expansions Delivery");
            Log.m105924i(TAG, "init SoLoader");
            try {
                C80169p.m97480d(context, 0);
                injectClassLoaderContext(context);
                Map<String, List<Pair<String, String>>> map = C85182s.f248176a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Pair.create("loadLibrary", "(Ljava/lang/String;)V"));
                Map<String, List<Pair<String, String>>> map2 = C85182s.f248176a;
                ((HashMap) map2).put("java/lang/System", arrayList);
                C21043a.m23197h().mo32756j(map2, C85182s.f248177b);
                throw new RuntimeException("stub!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0173, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(TAG, r11, "injectClassLoaderContext fail", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void injectClassLoaderContext(android.content.Context r11) {
        /*
            java.lang.Class<com.facebook.soloader.p> r0 = com.facebook.soloader.C80169p.class
            java.lang.String r1 = "MicroMsg.exp.Delivery"
            java.lang.String r2 = "#injectClassLoaderContext"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<com.tencent.mm.plugin.expansions.Delivery> r1 = com.tencent.p014mm.plugin.expansions.Delivery.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.List r1 = getNativeLibraryDirectoriesCompat(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x017c
            r2 = 0
            java.lang.String r3 = "MicroMsg.exp.Delivery"
            java.lang.String r4 = "collect SoLoader list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x0172 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0172 }
            r3.<init>()     // Catch:{ all -> 0x0172 }
            boolean r4 = com.facebook.soloader.C80169p.f234682a     // Catch:{ all -> 0x0172 }
            monitor-enter(r0)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.q[] r4 = com.facebook.soloader.C80169p.f234685d     // Catch:{ all -> 0x016f }
            monitor-exit(r0)     // Catch:{ all -> 0x0172 }
            int r5 = r4.length     // Catch:{ all -> 0x0172 }
            r6 = 0
        L_0x002e:
            if (r6 >= r5) goto L_0x0060
            r7 = r4[r6]     // Catch:{ all -> 0x0172 }
            boolean r8 = r7 instanceof com.facebook.soloader.C80159j     // Catch:{ all -> 0x0172 }
            if (r8 == 0) goto L_0x003e
            com.facebook.soloader.j r7 = (com.facebook.soloader.C80159j) r7     // Catch:{ all -> 0x0172 }
            java.io.File r7 = r7.f234670f     // Catch:{ all -> 0x0172 }
            r3.add(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x005d
        L_0x003e:
            boolean r8 = r7 instanceof com.facebook.soloader.C80150e     // Catch:{ all -> 0x0172 }
            if (r8 != 0) goto L_0x0046
            boolean r8 = r7 instanceof com.facebook.soloader.C80148c     // Catch:{ all -> 0x0172 }
            if (r8 == 0) goto L_0x005d
        L_0x0046:
            r8 = 0
            boolean r9 = r7 instanceof com.facebook.soloader.C80150e     // Catch:{ all -> 0x0172 }
            if (r9 == 0) goto L_0x004e
            r8 = r7
            com.facebook.soloader.e r8 = (com.facebook.soloader.C80150e) r8     // Catch:{ all -> 0x0172 }
        L_0x004e:
            boolean r9 = r7 instanceof com.facebook.soloader.C80148c     // Catch:{ all -> 0x0172 }
            if (r9 == 0) goto L_0x0056
            com.facebook.soloader.c r7 = (com.facebook.soloader.C80148c) r7     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.e r8 = r7.f234651c     // Catch:{ all -> 0x0172 }
        L_0x0056:
            if (r8 == 0) goto L_0x005d
            java.io.File r7 = r8.f234655a     // Catch:{ all -> 0x0172 }
            r3.add(r7)     // Catch:{ all -> 0x0172 }
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x002e
        L_0x0060:
            java.lang.String r5 = "MicroMsg.exp.Delivery"
            java.lang.String r6 = "inject SoLoader list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0172 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0172 }
            r5.<init>()     // Catch:{ all -> 0x0172 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0172 }
        L_0x0070:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0172 }
            if (r6 == 0) goto L_0x0149
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0172 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x0172 }
            boolean r7 = r3.contains(r6)     // Catch:{ all -> 0x0172 }
            if (r7 == 0) goto L_0x0083
            goto L_0x0070
        L_0x0083:
            java.lang.String r7 = ".apk!/lib"
            java.lang.String r8 = r6.getAbsolutePath()     // Catch:{ all -> 0x0172 }
            boolean r8 = r8.contains(r7)     // Catch:{ all -> 0x0172 }
            if (r8 == 0) goto L_0x010b
            java.lang.String r8 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r9.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r10 = "inject ApkSoSource: "
            r9.append(r10)     // Catch:{ all -> 0x0172 }
            r9.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0172 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = r6.getAbsolutePath()     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0172 }
            int r6 = r6.indexOf(r7)     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r9.substring(r2, r6)     // Catch:{ all -> 0x0172 }
            r8.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = ".apk"
            r8.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0172 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0172 }
            r7.<init>(r6)     // Catch:{ all -> 0x0172 }
            boolean r8 = r3.contains(r7)     // Catch:{ all -> 0x0172 }
            if (r8 == 0) goto L_0x00d2
            goto L_0x0070
        L_0x00d2:
            java.lang.String r8 = "/"
            int r8 = r6.lastIndexOf(r8)     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = ".apk"
            int r9 = r6.lastIndexOf(r9)     // Catch:{ all -> 0x0172 }
            if (r8 < 0) goto L_0x00f3
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x00f3
            java.lang.String r6 = r6.substring(r8, r9)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.b r8 = new com.facebook.soloader.b     // Catch:{ all -> 0x0172 }
            r9 = 1
            r8.<init>(r11, r7, r6, r9)     // Catch:{ all -> 0x0172 }
            r5.add(r8)     // Catch:{ all -> 0x0172 }
            goto L_0x0070
        L_0x00f3:
            java.lang.String r7 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = "invalid apkPath: "
            r8.append(r9)     // Catch:{ all -> 0x0172 }
            r8.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r6)     // Catch:{ all -> 0x0172 }
            goto L_0x0070
        L_0x010b:
            boolean r7 = r6.isDirectory()     // Catch:{ all -> 0x0172 }
            if (r7 == 0) goto L_0x0131
            java.lang.String r7 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = "inject DirectorySoSource: "
            r8.append(r9)     // Catch:{ all -> 0x0172 }
            r8.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.e r7 = new com.facebook.soloader.e     // Catch:{ all -> 0x0172 }
            r7.<init>(r6, r2)     // Catch:{ all -> 0x0172 }
            r5.add(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0070
        L_0x0131:
            java.lang.String r7 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = "inject fail, unknown so lib type: "
            r8.append(r9)     // Catch:{ all -> 0x0172 }
            r8.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r6)     // Catch:{ all -> 0x0172 }
            goto L_0x0070
        L_0x0149:
            boolean r11 = r5.isEmpty()     // Catch:{ all -> 0x0172 }
            if (r11 != 0) goto L_0x0166
            java.util.List r11 = java.util.Arrays.asList(r4)     // Catch:{ all -> 0x0172 }
            r5.addAll(r11)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.q[] r11 = new com.facebook.soloader.C80172q[r2]     // Catch:{ all -> 0x0172 }
            java.lang.Object[] r11 = r5.toArray(r11)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.q[] r11 = (com.facebook.soloader.C80172q[]) r11     // Catch:{ all -> 0x0172 }
            monitor-enter(r0)     // Catch:{ all -> 0x0172 }
            com.facebook.soloader.C80169p.f234685d = r11     // Catch:{ all -> 0x0163 }
            monitor-exit(r0)     // Catch:{ all -> 0x0172 }
            goto L_0x017c
        L_0x0163:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0172 }
            throw r11     // Catch:{ all -> 0x0172 }
        L_0x0166:
            java.lang.String r11 = "MicroMsg.exp.Delivery"
            java.lang.String r0 = "soSourceList is empty, skip inject"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x0172 }
            goto L_0x017c
        L_0x016f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0172 }
            throw r11     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r11 = move-exception
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            java.lang.String r1 = "injectClassLoaderContext fail"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r1, r2)
        L_0x017c:
            dumping()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.Delivery.injectClassLoaderContext(android.content.Context):void");
    }

    public static Future<?> install(C87790d.C33382a aVar) {
        Log.m105924i(TAG, "#install delivery, isInstalled = " + isInstalled());
        C85170e eVar = new C85170e();
        doRequest(new C85167b(eVar, aVar));
        return eVar;
    }

    public static boolean isEnabled() {
        return false;
    }

    public static boolean isInstalled() {
        if (!isEnabled()) {
            return true;
        }
        boolean contains = sDeliveryManager.mo124880b().contains(MODULE_NAME);
        Log.m105924i(TAG, "#isInstalled = " + contains);
        if (contains) {
            if (!postDumping) {
                Log.m105924i(TAG, "post dumping classloader all nativeLibs");
                dumping();
                postDumping = true;
            }
        } else if (!preDumping) {
            Log.m105924i(TAG, "pre dumping classloader all nativeLibs");
            dumping();
            preDumping = true;
        }
        return contains;
    }

    public static Future<?> loadLibrary(String str, C87790d.C33382a aVar) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(TAG, "loadLibraryFlatt with System#load, libName  = " + r11);
        java.lang.System.load(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r0.contains(r11) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r0.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(TAG, "loadLibraryFlatt with System#loadLibrary, libName  = " + r11);
        r1 = new k20.C9556a();
        r1.mo10233c(r11);
        r10 = new java.lang.Object();
        j20.C117292a.m165358d(r10, r1.mo10232b(), "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) r1.mo10231a(0));
        j20.C117292a.m165359e(r10, "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        if (r0.contains(r11) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r0.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = findLibraryPathByName(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadLibraryFlattWithinDelivery(java.lang.String r11) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loadLibrary flatt, libName  = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.List<java.lang.String> r0 = sLoadedLibs
            monitor-enter(r0)
            boolean r1 = r0.contains(r11)     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = findLibraryPathByName(r11)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0054
            java.lang.String r2 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loadLibraryFlatt with System#load, libName  = "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.System.load(r1)
            monitor-enter(r0)
            boolean r1 = r0.contains(r11)     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            r0.add(r11)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r11
        L_0x0054:
            java.lang.String r1 = "MicroMsg.exp.Delivery"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadLibraryFlatt with System#loadLibrary, libName  = "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r11)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            java.lang.Object[] r3 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/expansions/Delivery"
            java.lang.String r5 = "loadLibraryFlattWithinDelivery"
            java.lang.String r6 = "(Ljava/lang/String;)V"
            java.lang.String r7 = "java/lang/System_EXEC_"
            java.lang.String r8 = "loadLibrary"
            java.lang.String r9 = "(Ljava/lang/String;)V"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.System.loadLibrary(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/expansions/Delivery"
            java.lang.String r4 = "loadLibraryFlattWithinDelivery"
            java.lang.String r5 = "(Ljava/lang/String;)V"
            java.lang.String r6 = "java/lang/System_EXEC_"
            java.lang.String r7 = "loadLibrary"
            java.lang.String r8 = "(Ljava/lang/String;)V"
            r2 = r10
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            monitor-enter(r0)
            boolean r1 = r0.contains(r11)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00af
            r0.add(r11)     // Catch:{ all -> 0x00b1 }
        L_0x00af:
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            return
        L_0x00b1:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            throw r11
        L_0x00b4:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.Delivery.loadLibraryFlattWithinDelivery(java.lang.String):void");
    }

    private static void loadLibraryImpl(String str) {
        Log.m105924i(TAG, "loadLibrary recursively, libName  = " + str);
        List<String> list = (List) ((HashMap) C85173a.f248166a).get(str);
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2.trim())) {
                    try {
                        loadLibraryFlattWithinDelivery(str2.trim());
                    } catch (Throwable th) {
                        Log.m105920e(TAG, "SplitInstallHelper.loadLibrary subLib fail, e = " + th.getMessage());
                    }
                }
            }
        }
        loadLibraryFlattWithinDelivery(str);
    }

    public static void onAttachBaseContext(Context context) {
        checkInit();
        sAttachedContext = new WeakReference<>(context);
    }

    private static String recursiveFindLibraryPathByName(String str, File file) {
        File[] listFiles;
        if (file.isFile()) {
            if (file.getAbsolutePath().endsWith("lib" + str + ".so")) {
                return file.getAbsolutePath();
            }
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        for (File recursiveFindLibraryPathByName : listFiles) {
            String recursiveFindLibraryPathByName2 = recursiveFindLibraryPathByName(str, recursiveFindLibraryPathByName);
            if (!TextUtils.isEmpty(recursiveFindLibraryPathByName2)) {
                return recursiveFindLibraryPathByName2;
            }
        }
        return null;
    }

    public static Future<?> request() {
        Log.m105924i(TAG, "#request delivery, isInstalled = " + isInstalled());
        C85170e eVar = new C85170e();
        doRequest(new C85166a(eVar));
        return eVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean requestSync(boolean r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestSync delivery, retryUntilSuccess = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", isInstalled = "
            r0.append(r1)
            boolean r1 = isInstalled()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.exp.Delivery"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = isInstalled()
            r2 = 1
            if (r0 == 0) goto L_0x002b
            return r2
        L_0x002b:
            checkInit()
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 2000(0x7d0, float:2.803E-42)
            r5 = 1069547520(0x3fc00000, float:1.5)
            r6 = 0
            r7 = 0
        L_0x0038:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            r8.<init>()     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            java.lang.String r9 = "requestSync, retryCount = "
            r8.append(r9)     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            r8.append(r7)     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            java.lang.String r8 = r8.toString()     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            java.util.concurrent.Future r8 = request()     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            r8.get()     // Catch:{ ExecutionException -> 0x0057, InterruptedException -> 0x0055 }
            goto L_0x0065
        L_0x0055:
            r8 = move-exception
            goto L_0x0058
        L_0x0057:
            r8 = move-exception
        L_0x0058:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r8 = r8.getMessage()
            r9[r6] = r8
            java.lang.String r8 = "#requestSync future wait fail, error = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r8, r9)
        L_0x0065:
            boolean r8 = isInstalled()
            if (r8 != 0) goto L_0x007c
            if (r10 == 0) goto L_0x007c
            int r7 = r7 + 1
            long r8 = (long) r0
            java.lang.Thread.sleep(r8)     // Catch:{ InterruptedException -> 0x0073, all -> 0x0078 }
        L_0x0073:
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = (int) r0
            goto L_0x007a
        L_0x0078:
            r10 = move-exception
            throw r10
        L_0x007a:
            r8 = 1
            goto L_0x007d
        L_0x007c:
            r8 = 0
        L_0x007d:
            if (r8 != 0) goto L_0x0038
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "requestDeliverySync"
            r10.append(r2)
            java.lang.String r2 = " time consumed = "
            r10.append(r2)
            long r0 = r0 - r3
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "MicroMsg.exp.Expansions"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            boolean r10 = isInstalled()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.Delivery.requestSync(boolean):boolean");
    }

    public static void saveDeliveryStatus(String str) {
        MultiProcessMMKV.getDefault().putString("delivery_request_status", str).commit();
    }

    public static AssetManager tryGetAssets() {
        if (isInstalled()) {
            return sBehavior.getAssets();
        }
        return null;
    }

    public static String tryGetSoLibDir() {
        if (!isInstalled()) {
            return null;
        }
        return sBehavior.mo118207a().getAbsolutePath() + File.separator;
    }

    public static boolean tryLoadLibrary(String str) {
        return tryLoadLibrary(str, true);
    }

    public static void tryRetrieveDelivery(int i) {
        try {
            String str = "content://com.google.android.finsky.FileProvider/dynamicsplits/" + i + "/delivery";
            Log.m105924i(TAG, "#tryRetrieveDelivery, uri = " + str);
            ZipInputStream zipInputStream = new ZipInputStream(ApplicationGlobal.context().getContentResolver().openInputStream(Uri.parse(str)));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    Log.m105924i(TAG, " > zipEntry: " + nextEntry.getName());
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "tryRetrieveDelivery fail", new Object[0]);
        }
    }

    public static void updateLang(String str) {
        checkInit();
        if (!TextUtils.isEmpty(str)) {
            throw new RuntimeException("stub!");
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.Delivery$e */
    public static final class C85170e<T> implements Future<T> {

        /* renamed from: d */
        public final CountDownLatch f248164d = new CountDownLatch(1);

        /* renamed from: e */
        public T f248165e;

        /* renamed from: b */
        public void mo118197b(T t) {
            this.f248165e = t;
            this.f248164d.countDown();
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public T get() {
            this.f248164d.await();
            return this.f248165e;
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return this.f248164d.getCount() == 0;
        }

        public T get(long j, TimeUnit timeUnit) {
            if (this.f248164d.await(j, timeUnit)) {
                return this.f248165e;
            }
            throw new TimeoutException();
        }
    }

    public static boolean tryLoadLibrary(String str, boolean z) {
        Log.m105924i(TAG, "#tryLoadLibrary, isInstalled = " + isInstalled());
        if (isInstalled()) {
            try {
                loadLibraryImpl(str);
                return true;
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "SoLoader.loadLibrary fail", new Object[0]);
            }
        } else {
            Log.m105928w(TAG, "Delivery is not installed, libName = " + str);
            return false;
        }
    }

    public static boolean isInstalled(String str) {
        return isInstalled();
    }
}
