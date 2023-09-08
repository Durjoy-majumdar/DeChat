package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.g */
public final /* synthetic */ class C21133g {
    /* renamed from: a */
    public static MessageCodec<Object> m23524a() {
        return GeneratedAndroidWebView.WebViewClientHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23525b(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webViewClientHostApi.create(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("shouldOverrideUrlLoadingArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static void m23526c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewClientHostApi.create", m23524a());
        if (webViewClientHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$WebViewClientHostApi$$a(webViewClientHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
