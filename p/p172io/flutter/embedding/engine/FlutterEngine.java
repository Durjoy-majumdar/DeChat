package p172io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Looper;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p172io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import p172io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import p172io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import p172io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import p172io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import p172io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import p172io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import p172io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import p172io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import p172io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import p172io.flutter.embedding.engine.systemchannels.NavigationChannel;
import p172io.flutter.embedding.engine.systemchannels.PlatformChannel;
import p172io.flutter.embedding.engine.systemchannels.RestorationChannel;
import p172io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p172io.flutter.embedding.engine.systemchannels.SkiaChannel;
import p172io.flutter.embedding.engine.systemchannels.StatChannel;
import p172io.flutter.embedding.engine.systemchannels.SystemChannel;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p172io.flutter.plugin.localization.LocalizationPlugin;
import p172io.flutter.plugin.platform.PlatformViewsController;

/* renamed from: io.flutter.embedding.engine.FlutterEngine */
public class FlutterEngine {
    private static final String TAG = "FlutterEngine";
    private final AccessibilityChannel accessibilityChannel;
    private final DartExecutor dartExecutor;
    private final DeferredComponentChannel deferredComponentChannel;
    private final EngineLifecycleListener engineLifecycleListener;
    /* access modifiers changed from: private */
    public final Set<EngineLifecycleListener> engineLifecycleListeners;
    private final FlutterJNI flutterJNI;
    private final KeyEventChannel keyEventChannel;
    private final LifecycleChannel lifecycleChannel;
    private final LocalizationChannel localizationChannel;
    private final LocalizationPlugin localizationPlugin;
    private final MouseCursorChannel mouseCursorChannel;
    private final NavigationChannel navigationChannel;
    private final PlatformChannel platformChannel;
    /* access modifiers changed from: private */
    public final PlatformViewsController platformViewsController;
    private final FlutterEngineConnectionRegistry pluginRegistry;
    private final FlutterRenderer renderer;
    /* access modifiers changed from: private */
    public final RestorationChannel restorationChannel;
    private final SettingsChannel settingsChannel;
    private final SkiaChannel skiaChannel;
    private final StatChannel statChannel;
    private final SystemChannel systemChannel;
    private final TextInputChannel textInputChannel;

    /* renamed from: io.flutter.embedding.engine.FlutterEngine$EngineLifecycleListener */
    public interface EngineLifecycleListener {
        void onEngineWillDestroy();

        void onPreEngineRestart();
    }

    public FlutterEngine(Context context) {
        this(context, (String[]) null);
    }

    private void attachToJni() {
        Log.m165290v(TAG, "Attaching to JNI.");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.m165288i(TAG, "Attaching to JNI in main thread");
            this.flutterJNI.attachToNative();
        } else {
            Log.m165288i(TAG, "Attaching to JNI not in main thread");
            this.flutterJNI.attachNotInMainThread();
        }
        if (!isAttachedToJni()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean isAttachedToJni() {
        return this.flutterJNI.isAttached();
    }

    public void addDataReportListener(EngineDataReportListener engineDataReportListener) {
        this.flutterJNI.addDataReportListener(engineDataReportListener);
    }

    public void addEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener2) {
        this.engineLifecycleListeners.add(engineLifecycleListener2);
    }

    public void destroy() {
        Log.m165290v(TAG, "Destroying.");
        for (EngineLifecycleListener onEngineWillDestroy : this.engineLifecycleListeners) {
            onEngineWillDestroy.onEngineWillDestroy();
        }
        this.engineLifecycleListeners.clear();
        this.pluginRegistry.destroy();
        this.platformViewsController.onDetachedFromJNI();
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.setDeferredComponentManager((DeferredComponentManager) null);
        this.flutterJNI.detachFromNativeAndReleaseResources();
        if (FlutterInjector.instance().deferredComponentManager() != null) {
            FlutterInjector.instance().deferredComponentManager().destroy();
            this.deferredComponentChannel.setDeferredComponentManager((DeferredComponentManager) null);
        }
    }

    public AccessibilityChannel getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    public ActivityControlSurface getActivityControlSurface() {
        return this.pluginRegistry;
    }

