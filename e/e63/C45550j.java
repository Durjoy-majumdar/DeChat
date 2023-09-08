package e63;

import android.database.Cursor;
import b63.C39735i0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: e63.j */
public class C45550j extends MAutoStorage<C39735i0> {

    /* renamed from: e */
    public static final String[] f123218e = {MAutoStorage.getCreateSQLs(C39735i0.f106612D, "WalletPrefInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f123219d;

    public C45550j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C39735i0.f106612D, "WalletPrefInfo", (String[]) null);
        this.f123219d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C39735i0 mo71052Lo(String str) {
        C39735i0 i0Var = null;
        if (!Util.isNullOrNil(str)) {
            Cursor rawQuery = this.f123219d.rawQuery("select * from WalletPrefInfo where pref_key=?", new String[]{str}, 2);
            if (rawQuery == null) {
                return null;
            }
            if (rawQuery.moveToFirst()) {
                i0Var = new C39735i0();
                i0Var.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return i0Var;
    }

    /* renamed from: jo */
    public boolean mo71053jo(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return this.f123219d.execSQL("WalletPrefInfo", "delete from WalletPrefInfo where pref_key='" + str + "'");
    }
}
