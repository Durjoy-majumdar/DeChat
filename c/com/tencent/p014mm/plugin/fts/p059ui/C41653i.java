package com.tencent.p014mm.plugin.fts.p059ui;

import com.tencent.p014mm.autogen.events.BizPreSearchEvent;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.fts.ui.i */
public class C41653i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizPreSearchEvent f112092d;

    /* renamed from: e */
    public final /* synthetic */ FTSAddFriendUI f112093e;

    public C41653i(FTSAddFriendUI fTSAddFriendUI, BizPreSearchEvent bizPreSearchEvent) {
        this.f112093e = fTSAddFriendUI;
        this.f112092d = bizPreSearchEvent;
    }

    public void run() {
        FTSAddFriendUI fTSAddFriendUI = this.f112093e;
        int i = FTSAddFriendUI.f52662Q;
        fTSAddFriendUI.getClass();
        MMHandlerThread.postToMainThread(new C41654j(fTSAddFriendUI));
        if (!this.f112092d.f107376e.f107384a) {
            this.f112093e.f52672J = -1;
        } else {
            this.f112093e.f52672J = 1;
        }
        FTSAddFriendUI.m19566S7(this.f112093e);
    }
}
