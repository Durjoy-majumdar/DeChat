package qn1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38659s6;

/* renamed from: qn1.e */
public final class C12889e extends MAutoStorage<C38659s6> {

    /* renamed from: d */
    public static final String[] f36874d = {MAutoStorage.getCreateSQLs(C12893k.f36878L, "NpsSurveyTaskConfig")};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12889e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C12893k.f36878L, "NpsSurveyTaskConfig", C38659s6.f103635u);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C12893k.f36878L;
    }
}
