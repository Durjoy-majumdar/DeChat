package p697tm;

import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandNetworkChangeMessage;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import fy3.C32224a;
import g40.C32315i;
import hi0.C87507t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tm.m1 */
public class C90523m1 implements C32315i {
    public void onNetworkChange(int i) {
        if (C86709a0.m107522a()) {
            if (MMApplicationContext.isMainProcess()) {
                List j = AppBrandProcessesManager.m103869I().mo111395j();
                ArrayList arrayList = new ArrayList();
                for (Object next : j) {
                    if (!((C84310k) next).mo111366k()) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C84310k kVar = (C84310k) it.next();
                    Iterator it4 = ((ArrayList) kVar.mo111360e()).iterator();
                    while (it4.hasNext()) {
                        C80250c.m97639p(kVar, new AppBrandNetworkChangeMessage((String) it4.next()), (C32224a) null, 2, (Object) null);
                    }
                }
            }
            C87507t.m108819a().mo121960b();
        }
    }
}
