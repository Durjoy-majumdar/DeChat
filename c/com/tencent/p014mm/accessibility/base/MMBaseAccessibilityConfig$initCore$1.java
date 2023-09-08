package com.tencent.p014mm.accessibility.base;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "it", "Lrx3/b0;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$initCore$1 */
public final class MMBaseAccessibilityConfig$initCore$1<E> implements IMvvmObserver {
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    public MMBaseAccessibilityConfig$initCore$1(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        this.this$0 = mMBaseAccessibilityConfig;
    }

    public final void onChanged(Boolean bool) {
        C87412m.m108594g(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            this.this$0.checkInit();
        }
    }
}
