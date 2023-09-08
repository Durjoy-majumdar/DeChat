package com.tencent.pigeon;

import android.util.Log;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
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

public class FlutterCgiPigeon {

    public interface FlutterCgiHost {

        /* renamed from: com.tencent.pigeon.FlutterCgiPigeon$FlutterCgiHost$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m106477a() {
                return FlutterCgiHostCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m106478b(FlutterCgiHost flutterCgiHost, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    FlutterCgiRequest flutterCgiRequest = (FlutterCgiRequest) ((ArrayList) obj).get(0);
                    if (flutterCgiRequest != null) {
                        flutterCgiHost.send(flutterCgiRequest, new Result<FlutterCgiResponse>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", FlutterCgiPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(FlutterCgiResponse flutterCgiResponse) {
                                this.val$wrapped.put("result", flutterCgiResponse);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("requestArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", FlutterCgiPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: c */
            public static void m106479c(BinaryMessenger binaryMessenger, FlutterCgiHost flutterCgiHost) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterCgiHost.send", m106477a());
                if (flutterCgiHost != null) {
                    basicMessageChannel.setMessageHandler(new FlutterCgiPigeon$FlutterCgiHost$$a(flutterCgiHost));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void send(FlutterCgiRequest flutterCgiRequest, Result<FlutterCgiResponse> result);
    }

    public static class FlutterCgiHostCodec extends StandardMessageCodec {
        public static final FlutterCgiHostCodec INSTANCE = new FlutterCgiHostCodec();

        private FlutterCgiHostCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : FlutterCgiResponse.fromMap((Map) readValue(byteBuffer)) : FlutterCgiRequest.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterCgiRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterCgiRequest) obj).toMap());
            } else if (obj instanceof FlutterCgiResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FlutterCgiResponse) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class FlutterCgiRequest {
        private byte[] data;
        private Long funcId;
        private Boolean longPolling;
        private Long longPollingTimeout;
        private String uri;

        public static final class Builder {
            private byte[] data;
            private Long funcId;
            private Boolean longPolling;
            private Long longPollingTimeout;
            private String uri;

            public FlutterCgiRequest build() {
                FlutterCgiRequest flutterCgiRequest = new FlutterCgiRequest();
                flutterCgiRequest.setFuncId(this.funcId);
                flutterCgiRequest.setUri(this.uri);
                flutterCgiRequest.setData(this.data);
                flutterCgiRequest.setLongPolling(this.longPolling);
                flutterCgiRequest.setLongPollingTimeout(this.longPollingTimeout);
                return flutterCgiRequest;
            }

            public Builder setData(byte[] bArr) {
                this.data = bArr;
                return this;
            }

            public Builder setFuncId(Long l) {
                this.funcId = l;
                return this;
            }

            public Builder setLongPolling(Boolean bool) {
                this.longPolling = bool;
                return this;
            }

            public Builder setLongPollingTimeout(Long l) {
                this.longPollingTimeout = l;
                return this;
            }

            public Builder setUri(String str) {
                this.uri = str;
                return this;
            }
        }

        private FlutterCgiRequest() {
        }

        public static FlutterCgiRequest fromMap(Map<String, Object> map) {
            Long l;
            FlutterCgiRequest flutterCgiRequest = new FlutterCgiRequest();
            Object obj = map.get("funcId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterCgiRequest.setFuncId(l);
            flutterCgiRequest.setUri((String) map.get("uri"));
            flutterCgiRequest.setData((byte[]) map.get("data"));
            flutterCgiRequest.setLongPolling((Boolean) map.get("longPolling"));
            Object obj2 = map.get("longPollingTimeout");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            flutterCgiRequest.setLongPollingTimeout(l2);
            return flutterCgiRequest;
        }

        public byte[] getData() {
            return this.data;
        }

        public Long getFuncId() {
            return this.funcId;
        }

        public Boolean getLongPolling() {
            return this.longPolling;
        }

        public Long getLongPollingTimeout() {
            return this.longPollingTimeout;
        }

        public String getUri() {
            return this.uri;
        }

        public void setData(byte[] bArr) {
            if (bArr != null) {
                this.data = bArr;
                return;
            }
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }

        public void setFuncId(Long l) {
            if (l != null) {
                this.funcId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"funcId\" is null.");
        }

        public void setLongPolling(Boolean bool) {
            if (bool != null) {
                this.longPolling = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"longPolling\" is null.");
        }

        public void setLongPollingTimeout(Long l) {
            if (l != null) {
                this.longPollingTimeout = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"longPollingTimeout\" is null.");
        }

        public void setUri(String str) {
            if (str != null) {
                this.uri = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uri\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("funcId", this.funcId);
            hashMap.put("uri", this.uri);
            hashMap.put("data", this.data);
            hashMap.put("longPolling", this.longPolling);
            hashMap.put("longPollingTimeout", this.longPollingTimeout);
            return hashMap;
        }
    }

    public static class FlutterCgiResponse {
        private byte[] data;
        private Long errorCode;
        private Long errorType;

        public static final class Builder {
            private byte[] data;
            private Long errorCode;
            private Long errorType;

            public FlutterCgiResponse build() {
                FlutterCgiResponse flutterCgiResponse = new FlutterCgiResponse();
                flutterCgiResponse.setErrorType(this.errorType);
                flutterCgiResponse.setErrorCode(this.errorCode);
                flutterCgiResponse.setData(this.data);
                return flutterCgiResponse;
            }

            public Builder setData(byte[] bArr) {
                this.data = bArr;
                return this;
            }

            public Builder setErrorCode(Long l) {
                this.errorCode = l;
                return this;
            }

            public Builder setErrorType(Long l) {
                this.errorType = l;
                return this;
            }
        }

        private FlutterCgiResponse() {
        }

        public static FlutterCgiResponse fromMap(Map<String, Object> map) {
            Long l;
            FlutterCgiResponse flutterCgiResponse = new FlutterCgiResponse();
            Object obj = map.get("errorType");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterCgiResponse.setErrorType(l);
            Object obj2 = map.get(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            flutterCgiResponse.setErrorCode(l2);
            flutterCgiResponse.setData((byte[]) map.get("data"));
            return flutterCgiResponse;
        }

        public byte[] getData() {
            return this.data;
        }

        public Long getErrorCode() {
            return this.errorCode;
        }

        public Long getErrorType() {
            return this.errorType;
        }

        public void setData(byte[] bArr) {
            if (bArr != null) {
                this.data = bArr;
                return;
            }
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }

        public void setErrorCode(Long l) {
            if (l != null) {
                this.errorCode = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
        }

        public void setErrorType(Long l) {
            if (l != null) {
                this.errorType = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorType\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("errorType", this.errorType);
            hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, this.errorCode);
            hashMap.put("data", this.data);
            return hashMap;
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
