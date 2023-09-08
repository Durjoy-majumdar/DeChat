package com.tencent.p014mm.p136ui.chatting;

import android.view.View;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$b */
public final /* synthetic */ class AppAttachNewDownloadUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56048d;

    public /* synthetic */ AppAttachNewDownloadUI$$b(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56048d = appAttachNewDownloadUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r0 = r21
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI r7 = r0.f56048d
            int r1 = com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI.f55984e1
            r7.getClass()
            java.lang.Class<zo.h> r8 = p407zo.C23547h.class
            java.lang.Class<wm.f> r9 = p262wm.C22923f.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r22
            r1.add(r2)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            di3.d r1 = di3.C86312j.m106911c(r8)
            r10 = r1
            zo.h r10 = (p407zo.C23547h) r10
            int r1 = r7.hashCode()
            java.lang.String r11 = java.lang.Integer.toString(r1)
            java.lang.String r12 = r7.f55987C
            java.lang.String r1 = r7.f55985A
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            r14 = 12
            java.lang.String r16 = r7.mo26126S7()
            zo.h$a r17 = r7.mo25335P6()
            r10.mo36799xH(r11, r12, r13, r14, r16, r17)
            android.widget.Button r1 = r7.f56028h
            r2 = 0
            r1.setEnabled(r2)
            android.widget.Button r1 = r7.f56029i
            r1.setEnabled(r2)
            com.tencent.mm.pluginsdk.model.app.d r1 = r7.mo26124P7()
            java.lang.String r2 = "MicroMsg.AppAttachNewDownloadUI"
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "getFilePath fail, info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x007c
        L_0x0067:
            java.lang.String r3 = r1.field_fileFullPath
            if (r3 == 0) goto L_0x0077
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            java.lang.String r1 = r1.field_fileFullPath
            r7.f56046z = r1
            goto L_0x007e
        L_0x0077:
            java.lang.String r1 = "getFilePath fail, field fileFullPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x007c:
            java.lang.String r1 = ""
        L_0x007e:
            r12 = r1
            boolean r1 = sf0.C77702q0.m93719b(r12)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = r7.f56045y0
            di3.d r2 = di3.C86312j.m106911c(r9)
            wm.f r2 = (p262wm.C22923f) r2
            java.lang.String r2 = r2.mo35904Ro()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x009f
            java.lang.String r1 = r7.f56045y0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00f3
        L_0x009f:
            di3.d r1 = di3.C86312j.m106911c(r8)
            r13 = r1
            zo.h r13 = (p407zo.C23547h) r13
            int r1 = r7.hashCode()
            java.lang.String r14 = java.lang.Integer.toString(r1)
            java.lang.String r15 = r7.f55987C
            java.lang.String r1 = r7.f55985A
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            r17 = 8
            java.lang.String r19 = r7.mo26126S7()
            zo.h$a r20 = r7.mo25335P6()
            r13.mo36799xH(r14, r15, r16, r17, r19, r20)
            di3.d r1 = di3.C86312j.m106911c(r9)
            r10 = r1
            wm.f r10 = (p262wm.C22923f) r10
            com.tencent.mm.ui.MMActivity r11 = r7.getContext()
            java.lang.String r13 = r7.f55985A
            java.lang.String r14 = r7.f55987C
            int r1 = r7.hashCode()
            java.lang.String r15 = java.lang.Integer.toString(r1)
            di3.d r1 = di3.C86312j.m106911c(r9)
            wm.f r1 = (p262wm.C22923f) r1
            java.lang.String r1 = r7.f55985A
            java.lang.String r17 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r1)
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$c r1 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$c
            r1.<init>(r7)
            java.lang.String r16 = "FROM_SCENE_OPEN_NO_OFFICE_FILE"
            r18 = r1
            r10.Q40(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0141
        L_0x00f3:
            java.lang.String r1 = r7.f56045y0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0141
            java.lang.String r1 = r7.f56003R0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0141
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$g r1 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$g
            r1.<init>(r7)
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$h r2 = new com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$h
            r2.<init>(r7)
            qo3.q r3 = new qo3.q
            com.tencent.mm.ui.MMActivity r4 = r7.getContext()
            r3.<init>(r4)
            com.tencent.mm.ui.MMActivity r4 = r7.getContext()
            r5 = 2131831851(0x7f112c2b, float:1.929674E38)
            java.lang.String r4 = r4.getString(r5)
            r3.mo107595g(r4)
            r4 = 1
            r3.mo107589a(r4)
            r4 = 2131820936(0x7f110188, float:1.92746E38)
            r3.mo107601m(r4)
            com.tencent.mm.ui.chatting.r r4 = new com.tencent.mm.ui.chatting.r
            r4.<init>(r7, r1)
            r3.mo107600l(r4)
            com.tencent.mm.ui.chatting.q r1 = new com.tencent.mm.ui.chatting.q
            r1.<init>(r7, r2)
            r3.mo107597i(r1)
            r3.mo107603o()
        L_0x0141:
            java.lang.String r1 = "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r7, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI$$b.onClick(android.view.View):void");
    }
}
