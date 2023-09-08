package uk1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: uk1.f */
public final class C37478f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C37479g f99028d;

    public C37478f(C37479g gVar) {
        this.f99028d = gVar;
    }

    public final void run() {
        C37479g gVar = this.f99028d;
        if (gVar.f99030b == 1) {
            gVar.getClass();
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_PLAY_DESKTOP_BOOLEAN_SYNC, Boolean.TRUE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f).booleanValue();
            Log.m105924i("Finder.FinderLiveMiniWindowReporter", "getPlayDesktopSwitch " + booleanValue);
            if (!booleanValue) {
                this.f99028d.getClass();
                Log.m105924i("Finder.FinderLiveMiniWindowReporter", "skip report enter because user setting");
                return;
            }
        }
        this.f99028d.mo61124b();
    }
}
