package ju2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: ju2.k */
public final class C9530k {

    /* renamed from: a */
    public static final C9530k f29712a = new C9530k();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r7 = r16.getText();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10206a(android.view.View r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, android.widget.TextView r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r10 = this;
            r0 = r11
            r1 = r21
            java.lang.String r2 = "concatFeedContentDesc"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            xi3.a r4 = xi3.C78844a.C15689b.f42385a
            r5 = 1
            boolean r4 = r4.mo108842h(r5)
            java.lang.String r6 = "MicroMsg.Improve.ItemAccessibilityHelper"
            if (r4 != 0) goto L_0x001e
            java.lang.String r0 = "concatFeedContentDesc: isAccessibilityEnable false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x001e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = r12
            r4.add(r12)
            r7 = r15
            r4.add(r15)
            if (r16 == 0) goto L_0x0038
            java.lang.CharSequence r7 = r16.getText()
            if (r7 == 0) goto L_0x0038
            java.lang.String r7 = r7.toString()
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            r4.add(r7)
            if (r17 == 0) goto L_0x004c
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131824456(0x7f110f48, float:1.928174E38)
            java.lang.String r7 = r7.getString(r8)
            r4.add(r7)
        L_0x004c:
            if (r1 != r5) goto L_0x005d
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131824454(0x7f110f46, float:1.9281736E38)
            java.lang.String r1 = r1.getString(r5)
            r4.add(r1)
            goto L_0x006d
        L_0x005d:
            if (r1 <= r5) goto L_0x006d
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131824455(0x7f110f47, float:1.9281738E38)
            java.lang.String r1 = r1.getString(r5)
            r4.add(r1)
        L_0x006d:
            r1 = r14
            r4.add(r14)
            r1 = r13
            r4.add(r13)
            r1 = r18
            r4.add(r1)
            r1 = r19
            r4.add(r1)
            r1 = r20
            r4.add(r1)
            java.util.List r1 = sx3.C110818d0.m150953y0(r4)
            java.lang.String r4 = "concatFeedContentItemList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "doConcatFeedContentItemDesc"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 != 0) goto L_0x00b9
            r5.append(r7)
            java.lang.String r7 = ","
            r5.append(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            goto L_0x0096
        L_0x00b9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            goto L_0x0096
        L_0x00bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "concatFeedContentDesc: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            r11.setContentDescription(r1)
        L_0x00e4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju2.C9530k.mo10206a(android.view.View, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.widget.TextView, boolean, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: b */
    public final String mo10207b(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
        if (i < 0 || i2 <= 0 || i >= i2) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.f7984yc);
            C87412m.m108593f(string, "getContext().getString(c…i.R.string.app_field_pic)");
            SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
            return string;
        }
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.nfy, new Object[]{String.valueOf(i + 1), String.valueOf(i2)});
        C87412m.m108593f(string2, "getContext().getString(R…otoTotalCount.toString())");
        SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveItemAccessibilityHelper");
        return string2;
    }
}
