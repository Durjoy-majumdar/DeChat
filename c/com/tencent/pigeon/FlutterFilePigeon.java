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

public class FlutterFilePigeon {

    public interface FlutterFileHost {

        /* renamed from: com.tencent.pigeon.FlutterFilePigeon$FlutterFileHost$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m163971a() {
                return FlutterFileHostCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m163972b(FlutterFileHost flutterFileHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", flutterFileHost.getDefaultImageCacheDirectory());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterFilePigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: c */
            public static /* synthetic */ void m163973c(FlutterFileHost flutterFileHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", flutterFileHost.getGeneralCacheDirectory());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterFilePigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: d */
            public static /* synthetic */ void m163974d(FlutterFileHost flutterFileHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        flutterFileHost.createFile(str, new Result<String>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", FlutterFilePigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(String str) {
                                this.val$wrapped.put("result", str);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("pathArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterFilePigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: e */
            public static /* synthetic */ void m163975e(FlutterFileHost flutterFileHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            flutterFileHost.createDirectory(str, bool, new Result<String>(hashMap, reply) {
                                public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                                public final /* synthetic */ Map val$wrapped;

                                {
                                    this.val$wrapped = r1;
                                    this.val$reply = r2;
                                }

                                public void error(Throwable th) {
                                    this.val$wrapped.put("error", FlutterFilePigeon.wrapError(th));
                                    this.val$reply.reply(this.val$wrapped);
                                }

                                public void success(String str) {
                                    this.val$wrapped.put("result", str);
                                    this.val$reply.reply(this.val$wrapped);
                                }
                            });
                            return;
                        }
                        throw new NullPointerException("recursiveArg unexpectedly null.");
                    }
                    throw new NullPointerException("pathArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterFilePigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: f */
            public static /* synthetic */ void m163976f(FlutterFileHost flutterFileHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        hashMap.put("result", flutterFileHost.getRealPath(str));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("pathArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterFilePigeon.wrapError(e));
                }
            }

            /* renamed from: g */
            public static void m163977g(BinaryMessenger binaryMessenger, FlutterFileHost flutterFileHost) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterFileHost.getDefaultImageCacheDirectory", m163971a());
                if (flutterFileHost != null) {
                    basicMessageChannel.setMessageHandler(new FlutterFilePigeon$FlutterFileHost$$a(flutterFileHost));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterFileHost.getGeneralCacheDirectory", m163971a());
                if (flutterFileHost != null) {
                    basicMessageChannel2.setMessageHandler(new FlutterFilePigeon$FlutterFileHost$$b(flutterFileHost));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterFileHost.createFile", m163971a());
                if (flutterFileHost != null) {
                    basicMessageChannel3.setMessageHandler(new FlutterFilePigeon$FlutterFileHost$$c(flutterFileHost));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterFileHost.createDirectory", m163971a());
                if (flutterFileHost != null) {
                    basicMessageChannel4.setMessageHandler(new FlutterFilePigeon$FlutterFileHost$$d(flutterFileHost));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterFileHost.getRealPath", m163971a());
                if (flutterFileHost != null) {
                    basicMessageChannel5.setMessageHandler(new FlutterFilePigeon$FlutterFileHost$$e(flutterFileHost));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void createDirectory(String str, Boolean bool, Result<String> result);

        void createFile(String str, Result<String> result);

        String getDefaultImageCacheDirectory();

        String getGeneralCacheDirectory();

        String getRealPath(String str);
    }

    public static class FlutterFileHostCodec extends StandardMessageCodec {
        public static final FlutterFileHostCodec INSTANCE = new FlutterFileHostCodec();

        private FlutterFileHostCodec() {
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
