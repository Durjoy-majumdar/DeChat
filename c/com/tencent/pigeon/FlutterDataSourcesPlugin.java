package com.tencent.pigeon;

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
import p749xh.C66261f3;

public class FlutterDataSourcesPlugin {

    public static abstract class FinderDataSource {
        public static MessageCodec<Object> getCodec() {
            return FinderDataSourceCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(FinderDataSource finderDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetFindersRequest getFindersRequest = (GetFindersRequest) ((ArrayList) obj).get(0);
                if (getFindersRequest != null) {
                    finderDataSource.getLatestFinders(getFindersRequest, new Result<ProtoBuffer>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(ProtoBuffer protoBuffer) {
                            hashMap.put("result", protoBuffer);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(FinderDataSource finderDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetFinderImageFileRequest getFinderImageFileRequest = (GetFinderImageFileRequest) ((ArrayList) obj).get(0);
                if (getFinderImageFileRequest != null) {
                    finderDataSource.getImageFile(getFinderImageFileRequest, new Result<GetFinderImageFileResponse>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(GetFinderImageFileResponse getFinderImageFileResponse) {
                            hashMap.put("result", getFinderImageFileResponse);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        public static void setup(BinaryMessenger binaryMessenger, FinderDataSource finderDataSource) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FinderDataSource.getLatestFinders", getCodec());
            if (finderDataSource != null) {
                basicMessageChannel.setMessageHandler(new FlutterDataSourcesPlugin$FinderDataSource$$a(finderDataSource));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FinderDataSource.getImageFile", getCodec());
            if (finderDataSource != null) {
                basicMessageChannel2.setMessageHandler(new FlutterDataSourcesPlugin$FinderDataSource$$b(finderDataSource));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract void getImageFile(GetFinderImageFileRequest getFinderImageFileRequest, Result<GetFinderImageFileResponse> result);

        public abstract void getLatestFinders(GetFindersRequest getFindersRequest, Result<ProtoBuffer> result);
    }

    public static abstract class SnsDataSource {
        public static MessageCodec<Object> getCodec() {
            return SnsDataSourceCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(SnsDataSource snsDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetSnsRequest getSnsRequest = (GetSnsRequest) ((ArrayList) obj).get(0);
                if (getSnsRequest != null) {
                    snsDataSource.getLatestSns(getSnsRequest, new Result<ProtoBuffer>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(ProtoBuffer protoBuffer) {
                            hashMap.put("result", protoBuffer);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(SnsDataSource snsDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetSnsImageFileRequest getSnsImageFileRequest = (GetSnsImageFileRequest) ((ArrayList) obj).get(0);
                if (getSnsImageFileRequest != null) {
                    snsDataSource.getImageFile(getSnsImageFileRequest, new Result<GetSnsImageFileResponse>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(GetSnsImageFileResponse getSnsImageFileResponse) {
                            hashMap.put("result", getSnsImageFileResponse);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        public static void setup(BinaryMessenger binaryMessenger, SnsDataSource snsDataSource) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SnsDataSource.getLatestSns", getCodec());
            if (snsDataSource != null) {
                basicMessageChannel.setMessageHandler(new FlutterDataSourcesPlugin$SnsDataSource$$a(snsDataSource));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SnsDataSource.getImageFile", getCodec());
            if (snsDataSource != null) {
                basicMessageChannel2.setMessageHandler(new FlutterDataSourcesPlugin$SnsDataSource$$b(snsDataSource));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract void getImageFile(GetSnsImageFileRequest getSnsImageFileRequest, Result<GetSnsImageFileResponse> result);

        public abstract void getLatestSns(GetSnsRequest getSnsRequest, Result<ProtoBuffer> result);
    }

    public static abstract class TextStatusDataSource {
        public static MessageCodec<Object> getCodec() {
            return TextStatusDataSourceCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(TextStatusDataSource textStatusDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetTextStatusRequest getTextStatusRequest = (GetTextStatusRequest) ((ArrayList) obj).get(0);
                if (getTextStatusRequest != null) {
                    textStatusDataSource.getTextStatus(getTextStatusRequest, new Result<ProtoBuffer>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(ProtoBuffer protoBuffer) {
                            hashMap.put("result", protoBuffer);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(TextStatusDataSource textStatusDataSource, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                GetTextStatusImageFileRequest getTextStatusImageFileRequest = (GetTextStatusImageFileRequest) ((ArrayList) obj).get(0);
                if (getTextStatusImageFileRequest != null) {
                    textStatusDataSource.getImageFile(getTextStatusImageFileRequest, new Result<GetTextStatusImageFileResponse>() {
                        public void error(Throwable th) {
                            hashMap.put("error", FlutterDataSourcesPlugin.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(GetTextStatusImageFileResponse getTextStatusImageFileResponse) {
                            hashMap.put("result", getTextStatusImageFileResponse);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterDataSourcesPlugin.wrapError(e));
                reply.reply(hashMap);
            }
        }

        public static void setup(BinaryMessenger binaryMessenger, TextStatusDataSource textStatusDataSource) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TextStatusDataSource.getTextStatus", getCodec());
            if (textStatusDataSource != null) {
                basicMessageChannel.setMessageHandler(new FlutterDataSourcesPlugin$TextStatusDataSource$$a(textStatusDataSource));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.TextStatusDataSource.getImageFile", getCodec());
            if (textStatusDataSource != null) {
                basicMessageChannel2.setMessageHandler(new FlutterDataSourcesPlugin$TextStatusDataSource$$b(textStatusDataSource));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract void getImageFile(GetTextStatusImageFileRequest getTextStatusImageFileRequest, Result<GetTextStatusImageFileResponse> result);

        public abstract void getTextStatus(GetTextStatusRequest getTextStatusRequest, Result<ProtoBuffer> result);
    }

    public static class FinderDataSourceCodec extends StandardMessageCodec {
        public static final FinderDataSourceCodec INSTANCE = new FinderDataSourceCodec();

        private FinderDataSourceCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return GetFinderImageFileRequest.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return GetFinderImageFileResponse.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return GetFindersRequest.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return ProtoBuffer.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof GetFinderImageFileRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((GetFinderImageFileRequest) obj).toMap());
            } else if (obj instanceof GetFinderImageFileResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((GetFinderImageFileResponse) obj).toMap());
            } else if (obj instanceof GetFindersRequest) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((GetFindersRequest) obj).toMap());
            } else if (obj instanceof ProtoBuffer) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((ProtoBuffer) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class GetFinderImageFileRequest {
        private String decodeKey;
        private String url;
        private String urlToken;
        private String username;

        public static GetFinderImageFileRequest fromMap(Map<String, Object> map) {
            GetFinderImageFileRequest getFinderImageFileRequest = new GetFinderImageFileRequest();
            getFinderImageFileRequest.username = (String) map.get("username");
            getFinderImageFileRequest.url = (String) map.get("url");
            getFinderImageFileRequest.urlToken = (String) map.get("urlToken");
            getFinderImageFileRequest.decodeKey = (String) map.get("decodeKey");
            return getFinderImageFileRequest;
        }

        public String getDecodeKey() {
            return this.decodeKey;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlToken() {
            return this.urlToken;
        }

        public String getUsername() {
            return this.username;
        }

        public void setDecodeKey(String str) {
            this.decodeKey = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlToken(String str) {
            this.urlToken = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("url", this.url);
            hashMap.put("urlToken", this.urlToken);
            hashMap.put("decodeKey", this.decodeKey);
            return hashMap;
        }
    }

    public static class GetFinderImageFileResponse {
        private String path;

        public static GetFinderImageFileResponse fromMap(Map<String, Object> map) {
            GetFinderImageFileResponse getFinderImageFileResponse = new GetFinderImageFileResponse();
            getFinderImageFileResponse.path = (String) map.get("path");
            return getFinderImageFileResponse;
        }

        public String getPath() {
            return this.path;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.path);
            return hashMap;
        }
    }

    public static class GetFindersRequest {
        private Long timeLimit;
        private String username;

        public static GetFindersRequest fromMap(Map<String, Object> map) {
            Long l;
            GetFindersRequest getFindersRequest = new GetFindersRequest();
            getFindersRequest.username = (String) map.get("username");
            Object obj = map.get("timeLimit");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            getFindersRequest.timeLimit = l;
            return getFindersRequest;
        }

        public Long getTimeLimit() {
            return this.timeLimit;
        }

        public String getUsername() {
            return this.username;
        }

        public void setTimeLimit(Long l) {
            this.timeLimit = l;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("timeLimit", this.timeLimit);
            return hashMap;
        }
    }

    public static class GetSnsImageFileRequest {
        private String localId;
        private String mediaId;
        private Boolean requestThumb;
        private String snsId;

        public static GetSnsImageFileRequest fromMap(Map<String, Object> map) {
            GetSnsImageFileRequest getSnsImageFileRequest = new GetSnsImageFileRequest();
            getSnsImageFileRequest.localId = (String) map.get(C66261f3.COL_LOCALID);
            getSnsImageFileRequest.snsId = (String) map.get("snsId");
            getSnsImageFileRequest.mediaId = (String) map.get("mediaId");
            getSnsImageFileRequest.requestThumb = (Boolean) map.get("requestThumb");
            return getSnsImageFileRequest;
        }

        public String getLocalId() {
            return this.localId;
        }

        public String getMediaId() {
            return this.mediaId;
        }

        public Boolean getRequestThumb() {
            return this.requestThumb;
        }

        public String getSnsId() {
            return this.snsId;
        }

        public void setLocalId(String str) {
            this.localId = str;
        }

        public void setMediaId(String str) {
            this.mediaId = str;
        }

        public void setRequestThumb(Boolean bool) {
            this.requestThumb = bool;
        }

        public void setSnsId(String str) {
            this.snsId = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(C66261f3.COL_LOCALID, this.localId);
            hashMap.put("snsId", this.snsId);
            hashMap.put("mediaId", this.mediaId);
            hashMap.put("requestThumb", this.requestThumb);
            return hashMap;
        }
    }

    public static class GetSnsImageFileResponse {
        private String path;

        public static GetSnsImageFileResponse fromMap(Map<String, Object> map) {
            GetSnsImageFileResponse getSnsImageFileResponse = new GetSnsImageFileResponse();
            getSnsImageFileResponse.path = (String) map.get("path");
            return getSnsImageFileResponse;
        }

        public String getPath() {
            return this.path;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.path);
            return hashMap;
        }
    }

    public static class GetSnsRequest {
        private Long timeLimit;
        private String username;

        public static GetSnsRequest fromMap(Map<String, Object> map) {
            Long l;
            GetSnsRequest getSnsRequest = new GetSnsRequest();
            getSnsRequest.username = (String) map.get("username");
            Object obj = map.get("timeLimit");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            getSnsRequest.timeLimit = l;
            return getSnsRequest;
        }

        public Long getTimeLimit() {
            return this.timeLimit;
        }

        public String getUsername() {
            return this.username;
        }

        public void setTimeLimit(Long l) {
            this.timeLimit = l;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("timeLimit", this.timeLimit);
            return hashMap;
        }
    }

    public static class GetTextStatusImageFileRequest {
        private String statusId;
        private String url;
        private String username;

        public static GetTextStatusImageFileRequest fromMap(Map<String, Object> map) {
            GetTextStatusImageFileRequest getTextStatusImageFileRequest = new GetTextStatusImageFileRequest();
            getTextStatusImageFileRequest.username = (String) map.get("username");
            getTextStatusImageFileRequest.statusId = (String) map.get("statusId");
            getTextStatusImageFileRequest.url = (String) map.get("url");
            return getTextStatusImageFileRequest;
        }

        public String getStatusId() {
            return this.statusId;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUsername() {
            return this.username;
        }

        public void setStatusId(String str) {
            this.statusId = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("statusId", this.statusId);
            hashMap.put("url", this.url);
            return hashMap;
        }
    }

    public static class GetTextStatusImageFileResponse {
        private String path;

        public static GetTextStatusImageFileResponse fromMap(Map<String, Object> map) {
            GetTextStatusImageFileResponse getTextStatusImageFileResponse = new GetTextStatusImageFileResponse();
            getTextStatusImageFileResponse.path = (String) map.get("path");
            return getTextStatusImageFileResponse;
        }

        public String getPath() {
            return this.path;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.path);
            return hashMap;
        }
    }

    public static class GetTextStatusRequest {
        private Long timeLimit;
        private String username;

        public static GetTextStatusRequest fromMap(Map<String, Object> map) {
            Long l;
            GetTextStatusRequest getTextStatusRequest = new GetTextStatusRequest();
            getTextStatusRequest.username = (String) map.get("username");
            Object obj = map.get("timeLimit");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            getTextStatusRequest.timeLimit = l;
            return getTextStatusRequest;
        }

        public Long getTimeLimit() {
            return this.timeLimit;
        }

        public String getUsername() {
            return this.username;
        }

        public void setTimeLimit(Long l) {
            this.timeLimit = l;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("username", this.username);
            hashMap.put("timeLimit", this.timeLimit);
            return hashMap;
        }
    }

    public static class ProtoBuffer {
        private byte[] buffer;

        public static ProtoBuffer fromMap(Map<String, Object> map) {
            ProtoBuffer protoBuffer = new ProtoBuffer();
            protoBuffer.buffer = (byte[]) map.get("buffer");
            return protoBuffer;
        }

        public byte[] getBuffer() {
            return this.buffer;
        }

        public void setBuffer(byte[] bArr) {
            this.buffer = bArr;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("buffer", this.buffer);
            return hashMap;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static class SnsDataSourceCodec extends StandardMessageCodec {
        public static final SnsDataSourceCodec INSTANCE = new SnsDataSourceCodec();

        private SnsDataSourceCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return GetSnsImageFileRequest.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return GetSnsImageFileResponse.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return GetSnsRequest.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return ProtoBuffer.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof GetSnsImageFileRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((GetSnsImageFileRequest) obj).toMap());
            } else if (obj instanceof GetSnsImageFileResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((GetSnsImageFileResponse) obj).toMap());
            } else if (obj instanceof GetSnsRequest) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((GetSnsRequest) obj).toMap());
            } else if (obj instanceof ProtoBuffer) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((ProtoBuffer) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class TextStatusDataSourceCodec extends StandardMessageCodec {
        public static final TextStatusDataSourceCodec INSTANCE = new TextStatusDataSourceCodec();

        private TextStatusDataSourceCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return GetTextStatusImageFileRequest.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return GetTextStatusImageFileResponse.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return GetTextStatusRequest.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return ProtoBuffer.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof GetTextStatusImageFileRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((GetTextStatusImageFileRequest) obj).toMap());
            } else if (obj instanceof GetTextStatusImageFileResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((GetTextStatusImageFileResponse) obj).toMap());
            } else if (obj instanceof GetTextStatusRequest) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((GetTextStatusRequest) obj).toMap());
            } else if (obj instanceof ProtoBuffer) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((ProtoBuffer) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
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
