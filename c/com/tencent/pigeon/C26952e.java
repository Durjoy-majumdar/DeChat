package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMMKVSlotPigeon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: com.tencent.pigeon.e */
public final /* synthetic */ class C26952e {
    /* renamed from: a */
    public static MessageCodec<Object> m35872a() {
        return FlutterMMKVSlotPigeon.FlutterMMKVSlotHostCodec.INSTANCE;
    }

    /* renamed from: b */
    public static /* synthetic */ void m35873b(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Number number = (Number) arrayList.get(2);
                    if (number != null) {
                        hashMap.put("result", flutterMMKVSlotHost.getInt(flutterMMKVSlotInfo, str, Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m35874c(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Number number = (Number) arrayList.get(2);
                    if (number != null) {
                        flutterMMKVSlotHost.putInt(flutterMMKVSlotInfo, str, Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m35875d(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    hashMap.put("result", flutterMMKVSlotHost.getString(flutterMMKVSlotInfo, str));
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m35876e(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    String str2 = (String) arrayList.get(2);
                    if (str2 != null) {
                        flutterMMKVSlotHost.putString(flutterMMKVSlotInfo, str, str2);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m35877f(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Boolean bool = (Boolean) arrayList.get(2);
                    if (bool != null) {
                        hashMap.put("result", flutterMMKVSlotHost.getBool(flutterMMKVSlotInfo, str, bool));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m35878g(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Boolean bool = (Boolean) arrayList.get(2);
                    if (bool != null) {
                        flutterMMKVSlotHost.putBool(flutterMMKVSlotInfo, str, bool);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m35879h(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    hashMap.put("result", flutterMMKVSlotHost.getBytes(flutterMMKVSlotInfo, str));
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m35880i(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    byte[] bArr = (byte[]) arrayList.get(2);
                    if (bArr != null) {
                        flutterMMKVSlotHost.putBytes(flutterMMKVSlotInfo, str, bArr);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("valueArg unexpectedly null.");
                }
                throw new NullPointerException("keyArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m35881j(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                List list = (List) arrayList.get(1);
                if (list != null) {
                    hashMap.put("result", flutterMMKVSlotHost.getStringList(flutterMMKVSlotInfo, list));
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("keyListArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m35882k(FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo = (FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo) arrayList.get(0);
            if (flutterMMKVSlotInfo != null) {
                Map map = (Map) arrayList.get(1);
                if (map != null) {
                    flutterMMKVSlotHost.putStringList(flutterMMKVSlotInfo, map);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("valueListArg unexpectedly null.");
            }
            throw new NullPointerException("infoArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", FlutterMMKVSlotPigeon.wrapError(e));
        }
    }

    /* renamed from: l */
    public static void m35883l(BinaryMessenger binaryMessenger, FlutterMMKVSlotPigeon.FlutterMMKVSlotHost flutterMMKVSlotHost) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.getInt", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$a(flutterMMKVSlotHost));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.putInt", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel2.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$b(flutterMMKVSlotHost));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.getString", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel3.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$c(flutterMMKVSlotHost));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.putString", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel4.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$d(flutterMMKVSlotHost));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.getBool", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel5.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$e(flutterMMKVSlotHost));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.putBool", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel6.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$f(flutterMMKVSlotHost));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.getBytes", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel7.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$g(flutterMMKVSlotHost));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.putBytes", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel8.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$h(flutterMMKVSlotHost));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.getStringList", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel9.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$i(flutterMMKVSlotHost));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterMMKVSlotHost.putStringList", m35872a());
        if (flutterMMKVSlotHost != null) {
            basicMessageChannel10.setMessageHandler(new FlutterMMKVSlotPigeon$FlutterMMKVSlotHost$$j(flutterMMKVSlotHost));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }
}
