package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAPMApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAPMApi$WeAPMApi$$f implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAPMApi.WeAPMApi f349147a;

    public /* synthetic */ FlutterAPMApi$WeAPMApi$$f(FlutterAPMApi.WeAPMApi weAPMApi) {
        this.f349147a = weAPMApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAPMApi.WeAPMApi.CC.m163969g(this.f349147a, obj, reply);
    }
}
