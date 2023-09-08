package com.tencent.pigeon;

import com.tencent.pigeon.FlutterHostAssetPigeon;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.c */
public final /* synthetic */ class C19927c {
    /* renamed from: a */
    public static MessageCodec<Object> m21714a() {
        return FlutterHostAssetPigeon.FlutterHostAssetHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21715b(FlutterHostAssetPigeon.FlutterHostAssetHost flutterHostAssetHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                hashMap.put("result", flutterHostAssetHost.load(str));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("keyArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterHostAssetPigeon.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m21716c(FlutterHostAssetPigeon.FlutterHostAssetHost flutterHostAssetHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    hashMap.put("result", flutterHostAssetHost.loadString(str, bool));
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("cacheArg unexpectedly null.");
            }
            throw new NullPointerException("keyArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterHostAssetPigeon.wrapError(e));
        }
    }

    /* renamed from: d */
    public static void m21717d(BinaryMessenger binaryMessenger, FlutterHostAssetPigeon.FlutterHostAssetHost flutterHostAssetHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterHostAssetHost.load", m21714a());
        if (flutterHostAssetHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterHostAssetPigeon$FlutterHostAssetHost$$a(flutterHostAssetHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterHostAssetHost.loadString", m21714a());
        if (flutterHostAssetHost != null) {
            basicMessageChannel2.setMessageHandler(new FlutterHostAssetPigeon$FlutterHostAssetHost$$b(flutterHostAssetHost));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
