package r80;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: r80.q */
public final class C110537q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330550d;

    public C110537q(C110538r rVar) {
        this.f330550d = rVar;
    }

    public final void run() {
        String str = this.f330550d.f330612w;
        Log.m105924i(str, "delay check frameDraw: " + this.f330550d.f330594i0);
        if (!this.f330550d.f330594i0) {
            Log.m105920e(this.f330550d.f330612w, "after 1000 ms, first frame stil not draw!!!");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawTimeout");
            C115669n.INSTANCE.mo175913w(986, 54, 1);
        }
    }
}
