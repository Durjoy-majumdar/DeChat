package p172io.flutter.plugins.pathprovider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import p1167z8.C119065a;
import p1167z8.C119080c;
import p1167z8.C119081d;
import p1167z8.C119084g;
import p1167z8.C119085h;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.MethodCodec;
import p172io.flutter.plugin.common.PluginRegistry;
import p172io.flutter.plugin.common.StandardMethodCodec;
import p172io.flutter.util.PathUtils;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin */
public class PathProviderPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public static final String TAG = "PathProviderPlugin";
    private MethodChannel channel;
    private Context context;
    private PathProviderImpl impl;

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderBackgroundThread */
    public class PathProviderBackgroundThread implements PathProviderImpl {
        private PathProviderBackgroundThread() {
        }

        public void getApplicationDocumentsDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderApplicationDocumentsDirectory());
        }

        public void getApplicationSupportDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getApplicationSupportDirectory());
        }

        public void getExternalCacheDirectories(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderExternalCacheDirectories());
        }

        public void getExternalStorageDirectories(String str, MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderExternalStorageDirectories(str));
        }

        public void getStorageDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderStorageDirectory());
        }

        public void getTemporaryDirectory(MethodChannel.Result result) {
            result.success(PathProviderPlugin.this.getPathProviderTemporaryDirectory());
        }
    }

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderImpl */
    public interface PathProviderImpl {
        void getApplicationDocumentsDirectory(MethodChannel.Result result);

        void getApplicationSupportDirectory(MethodChannel.Result result);

        void getExternalCacheDirectories(MethodChannel.Result result);

        void getExternalStorageDirectories(String str, MethodChannel.Result result);

        void getStorageDirectory(MethodChannel.Result result);

        void getTemporaryDirectory(MethodChannel.Result result);
    }

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread */
    public class PathProviderPlatformThread implements PathProviderImpl {
        private final Executor executor;
        private final Executor uiThreadExecutor;

        private PathProviderPlatformThread() {
            this.uiThreadExecutor = new UiThreadExecutor();
            String.format(Locale.ROOT, "path-provider-background-%d", new Object[]{0});
            this.executor = Executors.newSingleThreadExecutor(new C119085h(Executors.defaultThreadFactory(), "path-provider-background-%d", new AtomicLong(0), (Boolean) null, 5, (Thread.UncaughtExceptionHandler) null));
        }

        private <T> void executeInBackground(Callable<T> callable, final MethodChannel.Result result) {
            C119084g gVar = new C119084g();
            C1172581 r1 = new C119080c<T>() {
                public void onFailure(Throwable th) {
                    result.error(th.getClass().getName(), th.getMessage(), (Object) null);
                }

                public void onSuccess(T t) {
                    result.success(t);
                }
            };
            gVar.addListener(new C119081d.C119082a(gVar, r1), this.uiThreadExecutor);
            this.executor.execute(new PathProviderPlugin$PathProviderPlatformThread$$e(gVar, callable));
        }

        /* access modifiers changed from: private */
        public static void lambda$executeInBackground$6(C119084g gVar, Callable callable) {
            try {
                Object call = callable.call();
                gVar.getClass();
                if (call == null) {
                    call = C119065a.f356601j;
                }
                if (C119065a.f356600i.mo183744b(gVar, (Object) null, call)) {
                    C119065a.m167846c(gVar);
                }
            } catch (Throwable th) {
                gVar.getClass();
                if (C119065a.f356600i.mo183744b(gVar, (Object) null, new C119065a.C119069d(th))) {
                    C119065a.m167846c(gVar);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ String lambda$getApplicationDocumentsDirectory$1() {
            return PathProviderPlugin.this.getPathProviderApplicationDocumentsDirectory();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ String lambda$getApplicationSupportDirectory$5() {
            return PathProviderPlugin.this.getApplicationSupportDirectory();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ List lambda$getExternalCacheDirectories$3() {
            return PathProviderPlugin.this.getPathProviderExternalCacheDirectories();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ List lambda$getExternalStorageDirectories$4(String str) {
            return PathProviderPlugin.this.getPathProviderExternalStorageDirectories(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ String lambda$getStorageDirectory$2() {
            return PathProviderPlugin.this.getPathProviderStorageDirectory();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ String lambda$getTemporaryDirectory$0() {
            return PathProviderPlugin.this.getPathProviderTemporaryDirectory();
        }

        public void getApplicationDocumentsDirectory(MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$g(this), result);
        }

        public void getApplicationSupportDirectory(MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$c(this), result);
        }

        public void getExternalCacheDirectories(MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$f(this), result);
        }

        public void getExternalStorageDirectories(String str, MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$d(this, str), result);
        }

        public void getStorageDirectory(MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$a(this), result);
        }

        public void getTemporaryDirectory(MethodChannel.Result result) {
            executeInBackground(new PathProviderPlugin$PathProviderPlatformThread$$b(this), result);
        }
    }

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$UiThreadExecutor */
    public static class UiThreadExecutor implements Executor {
        private final Handler handler;

        private UiThreadExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    public String getApplicationSupportDirectory() {
        return PathUtils.getFilesDir(this.context);
    }

    /* access modifiers changed from: private */
    public String getPathProviderApplicationDocumentsDirectory() {
        return PathUtils.getDataDirectory(this.context);
    }

    /* access modifiers changed from: private */
    public List<String> getPathProviderExternalCacheDirectories() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<String> getPathProviderExternalStorageDirectories(String str) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public String getPathProviderStorageDirectory() {
        File externalFilesDir = this.context.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* access modifiers changed from: private */
    public String getPathProviderTemporaryDirectory() {
        return this.context.getCacheDir().getPath();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new PathProviderPlugin().setup(registrar.messenger(), registrar.context());
    }

    private void setup(BinaryMessenger binaryMessenger, Context context2) {
        Class<MethodChannel> cls = MethodChannel.class;
        Class<BinaryMessenger.TaskQueue> cls2 = BinaryMessenger.TaskQueue.class;
        try {
            Object invoke = binaryMessenger.getClass().getMethod("makeBackgroundTaskQueue", new Class[0]).invoke(binaryMessenger, new Object[0]);
            this.channel = cls.getConstructor(new Class[]{BinaryMessenger.class, String.class, MethodCodec.class, cls2}).newInstance(new Object[]{binaryMessenger, "plugins.flutter.io/path_provider", StandardMethodCodec.INSTANCE, invoke});
            this.impl = new PathProviderBackgroundThread();
        } catch (Exception unused) {
            this.channel = new MethodChannel(binaryMessenger, "plugins.flutter.io/path_provider");
            this.impl = new PathProviderPlatformThread();
        }
        this.context = context2;
        this.channel.setMethodCallHandler(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setup(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1832373352:
                if (str.equals("getApplicationSupportDirectory")) {
                    c = 0;
                    break;
                }
                break;
            case -1208689078:
                if (str.equals("getExternalCacheDirectories")) {
                    c = 1;
                    break;
                }
                break;
            case 299667825:
                if (str.equals("getExternalStorageDirectories")) {
                    c = 2;
                    break;
                }
                break;
            case 1200320591:
                if (str.equals("getApplicationDocumentsDirectory")) {
                    c = 3;
                    break;
                }
                break;
            case 1252916648:
                if (str.equals("getStorageDirectory")) {
                    c = 4;
                    break;
                }
                break;
            case 1711844626:
                if (str.equals("getTemporaryDirectory")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.impl.getApplicationSupportDirectory(result);
                return;
            case 1:
                this.impl.getExternalCacheDirectories(result);
                return;
            case 2:
                this.impl.getExternalStorageDirectories(StorageDirectoryMapper.androidType((Integer) methodCall.argument("type")), result);
                return;
            case 3:
                this.impl.getApplicationDocumentsDirectory(result);
                return;
            case 4:
                this.impl.getStorageDirectory(result);
                return;
            case 5:
                this.impl.getTemporaryDirectory(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
