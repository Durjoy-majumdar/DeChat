package com.tencent.pigeon;

import com.tencent.pigeon.MaasApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MaasApi$MaasFlutterApi$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MaasApi.MaasFlutterApi f74900a;

    public /* synthetic */ MaasApi$MaasFlutterApi$$b(MaasApi.MaasFlutterApi maasFlutterApi) {
        this.f74900a = maasFlutterApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MaasApi.MaasFlutterApi.lambda$setup$1(this.f74900a, obj, reply);
    }
}
