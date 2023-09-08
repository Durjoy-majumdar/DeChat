package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$needDisFocusChild$1 */
public final class DisableChildModifier$needDisFocusChild$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ C32226l<View, C13598b0> $callback;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisableChildModifier$needDisFocusChild$1(View view, C32226l<? super View, C13598b0> lVar) {
        super(1);
        this.$view = view;
        this.$callback = lVar;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        List list = mMBaseAccessibilityConfig.getDisableChildViewRootMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        if (list == null) {
            return Boolean.FALSE;
        }
        DisableChildModifier.INSTANCE.logMsg(DisableChildModifier.TAG, this.$view, "find rootIds, prepare findRoot");
        if (mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(this.$view, list) != null) {
            this.$callback.invoke(this.$view);
        }
        return Boolean.TRUE;
    }
}
