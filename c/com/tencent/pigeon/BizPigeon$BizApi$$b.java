package com.tencent.pigeon;

import com.tencent.pigeon.BizPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class BizPigeon$BizApi$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ BizPigeon.BizApi f56761a;

    public /* synthetic */ BizPigeon$BizApi$$b(BizPigeon.BizApi bizApi) {
        this.f56761a = bizApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        BizPigeon.BizApi.CC.m21687m(this.f56761a, obj, reply);
    }
}
