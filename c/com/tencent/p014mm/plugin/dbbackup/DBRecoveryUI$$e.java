package com.tencent.p014mm.plugin.dbbackup;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$e */
public class DBRecoveryUI$$e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345827d;

    public DBRecoveryUI$$e(DBRecoveryUI dBRecoveryUI) {
        this.f345827d = dBRecoveryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        DBRecoveryUI dBRecoveryUI = this.f345827d;
        if (dBRecoveryUI.f345819o) {
            dBRecoveryUI.mo175204H7();
            return true;
        }
        dBRecoveryUI.finish();
        return true;
    }
}
