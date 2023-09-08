package ku1;

import a10.C112726y;
import b10.C104002a;
import gy3.C87412m;

/* renamed from: ku1.a */
public final class C10422a extends C104002a {

    /* renamed from: b */
    public final String f31641b = "MicroMsg.FlutterSettingNavigator";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10422a(C112726y yVar) {
        super(yVar);
        C87412m.m108594g(yVar, "flutterInstance");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x051e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x051f, code lost:
        if (r11 == false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0527, code lost:
        return new b10.C0241b(false, (java.util.Map) null, 3, (gy3.C8480h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x052c, code lost:
        return b10.C104002a.m138743b(r16, r17, r18, r19, r20, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007e, code lost:
        r14 = r16;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10723a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20, wx3.C15601d<? super b10.C0241b> r21) {
        /*
            r16 = this;
            r9 = r17
            r10 = r19
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.PreviewHdHeadImg.class
            java.lang.Class<pr.j> r2 = p220pr.C12001j.class
            int r3 = r19.hashCode()
            java.lang.String r4 = "address"
            java.lang.String r5 = "launch_from_webview"
            r6 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r3) {
                case -1932411621: goto L_0x04d1;
                case -1683443754: goto L_0x04bb;
                case -1538158412: goto L_0x049d;
                case -1006925602: goto L_0x044e;
                case -791763361: goto L_0x0436;
                case -639775725: goto L_0x0399;
                case -303371349: goto L_0x0347;
                case -200609951: goto L_0x032c;
                case -95450704: goto L_0x02e0;
                case -85100853: goto L_0x02c7;
                case 26016987: goto L_0x027a;
                case 352357754: goto L_0x0233;
                case 419662746: goto L_0x0209;
                case 480444176: goto L_0x0166;
                case 852979113: goto L_0x0114;
                case 1119536640: goto L_0x00bf;
                case 1250067037: goto L_0x0082;
                case 1606739041: goto L_0x0068;
                case 1985324809: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            r14 = r16
            goto L_0x051e
        L_0x001d:
            java.lang.String r0 = "set_sex"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x0019
        L_0x0027:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.SelectSexUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SelectSexUI.class
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SelectSexUI.f20745h
            r0.<init>(r9, r1)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r0)
            java.lang.Object[] r2 = r14.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r14.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x007e
        L_0x0068:
            java.lang.String r0 = "my_address"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0019
        L_0x0071:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r5, r12)
            java.lang.String r1 = ".ui.WalletSelectAddrUI"
            ke3.C88144b.m109792j(r9, r4, r1, r0, r11)
        L_0x007e:
            r14 = r16
            goto L_0x051f
        L_0x0082:
            java.lang.String r0 = "backup_to_device"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x008b
            goto L_0x0019
        L_0x008b:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x00a5 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x00a5 }
            g62.f r0 = r0.mo96093DX()     // Catch:{ Exception -> 0x00a5 }
            com.tencent.mm.storage.n2 r0 = (com.tencent.p014mm.storage.C72986n2) r0     // Catch:{ Exception -> 0x00a5 }
            boolean r0 = r0.mo101185qq()     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x00a2
            eb0.C75604z3.m90829a()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a2:
            r14 = r16
            goto L_0x00b1
        L_0x00a5:
            r0 = move-exception
            r14 = r16
            java.lang.String r1 = r14.f31641b
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
        L_0x00b1:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.backup.backupmoveui.BackupUI> r1 = com.tencent.p014mm.plugin.backup.backupmoveui.BackupUI.class
            boolean r2 = com.tencent.p014mm.plugin.backup.backupmoveui.BackupUI.f50068h
            r0.<init>(r9, r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r9, r0)
            goto L_0x051f
        L_0x00bf:
            r14 = r16
            java.lang.String r0 = "backup_mode"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00cb
            goto L_0x051e
        L_0x00cb:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI"
            android.content.Intent r0 = r0.setClassName(r9, r1)
            java.lang.String r1 = "Intent().setClassName(co…ackupChooseBackupModeUI\")"
            gy3.C87412m.m108593f(r0, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x0114:
            r14 = r16
            java.lang.String r0 = "set_pat_tail"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0121
            goto L_0x051e
        L_0x0121:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyPatSuffixUI.class
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyPatSuffixUI.f205739q
            r0.setClass(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x0166:
            r14 = r16
            java.lang.String r0 = "show_qrcode"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0173
            goto L_0x051e
        L_0x0173:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 11264(0x2c00, float:1.5784E-41)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2[r12] = r3
            r0.mo160131h(r1, r2)
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r1 = bp3.C104160f.RepairerConfig_Global_ColorfulQRCode_Int
            int r0 = r0.mo109882e(r1, r12)
            if (r0 != r11) goto L_0x018d
            goto L_0x01bf
        L_0x018d:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT
            r2 = -100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            r0 = r0 ^ r11
            if (r0 != 0) goto L_0x01bf
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_colorful_qrcode_new_enable
            int r0 = r0.mo58779Qe(r1, r12)
            if (r0 != r11) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r0 = 0
            goto L_0x01c0
        L_0x01bf:
            r0 = 1
        L_0x01c0:
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI"
            goto L_0x01c7
        L_0x01c5:
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI"
        L_0x01c7:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1.<init>(r9, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x0209:
            r14 = r16
            java.lang.String r0 = "my_invoice"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0215
            goto L_0x051e
        L_0x0215:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 14199(0x3777, float:1.9897E-41)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2[r12] = r3
            r0.mo160131h(r1, r2)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r5, r12)
            java.lang.String r1 = ".ui.InvoiceListUI"
            ke3.C88144b.m109792j(r9, r4, r1, r0, r11)
            goto L_0x051f
        L_0x0233:
            r14 = r16
            java.lang.String r0 = "backup_to_pc"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x023f
            goto L_0x051e
        L_0x023f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 2131830215(0x7f1125c7, float:1.9293421E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "title"
            r0.putExtra(r2, r1)
            r1 = 2131830216(0x7f1125c8, float:1.9293423E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r2[r12] = r3
            java.lang.String r1 = r9.getString(r1, r2)
            java.lang.String r2 = "rawUrl"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "showShare"
            r0.putExtra(r1, r12)
            java.lang.String r1 = "neverGetA8Key"
            r0.putExtra(r1, r11)
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r9, r1, r2, r0, r13)
            goto L_0x051f
        L_0x027a:
            r14 = r16
            java.lang.String r0 = "show_avatar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0287
            goto L_0x051e
        L_0x0287:
            android.content.Intent r0 = new android.content.Intent
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.PreviewHdHeadImg.f205624i
            r0.<init>(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x02c7:
            r14 = r16
            java.lang.String r0 = "set_district"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02d4
            goto L_0x051e
        L_0x02d4:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = ".ui.tools.MultiStageCitySelectUI"
            ke3.C88144b.m109801s(r9, r1, r0, r13)
            goto L_0x051f
        L_0x02e0:
            r14 = r16
            java.lang.String r0 = "preview_avatar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02ec
            goto L_0x051e
        L_0x02ec:
            android.content.Intent r0 = new android.content.Intent
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.PreviewHdHeadImg.f205624i
            r0.<init>(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x032c:
            r14 = r16
            java.lang.String r0 = "voip_ringtone"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0339
            goto L_0x051e
        L_0x0339:
            java.lang.Class<dx.w> r0 = p145dx.C58457w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dx.w r0 = (p145dx.C58457w) r0
            r1 = 7
            r0.mo82791Pu(r9, r1)
            goto L_0x051f
        L_0x0347:
            r14 = r16
            java.lang.String r0 = "set_nickname"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0354
            goto L_0x051e
        L_0x0354:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyNameUI.class
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyNameUI.f20868i
            r0.setClass(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x0399:
            r14 = r16
            java.lang.String r1 = "set_username"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x03a6
            goto L_0x051e
        L_0x03a6:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeAvatarWeChatId
            boolean r1 = r1.restricted()
            if (r1 == 0) goto L_0x03b0
            goto L_0x051f
        L_0x03b0:
            java.lang.String r1 = eb0.C75592q0.m90773c()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r2 = "EnableModAlias"
            if (r1 == 0) goto L_0x0418
            java.lang.String r1 = eb0.C75592q0.m90789s()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85814Q4(r1)
            if (r1 == 0) goto L_0x0418
            k40.a r1 = f40.C86709a0.m107533q(r0)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            int r1 = r1.mo107404b(r2, r12)
            if (r1 != 0) goto L_0x0418
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.class
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.f20831q
            r0.<init>(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x0418:
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            int r0 = r0.mo107404b(r2, r12)
            if (r0 == 0) goto L_0x051f
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAliasUI.class
            java.lang.String r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAliasUI.f20811q
            r0.<init>(r9, r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r9, r0)
            goto L_0x051f
        L_0x0436:
            r14 = r16
            java.lang.String r0 = "wecoin"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0443
            goto L_0x051e
        L_0x0443:
            di3.d r0 = di3.C86312j.m106911c(r2)
            pr.j r0 = (p220pr.C12001j) r0
            r0.mo11879zd(r9)
            goto L_0x051f
        L_0x044e:
            r14 = r16
            java.lang.String r0 = "chatting_bg"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x045a
            goto L_0x051e
        L_0x045a:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI"
            r0.setClassName(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x049d:
            r14 = r16
            java.lang.String r0 = "emoji_manager"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04a9
            goto L_0x051e
        L_0x04a9:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "10931"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "emoji"
            java.lang.String r2 = ".ui.EmojiMineUI"
            ke3.C88144b.m109791i(r9, r1, r2, r0, r13)
            goto L_0x051f
        L_0x04bb:
            r14 = r16
            java.lang.String r0 = "set_avatar"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04c7
            goto L_0x051e
        L_0x04c7:
            di3.d r0 = di3.C86312j.m106911c(r2)
            pr.j r0 = (p220pr.C12001j) r0
            r0.mo11877lP(r9)
            goto L_0x051f
        L_0x04d1:
            r14 = r16
            java.lang.String r0 = "set_signature"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x04dd
            goto L_0x051e
        L_0x04dd:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI> r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.EditSignatureUI.class
            int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.EditSignatureUI.f20721f
            r0.<init>(r9, r1)
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r0)
            java.lang.Object[] r2 = r15.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r4 = "push"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/flutter/settings/FlutterSettingNavigator"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x051f
        L_0x051e:
            r11 = 0
        L_0x051f:
            if (r11 == 0) goto L_0x0528
            b10.b r0 = new b10.b
            r1 = 3
            r0.<init>(r12, r13, r1, r13)
            return r0
        L_0x0528:
            java.lang.Object r0 = b10.C104002a.m138743b(r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ku1.C10422a.mo10723a(android.content.Context, java.lang.String, java.lang.String, java.util.Map, wx3.d):java.lang.Object");
    }
}
