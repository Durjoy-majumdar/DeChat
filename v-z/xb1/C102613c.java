package xb1;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import pb1.C100738r0;
import pb1.C35443x;

/* renamed from: xb1.c */
public class C102613c extends MAutoStorage<C35443x> implements C100738r0 {

    /* renamed from: d */
    public ISQLiteDatabase f302174d;

    public C102613c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35443x.f94845v, "FavEditInfo", (String[]) null);
        this.f302174d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("FavEditInfo", "CREATE INDEX IF NOT EXISTS IndexLocalId_Type ON FavEditInfo(localId,type);");
    }

    /* renamed from: Lo */
    public /* bridge */ /* synthetic */ boolean mo142258Lo(C35443x xVar, String[] strArr) {
        return super.update(xVar, strArr);
    }

    /* renamed from: jo */
    public /* bridge */ /* synthetic */ boolean mo142259jo(C35443x xVar) {
        return super.insert(xVar);
    }
}
