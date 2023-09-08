package p172io.flutter.plugins.webviewflutter;

import java.util.ArrayList;
import java.util.HashMap;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.e */
public final /* synthetic */ class C27607e {
    /* renamed from: a */
    public static MessageCodec<Object> m37684a() {
        return GeneratedAndroidWebView.WebSettingsHostApiCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m37685b(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webSettingsHostApi.create(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("webViewInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m37686c(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webSettingsHostApi.dispose(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m37687d(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setUseWideViewPort(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("useArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m37688e(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setDisplayZoomControls(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m37689f(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setBuiltInZoomControls(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m37690g(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setAllowFileAccess(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m37691h(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setDomStorageEnabled(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m37692i(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m37693j(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setSupportMultipleWindows(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("supportArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m37694k(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setJavaScriptEnabled(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("flagArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m37695l(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                webSettingsHostApi.setUserAgentString(Long.valueOf(number.longValue()), (String) arrayList.get(1));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m37696m(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setMediaPlaybackRequiresUserGesture(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("requireArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m37697n(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setSupportZoom(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("supportArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m37698o(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webSettingsHostApi.setLoadWithOverviewMode(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("overviewArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
        }
    }

    /* renamed from: p */
    public static void m37699p(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.create", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$a(webSettingsHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.dispose", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel2.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$j(webSettingsHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setDomStorageEnabled", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel3.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$k(webSettingsHostApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel4.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$l(webSettingsHostApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setSupportMultipleWindows", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel5.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$m(webSettingsHostApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptEnabled", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel6.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$n(webSettingsHostApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setUserAgentString", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel7.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$b(webSettingsHostApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel8.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$c(webSettingsHostApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setSupportZoom", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel9.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$d(webSettingsHostApi));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setLoadWithOverviewMode", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel10.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$e(webSettingsHostApi));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setUseWideViewPort", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel11.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$f(webSettingsHostApi));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setDisplayZoomControls", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel12.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$g(webSettingsHostApi));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setBuiltInZoomControls", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel13.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$h(webSettingsHostApi));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebSettingsHostApi.setAllowFileAccess", m37684a());
        if (webSettingsHostApi != null) {
            basicMessageChannel14.setMessageHandler(new GeneratedAndroidWebView$WebSettingsHostApi$$i(webSettingsHostApi));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
