package com.tencent.pigeon;

import com.tencent.pigeon.FlutterAccountPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterAccountPigeon$FlutterAccountHost$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterAccountPigeon.FlutterAccountHost f74831a;

    public /* synthetic */ FlutterAccountPigeon$FlutterAccountHost$$a(FlutterAccountPigeon.FlutterAccountHost flutterAccountHost) {
        this.f74831a = flutterAccountHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterAccountPigeon.FlutterAccountHost.CC.m35781b(this.f74831a, obj, reply);
    }
}
