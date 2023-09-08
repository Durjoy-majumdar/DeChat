package fv0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p278yh.C23309e;
import rx3.C13598b0;
import yu0.C102913k;

/* renamed from: fv0.v */
public final class C20726v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f58592d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20726v(BackupMigratePCUI backupMigratePCUI) {
        super(0);
        this.f58592d = backupMigratePCUI;
    }

    public Object invoke() {
        BackupMigratePCUI backupMigratePCUI = this.f58592d;
        BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
        backupMigratePCUI.mo22702V7(C0966R.raw.icons_outlined_move_to_computer, 192, 80, 0);
        BackupMigratePCUI backupMigratePCUI2 = this.f58592d;
        String w = C102913k.m136058w((float) backupMigratePCUI2.mo22694N7().mo140768e());
        C87412m.m108593f(w, "getLengthStr(totalSize)");
        backupMigratePCUI2.mo22717k8(C0966R.string.aek, backupMigratePCUI2.getString(C0966R.string.mjp, new Object[]{w}));
        C23309e eVar = this.f58592d.f50080e;
        if (eVar != null) {
            eVar.mo36788o().setVisibility(0);
            C23309e eVar2 = this.f58592d.f50080e;
            if (eVar2 != null) {
                eVar2.mo36787n().setEnabled(true);
                C23309e eVar3 = this.f58592d.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36776c().setEnabled(true);
                    C23309e eVar4 = this.f58592d.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36784k().setVisibility(8);
                        C23309e eVar5 = this.f58592d.f50080e;
                        if (eVar5 != null) {
                            eVar5.mo36787n().setOnClickListener(new C107592t(this.f58592d));
                            C23309e eVar6 = this.f58592d.f50080e;
                            if (eVar6 != null) {
                                eVar6.mo36776c().setOnClickListener(new C20725u(this.f58592d));
                                C23309e eVar7 = this.f58592d.f50080e;
                                if (eVar7 != null) {
                                    eVar7.mo36777d().setVisibility(0);
                                    return C13598b0.f38549a;
                                }
                                C87412m.m108603p("vb");
                                throw null;
                            }
                            C87412m.m108603p("vb");
                            throw null;
                        }
                        C87412m.m108603p("vb");
                        throw null;
                    }
                    C87412m.m108603p("vb");
                    throw null;
                }
                C87412m.m108603p("vb");
                throw null;
            }
            C87412m.m108603p("vb");
            throw null;
        }
        C87412m.m108603p("vb");
        throw null;
    }
}
