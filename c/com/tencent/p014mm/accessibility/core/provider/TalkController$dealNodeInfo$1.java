package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.TalkController$dealNodeInfo$1 */
public final class TalkController$dealNodeInfo$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ AccessibilityNodeInfo $nodeInfo;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TalkController$dealNodeInfo$1(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.$view = view;
        this.$nodeInfo = accessibilityNodeInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: fy3.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig r6) {
        /*
            r5 = this;
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r6, r0)
            java.util.Map r0 = r6.getTalkMap$plugin_autoaccessibility_release()
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
            android.view.View r1 = r6.findRoot$plugin_autoaccessibility_release(r1, r2)
            if (r1 != 0) goto L_0x0031
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0031:
            int r2 = r1.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            fy3.l r2 = (fy3.C32226l) r2
            if (r2 != 0) goto L_0x0055
            com.tencent.mm.accessibility.core.provider.TalkController r2 = com.tencent.p014mm.accessibility.core.provider.TalkController.INSTANCE
            android.view.View r3 = r5.$view
            java.lang.Integer r2 = r2.getLayoutId(r3)
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            fy3.l r2 = (fy3.C32226l) r2
            if (r2 != 0) goto L_0x0055
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0055:
            android.view.View r0 = r5.$view
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.util.Map r2 = com.tencent.p014mm.accessibility.core.provider.TalkController.viewLastValueMap
            android.view.View r3 = r5.$view
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x007a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.put(r3, r4)
        L_0x007a:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r2 = r4.booleanValue()
            if (r0 == 0) goto L_0x00ef
            if (r0 != r2) goto L_0x008a
            boolean r2 = com.tencent.p014mm.accessibility.core.provider.TalkController.longTimeGo
            if (r2 == 0) goto L_0x00ef
        L_0x008a:
            java.util.Map r6 = r6.getTalkStringMap$plugin_autoaccessibility_release()
            android.view.View r2 = r5.$view
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x00b5
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x00b5
            int r6 = r1.intValue()
            goto L_0x00cf
        L_0x00b5:
            if (r6 == 0) goto L_0x00c6
            com.tencent.mm.accessibility.core.provider.TalkController r1 = com.tencent.p014mm.accessibility.core.provider.TalkController.INSTANCE
            android.view.View r2 = r5.$view
            java.lang.Integer r1 = r1.getLayoutId(r2)
            java.lang.Object r6 = r6.get(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            if (r6 == 0) goto L_0x00ce
            int r6 = r6.intValue()
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            com.tencent.mm.accessibility.core.provider.TalkController r1 = com.tencent.p014mm.accessibility.core.provider.TalkController.INSTANCE
            android.view.View r2 = r5.$view
            android.view.accessibility.AccessibilityNodeInfo r3 = r5.$nodeInfo
            boolean r6 = r1.talkString(r2, r6, r3)
            if (r6 != 0) goto L_0x00e2
            android.view.View r6 = r5.$view
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.$nodeInfo
            r1.talk(r6, r2)
        L_0x00e2:
            android.view.View r6 = r5.$view
            java.lang.String r2 = "MicroMsg.Acc.TalkController"
            java.lang.String r3 = "Talk Success"
            r1.logMsg(r2, r6, r3)
            r1.recordLongTimeGo()
            goto L_0x011e
        L_0x00ef:
            if (r0 == 0) goto L_0x011e
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.$nodeInfo
            java.lang.CharSequence r6 = r6.getContentDescription()
            if (r6 != 0) goto L_0x00ff
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.$nodeInfo
            java.lang.CharSequence r6 = r6.getText()
        L_0x00ff:
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = ""
        L_0x0103:
            java.lang.String r1 = com.tencent.p014mm.accessibility.core.provider.TalkController.lastTalkString
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 != 0) goto L_0x0112
            android.view.View r1 = r5.$view
            r1.announceForAccessibility(r6)
        L_0x0112:
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.accessibility.core.provider.TalkController.lastTalkString = r6
            com.tencent.mm.accessibility.core.provider.TalkController r6 = com.tencent.p014mm.accessibility.core.provider.TalkController.INSTANCE
            r6.recordLongTimeGo()
        L_0x011e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.util.Map r0 = com.tencent.p014mm.accessibility.core.provider.TalkController.viewLastValueMap
            android.view.View r1 = r5.$view
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.provider.TalkController$dealNodeInfo$1.invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig):java.lang.Boolean");
    }
}
