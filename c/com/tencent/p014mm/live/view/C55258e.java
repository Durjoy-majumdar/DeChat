package com.tencent.p014mm.live.view;

import android.os.Bundle;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C45272n;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.live.view.e */
public final class C55258e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorPluginLayout f157371d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55258e(LiveVisitorPluginLayout liveVisitorPluginLayout) {
        super(0);
        this.f157371d = liveVisitorPluginLayout;
    }

    public Object invoke() {
        C45272n nVar = this.f157371d.f157337p;
        if (nVar != null) {
            nVar.mo70807x0();
        }
        LiveVisitorPluginLayout liveVisitorPluginLayout = this.f157371d;
        liveVisitorPluginLayout.getClass();
        int i = (int) RoomLiveService.f157203n.f139284e;
        Log.m105924i("MicroMsg.LiveCoreVisitor", "checkAnchorStatus:" + i);
        if (liveVisitorPluginLayout.f157319D) {
            C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_ANCHOR_EXCEPTION, (Bundle) null, 2, (Object) null);
        } else if (i == 0) {
            C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_ANCHOR_RECOVERY, (Bundle) null, 2, (Object) null);
        } else if (C61926c.m72696u(i, 1)) {
            C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_ANCHOR_EXCEPTION, (Bundle) null, 2, (Object) null);
        } else if (C61926c.m72696u(i, 2)) {
            C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_ANCHOR_EXCEPTION, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
