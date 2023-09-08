package com.tencent.p014mm.plugin.emoji.p040ui;

import android.widget.AdapterView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$b */
public class EmojiStoreDetailUI$$b implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268643d;

    public EmojiStoreDetailUI$$b(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268643d = emojiStoreDetailUI;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            r0.add(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.add(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$10"
            java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r3 = "onItemClick"
            java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            android.widget.Adapter r8 = r8.getAdapter()
            java.lang.Object r8 = r8.getItem(r10)
            boolean r9 = r8 instanceof com.tencent.p014mm.storage.emotion.EmojiInfo
            if (r9 == 0) goto L_0x00c0
            com.tencent.mm.storage.emotion.EmojiInfo r8 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r8
            com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI r9 = r7.f268643d
            java.lang.String r10 = r9.f268597e
            r8.field_groupId = r10
            r10 = 0
            java.lang.String r12 = r9.f268594c1
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0065
            java.lang.String r12 = r9.f268594c1     // Catch:{ NumberFormatException -> 0x0054 }
            long r10 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x0054 }
            goto L_0x0065
        L_0x0054:
            r12 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r2[r1] = r3
            java.lang.String r3 = "MicroMsg.emoji.EmojiStoreDetailUI"
            java.lang.String r4 = "searchId string cast to Long error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r12, r4, r2)
        L_0x0065:
            androidx.appcompat.app.AppCompatActivity r12 = r9.getContext()
            java.lang.String r9 = r9.f268603h
            r2 = 8
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r12, r3)
            r61.h r3 = new r61.h
            r3.<init>(r12, r8, r1)
            r3.f296925x = r2
            r3.f296923v = r10
            r3.f296922u = r1
            r10 = 26
            r3.f296924w = r10
            r3.f296921t = r9
            r9 = 0
            r3.f296919r = r9
            r3.f296920s = r9
            qo3.e0 r9 = r3.f296911g
            r9.mo140655A()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 12787(0x31f3, float:1.7918E-41)
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r1] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            r0 = 2
            java.lang.String r1 = r8.field_md5
            r12[r0] = r1
            r0 = 3
            com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI r1 = r7.f268643d
            java.lang.String r1 = r1.f268594c1
            r12[r0] = r1
            r0 = 4
            java.lang.String r1 = r8.field_designerID
            r12[r0] = r1
            r0 = 5
            java.lang.String r8 = r8.field_groupId
            r12[r0] = r8
            r8 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r8] = r10
            r9.mo160131h(r11, r12)
        L_0x00c0:
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$10"
            java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r10 = "onItemClick"
            java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            j20.C117292a.m165361g(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI$$b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
