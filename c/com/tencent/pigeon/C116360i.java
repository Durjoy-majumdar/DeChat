package com.tencent.pigeon;

import com.tencent.pigeon.Link;
import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.i */
public final /* synthetic */ class C116360i {
    /* renamed from: a */
    public static MessageCodec<Object> m163993a() {
        return Link.LinkHandlerApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m163994b(Link.LinkHandlerApi linkHandlerApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                linkHandlerApi.openLink(str);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("urlArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", Link.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m163995c(Link.LinkHandlerApi linkHandlerApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Link.LinkWeAppJumpInfo linkWeAppJumpInfo = (Link.LinkWeAppJumpInfo) ((ArrayList) obj).get(0);
            if (linkWeAppJumpInfo != null) {
                linkHandlerApi.openWeAppLink(linkWeAppJumpInfo);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("linkWrapArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", Link.wrapError(e));
        }
    }

    /* renamed from: d */
    public static void m163996d(BinaryMessenger binaryMessenger, Link.LinkHandlerApi linkHandlerApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.LinkHandlerApi.openLink", m163993a());
        if (linkHandlerApi != null) {
            basicMessageChannel.setMessageHandler(new Link$LinkHandlerApi$$a(linkHandlerApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.LinkHandlerApi.openWeAppLink", m163993a());
        if (linkHandlerApi != null) {
            basicMessageChannel2.setMessageHandler(new Link$LinkHandlerApi$$b(linkHandlerApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
