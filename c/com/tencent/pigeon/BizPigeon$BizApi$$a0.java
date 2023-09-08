package com.tencent.pigeon;

import com.tencent.pigeon.BizPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class BizPigeon$BizApi$$a0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ BizPigeon.BizApi f56760a;

    public /* synthetic */ BizPigeon$BizApi$$a0(BizPigeon.BizApi bizApi) {
        this.f56760a = bizApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        BizPigeon.BizApi.CC.m21667G(this.f56760a, obj, reply);
    }
}
