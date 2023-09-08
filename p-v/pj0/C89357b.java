package pj0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import nj0.C88971k;
import p206nj.C88957l;
import p416qd.C89590b;
import p910lj.C76701a;
import zj0.C91763d;

/* renamed from: pj0.b */
public class C89357b implements C89590b.C89592b {
    /* renamed from: a */
    public String mo123712a(String str) {
        return C88957l.m111071g(str);
    }

    public void loadLibrary(String str) {
        boolean z = true;
        if ((!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG && !WeChatEnvironment.hasDebugger()) || !"magicbrush".equals(str) || !((Boolean) C88971k.m111126i("localso").mo123353e()).booleanValue()) {
            try {
                Log.m105925i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
                ClassLoader classLoader = C89362g.f257343a;
                long currentTicks = Util.currentTicks();
                C88957l.m111079o(str, classLoader);
                Log.m105925i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "hy: loading library %s using %d ms", str, Long.valueOf(Util.ticksToNow(currentTicks)));
            } catch (UnsatisfiedLinkError e) {
                Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e, "hy: link %s error!!", str);
                C91763d.m115295a(MMApplicationContext.getContext());
            }
        } else if (C89362g.f257344b) {
            Log.m105925i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s, skip", "magicbrush");
        } else {
            C89362g.f257344b = true;
            try {
                Log.m105925i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s", "magicbrush");
                System.load(C89362g.m111693a("libmagicbrush.so", "/sdcard/magicbrush/libmagicbrush.so").mo119971i());
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e2, "load local so failed", new Object[0]);
                z = false;
            }
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) z ? "local so succeed: magicbrush" : "local so failed: magicbrush", 0).show();
        }
    }
}
