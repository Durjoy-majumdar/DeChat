package p172io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p172io.flutter.view.AccessibilityBridge;

/* renamed from: io.flutter.plugin.platform.AccessibilityEventsDelegate */
class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge2 = this.accessibilityBridge;
        if (accessibilityBridge2 == null) {
            return false;
        }
        return accessibilityBridge2.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    public void setAccessibilityBridge(AccessibilityBridge accessibilityBridge2) {
        this.accessibilityBridge = accessibilityBridge2;
    }
}
