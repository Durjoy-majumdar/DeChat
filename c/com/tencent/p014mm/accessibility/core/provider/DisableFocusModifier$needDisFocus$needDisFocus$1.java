package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier$needDisFocus$needDisFocus$1 */
public final class DisableFocusModifier$needDisFocus$needDisFocus$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisableFocusModifier$needDisFocus$needDisFocus$1(View view) {
        super(1);
        this.$view = view;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, "config");
        List list = mMBaseAccessibilityConfig.getDisFocusViewRootMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        if (list == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(this.$view, list) != null);
    }
}
