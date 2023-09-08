package com.tencent.pigeon;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class MaasApi {

    public static class MaasFlutterApiCodec extends StandardMessageCodec {
        public static final MaasFlutterApiCodec INSTANCE = new MaasFlutterApiCodec();

        private MaasFlutterApiCodec() {
        }
    }

    public static abstract class MaasFlutterApi {
        public static MessageCodec<Object> getCodec() {
            return MaasFlutterApiCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(MaasFlutterApi maasFlutterApi, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                ArrayList arrayList = (ArrayList) obj;
                Number number = (Number) arrayList.get(0);
                if (number != null) {
                    Number number2 = (Number) arrayList.get(1);
                    if (number2 != null) {
                        maasFlutterApi.initRenderSurface(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), new Result<Long>() {
                            public void error(Throwable th) {
                                hashMap.put("error", MaasApi.wrapError(th));
                                reply.reply(hashMap);
                            }

                            public void success(Long l) {
                                hashMap.put("result", l);
                                reply.reply(hashMap);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("heightArg unexpectedly null.");
                }
                throw new NullPointerException("widthArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(MaasFlutterApi maasFlutterApi, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                ArrayList arrayList = (ArrayList) obj;
                String str = (String) arrayList.get(0);
                if (str != null) {
                    String str2 = (String) arrayList.get(1);
                    if (str2 != null) {
                        byte[] bArr = (byte[]) arrayList.get(2);
                        if (bArr != null) {
                            maasFlutterApi.startMovieCreation(str, str2, bArr, new Result<Boolean>() {
                                public void error(Throwable th) {
                                    hashMap.put("error", MaasApi.wrapError(th));
                                    reply.reply(hashMap);
                                }

                                public void success(Boolean bool) {
                                    hashMap.put("result", bool);
                                    reply.reply(hashMap);
                                }
                            });
                            return;
                        }
                        throw new NullPointerException("mediaInfoArg unexpectedly null.");
                    }
                    throw new NullPointerException("musicIdArg unexpectedly null.");
                }
                throw new NullPointerException("templateIdArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$2(MaasFlutterApi maasFlutterApi, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                ArrayList arrayList = (ArrayList) obj;
                String str = (String) arrayList.get(0);
                if (str != null) {
                    String str2 = (String) arrayList.get(1);
                    if (str2 != null) {
                        maasFlutterApi.recreateCreation(str, str2, new Result<Boolean>() {
                            public void error(Throwable th) {
                                hashMap.put("error", MaasApi.wrapError(th));
                                reply.reply(hashMap);
                            }

                            public void success(Boolean bool) {
                                hashMap.put("result", bool);
                                reply.reply(hashMap);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("musicIdArg unexpectedly null.");
                }
                throw new NullPointerException("templateIdArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$3(MaasFlutterApi maasFlutterApi, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                Number number = (Number) ((ArrayList) obj).get(0);
                if (number != null) {
                    maasFlutterApi.startPlay(Long.valueOf(number.longValue()), new Result<Boolean>() {
                        public void error(Throwable th) {
                            hashMap.put("error", MaasApi.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(Boolean bool) {
                            hashMap.put("result", bool);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("timeInMilArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$4(MaasFlutterApi maasFlutterApi, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                maasFlutterApi.stopPlay(new Result<Boolean>() {
                    public void error(Throwable th) {
                        hashMap.put("error", MaasApi.wrapError(th));
                        reply.reply(hashMap);
                    }

                    public void success(Boolean bool) {
                        hashMap.put("result", bool);
                        reply.reply(hashMap);
                    }
                });
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$5(MaasFlutterApi maasFlutterApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                maasFlutterApi.release();
                hashMap.put("result", (Object) null);
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MaasApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        public static void setup(BinaryMessenger binaryMessenger, MaasFlutterApi maasFlutterApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.initRenderSurface", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel.setMessageHandler(new MaasApi$MaasFlutterApi$$a(maasFlutterApi));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.startMovieCreation", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel2.setMessageHandler(new MaasApi$MaasFlutterApi$$b(maasFlutterApi));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.recreateCreation", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel3.setMessageHandler(new MaasApi$MaasFlutterApi$$c(maasFlutterApi));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.startPlay", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel4.setMessageHandler(new MaasApi$MaasFlutterApi$$d(maasFlutterApi));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.stopPlay", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel5.setMessageHandler(new MaasApi$MaasFlutterApi$$e(maasFlutterApi));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MaasFlutterApi.release", getCodec());
            if (maasFlutterApi != null) {
                basicMessageChannel6.setMessageHandler(new MaasApi$MaasFlutterApi$$f(maasFlutterApi));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract void initRenderSurface(Long l, Long l2, Result<Long> result);

        public abstract void recreateCreation(String str, String str2, Result<Boolean> result);

        public abstract void release();

        public abstract void startMovieCreation(String str, String str2, byte[] bArr, Result<Boolean> result);

        public abstract void startPlay(Long l, Result<Boolean> result);

        public abstract void stopPlay(Result<Boolean> result);
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
        hashMap.put("details", (Object) null);
        return hashMap;
    }
}
