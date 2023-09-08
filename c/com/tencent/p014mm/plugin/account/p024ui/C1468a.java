package com.tencent.p014mm.plugin.account.p024ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;

/* renamed from: com.tencent.mm.plugin.account.ui.a */
public final class C1468a {

    /* renamed from: com.tencent.mm.plugin.account.ui.a$a */
    public class C1469a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f10806d;

        /* renamed from: e */
        public final /* synthetic */ Activity f10807e;

        public C1469a(Intent intent, Activity activity) {
            this.f10806d = intent;
            this.f10807e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f10806d != null) {
                this.f10807e.finish();
                Activity activity = this.f10807e;
                Intent intent = this.f10806d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111192a(this.f10807e, this.f10806d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.a$b */
    public class C1470b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f10808d;

        /* renamed from: e */
        public final /* synthetic */ Activity f10809e;

        public C1470b(Intent intent, Activity activity) {
            this.f10808d = intent;
            this.f10809e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f10808d != null) {
                this.f10809e.finish();
                Activity activity = this.f10809e;
                Intent intent = this.f10808d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111192a(this.f10809e, this.f10808d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.a$c */
    public class C1471c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f10810d;

        /* renamed from: e */
        public final /* synthetic */ Activity f10811e;

        public C1471c(Intent intent, Activity activity) {
            this.f10810d = intent;
            this.f10811e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f10810d != null) {
                this.f10811e.finish();
                Activity activity = this.f10811e;
                Intent intent = this.f10810d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/account/ui/AccountExpiredUtil$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111192a(this.f10811e, this.f10810d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r2 != -3) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1500a(android.app.Activity r13, int r14, int r15, android.content.Intent r16, java.lang.String r17) {
        /*
            r9 = r13
            r1 = r14
            r2 = r15
            r10 = r16
            r0 = r17
            r11 = 0
            r3 = 4
            if (r1 == r3) goto L_0x000c
            return r11
        L_0x000c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "errType = "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = " errCode = "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.AccountExpiredUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = -205(0xffffffffffffff33, float:NaN)
            java.lang.String r5 = "account expired="
            r6 = 2131832658(0x7f112f52, float:1.9298376E38)
            r7 = 2131821704(0x7f110488, float:1.9276159E38)
            r12 = 1
            if (r2 == r3) goto L_0x00eb
            r3 = -140(0xffffffffffffff74, float:NaN)
            r8 = -104(0xffffffffffffff98, float:NaN)
            if (r2 == r3) goto L_0x0070
            if (r2 == r8) goto L_0x0070
            r0 = -75
            if (r2 == r0) goto L_0x0052
            r0 = -72
            if (r2 == r0) goto L_0x00eb
            r0 = -9
            if (r2 == r0) goto L_0x00eb
            r0 = -4
            if (r2 == r0) goto L_0x00eb
            r0 = -3
            if (r2 == r0) goto L_0x00eb
            goto L_0x00a0
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = 2131820928(0x7f110180, float:1.9274585E38)
            com.tencent.mm.plugin.account.ui.a$b r1 = new com.tencent.mm.plugin.account.ui.a$b
            r1.<init>(r10, r13)
            nj3.C76879j.m92742m(r13, r0, r7, r1)
            return r12
        L_0x0070:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r1[r11] = r3
            r1[r12] = r0
            java.lang.String r3 = "accout errCode[%d], errMsg[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "autoauth_errmsg_"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0095
            r1 = 16
            java.lang.String r0 = r0.substring(r1)
            goto L_0x00a1
        L_0x0095:
            if (r2 != r8) goto L_0x00a1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            java.lang.String r0 = "MM_ERR_LOGIC but not autoauth showMsg[%s] break"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r1)
        L_0x00a0:
            return r11
        L_0x00a1:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = "<"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00cc
            r1 = 0
            java.lang.String r2 = "e"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r2, r1)
            if (r1 == 0) goto L_0x00cc
            java.lang.String r2 = ".e.Content"
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00cc
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00cc:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x00da
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r6)
        L_0x00da:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r1.getString(r7)
            com.tencent.mm.plugin.account.ui.a$c r2 = new com.tencent.mm.plugin.account.ui.a$c
            r2.<init>(r10, r13)
            nj3.C76879j.m92749t(r13, r0, r1, r2)
            return r12
        L_0x00eb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0119 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0119 }
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_account_expired_enable     // Catch:{ Exception -> 0x0119 }
            boolean r0 = r0.mo58784wf(r3, r11)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "accountExpriredEnable is: %s!!"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0119 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0119 }
            r5[r11] = r8     // Catch:{ Exception -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r5)     // Catch:{ Exception -> 0x0119 }
            goto L_0x012a
        L_0x0119:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r5 = "accountExpriredEnable"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r3)
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r11)
            boolean r0 = r0.booleanValue()
        L_0x012a:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 != 0) goto L_0x0132
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r3 == 0) goto L_0x013b
        L_0x0132:
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r12)
            boolean r0 = r0.booleanValue()
        L_0x013b:
            if (r0 != 0) goto L_0x0146
            com.tencent.mm.plugin.account.ui.a$a r0 = new com.tencent.mm.plugin.account.ui.a$a
            r0.<init>(r10, r13)
            nj3.C76879j.m92742m(r13, r6, r7, r0)
            goto L_0x019b
        L_0x0146:
            if (r10 == 0) goto L_0x019b
            r13.finish()
            java.lang.String r0 = "key_errType"
            r10.putExtra(r0, r14)
            java.lang.String r0 = "key_errCode"
            r10.putExtra(r0, r15)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r6)
            java.lang.String r1 = "key_errMsg"
            r10.putExtra(r1, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r10)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/account/ui/AccountExpiredUtil"
            java.lang.String r4 = "accountExpired"
            java.lang.String r5 = "(Landroid/app/Activity;IILandroid/content/Intent;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r13
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r11)
            android.content.Intent r0 = (android.content.Intent) r0
            r13.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/AccountExpiredUtil"
            java.lang.String r3 = "accountExpired"
            java.lang.String r4 = "(Landroid/app/Activity;IILandroid/content/Intent;Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            nj3.C88990b.m111192a(r13, r10)
        L_0x019b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C1468a.m1500a(android.app.Activity, int, int, android.content.Intent, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static boolean m1501b(int i, int i2) {
        return (i2 == -100 || i2 == -2023 || i2 == -3 || i2 == -4 || i2 == -9 || i2 == -205 || i2 == -72) && i == 4;
    }
}
