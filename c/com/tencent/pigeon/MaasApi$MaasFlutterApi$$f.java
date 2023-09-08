package com.tencent.pigeon;

import com.tencent.pigeon.MaasApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MaasApi$MaasFlutterApi$$f implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MaasApi.MaasFlutterApi f74904a;

    public /* synthetic */ MaasApi$MaasFlutterApi$$f(MaasApi.MaasFlutterApi maasFlutterApi) {
        this.f74904a = maasFlutterApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MaasApi.MaasFlutterApi.lambda$setup$5(this.f74904a, obj, reply);
    }
}
