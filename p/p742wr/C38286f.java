package p742wr;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C31896o0;
import f40.C86709a0;

/* renamed from: wr.f */
public class C38286f implements C31896o0.C31897a {
    /* renamed from: aJ */
    public void mo58416aJ(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_UPDATE_TIME_LONG_SYNC;
        if (BuildInfo.CLIENT_VERSION_INT != i) {
            Log.m105924i("MicroMsg.FTS.PluginFTS", "upgrade reset rebuild times to 3");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 5);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        C86709a0.m107528h();
        long G = C86709a0.m107535s().mo121142i().mo119673G(aVar2, 0);
        if (System.currentTimeMillis() - G > 86400000) {
            Log.m105924i("MicroMsg.FTS.PluginFTS", "one day reset rebuild times to 3");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 5);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        Log.m105925i("MicroMsg.FTS.PluginFTS", "no need reset rebuild times to 3 %s preVersion %s", Long.valueOf(G), Integer.valueOf(i));
    }
}
