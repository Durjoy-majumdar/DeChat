package p172io.clipworks.displaysys;

import android.view.MotionEvent;
import android.view.Surface;
import com.facebook.jni.HybridData;

/* renamed from: io.clipworks.displaysys.DSViewProxy */
public abstract class DSViewProxy {
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    private native void nativeOnDidAttachToWindow();

    private native void nativeOnDidDetachFromWindow();

    private native void nativeOnSizeDidChange(int i, int i2, int i3, int i4);

    private native void nativeOnSurfaceDidChange(int i, int i2, int i3);

    private native void nativeOnSurfaceDidCreate(Surface surface);

    private native void nativeOnSurfaceDidDestroy();

    private native void nativeOnTouchesBegin(int i, float f, float f2, long j);

    private native void nativeOnTouchesCancel(int[] iArr, float[] fArr, float[] fArr2, long j);

    private native void nativeOnTouchesEnd(int i, float f, float f2, long j);

    private native void nativeOnTouchesMove(int[] iArr, float[] fArr, float[] fArr2, long j);

    private native void nativeOnVisibilityDidChange(boolean z);

    public abstract int getHeight();

    public abstract float getScaleFactor();

    public abstract int getVisibility();

    public abstract int getWidth();

    public abstract float getX();

    public abstract float getY();

    public void notifyOnDidAttachToWindow() {
        nativeOnDidAttachToWindow();
    }

    public void notifyOnDidDetachFromWindow() {
        nativeOnDidDetachFromWindow();
    }

    public void notifyOnSizeDidChange(int i, int i2, int i3, int i4) {
        nativeOnSizeDidChange(i, i2, i3, i4);
    }

    public boolean notifyOnTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        long eventTime = motionEvent.getEventTime();
        int[] iArr = new int[pointerCount];
        float[] fArr = new float[pointerCount];
        float[] fArr2 = new float[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i);
            fArr2[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            nativeOnTouchesBegin(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 1) {
            nativeOnTouchesEnd(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 2) {
            nativeOnTouchesMove(iArr, fArr, fArr2, eventTime);
        } else if (action == 3) {
            nativeOnTouchesCancel(iArr, fArr, fArr2, eventTime);
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            nativeOnTouchesBegin(motionEvent.getPointerId(action2), motionEvent.getX(action2), motionEvent.getY(action2), eventTime);
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            nativeOnTouchesEnd(motionEvent.getPointerId(action3), motionEvent.getX(action3), motionEvent.getY(action3), eventTime);
        }
        return true;
    }

    public void notifyOnVisibilityDidChange(boolean z) {
        nativeOnVisibilityDidChange(z);
    }

    public void notifySurfaceChanged(int i, int i2, int i3) {
        nativeOnSurfaceDidChange(i, i2, i3);
    }

    public void notifySurfaceCreated(Surface surface) {
        nativeOnSurfaceDidCreate(surface);
    }

    public void notifySurfaceDidDestroy() {
        nativeOnSurfaceDidDestroy();
    }
}
