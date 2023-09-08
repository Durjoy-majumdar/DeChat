package com.tencent.pigeon;

import com.tencent.pigeon.FlutterNavigatorPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterNavigatorPigeon$FlutterNavigatorHost$$d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterNavigatorPigeon.FlutterNavigatorHost f320057a;

    public /* synthetic */ FlutterNavigatorPigeon$FlutterNavigatorHost$$d(FlutterNavigatorPigeon.FlutterNavigatorHost flutterNavigatorHost) {
        this.f320057a = flutterNavigatorHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144602e(this.f320057a, obj, reply);
    }
}
