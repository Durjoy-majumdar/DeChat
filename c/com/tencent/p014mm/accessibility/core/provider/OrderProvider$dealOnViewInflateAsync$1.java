package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.OrderProvider$dealOnViewInflateAsync$1 */
public final class OrderProvider$dealOnViewInflateAsync$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderProvider$dealOnViewInflateAsync$1(View view) {
        super(1);
        this.$view = view;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        boolean z;
        int[] iArr;
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        int[] iArr2 = mMBaseAccessibilityConfig.getGlobalTraversalMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        boolean z2 = true;
        if (iArr2 != null) {
            View view = this.$view;
            view.setAccessibilityTraversalBefore(iArr2[0]);
            view.setAccessibilityTraversalAfter(iArr2[1]);
            OrderProvider orderProvider = OrderProvider.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append("success set globalTraversal, before:");
            IdUtil idUtil = IdUtil.INSTANCE;
            sb.append(idUtil.getName(iArr2[0]));
            sb.append(" after:");
            sb.append(idUtil.getName(iArr2[1]));
            orderProvider.logMsg(OrderProvider.TAG, view, sb.toString());
            z = true;
        } else {
            z = false;
        }
        Map<Integer, Map<Integer, int[]>> localTraversalMap$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.getLocalTraversalMap$plugin_autoaccessibility_release();
        OrderProvider orderProvider2 = OrderProvider.INSTANCE;
        Map map = localTraversalMap$plugin_autoaccessibility_release.get(orderProvider2.getLayoutId(this.$view));
        if (map == null || (iArr = (int[]) map.get(Integer.valueOf(this.$view.getId()))) == null) {
            z2 = z;
        } else {
            View view2 = this.$view;
            view2.setAccessibilityTraversalBefore(iArr[0]);
            view2.setAccessibilityTraversalAfter(iArr[1]);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("success set localTraversal, before:");
            IdUtil idUtil2 = IdUtil.INSTANCE;
            sb4.append(idUtil2.getName(iArr[0]));
            sb4.append(" after:");
            sb4.append(idUtil2.getName(iArr[1]));
            orderProvider2.logMsg(OrderProvider.TAG, view2, sb4.toString());
        }
        return Boolean.valueOf(z2);
    }
}
