package com.tencent.p014mm.accessibility.base;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/Confirmable;", "", "Lrx3/b0;", "confirm$plugin_autoaccessibility_release", "()V", "confirm", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "originConfig", "<init>", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.Confirmable */
public abstract class Confirmable {
    public static final int $stable = 0;

    public Confirmable(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, "originConfig");
        mMBaseAccessibilityConfig.getConfirmableList$plugin_autoaccessibility_release().add(this);
    }

    public abstract void confirm$plugin_autoaccessibility_release();
}
