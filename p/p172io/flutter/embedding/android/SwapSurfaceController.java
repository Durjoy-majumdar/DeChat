package p172io.flutter.embedding.android;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.RenderSurface;
import p172io.flutter.embedding.engine.renderer.SwapRenderSurface;

/* renamed from: io.flutter.embedding.android.SwapSurfaceController */
public class SwapSurfaceController {
    private static final String TAG = "SwapSurfaceController";
    private boolean firstTimeSwap = false;
    private FlutterView flutterView;
    private boolean isInSwapSurface = false;
    private boolean isResumingSurface = false;
    private Surface surface;
    private boolean surfaceAvailable = false;
    private SwapRenderSurface swapSurface;
    private View swapView;
    private boolean swappingSurface = false;

    public SwapSurfaceController(FlutterView flutterView2, SwapRenderSurface swapRenderSurface) {
        this.flutterView = flutterView2;
        this.swapSurface = swapRenderSurface;
        this.swapView = (View) swapRenderSurface;
        this.firstTimeSwap = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeSurface$2() {
        Log.m165288i(TAG, "resumeSurface on onRenderSurfaceNextUpdate, isResumingSurface:" + this.isResumingSurface);
        if (this.isResumingSurface) {
            makeSmallSize();
        }
        this.isResumingSurface = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeSurface$3(RenderSurface renderSurface) {
        Log.m165288i(TAG, "resumeSurface onNextFrameDisplayed");
        renderSurface.onRenderSurfaceNextUpdate(new SwapSurfaceController$$a(this));
        renderSurface.markSurfaceIsSwapOut(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$swapSurfaceAfterReachFullScreenSize$0() {
        Log.m165288i(TAG, "swapSurface onNextSurfaceUpdate, hide current renderSurface");
        this.flutterView.toggleHideCurrentRenderSurface(true);
        this.swapView.bringToFront();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$swapSurfaceAfterReachFullScreenSize$1() {
        this.swapSurface.onNextSurfaceUpdate(new SwapSurfaceController$$b(this));
        Log.m165288i(TAG, "swapSurface onNextFrameDisplayed, markSurfaceIsSwapOut");
        RenderSurface renderSurface = this.flutterView.renderSurface;
        if (renderSurface != null) {
            renderSurface.markSurfaceIsSwapOut(true);
        }
    }

    private void makeFullScreen() {
        Log.m165288i(TAG, "makeFullScreen");
        ViewGroup.LayoutParams layoutParams = this.swapView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.swapView.setLayoutParams(layoutParams);
    }

    private void makeSmallSize() {
        Log.m165288i(TAG, "makeSmallSize");
        ViewGroup.LayoutParams layoutParams = this.swapView.getLayoutParams();
        layoutParams.width = 1;
        layoutParams.height = 1;
        this.swapView.setLayoutParams(layoutParams);
    }

    private void swapSurfaceAfterReachFullScreenSize() {
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 != null && flutterView2.getAttachedRenderer() != null) {
            FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
            attachedRenderer.swapSurface(this.surface);
            attachedRenderer.onNextFrameDisplayed(new SwapSurfaceController$$d(this));
            attachedRenderer.requestDrawLastFrame();
            this.swappingSurface = false;
            this.isInSwapSurface = true;
            this.isResumingSurface = false;
        }
    }

    public void resumeSurface() {
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 != null && flutterView2.getAttachedRenderer() != null && this.flutterView.renderSurface != null) {
            Log.m165288i(TAG, "resumeSurface");
            this.isResumingSurface = true;
            FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
            RenderSurface renderSurface = this.flutterView.renderSurface;
            if (renderSurface != null && renderSurface.isAvailableForRendering()) {
                Log.m165288i(TAG, "show current renderSurface");
                attachedRenderer.onNextFrameDisplayed(new SwapSurfaceController$$c(this, renderSurface));
                attachedRenderer.swapSurface(renderSurface.getRenderSurface());
                attachedRenderer.requestDrawLastFrame();
                this.flutterView.toggleHideCurrentRenderSurface(false);
                this.isInSwapSurface = false;
            }
        }
    }

    public void surfaceAvailable(Surface surface2) {
        Log.m165288i(TAG, "surfaceCreated, swappingSurface:" + this.swappingSurface + ", isInSwapSurface: " + this.isInSwapSurface);
        this.surface = surface2;
        this.surfaceAvailable = true;
        if (this.swappingSurface) {
            makeFullScreen();
        } else if (this.isInSwapSurface) {
            FlutterView flutterView2 = this.flutterView;
            if (!(flutterView2 == null || flutterView2.getAttachedRenderer() == null)) {
                this.flutterView.getAttachedRenderer().startRenderingToSurface(surface2, false);
            }
            this.isInSwapSurface = true;
        }
    }

    public void surfaceDestroyed() {
        FlutterView flutterView2;
        Log.m165288i(TAG, "surfaceDestroyed, isInSwapSurface:" + this.isInSwapSurface);
        this.surfaceAvailable = false;
        if (this.isInSwapSurface && (flutterView2 = this.flutterView) != null && flutterView2.getAttachedRenderer() != null) {
            Log.m165288i(TAG, "stopRenderingToSurface");
            this.flutterView.getAttachedRenderer().stopRenderingToSurface(this.surface);
            this.flutterView.getAttachedRenderer().clearNextFrameDisplayedListener();
        }
    }

    public void surfaceSizeChanged(int i, int i2) {
        boolean z = true;
        if (i <= 1 || i2 <= 1) {
            z = false;
        }
        Log.m165288i(TAG, "surfaceSizeChanged: " + i + " , " + i2 + ", swappingSurface: " + this.swappingSurface + ", isFullScreenSize:" + z);
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 != null && flutterView2.getAttachedRenderer() != null) {
            FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
            if (this.swappingSurface && z) {
                swapSurfaceAfterReachFullScreenSize();
            } else if (this.isInSwapSurface) {
                attachedRenderer.surfaceChanged(i, i2);
            }
        }
    }

    public void swapSurface() {
        Log.m165288i(TAG, "swapSurface, surfaceAvailable:" + this.surfaceAvailable);
        this.swappingSurface = true;
        if (this.surfaceAvailable) {
            makeFullScreen();
        } else {
            Log.m165292w(TAG, "swapSurface not is not available!");
        }
    }
}
