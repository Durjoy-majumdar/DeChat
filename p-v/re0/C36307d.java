package re0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: re0.d */
public class C36307d extends MAutoStorage<C36306c> {

    /* renamed from: e */
    public static final String[] f96658e = {MAutoStorage.getCreateSQLs(C36306c.f96657x, "OpenIMAppIdInfo")};

    /* renamed from: d */
    public C91753f f96659d;

    public C36307d(C91753f fVar) {
        super(fVar, C36306c.f96657x, "OpenIMAppIdInfo", (String[]) null);
        this.f96659d = fVar;
    }

    /* renamed from: jo */
    public boolean replace(C36306c cVar) {
        cVar.field_updateTime = Util.nowSecond();
        return super.replace(cVar);
    }
}
