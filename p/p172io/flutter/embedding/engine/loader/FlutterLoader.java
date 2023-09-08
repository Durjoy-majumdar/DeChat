package p172io.flutter.embedding.engine.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.util.PathUtils;
import p172io.flutter.view.VsyncWaiter;

/* renamed from: io.flutter.embedding.engine.loader.FlutterLoader */
public class FlutterLoader {
    public static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    public static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    public static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String ENABLE_SKPARAGRAPH_META_DATA_KEY = "io.flutter.embedding.android.EnableSkParagraph";
    public static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    public static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    public static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    public static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static FlutterLoader instance;
    /* access modifiers changed from: private */
    public ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    /* access modifiers changed from: private */
    public FlutterJNI flutterJNI;
    public Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    private boolean initialized;
    private Settings settings;

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$InitResult */
    public static class InitResult {
        public final String appStoragePath;
        public final String dataDirPath;
        public final String engineCachesPath;

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$Settings */
    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    private String fullAssetPathFrom(String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + File.separator + str;
    }

    /* access modifiers changed from: private */
    public ResourceExtractor initResources(Context context) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureInitializationCompleteAsync$1(Runnable runnable) {
        FlutterJNI.nativeAfterInit();
        Log.m165288i(TAG, "ensureInitializationCompleteAsync afterInit finished");
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$2(Context context, String[] strArr, Runnable runnable) {
        try {
            InitResult initResult = this.initResultFuture.get();
            ensureInitializationComplete(context.getApplicationContext(), strArr, false);
            new Handler(Looper.getMainLooper()).post(new FlutterLoader$$a(runnable));
        } catch (Exception e) {
            Log.m165287e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startInitialization$0(Context context) {
        Log.m165288i(TAG, "startInitialization, start init VsyncWaiter");
        VsyncWaiter.getInstance((DisplayManager) context.getSystemService("display"), this.flutterJNI).init();
        Log.m165288i(TAG, "startInitialization, finish init VsyncWaiter");
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(Context context, String[] strArr) {
        ensureInitializationComplete(context, strArr, true);
    }

    public void ensureInitializationCompleteAsync(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        } else if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new FlutterLoader$$b(this, context, strArr, runnable));
        }
    }

    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public String getLookupKeyForAsset(String str) {
        return fullAssetPathFrom(str);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(Context context) {
        startInitialization(context, new Settings(), true);
    }

    public void startInitializationAsync(Context context) {
        startInitialization(context, new Settings(), false);
    }

    public FlutterLoader(FlutterJNI flutterJNI2) {
        this(flutterJNI2, FlutterInjector.instance().executorService());
    }

    public void ensureInitializationComplete(Context context, String[] strArr, boolean z) {
        if (!this.initialized) {
            if (z && Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.settings != null) {
                Trace.beginSection("FlutterLoader#ensureInitializationComplete");
                try {
                    InitResult initResult = this.initResultFuture.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder();
                    sb.append("--icu-native-lib-path=");
                    sb.append(this.flutterApplicationInfo.nativeLibraryDir);
                    String str = File.separator;
                    sb.append(str);
                    sb.append(DEFAULT_LIBRARY);
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.aotSharedLibraryName);
                    arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.nativeLibraryDir + str + this.flutterApplicationInfo.aotSharedLibraryName);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("--cache-dir-path=");
                    sb4.append(initResult.engineCachesPath);
                    arrayList.add(sb4.toString());
                    if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                        arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                    }
                    if (this.settings.getLogTag() != null) {
                        arrayList.add("--log-tag=" + this.settings.getLogTag());
                    }
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    int i = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
                    if (i == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
                        i = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i);
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null && bundle.getBoolean(ENABLE_SKPARAGRAPH_META_DATA_KEY)) {
                        arrayList.add("--enable-skparagraph");
                    }
                    File file = new File(context.getExternalFilesDir((String) null), "update_files");
                    file.mkdirs();
                    arrayList.add("--update-path=" + file.getPath());
                    long uptimeMillis = SystemClock.uptimeMillis() - this.initStartTimestampMillis;
                    if (z) {
                        this.flutterJNI.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, initResult.appStoragePath, initResult.engineCachesPath, uptimeMillis);
                    } else {
                        this.flutterJNI.initNotInMainThread(context, (String[]) arrayList.toArray(new String[0]), (String) null, initResult.appStoragePath, initResult.engineCachesPath, uptimeMillis);
                    }
                    this.initialized = true;
                    Trace.endSection();
                } catch (Exception e) {
                    Log.m165287e(TAG, "Flutter initialization failed.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    public String getLookupKeyForAsset(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return getLookupKeyForAsset(sb.toString());
    }

    public void startInitialization(Context context, Settings settings2) {
        startInitialization(context, settings2, true);
    }

    public void startInitializationAsync(Context context, Settings settings2) {
        startInitialization(context, settings2, false);
    }

    public FlutterLoader(FlutterJNI flutterJNI2, ExecutorService executorService2) {
        this.initialized = false;
        this.flutterJNI = flutterJNI2;
        this.executorService = executorService2;
    }

    public void startInitialization(Context context, Settings settings2, boolean z) {
        if (this.settings == null) {
            if (!z || Looper.myLooper() == Looper.getMainLooper()) {
                Trace.beginSection("FlutterLoader#startInitialization");
                try {
                    final Context applicationContext = context.getApplicationContext();
                    this.settings = settings2;
                    this.initStartTimestampMillis = SystemClock.uptimeMillis();
                    this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
                    new Handler(Looper.getMainLooper()).post(new FlutterLoader$$c(this, applicationContext));
                    this.initResultFuture = this.executorService.submit(new Callable<InitResult>() {
                        /* access modifiers changed from: private */
                        public /* synthetic */ void lambda$call$0(Context context) {
                            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager(PathUtils.getCacheDirectory(context));
                        }

                        public InitResult call() {
                            Trace.beginSection("FlutterLoader initTask");
                            try {
                                ResourceExtractor access$000 = FlutterLoader.this.initResources(applicationContext);
                                FlutterLoader.this.flutterJNI.loadLibrary();
                                FlutterLoader.this.flutterJNI.updateRefreshRate();
                                FlutterLoader.this.executorService.execute(new FlutterLoader$1$$a(this, applicationContext));
                                if (access$000 != null) {
                                    access$000.waitForCompletion();
                                }
                                return new InitResult(PathUtils.getFilesDir(applicationContext), PathUtils.getCacheDirectory(applicationContext), PathUtils.getDataDirectory(applicationContext));
                            } finally {
                                Trace.endSection();
                            }
                        }
                    });
                } finally {
                    Trace.endSection();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}
