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

public class FlutterSendMusicToChatPigeon {

    public static abstract class FlutterSendMusicToChatAction {
        public static MessageCodec<Object> getCodec() {
            return FlutterSendMusicToChatActionCodec.INSTANCE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$0(FlutterSendMusicToChatAction flutterSendMusicToChatAction, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                SendMusicRequest sendMusicRequest = (SendMusicRequest) ((ArrayList) obj).get(0);
                if (sendMusicRequest != null) {
                    flutterSendMusicToChatAction.sendMusicToChat(sendMusicRequest);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("requestArg unexpectedly null.");
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterSendMusicToChatPigeon.wrapError(e));
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$setup$1(FlutterSendMusicToChatAction flutterSendMusicToChatAction, Object obj, BasicMessageChannel.Reply reply) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("result", flutterSendMusicToChatAction.getChatUserName());
            } catch (Error | RuntimeException e) {
                hashMap.put("error", FlutterSendMusicToChatPigeon.wrapError(e));
            }
            reply.reply(hashMap);
        }

        public static void setup(BinaryMessenger binaryMessenger, FlutterSendMusicToChatAction flutterSendMusicToChatAction) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSendMusicToChatAction.sendMusicToChat", getCodec());
            if (flutterSendMusicToChatAction != null) {
                basicMessageChannel.setMessageHandler(new FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$a(flutterSendMusicToChatAction));
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.FlutterSendMusicToChatAction.getChatUserName", getCodec());
            if (flutterSendMusicToChatAction != null) {
                basicMessageChannel2.setMessageHandler(new FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$b(flutterSendMusicToChatAction));
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract SendMusicResponse getChatUserName();

        public abstract void sendMusicToChat(SendMusicRequest sendMusicRequest);
    }

    public static class FlutterSendMusicToChatActionCodec extends StandardMessageCodec {
        public static final FlutterSendMusicToChatActionCodec INSTANCE = new FlutterSendMusicToChatActionCodec();

        private FlutterSendMusicToChatActionCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : SendMusicResponse.fromMap((Map) readValue(byteBuffer)) : SendMusicRequest.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof SendMusicRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((SendMusicRequest) obj).toMap());
            } else if (obj instanceof SendMusicResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((SendMusicResponse) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class SendMusicRequest {
        private String appid;
        private String coverUrl;
        private String dataUrl;
        private String lyric;
        private String mid;
        private String musicId;
        private Long requestCode;
        private String singer;
        private String songName;
        private String webUrl;

        public static SendMusicRequest fromMap(Map<String, Object> map) {
            Long l;
            SendMusicRequest sendMusicRequest = new SendMusicRequest();
            sendMusicRequest.musicId = (String) map.get("musicId");
            sendMusicRequest.songName = (String) map.get("songName");
            sendMusicRequest.singer = (String) map.get("singer");
            sendMusicRequest.dataUrl = (String) map.get("dataUrl");
            sendMusicRequest.appid = (String) map.get("appid");
            sendMusicRequest.webUrl = (String) map.get("webUrl");
            sendMusicRequest.coverUrl = (String) map.get("coverUrl");
            sendMusicRequest.mid = (String) map.get("mid");
            sendMusicRequest.lyric = (String) map.get("lyric");
            Object obj = map.get("requestCode");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sendMusicRequest.requestCode = l;
            return sendMusicRequest;
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

        public String getLyric() {
            return this.lyric;
        }

        public String getMid() {
            return this.mid;
        }

        public String getMusicId() {
            return this.musicId;
        }

        public Long getRequestCode() {
            return this.requestCode;
        }

        public String getSinger() {
            return this.singer;
        }

        public String getSongName() {
            return this.songName;
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

        public void setLyric(String str) {
            this.lyric = str;
        }

        public void setMid(String str) {
            this.mid = str;
        }

        public void setMusicId(String str) {
            this.musicId = str;
        }

        public void setRequestCode(Long l) {
            this.requestCode = l;
        }

        public void setSinger(String str) {
            this.singer = str;
        }

        public void setSongName(String str) {
            this.songName = str;
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
            hashMap.put("mid", this.mid);
            hashMap.put("lyric", this.lyric);
            hashMap.put("requestCode", this.requestCode);
            return hashMap;
        }
    }

    public static class SendMusicResponse {
        private String userName;

        public static SendMusicResponse fromMap(Map<String, Object> map) {
            SendMusicResponse sendMusicResponse = new SendMusicResponse();
            sendMusicResponse.userName = (String) map.get("userName");
            return sendMusicResponse;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("userName", this.userName);
            return hashMap;
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
