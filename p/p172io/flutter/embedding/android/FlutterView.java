package p172io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterImageView;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.embedding.engine.renderer.RenderSurface;
import p172io.flutter.embedding.engine.renderer.SwapRenderSurface;
import p172io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p172io.flutter.plugin.editing.TextInputPlugin;
import p172io.flutter.plugin.editing.WxKeyboardAction;
import p172io.flutter.plugin.localization.LocalizationPlugin;
import p172io.flutter.plugin.mouse.MouseCursorPlugin;
import p172io.flutter.util.ViewUtils;
import p172io.flutter.view.AccessibilityBridge;
import p329d3.C86165a;
import p385u2.C111105a;
import p834a3.C53976c;

/* renamed from: io.flutter.embedding.android.FlutterView */
public class FlutterView extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate {
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private boolean enableSwitchSurface;
    private FlutterEngine flutterEngine;
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    /* access modifiers changed from: private */
    public FlutterImageView flutterImageView;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    /* access modifiers changed from: private */
    public final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    public FontScaleDelegate fontScaleDelegate;
    private boolean insetsByNative;
    /* access modifiers changed from: private */
    public boolean isFlutterUiDisplayed;
    private boolean isInSwapSurface;
    private KeyboardManager keyboardManager;
    private LocalizationPlugin localizationPlugin;
    /* access modifiers changed from: private */
    public WxKeyboardAction mWxKeyboardAction;
    private MouseCursorPlugin mouseCursorPlugin;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private RenderSurface previousRenderSurface;
    public RenderSurface renderSurface;
    private SwapRenderSurface swapRenderSurface;
    private TextInputPlugin textInputPlugin;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;
    private final C86165a<WindowLayoutInfo> windowInfoListener;
    private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    /* renamed from: io.flutter.embedding.android.FlutterView$FlutterEngineAttachmentListener */
    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$FontScaleDelegate */
    public interface FontScaleDelegate {
        float getFontScale();
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$ZeroSides */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
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

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View findViewByAccessibilityIdRootedAtCurrentView(int r6, android.view.View r7) {
        /*
            r5 = this;
            r0 = 0
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "getAccessibilityViewId"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            r2 = 1
            r1.setAccessible(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x003c }
            java.lang.Object r1 = r1.invoke(r7, r2)     // Catch:{ NoSuchMethodException -> 0x003c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchMethodException -> 0x003c }
            boolean r1 = r1.equals(r2)     // Catch:{ NoSuchMethodException -> 0x003c }
            if (r1 == 0) goto L_0x0021
            return r7
        L_0x0021:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x003c
        L_0x0025:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            if (r3 >= r2) goto L_0x003c
            android.view.View r1 = r1.getChildAt(r3)
            android.view.View r1 = r5.findViewByAccessibilityIdRootedAtCurrentView(r6, r1)
            if (r1 == 0) goto L_0x0039
            return r1
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.embedding.android.FlutterView.findViewByAccessibilityIdRootedAtCurrentView(int, android.view.View):android.view.View");
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        if (height == 0 || ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) height) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        Log.m165290v(TAG, "Initializing FlutterView");
        if (this.flutterSurfaceView != null) {
            Log.m165290v(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.flutterSurfaceView);
        } else if (this.flutterTextureView != null) {
            Log.m165290v(TAG, "Internally using a FlutterTextureView.");
            addView(this.flutterTextureView);
        } else {
            Log.m165290v(TAG, "Internally using a FlutterImageView.");
            addView(this.flutterImageView);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleHideCurrentRenderSurface$0() {
        this.flutterTextureView.setAlpha(1.0f);
    }

    /* access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            Log.m165292w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    private final void updateViewInsets(Insets insets) {
        FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
        int i = viewportMetrics2.viewInsetTop;
        int i2 = insets.top;
        if (i < i2) {
            viewportMetrics2.viewInsetTop = i2;
        }
        int i3 = viewportMetrics2.viewInsetLeft;
        int i4 = insets.left;
        if (i3 < i4) {
            viewportMetrics2.viewInsetLeft = i4;
        }
        int i5 = viewportMetrics2.viewInsetBottom;
        int i6 = insets.bottom;
        if (i5 < i6) {
            viewportMetrics2.viewInsetBottom = i6;
        }
        int i7 = viewportMetrics2.viewInsetRight;
        int i8 = insets.right;
        if (i7 < i8) {
            viewportMetrics2.viewInsetRight = i8;
        }
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView2 = this.flutterImageView;
        if (flutterImageView2 != null) {
            return flutterImageView2.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener2);
    }

    public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView2) {
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            flutterImageView2.attachToRenderer(flutterEngine2.getRenderer());
        }
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine2) {
        Log.m165288i(TAG, "Attaching to a FlutterEngine: " + flutterEngine2);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine2 == this.flutterEngine) {
                Log.m165288i(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                Log.m165290v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine2;
        FlutterRenderer renderer = flutterEngine2.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mouseCursorPlugin = new MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
        }
        this.textInputPlugin = new TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getPlatformViewsController());
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.textInputPlugin.setWxKeyboardAction(new WxKeyboardAction() {
            public boolean hideKeyboard() {
                if (FlutterView.this.mWxKeyboardAction != null) {
                    return FlutterView.this.mWxKeyboardAction.hideKeyboard();
                }
                return false;
            }

            public boolean showKeyboard(View view, TextInputChannel.WxInputConfiguration wxInputConfiguration) {
                if (FlutterView.this.mWxKeyboardAction != null) {
                    return FlutterView.this.mWxKeyboardAction.showKeyboard(view, wxInputConfiguration);
                }
                return false;
            }
        });
        this.keyboardManager = new KeyboardManager(this, this.textInputPlugin, new KeyChannelResponder[]{new KeyChannelResponder(flutterEngine2.getKeyEventChannel())});
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        AccessibilityBridge accessibilityBridge2 = new AccessibilityBridge(this, flutterEngine2.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.flutterEngine.getPlatformViewsController());
        this.accessibilityBridge = accessibilityBridge2;
        accessibilityBridge2.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        sendUserSettingsToFlutter();
        this.localizationPlugin.sendLocalesToFlutter(getResources().getConfiguration());
        sendViewportMetricsToFlutter();
        flutterEngine2.getPlatformViewsController().attachToView(this);
        for (FlutterEngineAttachmentListener onFlutterEngineAttachedToFlutterView : this.flutterEngineAttachmentListeners) {
            onFlutterEngineAttachedToFlutterView.onFlutterEngineAttachedToFlutterView(flutterEngine2);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.textInputPlugin.autofill(sparseArray);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView2 = this.flutterImageView;
        if (flutterImageView2 == null) {
            FlutterImageView createImageView = createImageView();
            this.flutterImageView = createImageView;
            addView(createImageView);
        } else {
            flutterImageView2.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView3 = this.flutterImageView;
        this.renderSurface = flutterImageView3;
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            flutterImageView3.attachToRenderer(flutterEngine2.getRenderer());
        }
    }

    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            return new WindowInfoRepositoryCallbackAdapterWrapper(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        Log.m165290v(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            Log.m165290v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (FlutterEngineAttachmentListener onFlutterEngineDetachedFromFlutterView : this.flutterEngineAttachmentListeners) {
            onFlutterEngineDetachedFromFlutterView.onFlutterEngineDetachedFromFlutterView();
        }
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        MouseCursorPlugin mouseCursorPlugin2 = this.mouseCursorPlugin;
        if (mouseCursorPlugin2 != null) {
            mouseCursorPlugin2.destroy();
        }
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.stopRenderingToSurface(this.renderSurface.getRenderSurface());
        renderer.setSemanticsEnabled(false);
        RenderSurface renderSurface2 = this.previousRenderSurface;
        if (renderSurface2 != null && this.renderSurface == this.flutterImageView) {
            this.renderSurface = renderSurface2;
        }
        this.renderSurface.detachFromRenderer();
        FlutterImageView flutterImageView2 = this.flutterImageView;
        if (flutterImageView2 != null) {
            flutterImageView2.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    public void detachPlatformBridges() {
        Log.m165290v(TAG, "Detaching all platform bridges from FlutterEngine: " + this.flutterEngine);
        for (FlutterEngineAttachmentListener onFlutterEngineDetachedFromFlutterView : this.flutterEngineAttachmentListeners) {
            onFlutterEngineDetachedFromFlutterView.onFlutterEngineDetachedFromFlutterView();
        }
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        MouseCursorPlugin mouseCursorPlugin2 = this.mouseCursorPlugin;
        if (mouseCursorPlugin2 != null) {
            mouseCursorPlugin2.destroy();
        }
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.setSemanticsEnabled(false);
        FlutterImageView flutterImageView2 = this.flutterImageView;
        if (flutterImageView2 != null) {
            flutterImageView2.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findViewByAccessibilityIdTraversal(int r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L_0x000b
            android.view.View r8 = r7.findViewByAccessibilityIdRootedAtCurrentView(r8, r7)
            return r8
        L_0x000b:
            r0 = 0
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "findViewByAccessibilityIdTraversal"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{  }
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            r1.setAccessible(r3)
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x002e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NoSuchMethodException -> 0x002e }
            r2[r6] = r8     // Catch:{ NoSuchMethodException -> 0x002e }
            java.lang.Object r8 = r1.invoke(r7, r2)     // Catch:{ NoSuchMethodException -> 0x002e }
            android.view.View r8 = (android.view.View) r8     // Catch:{ NoSuchMethodException -> 0x002e }
            return r8
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.embedding.android.FlutterView.findViewByAccessibilityIdTraversal(int):android.view.View");
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge2 = this.accessibilityBridge;
        if (accessibilityBridge2 == null || !accessibilityBridge2.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    public RenderSurface getAttachedRenderSurface() {
        return this.renderSurface;
    }

    public FlutterRenderer getAttachedRenderer() {
        RenderSurface renderSurface2 = this.renderSurface;
        if (renderSurface2 != null) {
            return renderSurface2.getAttachedRenderer();
        }
        return null;
    }

    public PointerIcon getSystemPointerIcon(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine2 = this.flutterEngine;
        return flutterEngine2 != null && flutterEngine2.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    public boolean isInSwapSurface() {
        return this.isInSwapSurface;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
            viewportMetrics2.systemGestureInsetTop = systemGestureInsets.top;
            viewportMetrics2.systemGestureInsetRight = systemGestureInsets.right;
            viewportMetrics2.systemGestureInsetBottom = systemGestureInsets.bottom;
            viewportMetrics2.systemGestureInsetLeft = systemGestureInsets.left;
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
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
            viewportMetrics3.viewPaddingTop = insets.top;
            viewportMetrics3.viewPaddingRight = insets.right;
            viewportMetrics3.viewPaddingBottom = insets.bottom;
            viewportMetrics3.viewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            if (this.insetsByNative) {
                updateViewInsets(insets2);
            } else {
                FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
                viewportMetrics4.viewInsetTop = insets2.top;
                viewportMetrics4.viewInsetRight = insets2.right;
                viewportMetrics4.viewInsetBottom = insets2.bottom;
                viewportMetrics4.viewInsetLeft = insets2.left;
            }
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
            viewportMetrics5.systemGestureInsetTop = insets3.top;
            viewportMetrics5.systemGestureInsetRight = insets3.right;
            viewportMetrics5.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics5.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.ViewportMetrics viewportMetrics6 = this.viewportMetrics;
                viewportMetrics6.viewPaddingTop = Math.max(Math.max(viewportMetrics6.viewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.ViewportMetrics viewportMetrics7 = this.viewportMetrics;
                viewportMetrics7.viewPaddingRight = Math.max(Math.max(viewportMetrics7.viewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.ViewportMetrics viewportMetrics8 = this.viewportMetrics;
                viewportMetrics8.viewPaddingBottom = Math.max(Math.max(viewportMetrics8.viewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.ViewportMetrics viewportMetrics9 = this.viewportMetrics;
                viewportMetrics9.viewPaddingLeft = Math.max(Math.max(viewportMetrics9.viewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.viewPaddingTop = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.viewPaddingRight = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.viewPaddingBottom = (!z || guessBottomKeyboardInset(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.viewportMetrics.viewPaddingLeft = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            if (this.insetsByNative) {
                updateViewInsets(Insets.of(0, 0, 0, guessBottomKeyboardInset(windowInsets)));
            } else {
                FlutterRenderer.ViewportMetrics viewportMetrics10 = this.viewportMetrics;
                viewportMetrics10.viewInsetTop = 0;
                viewportMetrics10.viewInsetRight = 0;
                viewportMetrics10.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
                this.viewportMetrics.viewInsetLeft = 0;
            }
        }
        Log.m165290v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity activity = ViewUtils.getActivity(getContext());
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null && activity != null) {
            Context context = getContext();
            Object obj = C111105a.f332697a;
            windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activity, Build.VERSION.SDK_INT >= 28 ? C111105a.C111112g.m151516a(context) : new C53976c(new Handler(context.getMainLooper())), this.windowInfoListener);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            Log.m165290v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.localizationPlugin.sendLocalesToFlutter(configuration);
            sendUserSettingsToFlutter();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
    }

    public void onDetachedFromWindow() {
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(this.windowInfoListener);
        }
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m165290v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
        viewportMetrics2.width = i;
        viewportMetrics2.height = i2;
        sendViewportMetricsToFlutter();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener2) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener2);
    }

    public void revertImageView(final Runnable runnable) {
        FlutterImageView flutterImageView2 = this.flutterImageView;
        if (flutterImageView2 == null) {
            Log.m165290v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        RenderSurface renderSurface2 = this.previousRenderSurface;
        if (renderSurface2 == null) {
            Log.m165290v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.renderSurface = renderSurface2;
        this.previousRenderSurface = null;
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 == null) {
            flutterImageView2.detachFromRenderer();
            runnable.run();
            return;
        }
        final FlutterRenderer renderer = flutterEngine2.getRenderer();
        if (renderer == null) {
            this.flutterImageView.detachFromRenderer();
            runnable.run();
            return;
        }
        this.renderSurface.attachToRenderer(renderer);
        final boolean isDisplayingFlutterUi = renderer.isDisplayingFlutterUi();
        renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() {
            private boolean isFirstCallDisplayed = true;

            public void onFlutterUiDisplayed() {
                if (!isDisplayingFlutterUi || !this.isFirstCallDisplayed) {
                    renderer.removeIsDisplayingFlutterUiListener(this);
                    runnable.run();
                    FlutterView flutterView = FlutterView.this;
                    if (!(flutterView.renderSurface instanceof FlutterImageView)) {
                        flutterView.flutterImageView.detachFromRenderer();
                        return;
                    }
                    return;
                }
                this.isFirstCallDisplayed = false;
            }

            public void onFlutterUiNoLongerDisplayed() {
            }
        });
    }

    public void sendUserSettingsToFlutter() {
        SettingsChannel.PlatformBrightness platformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        FontScaleDelegate fontScaleDelegate2 = this.fontScaleDelegate;
        this.flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(fontScaleDelegate2 != null ? fontScaleDelegate2.getFontScale() : getResources().getConfiguration().fontScale).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness(platformBrightness).send();
    }

    public void setEnableSwitchSurface(boolean z) {
        this.enableSwitchSurface = z;
        if (this.swapRenderSurface == null) {
            if (this.flutterSurfaceView != null) {
                SwapTextureViewRenderSurface swapTextureViewRenderSurface = new SwapTextureViewRenderSurface(getContext());
                this.swapRenderSurface = swapTextureViewRenderSurface;
                swapTextureViewRenderSurface.attachToFlutterView(this);
            } else if (!(this.flutterTextureView == null && this.flutterImageView == null)) {
                SwapSurfaceViewRenderSurface swapSurfaceViewRenderSurface = new SwapSurfaceViewRenderSurface(getContext());
                this.swapRenderSurface = swapSurfaceViewRenderSurface;
                swapSurfaceViewRenderSurface.attachToFlutterView(this);
            }
            this.isInSwapSurface = false;
        }
    }

    public void setFontScaleDelegate(FontScaleDelegate fontScaleDelegate2) {
        this.fontScaleDelegate = fontScaleDelegate2;
    }

    public final void setInsetsToFlutterDirect(Rect rect) {
        this.insetsByNative = true;
        FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
        viewportMetrics2.viewInsetTop = rect.top;
        viewportMetrics2.viewInsetLeft = rect.left;
        int i = rect.bottom;
        int i2 = viewportMetrics2.height;
        int i3 = 0;
        viewportMetrics2.viewInsetBottom = i > i2 ? 0 : i2 - i;
        int i4 = rect.right;
        int i5 = viewportMetrics2.width;
        if (i4 <= i5) {
            i3 = i5 - i4;
        }
        viewportMetrics2.viewInsetRight = i3;
        sendViewportMetricsToFlutter();
    }

    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            Log.m165290v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                arrayList.add(new FlutterRenderer.DisplayFeature(next.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.DisplayFeature(next.getBounds(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : displayCutout.getBoundingRects()) {
                Log.m165290v(TAG, "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new FlutterRenderer.DisplayFeature(next2, FlutterRenderer.DisplayFeatureType.CUTOUT));
            }
        }
        this.viewportMetrics.displayFeatures = arrayList;
        sendViewportMetricsToFlutter();
    }

    public void setWxKeyboardAction(WxKeyboardAction wxKeyboardAction) {
        this.mWxKeyboardAction = wxKeyboardAction;
    }

    public void switchSurface(boolean z) {
        SwapRenderSurface swapRenderSurface2;
        boolean z2;
        if (this.enableSwitchSurface && (swapRenderSurface2 = this.swapRenderSurface) != null && (z2 = this.isInSwapSurface) != z) {
            if (!z2) {
                swapRenderSurface2.swapSurface();
            } else {
                swapRenderSurface2.resumeSurface();
            }
            this.isInSwapSurface = !this.isInSwapSurface;
        }
    }

    public void toggleHideCurrentRenderSurface(boolean z) {
        FlutterImageView flutterImageView2;
        FlutterTextureView flutterTextureView2;
        FlutterRenderer attachedRenderer;
        RenderSurface renderSurface2 = this.renderSurface;
        if (renderSurface2 != null) {
            int i = z ? 4 : 0;
            if ((renderSurface2 instanceof FlutterSurfaceView) && this.flutterSurfaceView != null) {
                Log.m165288i(TAG, "not change surfaceView visibility");
            } else if ((renderSurface2 instanceof FlutterTextureView) && (flutterTextureView2 = this.flutterTextureView) != null) {
                flutterTextureView2.setVisibility(i);
                if (!z && (attachedRenderer = getAttachedRenderer()) != null) {
                    this.flutterTextureView.setAlpha(0.0f);
                    attachedRenderer.onNextFrameDisplayed(new FlutterView$$a(this));
                }
            } else if ((renderSurface2 instanceof FlutterImageView) && (flutterImageView2 = this.flutterImageView) != null) {
                flutterImageView2.setVisibility(i);
            }
            if (!z) {
                ((View) this.renderSurface).bringToFront();
            }
        }
    }

    public void tryRefreshViewportMetrics() {
        if (getWidth() > 0 && getHeight() > 0) {
            sendViewportMetricsToFlutter();
        }
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        super(context, (AttributeSet) null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = true;
                for (FlutterUiDisplayListener onFlutterUiDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiDisplayed.onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = false;
                for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new C86165a<WindowLayoutInfo>() {
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView2 = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView2;
            this.renderSurface = flutterSurfaceView2;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView2 = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView2;
            this.renderSurface = flutterTextureView2;
        } else {
            throw new IllegalArgumentException(String.format("RenderMode not supported with this constructor: %s", new Object[]{renderMode}));
        }
        init();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView2) {
        this(context, (AttributeSet) null, flutterSurfaceView2);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView2) {
        this(context, (AttributeSet) null, flutterTextureView2);
    }

    public FlutterView(Context context, FlutterImageView flutterImageView2) {
        this(context, (AttributeSet) null, flutterImageView2);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        super(context, (AttributeSet) null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        boolean z = false;
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = true;
                for (FlutterUiDisplayListener onFlutterUiDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiDisplayed.onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = false;
                for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new C86165a<WindowLayoutInfo>() {
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView2 = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent ? true : z);
            this.flutterSurfaceView = flutterSurfaceView2;
            this.renderSurface = flutterSurfaceView2;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView2 = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView2;
            this.renderSurface = flutterTextureView2;
        } else {
            throw new IllegalArgumentException(String.format("RenderMode not supported with this constructor: %s", new Object[]{renderMode}));
        }
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView2) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = true;
                for (FlutterUiDisplayListener onFlutterUiDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiDisplayed.onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = false;
                for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new C86165a<WindowLayoutInfo>() {
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterSurfaceView = flutterSurfaceView2;
        this.renderSurface = flutterSurfaceView2;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView2) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = true;
                for (FlutterUiDisplayListener onFlutterUiDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiDisplayed.onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = false;
                for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new C86165a<WindowLayoutInfo>() {
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterTextureView = flutterTextureView2;
        this.renderSurface = flutterTextureView2;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView2) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() {
            public void onAccessibilityChanged(boolean z, boolean z2) {
                FlutterView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = true;
                for (FlutterUiDisplayListener onFlutterUiDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiDisplayed.onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                boolean unused = FlutterView.this.isFlutterUiDisplayed = false;
                for (FlutterUiDisplayListener onFlutterUiNoLongerDisplayed : FlutterView.this.flutterUiDisplayListeners) {
                    onFlutterUiNoLongerDisplayed.onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new C86165a<WindowLayoutInfo>() {
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterImageView = flutterImageView2;
        this.renderSurface = flutterImageView2;
        init();
    }
}
