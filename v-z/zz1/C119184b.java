package zz1;

import a02.C112700b;
import com.tencent.p014mm.plugin.gwallet.GWalletUI;

/* renamed from: zz1.b */
public class C119184b implements C112700b.C112703c {

    /* renamed from: a */
    public final /* synthetic */ GWalletUI f356905a;

    public C119184b(GWalletUI gWalletUI) {
        this.f356905a = gWalletUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if ((r3 == 7) == false) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo164438a(a02.C112708e r3, android.content.Intent r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Purchase finished: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", purchase: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.GWalletUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            java.lang.String r0 = "com.tencent.mm.gwallet.ACTION_PAY_RESPONSE"
            if (r4 != 0) goto L_0x0031
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            int r0 = r3.mo164443a()
            java.lang.String r1 = "RESPONSE_CODE"
            r4.putExtra(r1, r0)
            goto L_0x0034
        L_0x0031:
            r4.setAction(r0)
        L_0x0034:
            com.tencent.mm.plugin.gwallet.GWalletUI r0 = r2.f356905a
            r0.sendBroadcast(r4)
            int r3 = r3.f337440a
            r4 = 1
            r0 = 0
            if (r3 != 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            r1 = 7
            if (r3 != r1) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r3 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0056
            com.tencent.mm.plugin.gwallet.GWalletUI r3 = r2.f356905a
            r4 = 0
            com.tencent.p014mm.plugin.gwallet.GWalletUI.m162309E7(r3, r0, r4)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zz1.C119184b.mo164438a(a02.e, android.content.Intent):void");
    }
}
