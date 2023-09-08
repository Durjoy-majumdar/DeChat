package com.tencent.p014mm.plugin.dbbackup;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$d */
public class DBRecoveryUI$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345826d;

    public DBRecoveryUI$$d(DBRecoveryUI dBRecoveryUI) {
        this.f345826d = dBRecoveryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/dbbackup/DBRecoveryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DBRecoveryUI dBRecoveryUI = this.f345826d;
        int[] iArr = DBRecoveryUI.f345810q;
        dBRecoveryUI.mo175204H7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
