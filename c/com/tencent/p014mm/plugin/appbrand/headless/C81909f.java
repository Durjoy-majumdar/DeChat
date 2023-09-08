package com.tencent.p014mm.plugin.appbrand.headless;

import android.content.Context;
import android.os.PowerManager;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83436t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86297n;
import di0.C86299o;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.f */
public final class C81909f {

    /* renamed from: a */
    public static final C81909f f240255a = new C81909f();

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.f$a */
    public static final class C81910a implements C86297n {

        /* renamed from: a */
        public final /* synthetic */ PowerManager.WakeLock f240256a;

        /* renamed from: b */
        public final /* synthetic */ C86297n f240257b;

        /* renamed from: c */
        public final /* synthetic */ String f240258c;

        public C81910a(PowerManager.WakeLock wakeLock, C86297n nVar, String str) {
            this.f240256a = wakeLock;
            this.f240257b = nVar;
            this.f240258c = str;
        }

        /* renamed from: a */
        public void mo1541a(int i, String str) {
            PowerManager.WakeLock wakeLock = this.f240256a;
            if (wakeLock != null) {
                C81909f.m100595a(C81909f.f240255a, wakeLock, this.f240258c);
            }
            C86297n nVar = this.f240257b;
            if (nVar != null) {
                nVar.mo1541a(i, str);
            }
        }

        public void onSuccess() {
            PowerManager.WakeLock wakeLock = this.f240256a;
            if (wakeLock != null) {
                C81909f.m100595a(C81909f.f240255a, wakeLock, this.f240258c);
            }
            C86297n nVar = this.f240257b;
            if (nVar != null) {
                nVar.onSuccess();
            }
        }
    }

    /* renamed from: a */
    public static final void m100595a(C81909f fVar, PowerManager.WakeLock wakeLock, String str) {
        fVar.getClass();
        if (wakeLock.isHeld()) {
            Log.m105924i("MicroMsg.AppBrandHeadlessStartService", str + ", releaseWakeLock");
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* renamed from: b */
    public final void mo114315b(C86299o oVar, C86297n nVar, C81917m mVar) {
        C86299o oVar2 = oVar;
        C87412m.m108594g(oVar2, "bundle");
        String str = "HeadlessStart[" + oVar2.f250930b + "][" + oVar2.f250931c + "][" + oVar2.f250936h + ']';
        Context context = MMApplicationContext.getContext();
        PowerManager.WakeLock wakeLock = null;
        Object systemService = context != null ? context.getSystemService("power") : null;
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(1, "wx:appbrand_headless_start");
            wakeLock.setReferenceCounted(false);
            if (!wakeLock.isHeld()) {
                Log.m105924i("MicroMsg.AppBrandHeadlessStartService", str + ", acquireWakeLock");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(60000L);
                C117292a.m165358d(wakeLock, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                C60958c.f173611a.set(aVar);
                long longValue = ((Long) aVar.mo10231a(0)).longValue();
                C60958c.m71441a();
                wakeLock.acquire(longValue);
                C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            }
        }
        C81910a aVar2 = new C81910a(wakeLock, nVar, str);
        int hashCode = oVar.hashCode();
        long currentTicks = Util.currentTicks();
        Log.m105924i("MicroMsg.AppBrandHeadlessStartService", "start with id:" + hashCode + ", username:" + oVar2.f250929a + ", appId:" + oVar2.f250930b + ", versionType:" + oVar2.f250931c + ", scene:" + oVar2.f250939k);
        C81908e eVar = new C81908e(hashCode, currentTicks, aVar2);
        new C83436t(hashCode, oVar, new C81911g(hashCode, eVar, mVar), eVar, false).mo115726a();
    }
}
