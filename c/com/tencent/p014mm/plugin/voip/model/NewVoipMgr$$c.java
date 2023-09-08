package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import l33.C109247e;
import p749xh.C112150i9;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$c */
public final /* synthetic */ class NewVoipMgr$$c implements Runnable {
    public final void run() {
        C106369n w = C109247e.xx0().mo152624w();
        Log.m105918d("MicroMsg.VoIPBubbleHelper", "markRoomAlive() called with: voipInfo = " + w);
        C106357m mVar = C106357m.f317386a;
        C112150i9 e = mVar.mo152648e(w);
        if (e != null) {
            e.mo163930G2(System.currentTimeMillis());
            mVar.mo152653p(e);
        }
    }
}
