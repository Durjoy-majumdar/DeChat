package re0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: re0.h */
public class C36311h extends MAutoStorage<C36310g> {

    /* renamed from: e */
    public static final String[] f96664e = {MAutoStorage.getCreateSQLs(C36310g.f96663p, "OpenIMFinderInfoNew")};

    /* renamed from: d */
    public C91753f f96665d;

    public C36311h(C91753f fVar) {
        super(fVar, C36310g.f96663p, "OpenIMFinderInfoNew", (String[]) null);
        this.f96665d = fVar;
    }

    /* renamed from: jo */
    public boolean replace(C36310g gVar) {
        Log.m105924i("MicroMsg.Openim.OpenIMFinderInfoStg", "replace " + gVar.field_openIMUsername + "," + gVar.field_finder_username);
        return super.replace(gVar);
    }
}
