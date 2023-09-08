package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableChildModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "root", "Lkotlin/Function1;", "Lrx3/b0;", "visitor", "visitChild", "view", "callback", "needDisFocusChild", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "dealOnViewInflateAsync", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier */
public final class DisableChildModifier extends Provider {
    public static final int $stable = 0;
    public static final DisableChildModifier INSTANCE;
    public static final String TAG = "MicroMsg.Acc.DisableChildModifier";

    static {
        DisableChildModifier disableChildModifier = new DisableChildModifier();
        INSTANCE = disableChildModifier;
        disableChildModifier.addRootIdMapper$plugin_autoaccessibility_release(C1045811.INSTANCE);
    }

    private DisableChildModifier() {
    }

    private final void needDisFocusChild(View view, C32226l<? super View, C13598b0> lVar) {
        getConfig(view, new DisableChildModifier$needDisFocusChild$1(view, lVar));
    }

    /* access modifiers changed from: private */
    public final void visitChild(View view, C32226l<? super View, C13598b0> lVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "child");
                lVar.invoke(childAt);
                visitChild(childAt, lVar);
            }
        }
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
        if (tagData != null ? C87412m.m108589b(tagData.getDisableFocusFlag(), Boolean.TRUE) : false) {
            accessibilityNodeInfo.setVisibleToUser(false);
            view.setImportantForAccessibility(4);
        }
    }

    public void dealOnViewInflateAsync(View view) {
        C87412m.m108594g(view, "view");
        needDisFocusChild(view, new DisableChildModifier$dealOnViewInflateAsync$1(view));
    }

    public int getAuthority() {
        return AccUtil.INSTANCE.isAccessibilityEnabled() | true ? 1 : 0;
    }
}
