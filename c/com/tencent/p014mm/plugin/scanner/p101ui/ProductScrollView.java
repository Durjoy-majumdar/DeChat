package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductScrollView */
public class ProductScrollView extends ScrollView {

    /* renamed from: d */
    public C94488a f273214d;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductScrollView$a */
    public interface C94488a {
    }

    public ProductScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r8 > 1.0f) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollChanged(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            super.onScrollChanged(r6, r7, r8, r9)
            com.tencent.mm.plugin.scanner.ui.ProductScrollView$a r6 = r5.f273214d
            if (r6 == 0) goto L_0x008f
            com.tencent.mm.plugin.scanner.ui.ProductUI$p$a r6 = (com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.C94504p.C94505a) r6
            com.tencent.mm.plugin.scanner.ui.ProductUI$p r6 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.C94504p.this
            com.tencent.mm.plugin.scanner.ui.ProductScrollView r7 = r6.f273270a
            int r7 = r7.getScrollY()
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 >= 0) goto L_0x0019
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0033
        L_0x0019:
            com.tencent.mm.plugin.scanner.ui.ProductUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.this
            int r0 = r0.f273247v
            int r1 = r6.f273271b
            int r1 = r0 - r1
            if (r7 >= r1) goto L_0x0031
            float r0 = (float) r0
            int r1 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            float r7 = (float) r7
            r1 = 1068457001(0x3faf5c29, float:1.37)
            float r7 = r7 * r1
            float r7 = r7 / r0
            goto L_0x0033
        L_0x0031:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0033:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rate="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ProductUI.HeaderEffectHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            boolean r0 = r6.f273272c
            if (r0 == 0) goto L_0x0053
            goto L_0x008f
        L_0x0053:
            r0 = 1
            r6.f273272c = r0
            goto L_0x005a
        L_0x0057:
            r0 = 0
            r6.f273272c = r0
        L_0x005a:
            com.tencent.mm.plugin.scanner.ui.ProductUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.this
            android.widget.LinearLayout r1 = r0.f273241p
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            if (r1 == 0) goto L_0x0074
            float r3 = r9 - r7
            float r3 = r3 - r2
            int r4 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x006b
            r3 = 0
        L_0x006b:
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0071
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0071:
            r0.mo129969R7(r1, r3)
        L_0x0074:
            com.tencent.mm.plugin.scanner.ui.ProductUI r6 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.this
            android.view.View r0 = r6.f273243r
            if (r0 == 0) goto L_0x008f
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            goto L_0x008c
        L_0x007f:
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            float r8 = r7 + r2
            int r7 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x008c
        L_0x008a:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x008c:
            r6.mo129969R7(r0, r8)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ProductScrollView.onScrollChanged(int, int, int, int):void");
    }

    public void setOnScrollListener(C94488a aVar) {
        this.f273214d = aVar;
    }

    public ProductScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
