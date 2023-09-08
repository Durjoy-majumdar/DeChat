package p913nk;

import android.content.Context;
import android.graphics.Point;

/* renamed from: nk.b */
public interface C76918b extends C76917a {
    Point getDisplayRealSize(Context context);

    float getSleepTimeInMsPerFrame();

    boolean isEnableNativeDynamicBackground();

    void loadDynamicBgLibrary();

    void setEnableNativeDynamicBackground(boolean z);
}
