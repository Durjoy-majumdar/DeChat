package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.g0 */
public class C93187g0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiMineUI f268743d;

    public C93187g0(EmojiMineUI emojiMineUI) {
        this.f268743d = emojiMineUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (r4 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        r12 = new java.util.ArrayList();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r0.hasNext() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        r1 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        if (r1.field_type != 3) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        r12.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r12.size() > 1) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        nj3.C76879j.m92738i(r11.f268743d.getContext(), com.tencent.p014mm.C0966R.string.c4q, com.tencent.p014mm.C0966R.string.a3h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ab, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b4, code lost:
        if (com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b6, code lost:
        r12 = r11.f268743d;
        r1 = com.tencent.p014mm.plugin.emoji.p040ui.EmojiMineUI.f268499u;
        nj3.C76879j.m92754y(r12, r12.getString(com.tencent.p014mm.C0966R.string.f360371c80), "", r12.getString(com.tencent.p014mm.C0966R.string.c7z), new com.tencent.p014mm.plugin.emoji.p040ui.C93189h0(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        r12 = new android.content.Intent();
        r12.setClass(r11.f268743d, com.tencent.p014mm.plugin.emoji.p040ui.EmojiSortUI.class);
        r1 = r11.f268743d;
        r2 = new k20.C9556a();
        r2.mo10233c(r12);
        r3 = r1;
        j20.C117292a.m165358d(r3, r2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r1.startActivity((android.content.Intent) r2.mo10231a(0));
        j20.C117292a.m165359e(r3, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r4 == null) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            r11 = this;
            java.lang.Class<aq.g> r12 = p441aq.C92054g.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            aq.g r12 = (p441aq.C92054g) r12
            r12.getClass()
            com.tencent.mm.storage.w2 r12 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r12 = r12.mo57715b()
            r12.getClass()
            java.lang.String r0 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "select * from EmojiGroupInfo where  (type=?  and status=?) or (type=? and flag=?)  order by sort ASC,idx ASC,lastUseTime DESC"
            java.lang.String r3 = "2"
            java.lang.String r4 = "7"
            java.lang.String r5 = "1"
            java.lang.String r6 = "0"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r12.f301702d     // Catch:{ Exception -> 0x0058 }
            r5 = 2
            android.database.Cursor r4 = r12.rawQuery(r2, r3, r5)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r12 = "getNewMineGroupList : ==========="
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r12)     // Catch:{ Exception -> 0x0058 }
            if (r4 == 0) goto L_0x0052
            boolean r12 = r4.moveToFirst()     // Catch:{ Exception -> 0x0058 }
            if (r12 == 0) goto L_0x0052
        L_0x0041:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r12 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch:{ Exception -> 0x0058 }
            r12.<init>()     // Catch:{ Exception -> 0x0058 }
            r12.convertFrom(r4)     // Catch:{ Exception -> 0x0058 }
            r1.add(r12)     // Catch:{ Exception -> 0x0058 }
            boolean r12 = r4.moveToNext()     // Catch:{ Exception -> 0x0058 }
            if (r12 != 0) goto L_0x0041
        L_0x0052:
            if (r4 == 0) goto L_0x0076
            goto L_0x0073
        L_0x0055:
            r12 = move-exception
            goto L_0x011b
        L_0x0058:
            r12 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r2.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "get Panel EmojiGroupInfo."
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0055 }
            r2.append(r12)     // Catch:{ all -> 0x0055 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0055 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x0076
        L_0x0073:
            r4.close()
        L_0x0076:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x007f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r0.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r1 = (com.tencent.p014mm.storage.emotion.EmojiGroupInfo) r1
            int r2 = r1.field_type
            r3 = 3
            if (r2 != r3) goto L_0x0091
            goto L_0x007f
        L_0x0091:
            r12.add(r1)
            goto L_0x007f
        L_0x0095:
            int r12 = r12.size()
            r0 = 1
            if (r12 > r0) goto L_0x00ac
            com.tencent.mm.plugin.emoji.ui.EmojiMineUI r12 = r11.f268743d
            androidx.appcompat.app.AppCompatActivity r12 = r12.getContext()
            r1 = 2131824860(0x7f1110dc, float:1.928256E38)
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r12, r1, r2)
            return r0
        L_0x00ac:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r12)
            if (r12 != 0) goto L_0x00d3
            com.tencent.mm.plugin.emoji.ui.EmojiMineUI r12 = r11.f268743d
            int r1 = com.tencent.p014mm.plugin.emoji.p040ui.EmojiMineUI.f268499u
            r1 = 2131824996(0x7f111164, float:1.9282836E38)
            java.lang.String r1 = r12.getString(r1)
            r2 = 2131824995(0x7f111163, float:1.9282834E38)
            java.lang.String r2 = r12.getString(r2)
            com.tencent.mm.plugin.emoji.ui.h0 r3 = new com.tencent.mm.plugin.emoji.ui.h0
            r3.<init>(r12)
            java.lang.String r4 = ""
            nj3.C76879j.m92754y(r12, r1, r4, r2, r3)
            return r0
        L_0x00d3:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            com.tencent.mm.plugin.emoji.ui.EmojiMineUI r1 = r11.f268743d
            java.lang.Class<com.tencent.mm.plugin.emoji.ui.EmojiSortUI> r2 = com.tencent.p014mm.plugin.emoji.p040ui.EmojiSortUI.class
            r12.setClass(r1, r2)
            com.tencent.mm.plugin.emoji.ui.EmojiMineUI r1 = r11.f268743d
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r12)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3"
            java.lang.String r6 = "onMenuItemClick"
            java.lang.String r7 = "(Landroid/view/MenuItem;)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = 0
            java.lang.Object r12 = r2.mo10231a(r12)
            android.content.Intent r12 = (android.content.Intent) r12
            r1.startActivity(r12)
            java.lang.String r4 = "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3"
            java.lang.String r5 = "onMenuItemClick"
            java.lang.String r6 = "(Landroid/view/MenuItem;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x011b:
            if (r4 == 0) goto L_0x0120
            r4.close()
        L_0x0120:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.C93187g0.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
