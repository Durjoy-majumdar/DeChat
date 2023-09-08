package com.tencent.p014mm.plugin.dbbackup;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$b */
public class DBRecoveryUI$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345823d;

    public DBRecoveryUI$$b(DBRecoveryUI dBRecoveryUI) {
        this.f345823d = dBRecoveryUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DBRecoveryUI dBRecoveryUI = this.f345823d;
        if (dBRecoveryUI.f345817j != 0) {
            View view = dBRecoveryUI.f345812e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f345823d.f345813f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        SQLiteCipherSpec sQLiteCipherSpec = C115392k.f345883j;
        MMAppMgr.m85988h(true);
    }
}
