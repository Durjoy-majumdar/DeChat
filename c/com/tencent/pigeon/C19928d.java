package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMMKVPigeon;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.d */
public final /* synthetic */ class C19928d {
    /* renamed from: a */
    public static MessageCodec<Object> m21718a() {
        return FlutterMMKVPigeon.FlutterMMKVHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21719b(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterStringRequest flutterStringRequest = (FlutterMMKVPigeon.FlutterStringRequest) ((ArrayList) obj).get(0);
            if (flutterStringRequest != null) {
                hashMap.put("result", flutterMMKVHost.getString(flutterStringRequest));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m21720c(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterStringRequest flutterStringRequest = (FlutterMMKVPigeon.FlutterStringRequest) ((ArrayList) obj).get(0);
            if (flutterStringRequest != null) {
                flutterMMKVHost.putString(flutterStringRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m21721d(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterBoolRequest flutterBoolRequest = (FlutterMMKVPigeon.FlutterBoolRequest) ((ArrayList) obj).get(0);
            if (flutterBoolRequest != null) {
                hashMap.put("result", flutterMMKVHost.getBool(flutterBoolRequest));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m21722e(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterBoolRequest flutterBoolRequest = (FlutterMMKVPigeon.FlutterBoolRequest) ((ArrayList) obj).get(0);
            if (flutterBoolRequest != null) {
                flutterMMKVHost.putBool(flutterBoolRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m21723f(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterIntRequest flutterIntRequest = (FlutterMMKVPigeon.FlutterIntRequest) ((ArrayList) obj).get(0);
            if (flutterIntRequest != null) {
                hashMap.put("result", flutterMMKVHost.getInt(flutterIntRequest));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m21724g(FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            FlutterMMKVPigeon.FlutterIntRequest flutterIntRequest = (FlutterMMKVPigeon.FlutterIntRequest) ((ArrayList) obj).get(0);
            if (flutterIntRequest != null) {
                flutterMMKVHost.putInt(flutterIntRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVPigeon.wrapError(e));
        }
    }

    /* renamed from: h */
    public static void m21725h(BinaryMessenger binaryMessenger, FlutterMMKVPigeon.FlutterMMKVHost flutterMMKVHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.getString", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$a(flutterMMKVHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.putString", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel2.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$b(flutterMMKVHost));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.getBool", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel3.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$c(flutterMMKVHost));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.putBool", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel4.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$d(flutterMMKVHost));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.getInt", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel5.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$e(flutterMMKVHost));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVHost.putInt", m21718a());
        if (flutterMMKVHost != null) {
            basicMessageChannel6.setMessageHandler(new FlutterMMKVPigeon$FlutterMMKVHost$$f(flutterMMKVHost));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
