package com.tencent.pigeon;

import com.tencent.pigeon.FlutterFilePigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterFilePigeon$FlutterFileHost$$d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterFilePigeon.FlutterFileHost f349152a;

    public /* synthetic */ FlutterFilePigeon$FlutterFileHost$$d(FlutterFilePigeon.FlutterFileHost flutterFileHost) {
        this.f349152a = flutterFileHost;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterFilePigeon.FlutterFileHost.CC.m163975e(this.f349152a, obj, reply);
    }
}
