package p172io.flutter.plugin.platform;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.AndroidTouchProcessor;
import p172io.flutter.embedding.android.FlutterImageView;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.MotionEventTracker;
import p172io.flutter.embedding.engine.FlutterOverlaySurface;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import p172io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import p172io.flutter.plugin.editing.TextInputPlugin;
import p172io.flutter.view.AccessibilityBridge;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.platform.CustomPlatformViewsController */
class CustomPlatformViewsController extends PlatformViewsController {
    private static final String TAG = "PlatformViewsController";
    private byte _hellAccFlag_;
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    /* access modifiers changed from: private */
    public AndroidTouchProcessor androidTouchProcessor;
    public final PlatformViewsChannel.PlatformViewsHandler channelHandler = new PlatformViewsChannel.PlatformViewsHandler() {
        private void ensureValidAndroidVersion(int i) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < i) {
                throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$createForTextureLayer$0(int i, View view, boolean z) {
            if (z) {
                CustomPlatformViewsController.this.platformViewsChannel.invokeViewFocused(i);
            } else if (CustomPlatformViewsController.this.textInputPlugin != null) {
                CustomPlatformViewsController.this.textInputPlugin.clearPlatformViewClient(i);
            }
        }

        public void clearFocus(int i) {
            PlatformView platformView = (PlatformView) CustomPlatformViewsController.this.platformViews.get(i);
            if (platformView == null) {
                Log.m165286e(CustomPlatformViewsController.TAG, "Clearing focus on an unknown view with id: " + i);
                return;
            }
            platformView.getView().clearFocus();
        }

        public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            ensureValidAndroidVersion(19);
            if (CustomPlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                PlatformViewFactory factory = CustomPlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
                if (factory != null) {
                    Object obj = null;
                    if (platformViewCreationRequest.params != null) {
                        obj = factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
                    }
                    PlatformView create = factory.create(CustomPlatformViewsController.this.context, platformViewCreationRequest.viewId, obj);
                    create.getView().setLayoutDirection(platformViewCreationRequest.direction);
                    CustomPlatformViewsController.this.platformViews.put(platformViewCreationRequest.viewId, create);
                    return;
                }
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + platformViewCreationRequest.viewId + ")");
        }

