package fv0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: fv0.i */
public final class C107584i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f321886d;

    /* renamed from: fv0.i$a */
    public static final class C107585a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f321887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107585a(BackupMigratePCUI backupMigratePCUI) {
            super(0);
            this.f321887d = backupMigratePCUI;
        }

        public Object invoke() {
            this.f321887d.mo22699S7();
            C115669n.INSTANCE.idkeyStat(400, 26, 1, false);
            return C13598b0.f38549a;
        }
    }

    public C107584i(BackupMigratePCUI backupMigratePCUI) {
        this.f321886d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverFinish$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f321886d;
        backupMigratePCUI.mo22705Y7(C0966R.string.mq4, C0966R.string.mq6, new C107585a(backupMigratePCUI));
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverFinish$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
