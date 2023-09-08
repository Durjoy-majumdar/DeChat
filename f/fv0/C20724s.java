package fv0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import p278yh.C23309e;

/* renamed from: fv0.s */
public final class C20724s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f58588d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f58589e;

    /* renamed from: f */
    public final /* synthetic */ BackupMigratePCUI f58590f;

    public C20724s(C8478d0 d0Var, C8479f0<String> f0Var, BackupMigratePCUI backupMigratePCUI) {
        this.f58588d = d0Var;
        this.f58589e = f0Var;
        this.f58590f = backupMigratePCUI;
    }

    public final void run() {
        C8478d0 d0Var = this.f58588d;
        int i = d0Var.f27483d;
        if (i < 3) {
            d0Var.f27483d = i + 1;
        } else {
            d0Var.f27483d = 1;
        }
        int i2 = d0Var.f27483d;
        if (i2 == 1) {
            this.f58589e.f27484d = ".  ";
        } else if (i2 == 2) {
            this.f58589e.f27484d = ".. ";
        } else if (i2 == 3) {
            this.f58589e.f27484d = "...";
        }
        BackupMigratePCUI backupMigratePCUI = this.f58590f;
        backupMigratePCUI.mo22717k8(C0966R.string.aek, this.f58590f.getString(C0966R.string.mjl) + ((String) this.f58589e.f27484d));
        C23309e eVar = this.f58590f.f50080e;
        if (eVar != null) {
            eVar.mo36787n().setEnabled(false);
            C23309e eVar2 = this.f58590f.f50080e;
            if (eVar2 != null) {
                eVar2.mo36776c().setEnabled(false);
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
