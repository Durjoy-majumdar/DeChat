package com.tencent.pigeon;

import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterMusicPlayerApi {

    public static class MusicCallbackApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public MusicCallbackApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return MusicCallbackApiCodec.INSTANCE;
        }

        public void onEndedPlay(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onEndedPlay", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$f(reply));
        }

        public void onPausePlay(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onPausePlay", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$g(reply));
        }

        public void onPlayProgressChanged(Double d, Double d2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onPlayProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(new Double[]{d, d2})), new FlutterMusicPlayerApi$MusicCallbackApi$$c(reply));
        }

        public void onResumePlay(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onResumePlay", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$d(reply));
        }

        public void onSeeked(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onSeeked", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$b(reply));
        }

        public void onSeeking(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onSeeking", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$h(reply));
        }

        public void onStartPlay(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onStartPlay", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$a(reply));
        }

        public void onStopPlay(FlutterMusicInfo flutterMusicInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.MusicCallbackApi.onStopPlay", getCodec()).send(new ArrayList(Arrays.asList(new FlutterMusicInfo[]{flutterMusicInfo})), new FlutterMusicPlayerApi$MusicCallbackApi$$e(reply));
        }
    }

    public static abstract class MusicPlayerApi {
        public static MessageCodec<Object> getCodec() {
            return MusicPlayerApiCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", musicPlayerApi.getCurrentMusic());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                FlutterMusicInfo flutterMusicInfo = (FlutterMusicInfo) ((ArrayList) obj).get(0);
                if (flutterMusicInfo != null) {
                    musicPlayerApi.play(flutterMusicInfo);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("infoArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$10(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", musicPlayerApi.canPlayMusic());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$2(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                musicPlayerApi.pause();
                hashMap.put("result", (Object) null);
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$3(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                musicPlayerApi.resume();
                hashMap.put("result", (Object) null);
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$4(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                musicPlayerApi.stop();
                hashMap.put("result", (Object) null);
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$5(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                FLMusicIntType fLMusicIntType = (FLMusicIntType) ((ArrayList) obj).get(0);
                if (fLMusicIntType != null) {
                    musicPlayerApi.seek(fLMusicIntType);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("timeMsArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$6(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", musicPlayerApi.getCurrentPosition());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$7(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", musicPlayerApi.getDuration());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$8(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", musicPlayerApi.getHistory());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$9(MusicPlayerApi musicPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                musicPlayerApi.clearHistory();
                hashMap.put("result", (Object) null);
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterMusicPlayerApi.wrapError(e));
            }
            reply.reply(hashMap);
        }

        public static void setup(BinaryMessenger binaryMessenger, MusicPlayerApi musicPlayerApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.getCurrentMusic", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$a(musicPlayerApi));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.play", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel2.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$d(musicPlayerApi));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.pause", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel3.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$e(musicPlayerApi));
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.resume", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel4.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$f(musicPlayerApi));
            } else {
                basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.stop", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel5.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$g(musicPlayerApi));
            } else {
                basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.seek", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel6.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$h(musicPlayerApi));
            } else {
                basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.getCurrentPosition", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel7.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$i(musicPlayerApi));
            } else {
                basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.getDuration", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel8.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$j(musicPlayerApi));
            } else {
                basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.getHistory", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel9.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$k(musicPlayerApi));
            } else {
                basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.clearHistory", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel10.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$b(musicPlayerApi));
            } else {
                basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.MusicPlayerApi.canPlayMusic", getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel11.setMessageHandler(new FlutterMusicPlayerApi$MusicPlayerApi$$c(musicPlayerApi));
            } else {
                basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract Boolean canPlayMusic();

        public abstract void clearHistory();

        public abstract FlutterMusicInfo getCurrentMusic();

        public abstract FLMusicIntType getCurrentPosition();

        public abstract FLMusicIntType getDuration();

        public abstract String getHistory();

        public abstract void pause();

        public abstract void play(FlutterMusicInfo flutterMusicInfo);

        public abstract void resume();

        public abstract void seek(FLMusicIntType fLMusicIntType);

        public abstract void stop();
    }

    public static class FLMusicIntType {
        private Long value;

        public static FLMusicIntType fromMap(Map<String, Object> map) {
            Long l;
            FLMusicIntType fLMusicIntType = new FLMusicIntType();
            Object obj = map.get("value");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fLMusicIntType.value = l;
            return fLMusicIntType;
        }

        public Long getValue() {
            return this.value;
        }

        public void setValue(Long l) {
            this.value = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FlutterMusicInfo {
        private String appid;
        private String coverUrl;
        private String dataUrl;
        private FLMusicIntType duration;
        private String lyric;
        private String mid;
        private String musicId;
        private String singer;
        private String songName;
        private String sourceType;
        private String webUrl;

        public static FlutterMusicInfo fromMap(Map<String, Object> map) {
            FlutterMusicInfo flutterMusicInfo = new FlutterMusicInfo();
            flutterMusicInfo.musicId = (String) map.get("musicId");
            flutterMusicInfo.songName = (String) map.get("songName");
            flutterMusicInfo.singer = (String) map.get("singer");
            flutterMusicInfo.dataUrl = (String) map.get("dataUrl");
            flutterMusicInfo.appid = (String) map.get("appid");
            flutterMusicInfo.webUrl = (String) map.get("webUrl");
            flutterMusicInfo.coverUrl = (String) map.get("coverUrl");
            flutterMusicInfo.duration = FLMusicIntType.fromMap((Map) map.get("duration"));
            flutterMusicInfo.mid = (String) map.get("mid");
            flutterMusicInfo.lyric = (String) map.get("lyric");
            flutterMusicInfo.sourceType = (String) map.get("sourceType");
            return flutterMusicInfo;
        }

        public String getAppid() {
            return this.appid;
        }

        public String getCoverUrl() {
            return this.coverUrl;
        }

        public String getDataUrl() {
            return this.dataUrl;
        }

        public FLMusicIntType getDuration() {
            return this.duration;
        }

        public String getLyric() {
            return this.lyric;
        }

        public String getMid() {
            return this.mid;
        }

        public String getMusicId() {
            return this.musicId;
        }

        public String getSinger() {
            return this.singer;
        }

        public String getSongName() {
            return this.songName;
        }

        public String getSourceType() {
            return this.sourceType;
        }

        public String getWebUrl() {
            return this.webUrl;
        }

        public void setAppid(String str) {
            this.appid = str;
        }

        public void setCoverUrl(String str) {
            this.coverUrl = str;
        }

        public void setDataUrl(String str) {
            this.dataUrl = str;
        }

        public void setDuration(FLMusicIntType fLMusicIntType) {
            this.duration = fLMusicIntType;
        }

        public void setLyric(String str) {
            this.lyric = str;
        }

        public void setMid(String str) {
            this.mid = str;
        }

        public void setMusicId(String str) {
            this.musicId = str;
        }

        public void setSinger(String str) {
            this.singer = str;
        }

        public void setSongName(String str) {
            this.songName = str;
        }

        public void setSourceType(String str) {
            this.sourceType = str;
        }

        public void setWebUrl(String str) {
            this.webUrl = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("musicId", this.musicId);
            hashMap.put("songName", this.songName);
            hashMap.put("singer", this.singer);
            hashMap.put("dataUrl", this.dataUrl);
            hashMap.put("appid", this.appid);
            hashMap.put("webUrl", this.webUrl);
            hashMap.put("coverUrl", this.coverUrl);
            FLMusicIntType fLMusicIntType = this.duration;
            hashMap.put("duration", fLMusicIntType == null ? null : fLMusicIntType.toMap());
            hashMap.put("mid", this.mid);
            hashMap.put("lyric", this.lyric);
            hashMap.put("sourceType", this.sourceType);
            return hashMap;
        }
    }

    public static class MusicCallbackApiCodec extends StandardMessageCodec {
        public static final MusicCallbackApiCodec INSTANCE = new MusicCallbackApiCodec();

        private MusicCallbackApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return FLMusicIntType.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_VIDEO_SAMPLE /*-121*/:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FLMusicIntType) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FLMusicIntType) obj).toMap());
                return;
            }
            boolean z = obj instanceof FlutterMusicInfo;
            if (z) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class MusicPlayerApiCodec extends StandardMessageCodec {
        public static final MusicPlayerApiCodec INSTANCE = new MusicPlayerApiCodec();

        private MusicPlayerApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return FLMusicIntType.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return FLMusicIntType.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FLMusicIntType.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return FlutterMusicInfo.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            boolean z = obj instanceof FLMusicIntType;
            if (z) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FLMusicIntType) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FLMusicIntType) obj).toMap());
            } else if (z) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FLMusicIntType) obj).toMap());
            } else {
                boolean z2 = obj instanceof FlutterMusicInfo;
                if (z2) {
                    byteArrayOutputStream.write(131);
                    writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
                } else if (z2) {
                    byteArrayOutputStream.write(132);
                    writeValue(byteArrayOutputStream, ((FlutterMusicInfo) obj).toMap());
                } else {
                    super.writeValue(byteArrayOutputStream, obj);
                }
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
