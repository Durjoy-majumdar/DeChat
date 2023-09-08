package rz2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: rz2.g */
public final class C48205g extends MAutoStorage<C48204f> {

    /* renamed from: e */
    public static final String[] f129186e = {MAutoStorage.getCreateSQLs(C48204f.f129185D, "TextStatusReference")};

    /* renamed from: d */
    public final ISQLiteDatabase f129187d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48205g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48204f.f129185D, "TextStatusReference", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48204f.f129185D;
        this.f129187d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final int mo72956Lo(int i) {
        String str;
        if (i < 0) {
            str = "select count(rowid) from TextStatusReference where Read != 1 ";
        } else {
            str = "select count(rowid) from " + "TextStatusReference" + " where Read != 1 and CreateTime > " + i;
        }
        Cursor rawQuery = this.f129187d.rawQuery(str, (String[]) null);
        C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
        int i2 = 0;
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i2;
    }

    /* renamed from: Yt */
    public boolean update(C48204f fVar, String... strArr) {
        C87412m.m108594g(fVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean updateNotify = super.updateNotify(fVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
        doNotify(fVar.field_UserName);
        return updateNotify;
    }

    public void doNotify(String str) {
        super.doNotify(str, -1, (Object) null);
    }

    /* renamed from: jo */
    public boolean delete(C48204f fVar, String... strArr) {
        C87412m.m108594g(fVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean delete = super.delete(fVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        doNotify(fVar.field_UserName);
        return delete;
    }

    /* renamed from: qq */
    public boolean insert(C48204f fVar) {
        C87412m.m108594g(fVar, "item");
        boolean insertNotify = super.insertNotify(fVar, false);
        doNotify(fVar.field_UserName);
        return insertNotify;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C48204f fVar = (C48204f) iAutoDBItem;
        C87412m.m108594g(fVar, "item");
        boolean replace = super.replace(fVar, false);
        doNotify(fVar.field_UserName);
        return replace;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        C48204f fVar = (C48204f) iAutoDBItem;
        C87412m.m108594g(fVar, "item");
        boolean update = super.update(j, fVar);
        doNotify(fVar.field_UserName);
        return update;
    }
}
