package sn2;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: sn2.b0 */
public class C36747b0 extends MAutoStorage<C36746a0> {

    /* renamed from: e */
    public static final String[] f97612e = {MAutoStorage.getCreateSQLs(C36746a0.f97611v, "shaketvhistory")};

    /* renamed from: d */
    public ISQLiteDatabase f97613d;

    public C36747b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36746a0.f97611v, "shaketvhistory", f97612e);
        this.f97613d = iSQLiteDatabase;
    }
}
