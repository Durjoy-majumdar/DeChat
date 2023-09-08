package com.tencent.skyline;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.tencent.skyline.jni.SkylineLibraryLoader;
import com.tencent.skyline.jsapi.JsApiMethodChannelExecutor;
import com.tencent.skyline.jsapi.SkylineJsApiInvoker;
import fy3.C32224a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.android.FlutterImageView;
import p172io.flutter.embedding.android.FlutterSurfaceView;
import p172io.flutter.embedding.android.FlutterTextureView;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.TaskRunnerJNI;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.systemchannels.StatChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.platform.SkylinePlatformViewsController;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\n*\u0001X\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001`B\t\b\u0002¢\u0006\u0004\b^\u0010_J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J0\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0016\u0010\u000e\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J,\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\tJ\u0016\u0010'\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010&\u001a\u00020$J\u000e\u0010(\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020$J\u000e\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\tJ\u0010\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010-\u001a\u00020\tJ\u0010\u00102\u001a\u0004\u0018\u0001012\u0006\u0010-\u001a\u00020\tJ\u000e\u00103\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\tJ\u0010\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010-\u001a\u00020\tJ\u0006\u00106\u001a\u000205J.\u0010<\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\t2\u0006\u00107\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020;R\u0014\u0010=\u001a\u0002058\u0002XT¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R6\u0010D\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020B\u0018\u00010Aj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020B\u0018\u0001`C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER2\u0010G\u001a\u001e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u000b0Aj\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u000b`C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u0002058\u0002XT¢\u0006\u0006\n\u0004\bK\u0010>R\u0014\u0010L\u001a\u0002058\u0002XT¢\u0006\u0006\n\u0004\bL\u0010>R\u0014\u0010M\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010NR\u001c\u0010Q\u001a\u00020 8B@\u0002X\u000e¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b[\u0010NR\u0014\u0010\\\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\\\u0010NR\u0014\u0010]\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b]\u0010N¨\u0006a"}, mo182094d2 = {"Lcom/tencent/skyline/SkylineLogic;", "", "Lkotlin/Function0;", "Lrx3/b0;", "block", "runOnMainThread", "initLibrary", "Landroid/content/Context;", "context", "", "flutterEngineId", "Lio/flutter/embedding/engine/FlutterJNI;", "flutterJNI", "Lio/flutter/embedding/engine/FlutterEngine;", "createFlutterEngine", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "dartEntrypoint", "Lcom/tencent/skyline/SkylineConfig;", "config", "spawnExport", "createDartEntryPoint", "mode", "initMode", "init", "Lcom/tencent/skyline/SkylineLogic$InitDoneCallback;", "callback", "initAsync", "preloadTaskRunner", "preloadFlutterJNI", "getFlutterJNI", "Lio/flutter/embedding/engine/TaskRunnerJNI;", "getTaskRunner", "", "width", "height", "type", "Lio/flutter/embedding/android/FlutterView;", "createFlutterView", "flutterView", "attachFlutterEngine", "appIsResumed", "appIsInactive", "appIsPaused", "appIsDetached", "detachFlutterView", "id", "destroyFlutterEngine", "Landroid/graphics/Bitmap;", "obtainBitmap", "Lio/flutter/embedding/engine/renderer/FlutterRenderer;", "obtainRenderer", "reportMemoryUsage", "getFlutterEngine", "", "version", "name", "Lorg/json/JSONObject;", "data", "callbackId", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker$SkylineJsApiCallback;", "invokeJsApi", "TAG", "Ljava/lang/String;", "isInit", "Z", "Ljava/util/HashMap;", "Lcom/tencent/skyline/FlutterEngineAddon;", "Lkotlin/collections/HashMap;", "activeEngines", "Ljava/util/HashMap;", "", "flutterJNIs", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "SKYLINE_NAME", "SKYLINE_INIT_NAME", "MODE_MULTI_FLUTTER_ENGINE_GROUP", "I", "MODE_SINGLE_FLUTTER_ENGINE_GROUP", "DEFAULT_MODE", "singleFlutterEngineGroup", "getSingleFlutterEngineGroup", "()Z", "firstId", "Lio/flutter/embedding/engine/FlutterJNI;", "taskRunnerJNI", "Lio/flutter/embedding/engine/TaskRunnerJNI;", "com/tencent/skyline/SkylineLogic$sFlutterUiDisplayListener$1", "sFlutterUiDisplayListener", "Lcom/tencent/skyline/SkylineLogic$sFlutterUiDisplayListener$1;", "TYPE_TEXTURE", "TYPE_SURFACE", "TYPE_IMAGE", "<init>", "()V", "InitDoneCallback", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineLogic {
    private static final int DEFAULT_MODE = 1;
    public static final SkylineLogic INSTANCE = new SkylineLogic();
    public static final int MODE_MULTI_FLUTTER_ENGINE_GROUP = 1;
    public static final int MODE_SINGLE_FLUTTER_ENGINE_GROUP = 2;
    private static final String SKYLINE_INIT_NAME = "Skyline_Invoke_MethodChannel";
    private static final String SKYLINE_NAME = "Skyline_MethodChannel";
    private static final String TAG = "SkylineLogic";
    public static final int TYPE_IMAGE = 3;
    public static final int TYPE_SURFACE = 2;
    public static final int TYPE_TEXTURE = 1;
    /* access modifiers changed from: private */
    public static HashMap<Integer, FlutterEngineAddon> activeEngines;
    private static int firstId;
    /* access modifiers changed from: private */
    public static HashMap<Long, FlutterJNI> flutterJNIs = new HashMap<>();
    private static boolean isInit;
    private static Handler mainHandler;
    private static int mode = 1;
    private static FlutterJNI preloadFlutterJNI;
    private static final SkylineLogic$sFlutterUiDisplayListener$1 sFlutterUiDisplayListener = new SkylineLogic$sFlutterUiDisplayListener$1();
    private static boolean singleFlutterEngineGroup;
    private static TaskRunnerJNI taskRunnerJNI;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/skyline/SkylineLogic$InitDoneCallback;", "", "Lrx3/b0;", "onDone", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
    public interface InitDoneCallback {
        void onDone();
    }

    private SkylineLogic() {
    }

    private final DartExecutor.DartEntrypoint createDartEntryPoint(SkylineConfig skylineConfig) {
        String findAppBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
        C87412m.m108593f(findAppBundlePath, "instance().flutterLoader().findAppBundlePath()");
        return new DartExecutor.DartEntrypoint(findAppBundlePath, skylineConfig.getLibraryURI(), skylineConfig.getEntryPointName());
    }

    /* access modifiers changed from: private */
    /* renamed from: createFlutterEngine$lambda-1  reason: not valid java name */
    public static final void m168905createFlutterEngine$lambda1(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        C87412m.m108600m(methodCall.method, " not support.");
    }

    public static /* synthetic */ FlutterView createFlutterView$default(SkylineLogic skylineLogic, Context context, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 1;
        }
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = 1;
        }
        return skylineLogic.createFlutterView(context, i, i2, i3);
    }

    /* access modifiers changed from: private */
    public final boolean getSingleFlutterEngineGroup() {
        return mode == 2;
    }

    private final void initLibrary() {
        SkylineLibraryLoader.beforeLoad();
        SkylineLibraryLoader.load("skyline");
        SkylineLibraryLoader.afterLoad();
    }

    private final void runOnMainThread(C32224a<C13598b0> aVar) {
        long id = Thread.currentThread().getId();
        Handler handler = mainHandler;
        C87412m.m108591d(handler);
        if (id == handler.getLooper().getThread().getId()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = mainHandler;
        C87412m.m108591d(handler2);
        handler2.post(new SkylineLogic$$a(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: runOnMainThread$lambda-0  reason: not valid java name */
    public static final void m168906runOnMainThread$lambda0(C32224a aVar) {
        C87412m.m108594g(aVar, "$block");
        aVar.invoke();
    }

    private final FlutterEngine spawnExport(Context context, int i, FlutterJNI flutterJNI, DartExecutor.DartEntrypoint dartEntrypoint, SkylineConfig skylineConfig) {
        if (flutterJNI.isAttached()) {
            FlutterJNI spawn = flutterJNI.spawn(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, skylineConfig.toJSON(), (List<String>) null);
            C87412m.m108593f(spawn, "flutterJNI.spawn(\n      …y, config.toJSON(), null)");
            return new FlutterEngine(context, (FlutterLoader) null, spawn, new SkylinePlatformViewsController(i), (String[]) null, true);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine".toString());
    }

    public final void appIsDetached(int i) {
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        FlutterEngineAddon flutterEngineAddon = hashMap == null ? null : hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsDetached();
        }
    }

    public final void appIsInactive(int i) {
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        FlutterEngineAddon flutterEngineAddon = hashMap == null ? null : hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsInactive();
        }
    }

    public final void appIsPaused(int i) {
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        FlutterEngineAddon flutterEngineAddon = hashMap == null ? null : hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsPaused();
        }
    }

    public final void appIsResumed(int i) {
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        FlutterEngineAddon flutterEngineAddon = hashMap == null ? null : hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsResumed();
        }
    }

    public final void attachFlutterEngine(int i, FlutterView flutterView) {
        C87412m.m108594g(flutterView, "flutterView");
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        FlutterEngineAddon flutterEngineAddon = hashMap == null ? null : hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null) {
            flutterView.attachToFlutterEngine(flutterEngineAddon.getFlutterEngine());
            flutterView.addOnFirstFrameRenderedListener(sFlutterUiDisplayListener);
        }
    }

    public final boolean createFlutterEngine(Context context, SkylineConfig skylineConfig) {
        long j;
        FlutterEngine flutterEngine;
        FlutterJNI flutterJNI;
        AssetManager assetManager;
        Context context2 = context;
        SkylineConfig skylineConfig2 = skylineConfig;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(skylineConfig2, "config");
        int id = skylineConfig.getId();
        skylineConfig.toJSON();
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        if (hashMap.containsKey(Integer.valueOf(id))) {
            return true;
        }
        if (getSingleFlutterEngineGroup()) {
            j = 0;
        } else {
            j = skylineConfig.getRuntimePtr();
        }
        if (!flutterJNIs.containsKey(Long.valueOf(j))) {
            boolean z = preloadFlutterJNI != null;
            skylineConfig2.setPreloadTaskRunner(z);
            if (z) {
                flutterJNI = preloadFlutterJNI;
                C87412m.m108591d(flutterJNI);
                preloadFlutterJNI = null;
                taskRunnerJNI = null;
            } else {
                flutterJNI = new FlutterJNI();
            }
            FlutterJNI flutterJNI2 = flutterJNI;
            flutterJNIs.put(Long.valueOf(j), flutterJNI2);
            flutterEngine = createFlutterEngine(context2, id, flutterJNI2);
            flutterEngine.getNavigationChannel().setInitialRoute(skylineConfig.toJSON());
            DartExecutor.DartEntrypoint createDartEntryPoint = createDartEntryPoint(skylineConfig2);
            if (z) {
                try {
                    assetManager = context2.createPackageContext(context.getPackageName(), 0).getAssets();
                    C87412m.m108593f(assetManager, "{\n                    co…ssets()\n                }");
                } catch (PackageManager.NameNotFoundException unused) {
                    assetManager = context.getAssets();
                    C87412m.m108593f(assetManager, "{\n                    co…ssets()\n                }");
                }
                flutterJNI2.runBundleAndSnapshotFromLibrary(createDartEntryPoint.pathToBundle, createDartEntryPoint.dartEntrypointFunctionName, createDartEntryPoint.dartEntrypointLibrary, assetManager, (List<String>) null);
            } else {
                flutterEngine.getDartExecutor().executeDartEntrypoint(createDartEntryPoint);
            }
            if (getSingleFlutterEngineGroup()) {
                firstId = id;
            }
        } else {
            FlutterJNI flutterJNI3 = flutterJNIs.get(Long.valueOf(j));
            C87412m.m108591d(flutterJNI3);
            flutterEngine = spawnExport(context, id, flutterJNI3, createDartEntryPoint(skylineConfig2), skylineConfig);
        }
        if (flutterEngine == null) {
            return false;
        }
        flutterEngine.addDataReportListener(new SkylineLogic$createFlutterEngine$1());
        BinaryMessenger binaryMessenger = flutterEngine.getDartExecutor().getBinaryMessenger();
        C87412m.m108593f(binaryMessenger, "engine.dartExecutor.binaryMessenger");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, SKYLINE_NAME);
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, SKYLINE_INIT_NAME);
        SkylineJsApiInvoker skylineJsApiInvoker = new SkylineJsApiInvoker(new JsApiMethodChannelExecutor(binaryMessenger));
        HashMap<Integer, FlutterEngineAddon> hashMap2 = activeEngines;
        C87412m.m108591d(hashMap2);
        hashMap2.put(Integer.valueOf(id), new FlutterEngineAddon(flutterEngine, methodChannel2, skylineJsApiInvoker, skylineConfig2));
        flutterEngine.addEngineLifecycleListener(new SkylineLogic$createFlutterEngine$2(id));
        methodChannel.setMethodCallHandler(new SkylineLogic$$b());
        flutterEngine.getPlatformViewsController().attach(context2, flutterEngine.getRenderer(), flutterEngine.getDartExecutor());
        return true;
    }

    public final FlutterView createFlutterView(Context context, int i, int i2, int i3) {
        C87412m.m108594g(context, "context");
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? new FlutterView(context, new FlutterTextureView(context)) : new FlutterView(context, new FlutterImageView(context, i, i2, FlutterImageView.SurfaceKind.background)) : new FlutterView(context, new FlutterSurfaceView(context)) : new FlutterView(context, new FlutterTextureView(context));
    }

    public final void destroyFlutterEngine(int i) {
        FlutterEngine flutterEngine;
        if (!getSingleFlutterEngineGroup()) {
            HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
            C87412m.m108591d(hashMap);
            FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
            if (!(flutterEngineAddon == null || (flutterEngine = flutterEngineAddon.getFlutterEngine()) == null)) {
                flutterEngine.destroy();
            }
            HashMap<Integer, FlutterEngineAddon> hashMap2 = activeEngines;
            C87412m.m108591d(hashMap2);
            hashMap2.remove(Integer.valueOf(i));
        }
    }

    public final void detachFlutterView(FlutterView flutterView) {
        C87412m.m108594g(flutterView, "flutterView");
        flutterView.detachFromFlutterEngine();
        flutterView.removeOnFirstFrameRenderedListener(sFlutterUiDisplayListener);
    }

    public final FlutterEngine getFlutterEngine(int i) {
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon == null) {
            return null;
        }
        return flutterEngineAddon.getFlutterEngine();
    }

    public final FlutterJNI getFlutterJNI() {
        return preloadFlutterJNI;
    }

    public final TaskRunnerJNI getTaskRunner() {
        return taskRunnerJNI;
    }

    public final synchronized void init(Context context) {
        C87412m.m108594g(context, "context");
        if (!isInit) {
            isInit = true;
            initLibrary();
            activeEngines = new HashMap<>();
            mainHandler = new Handler(Looper.getMainLooper());
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            C87412m.m108593f(flutterLoader, "instance().flutterLoader()");
            runOnMainThread(new SkylineLogic$init$1(flutterLoader, context));
        }
    }

    public final synchronized void initAsync(Context context, InitDoneCallback initDoneCallback) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(initDoneCallback, "callback");
        if (!isInit) {
            isInit = true;
            initLibrary();
            activeEngines = new HashMap<>();
            mainHandler = new Handler(Looper.getMainLooper());
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            C87412m.m108593f(flutterLoader, "instance().flutterLoader()");
            if (!flutterLoader.initialized()) {
                flutterLoader.startInitializationAsync(context);
                FlutterShellArgs flutterShellArgs = new FlutterShellArgs(new String[0]);
                flutterShellArgs.add(FlutterShellArgs.ARG_BIND_CPU_CORES);
                String[] array = flutterShellArgs.toArray();
                Handler handler = mainHandler;
                C87412m.m108591d(handler);
                flutterLoader.ensureInitializationCompleteAsync(context, array, handler, new SkylineLogic$initAsync$1(initDoneCallback));
            }
        }
    }

    public final void initMode(int i) {
        C87412m.m108600m("initMode mode:", Integer.valueOf(i));
        mode = i;
    }

    public final void invokeJsApi(int i, String str, JSONObject jSONObject, int i2, SkylineJsApiInvoker.SkylineJsApiCallback skylineJsApiCallback) {
        SkylineJsApiInvoker<?> jsApiInvoker;
        C87412m.m108594g(str, "name");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(skylineJsApiCallback, "callback");
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null && (jsApiInvoker = flutterEngineAddon.getJsApiInvoker()) != null) {
            jsApiInvoker.invoke(str, jSONObject, i2, skylineJsApiCallback);
        }
    }

    public final Bitmap obtainBitmap(int i) {
        FlutterEngine flutterEngine;
        FlutterRenderer renderer;
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon == null || (flutterEngine = flutterEngineAddon.getFlutterEngine()) == null || (renderer = flutterEngine.getRenderer()) == null) {
            return null;
        }
        return renderer.getBitmap();
    }

    public final FlutterRenderer obtainRenderer(int i) {
        FlutterEngine flutterEngine;
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon == null || (flutterEngine = flutterEngineAddon.getFlutterEngine()) == null) {
            return null;
        }
        return flutterEngine.getRenderer();
    }

    public final void preloadFlutterJNI() {
        FlutterJNI flutterJNI = preloadFlutterJNI;
        if (flutterJNI != null) {
            flutterJNI.attachToNative();
        }
    }

    public final void preloadTaskRunner() {
        preloadFlutterJNI = new FlutterJNI();
        taskRunnerJNI = new TaskRunnerJNI();
        FlutterJNI flutterJNI = preloadFlutterJNI;
        C87412m.m108591d(flutterJNI);
        flutterJNI.attachUITaskRunner(taskRunnerJNI);
    }

    public final void reportMemoryUsage(int i) {
        FlutterEngine flutterEngine;
        StatChannel statChannel;
        HashMap<Integer, FlutterEngineAddon> hashMap = activeEngines;
        C87412m.m108591d(hashMap);
        FlutterEngineAddon flutterEngineAddon = hashMap.get(Integer.valueOf(i));
        if (flutterEngineAddon != null && (flutterEngine = flutterEngineAddon.getFlutterEngine()) != null && (statChannel = flutterEngine.getStatChannel()) != null) {
            statChannel.reportMemoryUsage();
        }
    }

    public final String version() {
        return "skyline/0.10.0 (-1;#751;d3396aab2dd98194e76b17359481faf4a8867324;engine-b6109023d50223ff82384ac799dc01e9098cb227;)";
    }

    private final FlutterEngine createFlutterEngine(Context context, int i, FlutterJNI flutterJNI) {
        return new FlutterEngine(context, (FlutterLoader) null, flutterJNI, new SkylinePlatformViewsController(i), (String[]) null, true);
    }
}
