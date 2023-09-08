package r10;

import com.tencent.p014mm.recovery.RecoveryInitializer;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;

/* renamed from: r10.c */
public final class C89859c extends C36244b {
    /* renamed from: b */
    public int mo60583b(ApplicationLike applicationLike) {
        boolean z;
        try {
            z = !RecoveryInitializer.init(applicationLike.getApplication());
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.RecoveryFuse", th, "recovery init fail", new Object[0]);
            if (!BuildInfo.DEBUG) {
                z = false;
            } else {
                throw new RuntimeException(th);
            }
        }
        return z ? 1 : 0;
    }

    /* renamed from: c */
    public String mo60584c() {
        return "recovery";
    }
}
