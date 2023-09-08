package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.conversation.t1 */
public final class C45009t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122101d;

    public C45009t1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122101d = openImKefuServiceConversationFmUI;
    }

    public final void run() {
        Log.m105924i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo clearKefuServiceConversationUnReadCount");
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.f122101d.f121853d);
    }
}
