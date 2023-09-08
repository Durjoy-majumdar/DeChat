package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.c */
public final /* synthetic */ class C21130c {
    /* renamed from: a */
    public static MessageCodec<Object> m23514a() {
        return GeneratedAndroidWebView.JavaScriptChannelHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23515b(GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    javaScriptChannelHostApi.create(Long.valueOf(number.longValue()), str);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("channelNameArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static void m23516c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelHostApi.create", m23514a());
        if (javaScriptChannelHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$JavaScriptChannelHostApi$$a(javaScriptChannelHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
