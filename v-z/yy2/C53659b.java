package yy2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import gy3.C87412m;
import java.util.List;
import sx3.C26236u;
import uy2.C52660e;
import wz2.C53272c;

/* renamed from: yy2.b */
public final class C53659b extends MAutoStorage<C52660e> {

    /* renamed from: e */
    public static final String[] f150723e = {MAutoStorage.getCreateSQLs(C52660e.f147046P, "TextStatusGreetingItem")};

    /* renamed from: f */
    public static final String f150724f = "markUnread";

    /* renamed from: d */
    public final ISQLiteDatabase f150725d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53659b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C52660e.f147046P, "TextStatusGreetingItem", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52660e.f147046P;
        this.f150725d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public static int m60196jo(C53659b bVar, int i, int i2, Object obj) {
        Cursor rawQuery = bVar.f150725d.rawQuery("select count(rowid) from TextStatusGreetingItem where Read != 1 ", (String[]) null);
        C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
        int i3 = 0;
        if (rawQuery.moveToFirst()) {
            i3 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i3;
    }

    /* renamed from: Lo */
    public final C52660e mo74249Lo() {
        SingleTable singleTable = C53272c.f148751t;
        C87412m.m108593f(singleTable, "TABLE");
        return (C52660e) singleTable.selectAll().orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C53272c.f148752u.orderDesc())).limit(1, 0).build().singleQuery(this.f150725d, C52660e.class);
    }

    /* renamed from: Xs */
    public final List<C52660e> mo74250Xs(int i, int i2) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusGreetingItemStorage", "query() called with: offset = " + i + ", nextCount = " + i2);
        return C53272c.f148751t.selectAll().orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C53272c.f148752u.orderDesc())).limit(i2, i).build().multiQuery(this.f150725d, C52660e.class);
    }
}
