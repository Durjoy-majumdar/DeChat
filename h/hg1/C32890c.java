package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33321h;

/* renamed from: hg1.c */
public abstract class C32890c extends MAutoStorage<C33321h> {

    /* renamed from: d */
    public static final String[] f89424d = {MAutoStorage.getCreateSQLs(C33321h.f90339p, "FinderLiveConfig")};

    public C32890c(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
