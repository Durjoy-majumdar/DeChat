package s12;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: s12.h */
public class C63693h extends MAutoStorage<C63692g> {

    /* renamed from: e */
    public static final String[] f180552e = {MAutoStorage.getCreateSQLs(C63692g.f180551z, "IPCallMsg")};

    /* renamed from: f */
    public static final String[] f180553f = {"*", "rowid"};

    /* renamed from: d */
    public ISQLiteDatabase f180554d;

    public C63693h(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C63692g.f180551z, "IPCallMsg", (String[]) null);
        this.f180554d = iSQLiteDatabase;
    }
}
