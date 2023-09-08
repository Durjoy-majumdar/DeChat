package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.expt.ui.k */
public class C41390k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptDebugUI f111435d;

    public C41390k(ExptDebugUI exptDebugUI) {
        this.f111435d = exptDebugUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/expt/ui/ExptDebugUI$7"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            ma1.a r8 = ma1.C117543a.Cx0()
            java.util.ArrayList r8 = r8.xx0()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154195C()
            r0.append(r1)
            java.lang.String r1 = "expt_export_"
            r0.append(r1)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.append(r1)
            java.lang.String r1 = ".txt"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x004d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
        L_0x004d:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106444e(r0)
            r2 = 0
            if (r1 == 0) goto L_0x009a
            r1 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r0, r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x005d:
            boolean r3 = r8.hasNext()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r8.next()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r4.<init>()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r4.append(r3)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.String r3 = "\r\n"
            r4.append(r3)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1.write(r3)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            goto L_0x005d
        L_0x0086:
            r1.flush()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x0089:
            r1.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009a
        L_0x008d:
            r8 = move-exception
            goto L_0x0091
        L_0x008f:
            goto L_0x0097
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            throw r8
        L_0x0097:
            if (r1 == 0) goto L_0x009a
            goto L_0x0089
        L_0x009a:
            com.tencent.mm.plugin.expt.ui.ExptDebugUI r8 = r7.f111435d
            android.widget.TextView r8 = r8.f111420e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Success export expt exptid : "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r8.setText(r1)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r1 = "expt_id"
            com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r8, r1, r0)     // Catch:{ Exception -> 0x00ea }
            com.tencent.mm.plugin.expt.ui.ExptDebugUI r8 = r7.f111435d     // Catch:{ Exception -> 0x00ea }
            androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()     // Catch:{ Exception -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ea }
            r1.<init>()     // Catch:{ Exception -> 0x00ea }
            com.tencent.mm.plugin.expt.ui.ExptDebugUI r3 = r7.f111435d     // Catch:{ Exception -> 0x00ea }
            androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()     // Catch:{ Exception -> 0x00ea }
            r4 = 2131821443(0x7f110383, float:1.927563E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x00ea }
            r1.append(r3)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch:{ Exception -> 0x00ea }
            r1.append(r0)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ea }
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r2)     // Catch:{ Exception -> 0x00ea }
            r8.show()     // Catch:{ Exception -> 0x00ea }
            goto L_0x00f9
        L_0x00ea:
            com.tencent.mm.plugin.expt.ui.ExptDebugUI r8 = r7.f111435d
            androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
            java.lang.String r0 = "copy failure"
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r2)
            r8.show()
        L_0x00f9:
            java.lang.String r8 = "com/tencent/mm/plugin/expt/ui/ExptDebugUI$7"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r7, r8, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.p472ui.C41390k.onClick(android.view.View):void");
    }
}