        public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            int i = platformViewCreationRequest.viewId;
            if (CustomPlatformViewsController.this.viewWrappers.get(i) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i);
            } else if (CustomPlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                CustomPlatformViewsController customPlatformViewsController = CustomPlatformViewsController.this;
                if (customPlatformViewsController.textureRegistry == null) {
                    throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i);
                } else if (customPlatformViewsController.flutterView != null) {
                    PlatformViewFactory factory = CustomPlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
                    if (factory != null) {
                        Object obj = null;
                        if (platformViewCreationRequest.params != null) {
                            obj = factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
                        }
                        PlatformView create = factory.create(CustomPlatformViewsController.this.context, i, obj);
                        CustomPlatformViewsController.this.platformViews.put(i, create);
                        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = CustomPlatformViewsController.this.textureRegistry.createSurfaceTexture();
                        PlatformViewWrapper platformViewWrapper = new PlatformViewWrapper(CustomPlatformViewsController.this.context, createSurfaceTexture);
                        platformViewWrapper.setTouchProcessor(CustomPlatformViewsController.this.androidTouchProcessor);
                        int physicalPixels = CustomPlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalWidth);
                        int physicalPixels2 = CustomPlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalHeight);
                        platformViewWrapper.setBufferSize(physicalPixels, physicalPixels2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
                        int physicalPixels3 = CustomPlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalTop);
                        int physicalPixels4 = CustomPlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalLeft);
                        layoutParams.topMargin = physicalPixels3;
                        layoutParams.leftMargin = physicalPixels4;
                        platformViewWrapper.setLayoutParams(layoutParams);
                        platformViewWrapper.setLayoutDirection(platformViewCreationRequest.direction);
                        platformViewWrapper.addView(create.getView());
                        platformViewWrapper.setOnDescendantFocusChangeListener(new CustomPlatformViewsController$1$$a(this, i));
                        CustomPlatformViewsController.this.flutterView.addView(platformViewWrapper);
                        CustomPlatformViewsController.this.viewWrappers.append(i, platformViewWrapper);
                        return createSurfaceTexture.mo159349id();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
                } else {
                    throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i);
                }
            } else {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + i + ")");
            }
        }

        public void dispose(int i) {
            PlatformView platformView = (PlatformView) CustomPlatformViewsController.this.platformViews.get(i);
            if (platformView != null) {
                ViewGroup viewGroup = (ViewGroup) platformView.getView().getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(platformView.getView());
                }
                CustomPlatformViewsController.this.platformViews.remove(i);
                platformView.dispose();
            }
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) CustomPlatformViewsController.this.viewWrappers.get(i);
            if (platformViewWrapper != null) {
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(platformViewWrapper);
                }
                CustomPlatformViewsController.this.viewWrappers.remove(i);
                return;
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) CustomPlatformViewsController.this.platformViewParent.get(i);
            if (flutterMutatorView != null) {
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup3 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(flutterMutatorView);
                }
                CustomPlatformViewsController.this.platformViewParent.remove(i);
            }
        }

        public void offset(int i, double d, double d2) {
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) CustomPlatformViewsController.this.viewWrappers.get(i);
            if (platformViewWrapper == null) {
                Log.m165286e(CustomPlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i);
                return;
            }
            int physicalPixels = CustomPlatformViewsController.this.toPhysicalPixels(d);
            int physicalPixels2 = CustomPlatformViewsController.this.toPhysicalPixels(d2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
            layoutParams.topMargin = physicalPixels;
            layoutParams.leftMargin = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
        }

        public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i = platformViewTouch.viewId;
            PlatformView platformView = (PlatformView) CustomPlatformViewsController.this.platformViews.get(i);
            if (platformView == null) {
                Log.m165286e(CustomPlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i);
                return;
            }
            ensureValidAndroidVersion(20);
            platformView.getView().dispatchTouchEvent(CustomPlatformViewsController.this.toMotionEvent(CustomPlatformViewsController.this.context.getResources().getDisplayMetrics().density, platformViewTouch));
        }

        public PlatformViewsChannel.PlatformViewBufferSize resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest) {
            int i = platformViewResizeRequest.viewId;
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) CustomPlatformViewsController.this.viewWrappers.get(i);
            if (platformViewWrapper == null) {
                Log.m165286e(CustomPlatformViewsController.TAG, "Resizing unknown platform view with id: " + i);
                return null;
            }
            int physicalPixels = CustomPlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int physicalPixels2 = CustomPlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            if (physicalPixels > platformViewWrapper.getBufferWidth() || physicalPixels2 > platformViewWrapper.getBufferHeight()) {
                platformViewWrapper.setBufferSize(physicalPixels, physicalPixels2);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
            layoutParams.width = physicalPixels;
            layoutParams.height = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
            return new PlatformViewsChannel.PlatformViewBufferSize(CustomPlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferWidth()), CustomPlatformViewsController.this.toLogicalPixels((double) platformViewWrapper.getBufferHeight()));
        }

        public void setDirection(int i, int i2) {
            if (!CustomPlatformViewsController.validateDirection(i2)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
            } else if (((PlatformView) CustomPlatformViewsController.this.platformViews.get(i)) == null) {
                Log.m165286e(CustomPlatformViewsController.TAG, "Setting direction to an unknown view with id: " + i);
            } else {
                ensureValidAndroidVersion(20);
                ((PlatformView) CustomPlatformViewsController.this.platformViews.get(i)).getView().setLayoutDirection(i2);
            }
        }

        public void synchronizeToNativeViewHierarchy(boolean z) {
            boolean unused = CustomPlatformViewsController.this.synchronizeToNativeViewHierarchy = z;
        }
    };
    public Context context;
    private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet<>();
    private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet<>();
    /* access modifiers changed from: private */
    public FlutterView flutterView;
    private boolean flutterViewConvertedToImageView = false;
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();
    private int nextOverlayLayerId = 0;
    private final SparseArray<FlutterImageView> overlayLayerViews = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    /* access modifiers changed from: private */
    public final SparseArray<PlatformView> platformViews = new SparseArray<>();
    public PlatformViewsChannel platformViewsChannel;
    /* access modifiers changed from: private */
    public final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    /* access modifiers changed from: private */
    public boolean synchronizeToNativeViewHierarchy = true;
    /* access modifiers changed from: private */
    public TextInputPlugin textInputPlugin;
    public TextureRegistry textureRegistry;
    /* access modifiers changed from: private */
    public final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray<>();

    private void finishFrame(boolean z) {
        for (int i = 0; i < this.overlayLayerViews.size(); i++) {
            int keyAt = this.overlayLayerViews.keyAt(i);
            FlutterImageView valueAt = this.overlayLayerViews.valueAt(i);
            if (this.currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(keyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(valueAt);
                z &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.platformViewParent.size(); i2++) {
            int keyAt2 = this.platformViewParent.keyAt(i2);
            View view = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(Integer.valueOf(keyAt2)) || (!z && this.synchronizeToNativeViewHierarchy)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    private void flushAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (this.synchronizeToNativeViewHierarchy && !this.flutterViewConvertedToImageView) {
            this.flutterView.convertToImageView();
            this.flutterViewConvertedToImageView = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$0(int i, View view, boolean z) {
        if (z) {
            this.platformViewsChannel.invokeViewFocused(i);
            return;
        }
        TextInputPlugin textInputPlugin2 = this.textInputPlugin;
        if (textInputPlugin2 != null) {
            textInputPlugin2.clearPlatformViewClient(i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onEndFrame$1() {
        finishFrame(false);
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerCoords : (List) obj) {
            arrayList.add(parsePointerCoords(parsePointerCoords, f));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object parsePointerProperties : (List) obj) {
            arrayList.add(parsePointerProperties(parsePointerProperties));
        }
        return arrayList;
    }

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            Log.m165286e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.overlayLayerViews.size(); i++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i));
        }
        this.overlayLayerViews.clear();
    }

    /* access modifiers changed from: private */
    public int toLogicalPixels(double d) {
        return (int) Math.round(d / ((double) getDisplayDensity()));
    }

    /* access modifiers changed from: private */
    public static boolean validateDirection(int i) {
        return i == 0 || i == 1;
    }

    public void attach(Context context2, TextureRegistry textureRegistry2, DartExecutor dartExecutor) {
        if (this.context == null) {
            this.context = context2;
            this.textureRegistry = textureRegistry2;
            PlatformViewsChannel platformViewsChannel2 = new PlatformViewsChannel(dartExecutor);
            this.platformViewsChannel = platformViewsChannel2;
            platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin2) {
        this.textInputPlugin = textInputPlugin2;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView2) {
        this.flutterView = flutterView2;
        for (int i = 0; i < this.platformViews.size(); i++) {
            this.platformViews.valueAt(i).onFlutterViewAttached(this.flutterView);
        }
    }

    public FlutterOverlaySurface createOverlaySurface(FlutterImageView flutterImageView) {
        int i = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i + 1;
        this.overlayLayerViews.put(i, flutterImageView);
        return new FlutterOverlaySurface(i, flutterImageView.getSurface());
    }

    public void destroyOverlaySurfaces() {
        Log.m165288i(TAG, "overlayLayerViews size=" + this.overlayLayerViews.size());
        for (int i = 0; i < this.overlayLayerViews.size(); i++) {
            FlutterImageView valueAt = this.overlayLayerViews.valueAt(i);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void detach() {
        PlatformViewsChannel platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler((PlatformViewsChannel.PlatformViewsHandler) null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge((AccessibilityBridge) null);
    }

    public void detachFromView() {
        for (int i = 0; i < this.platformViews.size(); i++) {
            this.platformViews.valueAt(i).onFlutterViewDetached();
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public View getPlatformViewById(int i) {
        PlatformView platformView = this.platformViews.get(i);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void initializePlatformViewIfNeeded(int i) {
        PlatformView platformView = this.platformViews.get(i);
        if (platformView == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.platformViewParent.get(i) == null) {
            if (platformView.getView() == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (platformView.getView().getParent() == null) {
                Context context2 = this.context;
                FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context2, context2.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
                flutterMutatorView.setOnDescendantFocusChangeListener(new CustomPlatformViewsController$$b(this, i));
                this.platformViewParent.put(i, flutterMutatorView);
                flutterMutatorView.addView(platformView.getView());
                this.flutterView.addView(flutterMutatorView);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void onAttachedToJNI() {
    }

    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    public void onDetachedFromJNI() {
        flushAllViews();
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        if (this.overlayLayerViews.get(i) != null) {
            initializeRootImageViewIfNeeded();
            FlutterImageView flutterImageView = this.overlayLayerViews.get(i);
            if (flutterImageView.getParent() == null) {
                this.flutterView.addView(flutterImageView);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i3;
            flutterImageView.setLayoutParams(layoutParams);
            flutterImageView.setVisibility(0);
            flutterImageView.bringToFront();
            this.currentFrameUsedOverlayLayerIds.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
        initializePlatformViewIfNeeded(i);
        FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i);
        flutterMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view = this.platformViews.get(i).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.currentFrameUsedPlatformViewIds.add(Integer.valueOf(i));
    }

    public void onEndFrame() {
        boolean z = false;
        if (!this.flutterViewConvertedToImageView || !this.currentFrameUsedPlatformViewIds.isEmpty()) {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z = true;
            }
            finishFrame(z);
            return;
        }
        this.flutterViewConvertedToImageView = false;
        this.flutterView.revertImageView(new CustomPlatformViewsController$$a(this));
    }

    public void onPreEngineRestart() {
        flushAllViews();
    }

    public MotionEvent toMotionEvent(float f, PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
        PlatformViewsChannel.PlatformViewTouch platformViewTouch2 = platformViewTouch;
        MotionEvent pop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch2.motionEventId));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch2.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch2.pointerCount]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch2.rawPointerCoords, f).toArray(new MotionEvent.PointerCoords[platformViewTouch2.pointerCount]);
        if (pop != null) {
            return MotionEvent.obtain(pop.getDownTime(), pop.getEventTime(), pop.getAction(), platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, pop.getMetaState(), pop.getButtonState(), pop.getXPrecision(), pop.getYPrecision(), pop.getDeviceId(), pop.getEdgeFlags(), pop.getSource(), pop.getFlags());
        }
        return MotionEvent.obtain(platformViewTouch2.downTime.longValue(), platformViewTouch2.eventTime.longValue(), platformViewTouch2.action, platformViewTouch2.pointerCount, pointerPropertiesArr, pointerCoordsArr, platformViewTouch2.metaState, platformViewTouch2.buttonState, platformViewTouch2.xPrecision, platformViewTouch2.yPrecision, platformViewTouch2.deviceId, platformViewTouch2.edgeFlags, platformViewTouch2.source, platformViewTouch2.flags);
    }

    public int toPhysicalPixels(double d) {
        return (int) Math.round(d * ((double) getDisplayDensity()));
    }

    public FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new FlutterImageView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), FlutterImageView.SurfaceKind.overlay));
    }
}
