package p172io.clipworks.displaysys;

import android.content.res.Resources;

/* renamed from: io.clipworks.displaysys.DSDisplaySys */
public class DSDisplaySys {
    public static float getMainScreenScaleFactor() {
        return Resources.getSystem().getDisplayMetrics().density;
    }
}
