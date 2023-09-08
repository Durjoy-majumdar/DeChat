package com.tencent.pigeon;

import com.tencent.pigeon.FlutterExptPigeon;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.b */
public final /* synthetic */ class C116359b {
    /* renamed from: a */
    public static MessageCodec<Object> m163990a() {
        return FlutterExptPigeon.FlutterExptHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m163991b(FlutterExptPigeon.FlutterExptHost flutterExptHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterExptPigeon.FlutterExptRequest flutterExptRequest = (FlutterExptPigeon.FlutterExptRequest) ((ArrayList) obj).get(0);
            if (flutterExptRequest != null) {
                hashMap.put("result", flutterExptHost.get(flutterExptRequest));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterExptPigeon.wrapError(e));
        }
    }

    /* renamed from: c */
    public static void m163992c(BinaryMessenger binaryMessenger, FlutterExptPigeon.FlutterExptHost flutterExptHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterExptHost.get", m163990a());
        if (flutterExptHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterExptPigeon$FlutterExptHost$$a(flutterExptHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
