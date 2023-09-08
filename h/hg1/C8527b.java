package hg1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ig1.C8915b;

/* renamed from: hg1.b */
public abstract class C8527b extends MAutoStorage<C8915b> {

    /* renamed from: d */
    public static final String[] f27578d = {MAutoStorage.getCreateSQLs(C8915b.f28210v, "FinderLiveChargeInfo")};

    public C8527b(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
    }

    /* renamed from: Lo */
    public abstract void mo9437Lo();

    /* renamed from: Ow */
    public abstract void mo9438Ow(long j);

    /* renamed from: Yt */
    public abstract void mo9439Yt();

    /* renamed from: jo */
    public abstract boolean mo9440jo(long j);

    /* renamed from: qq */
    public abstract boolean mo9441qq(long j);
}
