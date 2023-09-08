package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33320g;

/* renamed from: hg1.h */
public abstract class C32894h extends MAutoStorage<C33320g> {

    /* renamed from: d */
    public static final String[] f89428d = {MAutoStorage.getCreateSQLs(C33320g.f90338N, "FinderLiveNotifyExposureInfo")};

    public C32894h(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
