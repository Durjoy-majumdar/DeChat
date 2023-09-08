package com.tencent.pigeon;

import com.tencent.pigeon.BizPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class BizPigeon$BizApi$$d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ BizPigeon.BizApi f56765a;

    public /* synthetic */ BizPigeon$BizApi$$d(BizPigeon.BizApi bizApi) {
        this.f56765a = bizApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        BizPigeon.BizApi.CC.m21689o(this.f56765a, obj, reply);
    }
}
