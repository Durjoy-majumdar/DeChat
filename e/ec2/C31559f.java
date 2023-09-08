package ec2;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import kj2.C117407d;
import kr0.C88262c1;
import lc3.C10485b;
import na3.C88908g;

/* renamed from: ec2.f */
public class C31559f extends IStaticListener<IEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = C10485b.class;
        Class cls2 = C88908g.class;
        if (!((C88908g) C86312j.m106911c(cls2)).mo123296x("labs_nearbylife")) {
            Log.m105924i("MicroMsg.SubCoreNearby", "checkLifeAroundPreload welab not open");
        } else {
            int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("LifeAppLatestVersionValue", 0);
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LIFE_APP_PRE_LOAD_LAST_REQUEST_VERSION_INT;
            int j = i.mo119689j(aVar, 0);
            Log.m105925i("MicroMsg.SubCoreNearby", "checkLifeAroundPreload lifeAroundLatestVersion %d lastRequestLifeAroundVersion %d", Integer.valueOf(b), Integer.valueOf(j));
            if (b > j) {
                int b2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("LifeAppPrefetchTimeThreshold", 259200);
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_LIFE_APP_PRE_LOAD_LAST_REQUEST_TIME_LONG;
                long G = i2.mo119673G(aVar2, 0);
                Log.m105925i("MicroMsg.SubCoreNearby", "checkLifeAroundPreload lastRequestLifeAroundTime %d lifeAroundPreloadInterval %d", Long.valueOf(G), Integer.valueOf(b2));
                if (System.currentTimeMillis() - G > ((long) b2) * 1000) {
                    try {
                        Log.m105924i("MicroMsg.SubCoreNearby", "checkLifeAroundPreload");
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(b));
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
                        ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113580Dm(((C88908g) C86312j.m106911c(cls2)).mo123295sB("labs_nearbylife"), 0);
                        C117407d.INSTANCE.idkeyStat(863, 30, 1, false);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
    }
}
