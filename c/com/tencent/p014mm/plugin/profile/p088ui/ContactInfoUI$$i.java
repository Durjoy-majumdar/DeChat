package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.storage.C72996z1;
import de3.C45335p;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$i */
public class ContactInfoUI$$i implements C45335p {

    /* renamed from: a */
    public final /* synthetic */ ContactInfoUI f115327a;

    public ContactInfoUI$$i(ContactInfoUI contactInfoUI) {
        this.f115327a = contactInfoUI;
    }

    /* renamed from: a */
    public Object mo22792a(C53155r0 r0Var) {
        C72996z1 z1Var;
        int i = r0Var.f148313d;
        if ((i == 1 || i == 25 || i == 30 || i == 31) && (z1Var = this.f115327a.f202536n) != null) {
            return z1Var.getUsername();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo22793b(wd3.C53155r0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            int r1 = r12.f148313d
            r2 = 45
            if (r1 != r2) goto L_0x00b6
            java.lang.String r6 = new java.lang.String
            java.lang.String r1 = r12.f148312c
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r6.<init>(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r12 = r12.mo73845a(r1)
            java.lang.String r12 = (java.lang.String) r12
            c30.g r1 = new c30.g     // Catch:{ f -> 0x0049 }
            r1.<init>((java.lang.String) r12)     // Catch:{ f -> 0x0049 }
            java.lang.String r12 = "fullText"
            java.lang.String r12 = r1.optString(r12)     // Catch:{ f -> 0x0049 }
            java.lang.String r3 = "linkText"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ f -> 0x0046 }
            java.lang.String r4 = new java.lang.String     // Catch:{ f -> 0x0044 }
            java.lang.String r5 = "path"
            java.lang.String r1 = r1.optString(r5)     // Catch:{ f -> 0x0044 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ f -> 0x0044 }
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch:{ f -> 0x0044 }
            r4.<init>(r1)     // Catch:{ f -> 0x0044 }
            r9 = r4
            goto L_0x004d
        L_0x0044:
            goto L_0x004c
        L_0x0046:
            r3 = r0
            goto L_0x004c
        L_0x0049:
            r12 = r0
            r3 = r12
        L_0x004c:
            r9 = r0
        L_0x004d:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r1 = 1
            r0[r1] = r9
            java.lang.String r4 = "MicroMsg.ContactInfoUI"
            java.lang.String r5 = "appId:%s,path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r10.<init>()
            r0 = 1082(0x43a, float:1.516E-42)
            r10.f245533f = r0
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r11.f115327a
            com.tencent.mm.storage.z1 r0 = r0.f202536n
            if (r0 == 0) goto L_0x00a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r11.f115327a
            com.tencent.mm.storage.z1 r5 = r5.f202536n
            java.lang.String r5 = r5.getUsername()
            r0.append(r5)
            java.lang.String r5 = ":2:"
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = ":"
            r0.append(r12)
            r0.append(r3)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            r10.f245534g = r12
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r12
            java.lang.String r12 = "sceneNote = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r12, r0)
        L_0x00a1:
            java.lang.Class<kr0.x0> r12 = kr0.C76630x0.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            r3 = r12
            kr0.x0 r3 = (kr0.C76630x0) r3
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r12 = r11.f115327a
            androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
            r5 = 0
            r7 = 0
            r8 = 0
            r3.Ko0(r4, r5, r6, r7, r8, r9, r10)
        L_0x00b6:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI$$i.mo22793b(wd3.r0):java.lang.Object");
    }
}
