package e22;

import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: e22.z */
public class C75538z implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f221930d;

    public C75538z(ContactLabelUI contactLabelUI) {
        this.f221930d = contactLabelUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagRemove] tag:%s", str);
        MMLabelPanel mMLabelPanel = this.f221930d.f198661r;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101814r(str, false);
        }
        ContactLabelUI.m81393I7(this.f221930d, str);
    }

    /* renamed from: b */
    public void mo94791b(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagCreate] tag:%s", str + "");
        if (Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.Label.ContactLabelUI", "tag is null.");
            return;
        }
        this.f221930d.f198656j.mo95185d(str, true);
        MMLabelPanel mMLabelPanel = this.f221930d.f198661r;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101814r(str, true);
        }
        ContactLabelUI contactLabelUI = this.f221930d;
        contactLabelUI.mo95155L7(str, contactLabelUI.f198644E);
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagUnSelected] tag:%s", str);
        this.f221930d.f198656j.mo101812o(str);
        MMLabelPanel mMLabelPanel = this.f221930d.f198661r;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101814r(str, false);
        }
        ContactLabelUI.m81393I7(this.f221930d, str);
        if (this.f221930d.f198645F.contains(str)) {
            this.f221930d.f198645F.remove(str);
        }
    }

    /* renamed from: g */
    public void mo94794g() {
        Log.m105918d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextClick]");
    }

    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.util.ArrayList<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        if (r4 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94799h(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            java.lang.String r3 = "MicroMsg.Label.ContactLabelUI"
            java.lang.String r4 = "cpan[Input onTagEditTextChange] curText:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            com.tencent.mm.plugin.label.ui.ContactLabelUI r1 = r10.f221930d
            int r3 = com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI.f198639L
            r1.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r3 != 0) goto L_0x00f5
            com.tencent.mm.plugin.label.ui.ContactLabelUI$f r3 = com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI.C69089f.Search
            r1.mo95160Q7(r3)
            com.tencent.mm.plugin.label.ui.widget.MMLabelPanel r3 = r1.f198656j
            if (r3 == 0) goto L_0x00fa
            e22.t r1 = r1.f198664u
            java.util.ArrayList r3 = r3.getTagList()
            java.util.ArrayList<java.lang.String> r4 = r1.f221922f
            if (r4 == 0) goto L_0x0030
            r4.clear()
        L_0x0030:
            android.util.SparseArray<android.text.SpannableString> r4 = r1.f221923g
            if (r4 == 0) goto L_0x0037
            r4.clear()
        L_0x0037:
            java.lang.String r4 = ""
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r4)
            r1.f221921e = r4
            com.tencent.mm.storage.e2 r4 = a22.C27740g.vx0()
            r4.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r6 = "select labelName from ContactLabel where labelName like ? or labelPYFull like ? or labelPYShort like ?  order by createTime ASC "
            r5[r2] = r6
            java.lang.String r7 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r8 = "cpan[query] SQL:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r5)
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "%"
            r8.append(r9)
            r8.append(r11)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5[r2] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r11)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r5[r0] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r11)
            r8.append(r9)
            java.lang.String r11 = r8.toString()
            r8 = 2
            r5[r8] = r11
            r11 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.f212650d     // Catch:{ Exception -> 0x00d3, all -> 0x00d1 }
            android.database.Cursor r4 = r4.rawQuery(r6, r5, r8)     // Catch:{ Exception -> 0x00d3, all -> 0x00d1 }
            java.lang.String r5 = "labelName"
            int r5 = r4.getColumnIndex(r5)     // Catch:{ Exception -> 0x00cf }
            boolean r6 = r4.moveToFirst()     // Catch:{ Exception -> 0x00cf }
            if (r6 == 0) goto L_0x00e4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00cf }
            r6.<init>()     // Catch:{ Exception -> 0x00cf }
        L_0x00ad:
            java.lang.String r8 = r4.getString(r5)     // Catch:{ Exception -> 0x00cf }
            if (r3 == 0) goto L_0x00bf
            int r9 = r3.size()     // Catch:{ Exception -> 0x00cf }
            if (r9 <= 0) goto L_0x00bf
            boolean r9 = r3.contains(r8)     // Catch:{ Exception -> 0x00cf }
            if (r9 != 0) goto L_0x00c2
        L_0x00bf:
            r6.add(r8)     // Catch:{ Exception -> 0x00cf }
        L_0x00c2:
            boolean r8 = r4.moveToNext()     // Catch:{ Exception -> 0x00cf }
            if (r8 != 0) goto L_0x00ad
            r4.close()
            r11 = r6
            goto L_0x00e7
        L_0x00cd:
            r11 = move-exception
            goto L_0x00ed
        L_0x00cf:
            r3 = move-exception
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            goto L_0x00ef
        L_0x00d3:
            r3 = move-exception
            r4 = r11
        L_0x00d5:
            java.lang.String r5 = "cpan[query] exception %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00cd }
            r0[r2] = r3     // Catch:{ all -> 0x00cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r5, r0)     // Catch:{ all -> 0x00cd }
            if (r4 == 0) goto L_0x00e7
        L_0x00e4:
            r4.close()
        L_0x00e7:
            r1.f221922f = r11
            r1.notifyDataSetChanged()
            goto L_0x00fa
        L_0x00ed:
            r0 = r11
            r11 = r4
        L_0x00ef:
            if (r11 == 0) goto L_0x00f4
            r11.close()
        L_0x00f4:
            throw r0
        L_0x00f5:
            com.tencent.mm.plugin.label.ui.ContactLabelUI$f r11 = com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI.C69089f.Normal
            r1.mo95160Q7(r11)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e22.C75538z.mo94799h(java.lang.String):void");
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagSelected] tag:%s", str);
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
        Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagLengthMax] match:%s exceedCount:%d", z + "", Integer.valueOf(i));
        if (z) {
            this.f221930d.enableOptionMenu(false);
            this.f221930d.f198657n.setVisibility(8);
            return;
        }
        this.f221930d.enableOptionMenu(true);
        this.f221930d.f198657n.setVisibility(8);
    }
}
