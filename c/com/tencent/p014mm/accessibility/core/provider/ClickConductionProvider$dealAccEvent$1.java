package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ClickConductionProvider$dealAccEvent$1 */
public final class ClickConductionProvider$dealAccEvent$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickConductionProvider$dealAccEvent$1(View view) {
        super(1);
        this.$view = view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: rx3.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig r6) {
        /*
            r5 = this;
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r6, r0)
            java.util.Map r0 = r6.getClickViewRootTargetMap$plugin_autoaccessibility_release()
            android.view.View r1 = r5.$view
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x001e
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x001e:
            android.view.View r1 = r5.$view
            java.util.Set r2 = r0.keySet()
            java.util.List r2 = sx3.C110818d0.m150953y0(r2)
            android.view.View r6 = r6.findRoot$plugin_autoaccessibility_release(r1, r2)
            if (r6 != 0) goto L_0x0031
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0031:
            int r1 = r6.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            rx3.l r1 = (rx3.C13604l) r1
            if (r1 != 0) goto L_0x0053
            com.tencent.mm.accessibility.core.provider.ClickConductionProvider r1 = com.tencent.p014mm.accessibility.core.provider.ClickConductionProvider.INSTANCE
            java.lang.Integer r1 = r1.getLayoutId(r6)
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            rx3.l r1 = (rx3.C13604l) r1
            if (r1 != 0) goto L_0x0053
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0053:
            com.tencent.mm.accessibility.core.provider.ClickConductionProvider r0 = com.tencent.p014mm.accessibility.core.provider.ClickConductionProvider.INSTANCE
            android.view.View r2 = r5.$view
            java.lang.String r3 = "MicroMsg.Acc.ClickConductionProvider"
            java.lang.String r4 = "success Found data, perform Click"
            r0.logMsg(r3, r2, r4)
            B r0 = r1.f38556e
            fy3.l r0 = (fy3.C32226l) r0
            android.view.View r2 = r5.$view
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0085
            A r0 = r1.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.view.View r6 = r6.findViewById(r0)
            if (r6 == 0) goto L_0x0082
            r6.performClick()
            goto L_0x0085
        L_0x0082:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0085:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.provider.ClickConductionProvider$dealAccEvent$1.invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig):java.lang.Boolean");
    }
}
