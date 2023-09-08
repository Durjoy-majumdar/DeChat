package p172io.clipworks.displaysys;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: io.clipworks.displaysys.DSRenderView */
public class DSRenderView extends SurfaceView implements SurfaceHolder.Callback {
    private Proxy proxy;

    /* renamed from: io.clipworks.displaysys.DSRenderView$Proxy */
    public class Proxy extends DSViewProxy {
        public Proxy() {
        }

        public int getHeight() {
            return DSRenderView.this.getHeight();
        }

        public float getScaleFactor() {
            return DSRenderView.this.getResources().getDisplayMetrics().density;
        }

        public int getVisibility() {
            return DSRenderView.this.getVisibility();
        }

        public int getWidth() {
            return DSRenderView.this.getWidth();
        }

        public float getX() {
            return DSRenderView.this.getX();
        }

        public float getY() {
            return DSRenderView.this.getY();
        }
    }

    public DSRenderView(Context context) {
        this(context, (AttributeSet) null, 0, 0);
    }

    public DSViewProxy getDSViewProxy() {
        return this.proxy;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.proxy.notifyOnDidAttachToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.proxy.notifyOnDidDetachFromWindow();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.proxy.notifyOnSizeDidChange(i, i2, i3, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return this.proxy.notifyOnTouchEvent(motionEvent);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.proxy.notifyOnVisibilityDidChange(z);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.proxy.notifySurfaceChanged(i, i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.proxy.notifySurfaceCreated(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.proxy.notifySurfaceDidDestroy();
    }

    public void teardown() {
    }

    public DSRenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DSRenderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DSRenderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.proxy = new Proxy();
        getHolder().addCallback(this);
    }
}
