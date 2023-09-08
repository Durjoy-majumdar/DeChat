package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Looper;
import ap0.C79620c;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C29636c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lu3.C34379c;
import p969gc.C87175c;
import p969gc.C87176d;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$c */
public final class AppLaunchPrepareProcess$$c extends MTimerHandler {

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$c$a */
    public class C83260a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ String f243285d;

        /* renamed from: e */
        public final /* synthetic */ QualitySession f243286e;

        public C83260a(String str, QualitySession qualitySession) {
            this.f243285d = str;
            this.f243286e = qualitySession;
        }

        public boolean onTimerExpired() {
            C29636c cVar;
            C87176d dVar = C87176d.f252818a;
            C87175c b = dVar.mo121614b(this.f243285d, false);
            if (b instanceof C79620c) {
                ((C79620c) b).mo109759b(this.f243286e);
            }
            dVar.mo121613a(this.f243285d);
            C83297c cVar2 = C83297c.f243433a;
            String str = this.f243285d;
            C87412m.m108594g(str, "instanceId");
            CopyOnWriteArrayList<C83302d> copyOnWriteArrayList = C83297c.f243434b;
            ArrayList arrayList = new ArrayList();
            Iterator<C83302d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C83302d next = it.next();
                if (C87412m.m108589b(next.f243451a, str)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((C83302d) it4.next()).f243453c);
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((C34379c) it5.next()).cancel(true);
            }
            CopyOnWriteArrayList<C83302d> copyOnWriteArrayList2 = C83297c.f243434b;
            copyOnWriteArrayList2.removeAll(arrayList);
            Log.m105924i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "releaseByInstanceId: remaining size = " + copyOnWriteArrayList2.size());
            AppLaunchPrepareProcess.f243225U0.remove(this.f243285d);
            AppLaunchPrepareProcess k = AppLaunchPrepareProcess.m102199k(this.f243285d, true);
            if (k != null) {
                String str2 = k.f243263p;
                WxaAttributes.WxaVersionInfo wxaVersionInfo = k.f243276z;
                C83606m1.m102639c(23, str2, wxaVersionInfo == null ? 0 : wxaVersionInfo.f239452d, k.f243265q, k.f243227A);
            }
            AppBrandProcessesManager I = AppBrandProcessesManager.m103869I();
            String str3 = this.f243285d;
            if (!(str3 == null || str3.length() == 0)) {
                List j = I.mo111395j();
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(j, 10));
                Iterator it6 = j.iterator();
                loop3:
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    C80250c cVar3 = (C80250c) it6.next();
                    Iterable<C80264l> f = cVar3 != null ? cVar3.mo111361f() : null;
                    if (f == null) {
                        f = C64186f0.f181907d;
                    }
                    for (C80264l lVar : f) {
                        if (C87412m.m108589b(lVar.f234971g, str3)) {
                            break loop3;
                        }
                    }
                    arrayList3.add(C13598b0.f38549a);
                }
                if (lVar == null && (cVar = (C29636c) C86312j.m106911c(C29636c.class)) != null) {
                    Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "AutoReleaseTimer timeout, remove LaunchParcel in AppBrandLaunchParcelStoreService for instanceId:%s", this.f243285d);
                    String str4 = this.f243285d;
                    cVar.getClass();
                    C29636c.vx0(cVar, str4, (LaunchParcel) null, 2, (Object) null);
                }
                return false;
            }
            lVar = null;
            Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "AutoReleaseTimer timeout, remove LaunchParcel in AppBrandLaunchParcelStoreService for instanceId:%s", this.f243285d);
            String str42 = this.f243285d;
            cVar.getClass();
            C29636c.vx0(cVar, str42, (LaunchParcel) null, 2, (Object) null);
            return false;
        }
    }

    public AppLaunchPrepareProcess$$c(String str, QualitySession qualitySession) {
        super(Looper.getMainLooper(), (MTimerHandler.CallBack) new C83260a(str, qualitySession), false);
    }
}
