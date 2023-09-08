package e63;

import b63.C28271z;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: e63.e */
public class C31432e extends MAutoStorage<C28271z> {

    /* renamed from: e */
    public static final String[] f84131e = {MAutoStorage.getCreateSQLs(C28271z.f77842D, "WalletBulletin")};

    /* renamed from: d */
    public ISQLiteDatabase f84132d;

    public C31432e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28271z.f77842D, "WalletBulletin", (String[]) null);
        this.f84132d = iSQLiteDatabase;
    }
}
