package re0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: re0.b */
public class C36305b extends MAutoStorage<C36304a> {

    /* renamed from: e */
    public static final String[] f96655e = {MAutoStorage.getCreateSQLs(C36304a.f96654t, "OpenIMAccTypeInfo")};

    /* renamed from: d */
    public C91753f f96656d;

    public C36305b(C91753f fVar) {
        super(fVar, C36304a.f96654t, "OpenIMAccTypeInfo", (String[]) null);
        this.f96656d = fVar;
    }

    /* renamed from: jo */
    public boolean replace(C36304a aVar) {
        aVar.field_updateTime = Util.nowSecond();
        return super.replace(aVar);
    }
}
