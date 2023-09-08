package com.tencent.pigeon;

import com.tencent.pigeon.BizPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class BizPigeon$BizApi$$m implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ BizPigeon.BizApi f56781a;

    public /* synthetic */ BizPigeon$BizApi$$m(BizPigeon.BizApi bizApi) {
        this.f56781a = bizApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        BizPigeon.BizApi.CC.m21697w(this.f56781a, obj, reply);
    }
}
