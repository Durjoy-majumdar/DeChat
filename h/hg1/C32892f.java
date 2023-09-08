package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33318e;

/* renamed from: hg1.f */
public abstract class C32892f extends MAutoStorage<C33318e> {

    /* renamed from: d */
    public static final String[] f89426d = {MAutoStorage.getCreateSQLs(C33318e.f90336p, "FinderLiveLastRewardInfo")};

    public C32892f(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
