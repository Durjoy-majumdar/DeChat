package b42;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C78831y5;

/* renamed from: b42.b */
public final class C67150b extends MAutoStorage<C67149a> {

    /* renamed from: e */
    public static final String[] f192818e = {MAutoStorage.getCreateSQLs(C67149a.f192817p0, "LocalRedPacketStoryInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f192819d;

    public C67150b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C67149a.f192817p0, "LocalRedPacketStoryInfo", C78831y5.f231569B);
        this.f192819d = iSQLiteDatabase;
    }
}
