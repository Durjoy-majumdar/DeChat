package com.tencent.p014mm.live.view;

import android.os.Bundle;
import d60.C58124b;

/* renamed from: com.tencent.mm.live.view.c */
public final class C55256c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorPluginLayout f157369d;

    public C55256c(LiveVisitorPluginLayout liveVisitorPluginLayout) {
        this.f157369d = liveVisitorPluginLayout;
    }

    public final void run() {
        C58124b.C7172a.m7372a(this.f157369d, C58124b.C58125b.LIVE_CHANGE_FINISHED, (Bundle) null, 2, (Object) null);
    }
}
