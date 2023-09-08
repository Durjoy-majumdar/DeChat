package com.tencent.pigeon;

import com.tencent.pigeon.FlutterFilePigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterFilePigeon$FlutterFileHost$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterFilePigeon.FlutterFileHost f349149a;

    public /* synthetic */ FlutterFilePigeon$FlutterFileHost$$a(FlutterFilePigeon.FlutterFileHost flutterFileHost) {
        this.f349149a = flutterFileHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterFilePigeon.FlutterFileHost.CC.m163972b(this.f349149a, obj, reply);
    }
}
