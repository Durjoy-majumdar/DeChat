package pj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p416qd.C89590b;
import p927ab.C79485g;

/* renamed from: pj0.h */
public class C89363h extends C79485g {
    /* renamed from: a */
    public void mo109478a() {
        super.mo109478a();
        long currentTicks = Util.currentTicks();
        C89590b.m112028b("gamelog_delegate");
        Log.m105925i("MicroMsg.MBLogDelegateRegistryWC", "dl: load gamelog_delegate [%d]ms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }
}
