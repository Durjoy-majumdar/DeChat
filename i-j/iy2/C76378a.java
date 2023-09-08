package iy2;

import android.app.Activity;
import android.os.Build;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: iy2.a */
public class C76378a {
    /* renamed from: a */
    public static Pair<Integer, Integer> m91808a(Activity activity) {
        WindowInsets rootWindowInsets;
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        if (activity != null && MMHandlerThread.isMainThread()) {
            try {
                int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation != 2) {
                        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets()) == null || rootWindowInsets.getDisplayCutout() == null) {
                            int o = C85875k4.m106198o(activity);
                            Log.m105925i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from statusbar %d %d", Integer.valueOf(o), Integer.valueOf(rotation));
                            return rotation == 1 ? new Pair<>(Integer.valueOf(o), 0) : new Pair<>(0, Integer.valueOf(o));
                        }
                        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                        Log.m105925i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from insets %d %d", Integer.valueOf(displayCutout.getSafeInsetLeft()), Integer.valueOf(displayCutout.getSafeInsetRight()));
                        return new Pair<>(Integer.valueOf(displayCutout.getSafeInsetLeft()), Integer.valueOf(displayCutout.getSafeInsetRight()));
                    }
                }
                return pair;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.TaskBarUIUtils", "getSafeInsetsFailed", e);
            }
        }
        return pair;
    }
}
