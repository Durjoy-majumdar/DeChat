package pa1;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: pa1.b */
public class C117998b extends MAutoStorage<C35417a> {

    /* renamed from: e */
    public static final String[] f352692e = {MAutoStorage.getCreateSQLs(C35417a.f94783p, "ExptKeyMapId")};

    /* renamed from: f */
    public static final String[] f352693f = new String[0];

    /* renamed from: d */
    public ISQLiteDatabase f352694d;

    public C117998b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35417a.f94783p, "ExptKeyMapId", f352693f);
        this.f352694d = iSQLiteDatabase;
    }
}
