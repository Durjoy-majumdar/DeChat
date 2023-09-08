package androidx.window.layout;

import android.view.DisplayCutout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, mo182094d2 = {"Landroidx/window/layout/DisplayCompatHelperApi28;", "", "()V", "safeInsetBottom", "", "displayCutout", "Landroid/view/DisplayCutout;", "safeInsetLeft", "safeInsetRight", "safeInsetTop", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        C87412m.m108594g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        C87412m.m108594g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        C87412m.m108594g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        C87412m.m108594g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
