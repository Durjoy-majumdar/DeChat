package br0;

import android.util.DisplayMetrics;
import br0.C39836d;
import br0.C79774c;

/* renamed from: br0.g */
public interface C79782g {
    C39836d createFullscreenHandler(C39836d.C39839b bVar);

    boolean forceLightMode();

    C79778e getOrientationHandler();

    float getScale();

    C79774c.C79777c getStatusBar();

    DisplayMetrics getVDisplayMetrics();

    boolean isLargeScreenWindow();

    void setSoftOrientation(String str);

    boolean shouldInLargeScreenCompatMode();
}
