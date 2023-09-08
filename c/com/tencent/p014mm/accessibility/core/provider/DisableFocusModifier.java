package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableFocusModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "needDisFocus", "needDisFocusByCondition", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier */
public final class DisableFocusModifier extends Provider {
    public static final int $stable = 0;
    public static final DisableFocusModifier INSTANCE;
    public static final String TAG = "MicroMsg.Acc.DisableFocusModifier";

    static {
        DisableFocusModifier disableFocusModifier = new DisableFocusModifier();
        INSTANCE = disableFocusModifier;
        disableFocusModifier.addRootIdMapper$plugin_autoaccessibility_release(C1045831.INSTANCE);
    }

    private DisableFocusModifier() {
    }

    private final boolean needDisFocus(View view) {
        return getConfig(view, new DisableFocusModifier$needDisFocus$needDisFocus$1(view));
    }

    private final boolean needDisFocusByCondition(View view) {
        return getConfig(view, new DisableFocusModifier$needDisFocusByCondition$needDisFocus$1(view));
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        if (needDisFocus(view)) {
            logMsg(TAG, view, "default disable success");
            view.setImportantForAccessibility(2);
        } else if (needDisFocusByCondition(view)) {
            logMsg(TAG, view, "disable by condition success ");
            MapExpandKt.disable(accessibilityNodeInfo);
        }
    }

    public int getAuthority() {
        return AccUtil.INSTANCE.isAccessibilityEnabled() ? 1 : 0;
    }
}
