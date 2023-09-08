package com.tencent.pigeon;

import com.tencent.pigeon.FlutterNavigatorPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterNavigatorPigeon$FlutterNavigatorHost$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterNavigatorPigeon.FlutterNavigatorHost f320055a;

    public /* synthetic */ FlutterNavigatorPigeon$FlutterNavigatorHost$$b(FlutterNavigatorPigeon.FlutterNavigatorHost flutterNavigatorHost) {
        this.f320055a = flutterNavigatorHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144600c(this.f320055a, obj, reply);
    }
}
