package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextClickEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import zj3.C79347d1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p7 */
public class C74169p7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67391b f217716d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217717e;

    public C74169p7(C67391b bVar, C72963f4 f4Var) {
        this.f217716d = bVar;
        this.f217717e = f4Var;
    }

    public void run() {
        C67391b bVar = this.f217716d;
        C72963f4 f4Var = this.f217717e;
        C79347d1 d1Var = (C79347d1) bVar.f193278b.mo102812a(C79347d1.class);
        if (d1Var == null) {
            Log.m105920e("MicroMsg.ChattingItemVoice", "alvinluo ui or ui.transformImp null");
            return;
        }
        int i = d1Var.mo102284H4(f4Var.getMsgId()) ? 2 : d1Var.mo102282C4(f4Var.getMsgId()) ? 3 : !Util.isNullOrNil(d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2())) ? 5 : 1;
        Log.m105925i("MicroMsg.ChattingItemVoice", "alvinluo TransformText report clickScene: %d, msgId: %d", Integer.valueOf(i), Long.valueOf(f4Var.getMsgId()));
        ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new ExtVoiceTransformTextClickEvent();
        ExtVoiceTransformTextClickEvent.C67688a aVar = extVoiceTransformTextClickEvent.f193576d;
        aVar.f193578b = 1;
        aVar.f193579c = i;
        aVar.f193577a = f4Var.mo108765s2();
        extVoiceTransformTextClickEvent.publish();
    }
}
