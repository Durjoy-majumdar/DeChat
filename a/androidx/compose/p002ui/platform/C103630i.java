package androidx.compose.p002ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import gy3.C87412m;
import java.util.List;

/* renamed from: androidx.compose.ui.platform.i */
public final class C103630i {

    /* renamed from: a */
    public static final C103630i f306083a = new C103630i();

    /* renamed from: a */
    public final void mo144731a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        C87412m.m108594g(accessibilityNodeInfo, "node");
        C87412m.m108594g(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