    public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
        return this.pluginRegistry;
    }

    public ContentProviderControlSurface getContentProviderControlSurface() {
        return this.pluginRegistry;
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    public DeferredComponentChannel getDeferredComponentChannel() {
        return this.deferredComponentChannel;
    }

    public KeyEventChannel getKeyEventChannel() {
        return this.keyEventChannel;
    }

    public LifecycleChannel getLifecycleChannel() {
        return this.lifecycleChannel;
    }

    public LocalizationChannel getLocalizationChannel() {
        return this.localizationChannel;
    }

    public LocalizationPlugin getLocalizationPlugin() {
        return this.localizationPlugin;
    }

    public MouseCursorChannel getMouseCursorChannel() {
        return this.mouseCursorChannel;
    }

    public NavigationChannel getNavigationChannel() {
        return this.navigationChannel;
    }

    public PlatformChannel getPlatformChannel() {
        return this.platformChannel;
    }

    public PlatformViewsController getPlatformViewsController() {
        return this.platformViewsController;
    }

    public PluginRegistry getPlugins() {
        return this.pluginRegistry;
    }

    public FlutterRenderer getRenderer() {
        return this.renderer;
    }

    public RestorationChannel getRestorationChannel() {
        return this.restorationChannel;
    }

    public ServiceControlSurface getServiceControlSurface() {
        return this.pluginRegistry;
    }

    public SettingsChannel getSettingsChannel() {
        return this.settingsChannel;
    }

    public SkiaChannel getSkiaChannel() {
        return this.skiaChannel;
    }

    public StatChannel getStatChannel() {
        return this.statChannel;
    }

    public SystemChannel getSystemChannel() {
        return this.systemChannel;
    }

    public TextInputChannel getTextInputChannel() {
        return this.textInputChannel;
    }

    public void removeDataReportListener(EngineDataReportListener engineDataReportListener) {
        this.flutterJNI.removeDataReportListener(engineDataReportListener);
    }

    public void removeEngineLifecycleListener(EngineLifecycleListener engineLifecycleListener2) {
        this.engineLifecycleListeners.remove(engineLifecycleListener2);
    }

    public void setBackgroundExecutor(Executor executor, boolean z) {
        this.renderer.setBackgroundExecutor(executor);
        this.flutterJNI.setBackgroundExecutor(executor, z);
    }

    public FlutterEngine spawn(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str, List<String> list) {
        return spawn(context, dartEntrypoint, str, list, true);
    }

    public FlutterEngine(Context context, String[] strArr) {
        this(context, (FlutterLoader) null, (FlutterJNI) null, strArr, true);
    }

    public FlutterEngine spawn(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str, List<String> list, boolean z) {
        return spawn(context, dartEntrypoint, str, list, z, false);
    }

    public FlutterEngine(Context context, String[] strArr, boolean z) {
        this(context, (FlutterLoader) null, (FlutterJNI) null, strArr, z);
    }

    public FlutterEngine spawn(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str, List<String> list, boolean z, boolean z2) {
        DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (isAttachedToJni()) {
            return new FlutterEngine(context, (FlutterLoader) null, this.flutterJNI.spawn(dartEntrypoint2.dartEntrypointFunctionName, dartEntrypoint2.dartEntrypointLibrary, str, list, z2), (String[]) null, z);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public FlutterEngine(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, (FlutterLoader) null, (FlutterJNI) null, new PlatformViewsController(), strArr, z, z2);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI2) {
        this(context, flutterLoader, flutterJNI2, (String[]) null, true);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI2, String[] strArr, boolean z) {
        this(context, flutterLoader, flutterJNI2, new PlatformViewsController(), strArr, z);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI2, PlatformViewsController platformViewsController2, String[] strArr, boolean z) {
        this(context, flutterLoader, flutterJNI2, platformViewsController2, strArr, z, false);
    }

    public FlutterEngine(Context context, FlutterLoader flutterLoader, FlutterJNI flutterJNI2, PlatformViewsController platformViewsController2, String[] strArr, boolean z, boolean z2) {
        AssetManager assetManager;
        this.engineLifecycleListeners = new HashSet();
        this.engineLifecycleListener = new EngineLifecycleListener() {
            public void onEngineWillDestroy() {
            }

            public void onPreEngineRestart() {
                Log.m165290v(FlutterEngine.TAG, "onPreEngineRestart()");
                for (EngineLifecycleListener onPreEngineRestart : FlutterEngine.this.engineLifecycleListeners) {
                    onPreEngineRestart.onPreEngineRestart();
                }
                FlutterEngine.this.platformViewsController.onPreEngineRestart();
                FlutterEngine.this.restorationChannel.clearData();
            }
        };
        boolean z3 = false;
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        FlutterInjector instance = FlutterInjector.instance();
        flutterJNI2 = flutterJNI2 == null ? instance.getFlutterJNIFactory().provideFlutterJNI() : flutterJNI2;
        this.flutterJNI = flutterJNI2;
        DartExecutor dartExecutor2 = new DartExecutor(flutterJNI2, assetManager);
        this.dartExecutor = dartExecutor2;
        dartExecutor2.onAttachedToJNI();
        DeferredComponentManager deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
        this.accessibilityChannel = new AccessibilityChannel(dartExecutor2, flutterJNI2);
        DeferredComponentChannel deferredComponentChannel2 = new DeferredComponentChannel(dartExecutor2);
        this.deferredComponentChannel = deferredComponentChannel2;
        this.keyEventChannel = new KeyEventChannel(dartExecutor2);
        this.lifecycleChannel = new LifecycleChannel(dartExecutor2);
        LocalizationChannel localizationChannel2 = new LocalizationChannel(dartExecutor2);
        this.localizationChannel = localizationChannel2;
        this.mouseCursorChannel = new MouseCursorChannel(dartExecutor2);
        this.navigationChannel = new NavigationChannel(dartExecutor2);
        this.platformChannel = new PlatformChannel(dartExecutor2);
        this.restorationChannel = new RestorationChannel(dartExecutor2, z2);
        this.settingsChannel = new SettingsChannel(dartExecutor2);
        this.systemChannel = new SystemChannel(dartExecutor2);
        this.textInputChannel = new TextInputChannel(dartExecutor2);
        this.skiaChannel = new SkiaChannel(dartExecutor2);
        this.statChannel = new StatChannel(dartExecutor2);
        if (deferredComponentManager != null) {
            deferredComponentManager.setDeferredComponentChannel(deferredComponentChannel2);
        }
        LocalizationPlugin localizationPlugin2 = new LocalizationPlugin(context, localizationChannel2);
        this.localizationPlugin = localizationPlugin2;
        flutterLoader = flutterLoader == null ? instance.flutterLoader() : flutterLoader;
        if (!flutterJNI2.isAttached()) {
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context, strArr, Looper.myLooper() == Looper.getMainLooper() ? true : z3);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            flutterJNI2.addEngineLifecycleListener(this.engineLifecycleListener);
            flutterJNI2.setPlatformViewsController(platformViewsController2);
            flutterJNI2.setLocalizationPlugin(localizationPlugin2);
            flutterJNI2.setDeferredComponentManager(instance.deferredComponentManager());
        } else {
            flutterJNI2.addEngineLifecycleListenerNotInMainThread(this.engineLifecycleListener);
            flutterJNI2.setPlatformViewsControllerNotInMainThread(platformViewsController2);
            flutterJNI2.setLocalizationPluginNotInMainThread(localizationPlugin2);
            flutterJNI2.setDeferredComponentManagerNotInMainThread(instance.deferredComponentManager());
        }
        if (!flutterJNI2.isAttached()) {
            attachToJni();
        }
        this.renderer = new FlutterRenderer(flutterJNI2);
        this.platformViewsController = platformViewsController2;
        platformViewsController2.onAttachedToJNI();
        this.pluginRegistry = new FlutterEngineConnectionRegistry(context.getApplicationContext(), this, flutterLoader);
        if (z && flutterLoader.automaticallyRegisterPlugins()) {
            GeneratedPluginRegister.registerGeneratedPlugins(this);
        }
    }
}
