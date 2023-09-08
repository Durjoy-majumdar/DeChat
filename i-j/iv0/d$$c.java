package iv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupui.BackupChooseBackupModeUI;

public final /* synthetic */ class d$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupChooseBackupModeUI f29007d;

    public /* synthetic */ d$$c(BackupChooseBackupModeUI backupChooseBackupModeUI) {
        this.f29007d = backupChooseBackupModeUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r9 == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI r6 = r8.f29007d
            int r0 = com.tencent.p014mm.plugin.backup.backupui.BackupChooseBackupModeUI.f12012e
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r6
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            ev0.b r9 = ev0.C20612a.m22482o()
            boolean r9 = r9.f58031h
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI"
            if (r9 == 0) goto L_0x004e
            ev0.b r9 = ev0.C20612a.m22482o()
            boolean r9 = r9.mo32286j()
            if (r9 == 0) goto L_0x004e
            android.content.Intent r9 = new android.content.Intent
            androidx.appcompat.app.AppCompatActivity r4 = r6.getContext()
            java.lang.Class<com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI> r5 = com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI.class
            r9.<init>(r4, r5)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r6, r9)
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
            goto L_0x00a5
        L_0x004e:
            bp3.p r9 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Backup_OpenMigratePc_Int
            r5 = 0
            int r9 = r9.mo109882e(r4, r5)
            r4 = 1
            if (r4 == r9) goto L_0x008b
            oa1.d r9 = oa1.C117731d.m166007c()
            java.lang.String r7 = "clicfg_backup_pc_migrate_enable"
            int r9 = r9.mo182443e(r7, r5, r5, r4)
            if (r9 == r4) goto L_0x008b
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r9 != 0) goto L_0x0088
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r9 != 0) goto L_0x007c
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r9 != 0) goto L_0x007c
            int r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r7 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r9 != r7) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r9 = 0
            goto L_0x007d
        L_0x007c:
            r9 = 1
        L_0x007d:
            if (r9 != 0) goto L_0x0088
            boolean r9 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r9 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r9 = 0
            goto L_0x0089
        L_0x0088:
            r9 = 1
        L_0x0089:
            if (r9 == 0) goto L_0x008c
        L_0x008b:
            r5 = 1
        L_0x008c:
            if (r5 == 0) goto L_0x009d
            android.content.Intent r9 = new android.content.Intent
            androidx.appcompat.app.AppCompatActivity r4 = r6.getContext()
            java.lang.Class<com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI> r5 = com.tencent.p014mm.plugin.backup.backupui.BackupChooseModeUI.class
            r9.<init>(r4, r5)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r6, r9)
            goto L_0x00a2
        L_0x009d:
            com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$a r9 = com.tencent.p014mm.plugin.backup.backupui.BackupChooseModeUI.f12013d
            r9.mo1997a(r6)
        L_0x00a2:
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iv0.d$$c.onClick(android.view.View):void");
    }
}
