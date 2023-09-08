package rz2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: rz2.e */
public final class C48203e extends MAutoStorage<C48202d> {

    /* renamed from: e */
    public static final String[] f129183e = {MAutoStorage.getCreateSQLs(C48202d.f129182L, "TextStatusLike")};

    /* renamed from: d */
    public final ISQLiteDatabase f129184d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48203e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48202d.f129182L, "TextStatusLike", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48202d.f129182L;
        this.f129184d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final C48202d mo72950Lo(String str, String str2) {
        C48202d dVar;
        C87412m.m108594g(str, "textStatusId");
        C87412m.m108594g(str2, "userName");
        Cursor rawQuery = this.f129184d.rawQuery("select rowid, * from TextStatusLike where TextStatusId = ? and HashUserName = ? ", new String[]{Util.escapeSqlValue(str), Util.escapeSqlValue(str2)});
        C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…scapeSqlValue(userName)))");
        if (rawQuery.moveToFirst()) {
            dVar = new C48202d();
            dVar.convertFrom(rawQuery);
        } else {
            dVar = null;
        }
        rawQuery.close();
        return dVar;
    }

    /* renamed from: Ow */
    public boolean update(C48202d dVar, String... strArr) {
        C87412m.m108594g(dVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean updateNotify = super.updateNotify(dVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
        doNotify(dVar.field_HashUserName);
        return updateNotify;
    }

    /* renamed from: Yt */
    public boolean insert(C48202d dVar) {
        C87412m.m108594g(dVar, "item");
        boolean insertNotify = super.insertNotify(dVar, false);
        doNotify(dVar.field_HashUserName);
        return insertNotify;
    }

    public void doNotify(String str) {
        super.doNotify(str, -1, (Object) null);
    }

    /* renamed from: jo */
    public boolean delete(C48202d dVar, String... strArr) {
        C87412m.m108594g(dVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean delete = super.delete(dVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        doNotify(dVar.field_HashUserName);
        return delete;
    }

    /* renamed from: qq */
    public final int mo72955qq(int i) {
        String str;
        if (i < 0) {
            str = "select count(rowid) from TextStatusLike where Read != 1 ";
        } else {
            str = "select count(rowid) from " + "TextStatusLike" + " where Read != 1 and CreateTime > " + i;
        }
        Cursor rawQuery = this.f129184d.rawQuery(str, (String[]) null);
        C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
        int i2 = 0;
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i2;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C48202d dVar = (C48202d) iAutoDBItem;
        C87412m.m108594g(dVar, "item");
        boolean replace = super.replace(dVar, false);
        doNotify(dVar.field_HashUserName);
        return replace;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        C48202d dVar = (C48202d) iAutoDBItem;
        C87412m.m108594g(dVar, "item");
        boolean update = super.update(j, dVar);
        doNotify(dVar.field_HashUserName);
        return update;
    }
}
