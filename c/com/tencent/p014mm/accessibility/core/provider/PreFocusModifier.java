package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/PreFocusModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Lrx3/b0;", "dealOnViewInflateAsync", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.PreFocusModifier */
public final class PreFocusModifier extends Provider {
    public static final int $stable = 0;
    public static final PreFocusModifier INSTANCE;
    public static final String TAG = "MicroMsg.Acc.PreFocusModifier";

    static {
        PreFocusModifier preFocusModifier = new PreFocusModifier();
        INSTANCE = preFocusModifier;
        preFocusModifier.addRootIdMapper$plugin_autoaccessibility_release(C1045841.INSTANCE);
    }

    private PreFocusModifier() {
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        super.dealNodeInfo(view, accessibilityNodeInfo);
        getConfig(view, new PreFocusModifier$dealNodeInfo$1(view, accessibilityNodeInfo));
    }

    public void dealOnViewInflateAsync(View view) {
        C87412m.m108594g(view, "view");
        getConfig(view, new PreFocusModifier$dealOnViewInflateAsync$1(view));
    }

    public int getAuthority() {
        return 3;
    }
}
