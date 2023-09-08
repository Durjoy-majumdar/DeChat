package com.tencent.pigeon;

import com.tencent.pigeon.TPPlayerApi;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.j */
public final /* synthetic */ class C26955j {
    /* renamed from: A */
    public static void m35912A(BinaryMessenger binaryMessenger, TPPlayerApi.TPFlutterApi tPFlutterApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerCreate", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel.setMessageHandler(new TPPlayerApi$TPFlutterApi$$a(tPFlutterApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerInit", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel2.setMessageHandler(new TPPlayerApi$TPFlutterApi$$c(tPFlutterApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetLoop", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel3.setMessageHandler(new TPPlayerApi$TPFlutterApi$$i(tPFlutterApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpUpdateDisplaySize", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel4.setMessageHandler(new TPPlayerApi$TPFlutterApi$$j(tPFlutterApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetMediaInfo", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel5.setMessageHandler(new TPPlayerApi$TPFlutterApi$$k(tPFlutterApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetMediaProto", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel6.setMessageHandler(new TPPlayerApi$TPFlutterApi$$m(tPFlutterApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlaySetScaleType", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel7.setMessageHandler(new TPPlayerApi$TPFlutterApi$$n(tPFlutterApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetMute", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel8.setMessageHandler(new TPPlayerApi$TPFlutterApi$$o(tPFlutterApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetStreamType", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel9.setMessageHandler(new TPPlayerApi$TPFlutterApi$$p(tPFlutterApi));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerPrepare", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel10.setMessageHandler(new TPPlayerApi$TPFlutterApi$$q(tPFlutterApi));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerPlay", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel11.setMessageHandler(new TPPlayerApi$TPFlutterApi$$l(tPFlutterApi));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerPause", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel12.setMessageHandler(new TPPlayerApi$TPFlutterApi$$r(tPFlutterApi));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSeek", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel13.setMessageHandler(new TPPlayerApi$TPFlutterApi$$s(tPFlutterApi));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerSetPlayRange", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel14.setMessageHandler(new TPPlayerApi$TPFlutterApi$$t(tPFlutterApi));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpPlayerGetPlayRange", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel15.setMessageHandler(new TPPlayerApi$TPFlutterApi$$u(tPFlutterApi));
        } else {
            basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpStop", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel16.setMessageHandler(new TPPlayerApi$TPFlutterApi$$v(tPFlutterApi));
        } else {
            basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpRelease", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel17.setMessageHandler(new TPPlayerApi$TPFlutterApi$$w(tPFlutterApi));
        } else {
            basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpAddEffect", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel18.setMessageHandler(new TPPlayerApi$TPFlutterApi$$x(tPFlutterApi));
        } else {
            basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpUpdateEffect", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel19.setMessageHandler(new TPPlayerApi$TPFlutterApi$$y(tPFlutterApi));
        } else {
            basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpRemoveEffect", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel20.setMessageHandler(new TPPlayerApi$TPFlutterApi$$b(tPFlutterApi));
        } else {
            basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpClearEffect", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel21.setMessageHandler(new TPPlayerApi$TPFlutterApi$$d(tPFlutterApi));
        } else {
            basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpSetProgressListener", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel22.setMessageHandler(new TPPlayerApi$TPFlutterApi$$e(tPFlutterApi));
        } else {
            basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpSetOnPreparedListener", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel23.setMessageHandler(new TPPlayerApi$TPFlutterApi$$f(tPFlutterApi));
        } else {
            basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpSetOnFirstFrameRenderedListener", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel24.setMessageHandler(new TPPlayerApi$TPFlutterApi$$g(tPFlutterApi));
        } else {
            basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TPFlutterApi.tpGetVideoSize", m35913a());
        if (tPFlutterApi != null) {
            basicMessageChannel25.setMessageHandler(new TPPlayerApi$TPFlutterApi$$h(tPFlutterApi));
        } else {
            basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }

    /* renamed from: a */
    public static MessageCodec<Object> m35913a() {
        return TPPlayerApi.TPFlutterApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m35914b(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerCreate(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("mediaTypeArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m35915c(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerInitParams tPPlayerInitParams = (TPPlayerApi.TPPlayerInitParams) ((ArrayList) obj).get(0);
            if (tPPlayerInitParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerInit(tPPlayerInitParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m35916d(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerPlay(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m35917e(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerPause(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m35918f(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSeekParams tPPlayerSeekParams = (TPPlayerApi.TPPlayerSeekParams) ((ArrayList) obj).get(0);
            if (tPPlayerSeekParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSeek(tPPlayerSeekParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m35919g(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetPlayRangeParams tPPlayerSetPlayRangeParams = (TPPlayerApi.TPPlayerSetPlayRangeParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetPlayRangeParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetPlayRange(tPPlayerSetPlayRangeParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m35920h(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerGetPlayRange(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m35921i(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpStop(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m35922j(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpRelease(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m35923k(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect = (TPPlayerApi.TPPlayerRenderEffect) ((ArrayList) obj).get(0);
            if (tPPlayerRenderEffect != null) {
                hashMap.put("result", tPFlutterApi.tpAddEffect(tPPlayerRenderEffect));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("effectArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m35924l(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect = (TPPlayerApi.TPPlayerRenderEffect) ((ArrayList) obj).get(0);
            if (tPPlayerRenderEffect != null) {
                hashMap.put("result", tPFlutterApi.tpUpdateEffect(tPPlayerRenderEffect));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("effectArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m35925m(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect = (TPPlayerApi.TPPlayerRenderEffect) ((ArrayList) obj).get(0);
            if (tPPlayerRenderEffect != null) {
                hashMap.put("result", tPFlutterApi.tpRemoveEffect(tPPlayerRenderEffect));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("effectArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m35926n(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetLoopParams tPPlayerSetLoopParams = (TPPlayerApi.TPPlayerSetLoopParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetLoopParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetLoop(tPPlayerSetLoopParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m35927o(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpClearEffect(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m35928p(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpSetProgressListener(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m35929q(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpSetOnPreparedListener(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m35930r(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpSetOnFirstFrameRenderedListener(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m35931s(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpGetVideoSize(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: t */
    public static /* synthetic */ void m35932t(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams = (TPPlayerApi.TPPlayerUpdateSizeParams) ((ArrayList) obj).get(0);
            if (tPPlayerUpdateSizeParams != null) {
                hashMap.put("result", tPFlutterApi.tpUpdateDisplaySize(tPPlayerUpdateSizeParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m35933u(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetMediaInfoParams tPPlayerSetMediaInfoParams = (TPPlayerApi.TPPlayerSetMediaInfoParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetMediaInfoParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetMediaInfo(tPPlayerSetMediaInfoParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m35934v(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams = (TPPlayerApi.TPPlayerSetMediaProtoParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetMediaProtoParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetMediaProto(tPPlayerSetMediaProtoParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m35935w(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerScaleTypeParams tPPlayerScaleTypeParams = (TPPlayerApi.TPPlayerScaleTypeParams) ((ArrayList) obj).get(0);
            if (tPPlayerScaleTypeParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlaySetScaleType(tPPlayerScaleTypeParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m35936x(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetMuteParams tPPlayerSetMuteParams = (TPPlayerApi.TPPlayerSetMuteParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetMuteParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetMute(tPPlayerSetMuteParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m35937y(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            TPPlayerApi.TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams = (TPPlayerApi.TPPlayerSetStreamTypeParams) ((ArrayList) obj).get(0);
            if (tPPlayerSetStreamTypeParams != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerSetStreamType(tPPlayerSetStreamTypeParams));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("paramsArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m35938z(TPPlayerApi.TPFlutterApi tPFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", tPFlutterApi.tpPlayerPrepare(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("playerIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", TPPlayerApi.wrapError(e));
        }
    }
}
