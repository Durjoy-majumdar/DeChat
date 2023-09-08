package com.tencent.pigeon;

import com.tencent.pigeon.FlutterActionBarPigeon;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.a */
public final /* synthetic */ class C19926a {
    /* renamed from: a */
    public static MessageCodec<Object> m21711a() {
        return FlutterActionBarPigeon.FlutterActionBarHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21712b(FlutterActionBarPigeon.FlutterActionBarHost flutterActionBarHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterActionBarPigeon.FlutterActionBarConfig flutterActionBarConfig = (FlutterActionBarPigeon.FlutterActionBarConfig) ((ArrayList) obj).get(0);
            if (flutterActionBarConfig != null) {
                flutterActionBarHost.updateConfig(flutterActionBarConfig);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("configArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterActionBarPigeon.wrapError(e));
        }
    }

    /* renamed from: c */
    public static void m21713c(BinaryMessenger binaryMessenger, FlutterActionBarPigeon.FlutterActionBarHost flutterActionBarHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterActionBarHost.updateConfig", m21711a());
        if (flutterActionBarHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterActionBarPigeon$FlutterActionBarHost$$a(flutterActionBarHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
