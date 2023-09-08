package qg2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import og2.C100341k;
import og2.C100346q;

/* renamed from: qg2.h0 */
public class C101143h0 extends MAutoStorage<C100346q> implements C100341k {

    /* renamed from: d */
    public ISQLiteDatabase f296046d;

    public C101143h0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C100346q.f293920H, "RecordMessageInfo", (String[]) null);
        this.f296046d = iSQLiteDatabase;
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C100346q qVar = (C100346q) iAutoDBItem;
        Log.m105925i("MicroMsg.RecordMsgStorage", "insert recordMsgInfo localId:%s msgId:%s", Integer.valueOf(qVar.field_localId), Long.valueOf(qVar.field_msgId));
        return super.insert(qVar);
    }

    /* renamed from: jo */
    public void mo140594jo(int i) {
        ISQLiteDatabase iSQLiteDatabase = this.f296046d;
        Log.m105919d("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", Integer.valueOf(i), Integer.valueOf(iSQLiteDatabase.delete("RecordMessageInfo", "localId=?", new String[]{"" + i})));
    }
}
