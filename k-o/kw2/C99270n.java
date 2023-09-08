package kw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38714z8;

/* renamed from: kw2.n */
public final class C99270n extends MAutoStorage<C34078m> {

    /* renamed from: e */
    public static final String[] f291095e = {MAutoStorage.getCreateSQLs(C34078m.f91952v, "StoryVideoCacheInfo")};

    /* renamed from: f */
    public static final String f291096f = "MicroMsg.StoryVideoCacheStorage";

    /* renamed from: d */
    public final ISQLiteDatabase f291097d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99270n(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C34078m.f91952v, "StoryVideoCacheInfo", C38714z8.f104441j);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C34078m.f91952v;
        this.f291097d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C34078m mVar) {
        C87412m.m108594g(mVar, "item");
        return super.insert(mVar);
    }

    /* renamed from: jo */
    public void mo138676jo() {
        int delete = this.f291097d.delete("StoryVideoCacheInfo", (String) null, (String[]) null);
        String str = f291096f;
        Log.m105924i(str, "dropTable " + delete);
    }

    /* renamed from: qq */
    public final boolean mo138677qq(C34078m mVar) {
        C87412m.m108594g(mVar, "item");
        return super.update(mVar, new String[0]);
    }
}
