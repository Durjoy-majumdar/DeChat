package com.tencent.p014mm.accessibility.base;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$onGlobalLayout$1 */
public final class MMBaseAccessibilityConfig$onGlobalLayout$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$onGlobalLayout$1(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        super(0);
        this.this$0 = mMBaseAccessibilityConfig;
    }

    public final void invoke() {
        if (!this.this$0.getHasFocusStartView$plugin_autoaccessibility_release()) {
            View startView$plugin_autoaccessibility_release = this.this$0.getStartView$plugin_autoaccessibility_release();
            if (startView$plugin_autoaccessibility_release != null) {
                startView$plugin_autoaccessibility_release.sendAccessibilityEvent(128);
                return;
            }
            return;
        }
        this.this$0.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.this$0);
    }
}
