package im3;

import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import p961ee.C86507b;
import p981ie.C87705i;

public final class a$$c implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {

    /* renamed from: a */
    public final C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> f351085a;

    public a$$c(C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> iVar) {
        this.f351085a = iVar;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        if (aVar == null || ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343059d == Process.myPid()) {
            this.f351085a.accept(aVar);
            Log.m105924i("MicroMsg.TopThreadDumpTask", "Dump local process finished");
            return;
        }
        int i = ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343059d;
        ArrayList arrayList = new ArrayList();
        for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a) {
            if (((int) C86507b.m107278i(((Long) item.f343211a).longValue(), aVar.f343208d / 10)) <= 0) {
                break;
            }
            arrayList.add(Integer.valueOf(item.f343066b));
        }
        if (arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.TopThreadDumpTask", "Dump skip, no tid needs");
            C117199a.m165282c("Skip dump: no tid needed", 0);
            return;
        }
        C117199a.m165280a(i, arrayList);
    }
}
