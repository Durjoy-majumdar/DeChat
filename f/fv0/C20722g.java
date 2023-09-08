package fv0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: fv0.g */
public final class C20722g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f58586d;

    /* renamed from: fv0.g$a */
    public static final class C20723a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f58587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20723a(BackupMigratePCUI backupMigratePCUI) {
            super(0);
            this.f58587d = backupMigratePCUI;
        }

        public Object invoke() {
            BackupMigratePCUI backupMigratePCUI = this.f58587d;
            BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
            if (backupMigratePCUI.mo22695O7().f58030g == 101) {
                this.f58587d.mo22712f8();
            } else {
                this.f58587d.mo22711e8();
            }
            return C13598b0.f38549a;
        }
    }

    public C20722g(BackupMigratePCUI backupMigratePCUI) {
        this.f58586d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$pauseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f58586d;
        BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
        int i = backupMigratePCUI.mo22695O7().f58030g == 100 ? C0966R.string.mjk : C0966R.string.mq5;
        BackupMigratePCUI backupMigratePCUI2 = this.f58586d;
        backupMigratePCUI2.mo22705Y7(i, C0966R.string.f360153ml2, new C20723a(backupMigratePCUI2));
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$pauseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
