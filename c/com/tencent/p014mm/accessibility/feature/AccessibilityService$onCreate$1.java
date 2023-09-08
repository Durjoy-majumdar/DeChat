package com.tencent.p014mm.accessibility.feature;

import kotlin.Metadata;
import p1108f3.C107451b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "it", "Lrx3/b0;", "onTouchExplorationStateChanged", "(Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.feature.AccessibilityService$onCreate$1 */
public final class AccessibilityService$onCreate$1 implements C107451b {
    public final /* synthetic */ AccessibilityService this$0;

    public AccessibilityService$onCreate$1(AccessibilityService accessibilityService) {
        this.this$0 = accessibilityService;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        this.this$0.setIsTouchExplorationEnable(z);
    }
}
