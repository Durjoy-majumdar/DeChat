package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33316a;

/* renamed from: hg1.a */
public abstract class C32889a extends MAutoStorage<C33316a> {

    /* renamed from: d */
    public static final String[] f89423d = {MAutoStorage.getCreateSQLs(C33316a.f90334p, "FinderLiveActionRecord")};

    public C32889a(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
