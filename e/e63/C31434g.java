package e63;

import android.database.Cursor;
import b63.C28266f0;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;

/* renamed from: e63.g */
public class C31434g extends MAutoStorage<C28266f0> {

    /* renamed from: e */
    public static final String[] f84135e = {MAutoStorage.getCreateSQLs(C28266f0.f77834x, "WalletKindInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f84136d;

    public C31434g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28266f0.f77834x, "WalletKindInfo", (String[]) null);
        this.f84136d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public ArrayList<C28266f0> mo58169jo() {
        ArrayList<C28266f0> arrayList = null;
        Cursor rawQuery = this.f84136d.rawQuery("select * from WalletKindInfo", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            ArrayList<C28266f0> arrayList2 = new ArrayList<>();
            do {
                C28266f0 f0Var = new C28266f0();
                f0Var.convertFrom(rawQuery);
                arrayList2.add(f0Var);
            } while (rawQuery.moveToNext());
            arrayList = arrayList2;
        }
        rawQuery.close();
        return arrayList;
    }
}
