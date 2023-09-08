package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13604l;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.CheckableModifier$dealNodeInfo$1 */
public final class CheckableModifier$dealNodeInfo$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ AccessibilityNodeInfo $nodeInfo;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckableModifier$dealNodeInfo$1(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C32226l lVar;
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        Map map = mMBaseAccessibilityConfig.getViewRootCheckedMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        if (map == null) {
            return Boolean.FALSE;
        }
        View findRoot$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(this.$view, C110818d0.m150953y0(map.keySet()));
        C13604l lVar2 = (C13604l) map.get(findRoot$plugin_autoaccessibility_release != null ? Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()) : null);
        if (lVar2 == null) {
            lVar2 = (C13604l) map.get(CheckableModifier.INSTANCE.getLayoutId(this.$view));
        }
        boolean z = false;
        if (!(lVar2 == null || (lVar = (C32226l) lVar2.f38556e) == null || !((Boolean) lVar.invoke(this.$view)).booleanValue())) {
            z = true;
        }
        if (!z) {
            return Boolean.FALSE;
        }
        Object invoke = ((C32226l) lVar2.f38555d).invoke(this.$view);
        AccessibilityNodeInfo accessibilityNodeInfo = this.$nodeInfo;
        boolean booleanValue = ((Boolean) invoke).booleanValue();
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(booleanValue);
        CheckableModifier.handler.postDelayed(CheckableModifier.clearTask, 500);
        return Boolean.TRUE;
    }
}
