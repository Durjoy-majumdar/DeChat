package k10;

import k10.C88053e;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;

/* renamed from: k10.f */
public final /* synthetic */ class C88057f {
    /* renamed from: a */
    public static void m109637a(BinaryMessenger binaryMessenger, C88053e.C88054a aVar) {
        C88053e.C88055b bVar = C88053e.C88055b.f254692a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.createFrameSetRoot", bVar);
        if (aVar != null) {
            basicMessageChannel.setMessageHandler(new e$a$$a(aVar));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.destroyFrameSetRoot", bVar);
        if (aVar != null) {
            basicMessageChannel2.setMessageHandler(new e$a$$j(aVar));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.pauseFrameSetRoot", bVar);
        if (aVar != null) {
            basicMessageChannel3.setMessageHandler(new e$a$$k(aVar));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.resumeFrameSetRoot", bVar);
        if (aVar != null) {
            basicMessageChannel4.setMessageHandler(new e$a$$l(aVar));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.redrawFrameSetRoot", bVar);
        if (aVar != null) {
            basicMessageChannel5.setMessageHandler(new e$a$$m(aVar));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.changeFrameSetData", bVar);
        if (aVar != null) {
            basicMessageChannel6.setMessageHandler(new e$a$$n(aVar));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.preInitFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel7.setMessageHandler(new e$a$$b(aVar));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.createFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel8.setMessageHandler(new e$a$$c(aVar));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.destroyFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel9.setMessageHandler(new e$a$$d(aVar));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.attachFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel10.setMessageHandler(new e$a$$e(aVar));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.detachFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel11.setMessageHandler(new e$a$$f(aVar));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.redrawFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel12.setMessageHandler(new e$a$$g(aVar));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.resizeFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel13.setMessageHandler(new e$a$$h(aVar));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MagicSclRequest.scrollFrameSet", bVar);
        if (aVar != null) {
            basicMessageChannel14.setMessageHandler(new e$a$$i(aVar));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
