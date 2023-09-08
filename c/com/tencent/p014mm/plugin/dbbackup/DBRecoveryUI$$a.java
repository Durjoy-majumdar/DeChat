package com.tencent.p014mm.plugin.dbbackup;

import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$a */
public final /* synthetic */ class DBRecoveryUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345821d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f345822e;

    public /* synthetic */ DBRecoveryUI$$a(DBRecoveryUI dBRecoveryUI, C77398g gVar) {
        this.f345821d = dBRecoveryUI;
        this.f345822e = gVar;
    }

    public final void run() {
        DBRecoveryUI dBRecoveryUI = this.f345821d;
        C77398g gVar = this.f345822e;
        int[] iArr = DBRecoveryUI.f345810q;
        if (gVar != null) {
            dBRecoveryUI.getClass();
            gVar.dismiss();
        }
        dBRecoveryUI.finish();
        SQLiteCipherSpec sQLiteCipherSpec = C115392k.f345883j;
        MMAppMgr.m85988h(true);
    }
}
