package zu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95738b1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import java.util.List;

/* renamed from: zu2.d */
public final class C103096d extends C96148b {

    /* renamed from: s */
    public final String f304203s = "MicroMsg.SnsUpload.DynamicGridPreviewImgV2View";

    public C103096d(View view, View view2, View view3, View view4, Context context, List<String> list, int i, DynamicGridView dynamicGridView, C95738b1.C95739a aVar, C96142a.C96144b bVar, boolean z) {
        super(view, view2, view3, view4, context, list, i, dynamicGridView, aVar, bVar, z);
    }

    /* renamed from: e */
    public boolean mo133766e() {
        SnsMethodCalculate.markStartTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        SnsMethodCalculate.markEndTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        return false;
    }

    /* renamed from: f */
    public int mo133767f() {
        SnsMethodCalculate.markStartTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        int TO = ((C94866e1.ay0().mo139868TO() - (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 4)) - (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.f3899i_) * 2)) / 3;
        int i = C94866e1.f274870Z;
        if (TO > i) {
            TO = i;
        }
        SnsMethodCalculate.markEndTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
        return TO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if ((r12 != null && r12.getVisibility() == 0) != false) goto L_0x00f2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133768g(int r12) {
        /*
            r11 = this;
            java.lang.String r0 = "setGridViewMargins"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r11.mo133767f()
            r11.f280888r = r2
            android.content.Context r3 = r11.f280877d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131167225(0x7f0707f9, float:1.7948718E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r4 = 2
            int r3 = r3 * 2
            int r2 = r2 + r3
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView r3 = r11.f280879f
            r3.setColumnWidth(r2)
            java.lang.String r3 = r11.f304203s
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "setGridViewMargins: picSize:"
            r5.append(r6)
            int r6 = r11.f280888r
            r5.append(r6)
            java.lang.String r6 = ", gridItemSize:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", imgCount:"
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.plugin.sns.ui.previewimageview.a r3 = r11.f280878e
            r3.getClass()
            java.lang.String r5 = "getShowLineCount"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            int r7 = r3.getColumnCount()
            int r8 = r3.getCount()
            int r3 = r3.mo133761k()
            int r8 = r8 - r3
            int r3 = r8 % r7
            int r8 = r8 / r7
            if (r3 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            int r8 = r8 + 1
        L_0x006e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            android.view.View r3 = r11.f280887q
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x007f
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x00c5
            android.view.View r3 = r11.f280887q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r3, r7)
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            android.content.Context r7 = r11.f280877d
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165346(0x7f0700a2, float:1.7944907E38)
            int r7 = r7.getDimensionPixelSize(r9)
            int r9 = 4 - r8
            int r7 = r7 * r9
            r3.topMargin = r7
            r9 = 3
            r10 = 2131314083(0x7f0945a3, float:1.824658E38)
            r3.addRule(r9, r10)
            java.lang.String r9 = r11.f304203s
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r5] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r4[r6] = r7
            java.lang.String r7 = "setGridViewMargins: bottomLineView setLayoutParams topMargin:%d, itemLineCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r4)
            android.view.View r4 = r11.f280887q
            r4.setLayoutParams(r3)
        L_0x00c5:
            java.lang.String r3 = "checkShouldShowImgTipsView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.content.SharedPreferences r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r9 = "key_show_tips"
            boolean r7 = r7.getBoolean(r9, r6)
            if (r7 == 0) goto L_0x00dd
            if (r12 <= r6) goto L_0x00dd
            r12 = 1
            goto L_0x00de
        L_0x00dd:
            r12 = 0
        L_0x00de:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r12 != 0) goto L_0x00f2
            android.view.View r12 = r11.f280885o
            if (r12 == 0) goto L_0x00ef
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x00ef
            r12 = 1
            goto L_0x00f0
        L_0x00ef:
            r12 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x012d
        L_0x00f2:
            int r2 = r2 * r8
            android.view.View r12 = r11.f280885o
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r3 = r12 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x0101
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            goto L_0x0102
        L_0x0101:
            r12 = 0
        L_0x0102:
            if (r12 == 0) goto L_0x012d
            r3 = 8
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView r4 = r11.f280879f
            int r4 = r4.getId()
            r12.addRule(r3, r4)
            int r3 = r12.leftMargin
            int r4 = r12.topMargin
            int r7 = r12.rightMargin
            r12.setMargins(r3, r4, r7, r2)
            android.view.View r3 = r11.f280885o
            r3.setLayoutParams(r12)
            java.lang.String r12 = r11.f304203s
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            java.lang.String r2 = "setGridViewMargins: tipsView setLayoutParams marginBottom:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r3)
        L_0x012d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu2.C103096d.mo133768g(int):void");
    }
}
