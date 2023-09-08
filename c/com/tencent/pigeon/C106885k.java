package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.k */
public final /* synthetic */ class C106885k {
    /* renamed from: a */
    public static MessageCodec<Object> m144623a() {
        return VoIPFlutterPluginApi.RouterPluginApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m144624b(VoIPFlutterPluginApi.RouterPluginApi routerPluginApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            routerPluginApi.launchDoubleLinkSettings();
            hashMap.put("result", (Object) null);
        } catch (Error | RuntimeException e) {
            hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: c */
    public static /* synthetic */ void m144625c(VoIPFlutterPluginApi.RouterPluginApi routerPluginApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            VoIPFlutterPluginApi.SnsPostLaunchRequest snsPostLaunchRequest = (VoIPFlutterPluginApi.SnsPostLaunchRequest) ((ArrayList) obj).get(0);
            if (snsPostLaunchRequest != null) {
                routerPluginApi.launchSnsPost(snsPostLaunchRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m144626d(VoIPFlutterPluginApi.RouterPluginApi routerPluginApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            VoIPFlutterPluginApi.UserProfileLaunchRequest userProfileLaunchRequest = (VoIPFlutterPluginApi.UserProfileLaunchRequest) ((ArrayList) obj).get(0);
            if (userProfileLaunchRequest != null) {
                routerPluginApi.launchUserProfile(userProfileLaunchRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m144627e(VoIPFlutterPluginApi.RouterPluginApi routerPluginApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            VoIPFlutterPluginApi.FinderFeedLaunchRequest finderFeedLaunchRequest = (VoIPFlutterPluginApi.FinderFeedLaunchRequest) ((ArrayList) obj).get(0);
            if (finderFeedLaunchRequest != null) {
                routerPluginApi.launchFinderFeed(finderFeedLaunchRequest);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("requestArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", VoIPFlutterPluginApi.wrapError(e));
        }
    }

    /* renamed from: f */
    public static void m144628f(BinaryMessenger binaryMessenger, VoIPFlutterPluginApi.RouterPluginApi routerPluginApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RouterPluginApi.launchDoubleLinkSettings", m144623a());
        if (routerPluginApi != null) {
            basicMessageChannel.setMessageHandler(new VoIPFlutterPluginApi$RouterPluginApi$$a(routerPluginApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RouterPluginApi.launchSnsPost", m144623a());
        if (routerPluginApi != null) {
            basicMessageChannel2.setMessageHandler(new VoIPFlutterPluginApi$RouterPluginApi$$b(routerPluginApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RouterPluginApi.launchUserProfile", m144623a());
        if (routerPluginApi != null) {
            basicMessageChannel3.setMessageHandler(new VoIPFlutterPluginApi$RouterPluginApi$$c(routerPluginApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RouterPluginApi.launchFinderFeed", m144623a());
        if (routerPluginApi != null) {
            basicMessageChannel4.setMessageHandler(new VoIPFlutterPluginApi$RouterPluginApi$$d(routerPluginApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
