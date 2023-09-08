package com.tencent.pigeon;

import com.tencent.pigeon.MaasApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MaasApi$MaasFlutterApi$$e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MaasApi.MaasFlutterApi f74903a;

    public /* synthetic */ MaasApi$MaasFlutterApi$$e(MaasApi.MaasFlutterApi maasFlutterApi) {
        this.f74903a = maasFlutterApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MaasApi.MaasFlutterApi.lambda$setup$4(this.f74903a, obj, reply);
    }
}
