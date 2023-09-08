package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;

public class DisplayInfoManager {
    private static final Object INSTANCE_LOCK = new Object();
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    private static volatile DisplayInfoManager sInstance;
    private final DisplayManager mDisplayManager;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();
    private volatile Size mPreviewSize = null;

    private DisplayInfoManager(Context context) {
        this.mDisplayManager = (DisplayManager) context.getSystemService("display");
    }

    private Size calculatePreviewSize() {
        Point point = new Point();
        getMaxSizeDisplay().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int width = size.getWidth() * size.getHeight();
        Size size2 = MAX_PREVIEW_SIZE;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(size);
    }

    public static DisplayInfoManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                if (sInstance == null) {
                    sInstance = new DisplayInfoManager(context);
                }
            }
        }
        return sInstance;
    }

    public static void releaseInstance() {
        sInstance = null;
    }

    public Display getMaxSizeDisplay() {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
