package e63;

import android.database.Cursor;
import b63.C67186g0;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.HashMap;
import java.util.Map;
import p287zz.C79444g;

/* renamed from: e63.i */
public class C75562i extends MAutoStorage<C67186g0> implements C79444g {

    /* renamed from: e */
    public static final String[] f221983e = {MAutoStorage.getCreateSQLs(C67186g0.f192893H, "WalletLuckyMoney")};

    /* renamed from: f */
    public static Map<String, C67186g0> f221984f = new HashMap();

    /* renamed from: d */
    public ISQLiteDatabase f221985d;

    public C75562i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C67186g0.f192893H, "WalletLuckyMoney", (String[]) null);
        this.f221985d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean replace(C67186g0 g0Var) {
        if (g0Var != null) {
            if (((HashMap) f221984f).containsKey(g0Var.field_mNativeUrl)) {
                ((HashMap) f221984f).put(g0Var.field_mNativeUrl, g0Var);
            }
        }
        return super.replace(g0Var);
    }

    /* renamed from: jo */
    public C67186g0 mo105871jo(String str) {
        Cursor rawQuery = this.f221985d.rawQuery("select * from WalletLuckyMoney where mNativeUrl=?", new String[]{str});
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            return null;
        }
        rawQuery.moveToFirst();
        C67186g0 g0Var = new C67186g0();
        g0Var.convertFrom(rawQuery);
        rawQuery.close();
        return g0Var;
    }
}
