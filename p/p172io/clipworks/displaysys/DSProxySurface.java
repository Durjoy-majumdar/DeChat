package p172io.clipworks.displaysys;

import android.content.res.Resources;
import android.view.Surface;

/* renamed from: io.clipworks.displaysys.DSProxySurface */
public class DSProxySurface extends DSViewProxy {
    private int format;
    private int height;
    private Surface surface;
    private int width;

    public DSProxySurface(Surface surface2) {
        updateSurface(surface2);
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public float getScaleFactor() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int getVisibility() {
        return 0;
    }

    public int getWidth() {
        return this.width;
    }

    public float getX() {
        return 0.0f;
    }

    public float getY() {
        return 0.0f;
    }

    public void notifySurfaceChanged(int i, int i2, int i3) {
        this.format = i;
        this.width = i2;
        this.height = i3;
        super.notifySurfaceChanged(i, i2, i3);
    }

    public void updateSurface(Surface surface2) {
        this.surface = surface2;
        if (surface2 != null) {
            this.width = SurfaceUtils.querySurfaceWidth(surface2);
            this.height = SurfaceUtils.querySurfaceHeight(surface2);
            this.format = SurfaceUtils.querySurfaceFormat(surface2);
            return;
        }
        this.width = 0;
        this.height = 0;
        this.format = 0;
    }
}
