package fv0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: fv0.k */
public final class C107587k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f321889d;

    /* renamed from: fv0.k$a */
    public static final class C107588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f321890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107588a(BackupMigratePCUI backupMigratePCUI) {
            super(0);
            this.f321890d = backupMigratePCUI;
        }

        public Object invoke() {
            this.f321890d.mo22699S7();
            return C13598b0.f38549a;
        }
    }

    public C107587k(BackupMigratePCUI backupMigratePCUI) {
        this.f321889d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverImport$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f321889d;
        backupMigratePCUI.mo22705Y7(C0966R.string.mq7, C0966R.string.f360153ml2, new C107588a(backupMigratePCUI));
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverImport$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
