package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C8916d;

/* renamed from: hg1.e */
public abstract class C8528e extends MAutoStorage<C8916d> {

    /* renamed from: d */
    public static final String[] f27579d = {MAutoStorage.getCreateSQLs(C8916d.f28212c1, "FinderLiveGiftInfo")};

    public C8528e(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }
}
