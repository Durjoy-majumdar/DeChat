package zf2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zf2.i */
public class C16162i implements C80883e<Bundle, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        int i = bundle.getInt("kv_report_key");
        int i2 = bundle.getInt("kv_report_value");
        C115669n.INSTANCE.mo160131h(i, Integer.valueOf(i2));
        Log.m105925i("MicroMsg.ReportKVTask", "report key %d, value %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
