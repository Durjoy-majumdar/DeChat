package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.f */
public final /* synthetic */ class C21132f {
    /* renamed from: a */
    public static MessageCodec<Object> m23520a() {
        return GeneratedAndroidWebView.WebStorageHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23521b(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webStorageHostApi.create(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m23522c(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webStorageHostApi.deleteAllData(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: d */
    public static void m23523d(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebStorageHostApi.create", m23520a());
        if (webStorageHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$WebStorageHostApi$$a(webStorageHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebStorageHostApi.deleteAllData", m23520a());
        if (webStorageHostApi != null) {
            basicMessageChannel2.setMessageHandler(new GeneratedAndroidWebView$WebStorageHostApi$$b(webStorageHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
