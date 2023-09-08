package com.tencent.p014mm.plugin.expt.pageflow;

import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import h81.C8496k;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.d */
public class C2264d {

    /* renamed from: a */
    public static C2264d f12348a;

    /* renamed from: com.tencent.mm.plugin.expt.pageflow.d$a */
    public static class C2265a implements C80883e<Bundle, IPCVoid> {
        private C2265a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("key_page_flow_name");
            int i = bundle.getInt("key_page_flow_type");
            Log.m105925i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver async receive action name[%s-%d-%d] type[%d]", string, Integer.valueOf(bundle.getInt("key_page_flow_hashcode", 0)), Long.valueOf(bundle.getLong("key_page_flow_time_stamp", 0)), Integer.valueOf(i));
            try {
                MMHandlerThread.postToMainThread(new C2263c(this));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMPageFlowSenderByIPCInvoker", e, "post to main thread error? [%s]", e.toString());
            }
            C115669n.INSTANCE.idkeyStat(932, 101, 1, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.expt.pageflow.d$b */
    public static class C2266b implements C80916r<Bundle, IPCVoid> {
        private C2266b() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("key_page_flow_name");
            int i = bundle.getInt("key_page_flow_type");
            int i2 = bundle.getInt("key_page_flow_hashcode", 0);
            long j = bundle.getLong("key_page_flow_time_stamp", 0);
            Log.m105925i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver sync receive action name[%s-%d-%d] type[%d]", string, Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i));
            MMPageFlowService wx02 = MMPageFlowService.wx0();
            C8496k.C8497a a = C8496k.C8497a.m8414a(i);
            wx02.getClass();
            wx02.yx0(string, a, i2, j, Process.myPid());
            return IPCVoid.f10316d;
        }
    }
}
