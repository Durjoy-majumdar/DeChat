package com.tencent.pigeon;

import com.tencent.pigeon.FlutterViewDemoPigeon;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.h */
public final /* synthetic */ class C26954h {
    /* renamed from: a */
    public static MessageCodec<Object> m35908a() {
        return FlutterViewDemoPigeon.FlutterViewDemoHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m35909b(FlutterViewDemoPigeon.FlutterViewDemoHost flutterViewDemoHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            flutterViewDemoHost.switchToView();
            hashMap.put("result", (Object) null);
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterViewDemoPigeon.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: c */
    public static /* synthetic */ void m35910c(FlutterViewDemoPigeon.FlutterViewDemoHost flutterViewDemoHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            flutterViewDemoHost.switchToActivity();
            hashMap.put("result", (Object) null);
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterViewDemoPigeon.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: d */
    public static void m35911d(BinaryMessenger binaryMessenger, FlutterViewDemoPigeon.FlutterViewDemoHost flutterViewDemoHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterViewDemoHost.switchToView", m35908a());
        if (flutterViewDemoHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterViewDemoPigeon$FlutterViewDemoHost$$a(flutterViewDemoHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterViewDemoHost.switchToActivity", m35908a());
        if (flutterViewDemoHost != null) {
            basicMessageChannel2.setMessageHandler(new FlutterViewDemoPigeon$FlutterViewDemoHost$$b(flutterViewDemoHost));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
