package com.tencent.pigeon;

import com.tencent.pigeon.FlutterFilePigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterFilePigeon$FlutterFileHost$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterFilePigeon.FlutterFileHost f349150a;

    public /* synthetic */ FlutterFilePigeon$FlutterFileHost$$b(FlutterFilePigeon.FlutterFileHost flutterFileHost) {
        this.f349150a = flutterFileHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterFilePigeon.FlutterFileHost.CC.m163973c(this.f349150a, obj, reply);
    }
}
