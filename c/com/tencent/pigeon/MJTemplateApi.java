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

public class MJTemplateApi {

    public static abstract class HostPageLaunch {
        public static MessageCodec<Object> getCodec() {
            return HostPageLaunchCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(HostPageLaunch hostPageLaunch, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                AlbumRequest albumRequest = (AlbumRequest) ((ArrayList) obj).get(0);
                if (albumRequest != null) {
                    hostPageLaunch.launchAlbum(albumRequest, new Result<Boolean>() {
                        public void error(Throwable th) {
                            hashMap.put("error", MJTemplateApi.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(Boolean bool) {
                            hashMap.put("result", bool);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(HostPageLaunch hostPageLaunch, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                MusicPostRequest musicPostRequest = (MusicPostRequest) ((ArrayList) obj).get(0);
                if (musicPostRequest != null) {
                    hostPageLaunch.requestMusicPost(musicPostRequest, new Result<Boolean>() {
                        public void error(Throwable th) {
                            hashMap.put("error", MJTemplateApi.wrapError(th));
                            reply.reply(hashMap);
                        }

                        public void success(Boolean bool) {
                            hashMap.put("result", bool);
                            reply.reply(hashMap);
                        }
                    });
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$2(HostPageLaunch hostPageLaunch, Object obj, final BasicMessageChannel.Reply reply) {
            final HashMap hashMap = new HashMap();
            try {
                hostPageLaunch.getResourceList(new Result<byte[]>() {
                    public void error(Throwable th) {
                        hashMap.put("error", MJTemplateApi.wrapError(th));
                        reply.reply(hashMap);
                    }

                    public void success(byte[] bArr) {
                        hashMap.put("result", bArr);
                        reply.reply(hashMap);
                    }
                });
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
                reply.reply(hashMap);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$3(HostPageLaunch hostPageLaunch, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", hostPageLaunch.getWeVisionVersion());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$4(HostPageLaunch hostPageLaunch, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", hostPageLaunch.getMaasVersion());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$5(HostPageLaunch hostPageLaunch, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                String str = (String) ((ArrayList) obj).get(0);
                if (str != null) {
                    hostPageLaunch.reportTemplateListItemClicked(str);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("templateIdArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$6(HostPageLaunch hostPageLaunch, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                String str = (String) ((ArrayList) obj).get(0);
                if (str != null) {
                    hostPageLaunch.reportTemplateListItemExposed(str);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("templateIdArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", MJTemplateApi.wrapError(e));
            }
        }

        public static void setup(BinaryMessenger binaryMessenger, HostPageLaunch hostPageLaunch) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.launchAlbum", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel.setMessageHandler(new MJTemplateApi$HostPageLaunch$$a(hostPageLaunch));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.requestMusicPost", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel2.setMessageHandler(new MJTemplateApi$HostPageLaunch$$b(hostPageLaunch));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.getResourceList", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel3.setMessageHandler(new MJTemplateApi$HostPageLaunch$$c(hostPageLaunch));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.getWeVisionVersion", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel4.setMessageHandler(new MJTemplateApi$HostPageLaunch$$d(hostPageLaunch));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.getMaasVersion", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel5.setMessageHandler(new MJTemplateApi$HostPageLaunch$$e(hostPageLaunch));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.reportTemplateListItemClicked", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel6.setMessageHandler(new MJTemplateApi$HostPageLaunch$$f(hostPageLaunch));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.HostPageLaunch.reportTemplateListItemExposed", getCodec());
            if (hostPageLaunch != null) {
                basicMessageChannel7.setMessageHandler(new MJTemplateApi$HostPageLaunch$$g(hostPageLaunch));
            } else {
                basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract Long getMaasVersion();

        public abstract void getResourceList(Result<byte[]> result);

        public abstract Long getWeVisionVersion();

        public abstract void launchAlbum(AlbumRequest albumRequest, Result<Boolean> result);

        public abstract void reportTemplateListItemClicked(String str);

        public abstract void reportTemplateListItemExposed(String str);

        public abstract void requestMusicPost(MusicPostRequest musicPostRequest, Result<Boolean> result);
    }

    public static class AlbumRequest {
        private byte[] buffer;

        public static AlbumRequest fromMap(Map<String, Object> map) {
            AlbumRequest albumRequest = new AlbumRequest();
            albumRequest.buffer = (byte[]) map.get("buffer");
            return albumRequest;
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

    public static class MusicPostRequest {
        private byte[] buffer;
        private Long chooseIdx;

        public static MusicPostRequest fromMap(Map<String, Object> map) {
            Long l;
            MusicPostRequest musicPostRequest = new MusicPostRequest();
            musicPostRequest.buffer = (byte[]) map.get("buffer");
            Object obj = map.get("chooseIdx");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            musicPostRequest.chooseIdx = l;
            return musicPostRequest;
        }

        public byte[] getBuffer() {
            return this.buffer;
        }

        public Long getChooseIdx() {
            return this.chooseIdx;
        }

        public void setBuffer(byte[] bArr) {
            this.buffer = bArr;
        }

        public void setChooseIdx(Long l) {
            this.chooseIdx = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("buffer", this.buffer);
            hashMap.put("chooseIdx", this.chooseIdx);
            return hashMap;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static class HostPageLaunchCodec extends StandardMessageCodec {
        public static final HostPageLaunchCodec INSTANCE = new HostPageLaunchCodec();

        private HostPageLaunchCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : MusicPostRequest.fromMap((Map) readValue(byteBuffer)) : AlbumRequest.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AlbumRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AlbumRequest) obj).toMap());
            } else if (obj instanceof MusicPostRequest) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((MusicPostRequest) obj).toMap());
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
