package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAPMApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAPMApi$WeAPMApi$$d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAPMApi.WeAPMApi f349145a;

    public /* synthetic */ FlutterAPMApi$WeAPMApi$$d(FlutterAPMApi.WeAPMApi weAPMApi) {
        this.f349145a = weAPMApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAPMApi.WeAPMApi.CC.m163967e(this.f349145a, obj, reply);
    }
}
