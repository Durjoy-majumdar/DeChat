package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterAccountPigeon {

    public static class FlutterAccountHostCodec extends StandardMessageCodec {
        public static final FlutterAccountHostCodec INSTANCE = new FlutterAccountHostCodec();

        private FlutterAccountHostCodec() {
        }
    }

    public interface FlutterAccountHost {

        /* renamed from: com.tencent.pigeon.FlutterAccountPigeon$FlutterAccountHost$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m35780a() {
                return FlutterAccountHostCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m35781b(FlutterAccountHost flutterAccountHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", flutterAccountHost.getUin());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAccountPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: c */
            public static /* synthetic */ void m35782c(FlutterAccountHost flutterAccountHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            flutterAccountHost.getAvatarPath(str, bool, new Result<String>(hashMap, reply) {
                                public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                                public final /* synthetic */ Map val$wrapped;

                                {
                                    this.val$wrapped = r1;
                                    this.val$reply = r2;
                                }

                                public void error(Throwable th) {
                                    this.val$wrapped.put("error", FlutterAccountPigeon.wrapError(th));
                                    this.val$reply.reply(this.val$wrapped);
                                }

                                public void success(String str) {
                                    this.val$wrapped.put("result", str);
                                    this.val$reply.reply(this.val$wrapped);
                                }
                            });
                            return;
                        }
                        throw new NullPointerException("hdArg unexpectedly null.");
                    }
                    throw new NullPointerException("usernameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAccountPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: d */
            public static void m35783d(BinaryMessenger binaryMessenger, FlutterAccountHost flutterAccountHost) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAccountHost.getUin", m35780a());
                if (flutterAccountHost != null) {
                    basicMessageChannel.setMessageHandler(new FlutterAccountPigeon$FlutterAccountHost$$a(flutterAccountHost));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterAccountHost.getAvatarPath", m35780a());
                if (flutterAccountHost != null) {
                    basicMessageChannel2.setMessageHandler(new FlutterAccountPigeon$FlutterAccountHost$$b(flutterAccountHost));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void getAvatarPath(String str, Boolean bool, Result<String> result);

        String getUin();
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
