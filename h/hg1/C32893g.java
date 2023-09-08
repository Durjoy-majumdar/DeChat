package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C33319f;

/* renamed from: hg1.g */
public abstract class C32893g extends MAutoStorage<C33319f> {

    /* renamed from: d */
    public static final String[] f89427d = {MAutoStorage.getCreateSQLs(C33319f.f90337p, "FinderLiveLuckyMoneyInfo")};

    public C32893g(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
