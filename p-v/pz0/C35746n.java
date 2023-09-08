package pz0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: pz0.n */
public class C35746n extends MAutoStorage<C35745m> {

    /* renamed from: e */
    public static final String[] f95464e = {MAutoStorage.getCreateSQLs(C35745m.f95463v, "ShareCardSyncItemInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f95465d;

    public C35746n(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35745m.f95463v, "ShareCardSyncItemInfo", (String[]) null);
        this.f95465d = iSQLiteDatabase;
    }
}
