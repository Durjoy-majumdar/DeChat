package ve0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: ve0.b */
public final class C14440b {

    /* renamed from: a */
    public static long f40054a = 86400;

    static {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("OpenImKefuContactUpdateInterval_Second", 86400);
        if (b > 0) {
            f40054a = (long) b;
        }
        Log.m105924i("MicroMsg.OpenImKefuConfigManager", "alvinluo initOpenImKefuConfig configUpdateInterval: " + b + ", finalUpdateInterval: " + f40054a);
    }
}
