package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.PreFocusModifier$dealNodeInfo$1 */
public final class PreFocusModifier$dealNodeInfo$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ AccessibilityNodeInfo $nodeInfo;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreFocusModifier$dealNodeInfo$1(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        if (!mMBaseAccessibilityConfig.getViewRootCallbackMap$plugin_autoaccessibility_release().containsKey(Integer.valueOf(this.$view.getId())) && !mMBaseAccessibilityConfig.getViewRootDescMap$plugin_autoaccessibility_release().containsKey(Integer.valueOf(this.$view.getId())) && !mMBaseAccessibilityConfig.getTalkMap$plugin_autoaccessibility_release().containsKey(Integer.valueOf(this.$view.getId())) && !mMBaseAccessibilityConfig.getClickViewRootTargetMap$plugin_autoaccessibility_release().containsKey(Integer.valueOf(this.$view.getId()))) {
            Integer startViewId$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.getStartViewId$plugin_autoaccessibility_release();
            int id = this.$view.getId();
            if (startViewId$plugin_autoaccessibility_release == null || startViewId$plugin_autoaccessibility_release.intValue() != id) {
                return Boolean.FALSE;
            }
        }
        this.$nodeInfo.setFocusable(true);
        return Boolean.TRUE;
    }
}
