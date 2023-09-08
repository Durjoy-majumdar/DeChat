package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.a */
public final /* synthetic */ class C21128a {
    /* renamed from: a */
    public static MessageCodec<Object> m23507a() {
        return GeneratedAndroidWebView.DownloadListenerHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23508b(GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                downloadListenerHostApi.create(Long.valueOf(number.longValue()));
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
    public static void m23509c(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.DownloadListenerHostApi.create", m23507a());
        if (downloadListenerHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$DownloadListenerHostApi$$a(downloadListenerHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
