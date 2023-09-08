package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterAPMApi {

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public interface WeAPMApi {

        /* renamed from: com.tencent.pigeon.FlutterAPMApi$WeAPMApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m163963a() {
                return WeAPMApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m163964b(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", weAPMApi.getFlutterEngineCreateStartMills());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: c */
            public static /* synthetic */ void m163965c(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", weAPMApi.getFlutterEngineCreateFinishMills());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: d */
            public static /* synthetic */ void m163966d(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", weAPMApi.getNativeFirstPointerDownMills());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: e */
            public static /* synthetic */ void m163967e(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", weAPMApi.getNativeFirstScrollMills());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: f */
            public static /* synthetic */ void m163968f(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", weAPMApi.getSnapshotRenderMills());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: g */
            public static /* synthetic */ void m163969g(WeAPMApi weAPMApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    weAPMApi.getDartVMMemoryInfo(new Result<String>(hashMap, reply) {
                        public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        public final /* synthetic */ Map val$wrapped;

                        {
                            this.val$wrapped = r1;
                            this.val$reply = r2;
                        }

                        public void error(Throwable th) {
                            this.val$wrapped.put("error", FlutterAPMApi.wrapError(th));
                            this.val$reply.reply(this.val$wrapped);
                        }

                        public void success(String str) {
                            this.val$wrapped.put("result", str);
                            this.val$reply.reply(this.val$wrapped);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterAPMApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: h */
            public static void m163970h(BinaryMessenger binaryMessenger, WeAPMApi weAPMApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getFlutterEngineCreateStartMills", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel.setMessageHandler(new FlutterAPMApi$WeAPMApi$$a(weAPMApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getFlutterEngineCreateFinishMills", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel2.setMessageHandler(new FlutterAPMApi$WeAPMApi$$b(weAPMApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getNativeFirstPointerDownMills", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel3.setMessageHandler(new FlutterAPMApi$WeAPMApi$$c(weAPMApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getNativeFirstScrollMills", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel4.setMessageHandler(new FlutterAPMApi$WeAPMApi$$d(weAPMApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getSnapshotRenderMills", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel5.setMessageHandler(new FlutterAPMApi$WeAPMApi$$e(weAPMApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WeAPMApi.getDartVMMemoryInfo", m163963a());
                if (weAPMApi != null) {
                    basicMessageChannel6.setMessageHandler(new FlutterAPMApi$WeAPMApi$$f(weAPMApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void getDartVMMemoryInfo(Result<String> result);

        Long getFlutterEngineCreateFinishMills();

        Long getFlutterEngineCreateStartMills();

        Long getNativeFirstPointerDownMills();

        Long getNativeFirstScrollMills();

        Long getSnapshotRenderMills();
    }

    public static class WeAPMApiCodec extends StandardMessageCodec {
        public static final WeAPMApiCodec INSTANCE = new WeAPMApiCodec();

        private WeAPMApiCodec() {
        }
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
