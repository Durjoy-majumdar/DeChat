package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAPMApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAPMApi$WeAPMApi$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAPMApi.WeAPMApi f349142a;

    public /* synthetic */ FlutterAPMApi$WeAPMApi$$a(FlutterAPMApi.WeAPMApi weAPMApi) {
        this.f349142a = weAPMApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAPMApi.WeAPMApi.CC.m163964b(this.f349142a, obj, reply);
    }
}
