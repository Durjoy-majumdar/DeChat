package p172io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import p172io.flutter.embedding.engine.renderer.SwapRenderSurface;

/* renamed from: io.flutter.embedding.android.SwapSurfaceViewRenderSurface */
public class SwapSurfaceViewRenderSurface extends SurfaceView implements SwapRenderSurface, SurfaceHolder.Callback {
    private SwapSurfaceController controller;
    private Runnable nextSurfaceUpdateCallback = null;
    private boolean surfaceAvailable = true;

    public SwapSurfaceViewRenderSurface(Context context) {
        super(context);
    }

    private void invokeNextSurfaceUpdate() {
        if (this.nextSurfaceUpdateCallback != null) {
            Choreographer.getInstance().postFrameCallback(new SwapSurfaceViewRenderSurface$$a(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeNextSurfaceUpdate$0(long j) {
        Runnable runnable = this.nextSurfaceUpdateCallback;
        if (runnable != null) {
            runnable.run();
            this.nextSurfaceUpdateCallback = null;
        }
    }

    public void attachToFlutterView(FlutterView flutterView) {
        this.controller = new SwapSurfaceController(flutterView, this);
        flutterView.addView(this, new ViewGroup.LayoutParams(1, 1));
        setZOrderOnTop(false);
        getHolder().addCallback(this);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f || !this.surfaceAvailable) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public void onNextSurfaceUpdate(Runnable runnable) {
        this.nextSurfaceUpdateCallback = runnable;
        if (this.surfaceAvailable) {
            invokeNextSurfaceUpdate();
        }
    }

    public void resumeSurface() {
        this.controller.resumeSurface();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.controller.surfaceSizeChanged(i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.surfaceAvailable = true;
        this.controller.surfaceAvailable(surfaceHolder.getSurface());
        invokeNextSurfaceUpdate();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.surfaceAvailable = false;
        this.controller.surfaceDestroyed();
    }

    public void swapSurface() {
        this.controller.swapSurface();
    }

    public SwapSurfaceViewRenderSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwapSurfaceViewRenderSurface(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
