package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class PAGFlutterApi {

    public static class FlutterPAGInfo {
        private Boolean autoPlay;
        private String filepath;
        private Double height;
        private Boolean isFromAsset;
        private Double maxFrameRate;
        private Long pagId;
        private Long repeatCount;
        private Double width;

        public static final class Builder {
            private Boolean autoPlay;
            private String filepath;
            private Double height;
            private Boolean isFromAsset;
            private Double maxFrameRate;
            private Long pagId;
            private Long repeatCount;
            private Double width;

            public FlutterPAGInfo build() {
                FlutterPAGInfo flutterPAGInfo = new FlutterPAGInfo();
                flutterPAGInfo.setPagId(this.pagId);
                flutterPAGInfo.setFilepath(this.filepath);
                flutterPAGInfo.setIsFromAsset(this.isFromAsset);
                flutterPAGInfo.setWidth(this.width);
                flutterPAGInfo.setHeight(this.height);
                flutterPAGInfo.setRepeatCount(this.repeatCount);
                flutterPAGInfo.setAutoPlay(this.autoPlay);
                flutterPAGInfo.setMaxFrameRate(this.maxFrameRate);
                return flutterPAGInfo;
            }

            public Builder setAutoPlay(Boolean bool) {
                this.autoPlay = bool;
                return this;
            }

            public Builder setFilepath(String str) {
                this.filepath = str;
                return this;
            }

            public Builder setHeight(Double d) {
                this.height = d;
                return this;
            }

            public Builder setIsFromAsset(Boolean bool) {
                this.isFromAsset = bool;
                return this;
            }

            public Builder setMaxFrameRate(Double d) {
                this.maxFrameRate = d;
                return this;
            }

            public Builder setPagId(Long l) {
                this.pagId = l;
                return this;
            }

            public Builder setRepeatCount(Long l) {
                this.repeatCount = l;
                return this;
            }

            public Builder setWidth(Double d) {
                this.width = d;
                return this;
            }
        }

        private FlutterPAGInfo() {
        }

        public static FlutterPAGInfo fromMap(Map<String, Object> map) {
            Long l;
            FlutterPAGInfo flutterPAGInfo = new FlutterPAGInfo();
            Object obj = map.get("pagId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterPAGInfo.setPagId(l);
            flutterPAGInfo.setFilepath((String) map.get("filepath"));
            flutterPAGInfo.setIsFromAsset((Boolean) map.get("isFromAsset"));
            flutterPAGInfo.setWidth((Double) map.get("width"));
            flutterPAGInfo.setHeight((Double) map.get("height"));
            Object obj2 = map.get("repeatCount");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            flutterPAGInfo.setRepeatCount(l2);
            flutterPAGInfo.setAutoPlay((Boolean) map.get("autoPlay"));
            flutterPAGInfo.setMaxFrameRate((Double) map.get("maxFrameRate"));
            return flutterPAGInfo;
        }

        public Boolean getAutoPlay() {
            return this.autoPlay;
        }

        public String getFilepath() {
            return this.filepath;
        }

        public Double getHeight() {
            return this.height;
        }

        public Boolean getIsFromAsset() {
            return this.isFromAsset;
        }

        public Double getMaxFrameRate() {
            return this.maxFrameRate;
        }

        public Long getPagId() {
            return this.pagId;
        }

        public Long getRepeatCount() {
            return this.repeatCount;
        }

        public Double getWidth() {
            return this.width;
        }

        public void setAutoPlay(Boolean bool) {
            if (bool != null) {
                this.autoPlay = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"autoPlay\" is null.");
        }

        public void setFilepath(String str) {
            if (str != null) {
                this.filepath = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"filepath\" is null.");
        }

        public void setHeight(Double d) {
            if (d != null) {
                this.height = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }

        public void setIsFromAsset(Boolean bool) {
            if (bool != null) {
                this.isFromAsset = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isFromAsset\" is null.");
        }

        public void setMaxFrameRate(Double d) {
            if (d != null) {
                this.maxFrameRate = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"maxFrameRate\" is null.");
        }

        public void setPagId(Long l) {
            if (l != null) {
                this.pagId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pagId\" is null.");
        }

        public void setRepeatCount(Long l) {
            if (l != null) {
                this.repeatCount = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"repeatCount\" is null.");
        }

        public void setWidth(Double d) {
            if (d != null) {
                this.width = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("pagId", this.pagId);
            hashMap.put("filepath", this.filepath);
            hashMap.put("isFromAsset", this.isFromAsset);
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            hashMap.put("repeatCount", this.repeatCount);
            hashMap.put("autoPlay", this.autoPlay);
            hashMap.put("maxFrameRate", this.maxFrameRate);
            return hashMap;
        }
    }

    public interface PAGViewApi {

        /* renamed from: com.tencent.pigeon.PAGFlutterApi$PAGViewApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m163980a() {
                return PAGViewApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m163981b(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FlutterPAGInfo flutterPAGInfo = (FlutterPAGInfo) ((ArrayList) obj).get(0);
                    if (flutterPAGInfo != null) {
                        pAGViewApi.create(flutterPAGInfo, new Result<Long>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", PAGFlutterApi.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(Long l) {
                                this.val$wrapped.put("result", l);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: c */
            public static /* synthetic */ void m163982c(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", pAGViewApi.pagViewStartPlay(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m163983d(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", pAGViewApi.pagViewStop(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: e */
            public static /* synthetic */ void m163984e(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        pAGViewApi.pagViewRelease(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: f */
            public static /* synthetic */ void m163985f(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            pAGViewApi.seek(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("timeMsArg unexpectedly null.");
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: g */
            public static /* synthetic */ void m163986g(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            Number number2 = (Number) arrayList.get(2);
                            if (number2 != null) {
                                hashMap.put("result", pAGViewApi.setSolidLayerColor(Long.valueOf(number.longValue()), str, Long.valueOf(number2.longValue())));
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("colorArg unexpectedly null.");
                        }
                        throw new NullPointerException("nameArg unexpectedly null.");
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: h */
            public static /* synthetic */ void m163987h(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            String str = (String) arrayList.get(2);
                            if (str != null) {
                                hashMap.put("result", pAGViewApi.replaceImage(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), str));
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("filepathArg unexpectedly null.");
                        }
                        throw new NullPointerException("indexArg unexpectedly null.");
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                }
            }

            /* renamed from: i */
            public static /* synthetic */ void m163988i(PAGViewApi pAGViewApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        pAGViewApi.flush(Long.valueOf(number.longValue()), new Result<Boolean>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", PAGFlutterApi.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(Boolean bool) {
                                this.val$wrapped.put("result", bool);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("pagIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", PAGFlutterApi.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: j */
            public static void m163989j(BinaryMessenger binaryMessenger, PAGViewApi pAGViewApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.create", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel.setMessageHandler(new PAGFlutterApi$PAGViewApi$$a(pAGViewApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.pagViewStartPlay", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel2.setMessageHandler(new PAGFlutterApi$PAGViewApi$$b(pAGViewApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.pagViewStop", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel3.setMessageHandler(new PAGFlutterApi$PAGViewApi$$c(pAGViewApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.pagViewRelease", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel4.setMessageHandler(new PAGFlutterApi$PAGViewApi$$d(pAGViewApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.seek", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel5.setMessageHandler(new PAGFlutterApi$PAGViewApi$$e(pAGViewApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.setSolidLayerColor", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel6.setMessageHandler(new PAGFlutterApi$PAGViewApi$$f(pAGViewApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.replaceImage", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel7.setMessageHandler(new PAGFlutterApi$PAGViewApi$$g(pAGViewApi));
                } else {
                    basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PAGViewApi.flush", m163980a());
                if (pAGViewApi != null) {
                    basicMessageChannel8.setMessageHandler(new PAGFlutterApi$PAGViewApi$$h(pAGViewApi));
                } else {
                    basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void create(FlutterPAGInfo flutterPAGInfo, Result<Long> result);

        void flush(Long l, Result<Boolean> result);

        void pagViewRelease(Long l);

        Boolean pagViewStartPlay(Long l);

        Boolean pagViewStop(Long l);

        Boolean replaceImage(Long l, Long l2, String str);

        void seek(Long l, Long l2);

        Boolean setSolidLayerColor(Long l, String str, Long l2);
    }

    public static class PAGViewApiCodec extends StandardMessageCodec {
        public static final PAGViewApiCodec INSTANCE = new PAGViewApiCodec();

        private PAGViewApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : FlutterPAGInfo.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterPAGInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterPAGInfo) obj).toMap());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
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
