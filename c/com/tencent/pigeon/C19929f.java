package com.tencent.pigeon;

import com.tencent.pigeon.FlutterPlatformPigeon;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.f */
public final /* synthetic */ class C19929f {
    /* renamed from: a */
    public static MessageCodec<Object> m21726a() {
        return FlutterPlatformPigeon.FlutterPlatformChannelCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21727b(FlutterPlatformPigeon.FlutterPlatformChannel flutterPlatformChannel, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterPlatformChannel.getAppVersion());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterPlatformPigeon.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: c */
    public static void m21728c(BinaryMessenger binaryMessenger, FlutterPlatformPigeon.FlutterPlatformChannel flutterPlatformChannel) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterPlatformChannel.getAppVersion", m21726a());
        if (flutterPlatformChannel != null) {
            basicMessageChannel.setMessageHandler(new FlutterPlatformPigeon$FlutterPlatformChannel$$a(flutterPlatformChannel));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
