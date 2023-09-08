package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33317c;

/* renamed from: hg1.d */
public abstract class C32891d extends MAutoStorage<C33317c> {

    /* renamed from: d */
    public static final String[] f89425d = {MAutoStorage.getCreateSQLs(C33317c.f90335p, "FinderLiveDislikeBannerRecord")};

    public C32891d(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
