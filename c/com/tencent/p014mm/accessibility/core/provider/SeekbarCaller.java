package com.tencent.p014mm.accessibility.core.provider;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/SeekbarCaller;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "", "action", "", "isScrollAction", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "host", "Landroid/os/Bundle;", "args", "dealOnAction", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.SeekbarCaller */
public final class SeekbarCaller extends Provider {
    public static final int $stable = 0;
    public static final SeekbarCaller INSTANCE = new SeekbarCaller();

    private SeekbarCaller() {
    }

    private final boolean isScrollAction(int i) {
        return i == 8192 || i == 4096;
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
        if (C87412m.m108589b(tagData != null ? tagData.getViewType() : null, SeekBar.class.getName())) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        }
    }

    public void dealOnAction(View view, int i, Bundle bundle) {
        C13604l lVar;
        C32226l lVar2;
        C13604l lVar3;
        C32226l lVar4;
        C87412m.m108594g(view, "host");
        ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
        if (C87412m.m108589b(tagData != null ? tagData.getViewType() : null, SeekBar.class.getName()) && isScrollAction(i)) {
            C8479f0 f0Var = new C8479f0();
            getConfig(view, new SeekbarCaller$dealOnAction$1(view, f0Var));
            if (!(i != 8192 || (lVar3 = (C13604l) f0Var.f27484d) == null || (lVar4 = (C32226l) lVar3.f38556e) == null)) {
                lVar4.invoke(view);
            }
            if (i == 4096 && (lVar = (C13604l) f0Var.f27484d) != null && (lVar2 = (C32226l) lVar.f38555d) != null) {
                lVar2.invoke(view);
            }
        }
    }

    public int getAuthority() {
        return 9;
    }
}
