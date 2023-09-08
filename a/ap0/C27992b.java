package ap0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ap0.b */
public final class C27992b {
    /* renamed from: a */
    public static final void m38051a(int i) {
        Log.m105925i("MicroMsg.AppBrandParallelTaskReporter", "report: key = [%d]", Integer.valueOf(i));
        if (i >= 0 && i <= 255) {
            C115669n.INSTANCE.mo175911u(1248, i);
        }
    }
}
