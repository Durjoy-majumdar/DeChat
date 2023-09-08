package com.tencent.skyline;

import android.util.Log;
import com.tencent.skyline.jni.INativeHandler;
import com.tencent.skyline.jni.ISkylineResourceLoader;
import com.tencent.skyline.jni.NativeHandler;
import com.tencent.skyline.jni.SkylineResourceLoader;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H J\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H J\u0011\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H J\u0011\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H J\u0011\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007H J3\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J3\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J9\u0010!\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0016H J+\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J+\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J+\u0010$\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J+\u0010%\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0002J\u0019\u0010,\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H J)\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H J)\u00103\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u0010/\u001a\u000202H J!\u00106\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001fH J\u0019\u00107\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u001fH J\b\u00108\u001a\u00020\rH\u0016J \u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010:\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\rH\u0016J\b\u0010<\u001a\u00020\rH\u0016J\b\u0010=\u001a\u00020\rH\u0016J\u000e\u0010?\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020>J\u0010\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010@J\u0006\u0010C\u001a\u00020\u0007J*\u0010F\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010E\u001a\u00020DH\u0016J*\u0010G\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010E\u001a\u00020DH\u0016J0\u0010H\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010E\u001a\u00020DH\u0016J\"\u0010I\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010J\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010K\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010L\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010M\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016H\u0017J\u0018\u0010N\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0017J\u0018\u0010O\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0017J\u0010\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH\u0016J\u0010\u0010S\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0017J\u000e\u0010T\u001a\u00020\r2\u0006\u0010'\u001a\u00020&J\u000e\u0010U\u001a\u00020\r2\u0006\u0010*\u001a\u00020)J\u0016\u0010U\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)J\u0010\u0010V\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u0006\u0010W\u001a\u00020\u001fJ\u000e\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020XJ\u0010\u0010[\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u0010\u0010\\\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u001e\u0010]\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-J\u001e\u0010_\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u0010^\u001a\u000202J\u0016\u0010`\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001fJ\u000e\u0010a\u001a\u00020\r2\u0006\u00105\u001a\u00020\u001fJ\u000e\u0010b\u001a\u00020\r2\u0006\u00105\u001a\u00020\u001fR\u0014\u0010d\u001a\u00020c8\u0002XD¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010gR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010hR\u0016\u0010i\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020D0k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010\u0019\u001a\u00020n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010jR*\u0010x\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0vj\n\u0012\u0006\u0012\u0004\u0018\u00010&`w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010tR&\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\u00160vj\b\u0012\u0004\u0012\u00020\u0016`w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010yRU\u0010\u0001\u001a>\u0012\u0004\u0012\u00020\u0016\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0vj\b\u0012\u0004\u0012\u00020)`w0~j\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0vj\b\u0012\u0004\u0012\u00020)`w`8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010W\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010jR\u001b\u0010\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/skyline/SkylineRuntime;", "Lcom/tencent/skyline/ISkylineRuntimeFromNative;", "Lcom/tencent/skyline/ISkylineRuntimeToNative;", "Lcom/tencent/skyline/jni/NativeHandler;", "nativeHandler", "Lcom/tencent/skyline/jni/SkylineResourceLoader;", "resourceLoader", "", "nativeCreateRuntime", "runtimeHolderPtr", "isolatePtr", "contextPtr", "uvLoopPtr", "Lrx3/b0;", "nativeInitJsEngine", "taskRunnerPtr", "nativeInitUITaskRunner", "runtimeDelegatePtr", "nativeClearJSBindings", "nativeClearWorkletJSBindings", "runtimePtr", "nativeDestroyRuntime", "", "id", "pageId", "taskId", "Lcom/tencent/skyline/PageConfig;", "pageConfig", "nativeNavigateTo", "nativeRedirectTo", "delta", "", "animate", "nativeNavigateBack", "nativeAppLaunch", "nativeAutoReLaunch", "nativeReLaunch", "nativeSwitchTab", "Lcom/tencent/skyline/IBootstrapDoneCallback;", "bootstrapDoneCallback", "checkAndRun", "Lcom/tencent/skyline/IWindowReadyCallback;", "windowReady", "checkAndRunForWindowReady", "nativeDestroyWindow", "", "width", "height", "nativeUpdateWindowViewport", "widgetKey", "", "nativeUpdateKeyboardStatus", "brightness", "enable", "nativeUpdatePlatformBrightnessConfig", "nativeUpdateAccessibilityEnable", "init", "initJSEngine", "initUITaskRunner", "clearJSBindings", "clearWorkletJSBindings", "release", "Lcom/tencent/skyline/jni/INativeHandler;", "initNativeHandler", "Lcom/tencent/skyline/jni/ISkylineResourceLoader;", "skylineResourceLoader", "initResourceLoader", "getRuntimePtr", "Lcom/tencent/skyline/IRouteDoneCallback;", "callback", "navigateTo", "redirectTo", "navigateBack", "appLaunch", "autoReLaunch", "reLaunch", "switchTab", "notifyRouteDone", "notifyBack", "notifyBackDone", "Lcom/tencent/skyline/IRouteBackCallback;", "routeBackCallback", "waitForBack", "notifyBootstrapDone", "waitForBootstrap", "waitForWindowReady", "notifyWindowReady", "needCreateRuntime", "Lcom/tencent/skyline/IWindowDestroyCallback;", "windowDestroy", "waitForWindowDestroy", "notifyWindowDestroy", "destroyWindow", "updateWindowViewport", "keyboardHeight", "updateKeyboardStatus", "updatePlatformBrightnessConfig", "enableCronet", "updateAccessibilityEnable", "", "TAG", "Ljava/lang/String;", "J", "Lcom/tencent/skyline/jni/NativeHandler;", "Lcom/tencent/skyline/jni/SkylineResourceLoader;", "isInit", "Z", "Ljava/util/concurrent/ConcurrentHashMap;", "routeDoneCallbacks", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mRouteBackCallback", "Lcom/tencent/skyline/IRouteBackCallback;", "", "syncBootstrapObject", "Ljava/lang/Object;", "isBootstrapDone", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mBootstrapDoneCallbacks", "Ljava/util/ArrayList;", "sWindowReady", "Lcom/tencent/skyline/IWindowReadyCallback;", "syncWindowObject", "windowReadyIds", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "windowReadyCallbacks", "Ljava/util/HashMap;", "sWindowDestroy", "Lcom/tencent/skyline/IWindowDestroyCallback;", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineRuntime implements ISkylineRuntimeFromNative, ISkylineRuntimeToNative {
    /* access modifiers changed from: private */
    public final String TAG = "SkylineRuntime";
    private volatile boolean isBootstrapDone;
    private volatile boolean isInit;
    private volatile ArrayList<IBootstrapDoneCallback> mBootstrapDoneCallbacks = new ArrayList<>();
    private IRouteBackCallback mRouteBackCallback;
    private NativeHandler nativeHandler = new NativeHandler();
    private boolean needCreateRuntime = true;
    private SkylineResourceLoader resourceLoader = new SkylineResourceLoader();
    /* access modifiers changed from: private */
    public ConcurrentHashMap<Integer, IRouteDoneCallback> routeDoneCallbacks = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public long runtimeDelegatePtr;
    private long runtimeHolderPtr;
    private IWindowDestroyCallback sWindowDestroy;
    private IWindowReadyCallback sWindowReady;
    private final Object syncBootstrapObject = new Object();
    private final Object syncWindowObject = new Object();
    /* access modifiers changed from: private */
    public AtomicInteger taskId = new AtomicInteger();
    private volatile HashMap<Integer, ArrayList<IWindowReadyCallback>> windowReadyCallbacks = new HashMap<>();
    private volatile ArrayList<Integer> windowReadyIds = new ArrayList<>();

    private final boolean checkAndRun(IBootstrapDoneCallback iBootstrapDoneCallback) {
        if (!this.isInit) {
            SkylineLog.INSTANCE.mo120223e(this.TAG, C87412m.m108600m("waitForBootstrap fail, stack: ", Log.getStackTraceString(new Throwable())));
            return true;
        } else if (!this.isBootstrapDone) {
            return false;
        } else {
            iBootstrapDoneCallback.onDone();
            return true;
        }
    }

    private final boolean checkAndRunForWindowReady(int i, IWindowReadyCallback iWindowReadyCallback) {
        if (!this.windowReadyIds.contains(Integer.valueOf(i))) {
            return false;
        }
        iWindowReadyCallback.onWindowReady(i);
        return true;
    }

    /* access modifiers changed from: private */
    public final native void nativeAppLaunch(long j, int i, int i2, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeAutoReLaunch(long j, int i, int i2, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeClearJSBindings(long j);

    /* access modifiers changed from: private */
    public final native void nativeClearWorkletJSBindings(long j);

    private final native long nativeCreateRuntime(NativeHandler nativeHandler2, SkylineResourceLoader skylineResourceLoader);

    private final native void nativeDestroyRuntime(long j);

    /* access modifiers changed from: private */
    public final native void nativeDestroyWindow(long j, int i);

    private final native void nativeInitJsEngine(long j, long j2, long j3, long j4);

    private final native void nativeInitUITaskRunner(long j, long j2);

    /* access modifiers changed from: private */
    public final native int nativeNavigateBack(long j, int i, int i2, int i3, boolean z, int i4);

    /* access modifiers changed from: private */
    public final native void nativeNavigateTo(long j, int i, int i2, int i3, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeReLaunch(long j, int i, int i2, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeRedirectTo(long j, int i, int i2, int i3, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeSwitchTab(long j, int i, int i2, PageConfig pageConfig);

    /* access modifiers changed from: private */
    public final native void nativeUpdateAccessibilityEnable(long j, boolean z);

    private final native void nativeUpdateKeyboardStatus(long j, int i, int i2, double d);

    /* access modifiers changed from: private */
    public final native void nativeUpdatePlatformBrightnessConfig(long j, int i, boolean z);

    private final native void nativeUpdateWindowViewport(long j, int i, float f, float f2);

    public void appLaunch(int i, int i2, PageConfig pageConfig) {
        waitForBootstrap(new SkylineRuntime$appLaunch$1(this, i, i2, pageConfig));
    }

    public void autoReLaunch(int i, int i2, PageConfig pageConfig) {
        waitForBootstrap(new SkylineRuntime$autoReLaunch$1(this, i, i2, pageConfig));
    }

    public void clearJSBindings() {
        waitForBootstrap(new SkylineRuntime$clearJSBindings$1(this));
    }

    public void clearWorkletJSBindings() {
        waitForBootstrap(new SkylineRuntime$clearWorkletJSBindings$1(this));
    }

    public void destroyWindow(int i) {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " destroyWindow: " + i);
        waitForBootstrap(new SkylineRuntime$destroyWindow$1(this, i));
    }

    public final void enableCronet(boolean z) {
        waitForBootstrap(new SkylineRuntime$enableCronet$1(this, z));
    }

    public final long getRuntimePtr() {
        return this.runtimeHolderPtr;
    }

    public void init() {
        synchronized (this) {
            this.runtimeHolderPtr = nativeCreateRuntime(this.nativeHandler, this.resourceLoader);
            SkylineLog skylineLog = SkylineLog.INSTANCE;
            String str = this.TAG;
            skylineLog.mo120226i(str, this + " init: " + this.runtimeHolderPtr);
            this.resourceLoader.init();
            this.isInit = true;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void initJSEngine(long j, long j2, long j3) {
        nativeInitJsEngine(this.runtimeHolderPtr, j, j2, j3);
    }

    public final void initNativeHandler(INativeHandler iNativeHandler) {
        C87412m.m108594g(iNativeHandler, "nativeHandler");
        this.nativeHandler.init(iNativeHandler);
    }

    public final void initResourceLoader(ISkylineResourceLoader iSkylineResourceLoader) {
        this.resourceLoader.initResourceLoader(iSkylineResourceLoader);
    }

    public void initUITaskRunner(long j) {
        nativeInitUITaskRunner(this.runtimeHolderPtr, j);
    }

    public int navigateBack(int i, int i2, int i3, boolean z, IRouteDoneCallback iRouteDoneCallback) {
        C87412m.m108594g(iRouteDoneCallback, "callback");
        waitForBootstrap(new SkylineRuntime$navigateBack$1(this, i, i2, iRouteDoneCallback, i3, z));
        return 0;
    }

    public void navigateTo(int i, int i2, PageConfig pageConfig, IRouteDoneCallback iRouteDoneCallback) {
        C87412m.m108594g(iRouteDoneCallback, "callback");
        waitForBootstrap(new SkylineRuntime$navigateTo$1(this, i, i2, iRouteDoneCallback, pageConfig));
    }

    public final boolean needCreateRuntime() {
        boolean z;
        synchronized (this.syncWindowObject) {
            z = this.needCreateRuntime;
        }
        return z;
    }

    public void notifyBack(int i, int i2) {
        IRouteBackCallback iRouteBackCallback = this.mRouteBackCallback;
        if (iRouteBackCallback != null) {
            iRouteBackCallback.onBack(i, i2);
        }
    }

    public void notifyBackDone(int i, int i2) {
        IRouteBackCallback iRouteBackCallback = this.mRouteBackCallback;
        if (iRouteBackCallback != null) {
            iRouteBackCallback.onBackDone(i, i2);
        }
    }

    public void notifyBootstrapDone(long j) {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " notifyBootstrapDone " + j);
        this.runtimeDelegatePtr = j;
        ArrayList arrayList = new ArrayList();
        synchronized (this.syncBootstrapObject) {
            this.isBootstrapDone = true;
            arrayList.addAll(this.mBootstrapDoneCallbacks);
            this.mBootstrapDoneCallbacks.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IBootstrapDoneCallback iBootstrapDoneCallback = (IBootstrapDoneCallback) it.next();
            if (iBootstrapDoneCallback != null) {
                iBootstrapDoneCallback.onDone();
            }
        }
    }

    public void notifyRouteDone(int i) {
        IRouteDoneCallback remove = this.routeDoneCallbacks.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.onDone();
        }
    }

    public void notifyWindowDestroy(int i) {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " notifyWindowDestroy: " + i);
        IWindowDestroyCallback iWindowDestroyCallback = this.sWindowDestroy;
        if (iWindowDestroyCallback != null) {
            iWindowDestroyCallback.onWindowDestroy(i);
        }
        synchronized (this.syncWindowObject) {
            this.windowReadyIds.remove(Integer.valueOf(i));
            ArrayList remove = this.windowReadyCallbacks.remove(Integer.valueOf(i));
        }
    }

    public void notifyWindowReady(int i) {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " notifyWindowReady: " + i);
        ArrayList arrayList = new ArrayList();
        synchronized (this.syncWindowObject) {
            this.needCreateRuntime = false;
            this.windowReadyIds.add(Integer.valueOf(i));
            ArrayList arrayList2 = this.windowReadyCallbacks.get(Integer.valueOf(i));
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
                ArrayList remove = this.windowReadyCallbacks.remove(Integer.valueOf(i));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((IWindowReadyCallback) it.next()).onWindowReady(i);
        }
        IWindowReadyCallback iWindowReadyCallback = this.sWindowReady;
        if (iWindowReadyCallback != null) {
            iWindowReadyCallback.onWindowReady(i);
        }
    }

    public void reLaunch(int i, int i2, PageConfig pageConfig) {
        waitForBootstrap(new SkylineRuntime$reLaunch$1(this, i, i2, pageConfig));
    }

    public void redirectTo(int i, int i2, PageConfig pageConfig, IRouteDoneCallback iRouteDoneCallback) {
        C87412m.m108594g(iRouteDoneCallback, "callback");
        waitForBootstrap(new SkylineRuntime$redirectTo$1(this, i, i2, iRouteDoneCallback, pageConfig));
    }

    public void release() {
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " release");
        synchronized (this) {
            this.isInit = false;
            this.resourceLoader.initResourceLoader((ISkylineResourceLoader) null);
            this.resourceLoader.release();
            nativeDestroyRuntime(this.runtimeHolderPtr);
            this.runtimeHolderPtr = 0;
            this.runtimeDelegatePtr = 0;
            this.nativeHandler.init((INativeHandler) null);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        synchronized (this.syncBootstrapObject) {
            this.mBootstrapDoneCallbacks.clear();
        }
        synchronized (this.syncWindowObject) {
            this.sWindowReady = null;
            this.sWindowDestroy = null;
            this.windowReadyIds.clear();
            this.windowReadyCallbacks.clear();
        }
    }

    public void switchTab(int i, int i2, PageConfig pageConfig) {
        waitForBootstrap(new SkylineRuntime$switchTab$1(this, i, i2, pageConfig));
    }

    public final void updateAccessibilityEnable(boolean z) {
        waitForBootstrap(new SkylineRuntime$updateAccessibilityEnable$1(this, z));
    }

    public final void updateKeyboardStatus(int i, int i2, double d) {
        long j = this.runtimeDelegatePtr;
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " updateKeyboardStatus(runtimeId:" + j + ", windowId:" + i + ", height:" + d + ')');
        if (j != 0) {
            nativeUpdateKeyboardStatus(j, i, i2, d);
        }
    }

    public final void updatePlatformBrightnessConfig(int i, boolean z) {
        waitForBootstrap(new SkylineRuntime$updatePlatformBrightnessConfig$1(this, i, z));
    }

    public final void updateWindowViewport(int i, float f, float f2) {
        long j = this.runtimeDelegatePtr;
        SkylineLog skylineLog = SkylineLog.INSTANCE;
        String str = this.TAG;
        skylineLog.mo120226i(str, this + " updateWindowViewport(runtimeId:" + j + ", windowId:" + i + ", width:" + f + ", height:" + f2 + ')');
        if (j != 0) {
            nativeUpdateWindowViewport(j, i, f, f2);
        }
    }

    public void waitForBack(IRouteBackCallback iRouteBackCallback) {
        C87412m.m108594g(iRouteBackCallback, "routeBackCallback");
        this.mRouteBackCallback = iRouteBackCallback;
    }

    public final void waitForBootstrap(IBootstrapDoneCallback iBootstrapDoneCallback) {
        C87412m.m108594g(iBootstrapDoneCallback, "bootstrapDoneCallback");
        if (!checkAndRun(iBootstrapDoneCallback)) {
            synchronized (this.syncBootstrapObject) {
                if (!checkAndRun(iBootstrapDoneCallback)) {
                    this.mBootstrapDoneCallbacks.add(iBootstrapDoneCallback);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public final void waitForWindowDestroy(IWindowDestroyCallback iWindowDestroyCallback) {
        C87412m.m108594g(iWindowDestroyCallback, "windowDestroy");
        this.sWindowDestroy = iWindowDestroyCallback;
    }

    public final void waitForWindowReady(IWindowReadyCallback iWindowReadyCallback) {
        C87412m.m108594g(iWindowReadyCallback, "windowReady");
        this.sWindowReady = iWindowReadyCallback;
    }

    public final void waitForWindowReady(int i, IWindowReadyCallback iWindowReadyCallback) {
        C87412m.m108594g(iWindowReadyCallback, "windowReady");
        if (!checkAndRunForWindowReady(i, iWindowReadyCallback)) {
            synchronized (this.syncWindowObject) {
                if (!checkAndRunForWindowReady(i, iWindowReadyCallback)) {
                    if (this.windowReadyCallbacks.get(Integer.valueOf(i)) == null) {
                        this.windowReadyCallbacks.put(Integer.valueOf(i), new ArrayList());
                    }
                    ArrayList arrayList = this.windowReadyCallbacks.get(Integer.valueOf(i));
                    if (arrayList != null) {
                        arrayList.add(iWindowReadyCallback);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
