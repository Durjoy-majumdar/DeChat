package com.tencent.pigeon;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class RingtoneBridge {

    public static class FLBoolType {
        private Boolean value;

        public static FLBoolType fromMap(Map<String, Object> map) {
            FLBoolType fLBoolType = new FLBoolType();
            fLBoolType.value = (Boolean) map.get("value");
            return fLBoolType;
        }

        public Boolean getValue() {
            return this.value;
        }

        public void setValue(Boolean bool) {
            this.value = bool;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FLStringType {
        private String value;

        public static FLStringType fromMap(Map<String, Object> map) {
            FLStringType fLStringType = new FLStringType();
            fLStringType.value = (String) map.get("value");
            return fLStringType;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static abstract class RingtoneHostApi {
        public static void setup(BinaryMessenger binaryMessenger, RingtoneHostApi ringtoneHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RingtoneHostApi.setRingtone", new StandardMessageCodec());
            if (ringtoneHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
                    public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                        HashMap hashMap = new HashMap();
                        try {
                            hashMap.put("result", RingtoneHostApi.this.setRingtone(SetRingtoneParams.fromMap((Map) obj)).toMap());
                        } catch (Error | RuntimeException e) {
                            hashMap.put("error", RingtoneBridge.wrapError(e));
                        }
                        reply.reply(hashMap);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RingtoneHostApi.onRingtoneIconClick", new StandardMessageCodec());
            if (ringtoneHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
                    public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                        HashMap hashMap = new HashMap();
                        try {
                            RingtoneHostApi.this.onRingtoneIconClick();
                            hashMap.put("result", (Object) null);
                        } catch (Error | RuntimeException e) {
                            hashMap.put("error", RingtoneBridge.wrapError(e));
                        }
                        reply.reply(hashMap);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.RingtoneHostApi.pickNewFinder", new StandardMessageCodec());
            if (ringtoneHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler<Object>() {
                    public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                        HashMap hashMap = new HashMap();
                        try {
                            hashMap.put("result", RingtoneHostApi.this.pickNewFinder(FLStringType.fromMap((Map) obj)).toMap());
                        } catch (Error | RuntimeException e) {
                            hashMap.put("error", RingtoneBridge.wrapError(e));
                        }
                        reply.reply(hashMap);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
            }
        }

        public abstract void onRingtoneIconClick();

        public abstract FLBoolType pickNewFinder(FLStringType fLStringType);

        public abstract FLBoolType setRingtone(SetRingtoneParams setRingtoneParams);
    }

    public static class SetRingtoneParams {
        private Boolean enabled;
        private Long endTs;
        private Long finderGalleryTabId;
        private String finderNonceId;
        private Long finderObjectId;
        private Boolean isCut;
        private Long requestScene;
        private Long startTs;
        private String username;

        public static SetRingtoneParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            SetRingtoneParams setRingtoneParams = new SetRingtoneParams();
            setRingtoneParams.enabled = (Boolean) map.get("enabled");
            Object obj = map.get("finderObjectId");
            Long l5 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            setRingtoneParams.finderObjectId = l;
            setRingtoneParams.finderNonceId = (String) map.get("finderNonceId");
            Object obj2 = map.get("startTs");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            setRingtoneParams.startTs = l2;
            Object obj3 = map.get("endTs");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            setRingtoneParams.endTs = l3;
            setRingtoneParams.username = (String) map.get("username");
            Object obj4 = map.get("requestScene");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            setRingtoneParams.requestScene = l4;
            Object obj5 = map.get("finderGalleryTabId");
            if (obj5 != null) {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            setRingtoneParams.finderGalleryTabId = l5;
            setRingtoneParams.isCut = (Boolean) map.get("isCut");
            return setRingtoneParams;
        }

        public Boolean getEnabled() {
            return this.enabled;
        }

        public Long getEndTs() {
            return this.endTs;
        }

        public Long getFinderGalleryTabId() {
            return this.finderGalleryTabId;
        }

        public String getFinderNonceId() {
            return this.finderNonceId;
        }

        public Long getFinderObjectId() {
            return this.finderObjectId;
        }

        public Boolean getIsCut() {
            return this.isCut;
        }

        public Long getRequestScene() {
            return this.requestScene;
        }

        public Long getStartTs() {
            return this.startTs;
        }

        public String getUsername() {
            return this.username;
        }

        public void setEnabled(Boolean bool) {
            this.enabled = bool;
        }

        public void setEndTs(Long l) {
            this.endTs = l;
        }

        public void setFinderGalleryTabId(Long l) {
            this.finderGalleryTabId = l;
        }

        public void setFinderNonceId(String str) {
            this.finderNonceId = str;
        }

        public void setFinderObjectId(Long l) {
            this.finderObjectId = l;
        }

        public void setIsCut(Boolean bool) {
            this.isCut = bool;
        }

        public void setRequestScene(Long l) {
            this.requestScene = l;
        }

        public void setStartTs(Long l) {
            this.startTs = l;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("enabled", this.enabled);
            hashMap.put("finderObjectId", this.finderObjectId);
            hashMap.put("finderNonceId", this.finderNonceId);
            hashMap.put("startTs", this.startTs);
            hashMap.put("endTs", this.endTs);
            hashMap.put("username", this.username);
            hashMap.put("requestScene", this.requestScene);
            hashMap.put("finderGalleryTabId", this.finderGalleryTabId);
            hashMap.put("isCut", this.isCut);
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
