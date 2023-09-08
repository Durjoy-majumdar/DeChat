package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, mo182094d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "maximumWindowBounds", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C87412m.m108593f(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        C87412m.m108593f(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
