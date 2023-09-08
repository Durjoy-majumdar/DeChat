package wc3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wc3.k0 */
public class C78537k0 {

    /* renamed from: b */
    public static boolean f230022b;

    /* renamed from: a */
    public boolean f230023a = false;

    public C78537k0(String str) {
    }

    /* renamed from: a */
    public final boolean mo108479a(String str) {
        if (f230022b) {
            Log.m105925i("MicroMsg.SplashOptimizing", "[%s], check cancel", "MicroMsg.LauncherUI");
            return false;
        } else if (!this.f230023a) {
            return false;
        } else {
            Log.m105925i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", "MicroMsg.LauncherUI", str);
            return true;
        }
    }
}
