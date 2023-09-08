package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.b */
public final /* synthetic */ class C21129b {
    /* renamed from: a */
    public static MessageCodec<Object> m23510a() {
        return GeneratedAndroidWebView.FlutterAssetManagerHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23511b(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                hashMap.put("result", flutterAssetManagerHostApi.list(str));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("pathArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m23512c(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                hashMap.put("result", flutterAssetManagerHostApi.getAssetFilePathByName(str));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("nameArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: d */
    public static void m23513d(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAssetManagerHostApi.list", m23510a());
        if (flutterAssetManagerHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$FlutterAssetManagerHostApi$$a(flutterAssetManagerHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAssetManagerHostApi.getAssetFilePathByName", m23510a());
        if (flutterAssetManagerHostApi != null) {
            basicMessageChannel2.setMessageHandler(new GeneratedAndroidWebView$FlutterAssetManagerHostApi$$b(flutterAssetManagerHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
