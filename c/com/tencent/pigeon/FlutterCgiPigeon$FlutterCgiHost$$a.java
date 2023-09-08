package com.tencent.pigeon;

import com.tencent.pigeon.FlutterCgiPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterCgiPigeon$FlutterCgiHost$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterCgiPigeon.FlutterCgiHost f250520a;

    public /* synthetic */ FlutterCgiPigeon$FlutterCgiHost$$a(FlutterCgiPigeon.FlutterCgiHost flutterCgiHost) {
        this.f250520a = flutterCgiHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterCgiPigeon.FlutterCgiHost.CC.m106478b(this.f250520a, obj, reply);
    }
}
