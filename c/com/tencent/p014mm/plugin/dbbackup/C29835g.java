package com.tencent.p014mm.plugin.dbbackup;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.dbbackup.g */
public class C29835g implements MMHandler.Callback {
    public C29835g(C115381b bVar) {
    }

    public boolean handleMessage(Message message) {
        SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
        int i = message.what;
        if (i == 1) {
            f.beginTransaction();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            f.endTransaction();
            return true;
        }
    }
}
