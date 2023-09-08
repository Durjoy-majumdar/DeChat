package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterNavigatorPigeon {

    public static class FlutterNavigatorCallback {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public FlutterNavigatorCallback(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return FlutterNavigatorCallbackCodec.INSTANCE;
        }

        public void onNewRoute(String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterNavigatorCallback.onNewRoute", getCodec()).send(new ArrayList(Arrays.asList(new String[]{str})), new FlutterNavigatorPigeon$FlutterNavigatorCallback$$a(reply));
        }
    }

    public static class FlutterNavigatorCallbackCodec extends StandardMessageCodec {
        public static final FlutterNavigatorCallbackCodec INSTANCE = new FlutterNavigatorCallbackCodec();

        private FlutterNavigatorCallbackCodec() {
        }
    }

    public interface FlutterNavigatorHost {

        /* renamed from: com.tencent.pigeon.FlutterNavigatorPigeon$FlutterNavigatorHost$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m144598a() {
                return FlutterNavigatorHostCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m144599b(FlutterNavigatorHost flutterNavigatorHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    flutterNavigatorHost.disableSwipeBack();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterNavigatorPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: c */
            public static /* synthetic */ void m144600c(FlutterNavigatorHost flutterNavigatorHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    flutterNavigatorHost.enableSwipeBack();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterNavigatorPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: d */
            public static /* synthetic */ void m144601d(FlutterNavigatorHost flutterNavigatorHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        String str2 = (String) arrayList.get(1);
                        if (str2 != null) {
                            Map map = (Map) arrayList.get(2);
                            if (map != null) {
                                flutterNavigatorHost.push(str, str2, map, new Result<Map<Object, Object>>(hashMap, reply) {
                                    public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                                    public final /* synthetic */ Map val$wrapped;

                                    {
                                        this.val$wrapped = r1;
                                        this.val$reply = r2;
                                    }

                                    public void error(Throwable th) {
                                        this.val$wrapped.put("error", FlutterNavigatorPigeon.wrapError(th));
                                        this.val$reply.reply(this.val$wrapped);
                                    }

                                    public void success(Map<Object, Object> map) {
                                        this.val$wrapped.put("result", map);
                                        this.val$reply.reply(this.val$wrapped);
                                    }
                                });
                                return;
                            }
                            throw new NullPointerException("argumentsArg unexpectedly null.");
                        }
                        throw new NullPointerException("routeArg unexpectedly null.");
                    }
                    throw new NullPointerException("pluginArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterNavigatorPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: e */
            public static /* synthetic */ void m144602e(FlutterNavigatorHost flutterNavigatorHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        String str2 = (String) arrayList.get(1);
                        if (str2 != null) {
                            Map map = (Map) arrayList.get(2);
                            if (map != null) {
                                flutterNavigatorHost.pop(str, str2, map);
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("resultArg unexpectedly null.");
                        }
                        throw new NullPointerException("routeArg unexpectedly null.");
                    }
                    throw new NullPointerException("pluginArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterNavigatorPigeon.wrapError(e));
                }
            }

            /* renamed from: f */
            public static void m144603f(BinaryMessenger binaryMessenger, FlutterNavigatorHost flutterNavigatorHost) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterNavigatorHost.disableSwipeBack", m144598a());
                if (flutterNavigatorHost != null) {
                    basicMessageChannel.setMessageHandler(new FlutterNavigatorPigeon$FlutterNavigatorHost$$a(flutterNavigatorHost));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterNavigatorHost.enableSwipeBack", m144598a());
                if (flutterNavigatorHost != null) {
                    basicMessageChannel2.setMessageHandler(new FlutterNavigatorPigeon$FlutterNavigatorHost$$b(flutterNavigatorHost));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterNavigatorHost.push", m144598a());
                if (flutterNavigatorHost != null) {
                    basicMessageChannel3.setMessageHandler(new FlutterNavigatorPigeon$FlutterNavigatorHost$$c(flutterNavigatorHost));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterNavigatorHost.pop", m144598a());
                if (flutterNavigatorHost != null) {
                    basicMessageChannel4.setMessageHandler(new FlutterNavigatorPigeon$FlutterNavigatorHost$$d(flutterNavigatorHost));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void disableSwipeBack();

        void enableSwipeBack();

        void pop(String str, String str2, Map<Object, Object> map);

        void push(String str, String str2, Map<Object, Object> map, Result<Map<Object, Object>> result);
    }

    public static class FlutterNavigatorHostCodec extends StandardMessageCodec {
        public static final FlutterNavigatorHostCodec INSTANCE = new FlutterNavigatorHostCodec();

        private FlutterNavigatorHostCodec() {
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
