package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAccountPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAccountPigeon$FlutterAccountHost$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAccountPigeon.FlutterAccountHost f74832a;

    public /* synthetic */ FlutterAccountPigeon$FlutterAccountHost$$b(FlutterAccountPigeon.FlutterAccountHost flutterAccountHost) {
        this.f74832a = flutterAccountHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAccountPigeon.FlutterAccountHost.CC.m35782c(this.f74832a, obj, reply);
    }
}
