package com.tencent.pigeon;

import com.tencent.pigeon.FlutterNavigatorPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterNavigatorPigeon$FlutterNavigatorHost$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterNavigatorPigeon.FlutterNavigatorHost f320054a;

    public /* synthetic */ FlutterNavigatorPigeon$FlutterNavigatorHost$$a(FlutterNavigatorPigeon.FlutterNavigatorHost flutterNavigatorHost) {
        this.f320054a = flutterNavigatorHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144599b(this.f320054a, obj, reply);
    }
}
