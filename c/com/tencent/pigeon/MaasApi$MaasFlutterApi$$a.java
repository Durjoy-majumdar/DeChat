package com.tencent.pigeon;

import com.tencent.pigeon.MaasApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MaasApi$MaasFlutterApi$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MaasApi.MaasFlutterApi f74899a;

    public /* synthetic */ MaasApi$MaasFlutterApi$$a(MaasApi.MaasFlutterApi maasFlutterApi) {
        this.f74899a = maasFlutterApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MaasApi.MaasFlutterApi.lambda$setup$0(this.f74899a, obj, reply);
    }
}
