package p172io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k20.C9556a;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.dart.PlatformMessageHandler;
import p172io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import p172io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p172io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p172io.flutter.plugin.localization.LocalizationPlugin;
import p172io.flutter.plugin.platform.PlatformViewsController;
import p172io.flutter.util.ImmediateExecutor;
import p172io.flutter.util.Preconditions;
import p172io.flutter.view.AccessibilityBridge;
import p172io.flutter.view.FlutterCallbackInformation;

/* renamed from: io.flutter.embedding.engine.FlutterJNI */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static String observatoryUri = null;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private byte _hellAccFlag_;
    private AccessibilityDelegate accessibilityDelegate;
    private Executor backgroundExecutor = new ImmediateExecutor();
    private final Set<EngineDataReportListener> dataReportListeners = new CopyOnWriteArraySet();
    private DeferredComponentManager deferredComponentManager;
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<FlutterNextFrameDisplayListener> flutterNextFrameDisplayListeners = new CopyOnWriteArraySet();
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private LocalizationPlugin localizationPlugin;
    private TaskRunnerJNI mUITaskRunnerJNI;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private boolean operateSurfaceOnBackground = true;
    private PlatformMessageHandler platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$AccessibilityDelegate */
    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr);

        void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$AsyncWaitForVsyncDelegate */
    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$Factory */
    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 != null) {
            asyncWaitForVsyncDelegate2.asyncWaitForVsync(j);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new FlutterJNI$$a(j));
            } catch (IOException e) {
                Log.m165287e(TAG, "Failed to decode image", e);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler2 = this.platformMessageHandler;
        if (platformMessageHandler2 != null) {
            platformMessageHandler2.handlePlatformMessageResponse(i, byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    public static native void nativeAfterInit();

    private native long nativeAttach(FlutterJNI flutterJNI, long j);

    private native long nativeAttachNotInMainThread(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeClearCurrentSurface(long j);

    private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z);

    /* access modifiers changed from: private */
    public native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i2);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, boolean z);

    private static native void nativeInitNotInMainThread(Context context, String[] strArr, String str, String str2, String str3, long j);

    private native void nativeInstallNextFrameCallback(long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j2, long j3);

    private native void nativePauseScheduleFrame(long j);

    private static native void nativePrefetchDefaultFontManager(String str);

    private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRequestDrawLastFrame(long j);

    private native void nativeResumeScheduleFrame(long j);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, int i18, int i19, int i25, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, boolean z);

    /* access modifiers changed from: private */
    public native void nativeSurfaceChanged(long j, int i, int i2);

    /* access modifiers changed from: private */
    public native void nativeSurfaceCreated(long j, Surface surface);

    /* access modifiers changed from: private */
    public native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onDataReportJSON(byte[] bArr) {
        Iterator it = new CopyOnWriteArraySet(this.dataReportListeners).iterator();
        while (it.hasNext()) {
            ((EngineDataReportListener) it.next()).onReportJSON(bArr);
        }
    }

    private void onPreEngineRestart() {
        Iterator it = new CopyOnWriteArraySet(this.engineLifecycleListeners).iterator();
        while (it.hasNext()) {
            ((FlutterEngine.EngineLifecycleListener) it.next()).onPreEngineRestart();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate2 = this.accessibilityDelegate;
        if (accessibilityDelegate2 != null) {
            accessibilityDelegate2.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate2 = this.accessibilityDelegate;
        if (accessibilityDelegate2 != null) {
            accessibilityDelegate2.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addDataReportListener(EngineDataReportListener engineDataReportListener) {
        this.dataReportListeners.add(engineDataReportListener);
    }

    public void addDisplayNextFrameListener(FlutterNextFrameDisplayListener flutterNextFrameDisplayListener) {
        if (this.nativeShellHolderId == null) {
            Log.m165286e(TAG, "addDisplayNextFrameListener error nativeShellHolderId is null");
            return;
        }
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.add(flutterNextFrameDisplayListener);
        nativeInstallNextFrameCallback(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void addEngineLifecycleListenerNotInMainThread(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.engineLifecycleListeners) {
            this.engineLifecycleListeners.add(engineLifecycleListener);
        }
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void addIsDisplayingFlutterUiListenerNotInMainThread(FlutterUiDisplayListener flutterUiDisplayListener) {
        synchronized (this.flutterUiDisplayListeners) {
            this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
        }
    }

    public void afterInitNotInMainThread() {
        nativeAfterInit();
    }

    public void attachNotInMainThread() {
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttachNotInMainThread(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void attachUITaskRunner(TaskRunnerJNI taskRunnerJNI) {
        this.mUITaskRunnerJNI = taskRunnerJNI;
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public void clearCurrentRenderSurface() {
        if (this.nativeShellHolderId == null) {
            Log.m165286e(TAG, "clearCurrentRenderSurface error nativeShellHolderId is null");
            return;
        }
        Log.m165288i(TAG, "clearCurrentRenderSurface");
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        long longValue = this.nativeShellHolderId.longValue();
        Log.m165288i(TAG, "clearCurrentRenderSurface start: " + longValue);
        nativeClearCurrentSurface(longValue);
        Log.m165288i(TAG, "clearCurrentRenderSurface end: " + longValue);
    }

    public void clearDisplayNextFrameListener() {
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.clear();
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i + 0];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        if (resolveNativeLocale == null) {
            return new String[0];
        }
        return new String[]{resolveNativeLocale.getLanguage(), resolveNativeLocale.getCountry(), resolveNativeLocale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.destroyOverlaySurfaces();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        Log.m165288i(TAG, "detachFromNativeAndReleaseResources " + this.nativeShellHolderId);
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final Long l = this.nativeShellHolderId;
        this.backgroundExecutor.execute(new Runnable() {
            public void run() {
                Log.m165288i(FlutterJNI.TAG, "nativeDestroy started");
                long currentTimeMillis = System.currentTimeMillis();
                FlutterJNI.this.nativeDestroy(l.longValue());
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Log.m165288i(FlutterJNI.TAG, "nativeDestroy completed: " + currentTimeMillis2);
            }
        });
        this.nativeShellHolderId = null;
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.m165292w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        Log.m165292w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i, action, (Object) null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j) {
        PlatformMessageHandler platformMessageHandler2 = this.platformMessageHandler;
        if (platformMessageHandler2 != null) {
            platformMessageHandler2.handleMessageFromDart(str, byteBuffer, i, j);
        } else {
            nativeCleanupMessageData(j);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j) {
        if (initCalled) {
            Log.m165292w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, true);
        initCalled = true;
    }

    public void initNotInMainThread(Context context, String[] strArr, String str, String str2, String str3, long j) {
        if (initCalled) {
            Log.m165292w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInitNotInMainThread(context, strArr, str, str2, str3, j);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.m165292w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
                } else {
                    Log.m165292w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                }
            } finally {
                this.shellHolderLock.readLock().unlock();
            }
        } else {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary() {
        if (loadLibraryCalled) {
            Log.m165292w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c("flutter");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "io/flutter/embedding/engine/FlutterJNI", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "io/flutter/embedding/engine/FlutterJNI", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onBeginFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayOverlaySurface(i, i2, i3, i4, i5);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onDisplayPlatformView(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController2 = this.platformViewsController;
        if (platformViewsController2 != null) {
            platformViewsController2.onEndFrame();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener onFlutterUiDisplayed : this.flutterUiDisplayListeners) {
            onFlutterUiDisplayed.onFlutterUiDisplayed();
        }
    }

    public void onNextFrame() {
        ensureRunningOnMainThread();
        for (FlutterNextFrameDisplayListener onFlutterDisplayNextFrame : this.flutterNextFrameDisplayListeners) {
            onFlutterDisplayNextFrame.onFlutterDisplayNextFrame();
        }
        this.flutterNextFrameDisplayListeners.clear();
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : this.flutterUiDisplayListeners) {
            onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final long longValue = this.nativeShellHolderId.longValue();
        final int i3 = i;
        final int i4 = i2;
        C1172273 r1 = new Runnable() {
            public void run() {
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceChanged start: " + longValue);
                FlutterJNI.this.nativeSurfaceChanged(longValue, i3, i4);
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceChanged end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(r1);
        } else {
            r1.run();
        }
    }

    public void onSurfaceCreated(final Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final long longValue = this.nativeShellHolderId.longValue();
        C1172262 r2 = new Runnable() {
            public void run() {
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceCreated start: " + longValue);
                FlutterJNI.this.nativeSurfaceCreated(longValue, surface);
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceCreated end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(r2);
        } else {
            r2.run();
        }
    }

    public void onSurfaceDestroyed() {
        if (this.nativeShellHolderId == null) {
            Log.m165286e(TAG, "onSurfaceDestroyed error nativeShellHolderId is null");
            return;
        }
        Log.m165288i(TAG, "onSurfaceDestroyed");
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        final long longValue = this.nativeShellHolderId.longValue();
        C1172284 r2 = new Runnable() {
            public void run() {
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceDestroyed start: " + longValue);
                FlutterJNI.this.nativeSurfaceDestroyed(longValue);
                Log.m165288i(FlutterJNI.TAG, "nativeSurfaceDestroyed end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(r2);
        } else {
            r2.run();
        }
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j2, long j3) {
        nativeOnVsync(j, j2, j3);
    }

    public void pauseScheduleFrame() {
        Long l = this.nativeShellHolderId;
        if (l == null) {
            Log.m165286e(TAG, "stopFrame error nativeShellHolderId is null");
        } else {
            nativePauseScheduleFrame(l.longValue());
        }
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        TaskRunnerJNI taskRunnerJNI = this.mUITaskRunnerJNI;
        return nativeAttach(flutterJNI, taskRunnerJNI != null ? taskRunnerJNI.getAddress() : 0);
    }

    public long performNativeAttachNotInMainThread(FlutterJNI flutterJNI) {
        return nativeAttachNotInMainThread(flutterJNI);
    }

    public void prefetchDefaultFontManager(String str) {
        if (prefetchDefaultFontManagerCalled) {
            Log.m165292w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager(str);
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference(surfaceTextureWrapper));
    }

    public void removeDataReportListener(EngineDataReportListener engineDataReportListener) {
        this.dataReportListeners.remove(engineDataReportListener);
    }

    public void removeDisplayNextFrameListener(FlutterNextFrameDisplayListener flutterNextFrameDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.remove(flutterNextFrameDisplayListener);
    }

    public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void removeEngineLifecycleListenerNotInMainThread(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.engineLifecycleListeners) {
            this.engineLifecycleListeners.remove(engineLifecycleListener);
        }
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void removeIsDisplayingFlutterUiListenerNotInMainThread(FlutterUiDisplayListener flutterUiDisplayListener) {
        synchronized (this.flutterUiDisplayListeners) {
            this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
        }
    }

    public void requestDartDeferredLibrary(int i) {
        DeferredComponentManager deferredComponentManager2 = this.deferredComponentManager;
        if (deferredComponentManager2 != null) {
            deferredComponentManager2.installDeferredComponent(i, (String) null);
        } else {
            Log.m165286e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void requestDrawLastFrame() {
        Long l = this.nativeShellHolderId;
        if (l == null) {
            Log.m165286e(TAG, "requestDrawLastFrame error nativeShellHolderId is null");
        } else {
            nativeRequestDrawLastFrame(l.longValue());
        }
    }

    public void resumeScheduleFrame() {
        Long l = this.nativeShellHolderId;
        if (l == null) {
            Log.m165286e(TAG, "startFrame error nativeShellHolderId is null");
        } else {
            nativeResumeScheduleFrame(l.longValue());
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate2) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate2;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setBackgroundExecutor(Executor executor, boolean z) {
        this.backgroundExecutor = executor;
        this.operateSurfaceOnBackground = z;
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager2) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager2;
        if (deferredComponentManager2 != null) {
            deferredComponentManager2.setJNI(this);
        }
    }

    public synchronized void setDeferredComponentManagerNotInMainThread(DeferredComponentManager deferredComponentManager2) {
        this.deferredComponentManager = deferredComponentManager2;
        if (deferredComponentManager2 != null) {
            deferredComponentManager2.setJNI(this);
        }
    }

    public void setLocalizationPlugin(LocalizationPlugin localizationPlugin2) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin2;
    }

    public synchronized void setLocalizationPluginNotInMainThread(LocalizationPlugin localizationPlugin2) {
        this.localizationPlugin = localizationPlugin2;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler2) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler2;
    }

    public synchronized void setPlatformMessageHandlerNotInMainThread(PlatformMessageHandler platformMessageHandler2) {
        this.platformMessageHandler = platformMessageHandler2;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController2;
    }

    public synchronized void setPlatformViewsControllerNotInMainThread(PlatformViewsController platformViewsController2) {
        this.platformViewsController = platformViewsController2;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
            return;
        }
        Log.m165286e(TAG, "FlutterJNI was detached from native C++. setSemantics " + z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, int i18, int i19, int i25, int[] iArr, int[] iArr2, int[] iArr3) {
        if (this.nativeShellHolderId == null) {
            Log.m165286e(TAG, "setViewportMetrics error nativeShellHolderId is null");
            return;
        }
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i15, i16, i17, i18, i19, i25, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        return spawn(str, str2, str3, list, false);
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, action.value, byteBuffer, i2);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, z);
        Long l = nativeSpawn.nativeShellHolderId;
        Preconditions.checkState((l == null || l.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
