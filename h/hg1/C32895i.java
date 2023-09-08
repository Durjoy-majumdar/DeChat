package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33322i;

/* renamed from: hg1.i */
public abstract class C32895i extends MAutoStorage<C33322i> {

    /* renamed from: d */
    public static final String[] f89429d = {MAutoStorage.getCreateSQLs(C33322i.f90340p, "FinderLiveVideoDefinitionInfo")};

    public C32895i(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }

    /* renamed from: Lo */
    public abstract int mo58845Lo(long j);

    /* renamed from: jo */
    public abstract void mo58846jo();
}
