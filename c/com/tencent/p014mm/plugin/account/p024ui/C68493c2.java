package com.tencent.p014mm.plugin.account.p024ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI;
import f40.C86709a0;
import hg0.C76170j0;
import nj3.C76879j;
import ob0.C11385n;

/* renamed from: com.tencent.mm.plugin.account.ui.c2 */
public class C68493c2 implements MobileVerifyUI.C68466n, C11385n {

    /* renamed from: d */
    public MobileVerifyUI f196756d;

    /* renamed from: e */
    public String f196757e = null;

    /* renamed from: f */
    public String f196758f = "";

    /* renamed from: g */
    public int f196759g = 2;

    /* renamed from: a */
    public boolean mo94016a(MobileVerifyUI.C68465m mVar) {
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            GetSafeDeviceNameEvent getSafeDeviceNameEvent = new GetSafeDeviceNameEvent();
            getSafeDeviceNameEvent.f193657d.f193659a = this.f196756d;
            getSafeDeviceNameEvent.publish();
            String str = getSafeDeviceNameEvent.f193658e.f193660a;
            GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new GetSafeDeviceTypeEvent();
            getSafeDeviceTypeEvent.publish();
            String str2 = getSafeDeviceTypeEvent.f78827d.f78828a;
            C86709a0.m107524d().mo123455a(132, this);
            MobileVerifyUI mobileVerifyUI = this.f196756d;
            C76170j0 j0Var = new C76170j0(mobileVerifyUI.f196691p, 2, mobileVerifyUI.f196683e.getText().toString().trim(), 0, "", str, str2);
            C86709a0.m107524d().mo123460f(j0Var);
            MobileVerifyUI mobileVerifyUI2 = this.f196756d;
            mobileVerifyUI2.f196684f = C76879j.m92723Q(mobileVerifyUI2, mobileVerifyUI2.getString(C0966R.string.a3h), this.f196756d.getString(C0966R.string.al4), true, true, new C68492b2(this, j0Var));
            return false;
        } else if (ordinal == 2) {
            C86709a0.m107524d().mo123455a(132, this);
            C86709a0.m107524d().mo123460f(new C76170j0(this.f196756d.f196691p, 1, "", 0, "", ""));
            return false;
        } else if (ordinal != 3) {
            return false;
        } else {
            GetSafeDeviceNameEvent getSafeDeviceNameEvent2 = new GetSafeDeviceNameEvent();
            getSafeDeviceNameEvent2.f193657d.f193659a = this.f196756d;
            getSafeDeviceNameEvent2.publish();
            String str3 = getSafeDeviceNameEvent2.f193658e.f193660a;
            GetSafeDeviceTypeEvent getSafeDeviceTypeEvent2 = new GetSafeDeviceTypeEvent();
            getSafeDeviceTypeEvent2.publish();
            String str4 = getSafeDeviceTypeEvent2.f78827d.f78828a;
            C86709a0.m107524d().mo123455a(132, this);
            MobileVerifyUI mobileVerifyUI3 = this.f196756d;
            C76170j0 j0Var2 = new C76170j0(mobileVerifyUI3.f196691p, 2, mobileVerifyUI3.f196683e.getText().toString().trim(), 0, "", str3, str4);
            C86709a0.m107524d().mo123460f(j0Var2);
            MobileVerifyUI mobileVerifyUI4 = this.f196756d;
            mobileVerifyUI4.f196684f = C76879j.m92723Q(mobileVerifyUI4, mobileVerifyUI4.getString(C0966R.string.a3h), this.f196756d.getString(C0966R.string.al4), true, true, new C68491a2(this, j0Var2));
            return false;
        }
    }

    /* renamed from: b */
    public void mo94017b(MobileVerifyUI mobileVerifyUI) {
        this.f196756d = mobileVerifyUI;
        this.f196757e = mobileVerifyUI.getIntent().getStringExtra("regsetinfo_ticket");
        this.f196758f = mobileVerifyUI.getIntent().getStringExtra("regsetinfo_NextStep");
        this.f196759g = mobileVerifyUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0096, code lost:
        if (r6 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        if (r6 == null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r20, int r21, java.lang.String r22, ob0.C117747y r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onSceneEnd: errType = "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " errCode = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " errMsg = "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.MobileVerifyQQRegLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r5 = r1.f196756d
            android.app.ProgressDialog r5 = r5.f196684f
            r6 = 0
            if (r5 == 0) goto L_0x003e
            r5.dismiss()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r5 = r1.f196756d
            r5.f196684f = r6
        L_0x003e:
            int r5 = r23.getType()
            r7 = 2
            r8 = 132(0x84, float:1.85E-43)
            r9 = 1
            r10 = 0
            if (r5 != r8) goto L_0x0192
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r3.mo123470p(r8, r1)
            r3 = r23
            hg0.j0 r3 = (hg0.C76170j0) r3
            int r3 = r3.mo106407f()
            if (r3 != r7) goto L_0x0191
            if (r0 != 0) goto L_0x0191
            if (r2 != 0) goto L_0x0191
            f40.C86718e.m107546E()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r1.f196756d
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            android.content.ContentResolver r11 = r0.getContentResolver()
            java.lang.Class<aw.d> r3 = p447aw.C103918d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            aw.d r3 = (p447aw.C103918d) r3
            java.lang.String r5 = "android.permission.READ_CONTACTS"
            boolean r0 = r3.Un0(r0, r5, r10)
            java.lang.String r3 = "MicroMsg.AddressBookUtil"
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x00d1
        L_0x0084:
            android.net.Uri r12 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x00b9 }
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r6 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00b9 }
            if (r6 != 0) goto L_0x009c
            java.lang.String r0 = "getPhonesCursor: cursor is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x00b9 }
            if (r6 == 0) goto L_0x00d1
        L_0x0098:
            r6.close()
            goto L_0x00d1
        L_0x009c:
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0098
        L_0x00a2:
            java.lang.String r0 = "data1"
            int r0 = r6.getColumnIndex(r0)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x00b9 }
            r2.add(r0)     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00a2
            goto L_0x00d0
        L_0x00b6:
            r0 = move-exception
            goto L_0x018b
        L_0x00b9:
            r0 = move-exception
            java.lang.String r5 = "exception in getMobileList, [%s]"
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x00b6 }
            r7[r10] = r8     // Catch:{ all -> 0x00b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r7)     // Catch:{ all -> 0x00b6 }
            java.lang.String r5 = ""
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x00b6 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r7)     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x00d1
        L_0x00d0:
            goto L_0x0098
        L_0x00d1:
            int r0 = r2.size()
            if (r0 == 0) goto L_0x00d9
            r0 = 1
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            java.lang.String r2 = r1.f196758f
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 == 0) goto L_0x0135
            java.lang.String r5 = "1"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0135
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "R300_300_QQ"
            wg0.C78595a.m94985e(r0)
            android.content.Intent r0 = new android.content.Intent
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r1.f196756d
            java.lang.Class<com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI> r5 = com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactAddUI.class
            r0.<init>(r2, r5)
            r0.addFlags(r3)
            java.lang.String r2 = r1.f196757e
            java.lang.String r5 = "regsetinfo_ticket"
            r0.putExtra(r5, r2)
            java.lang.String r2 = r1.f196758f
            java.lang.String r5 = "regsetinfo_NextStep"
            r0.putExtra(r5, r2)
            int r2 = r1.f196759g
            java.lang.String r5 = "regsetinfo_NextStyle"
            r0.putExtra(r5, r2)
            java.lang.String r2 = "login_type"
            r0.putExtra(r2, r9)
            di3.d r2 = di3.C86312j.m106911c(r4)
            om.f r2 = (p214om.C11502f) r2
            wc3.z r2 = r2.mo11462yM()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r1.f196756d
            com.tencent.mm.app.r1 r2 = (com.tencent.p014mm.app.C67654r1) r2
            android.content.Intent r2 = r2.mo93169b(r4)
            r2.addFlags(r3)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r1.f196756d
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r3, r0, r2)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r1.f196756d
            r0.finish()
            goto L_0x018a
        L_0x0135:
            di3.d r0 = di3.C86312j.m106911c(r4)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r1.f196756d
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r2)
            r0.addFlags(r3)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r1.f196756d
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/account/ui/MobileVerifyQQRegLogic"
            java.lang.String r14 = "onSceneEnd"
            java.lang.String r15 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r3.mo10231a(r10)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/account/ui/MobileVerifyQQRegLogic"
            java.lang.String r13 = "onSceneEnd"
            java.lang.String r14 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r1.f196756d
            r2 = 4
            r0.f196700y = r2
            r0.finish()
        L_0x018a:
            return
        L_0x018b:
            if (r6 == 0) goto L_0x0190
            r6.close()
        L_0x0190:
            throw r0
        L_0x0191:
            return
        L_0x0192:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r1.f196756d
            boolean r3 = r4.mo93999J7(r0, r2, r3)
            if (r3 == 0) goto L_0x019b
            return
        L_0x019b:
            if (r0 != 0) goto L_0x019f
            if (r2 == 0) goto L_0x01bd
        L_0x019f:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r1.f196756d
            r4 = 2131822533(0x7f1107c5, float:1.927784E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r5[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r5[r9] = r0
            java.lang.String r0 = r3.getString(r4, r5)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r3, (java.lang.CharSequence) r0, (int) r10)
            r0.show()
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C68493c2.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void start() {
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(132, this);
    }
}
