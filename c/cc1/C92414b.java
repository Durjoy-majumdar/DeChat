package cc1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cc1.b */
public class C92414b extends MAutoStorage<C92413a> {

    /* renamed from: e */
    public static final String[] f264463e = {MAutoStorage.getCreateSQLs(C92413a.f264461G, "FavOffline")};

    /* renamed from: f */
    public static final String[] f264464f = new String[0];

    /* renamed from: d */
    public ISQLiteDatabase f264465d;

    public C92414b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C92413a.f264461G, "FavOffline", f264464f);
        this.f264465d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C92413a mo126415Lo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Cursor query = this.f264465d.query("FavOffline", C92413a.f264461G.columns, "url=?", new String[]{str}, (String) null, (String) null, "rowid");
        if (!query.moveToNext()) {
            return null;
        }
        C92413a aVar = new C92413a();
        aVar.convertFrom(query);
        return aVar;
    }

    /* renamed from: Yt */
    public boolean mo126416Yt(C92413a aVar) {
        if (aVar != null) {
            return update(aVar.systemRowid, aVar);
        }
        Log.m105920e("MicroMsg.offline.FavOfflineStorage", "update() item is null");
        return false;
    }

    /* renamed from: jo */
    public List<C92413a> mo126417jo() {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f264465d.query("FavOffline", C92413a.f264461G.columns, "status!=?", new String[]{"0"}, (String) null, (String) null, "updateTime asc");
        while (query.moveToNext()) {
            C92413a aVar = new C92413a();
            aVar.convertFrom(query);
            arrayList.add(aVar);
        }
        arrayList.size();
        return arrayList;
    }

    /* renamed from: qq */
    public boolean insert(C92413a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.insert(aVar);
    }
}
