package vl2;

import com.tencent.p014mm.autogen.events.AppMsgInsertEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75604z3;
import f40.C86709a0;
import gy3.C87412m;
import java.util.List;
import z04.C112550d0;

/* renamed from: vl2.g */
public final class C37753g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object f100000d;

    public C37753g(Object obj) {
        this.f100000d = obj;
    }

    public final void run() {
        Object obj = this.f100000d;
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        List<String> U = C112550d0.m153785U((String) obj, new String[]{","}, false, 0, 6, (Object) null);
        Log.m105925i("MicroMsg.OfflineScanManager", "alvinluo notifyMessage localStr: %d, context size: %d", Integer.valueOf(((String) this.f100000d).length()), Integer.valueOf(U.size()));
        for (String str : U) {
            if (str.length() > 0) {
                Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo insertOfflineScanMessage");
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108749c3("notifymessage");
                f4Var.mo108740T2(0);
                f4Var.mo100991d(3);
                f4Var.setType(721420337);
                f4Var.mo108733M2(C75604z3.m90844p());
                f4Var.mo108732L2(str);
                C75604z3.m90852x(f4Var);
                AppMsgInsertEvent appMsgInsertEvent = new AppMsgInsertEvent();
                appMsgInsertEvent.f78718d.f78719a = f4Var;
                appMsgInsertEvent.publish();
            } else {
                Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo notifyOfflineScanMessage context is empty, ignore");
            }
        }
        Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo clearOfflineScanMessage");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, (Object) null);
    }
}
