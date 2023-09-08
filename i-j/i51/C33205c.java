package i51;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: i51.c */
public class C33205c extends MAutoStorage<C33203a> {

    /* renamed from: d */
    public static final String[] f90100d = {MAutoStorage.getCreateSQLs(C33203a.f90099r, "DownloadTaskItem")};

    public C33205c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33203a.f90099r, "DownloadTaskItem", (String[]) null);
    }
}
