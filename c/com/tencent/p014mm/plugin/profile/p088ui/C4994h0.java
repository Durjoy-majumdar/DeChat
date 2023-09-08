package com.tencent.p014mm.plugin.profile.p088ui;

import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.profile.ui.h0 */
public class C4994h0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ String[] f20289a;

    /* renamed from: b */
    public final /* synthetic */ ContactSocialInfoUI f20290b;

    public C4994h0(ContactSocialInfoUI contactSocialInfoUI, String[] strArr) {
        this.f20290b = contactSocialInfoUI;
        this.f20289a = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r7 = r6.f20290b;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo782j(int r7) {
        /*
            r6 = this;
            r0 = 32
            r1 = 1
            if (r7 == 0) goto L_0x012e
            r2 = 0
            if (r7 == r1) goto L_0x00fb
            r0 = 2
            if (r7 == r0) goto L_0x0010
            r1 = 3
            if (r7 == r1) goto L_0x00ca
            goto L_0x0151
        L_0x0010:
            java.lang.String[] r7 = r6.f20289a
            if (r7 == 0) goto L_0x00fa
            int r7 = r7.length
            if (r7 <= r0) goto L_0x00fa
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            hg0.a r1 = r7.f20189f
            if (r1 == 0) goto L_0x00fa
            com.tencent.mm.storage.z1 r7 = r7.f20188e
            if (r7 != 0) goto L_0x0023
            goto L_0x00fa
        L_0x0023:
            java.lang.String r7 = r1.f223128p
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00ca
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            com.tencent.mm.storage.z1 r0 = r7.f20188e
            java.lang.String r0 = r0.getUsername()
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r1 = r6.f20290b
            hg0.a r1 = r1.f20189f
            java.lang.String r1 = r1.f223128p
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r4 = 2131824290(0x7f110ea2, float:1.9281404E38)
            if (r3 != 0) goto L_0x00b5
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x0049
            goto L_0x00b5
        L_0x0049:
            java.lang.Class<ln.g> r3 = p196ln.C76706g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.g r3 = (p196ln.C76706g) r3
            ln.k r3 = r3.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r3 = (com.tencent.p014mm.modelavatar.AvatarStorage) r3
            android.graphics.Bitmap r3 = r3.mo93562k(r0)
            if (r3 == 0) goto L_0x0090
            boolean r0 = r7.mo5908J7(r1, r3)
            if (r0 == 0) goto L_0x007b
            androidx.appcompat.app.AppCompatActivity r0 = r7.getContext()
            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
            r1 = 2131824292(0x7f110ea4, float:1.9281408E38)
            java.lang.String r7 = r7.getString(r1)
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r7, (int) r2)
            r7.show()
            goto L_0x0151
        L_0x007b:
            androidx.appcompat.app.AppCompatActivity r0 = r7.getContext()
            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
            java.lang.String r7 = r7.getString(r4)
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r7, (int) r2)
            r7.show()
            goto L_0x0151
        L_0x0090:
            androidx.appcompat.app.AppCompatActivity r3 = r7.getContext()
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()
            r5 = 2131824291(0x7f110ea3, float:1.9281406E38)
            java.lang.String r4 = r4.getString(r5)
            android.widget.Toast r2 = p910lj.C76701a.makeText((android.content.Context) r3, (java.lang.CharSequence) r4, (int) r2)
            r2.show()
            com.tencent.mm.modelavatar.j r2 = new com.tencent.mm.modelavatar.j
            r2.<init>()
            com.tencent.mm.plugin.profile.ui.i0 r3 = new com.tencent.mm.plugin.profile.ui.i0
            r3.<init>(r7, r2, r0, r1)
            r2.mo86279b(r0, r3)
            goto L_0x0151
        L_0x00b5:
            androidx.appcompat.app.AppCompatActivity r0 = r7.getContext()
            androidx.appcompat.app.AppCompatActivity r7 = r7.getContext()
            java.lang.String r7 = r7.getString(r4)
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r7, (int) r2)
            r7.show()
            goto L_0x0151
        L_0x00ca:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "fromScene"
            r1.putInt(r2, r0)
            java.lang.String r0 = "reportArgs"
            r7.putExtra(r0, r1)
            java.lang.Class<om.f> r1 = p214om.C11502f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            om.f r1 = (p214om.C11502f) r1
            wc3.z r1 = r1.mo11462yM()
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r2 = r6.f20290b
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.getClass()
            android.os.Bundle r7 = r7.getBundleExtra(r0)
            de3.C7303e0.m7456a(r2, r7)
            goto L_0x0151
        L_0x00fa:
            return
        L_0x00fb:
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            java.lang.String r7 = r7.f20190g
            if (r7 == 0) goto L_0x012d
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0108
            goto L_0x012d
        L_0x0108:
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            java.lang.String r7 = r7.f20190g
            int r7 = r7.lastIndexOf(r0)
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r0 = r6.f20290b
            java.lang.String r0 = r0.f20190g
            java.lang.String r7 = r0.substring(r2, r7)
            if (r7 == 0) goto L_0x012d
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0121
            goto L_0x012d
        L_0x0121:
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r0 = r6.f20290b
            com.tencent.mm.storage.z1 r0 = r0.f20188e
            java.lang.String r7 = r7.trim()
            eb0.C45628s0.m50781j0(r0, r7)
            goto L_0x0151
        L_0x012d:
            return
        L_0x012e:
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            java.lang.String r7 = r7.f20190g
            if (r7 == 0) goto L_0x0151
            int r7 = r7.length()
            if (r7 != 0) goto L_0x013b
            goto L_0x0151
        L_0x013b:
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r7 = r6.f20290b
            java.lang.String r7 = r7.f20190g
            int r7 = r7.lastIndexOf(r0)
            int r7 = r7 + r1
            if (r7 <= 0) goto L_0x0151
            com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI r0 = r6.f20290b
            java.lang.String r1 = r0.f20190g
            java.lang.String r7 = r1.substring(r7)
            r0.mo5906H7(r7)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.C4994h0.mo782j(int):void");
    }
}
