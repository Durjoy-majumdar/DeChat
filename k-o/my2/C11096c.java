package my2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import ky2.C10437m;

/* renamed from: my2.c */
public final class C11096c extends MAutoStorage<C10437m> {

    /* renamed from: e */
    public static final String[] f32874e = {MAutoStorage.getCreateSQLs(C10437m.f31665x, "TeenModeAuthorization")};

    /* renamed from: d */
    public final ISQLiteDatabase f32875d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11096c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C10437m.f31665x, "TeenModeAuthorization", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f32875d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final C10437m mo11231jo(int i, String str, long j) {
        C87412m.m108594g(str, "key");
        C10437m mVar = new C10437m();
        mVar.field_businessType = i;
        mVar.field_businessKey = str;
        mVar.field_msgSvrId = j;
        String str2 = "select * from " + "TeenModeAuthorization" + " where businessType = " + i + " and businessKey = '" + str + "' ";
        if (j > 0) {
            str2 = str2 + " and msgSvrId = " + j;
        }
        Cursor rawQuery = this.f32875d.rawQuery(str2 + " order by time desc ", (String[]) null);
        if (rawQuery.moveToNext()) {
            mVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return mVar;
    }
}
