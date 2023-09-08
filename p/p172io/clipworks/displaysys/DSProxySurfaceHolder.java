package p172io.clipworks.displaysys;

import android.content.res.Resources;
import android.view.SurfaceHolder;

/* renamed from: io.clipworks.displaysys.DSProxySurfaceHolder */
public class DSProxySurfaceHolder extends DSViewProxy implements SurfaceHolder.Callback {
    private final SurfaceHolder holder;

    public DSProxySurfaceHolder(SurfaceHolder surfaceHolder) {
        this.holder = surfaceHolder;
        surfaceHolder.addCallback(this);
    }

    public int getHeight() {
        SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().height();
        }
        return 0;
    }

    public float getScaleFactor() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.holder;
    }

    public int getVisibility() {
        return 0;
    }

    public int getWidth() {
        SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().width();
        }
        return 0;
    }

    public float getX() {
        SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return (float) surfaceHolder.getSurfaceFrame().left;
        }
        return 0.0f;
    }

    public float getY() {
        SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return (float) surfaceHolder.getSurfaceFrame().top;
        }
        return 0.0f;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        notifySurfaceChanged(i, i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        notifySurfaceCreated(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        notifySurfaceDidDestroy();
    }
}
