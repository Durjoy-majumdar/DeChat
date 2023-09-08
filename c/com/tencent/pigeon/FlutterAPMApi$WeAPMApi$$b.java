package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAPMApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAPMApi$WeAPMApi$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAPMApi.WeAPMApi f349143a;

    public /* synthetic */ FlutterAPMApi$WeAPMApi$$b(FlutterAPMApi.WeAPMApi weAPMApi) {
        this.f349143a = weAPMApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAPMApi.WeAPMApi.CC.m163965c(this.f349143a, obj, reply);
    }
}
