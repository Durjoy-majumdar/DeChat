package v01;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: v01.c */
public class C37640c extends MAutoStorage<C37638a> {

    /* renamed from: d */
    public static final String[] f99778d = {MAutoStorage.getCreateSQLs(C37638a.f99777D, "CdnDownloadInfo")};

    public C37640c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37638a.f99777D, "CdnDownloadInfo", (String[]) null);
    }
}
