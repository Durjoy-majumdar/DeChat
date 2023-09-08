package os2;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: os2.c */
public class C35288c extends MAutoStorage<C35286b> {

    /* renamed from: d */
    public static final String[] f94546d = {MAutoStorage.getCreateSQLs(C35286b.f94541z, "AdCanvasCacheInfo")};

    public C35288c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35286b.f94541z, "AdCanvasCacheInfo", (String[]) null);
    }
}
