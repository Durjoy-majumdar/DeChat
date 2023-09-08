package up1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C38642q3;

/* renamed from: up1.u */
public final class C37557u extends MAutoStorage<C37556t> {

    /* renamed from: e */
    public static final String[] f99615e = {MAutoStorage.getCreateSQLs(C37556t.f99614x, "FinderLocalOperation")};

    /* renamed from: d */
    public final ISQLiteDatabase f99616d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37557u(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37556t.f99614x, "FinderLocalOperation", C38642q3.f103382n);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C37556t.f99614x;
        this.f99616d = iSQLiteDatabase;
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        C37556t tVar = (C37556t) iAutoDBItem;
        C87412m.m108594g(tVar, "item");
        boolean insert = super.insert(tVar);
        Log.m105924i("Finder.FinderLocalOperationStorage", "insert " + tVar.field_localId + ", ret:" + insert);
        return insert;
    }

    /* renamed from: jo */
    public final List<C37556t> mo61205jo() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f99616d.rawQuery("select * from FinderLocalOperation", (String[]) null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C37556t tVar = new C37556t();
                tVar.convertFrom(rawQuery);
                arrayList.add(tVar);
            }
            rawQuery.close();
        }
        Log.m105924i("Finder.FinderLocalOperationStorage", "getAllData size:" + arrayList.size());
        return arrayList;
    }
}
