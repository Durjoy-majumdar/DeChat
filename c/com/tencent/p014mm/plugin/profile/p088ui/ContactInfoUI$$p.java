package com.tencent.p014mm.plugin.profile.p088ui;

import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$p */
public class ContactInfoUI$$p implements Runnable {

    /* renamed from: d */
    public WeakReference<ContactInfoUI> f202558d;

    /* renamed from: e */
    public String f202559e;

    public ContactInfoUI$$p(ContactInfoUI contactInfoUI, String str) {
        this.f202558d = new WeakReference<>(contactInfoUI);
        this.f202559e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        r1 = (android.widget.TextView) r1.findViewById(16908310);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.ref.WeakReference<com.tencent.mm.plugin.profile.ui.ContactInfoUI> r0 = r6.f202558d
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = (com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r6.f202559e
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.ContactInfoUI"
            java.lang.String r5 = "onNotifyChange contact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            if (r0 == 0) goto L_0x00e4
            boolean r2 = r0.isFinishing()
            if (r2 != 0) goto L_0x00e4
            boolean r2 = r0.isDestroyed()
            if (r2 == 0) goto L_0x0028
            goto L_0x00e4
        L_0x0028:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r5 = r0.f202533h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2[r4] = r5
            com.tencent.mm.storage.z1 r4 = r0.f202536n
            java.lang.String r4 = r4.getUsername()
            r2[r1] = r4
            r1 = 2
            java.lang.String r4 = r6.f202559e
            r2[r1] = r4
            java.lang.String r1 = "onNotifyChange verify:%b, contact.user:%s, notify.user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00e4
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = r6.f202559e
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0074
            com.tencent.mm.storage.z1 r1 = r0.f202536n
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = r6.f202559e
            java.lang.String r2 = com.tencent.p014mm.storage.C72996z1.m85829Z5(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e4
        L_0x0074:
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r2 = r6.f202559e
            com.tencent.mm.storage.z1 r1 = r1.get(r2)
            r0.f202536n = r1
            ad3.a r1 = r0.f202530e
            if (r1 == 0) goto L_0x00c7
            r1.onDetach()
            com.tencent.mm.accessibility.uitl.AccUtil r1 = com.tencent.p014mm.accessibility.uitl.AccUtil.INSTANCE
            boolean r1 = r1.isAccessibilityEnabled()
            if (r1 == 0) goto L_0x00c2
            android.view.Window r1 = r0.getWindow()
            android.view.View r1 = r1.getDecorView()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI$$a r2 = new com.tencent.mm.plugin.profile.ui.ContactInfoUI$$a
            r2.<init>()
            android.view.View r1 = r0.mo96579I7(r1, r2)
            if (r1 == 0) goto L_0x00be
            r2 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x00be
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            goto L_0x00c0
        L_0x00be:
            java.lang.String r1 = ""
        L_0x00c0:
            r0.f202524J = r1
        L_0x00c2:
            pj3.g r1 = r0.f202529d
            r1.removeAll()
        L_0x00c7:
            r0.initView()
            com.tencent.mm.accessibility.uitl.AccUtil r1 = com.tencent.p014mm.accessibility.uitl.AccUtil.INSTANCE
            boolean r1 = r1.isAccessibilityEnabled()
            if (r1 == 0) goto L_0x00e4
            android.view.Window r1 = r0.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = r0.f202524J
            com.tencent.mm.plugin.profile.ui.c0 r3 = new com.tencent.mm.plugin.profile.ui.c0
            r3.<init>(r0, r1, r2)
            r1.post(r3)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI$$p.run():void");
    }
}
