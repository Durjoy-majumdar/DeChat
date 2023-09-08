package fv0;

import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import gy3.C87412m;
import p278yh.C23309e;

/* renamed from: fv0.a */
public final class C20720a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f58581d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f58582e;

    public C20720a(BackupMigratePCUI backupMigratePCUI, Runnable runnable) {
        this.f58581d = backupMigratePCUI;
        this.f58582e = runnable;
    }

    public final void run() {
        BackupMigratePCUI backupMigratePCUI = this.f58581d;
        if (!backupMigratePCUI.f50082g) {
            this.f58582e.run();
            BackupMigratePCUI backupMigratePCUI2 = this.f58581d;
            Runnable runnable = this.f58582e;
            backupMigratePCUI2.getClass();
            C87412m.m108594g(runnable, "run");
            backupMigratePCUI2.f50086n.postDelayed(new C20720a(backupMigratePCUI2, runnable), 400);
            return;
        }
        C23309e eVar = backupMigratePCUI.f50080e;
        if (eVar != null) {
            eVar.mo36787n().setEnabled(true);
            C23309e eVar2 = this.f58581d.f50080e;
            if (eVar2 != null) {
                eVar2.mo36776c().setEnabled(true);
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }
}
