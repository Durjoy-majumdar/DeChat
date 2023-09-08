package com.tencent.pigeon;

import com.tencent.pigeon.FlutterNavigatorPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterNavigatorPigeon$FlutterNavigatorHost$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterNavigatorPigeon.FlutterNavigatorHost f320056a;

    public /* synthetic */ FlutterNavigatorPigeon$FlutterNavigatorHost$$c(FlutterNavigatorPigeon.FlutterNavigatorHost flutterNavigatorHost) {
        this.f320056a = flutterNavigatorHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144601d(this.f320056a, obj, reply);
    }
}
