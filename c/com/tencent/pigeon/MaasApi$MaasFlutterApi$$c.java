package com.tencent.pigeon;

import com.tencent.pigeon.MaasApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MaasApi$MaasFlutterApi$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MaasApi.MaasFlutterApi f74901a;

    public /* synthetic */ MaasApi$MaasFlutterApi$$c(MaasApi.MaasFlutterApi maasFlutterApi) {
        this.f74901a = maasFlutterApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MaasApi.MaasFlutterApi.lambda$setup$2(this.f74901a, obj, reply);
    }
}
