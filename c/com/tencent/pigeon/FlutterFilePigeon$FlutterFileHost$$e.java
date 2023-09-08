package com.tencent.pigeon;

import com.tencent.pigeon.FlutterFilePigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterFilePigeon$FlutterFileHost$$e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterFilePigeon.FlutterFileHost f349153a;

    public /* synthetic */ FlutterFilePigeon$FlutterFileHost$$e(FlutterFilePigeon.FlutterFileHost flutterFileHost) {
        this.f349153a = flutterFileHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterFilePigeon.FlutterFileHost.CC.m163976f(this.f349153a, obj, reply);
    }
}
