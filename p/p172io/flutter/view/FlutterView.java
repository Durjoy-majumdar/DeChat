package p172io.flutter.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p172io.flutter.Log;
import p172io.flutter.app.FlutterPluginRegistry;
import p172io.flutter.embedding.android.AndroidTouchProcessor;
import p172io.flutter.embedding.android.KeyChannelResponder;
import p172io.flutter.embedding.android.KeyboardManager;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p172io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import p172io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import p172io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import p172io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import p172io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import p172io.flutter.embedding.engine.systemchannels.NavigationChannel;
import p172io.flutter.embedding.engine.systemchannels.PlatformChannel;
import p172io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p172io.flutter.embedding.engine.systemchannels.SystemChannel;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p172io.flutter.plugin.common.ActivityLifecycleListener;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.C117252a;
import p172io.flutter.plugin.editing.TextInputPlugin;
import p172io.flutter.plugin.localization.LocalizationPlugin;
import p172io.flutter.plugin.mouse.MouseCursorPlugin;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p172io.flutter.plugin.platform.PlatformViewsController;
import p172io.flutter.util.ViewUtils;
import p172io.flutter.view.AccessibilityBridge;
import p172io.flutter.view.TextureRegistry;

@Deprecated
/* renamed from: io.flutter.view.FlutterView */
public class FlutterView extends SurfaceView implements BinaryMessenger, TextureRegistry, MouseCursorPlugin.MouseCursorViewDelegate {
    private static final String TAG = "FlutterView";
    private final AndroidTouchProcessor androidTouchProcessor;
    private final DartExecutor dartExecutor;
    private boolean didRenderFirstFrame;
    private final FlutterRenderer flutterRenderer;
    private final KeyEventChannel keyEventChannel;
    private final LifecycleChannel lifecycleChannel;
    private final LocalizationChannel localizationChannel;
    private AccessibilityBridge mAccessibilityNodeProvider;
    private final List<ActivityLifecycleListener> mActivityLifecycleListeners;
    private final List<FirstFrameListener> mFirstFrameListeners;
    private final InputMethodManager mImm;
    private boolean mIsSoftwareRenderingEnabled;
    private final KeyboardManager mKeyboardManager;
    private final LocalizationPlugin mLocalizationPlugin;
    private final ViewportMetrics mMetrics;
    private final MouseCursorPlugin mMouseCursorPlugin;
    /* access modifiers changed from: private */
    public FlutterNativeView mNativeView;
    private final SurfaceHolder.Callback mSurfaceCallback;
    private final TextInputPlugin mTextInputPlugin;
    private final NavigationChannel navigationChannel;
    private final AtomicLong nextTextureId;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformChannel platformChannel;
    private final SettingsChannel settingsChannel;
    private final SystemChannel systemChannel;

    /* renamed from: io.flutter.view.FlutterView$FirstFrameListener */
    public interface FirstFrameListener {
        void onFirstFrame();
    }

    /* renamed from: io.flutter.view.FlutterView$Provider */
    public interface Provider {
        FlutterView getFlutterView();
    }

