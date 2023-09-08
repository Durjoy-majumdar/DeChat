package com.tencent.pigeon;

import com.tencent.pigeon.FlutterSettingsApi;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.g */
public final /* synthetic */ class C26953g {
    /* renamed from: a */
    public static MessageCodec<Object> m35884a() {
        return FlutterSettingsApi.FlutterSettingApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m35885b(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getVoicePlayMode());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: c */
    public static /* synthetic */ void m35886c(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getSendMsgInKeybaord());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: d */
    public static /* synthetic */ void m35887d(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getVoipRingtone());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: e */
    public static /* synthetic */ void m35888e(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getSex());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: f */
    public static /* synthetic */ void m35889f(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getDistrict());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: g */
    public static /* synthetic */ void m35890g(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getSignature());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: h */
    public static /* synthetic */ void m35891h(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                flutterSettingApi.setSex(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("sexArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m35892i(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            flutterSettingApi.saveUserInfo();
            hashMap.put("result", (Object) null);
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: j */
    public static /* synthetic */ void m35893j(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isPatEnable());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: k */
    public static /* synthetic */ void m35894k(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isInvoiceEnable());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: l */
    public static /* synthetic */ void m35895l(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isWeCoinEnable());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: m */
    public static /* synthetic */ void m35896m(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isMyAddressEnable());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: n */
    public static /* synthetic */ void m35897n(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
            if (bool != null) {
                flutterSettingApi.voicePlayMode(bool);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("enableArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m35898o(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isLandscapeMode());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: p */
    public static /* synthetic */ void m35899p(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.isMultipleUser());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: q */
    public static /* synthetic */ void m35900q(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
            if (bool != null) {
                flutterSettingApi.sendMsgInKeyboard(bool);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("enableArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m35901r(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            flutterSettingApi.resetChatRecord();
            hashMap.put("result", (Object) null);
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: s */
    public static /* synthetic */ void m35902s(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getUsername());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: t */
    public static /* synthetic */ void m35903t(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getDisplayUsername());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: u */
    public static /* synthetic */ void m35904u(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getNickname());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: v */
    public static /* synthetic */ void m35905v(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getPatTail());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: w */
    public static /* synthetic */ void m35906w(FlutterSettingsApi.FlutterSettingApi flutterSettingApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", flutterSettingApi.getWeCoin());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterSettingsApi.wrapError(e));
        }
        reply.reply(hashMap);
    }

    /* renamed from: x */
    public static void m35907x(BinaryMessenger binaryMessenger, FlutterSettingsApi.FlutterSettingApi flutterSettingApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getVoicePlayMode", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$a(flutterSettingApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getSendMsgInKeybaord", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel2.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$c(flutterSettingApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.voicePlayMode", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel3.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$f(flutterSettingApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.sendMsgInKeyboard", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel4.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$g(flutterSettingApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.resetChatRecord", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel5.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$h(flutterSettingApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getUsername", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel6.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$i(flutterSettingApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getDisplayUsername", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel7.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$j(flutterSettingApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getNickname", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel8.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$k(flutterSettingApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getPatTail", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel9.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$m(flutterSettingApi));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getWeCoin", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel10.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$n(flutterSettingApi));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getVoipRingtone", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel11.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$l(flutterSettingApi));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getSex", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel12.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$o(flutterSettingApi));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getDistrict", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel13.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$p(flutterSettingApi));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.getSignature", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel14.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$q(flutterSettingApi));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.setSex", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel15.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$r(flutterSettingApi));
        } else {
            basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.saveUserInfo", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel16.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$s(flutterSettingApi));
        } else {
            basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isPatEnable", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel17.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$t(flutterSettingApi));
        } else {
            basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isInvoiceEnable", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel18.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$u(flutterSettingApi));
        } else {
            basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isWeCoinEnable", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel19.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$v(flutterSettingApi));
        } else {
            basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isMyAddressEnable", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel20.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$b(flutterSettingApi));
        } else {
            basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isLandscapeMode", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel21.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$d(flutterSettingApi));
        } else {
            basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSettingApi.isMultipleUser", m35884a());
        if (flutterSettingApi != null) {
            basicMessageChannel22.setMessageHandler(new FlutterSettingsApi$FlutterSettingApi$$e(flutterSettingApi));
        } else {
            basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
