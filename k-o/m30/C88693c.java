package m30;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import p749xh.C91209n5;

/* renamed from: m30.c */
public class C88693c extends MAutoStorage<C91209n5> {

    /* renamed from: e */
    public static final String[] f256044e = {MAutoStorage.getCreateSQLs(C91209n5.f261653R0, "KeyNodeInfo"), "ALTER TABLE KeyNodeInfo ADD COLUMN predict_type int"};

    /* renamed from: d */
    public final ISQLiteDatabase f256045d;

    static {
        SingleTable singleTable = C91209n5.f261638D;
    }

    public C88693c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C91209n5.f261653R0, "KeyNodeInfo", f256044e);
        this.f256045d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean mo123138Lo(C91209n5 n5Var) {
        if (n5Var == null) {
            return false;
        }
        ContentValues convertTo = n5Var.convertTo();
        ISQLiteDatabase iSQLiteDatabase = this.f256045d;
        StringBuilder sb = new StringBuilder();
        sb.append("type=? and id='");
        sb.append(n5Var.field_id);
        sb.append("'");
        return iSQLiteDatabase.update("KeyNodeInfo", convertTo, sb.toString(), new String[]{String.valueOf(n5Var.field_type)}) > 0;
    }

    /* renamed from: jo */
    public C91209n5 mo123139jo(String str, String str2) {
        Cursor rawQuery = this.f256045d.rawQuery("select * from KeyNodeInfo where type = '" + str + "' and " + "id" + " = '" + str2 + "'", (String[]) null);
        try {
            if (rawQuery.moveToFirst()) {
                C91209n5 n5Var = new C91209n5();
                n5Var.convertFrom(rawQuery);
                rawQuery.close();
                return n5Var;
            }
            rawQuery.close();
            return null;
        } catch (Throwable th) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }
}
