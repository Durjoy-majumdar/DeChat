package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAPMApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAPMApi$WeAPMApi$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAPMApi.WeAPMApi f349144a;

    public /* synthetic */ FlutterAPMApi$WeAPMApi$$c(FlutterAPMApi.WeAPMApi weAPMApi) {
        this.f349144a = weAPMApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAPMApi.WeAPMApi.CC.m163966d(this.f349144a, obj, reply);
    }
}
