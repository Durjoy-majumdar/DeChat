package com.tencent.p014mm.plugin.dbbackup;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.wcdb.database.SQLiteCipherSpec;

/* renamed from: com.tencent.mm.plugin.dbbackup.h */
public class C115390h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345868d;

    public C115390h(DBRecoveryUI dBRecoveryUI) {
        this.f345868d = dBRecoveryUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f345868d.finish();
        SQLiteCipherSpec sQLiteCipherSpec = C115392k.f345883j;
        MMAppMgr.m85988h(true);
    }
}
