package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.d */
public final /* synthetic */ class C21131d {
    /* renamed from: a */
    public static MessageCodec<Object> m23517a() {
        return GeneratedAndroidWebView.WebChromeClientHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23518b(GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webChromeClientHostApi.create(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static void m23519c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebChromeClientHostApi.create", m23517a());
        if (webChromeClientHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$WebChromeClientHostApi$$a(webChromeClientHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
