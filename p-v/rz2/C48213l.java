package rz2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;

/* renamed from: rz2.l */
public final class C48213l extends MAutoStorage<C48212k> {

    /* renamed from: e */
    public static final String[] f129196e = {MAutoStorage.getCreateSQLs(C48212k.f129194Q, "TextStatusStrangerContact")};

    /* renamed from: d */
    public final ISQLiteDatabase f129197d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48213l(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48212k.f129194Q, "TextStatusStrangerContact", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48212k.f129194Q;
        this.f129197d = iSQLiteDatabase;
    }
}
