package qd2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: qd2.b */
public class C35831b extends MAutoStorage<C35830a> {

    /* renamed from: e */
    public static final String[] f95647e = {MAutoStorage.getCreateSQLs(C35830a.f95646r, "OrderCommonMsgXml")};

    /* renamed from: d */
    public ISQLiteDatabase f95648d;

    public C35831b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35830a.f95646r, "OrderCommonMsgXml", (String[]) null);
        this.f95648d = iSQLiteDatabase;
    }

    public Cursor getAll() {
        return this.f95648d.rawQuery("select * from OrderCommonMsgXml order by msgId desc", (String[]) null);
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return super.insert((C35830a) iAutoDBItem);
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        return super.update((C35830a) iAutoDBItem, strArr);
    }
}
