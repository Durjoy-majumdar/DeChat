package pr3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pr3.b */
public class C35626b {
    /* renamed from: a */
    public static void m40780a(int i) {
        Log.m105925i("BigImageReporter", "alvinluo reportLoadError errCode: %d", Integer.valueOf(i));
        if (i == 4) {
            C115669n.INSTANCE.mo175913w(896, 2, 1);
        } else if (i == 5) {
            C115669n.INSTANCE.mo175913w(896, 3, 1);
        }
    }
}
