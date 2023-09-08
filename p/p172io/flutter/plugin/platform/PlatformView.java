package p172io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.PlatformView */
public interface PlatformView {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    @Deprecated
    void onInputConnectionLocked();

    @Deprecated
    void onInputConnectionUnlocked();
}
