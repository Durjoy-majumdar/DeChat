package com.tencent.pigeon;

import android.util.Log;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class TPPlayerApi {

    public interface TPFlutterApi {
        Boolean tpAddEffect(TPPlayerRenderEffect tPPlayerRenderEffect);

        Boolean tpClearEffect(Long l);

        TPVideoSizeRet tpGetVideoSize(Long l);

        Boolean tpPlaySetScaleType(TPPlayerScaleTypeParams tPPlayerScaleTypeParams);

        Long tpPlayerCreate(Long l);

        TPPlayerRange tpPlayerGetPlayRange(Long l);

        Long tpPlayerInit(TPPlayerInitParams tPPlayerInitParams);

        Boolean tpPlayerPause(Long l);

        Boolean tpPlayerPlay(Long l);

        Boolean tpPlayerPrepare(Long l);

        Boolean tpPlayerSeek(TPPlayerSeekParams tPPlayerSeekParams);

        Boolean tpPlayerSetLoop(TPPlayerSetLoopParams tPPlayerSetLoopParams);

        Boolean tpPlayerSetMediaInfo(TPPlayerSetMediaInfoParams tPPlayerSetMediaInfoParams);

        Boolean tpPlayerSetMediaProto(TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams);

        Boolean tpPlayerSetMute(TPPlayerSetMuteParams tPPlayerSetMuteParams);

        Boolean tpPlayerSetPlayRange(TPPlayerSetPlayRangeParams tPPlayerSetPlayRangeParams);

        Boolean tpPlayerSetStreamType(TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams);

        Boolean tpRelease(Long l);

        Boolean tpRemoveEffect(TPPlayerRenderEffect tPPlayerRenderEffect);

        Boolean tpSetOnFirstFrameRenderedListener(Long l);

        Boolean tpSetOnPreparedListener(Long l);

        Boolean tpSetProgressListener(Long l);

        Boolean tpStop(Long l);

        Boolean tpUpdateDisplaySize(TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams);

        Boolean tpUpdateEffect(TPPlayerRenderEffect tPPlayerRenderEffect);
    }

    public static class TPFlutterApiCodec extends StandardMessageCodec {
        public static final TPFlutterApiCodec INSTANCE = new TPFlutterApiCodec();

        private TPFlutterApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return TPPlayerInitParams.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return TPPlayerRange.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return TPPlayerRenderEffect.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return TPPlayerScaleTypeParams.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return TPPlayerSeekParams.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return TPPlayerSetLoopParams.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                    return TPPlayerSetMediaInfoParams.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_VIDEO_SAMPLE /*-121*/:
                    return TPPlayerSetMediaProtoParams.fromMap((Map) readValue(byteBuffer));
                case -120:
                    return TPPlayerSetMuteParams.fromMap((Map) readValue(byteBuffer));
                case -119:
                    return TPPlayerSetPlayRangeParams.fromMap((Map) readValue(byteBuffer));
                case -118:
                    return TPPlayerSetStreamTypeParams.fromMap((Map) readValue(byteBuffer));
                case -117:
                    return TPPlayerUpdateSizeParams.fromMap((Map) readValue(byteBuffer));
                case -116:
                    return TPVideoSizeRet.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof TPPlayerInitParams) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((TPPlayerInitParams) obj).toMap());
            } else if (obj instanceof TPPlayerRange) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((TPPlayerRange) obj).toMap());
            } else if (obj instanceof TPPlayerRenderEffect) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((TPPlayerRenderEffect) obj).toMap());
            } else if (obj instanceof TPPlayerScaleTypeParams) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((TPPlayerScaleTypeParams) obj).toMap());
            } else if (obj instanceof TPPlayerSeekParams) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((TPPlayerSeekParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetLoopParams) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((TPPlayerSetLoopParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetMediaInfoParams) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((TPPlayerSetMediaInfoParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetMediaProtoParams) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((TPPlayerSetMediaProtoParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetMuteParams) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((TPPlayerSetMuteParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetPlayRangeParams) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((TPPlayerSetPlayRangeParams) obj).toMap());
            } else if (obj instanceof TPPlayerSetStreamTypeParams) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((TPPlayerSetStreamTypeParams) obj).toMap());
            } else if (obj instanceof TPPlayerUpdateSizeParams) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((TPPlayerUpdateSizeParams) obj).toMap());
            } else if (obj instanceof TPVideoSizeRet) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((TPVideoSizeRet) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class TPPlayerInitParams {
        private Long height;
        private Long playerId;
        private Long width;

        public static final class Builder {
            private Long height;
            private Long playerId;
            private Long width;

            public TPPlayerInitParams build() {
                TPPlayerInitParams tPPlayerInitParams = new TPPlayerInitParams();
                tPPlayerInitParams.setPlayerId(this.playerId);
                tPPlayerInitParams.setWidth(this.width);
                tPPlayerInitParams.setHeight(this.height);
                return tPPlayerInitParams;
            }

            public Builder setHeight(Long l) {
                this.height = l;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setWidth(Long l) {
                this.width = l;
                return this;
            }
        }

        private TPPlayerInitParams() {
        }

        public static TPPlayerInitParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            TPPlayerInitParams tPPlayerInitParams = new TPPlayerInitParams();
            Object obj = map.get("playerId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerInitParams.setPlayerId(l);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerInitParams.setWidth(l2);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            tPPlayerInitParams.setHeight(l3);
            return tPPlayerInitParams;
        }

        public Long getHeight() {
            return this.height;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getWidth() {
            return this.width;
        }

        public void setHeight(Long l) {
            if (l != null) {
                this.height = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setWidth(Long l) {
            if (l != null) {
                this.width = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            return hashMap;
        }
    }

    public static class TPPlayerRange {
        private Long endTimeMs;
        private Long startTimeMs;

        public static final class Builder {
            private Long endTimeMs;
            private Long startTimeMs;

            public TPPlayerRange build() {
                TPPlayerRange tPPlayerRange = new TPPlayerRange();
                tPPlayerRange.setStartTimeMs(this.startTimeMs);
                tPPlayerRange.setEndTimeMs(this.endTimeMs);
                return tPPlayerRange;
            }

            public Builder setEndTimeMs(Long l) {
                this.endTimeMs = l;
                return this;
            }

            public Builder setStartTimeMs(Long l) {
                this.startTimeMs = l;
                return this;
            }
        }

        private TPPlayerRange() {
        }

        public static TPPlayerRange fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerRange tPPlayerRange = new TPPlayerRange();
            Object obj = map.get("startTimeMs");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerRange.setStartTimeMs(l);
            Object obj2 = map.get("endTimeMs");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerRange.setEndTimeMs(l2);
            return tPPlayerRange;
        }

        public Long getEndTimeMs() {
            return this.endTimeMs;
        }

        public Long getStartTimeMs() {
            return this.startTimeMs;
        }

        public void setEndTimeMs(Long l) {
            if (l != null) {
                this.endTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"endTimeMs\" is null.");
        }

        public void setStartTimeMs(Long l) {
            if (l != null) {
                this.startTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"startTimeMs\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("startTimeMs", this.startTimeMs);
            hashMap.put("endTimeMs", this.endTimeMs);
            return hashMap;
        }
    }

    public static class TPPlayerRenderEffect {
        private Long effectId;
        private Long effectType;
        private Long endTimeMs;
        private Map<String, String> params;
        private Long playerId;
        private Long startTimeMs;

        public static final class Builder {
            private Long effectId;
            private Long effectType;
            private Long endTimeMs;
            private Map<String, String> params;
            private Long playerId;
            private Long startTimeMs;

            public TPPlayerRenderEffect build() {
                TPPlayerRenderEffect tPPlayerRenderEffect = new TPPlayerRenderEffect();
                tPPlayerRenderEffect.setPlayerId(this.playerId);
                tPPlayerRenderEffect.setEffectId(this.effectId);
                tPPlayerRenderEffect.setEffectType(this.effectType);
                tPPlayerRenderEffect.setStartTimeMs(this.startTimeMs);
                tPPlayerRenderEffect.setEndTimeMs(this.endTimeMs);
                tPPlayerRenderEffect.setParams(this.params);
                return tPPlayerRenderEffect;
            }

            public Builder setEffectId(Long l) {
                this.effectId = l;
                return this;
            }

            public Builder setEffectType(Long l) {
                this.effectType = l;
                return this;
            }

            public Builder setEndTimeMs(Long l) {
                this.endTimeMs = l;
                return this;
            }

            public Builder setParams(Map<String, String> map) {
                this.params = map;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setStartTimeMs(Long l) {
                this.startTimeMs = l;
                return this;
            }
        }

        private TPPlayerRenderEffect() {
        }

        public static TPPlayerRenderEffect fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            TPPlayerRenderEffect tPPlayerRenderEffect = new TPPlayerRenderEffect();
            Object obj = map.get("playerId");
            Long l5 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerRenderEffect.setPlayerId(l);
            Object obj2 = map.get("effectId");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerRenderEffect.setEffectId(l2);
            Object obj3 = map.get("effectType");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            tPPlayerRenderEffect.setEffectType(l3);
            Object obj4 = map.get("startTimeMs");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            tPPlayerRenderEffect.setStartTimeMs(l4);
            Object obj5 = map.get("endTimeMs");
            if (obj5 != null) {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            tPPlayerRenderEffect.setEndTimeMs(l5);
            tPPlayerRenderEffect.setParams((Map) map.get("params"));
            return tPPlayerRenderEffect;
        }

        public Long getEffectId() {
            return this.effectId;
        }

        public Long getEffectType() {
            return this.effectType;
        }

        public Long getEndTimeMs() {
            return this.endTimeMs;
        }

        public Map<String, String> getParams() {
            return this.params;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getStartTimeMs() {
            return this.startTimeMs;
        }

        public void setEffectId(Long l) {
            if (l != null) {
                this.effectId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"effectId\" is null.");
        }

        public void setEffectType(Long l) {
            if (l != null) {
                this.effectType = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"effectType\" is null.");
        }

        public void setEndTimeMs(Long l) {
            if (l != null) {
                this.endTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"endTimeMs\" is null.");
        }

        public void setParams(Map<String, String> map) {
            if (map != null) {
                this.params = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"params\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setStartTimeMs(Long l) {
            if (l != null) {
                this.startTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"startTimeMs\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("effectId", this.effectId);
            hashMap.put("effectType", this.effectType);
            hashMap.put("startTimeMs", this.startTimeMs);
            hashMap.put("endTimeMs", this.endTimeMs);
            hashMap.put("params", this.params);
            return hashMap;
        }
    }

    public static class TPPlayerScaleTypeParams {
        private Long playerId;
        private Long scaleType;

        public static final class Builder {
            private Long playerId;
            private Long scaleType;

            public TPPlayerScaleTypeParams build() {
                TPPlayerScaleTypeParams tPPlayerScaleTypeParams = new TPPlayerScaleTypeParams();
                tPPlayerScaleTypeParams.setPlayerId(this.playerId);
                tPPlayerScaleTypeParams.setScaleType(this.scaleType);
                return tPPlayerScaleTypeParams;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setScaleType(Long l) {
                this.scaleType = l;
                return this;
            }
        }

        private TPPlayerScaleTypeParams() {
        }

        public static TPPlayerScaleTypeParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerScaleTypeParams tPPlayerScaleTypeParams = new TPPlayerScaleTypeParams();
            Object obj = map.get("playerId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerScaleTypeParams.setPlayerId(l);
            Object obj2 = map.get("scaleType");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerScaleTypeParams.setScaleType(l2);
            return tPPlayerScaleTypeParams;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getScaleType() {
            return this.scaleType;
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setScaleType(Long l) {
            if (l != null) {
                this.scaleType = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"scaleType\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("scaleType", this.scaleType);
            return hashMap;
        }
    }

    public static class TPPlayerSeekParams {
        private Long playerId;
        private Long timeMs;

        public static final class Builder {
            private Long playerId;
            private Long timeMs;

            public TPPlayerSeekParams build() {
                TPPlayerSeekParams tPPlayerSeekParams = new TPPlayerSeekParams();
                tPPlayerSeekParams.setPlayerId(this.playerId);
                tPPlayerSeekParams.setTimeMs(this.timeMs);
                return tPPlayerSeekParams;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setTimeMs(Long l) {
                this.timeMs = l;
                return this;
            }
        }

        private TPPlayerSeekParams() {
        }

        public static TPPlayerSeekParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerSeekParams tPPlayerSeekParams = new TPPlayerSeekParams();
            Object obj = map.get("playerId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSeekParams.setPlayerId(l);
            Object obj2 = map.get("timeMs");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerSeekParams.setTimeMs(l2);
            return tPPlayerSeekParams;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getTimeMs() {
            return this.timeMs;
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setTimeMs(Long l) {
            if (l != null) {
                this.timeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"timeMs\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("timeMs", this.timeMs);
            return hashMap;
        }
    }

    public static class TPPlayerSetLoopParams {
        private Boolean loop;
        private Long playerId;

        public static final class Builder {
            private Boolean loop;
            private Long playerId;

            public TPPlayerSetLoopParams build() {
                TPPlayerSetLoopParams tPPlayerSetLoopParams = new TPPlayerSetLoopParams();
                tPPlayerSetLoopParams.setPlayerId(this.playerId);
                tPPlayerSetLoopParams.setLoop(this.loop);
                return tPPlayerSetLoopParams;
            }

            public Builder setLoop(Boolean bool) {
                this.loop = bool;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }
        }

        private TPPlayerSetLoopParams() {
        }

        public static TPPlayerSetLoopParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerSetLoopParams tPPlayerSetLoopParams = new TPPlayerSetLoopParams();
            Object obj = map.get("playerId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetLoopParams.setPlayerId(l);
            tPPlayerSetLoopParams.setLoop((Boolean) map.get("loop"));
            return tPPlayerSetLoopParams;
        }

        public Boolean getLoop() {
            return this.loop;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public void setLoop(Boolean bool) {
            if (bool != null) {
                this.loop = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"loop\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("loop", this.loop);
            return hashMap;
        }
    }

    public static class TPPlayerSetMediaInfoParams {
        private String decodeKey;
        private String fileFormat;
        private Boolean isLocal;
        private String mediaId;
        private String path;
        private Long playerId;
        private String thumbPath;
        private String thumbUrl;
        private String thumbUrlToken;
        private String url;
        private String urlToken;
        private Long videoDuration;
        private Long videoHeight;
        private Long videoWidth;

        public static final class Builder {
            private String decodeKey;
            private String fileFormat;
            private Boolean isLocal;
            private String mediaId;
            private String path;
            private Long playerId;
            private String thumbPath;
            private String thumbUrl;
            private String thumbUrlToken;
            private String url;
            private String urlToken;
            private Long videoDuration;
            private Long videoHeight;
            private Long videoWidth;

            public TPPlayerSetMediaInfoParams build() {
                TPPlayerSetMediaInfoParams tPPlayerSetMediaInfoParams = new TPPlayerSetMediaInfoParams();
                tPPlayerSetMediaInfoParams.setPlayerId(this.playerId);
                tPPlayerSetMediaInfoParams.setMediaId(this.mediaId);
                tPPlayerSetMediaInfoParams.setPath(this.path);
                tPPlayerSetMediaInfoParams.setUrl(this.url);
                tPPlayerSetMediaInfoParams.setUrlToken(this.urlToken);
                tPPlayerSetMediaInfoParams.setDecodeKey(this.decodeKey);
                tPPlayerSetMediaInfoParams.setVideoWidth(this.videoWidth);
                tPPlayerSetMediaInfoParams.setVideoHeight(this.videoHeight);
                tPPlayerSetMediaInfoParams.setVideoDuration(this.videoDuration);
                tPPlayerSetMediaInfoParams.setFileFormat(this.fileFormat);
                tPPlayerSetMediaInfoParams.setThumbPath(this.thumbPath);
                tPPlayerSetMediaInfoParams.setThumbUrl(this.thumbUrl);
                tPPlayerSetMediaInfoParams.setThumbUrlToken(this.thumbUrlToken);
                tPPlayerSetMediaInfoParams.setIsLocal(this.isLocal);
                return tPPlayerSetMediaInfoParams;
            }

            public Builder setDecodeKey(String str) {
                this.decodeKey = str;
                return this;
            }

            public Builder setFileFormat(String str) {
                this.fileFormat = str;
                return this;
            }

            public Builder setIsLocal(Boolean bool) {
                this.isLocal = bool;
                return this;
            }

            public Builder setMediaId(String str) {
                this.mediaId = str;
                return this;
            }

            public Builder setPath(String str) {
                this.path = str;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setThumbPath(String str) {
                this.thumbPath = str;
                return this;
            }

            public Builder setThumbUrl(String str) {
                this.thumbUrl = str;
                return this;
            }

            public Builder setThumbUrlToken(String str) {
                this.thumbUrlToken = str;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }

            public Builder setUrlToken(String str) {
                this.urlToken = str;
                return this;
            }

            public Builder setVideoDuration(Long l) {
                this.videoDuration = l;
                return this;
            }

            public Builder setVideoHeight(Long l) {
                this.videoHeight = l;
                return this;
            }

            public Builder setVideoWidth(Long l) {
                this.videoWidth = l;
                return this;
            }
        }

        private TPPlayerSetMediaInfoParams() {
        }

        public static TPPlayerSetMediaInfoParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            TPPlayerSetMediaInfoParams tPPlayerSetMediaInfoParams = new TPPlayerSetMediaInfoParams();
            Object obj = map.get("playerId");
            Long l4 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetMediaInfoParams.setPlayerId(l);
            tPPlayerSetMediaInfoParams.setMediaId((String) map.get("mediaId"));
            tPPlayerSetMediaInfoParams.setPath((String) map.get("path"));
            tPPlayerSetMediaInfoParams.setUrl((String) map.get("url"));
            tPPlayerSetMediaInfoParams.setUrlToken((String) map.get("urlToken"));
            tPPlayerSetMediaInfoParams.setDecodeKey((String) map.get("decodeKey"));
            Object obj2 = map.get(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerSetMediaInfoParams.setVideoWidth(l2);
            Object obj3 = map.get(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            tPPlayerSetMediaInfoParams.setVideoHeight(l3);
            Object obj4 = map.get("videoDuration");
            if (obj4 != null) {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            tPPlayerSetMediaInfoParams.setVideoDuration(l4);
            tPPlayerSetMediaInfoParams.setFileFormat((String) map.get("fileFormat"));
            tPPlayerSetMediaInfoParams.setThumbPath((String) map.get("thumbPath"));
            tPPlayerSetMediaInfoParams.setThumbUrl((String) map.get("thumbUrl"));
            tPPlayerSetMediaInfoParams.setThumbUrlToken((String) map.get("thumbUrlToken"));
            tPPlayerSetMediaInfoParams.setIsLocal((Boolean) map.get("isLocal"));
            return tPPlayerSetMediaInfoParams;
        }

        public String getDecodeKey() {
            return this.decodeKey;
        }

        public String getFileFormat() {
            return this.fileFormat;
        }

        public Boolean getIsLocal() {
            return this.isLocal;
        }

        public String getMediaId() {
            return this.mediaId;
        }

        public String getPath() {
            return this.path;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public String getThumbPath() {
            return this.thumbPath;
        }

        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public String getThumbUrlToken() {
            return this.thumbUrlToken;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlToken() {
            return this.urlToken;
        }

        public Long getVideoDuration() {
            return this.videoDuration;
        }

        public Long getVideoHeight() {
            return this.videoHeight;
        }

        public Long getVideoWidth() {
            return this.videoWidth;
        }

        public void setDecodeKey(String str) {
            if (str != null) {
                this.decodeKey = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"decodeKey\" is null.");
        }

        public void setFileFormat(String str) {
            if (str != null) {
                this.fileFormat = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fileFormat\" is null.");
        }

        public void setIsLocal(Boolean bool) {
            if (bool != null) {
                this.isLocal = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isLocal\" is null.");
        }

        public void setMediaId(String str) {
            if (str != null) {
                this.mediaId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mediaId\" is null.");
        }

        public void setPath(String str) {
            if (str != null) {
                this.path = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setThumbPath(String str) {
            if (str != null) {
                this.thumbPath = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"thumbPath\" is null.");
        }

        public void setThumbUrl(String str) {
            if (str != null) {
                this.thumbUrl = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"thumbUrl\" is null.");
        }

        public void setThumbUrlToken(String str) {
            if (str != null) {
                this.thumbUrlToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"thumbUrlToken\" is null.");
        }

        public void setUrl(String str) {
            if (str != null) {
                this.url = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        public void setUrlToken(String str) {
            if (str != null) {
                this.urlToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"urlToken\" is null.");
        }

        public void setVideoDuration(Long l) {
            if (l != null) {
                this.videoDuration = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"videoDuration\" is null.");
        }

        public void setVideoHeight(Long l) {
            if (l != null) {
                this.videoHeight = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"videoHeight\" is null.");
        }

        public void setVideoWidth(Long l) {
            if (l != null) {
                this.videoWidth = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"videoWidth\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("mediaId", this.mediaId);
            hashMap.put("path", this.path);
            hashMap.put("url", this.url);
            hashMap.put("urlToken", this.urlToken);
            hashMap.put("decodeKey", this.decodeKey);
            hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, this.videoWidth);
            hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, this.videoHeight);
            hashMap.put("videoDuration", this.videoDuration);
            hashMap.put("fileFormat", this.fileFormat);
            hashMap.put("thumbPath", this.thumbPath);
            hashMap.put("thumbUrl", this.thumbUrl);
            hashMap.put("thumbUrlToken", this.thumbUrlToken);
            hashMap.put("isLocal", this.isLocal);
            return hashMap;
        }
    }

    public static class TPPlayerSetMediaProtoParams {
        private byte[] mediaProto;
        private Long mediaType;
        private Long playerId;

        public static final class Builder {
            private byte[] mediaProto;
            private Long mediaType;
            private Long playerId;

            public TPPlayerSetMediaProtoParams build() {
                TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams = new TPPlayerSetMediaProtoParams();
                tPPlayerSetMediaProtoParams.setPlayerId(this.playerId);
                tPPlayerSetMediaProtoParams.setMediaType(this.mediaType);
                tPPlayerSetMediaProtoParams.setMediaProto(this.mediaProto);
                return tPPlayerSetMediaProtoParams;
            }

            public Builder setMediaProto(byte[] bArr) {
                this.mediaProto = bArr;
                return this;
            }

            public Builder setMediaType(Long l) {
                this.mediaType = l;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }
        }

        private TPPlayerSetMediaProtoParams() {
        }

        public static TPPlayerSetMediaProtoParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams = new TPPlayerSetMediaProtoParams();
            Object obj = map.get("playerId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetMediaProtoParams.setPlayerId(l);
            Object obj2 = map.get("mediaType");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerSetMediaProtoParams.setMediaType(l2);
            tPPlayerSetMediaProtoParams.setMediaProto((byte[]) map.get("mediaProto"));
            return tPPlayerSetMediaProtoParams;
        }

        public byte[] getMediaProto() {
            return this.mediaProto;
        }

        public Long getMediaType() {
            return this.mediaType;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public void setMediaProto(byte[] bArr) {
            if (bArr != null) {
                this.mediaProto = bArr;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mediaProto\" is null.");
        }

        public void setMediaType(Long l) {
            if (l != null) {
                this.mediaType = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mediaType\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("mediaType", this.mediaType);
            hashMap.put("mediaProto", this.mediaProto);
            return hashMap;
        }
    }

    public static class TPPlayerSetMuteParams {
        private Boolean mute;
        private Long playerId;

        public static final class Builder {
            private Boolean mute;
            private Long playerId;

            public TPPlayerSetMuteParams build() {
                TPPlayerSetMuteParams tPPlayerSetMuteParams = new TPPlayerSetMuteParams();
                tPPlayerSetMuteParams.setPlayerId(this.playerId);
                tPPlayerSetMuteParams.setMute(this.mute);
                return tPPlayerSetMuteParams;
            }

            public Builder setMute(Boolean bool) {
                this.mute = bool;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }
        }

        private TPPlayerSetMuteParams() {
        }

        public static TPPlayerSetMuteParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerSetMuteParams tPPlayerSetMuteParams = new TPPlayerSetMuteParams();
            Object obj = map.get("playerId");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetMuteParams.setPlayerId(l);
            tPPlayerSetMuteParams.setMute((Boolean) map.get("mute"));
            return tPPlayerSetMuteParams;
        }

        public Boolean getMute() {
            return this.mute;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public void setMute(Boolean bool) {
            if (bool != null) {
                this.mute = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mute\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("mute", this.mute);
            return hashMap;
        }
    }

    public static class TPPlayerSetPlayRangeParams {
        private Long endTimeMs;
        private Long playerId;
        private Long startTimeMs;

        public static final class Builder {
            private Long endTimeMs;
            private Long playerId;
            private Long startTimeMs;

            public TPPlayerSetPlayRangeParams build() {
                TPPlayerSetPlayRangeParams tPPlayerSetPlayRangeParams = new TPPlayerSetPlayRangeParams();
                tPPlayerSetPlayRangeParams.setPlayerId(this.playerId);
                tPPlayerSetPlayRangeParams.setStartTimeMs(this.startTimeMs);
                tPPlayerSetPlayRangeParams.setEndTimeMs(this.endTimeMs);
                return tPPlayerSetPlayRangeParams;
            }

            public Builder setEndTimeMs(Long l) {
                this.endTimeMs = l;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setStartTimeMs(Long l) {
                this.startTimeMs = l;
                return this;
            }
        }

        private TPPlayerSetPlayRangeParams() {
        }

        public static TPPlayerSetPlayRangeParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            TPPlayerSetPlayRangeParams tPPlayerSetPlayRangeParams = new TPPlayerSetPlayRangeParams();
            Object obj = map.get("playerId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetPlayRangeParams.setPlayerId(l);
            Object obj2 = map.get("startTimeMs");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerSetPlayRangeParams.setStartTimeMs(l2);
            Object obj3 = map.get("endTimeMs");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            tPPlayerSetPlayRangeParams.setEndTimeMs(l3);
            return tPPlayerSetPlayRangeParams;
        }

        public Long getEndTimeMs() {
            return this.endTimeMs;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getStartTimeMs() {
            return this.startTimeMs;
        }

        public void setEndTimeMs(Long l) {
            if (l != null) {
                this.endTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"endTimeMs\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setStartTimeMs(Long l) {
            if (l != null) {
                this.startTimeMs = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"startTimeMs\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("startTimeMs", this.startTimeMs);
            hashMap.put("endTimeMs", this.endTimeMs);
            return hashMap;
        }
    }

    public static class TPPlayerSetStreamTypeParams {
        private Long playerId;
        private Long streamType;

        public static final class Builder {
            private Long playerId;
            private Long streamType;

            public TPPlayerSetStreamTypeParams build() {
                TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams = new TPPlayerSetStreamTypeParams();
                tPPlayerSetStreamTypeParams.setPlayerId(this.playerId);
                tPPlayerSetStreamTypeParams.setStreamType(this.streamType);
                return tPPlayerSetStreamTypeParams;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setStreamType(Long l) {
                this.streamType = l;
                return this;
            }
        }

        private TPPlayerSetStreamTypeParams() {
        }

        public static TPPlayerSetStreamTypeParams fromMap(Map<String, Object> map) {
            Long l;
            TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams = new TPPlayerSetStreamTypeParams();
            Object obj = map.get("playerId");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerSetStreamTypeParams.setPlayerId(l);
            Object obj2 = map.get("streamType");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerSetStreamTypeParams.setStreamType(l2);
            return tPPlayerSetStreamTypeParams;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getStreamType() {
            return this.streamType;
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setStreamType(Long l) {
            if (l != null) {
                this.streamType = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"streamType\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("streamType", this.streamType);
            return hashMap;
        }
    }

    public static class TPPlayerUpdateSizeParams {
        private Long height;
        private Long playerId;
        private Long width;

        public static final class Builder {
            private Long height;
            private Long playerId;
            private Long width;

            public TPPlayerUpdateSizeParams build() {
                TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams = new TPPlayerUpdateSizeParams();
                tPPlayerUpdateSizeParams.setPlayerId(this.playerId);
                tPPlayerUpdateSizeParams.setWidth(this.width);
                tPPlayerUpdateSizeParams.setHeight(this.height);
                return tPPlayerUpdateSizeParams;
            }

            public Builder setHeight(Long l) {
                this.height = l;
                return this;
            }

            public Builder setPlayerId(Long l) {
                this.playerId = l;
                return this;
            }

            public Builder setWidth(Long l) {
                this.width = l;
                return this;
            }
        }

        private TPPlayerUpdateSizeParams() {
        }

        public static TPPlayerUpdateSizeParams fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams = new TPPlayerUpdateSizeParams();
            Object obj = map.get("playerId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPPlayerUpdateSizeParams.setPlayerId(l);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPPlayerUpdateSizeParams.setWidth(l2);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            tPPlayerUpdateSizeParams.setHeight(l3);
            return tPPlayerUpdateSizeParams;
        }

        public Long getHeight() {
            return this.height;
        }

        public Long getPlayerId() {
            return this.playerId;
        }

        public Long getWidth() {
            return this.width;
        }

        public void setHeight(Long l) {
            if (l != null) {
                this.height = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }

        public void setPlayerId(Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        public void setWidth(Long l) {
            if (l != null) {
                this.width = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("playerId", this.playerId);
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            return hashMap;
        }
    }

    public static class TPVideoSizeRet {
        private Long height;
        private Long width;

        public static final class Builder {
            private Long height;
            private Long width;

            public TPVideoSizeRet build() {
                TPVideoSizeRet tPVideoSizeRet = new TPVideoSizeRet();
                tPVideoSizeRet.setWidth(this.width);
                tPVideoSizeRet.setHeight(this.height);
                return tPVideoSizeRet;
            }

            public Builder setHeight(Long l) {
                this.height = l;
                return this;
            }

            public Builder setWidth(Long l) {
                this.width = l;
                return this;
            }
        }

        public static TPVideoSizeRet fromMap(Map<String, Object> map) {
            Long l;
            TPVideoSizeRet tPVideoSizeRet = new TPVideoSizeRet();
            Object obj = map.get("width");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tPVideoSizeRet.setWidth(l);
            Object obj2 = map.get("height");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tPVideoSizeRet.setHeight(l2);
            return tPVideoSizeRet;
        }

        public Long getHeight() {
            return this.height;
        }

        public Long getWidth() {
            return this.width;
        }

        public void setHeight(Long l) {
            this.height = l;
        }

        public void setWidth(Long l) {
            this.width = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("width", this.width);
            hashMap.put("height", this.height);
            return hashMap;
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
