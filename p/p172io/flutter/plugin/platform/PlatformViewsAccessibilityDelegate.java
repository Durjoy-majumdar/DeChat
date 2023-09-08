package p172io.flutter.plugin.platform;

import android.view.View;
import p172io.flutter.view.AccessibilityBridge;

/* renamed from: io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge);

    void detachAccessibilityBridge();

    View getPlatformViewById(int i);
}
