package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier$needDisFocusByCondition$needDisFocus$1 */
public final class DisableFocusModifier$needDisFocusByCondition$needDisFocus$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisableFocusModifier$needDisFocusByCondition$needDisFocus$1(View view) {
        super(1);
        this.$view = view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: fy3.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig r4) {
        /*
            r3 = this;
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r4, r0)
            java.util.Map r0 = r4.getDisFocusConditionViewRootMap$plugin_autoaccessibility_release()
            android.view.View r1 = r3.$view
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x001e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x001e:
            android.view.View r1 = r3.$view
            java.util.Set r2 = r0.keySet()
            java.util.List r2 = sx3.C110818d0.m150953y0(r2)
            android.view.View r4 = r4.findRoot$plugin_autoaccessibility_release(r1, r2)
            if (r4 != 0) goto L_0x0031
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0031:
            int r1 = r4.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            fy3.l r1 = (fy3.C32226l) r1
            if (r1 != 0) goto L_0x0053
            com.tencent.mm.accessibility.core.provider.DisableFocusModifier r1 = com.tencent.p014mm.accessibility.core.provider.DisableFocusModifier.INSTANCE
            java.lang.Integer r4 = r1.getLayoutId(r4)
            java.lang.Object r4 = r0.get(r4)
            r1 = r4
            fy3.l r1 = (fy3.C32226l) r1
            if (r1 != 0) goto L_0x0053
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0053:
            android.view.View r4 = r3.$view
            java.lang.Object r4 = r1.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.provider.DisableFocusModifier$needDisFocusByCondition$needDisFocus$1.invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig):java.lang.Boolean");
    }
}
