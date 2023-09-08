package qj1;

import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: qj1.xh */
public final class C63113xh implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63093wh f179105d;

    public C63113xh(C63093wh whVar) {
        this.f179105d = whVar;
    }

    public final void run() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, Boolean.TRUE);
        LiveBottomSheetPanel liveBottomSheetPanel = this.f179105d.f179049s;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.mo78804d();
        }
        Log.m105924i(this.f179105d.f179047q, "show");
    }
}
