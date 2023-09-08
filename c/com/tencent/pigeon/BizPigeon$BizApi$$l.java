package com.tencent.pigeon;

import com.tencent.pigeon.BizPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class BizPigeon$BizApi$$l implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ BizPigeon.BizApi f56780a;

    public /* synthetic */ BizPigeon$BizApi$$l(BizPigeon.BizApi bizApi) {
        this.f56780a = bizApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        BizPigeon.BizApi.CC.m21678d(this.f56780a, obj, reply);
    }
}