    /* renamed from: io.flutter.view.FlutterView$SurfaceTextureRegistryEntry */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry {
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final long f351125id;
        private SurfaceTexture.OnFrameAvailableListener onFrameListener = new SurfaceTexture.OnFrameAvailableListener() {
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!SurfaceTextureRegistryEntry.this.released && FlutterView.this.mNativeView != null) {
                    FlutterView.this.mNativeView.getFlutterJNI().markTextureFrameAvailable(SurfaceTextureRegistryEntry.this.f351125id);
                }
            }
        };
        /* access modifiers changed from: private */
        public boolean released;
        private final SurfaceTextureWrapper textureWrapper;

        public SurfaceTextureRegistryEntry(long j, SurfaceTexture surfaceTexture) {
            this.f351125id = j;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture);
            surfaceTexture().setOnFrameAvailableListener(this.onFrameListener, new Handler());
        }

        /* renamed from: id */
        public long mo159349id() {
            return this.f351125id;
        }

        public void release() {
            if (!this.released) {
                this.released = true;
                surfaceTexture().setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                this.textureWrapper.release();
                FlutterView.this.mNativeView.getFlutterJNI().unregisterTexture(this.f351125id);
            }
        }

        public /* synthetic */ void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            C117269a.m165336a(this, onFrameConsumedListener);
        }

        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* renamed from: io.flutter.view.FlutterView$ViewportMetrics */
    public static final class ViewportMetrics {
        public float devicePixelRatio = 1.0f;
        public int physicalHeight = 0;
        public int physicalTouchSlop = -1;
        public int physicalViewInsetBottom = 0;
        public int physicalViewInsetLeft = 0;
        public int physicalViewInsetRight = 0;
        public int physicalViewInsetTop = 0;
        public int physicalViewPaddingBottom = 0;
        public int physicalViewPaddingLeft = 0;
        public int physicalViewPaddingRight = 0;
        public int physicalViewPaddingTop = 0;
        public int physicalWidth = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetTop = 0;
    }

    /* renamed from: io.flutter.view.FlutterView$ZeroSides */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null);
    }

    private ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? ZeroSides.LEFT : ZeroSides.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private boolean isAttached() {
        FlutterNativeView flutterNativeView = this.mNativeView;
        return flutterNativeView != null && flutterNativeView.isAttached();
    }

    private void postRun() {
    }

    private void preRun() {
        resetAccessibilityTree();
    }

    private void releaseAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null) {
            accessibilityBridge.release();
            this.mAccessibilityNodeProvider = null;
        }
    }

    /* access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.mIsSoftwareRenderingEnabled) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    private void sendUserPlatformSettingsToDart() {
        this.settingsChannel.startMessage().setTextScaleFactor(getResources().getConfiguration().fontScale).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness((getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light).send();
    }

    private void updateViewportMetrics() {
        if (isAttached()) {
            FlutterJNI flutterJNI = this.mNativeView.getFlutterJNI();
            ViewportMetrics viewportMetrics = this.mMetrics;
            flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.physicalWidth, viewportMetrics.physicalHeight, viewportMetrics.physicalViewPaddingTop, viewportMetrics.physicalViewPaddingRight, viewportMetrics.physicalViewPaddingBottom, viewportMetrics.physicalViewPaddingLeft, viewportMetrics.physicalViewInsetTop, viewportMetrics.physicalViewInsetRight, viewportMetrics.physicalViewInsetBottom, viewportMetrics.physicalViewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, new int[0], new int[0], new int[0]);
        }
    }

    public void addActivityLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        this.mActivityLifecycleListeners.add(activityLifecycleListener);
    }

    public void addFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.add(firstFrameListener);
    }

    public void assertAttached() {
        if (!isAttached()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.mTextInputPlugin.autofill(sparseArray);
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void destroy() {
        if (isAttached()) {
            getHolder().removeCallback(this.mSurfaceCallback);
            releaseAccessibilityNodeProvider();
            this.mNativeView.destroy();
            this.mNativeView = null;
        }
    }

    public FlutterNativeView detach() {
        if (!isAttached()) {
            return null;
        }
        getHolder().removeCallback(this.mSurfaceCallback);
        this.mNativeView.detachFromFlutterView();
        FlutterNativeView flutterNativeView = this.mNativeView;
        this.mNativeView = null;
        return flutterNativeView;
    }

    public void disableBufferingIncomingMessages() {
    }

    public void disableTransparentBackground() {
        setZOrderOnTop(false);
        getHolder().setFormat(-1);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Log.m165286e(TAG, "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttached() && this.mKeyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public void enableBufferingIncomingMessages() {
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.mAccessibilityNodeProvider;
    }

    public Bitmap getBitmap() {
        assertAttached();
        return this.mNativeView.getFlutterJNI().getBitmap();
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    public float getDevicePixelRatio() {
        return this.mMetrics.devicePixelRatio;
    }

    public FlutterNativeView getFlutterNativeView() {
        return this.mNativeView;
    }

    public String getLookupKeyForAsset(String str) {
        return FlutterMain.getLookupKeyForAsset(str);
    }

    public FlutterPluginRegistry getPluginRegistry() {
        return this.mNativeView.getPluginRegistry();
    }

    public PointerIcon getSystemPointerIcon(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean hasRenderedFirstFrame() {
        return this.didRenderFirstFrame;
    }

    public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return C117252a.m165325c(this);
    }

    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return null;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            ViewportMetrics viewportMetrics = this.mMetrics;
            viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
            viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
            viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
            viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
        }
        boolean z = true;
        int i2 = 0;
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z = false;
        }
        if (i >= 30) {
            if (z) {
                i2 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z2) {
                i2 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i2);
            ViewportMetrics viewportMetrics2 = this.mMetrics;
            viewportMetrics2.physicalViewPaddingTop = insets.top;
            viewportMetrics2.physicalViewPaddingRight = insets.right;
            viewportMetrics2.physicalViewPaddingBottom = insets.bottom;
            viewportMetrics2.physicalViewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            ViewportMetrics viewportMetrics3 = this.mMetrics;
            viewportMetrics3.physicalViewInsetTop = insets2.top;
            viewportMetrics3.physicalViewInsetRight = insets2.right;
            viewportMetrics3.physicalViewInsetBottom = insets2.bottom;
            viewportMetrics3.physicalViewInsetLeft = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            ViewportMetrics viewportMetrics4 = this.mMetrics;
            viewportMetrics4.systemGestureInsetTop = insets3.top;
            viewportMetrics4.systemGestureInsetRight = insets3.right;
            viewportMetrics4.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics4.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                ViewportMetrics viewportMetrics5 = this.mMetrics;
                viewportMetrics5.physicalViewPaddingTop = Math.max(Math.max(viewportMetrics5.physicalViewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                ViewportMetrics viewportMetrics6 = this.mMetrics;
                viewportMetrics6.physicalViewPaddingRight = Math.max(Math.max(viewportMetrics6.physicalViewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                ViewportMetrics viewportMetrics7 = this.mMetrics;
                viewportMetrics7.physicalViewPaddingBottom = Math.max(Math.max(viewportMetrics7.physicalViewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                ViewportMetrics viewportMetrics8 = this.mMetrics;
                viewportMetrics8.physicalViewPaddingLeft = Math.max(Math.max(viewportMetrics8.physicalViewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z) {
                zeroSides = calculateShouldZeroSides();
            }
            this.mMetrics.physicalViewPaddingTop = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.mMetrics.physicalViewPaddingRight = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.mMetrics.physicalViewPaddingBottom = (!z || guessBottomKeyboardInset(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.mMetrics.physicalViewPaddingLeft = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            ViewportMetrics viewportMetrics9 = this.mMetrics;
            viewportMetrics9.physicalViewInsetTop = 0;
            viewportMetrics9.physicalViewInsetRight = 0;
            viewportMetrics9.physicalViewInsetBottom = guessBottomKeyboardInset(windowInsets);
            this.mMetrics.physicalViewInsetLeft = 0;
        }
        updateViewportMetrics();
        return super.onApplyWindowInsets(windowInsets);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, new AccessibilityChannel(this.dartExecutor, getFlutterNativeView().getFlutterJNI()), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().getPlatformViewsController());
        this.mAccessibilityNodeProvider = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.mAccessibilityNodeProvider.isAccessibilityEnabled(), this.mAccessibilityNodeProvider.isTouchExplorationEnabled());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mLocalizationPlugin.sendLocalesToFlutter(configuration);
        sendUserPlatformSettingsToDart();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mTextInputPlugin.createInputConnection(this, this.mKeyboardManager, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        releaseAccessibilityNodeProvider();
    }

    public void onFirstFrame() {
        this.didRenderFirstFrame = true;
        Iterator it = new ArrayList(this.mFirstFrameListeners).iterator();
        while (it.hasNext()) {
            ((FirstFrameListener) it.next()).onFirstFrame();
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttached() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttached() ? super.onHoverEvent(motionEvent) : this.mAccessibilityNodeProvider.onAccessibilityHoverEvent(motionEvent);
    }

    public void onMemoryPressure() {
        this.mNativeView.getFlutterJNI().notifyLowMemoryWarning();
        this.systemChannel.sendMemoryPressureWarning();
    }

    public void onPause() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onPostResume() {
        for (ActivityLifecycleListener onPostResume : this.mActivityLifecycleListeners) {
            onPostResume.onPostResume();
        }
        this.lifecycleChannel.appIsResumed();
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.mTextInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ViewportMetrics viewportMetrics = this.mMetrics;
        viewportMetrics.physicalWidth = i;
        viewportMetrics.physicalHeight = i2;
        updateViewportMetrics();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void onStart() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onStop() {
        this.lifecycleChannel.appIsPaused();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttached()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    public void popRoute() {
        this.navigationChannel.popRoute();
    }

    public void pushRoute(String str) {
        this.navigationChannel.pushRoute(str);
    }

    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        this.mNativeView.getFlutterJNI().registerTexture(surfaceTextureRegistryEntry.mo159349id(), surfaceTextureRegistryEntry.textureWrapper());
        return surfaceTextureRegistryEntry;
    }

    public void removeFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.remove(firstFrameListener);
    }

    public void resetAccessibilityTree() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null) {
            accessibilityBridge.reset();
        }
    }

    public void runFromBundle(FlutterRunArguments flutterRunArguments) {
        assertAttached();
        preRun();
        this.mNativeView.runFromBundle(flutterRunArguments);
        postRun();
    }

    public void send(String str, ByteBuffer byteBuffer) {
        send(str, byteBuffer, (BinaryMessenger.BinaryReply) null);
    }

    public void setInitialRoute(String str) {
        this.navigationChannel.setInitialRoute(str);
    }

    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.mNativeView.setMessageHandler(str, binaryMessageHandler);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (FlutterNativeView) null);
    }

    public String getLookupKeyForAsset(String str, String str2) {
        return FlutterMain.getLookupKeyForAsset(str, str2);
    }

    public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        if (!isAttached()) {
            Log.m165284d(TAG, "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        this.mNativeView.send(str, byteBuffer, binaryReply);
    }

    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.mNativeView.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }

    public FlutterView(Context context, AttributeSet attributeSet, FlutterNativeView flutterNativeView) {
        super(context, attributeSet);
        this.nextTextureId = new AtomicLong(0);
        this.mIsSoftwareRenderingEnabled = false;
        this.didRenderFirstFrame = false;
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        Activity activity = ViewUtils.getActivity(getContext());
        if (activity != null) {
            if (flutterNativeView == null) {
                this.mNativeView = new FlutterNativeView(activity.getApplicationContext());
            } else {
                this.mNativeView = flutterNativeView;
            }
            DartExecutor dartExecutor2 = this.mNativeView.getDartExecutor();
            this.dartExecutor = dartExecutor2;
            FlutterRenderer flutterRenderer2 = new FlutterRenderer(this.mNativeView.getFlutterJNI());
            this.flutterRenderer = flutterRenderer2;
            this.mIsSoftwareRenderingEnabled = this.mNativeView.getFlutterJNI().getIsSoftwareRenderingEnabled();
            ViewportMetrics viewportMetrics = new ViewportMetrics();
            this.mMetrics = viewportMetrics;
            viewportMetrics.devicePixelRatio = context.getResources().getDisplayMetrics().density;
            viewportMetrics.physicalTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.mNativeView.attachViewAndActivity(this, activity);
            C1172642 r3 = new SurfaceHolder.Callback() {
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    FlutterView.this.assertAttached();
                    FlutterView.this.mNativeView.getFlutterJNI().onSurfaceChanged(i2, i3);
                }

                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    FlutterView.this.assertAttached();
                    FlutterView.this.mNativeView.getFlutterJNI().onSurfaceCreated(surfaceHolder.getSurface());
                }

                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    FlutterView.this.assertAttached();
                    FlutterView.this.mNativeView.getFlutterJNI().onSurfaceDestroyed();
                }
            };
            this.mSurfaceCallback = r3;
            getHolder().addCallback(r3);
            this.mActivityLifecycleListeners = new ArrayList();
            this.mFirstFrameListeners = new ArrayList();
            this.navigationChannel = new NavigationChannel(dartExecutor2);
            KeyEventChannel keyEventChannel2 = new KeyEventChannel(dartExecutor2);
            this.keyEventChannel = keyEventChannel2;
            this.lifecycleChannel = new LifecycleChannel(dartExecutor2);
            LocalizationChannel localizationChannel2 = new LocalizationChannel(dartExecutor2);
            this.localizationChannel = localizationChannel2;
            PlatformChannel platformChannel2 = new PlatformChannel(dartExecutor2);
            this.platformChannel = platformChannel2;
            this.systemChannel = new SystemChannel(dartExecutor2);
            this.settingsChannel = new SettingsChannel(dartExecutor2);
            final PlatformPlugin platformPlugin = new PlatformPlugin(activity, platformChannel2);
            addActivityLifecycleListener(new ActivityLifecycleListener() {
                public void onPostResume() {
                    platformPlugin.updateSystemUiOverlays();
                }
            });
            this.mImm = (InputMethodManager) getContext().getSystemService("input_method");
            PlatformViewsController platformViewsController = this.mNativeView.getPluginRegistry().getPlatformViewsController();
            TextInputPlugin textInputPlugin = new TextInputPlugin(this, new TextInputChannel(dartExecutor2), platformViewsController);
            this.mTextInputPlugin = textInputPlugin;
            this.mKeyboardManager = new KeyboardManager(this, textInputPlugin, new KeyChannelResponder[]{new KeyChannelResponder(keyEventChannel2)});
            if (Build.VERSION.SDK_INT >= 24) {
                this.mMouseCursorPlugin = new MouseCursorPlugin(this, new MouseCursorChannel(dartExecutor2));
            } else {
                this.mMouseCursorPlugin = null;
            }
            LocalizationPlugin localizationPlugin = new LocalizationPlugin(context, localizationChannel2);
            this.mLocalizationPlugin = localizationPlugin;
            this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer2, false);
            platformViewsController.attachToFlutterRenderer(flutterRenderer2);
            this.mNativeView.getPluginRegistry().getPlatformViewsController().attachTextInputPlugin(textInputPlugin);
            this.mNativeView.getFlutterJNI().setLocalizationPlugin(localizationPlugin);
            localizationPlugin.sendLocalesToFlutter(getResources().getConfiguration());
            sendUserPlatformSettingsToDart();
            return;
        }
        throw new IllegalArgumentException("Bad context");
    }
}
