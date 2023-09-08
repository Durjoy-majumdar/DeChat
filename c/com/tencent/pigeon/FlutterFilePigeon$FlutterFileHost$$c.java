package com.tencent.pigeon;

import com.tencent.pigeon.FlutterFilePigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterFilePigeon$FlutterFileHost$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterFilePigeon.FlutterFileHost f349151a;

    public /* synthetic */ FlutterFilePigeon$FlutterFileHost$$c(FlutterFilePigeon.FlutterFileHost flutterFileHost) {
        this.f349151a = flutterFileHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterFilePigeon.FlutterFileHost.CC.m163974d(this.f349151a, obj, reply);
    }
}
