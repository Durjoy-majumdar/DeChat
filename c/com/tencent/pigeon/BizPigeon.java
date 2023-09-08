package com.tencent.pigeon;

import android.util.Log;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p749xh.C66261f3;

public class BizPigeon {

    public enum BizFinderLiveRedDotType {
        BizFinderLiveRedDotTypeUnknown(0),
        BizFinderLiveRedDotTypeRed(1),
        BizFinderLiveRedDotTypeGray(2);
        
        private int index;

        private BizFinderLiveRedDotType(int i) {
            this.index = i;
        }
    }

    public enum MagicBrandServiceCreateScene {
        none(0),
        createByReceiveAdBrandServiceMsgOutOfBox(1),
        createByReceiveBrandServiceMsgOutOfBox(2),
        createByHasAdBrandServiceMsgFirstPage(3),
        createByHasAdBrandServiceMsgNextPage(4),
        createByHasBrandServiceMsgFirstPage(5),
        createByHasBrandServiceMsgNextPage(6),
        createByBrandServiceBoxClick(7),
        createByBrandServicePreLayout(8);
        
        private int index;

        private MagicBrandServiceCreateScene(int i) {
            this.index = i;
        }
    }

    public static class BizApiCodec extends StandardMessageCodec {
        public static final BizApiCodec INSTANCE = new BizApiCodec();

        private BizApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return BizArticleInfo.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return BizEnterStatusInfo.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return BizFinderJumpInfo.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return BizFinderLiveInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return BizFinderPigeonInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return BizMinimizeInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_AUDIO_SAMPLE /*-122*/:
                    return BizNotifyTipsInfo.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.WRITE_VIDEO_SAMPLE /*-121*/:
                    return ContactInfo.fromMap((Map) readValue(byteBuffer));
                case -120:
                    return ContactInfo.fromMap((Map) readValue(byteBuffer));
                case -119:
                    return MassSendCardMsg.fromMap((Map) readValue(byteBuffer));
                case -118:
                    return MassSendCardMsgItem.fromMap((Map) readValue(byteBuffer));
                case -117:
                    return OftenReadAccountInfo.fromMap((Map) readValue(byteBuffer));
                case -116:
                    return OftenReadAccountInfo.fromMap((Map) readValue(byteBuffer));
                case -115:
                    return WeApp_Data.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof BizArticleInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((BizArticleInfo) obj).toMap());
            } else if (obj instanceof BizEnterStatusInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((BizEnterStatusInfo) obj).toMap());
            } else if (obj instanceof BizFinderJumpInfo) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((BizFinderJumpInfo) obj).toMap());
            } else if (obj instanceof BizFinderLiveInfo) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((BizFinderLiveInfo) obj).toMap());
            } else if (obj instanceof BizFinderPigeonInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((BizFinderPigeonInfo) obj).toMap());
            } else if (obj instanceof BizMinimizeInfo) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((BizMinimizeInfo) obj).toMap());
            } else if (obj instanceof BizNotifyTipsInfo) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((BizNotifyTipsInfo) obj).toMap());
            } else {
                boolean z = obj instanceof ContactInfo;
                if (z) {
                    byteArrayOutputStream.write(135);
                    writeValue(byteArrayOutputStream, ((ContactInfo) obj).toMap());
                } else if (z) {
                    byteArrayOutputStream.write(136);
                    writeValue(byteArrayOutputStream, ((ContactInfo) obj).toMap());
                } else if (obj instanceof MassSendCardMsg) {
                    byteArrayOutputStream.write(137);
                    writeValue(byteArrayOutputStream, ((MassSendCardMsg) obj).toMap());
                } else if (obj instanceof MassSendCardMsgItem) {
                    byteArrayOutputStream.write(138);
                    writeValue(byteArrayOutputStream, ((MassSendCardMsgItem) obj).toMap());
                } else {
                    boolean z2 = obj instanceof OftenReadAccountInfo;
                    if (z2) {
                        byteArrayOutputStream.write(139);
                        writeValue(byteArrayOutputStream, ((OftenReadAccountInfo) obj).toMap());
                    } else if (z2) {
                        byteArrayOutputStream.write(140);
                        writeValue(byteArrayOutputStream, ((OftenReadAccountInfo) obj).toMap());
                    } else if (obj instanceof WeApp_Data) {
                        byteArrayOutputStream.write(141);
                        writeValue(byteArrayOutputStream, ((WeApp_Data) obj).toMap());
                    } else {
                        super.writeValue(byteArrayOutputStream, obj);
                    }
                }
            }
        }
    }

    public static class BizArticleInfo {
        private String coverUrl;
        private Long itemShowType;
        private Long msgId;
        private String nickName;
        private Long openScene;
        private Long pos;
        private Long posInCard;
        private Long subScene;
        private Long svrId;
        private String title;
        private String url;
        private String userName;

        public static final class Builder {
            private String coverUrl;
            private Long itemShowType;
            private Long msgId;
            private String nickName;
            private Long openScene;
            private Long pos;
            private Long posInCard;
            private Long subScene;
            private Long svrId;
            private String title;
            private String url;
            private String userName;

            public BizArticleInfo build() {
                BizArticleInfo bizArticleInfo = new BizArticleInfo();
                bizArticleInfo.setMsgId(this.msgId);
                bizArticleInfo.setSvrId(this.svrId);
                bizArticleInfo.setPos(this.pos);
                bizArticleInfo.setPosInCard(this.posInCard);
                bizArticleInfo.setOpenScene(this.openScene);
                bizArticleInfo.setSubScene(this.subScene);
                bizArticleInfo.setUrl(this.url);
                bizArticleInfo.setItemShowType(this.itemShowType);
                bizArticleInfo.setUserName(this.userName);
                bizArticleInfo.setNickName(this.nickName);
                bizArticleInfo.setTitle(this.title);
                bizArticleInfo.setCoverUrl(this.coverUrl);
                return bizArticleInfo;
            }

            public Builder setCoverUrl(String str) {
                this.coverUrl = str;
                return this;
            }

            public Builder setItemShowType(Long l) {
                this.itemShowType = l;
                return this;
            }

            public Builder setMsgId(Long l) {
                this.msgId = l;
                return this;
            }

            public Builder setNickName(String str) {
                this.nickName = str;
                return this;
            }

            public Builder setOpenScene(Long l) {
                this.openScene = l;
                return this;
            }

            public Builder setPos(Long l) {
                this.pos = l;
                return this;
            }

            public Builder setPosInCard(Long l) {
                this.posInCard = l;
                return this;
            }

            public Builder setSubScene(Long l) {
                this.subScene = l;
                return this;
            }

            public Builder setSvrId(Long l) {
                this.svrId = l;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }

            public Builder setUserName(String str) {
                this.userName = str;
                return this;
            }
        }

        public static BizArticleInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Long l6;
            BizArticleInfo bizArticleInfo = new BizArticleInfo();
            Object obj = map.get("msgId");
            Long l7 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizArticleInfo.setMsgId(l);
            Object obj2 = map.get("svrId");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizArticleInfo.setSvrId(l2);
            Object obj3 = map.get("pos");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            bizArticleInfo.setPos(l3);
            Object obj4 = map.get("posInCard");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            bizArticleInfo.setPosInCard(l4);
            Object obj5 = map.get("openScene");
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            bizArticleInfo.setOpenScene(l5);
            Object obj6 = map.get("subScene");
            if (obj6 == null) {
                l6 = null;
            } else {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            bizArticleInfo.setSubScene(l6);
            bizArticleInfo.setUrl((String) map.get("url"));
            Object obj7 = map.get("itemShowType");
            if (obj7 != null) {
                l7 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            bizArticleInfo.setItemShowType(l7);
            bizArticleInfo.setUserName((String) map.get("userName"));
            bizArticleInfo.setNickName((String) map.get("nickName"));
            bizArticleInfo.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            bizArticleInfo.setCoverUrl((String) map.get("coverUrl"));
            return bizArticleInfo;
        }

        public String getCoverUrl() {
            return this.coverUrl;
        }

        public Long getItemShowType() {
            return this.itemShowType;
        }

        public Long getMsgId() {
            return this.msgId;
        }

        public String getNickName() {
            return this.nickName;
        }

        public Long getOpenScene() {
            return this.openScene;
        }

        public Long getPos() {
            return this.pos;
        }

        public Long getPosInCard() {
            return this.posInCard;
        }

        public Long getSubScene() {
            return this.subScene;
        }

        public Long getSvrId() {
            return this.svrId;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setCoverUrl(String str) {
            this.coverUrl = str;
        }

        public void setItemShowType(Long l) {
            this.itemShowType = l;
        }

        public void setMsgId(Long l) {
            this.msgId = l;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setOpenScene(Long l) {
            this.openScene = l;
        }

        public void setPos(Long l) {
            this.pos = l;
        }

        public void setPosInCard(Long l) {
            this.posInCard = l;
        }

        public void setSubScene(Long l) {
            this.subScene = l;
        }

        public void setSvrId(Long l) {
            this.svrId = l;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("msgId", this.msgId);
            hashMap.put("svrId", this.svrId);
            hashMap.put("pos", this.pos);
            hashMap.put("posInCard", this.posInCard);
            hashMap.put("openScene", this.openScene);
            hashMap.put("subScene", this.subScene);
            hashMap.put("url", this.url);
            hashMap.put("itemShowType", this.itemShowType);
            hashMap.put("userName", this.userName);
            hashMap.put("nickName", this.nickName);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("coverUrl", this.coverUrl);
            return hashMap;
        }
    }

    public static class BizCallbackApi {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public BizCallbackApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return BizCallbackApiCodec.INSTANCE;
        }

        public void onBizFinderLiveInfoUpdate(Long l, List<BizFinderLiveInfo> list, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onBizFinderLiveInfoUpdate", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l, list})), new BizPigeon$BizCallbackApi$$a(reply));
        }

        public void onBizPageScreenShot(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onBizPageScreenShot", getCodec()).send(null, new BizPigeon$BizCallbackApi$$d(reply));
        }

        public void onDataChange(BizNotifyInfo bizNotifyInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onDataChange", getCodec()).send(new ArrayList(Arrays.asList(new BizNotifyInfo[]{bizNotifyInfo})), new BizPigeon$BizCallbackApi$$b(reply));
        }

        public void onFinderLiveStatusChange(String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onFinderLiveStatusChange", getCodec()).send(new ArrayList(Arrays.asList(new String[]{str})), new BizPigeon$BizCallbackApi$$f(reply));
        }

        public void onMoveToTop(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onMoveToTop", getCodec()).send(null, new BizPigeon$BizCallbackApi$$c(reply));
        }

        public void onNotifyChange(BizNotifyTipsInfo bizNotifyTipsInfo, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.BizCallbackApi.onNotifyChange", getCodec()).send(new ArrayList(Arrays.asList(new BizNotifyTipsInfo[]{bizNotifyTipsInfo})), new BizPigeon$BizCallbackApi$$e(reply));
        }
    }

    public static class BizCallbackApiCodec extends StandardMessageCodec {
        public static final BizCallbackApiCodec INSTANCE = new BizCallbackApiCodec();

        private BizCallbackApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return BizFinderLiveInfo.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return BizNotifyInfo.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return BizNotifyTipsInfo.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return MassSendCardMsg.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return MassSendCardMsgItem.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return WeApp_Data.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof BizFinderLiveInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((BizFinderLiveInfo) obj).toMap());
            } else if (obj instanceof BizNotifyInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((BizNotifyInfo) obj).toMap());
            } else if (obj instanceof BizNotifyTipsInfo) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((BizNotifyTipsInfo) obj).toMap());
            } else if (obj instanceof MassSendCardMsg) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((MassSendCardMsg) obj).toMap());
            } else if (obj instanceof MassSendCardMsgItem) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((MassSendCardMsgItem) obj).toMap());
            } else if (obj instanceof WeApp_Data) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((WeApp_Data) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class BizEnterStatusInfo {
        private Boolean createEngine;
        private Boolean createEngineGroup;
        private Long endOnEnterTime;
        private Long enterSource;
        private Long enterTime;
        private Long exposeMsgType;
        private String exposeUserName;
        private String finderFeedExportId;
        private Long finderLiveRedDotType;
        private Long firstGroupMsgCount;
        private Boolean isHeadsetOn;
        private Boolean isTeenMode;
        private Long lastExposeId;
        private Long lastExposeMid;
        private Long lastExposeMsgId;
        private String netType;
        private Long openArticleFromScene;
        private Long pos;
        private Long redDotCount;
        private byte[] redDotReportItem;
        private Long sessionId;
        private Long startCreateEngineGroupTime;
        private Long startCreateEngineTime;
        private Long startOpenTime;
        private Long startShowFlutterPageTime;

        public static final class Builder {
            private Boolean createEngine;
            private Boolean createEngineGroup;
            private Long endOnEnterTime;
            private Long enterSource;
            private Long enterTime;
            private Long exposeMsgType;
            private String exposeUserName;
            private String finderFeedExportId;
            private Long finderLiveRedDotType;
            private Long firstGroupMsgCount;
            private Boolean isHeadsetOn;
            private Boolean isTeenMode;
            private Long lastExposeId;
            private Long lastExposeMid;
            private Long lastExposeMsgId;
            private String netType;
            private Long openArticleFromScene;
            private Long pos;
            private Long redDotCount;
            private byte[] redDotReportItem;
            private Long sessionId;
            private Long startCreateEngineGroupTime;
            private Long startCreateEngineTime;
            private Long startOpenTime;
            private Long startShowFlutterPageTime;

            public BizEnterStatusInfo build() {
                BizEnterStatusInfo bizEnterStatusInfo = new BizEnterStatusInfo();
                bizEnterStatusInfo.setEnterSource(this.enterSource);
                bizEnterStatusInfo.setOpenArticleFromScene(this.openArticleFromScene);
                bizEnterStatusInfo.setIsTeenMode(this.isTeenMode);
                bizEnterStatusInfo.setRedDotCount(this.redDotCount);
                bizEnterStatusInfo.setPos(this.pos);
                bizEnterStatusInfo.setFinderLiveRedDotType(this.finderLiveRedDotType);
                bizEnterStatusInfo.setFinderFeedExportId(this.finderFeedExportId);
                bizEnterStatusInfo.setExposeMsgType(this.exposeMsgType);
                bizEnterStatusInfo.setExposeUserName(this.exposeUserName);
                bizEnterStatusInfo.setLastExposeId(this.lastExposeId);
                bizEnterStatusInfo.setLastExposeMsgId(this.lastExposeMsgId);
                bizEnterStatusInfo.setLastExposeMid(this.lastExposeMid);
                bizEnterStatusInfo.setSessionId(this.sessionId);
                bizEnterStatusInfo.setEnterTime(this.enterTime);
                bizEnterStatusInfo.setNetType(this.netType);
                bizEnterStatusInfo.setIsHeadsetOn(this.isHeadsetOn);
                bizEnterStatusInfo.setRedDotReportItem(this.redDotReportItem);
                bizEnterStatusInfo.setCreateEngineGroup(this.createEngineGroup);
                bizEnterStatusInfo.setCreateEngine(this.createEngine);
                bizEnterStatusInfo.setStartOpenTime(this.startOpenTime);
                bizEnterStatusInfo.setEndOnEnterTime(this.endOnEnterTime);
                bizEnterStatusInfo.setStartCreateEngineGroupTime(this.startCreateEngineGroupTime);
                bizEnterStatusInfo.setStartCreateEngineTime(this.startCreateEngineTime);
                bizEnterStatusInfo.setStartShowFlutterPageTime(this.startShowFlutterPageTime);
                bizEnterStatusInfo.setFirstGroupMsgCount(this.firstGroupMsgCount);
                return bizEnterStatusInfo;
            }

            public Builder setCreateEngine(Boolean bool) {
                this.createEngine = bool;
                return this;
            }

            public Builder setCreateEngineGroup(Boolean bool) {
                this.createEngineGroup = bool;
                return this;
            }

            public Builder setEndOnEnterTime(Long l) {
                this.endOnEnterTime = l;
                return this;
            }

            public Builder setEnterSource(Long l) {
                this.enterSource = l;
                return this;
            }

            public Builder setEnterTime(Long l) {
                this.enterTime = l;
                return this;
            }

            public Builder setExposeMsgType(Long l) {
                this.exposeMsgType = l;
                return this;
            }

            public Builder setExposeUserName(String str) {
                this.exposeUserName = str;
                return this;
            }

            public Builder setFinderFeedExportId(String str) {
                this.finderFeedExportId = str;
                return this;
            }

            public Builder setFinderLiveRedDotType(Long l) {
                this.finderLiveRedDotType = l;
                return this;
            }

            public Builder setFirstGroupMsgCount(Long l) {
                this.firstGroupMsgCount = l;
                return this;
            }

            public Builder setIsHeadsetOn(Boolean bool) {
                this.isHeadsetOn = bool;
                return this;
            }

            public Builder setIsTeenMode(Boolean bool) {
                this.isTeenMode = bool;
                return this;
            }

            public Builder setLastExposeId(Long l) {
                this.lastExposeId = l;
                return this;
            }

            public Builder setLastExposeMid(Long l) {
                this.lastExposeMid = l;
                return this;
            }

            public Builder setLastExposeMsgId(Long l) {
                this.lastExposeMsgId = l;
                return this;
            }

            public Builder setNetType(String str) {
                this.netType = str;
                return this;
            }

            public Builder setOpenArticleFromScene(Long l) {
                this.openArticleFromScene = l;
                return this;
            }

            public Builder setPos(Long l) {
                this.pos = l;
                return this;
            }

            public Builder setRedDotCount(Long l) {
                this.redDotCount = l;
                return this;
            }

            public Builder setRedDotReportItem(byte[] bArr) {
                this.redDotReportItem = bArr;
                return this;
            }

            public Builder setSessionId(Long l) {
                this.sessionId = l;
                return this;
            }

            public Builder setStartCreateEngineGroupTime(Long l) {
                this.startCreateEngineGroupTime = l;
                return this;
            }

            public Builder setStartCreateEngineTime(Long l) {
                this.startCreateEngineTime = l;
                return this;
            }

            public Builder setStartOpenTime(Long l) {
                this.startOpenTime = l;
                return this;
            }

            public Builder setStartShowFlutterPageTime(Long l) {
                this.startShowFlutterPageTime = l;
                return this;
            }
        }

        public static BizEnterStatusInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Long l6;
            Long l7;
            Long l8;
            Long l9;
            Long l15;
            Long l16;
            Long l17;
            Long l18;
            Long l19;
            Long l25;
            Long l26;
            BizEnterStatusInfo bizEnterStatusInfo = new BizEnterStatusInfo();
            Object obj = map.get("enterSource");
            Long l27 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizEnterStatusInfo.setEnterSource(l);
            Object obj2 = map.get("openArticleFromScene");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizEnterStatusInfo.setOpenArticleFromScene(l2);
            bizEnterStatusInfo.setIsTeenMode((Boolean) map.get("isTeenMode"));
            Object obj3 = map.get("redDotCount");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            bizEnterStatusInfo.setRedDotCount(l3);
            Object obj4 = map.get("pos");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            bizEnterStatusInfo.setPos(l4);
            Object obj5 = map.get("finderLiveRedDotType");
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            bizEnterStatusInfo.setFinderLiveRedDotType(l5);
            bizEnterStatusInfo.setFinderFeedExportId((String) map.get("finderFeedExportId"));
            Object obj6 = map.get("exposeMsgType");
            if (obj6 == null) {
                l6 = null;
            } else {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            bizEnterStatusInfo.setExposeMsgType(l6);
            bizEnterStatusInfo.setExposeUserName((String) map.get("exposeUserName"));
            Object obj7 = map.get("lastExposeId");
            if (obj7 == null) {
                l7 = null;
            } else {
                l7 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            bizEnterStatusInfo.setLastExposeId(l7);
            Object obj8 = map.get("lastExposeMsgId");
            if (obj8 == null) {
                l8 = null;
            } else {
                l8 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            bizEnterStatusInfo.setLastExposeMsgId(l8);
            Object obj9 = map.get("lastExposeMid");
            if (obj9 == null) {
                l9 = null;
            } else {
                l9 = Long.valueOf(obj9 instanceof Integer ? (long) ((Integer) obj9).intValue() : ((Long) obj9).longValue());
            }
            bizEnterStatusInfo.setLastExposeMid(l9);
            Object obj10 = map.get("sessionId");
            if (obj10 == null) {
                l15 = null;
            } else {
                l15 = Long.valueOf(obj10 instanceof Integer ? (long) ((Integer) obj10).intValue() : ((Long) obj10).longValue());
            }
            bizEnterStatusInfo.setSessionId(l15);
            Object obj11 = map.get("enterTime");
            if (obj11 == null) {
                l16 = null;
            } else {
                l16 = Long.valueOf(obj11 instanceof Integer ? (long) ((Integer) obj11).intValue() : ((Long) obj11).longValue());
            }
            bizEnterStatusInfo.setEnterTime(l16);
            bizEnterStatusInfo.setNetType((String) map.get(DownloadInfo.NETTYPE));
            bizEnterStatusInfo.setIsHeadsetOn((Boolean) map.get("isHeadsetOn"));
            bizEnterStatusInfo.setRedDotReportItem((byte[]) map.get("redDotReportItem"));
            bizEnterStatusInfo.setCreateEngineGroup((Boolean) map.get("createEngineGroup"));
            bizEnterStatusInfo.setCreateEngine((Boolean) map.get("createEngine"));
            Object obj12 = map.get("startOpenTime");
            if (obj12 == null) {
                l17 = null;
            } else {
                l17 = Long.valueOf(obj12 instanceof Integer ? (long) ((Integer) obj12).intValue() : ((Long) obj12).longValue());
            }
            bizEnterStatusInfo.setStartOpenTime(l17);
            Object obj13 = map.get("endOnEnterTime");
            if (obj13 == null) {
                l18 = null;
            } else {
                l18 = Long.valueOf(obj13 instanceof Integer ? (long) ((Integer) obj13).intValue() : ((Long) obj13).longValue());
            }
            bizEnterStatusInfo.setEndOnEnterTime(l18);
            Object obj14 = map.get("startCreateEngineGroupTime");
            if (obj14 == null) {
                l19 = null;
            } else {
                l19 = Long.valueOf(obj14 instanceof Integer ? (long) ((Integer) obj14).intValue() : ((Long) obj14).longValue());
            }
            bizEnterStatusInfo.setStartCreateEngineGroupTime(l19);
            Object obj15 = map.get("startCreateEngineTime");
            if (obj15 == null) {
                l25 = null;
            } else {
                l25 = Long.valueOf(obj15 instanceof Integer ? (long) ((Integer) obj15).intValue() : ((Long) obj15).longValue());
            }
            bizEnterStatusInfo.setStartCreateEngineTime(l25);
            Object obj16 = map.get("startShowFlutterPageTime");
            if (obj16 == null) {
                l26 = null;
            } else {
                l26 = Long.valueOf(obj16 instanceof Integer ? (long) ((Integer) obj16).intValue() : ((Long) obj16).longValue());
            }
            bizEnterStatusInfo.setStartShowFlutterPageTime(l26);
            Object obj17 = map.get("firstGroupMsgCount");
            if (obj17 != null) {
                l27 = Long.valueOf(obj17 instanceof Integer ? (long) ((Integer) obj17).intValue() : ((Long) obj17).longValue());
            }
            bizEnterStatusInfo.setFirstGroupMsgCount(l27);
            return bizEnterStatusInfo;
        }

        public Boolean getCreateEngine() {
            return this.createEngine;
        }

        public Boolean getCreateEngineGroup() {
            return this.createEngineGroup;
        }

        public Long getEndOnEnterTime() {
            return this.endOnEnterTime;
        }

        public Long getEnterSource() {
            return this.enterSource;
        }

        public Long getEnterTime() {
            return this.enterTime;
        }

        public Long getExposeMsgType() {
            return this.exposeMsgType;
        }

        public String getExposeUserName() {
            return this.exposeUserName;
        }

        public String getFinderFeedExportId() {
            return this.finderFeedExportId;
        }

        public Long getFinderLiveRedDotType() {
            return this.finderLiveRedDotType;
        }

        public Long getFirstGroupMsgCount() {
            return this.firstGroupMsgCount;
        }

        public Boolean getIsHeadsetOn() {
            return this.isHeadsetOn;
        }

        public Boolean getIsTeenMode() {
            return this.isTeenMode;
        }

        public Long getLastExposeId() {
            return this.lastExposeId;
        }

        public Long getLastExposeMid() {
            return this.lastExposeMid;
        }

        public Long getLastExposeMsgId() {
            return this.lastExposeMsgId;
        }

        public String getNetType() {
            return this.netType;
        }

        public Long getOpenArticleFromScene() {
            return this.openArticleFromScene;
        }

        public Long getPos() {
            return this.pos;
        }

        public Long getRedDotCount() {
            return this.redDotCount;
        }

        public byte[] getRedDotReportItem() {
            return this.redDotReportItem;
        }

        public Long getSessionId() {
            return this.sessionId;
        }

        public Long getStartCreateEngineGroupTime() {
            return this.startCreateEngineGroupTime;
        }

        public Long getStartCreateEngineTime() {
            return this.startCreateEngineTime;
        }

        public Long getStartOpenTime() {
            return this.startOpenTime;
        }

        public Long getStartShowFlutterPageTime() {
            return this.startShowFlutterPageTime;
        }

        public void setCreateEngine(Boolean bool) {
            this.createEngine = bool;
        }

        public void setCreateEngineGroup(Boolean bool) {
            this.createEngineGroup = bool;
        }

        public void setEndOnEnterTime(Long l) {
            this.endOnEnterTime = l;
        }

        public void setEnterSource(Long l) {
            this.enterSource = l;
        }

        public void setEnterTime(Long l) {
            this.enterTime = l;
        }

        public void setExposeMsgType(Long l) {
            this.exposeMsgType = l;
        }

        public void setExposeUserName(String str) {
            this.exposeUserName = str;
        }

        public void setFinderFeedExportId(String str) {
            this.finderFeedExportId = str;
        }

        public void setFinderLiveRedDotType(Long l) {
            this.finderLiveRedDotType = l;
        }

        public void setFirstGroupMsgCount(Long l) {
            this.firstGroupMsgCount = l;
        }

        public void setIsHeadsetOn(Boolean bool) {
            this.isHeadsetOn = bool;
        }

        public void setIsTeenMode(Boolean bool) {
            this.isTeenMode = bool;
        }

        public void setLastExposeId(Long l) {
            this.lastExposeId = l;
        }

        public void setLastExposeMid(Long l) {
            this.lastExposeMid = l;
        }

        public void setLastExposeMsgId(Long l) {
            this.lastExposeMsgId = l;
        }

        public void setNetType(String str) {
            this.netType = str;
        }

        public void setOpenArticleFromScene(Long l) {
            this.openArticleFromScene = l;
        }

        public void setPos(Long l) {
            this.pos = l;
        }

        public void setRedDotCount(Long l) {
            this.redDotCount = l;
        }

        public void setRedDotReportItem(byte[] bArr) {
            this.redDotReportItem = bArr;
        }

        public void setSessionId(Long l) {
            this.sessionId = l;
        }

        public void setStartCreateEngineGroupTime(Long l) {
            this.startCreateEngineGroupTime = l;
        }

        public void setStartCreateEngineTime(Long l) {
            this.startCreateEngineTime = l;
        }

        public void setStartOpenTime(Long l) {
            this.startOpenTime = l;
        }

        public void setStartShowFlutterPageTime(Long l) {
            this.startShowFlutterPageTime = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("enterSource", this.enterSource);
            hashMap.put("openArticleFromScene", this.openArticleFromScene);
            hashMap.put("isTeenMode", this.isTeenMode);
            hashMap.put("redDotCount", this.redDotCount);
            hashMap.put("pos", this.pos);
            hashMap.put("finderLiveRedDotType", this.finderLiveRedDotType);
            hashMap.put("finderFeedExportId", this.finderFeedExportId);
            hashMap.put("exposeMsgType", this.exposeMsgType);
            hashMap.put("exposeUserName", this.exposeUserName);
            hashMap.put("lastExposeId", this.lastExposeId);
            hashMap.put("lastExposeMsgId", this.lastExposeMsgId);
            hashMap.put("lastExposeMid", this.lastExposeMid);
            hashMap.put("sessionId", this.sessionId);
            hashMap.put("enterTime", this.enterTime);
            hashMap.put(DownloadInfo.NETTYPE, this.netType);
            hashMap.put("isHeadsetOn", this.isHeadsetOn);
            hashMap.put("redDotReportItem", this.redDotReportItem);
            hashMap.put("createEngineGroup", this.createEngineGroup);
            hashMap.put("createEngine", this.createEngine);
            hashMap.put("startOpenTime", this.startOpenTime);
            hashMap.put("endOnEnterTime", this.endOnEnterTime);
            hashMap.put("startCreateEngineGroupTime", this.startCreateEngineGroupTime);
            hashMap.put("startCreateEngineTime", this.startCreateEngineTime);
            hashMap.put("startShowFlutterPageTime", this.startShowFlutterPageTime);
            hashMap.put("firstGroupMsgCount", this.firstGroupMsgCount);
            return hashMap;
        }
    }

    public static class BizFinderJumpInfo {
        private List<BizFinderLiveInfo> allInfoList;
        private Long scene;
        private BizFinderLiveInfo targetInfo;

        public static final class Builder {
            private List<BizFinderLiveInfo> allInfoList;
            private Long scene;
            private BizFinderLiveInfo targetInfo;

            public BizFinderJumpInfo build() {
                BizFinderJumpInfo bizFinderJumpInfo = new BizFinderJumpInfo();
                bizFinderJumpInfo.setScene(this.scene);
                bizFinderJumpInfo.setTargetInfo(this.targetInfo);
                bizFinderJumpInfo.setAllInfoList(this.allInfoList);
                return bizFinderJumpInfo;
            }

            public Builder setAllInfoList(List<BizFinderLiveInfo> list) {
                this.allInfoList = list;
                return this;
            }

            public Builder setScene(Long l) {
                this.scene = l;
                return this;
            }

            public Builder setTargetInfo(BizFinderLiveInfo bizFinderLiveInfo) {
                this.targetInfo = bizFinderLiveInfo;
                return this;
            }
        }

        public static BizFinderJumpInfo fromMap(Map<String, Object> map) {
            Long l;
            BizFinderJumpInfo bizFinderJumpInfo = new BizFinderJumpInfo();
            Object obj = map.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            BizFinderLiveInfo bizFinderLiveInfo = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizFinderJumpInfo.setScene(l);
            Object obj2 = map.get("targetInfo");
            if (obj2 != null) {
                bizFinderLiveInfo = BizFinderLiveInfo.fromMap((Map) obj2);
            }
            bizFinderJumpInfo.setTargetInfo(bizFinderLiveInfo);
            bizFinderJumpInfo.setAllInfoList((List) map.get("allInfoList"));
            return bizFinderJumpInfo;
        }

        public List<BizFinderLiveInfo> getAllInfoList() {
            return this.allInfoList;
        }

        public Long getScene() {
            return this.scene;
        }

        public BizFinderLiveInfo getTargetInfo() {
            return this.targetInfo;
        }

        public void setAllInfoList(List<BizFinderLiveInfo> list) {
            this.allInfoList = list;
        }

        public void setScene(Long l) {
            this.scene = l;
        }

        public void setTargetInfo(BizFinderLiveInfo bizFinderLiveInfo) {
            this.targetInfo = bizFinderLiveInfo;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.scene);
            BizFinderLiveInfo bizFinderLiveInfo = this.targetInfo;
            hashMap.put("targetInfo", bizFinderLiveInfo == null ? null : bizFinderLiveInfo.toMap());
            hashMap.put("allInfoList", this.allInfoList);
            return hashMap;
        }
    }

    public static class BizFinderLiveInfo {
        private String bizusername;
        private String cover;
        private String finder_feed_export_id;
        private Long live_scene;
        private Long refresh_interval;
        private String title;
        private Boolean use_weapp;
        private WeApp_Data weapp_data;

        public static final class Builder {
            private String bizusername;
            private String cover;
            private String finder_feed_export_id;
            private Long live_scene;
            private Long refresh_interval;
            private String title;
            private Boolean use_weapp;
            private WeApp_Data weapp_data;

            public BizFinderLiveInfo build() {
                BizFinderLiveInfo bizFinderLiveInfo = new BizFinderLiveInfo();
                bizFinderLiveInfo.setBizusername(this.bizusername);
                bizFinderLiveInfo.setFinder_feed_export_id(this.finder_feed_export_id);
                bizFinderLiveInfo.setRefresh_interval(this.refresh_interval);
                bizFinderLiveInfo.setTitle(this.title);
                bizFinderLiveInfo.setLive_scene(this.live_scene);
                bizFinderLiveInfo.setCover(this.cover);
                bizFinderLiveInfo.setUse_weapp(this.use_weapp);
                bizFinderLiveInfo.setWeapp_data(this.weapp_data);
                return bizFinderLiveInfo;
            }

            public Builder setBizusername(String str) {
                this.bizusername = str;
                return this;
            }

            public Builder setCover(String str) {
                this.cover = str;
                return this;
            }

            public Builder setFinder_feed_export_id(String str) {
                this.finder_feed_export_id = str;
                return this;
            }

            public Builder setLive_scene(Long l) {
                this.live_scene = l;
                return this;
            }

            public Builder setRefresh_interval(Long l) {
                this.refresh_interval = l;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setUse_weapp(Boolean bool) {
                this.use_weapp = bool;
                return this;
            }

            public Builder setWeapp_data(WeApp_Data weApp_Data) {
                this.weapp_data = weApp_Data;
                return this;
            }
        }

        public static BizFinderLiveInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            BizFinderLiveInfo bizFinderLiveInfo = new BizFinderLiveInfo();
            bizFinderLiveInfo.setBizusername((String) map.get("bizusername"));
            bizFinderLiveInfo.setFinder_feed_export_id((String) map.get("finder_feed_export_id"));
            Object obj = map.get("refresh_interval");
            WeApp_Data weApp_Data = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizFinderLiveInfo.setRefresh_interval(l);
            bizFinderLiveInfo.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            Object obj2 = map.get("live_scene");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizFinderLiveInfo.setLive_scene(l2);
            bizFinderLiveInfo.setCover((String) map.get("cover"));
            bizFinderLiveInfo.setUse_weapp((Boolean) map.get("use_weapp"));
            Object obj3 = map.get("weapp_data");
            if (obj3 != null) {
                weApp_Data = WeApp_Data.fromMap((Map) obj3);
            }
            bizFinderLiveInfo.setWeapp_data(weApp_Data);
            return bizFinderLiveInfo;
        }

        public String getBizusername() {
            return this.bizusername;
        }

        public String getCover() {
            return this.cover;
        }

        public String getFinder_feed_export_id() {
            return this.finder_feed_export_id;
        }

        public Long getLive_scene() {
            return this.live_scene;
        }

        public Long getRefresh_interval() {
            return this.refresh_interval;
        }

        public String getTitle() {
            return this.title;
        }

        public Boolean getUse_weapp() {
            return this.use_weapp;
        }

        public WeApp_Data getWeapp_data() {
            return this.weapp_data;
        }

        public void setBizusername(String str) {
            this.bizusername = str;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setFinder_feed_export_id(String str) {
            this.finder_feed_export_id = str;
        }

        public void setLive_scene(Long l) {
            this.live_scene = l;
        }

        public void setRefresh_interval(Long l) {
            this.refresh_interval = l;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUse_weapp(Boolean bool) {
            this.use_weapp = bool;
        }

        public void setWeapp_data(WeApp_Data weApp_Data) {
            this.weapp_data = weApp_Data;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("bizusername", this.bizusername);
            hashMap.put("finder_feed_export_id", this.finder_feed_export_id);
            hashMap.put("refresh_interval", this.refresh_interval);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("live_scene", this.live_scene);
            hashMap.put("cover", this.cover);
            hashMap.put("use_weapp", this.use_weapp);
            WeApp_Data weApp_Data = this.weapp_data;
            hashMap.put("weapp_data", weApp_Data == null ? null : weApp_Data.toMap());
            return hashMap;
        }
    }

    public static class BizFinderPigeonInfo {
        private Long alignment;
        private String coverImgUrl;
        private String encryptUsername;
        private String exportId;
        private Long finderCoverHeight;
        private Long finderCoverWidth;
        private Long finderDuration;
        private Long finderHeight;
        private Long finderMediaType;
        private Long finderWidth;
        private String fromSessionIdInfo;
        private String headImgUrl;
        private Long mediaType;
        private String nickName;
        private String nonceId;
        private String objectId;
        private String reportInfo;
        private String title;

        public static final class Builder {
            private Long alignment;
            private String coverImgUrl;
            private String encryptUsername;
            private String exportId;
            private Long finderCoverHeight;
            private Long finderCoverWidth;
            private Long finderDuration;
            private Long finderHeight;
            private Long finderMediaType;
            private Long finderWidth;
            private String fromSessionIdInfo;
            private String headImgUrl;
            private Long mediaType;
            private String nickName;
            private String nonceId;
            private String objectId;
            private String reportInfo;
            private String title;

            public BizFinderPigeonInfo build() {
                BizFinderPigeonInfo bizFinderPigeonInfo = new BizFinderPigeonInfo();
                bizFinderPigeonInfo.setFromSessionIdInfo(this.fromSessionIdInfo);
                bizFinderPigeonInfo.setObjectId(this.objectId);
                bizFinderPigeonInfo.setExportId(this.exportId);
                bizFinderPigeonInfo.setNonceId(this.nonceId);
                bizFinderPigeonInfo.setMediaType(this.mediaType);
                bizFinderPigeonInfo.setEncryptUsername(this.encryptUsername);
                bizFinderPigeonInfo.setReportInfo(this.reportInfo);
                bizFinderPigeonInfo.setAlignment(this.alignment);
                bizFinderPigeonInfo.setTitle(this.title);
                bizFinderPigeonInfo.setCoverImgUrl(this.coverImgUrl);
                bizFinderPigeonInfo.setNickName(this.nickName);
                bizFinderPigeonInfo.setHeadImgUrl(this.headImgUrl);
                bizFinderPigeonInfo.setFinderDuration(this.finderDuration);
                bizFinderPigeonInfo.setFinderHeight(this.finderHeight);
                bizFinderPigeonInfo.setFinderWidth(this.finderWidth);
                bizFinderPigeonInfo.setFinderCoverHeight(this.finderCoverHeight);
                bizFinderPigeonInfo.setFinderCoverWidth(this.finderCoverWidth);
                bizFinderPigeonInfo.setFinderMediaType(this.finderMediaType);
                return bizFinderPigeonInfo;
            }

            public Builder setAlignment(Long l) {
                this.alignment = l;
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                this.coverImgUrl = str;
                return this;
            }

            public Builder setEncryptUsername(String str) {
                this.encryptUsername = str;
                return this;
            }

            public Builder setExportId(String str) {
                this.exportId = str;
                return this;
            }

            public Builder setFinderCoverHeight(Long l) {
                this.finderCoverHeight = l;
                return this;
            }

            public Builder setFinderCoverWidth(Long l) {
                this.finderCoverWidth = l;
                return this;
            }

            public Builder setFinderDuration(Long l) {
                this.finderDuration = l;
                return this;
            }

            public Builder setFinderHeight(Long l) {
                this.finderHeight = l;
                return this;
            }

            public Builder setFinderMediaType(Long l) {
                this.finderMediaType = l;
                return this;
            }

            public Builder setFinderWidth(Long l) {
                this.finderWidth = l;
                return this;
            }

            public Builder setFromSessionIdInfo(String str) {
                this.fromSessionIdInfo = str;
                return this;
            }

            public Builder setHeadImgUrl(String str) {
                this.headImgUrl = str;
                return this;
            }

            public Builder setMediaType(Long l) {
                this.mediaType = l;
                return this;
            }

            public Builder setNickName(String str) {
                this.nickName = str;
                return this;
            }

            public Builder setNonceId(String str) {
                this.nonceId = str;
                return this;
            }

            public Builder setObjectId(String str) {
                this.objectId = str;
                return this;
            }

            public Builder setReportInfo(String str) {
                this.reportInfo = str;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }
        }

        public static BizFinderPigeonInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Long l6;
            Long l7;
            BizFinderPigeonInfo bizFinderPigeonInfo = new BizFinderPigeonInfo();
            bizFinderPigeonInfo.setFromSessionIdInfo((String) map.get("fromSessionIdInfo"));
            bizFinderPigeonInfo.setObjectId((String) map.get("objectId"));
            bizFinderPigeonInfo.setExportId((String) map.get("exportId"));
            bizFinderPigeonInfo.setNonceId((String) map.get("nonceId"));
            Object obj = map.get("mediaType");
            Long l8 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizFinderPigeonInfo.setMediaType(l);
            bizFinderPigeonInfo.setEncryptUsername((String) map.get("encryptUsername"));
            bizFinderPigeonInfo.setReportInfo((String) map.get("reportInfo"));
            Object obj2 = map.get("alignment");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizFinderPigeonInfo.setAlignment(l2);
            bizFinderPigeonInfo.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            bizFinderPigeonInfo.setCoverImgUrl((String) map.get("coverImgUrl"));
            bizFinderPigeonInfo.setNickName((String) map.get("nickName"));
            bizFinderPigeonInfo.setHeadImgUrl((String) map.get("headImgUrl"));
            Object obj3 = map.get("finderDuration");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            bizFinderPigeonInfo.setFinderDuration(l3);
            Object obj4 = map.get("finderHeight");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            bizFinderPigeonInfo.setFinderHeight(l4);
            Object obj5 = map.get("finderWidth");
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            bizFinderPigeonInfo.setFinderWidth(l5);
            Object obj6 = map.get("finderCoverHeight");
            if (obj6 == null) {
                l6 = null;
            } else {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            bizFinderPigeonInfo.setFinderCoverHeight(l6);
            Object obj7 = map.get("finderCoverWidth");
            if (obj7 == null) {
                l7 = null;
            } else {
                l7 = Long.valueOf(obj7 instanceof Integer ? (long) ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            bizFinderPigeonInfo.setFinderCoverWidth(l7);
            Object obj8 = map.get("finderMediaType");
            if (obj8 != null) {
                l8 = Long.valueOf(obj8 instanceof Integer ? (long) ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            bizFinderPigeonInfo.setFinderMediaType(l8);
            return bizFinderPigeonInfo;
        }

        public Long getAlignment() {
            return this.alignment;
        }

        public String getCoverImgUrl() {
            return this.coverImgUrl;
        }

        public String getEncryptUsername() {
            return this.encryptUsername;
        }

        public String getExportId() {
            return this.exportId;
        }

        public Long getFinderCoverHeight() {
            return this.finderCoverHeight;
        }

        public Long getFinderCoverWidth() {
            return this.finderCoverWidth;
        }

        public Long getFinderDuration() {
            return this.finderDuration;
        }

        public Long getFinderHeight() {
            return this.finderHeight;
        }

        public Long getFinderMediaType() {
            return this.finderMediaType;
        }

        public Long getFinderWidth() {
            return this.finderWidth;
        }

        public String getFromSessionIdInfo() {
            return this.fromSessionIdInfo;
        }

        public String getHeadImgUrl() {
            return this.headImgUrl;
        }

        public Long getMediaType() {
            return this.mediaType;
        }

        public String getNickName() {
            return this.nickName;
        }

        public String getNonceId() {
            return this.nonceId;
        }

        public String getObjectId() {
            return this.objectId;
        }

        public String getReportInfo() {
            return this.reportInfo;
        }

        public String getTitle() {
            return this.title;
        }

        public void setAlignment(Long l) {
            this.alignment = l;
        }

        public void setCoverImgUrl(String str) {
            this.coverImgUrl = str;
        }

        public void setEncryptUsername(String str) {
            this.encryptUsername = str;
        }

        public void setExportId(String str) {
            this.exportId = str;
        }

        public void setFinderCoverHeight(Long l) {
            this.finderCoverHeight = l;
        }

        public void setFinderCoverWidth(Long l) {
            this.finderCoverWidth = l;
        }

        public void setFinderDuration(Long l) {
            this.finderDuration = l;
        }

        public void setFinderHeight(Long l) {
            this.finderHeight = l;
        }

        public void setFinderMediaType(Long l) {
            this.finderMediaType = l;
        }

        public void setFinderWidth(Long l) {
            this.finderWidth = l;
        }

        public void setFromSessionIdInfo(String str) {
            this.fromSessionIdInfo = str;
        }

        public void setHeadImgUrl(String str) {
            this.headImgUrl = str;
        }

        public void setMediaType(Long l) {
            this.mediaType = l;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setNonceId(String str) {
            this.nonceId = str;
        }

        public void setObjectId(String str) {
            this.objectId = str;
        }

        public void setReportInfo(String str) {
            this.reportInfo = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("fromSessionIdInfo", this.fromSessionIdInfo);
            hashMap.put("objectId", this.objectId);
            hashMap.put("exportId", this.exportId);
            hashMap.put("nonceId", this.nonceId);
            hashMap.put("mediaType", this.mediaType);
            hashMap.put("encryptUsername", this.encryptUsername);
            hashMap.put("reportInfo", this.reportInfo);
            hashMap.put("alignment", this.alignment);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("coverImgUrl", this.coverImgUrl);
            hashMap.put("nickName", this.nickName);
            hashMap.put("headImgUrl", this.headImgUrl);
            hashMap.put("finderDuration", this.finderDuration);
            hashMap.put("finderHeight", this.finderHeight);
            hashMap.put("finderWidth", this.finderWidth);
            hashMap.put("finderCoverHeight", this.finderCoverHeight);
            hashMap.put("finderCoverWidth", this.finderCoverWidth);
            hashMap.put("finderMediaType", this.finderMediaType);
            return hashMap;
        }
    }

    public static class BizMinimizeInfo {
        private byte[] coverImage;
        private String coverUrl;
        private Long itemShowType;
        private Long localId;
        private String nickName;
        private Long svrId;
        private String title;
        private String url;
        private String userName;

        public static final class Builder {
            private byte[] coverImage;
            private String coverUrl;
            private Long itemShowType;
            private Long localId;
            private String nickName;
            private Long svrId;
            private String title;
            private String url;
            private String userName;

            public BizMinimizeInfo build() {
                BizMinimizeInfo bizMinimizeInfo = new BizMinimizeInfo();
                bizMinimizeInfo.setLocalId(this.localId);
                bizMinimizeInfo.setSvrId(this.svrId);
                bizMinimizeInfo.setUrl(this.url);
                bizMinimizeInfo.setUserName(this.userName);
                bizMinimizeInfo.setNickName(this.nickName);
                bizMinimizeInfo.setTitle(this.title);
                bizMinimizeInfo.setCoverUrl(this.coverUrl);
                bizMinimizeInfo.setItemShowType(this.itemShowType);
                bizMinimizeInfo.setCoverImage(this.coverImage);
                return bizMinimizeInfo;
            }

            public Builder setCoverImage(byte[] bArr) {
                this.coverImage = bArr;
                return this;
            }

            public Builder setCoverUrl(String str) {
                this.coverUrl = str;
                return this;
            }

            public Builder setItemShowType(Long l) {
                this.itemShowType = l;
                return this;
            }

            public Builder setLocalId(Long l) {
                this.localId = l;
                return this;
            }

            public Builder setNickName(String str) {
                this.nickName = str;
                return this;
            }

            public Builder setSvrId(Long l) {
                this.svrId = l;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }

            public Builder setUserName(String str) {
                this.userName = str;
                return this;
            }
        }

        public static BizMinimizeInfo fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            BizMinimizeInfo bizMinimizeInfo = new BizMinimizeInfo();
            Object obj = map.get(C66261f3.COL_LOCALID);
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizMinimizeInfo.setLocalId(l);
            Object obj2 = map.get("svrId");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizMinimizeInfo.setSvrId(l2);
            bizMinimizeInfo.setUrl((String) map.get("url"));
            bizMinimizeInfo.setUserName((String) map.get("userName"));
            bizMinimizeInfo.setNickName((String) map.get("nickName"));
            bizMinimizeInfo.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            bizMinimizeInfo.setCoverUrl((String) map.get("coverUrl"));
            Object obj3 = map.get("itemShowType");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            bizMinimizeInfo.setItemShowType(l3);
            bizMinimizeInfo.setCoverImage((byte[]) map.get("coverImage"));
            return bizMinimizeInfo;
        }

        public byte[] getCoverImage() {
            return this.coverImage;
        }

        public String getCoverUrl() {
            return this.coverUrl;
        }

        public Long getItemShowType() {
            return this.itemShowType;
        }

        public Long getLocalId() {
            return this.localId;
        }

        public String getNickName() {
            return this.nickName;
        }

        public Long getSvrId() {
            return this.svrId;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setCoverImage(byte[] bArr) {
            this.coverImage = bArr;
        }

        public void setCoverUrl(String str) {
            this.coverUrl = str;
        }

        public void setItemShowType(Long l) {
            this.itemShowType = l;
        }

        public void setLocalId(Long l) {
            this.localId = l;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setSvrId(Long l) {
            this.svrId = l;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(C66261f3.COL_LOCALID, this.localId);
            hashMap.put("svrId", this.svrId);
            hashMap.put("url", this.url);
            hashMap.put("userName", this.userName);
            hashMap.put("nickName", this.nickName);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("coverUrl", this.coverUrl);
            hashMap.put("itemShowType", this.itemShowType);
            hashMap.put("coverImage", this.coverImage);
            return hashMap;
        }
    }

    public enum BizNotifyEventType {
        eventTypeNewMsg(0),
        eventTypeResort(1),
        eventTypeDelete(2),
        eventTypeUpdate(3),
        eventTypeContactUpdate(4);
        
        private int index;

        private BizNotifyEventType(int i) {
            this.index = i;
        }
    }

    public static class BizNotifyInfo {
        private Long eventType;
        private List<MassSendCardMsg> items;
        private MassSendCardMsg msgInfo;
        private String talker;

        public static final class Builder {
            private Long eventType;
            private List<MassSendCardMsg> items;
            private MassSendCardMsg msgInfo;
            private String talker;

            public BizNotifyInfo build() {
                BizNotifyInfo bizNotifyInfo = new BizNotifyInfo();
                bizNotifyInfo.setEventType(this.eventType);
                bizNotifyInfo.setMsgInfo(this.msgInfo);
                bizNotifyInfo.setItems(this.items);
                bizNotifyInfo.setTalker(this.talker);
                return bizNotifyInfo;
            }

            public Builder setEventType(Long l) {
                this.eventType = l;
                return this;
            }

            public Builder setItems(List<MassSendCardMsg> list) {
                this.items = list;
                return this;
            }

            public Builder setMsgInfo(MassSendCardMsg massSendCardMsg) {
                this.msgInfo = massSendCardMsg;
                return this;
            }

            public Builder setTalker(String str) {
                this.talker = str;
                return this;
            }
        }

        public static BizNotifyInfo fromMap(Map<String, Object> map) {
            Long l;
            BizNotifyInfo bizNotifyInfo = new BizNotifyInfo();
            Object obj = map.get("eventType");
            MassSendCardMsg massSendCardMsg = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizNotifyInfo.setEventType(l);
            Object obj2 = map.get("msgInfo");
            if (obj2 != null) {
                massSendCardMsg = MassSendCardMsg.fromMap((Map) obj2);
            }
            bizNotifyInfo.setMsgInfo(massSendCardMsg);
            bizNotifyInfo.setItems((List) map.get("items"));
            bizNotifyInfo.setTalker((String) map.get("talker"));
            return bizNotifyInfo;
        }

        public Long getEventType() {
            return this.eventType;
        }

        public List<MassSendCardMsg> getItems() {
            return this.items;
        }

        public MassSendCardMsg getMsgInfo() {
            return this.msgInfo;
        }

        public String getTalker() {
            return this.talker;
        }

        public void setEventType(Long l) {
            this.eventType = l;
        }

        public void setItems(List<MassSendCardMsg> list) {
            this.items = list;
        }

        public void setMsgInfo(MassSendCardMsg massSendCardMsg) {
            this.msgInfo = massSendCardMsg;
        }

        public void setTalker(String str) {
            this.talker = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", this.eventType);
            MassSendCardMsg massSendCardMsg = this.msgInfo;
            hashMap.put("msgInfo", massSendCardMsg == null ? null : massSendCardMsg.toMap());
            hashMap.put("items", this.items);
            hashMap.put("talker", this.talker);
            return hashMap;
        }
    }

    public static class BizNotifyTipsInfo {
        private String coverUrl;
        private Boolean isBizContact;
        private Long msgCount;
        private Long msgId;
        private String userName;

        public static final class Builder {
            private String coverUrl;
            private Boolean isBizContact;
            private Long msgCount;
            private Long msgId;
            private String userName;

            public BizNotifyTipsInfo build() {
                BizNotifyTipsInfo bizNotifyTipsInfo = new BizNotifyTipsInfo();
                bizNotifyTipsInfo.setMsgCount(this.msgCount);
                bizNotifyTipsInfo.setMsgId(this.msgId);
                bizNotifyTipsInfo.setUserName(this.userName);
                bizNotifyTipsInfo.setIsBizContact(this.isBizContact);
                bizNotifyTipsInfo.setCoverUrl(this.coverUrl);
                return bizNotifyTipsInfo;
            }

            public Builder setCoverUrl(String str) {
                this.coverUrl = str;
                return this;
            }

            public Builder setIsBizContact(Boolean bool) {
                this.isBizContact = bool;
                return this;
            }

            public Builder setMsgCount(Long l) {
                this.msgCount = l;
                return this;
            }

            public Builder setMsgId(Long l) {
                this.msgId = l;
                return this;
            }

            public Builder setUserName(String str) {
                this.userName = str;
                return this;
            }
        }

        public static BizNotifyTipsInfo fromMap(Map<String, Object> map) {
            Long l;
            BizNotifyTipsInfo bizNotifyTipsInfo = new BizNotifyTipsInfo();
            Object obj = map.get("msgCount");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            bizNotifyTipsInfo.setMsgCount(l);
            Object obj2 = map.get("msgId");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            bizNotifyTipsInfo.setMsgId(l2);
            bizNotifyTipsInfo.setUserName((String) map.get("userName"));
            bizNotifyTipsInfo.setIsBizContact((Boolean) map.get("isBizContact"));
            bizNotifyTipsInfo.setCoverUrl((String) map.get("coverUrl"));
            return bizNotifyTipsInfo;
        }

        public String getCoverUrl() {
            return this.coverUrl;
        }

        public Boolean getIsBizContact() {
            return this.isBizContact;
        }

        public Long getMsgCount() {
            return this.msgCount;
        }

        public Long getMsgId() {
            return this.msgId;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setCoverUrl(String str) {
            this.coverUrl = str;
        }

        public void setIsBizContact(Boolean bool) {
            this.isBizContact = bool;
        }

        public void setMsgCount(Long l) {
            this.msgCount = l;
        }

        public void setMsgId(Long l) {
            this.msgId = l;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("msgCount", this.msgCount);
            hashMap.put("msgId", this.msgId);
            hashMap.put("userName", this.userName);
            hashMap.put("isBizContact", this.isBizContact);
            hashMap.put("coverUrl", this.coverUrl);
            return hashMap;
        }
    }

    public static class ContactInfo {
        private Boolean isContact;
        private Boolean isPlaceTop;
        private String nickName;
        private String userName;

        public static final class Builder {
            private Boolean isContact;
            private Boolean isPlaceTop;
            private String nickName;
            private String userName;

            public ContactInfo build() {
                ContactInfo contactInfo = new ContactInfo();
                contactInfo.setUserName(this.userName);
                contactInfo.setNickName(this.nickName);
                contactInfo.setIsContact(this.isContact);
                contactInfo.setIsPlaceTop(this.isPlaceTop);
                return contactInfo;
            }

            public Builder setIsContact(Boolean bool) {
                this.isContact = bool;
                return this;
            }

            public Builder setIsPlaceTop(Boolean bool) {
                this.isPlaceTop = bool;
                return this;
            }

            public Builder setNickName(String str) {
                this.nickName = str;
                return this;
            }

            public Builder setUserName(String str) {
                this.userName = str;
                return this;
            }
        }

        public static ContactInfo fromMap(Map<String, Object> map) {
            ContactInfo contactInfo = new ContactInfo();
            contactInfo.setUserName((String) map.get("userName"));
            contactInfo.setNickName((String) map.get("nickName"));
            contactInfo.setIsContact((Boolean) map.get("isContact"));
            contactInfo.setIsPlaceTop((Boolean) map.get("isPlaceTop"));
            return contactInfo;
        }

        public Boolean getIsContact() {
            return this.isContact;
        }

        public Boolean getIsPlaceTop() {
            return this.isPlaceTop;
        }

        public String getNickName() {
            return this.nickName;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setIsContact(Boolean bool) {
            this.isContact = bool;
        }

        public void setIsPlaceTop(Boolean bool) {
            this.isPlaceTop = bool;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("userName", this.userName);
            hashMap.put("nickName", this.nickName);
            hashMap.put("isContact", this.isContact);
            hashMap.put("isPlaceTop", this.isPlaceTop);
            return hashMap;
        }
    }

    public static class MassSendCardMsg {
        private Long createTime;
        private Boolean isBigPic;
        private Boolean isExpand;
        private Boolean isExposed;
        private Boolean isPlaceTop;
        private Boolean isValidExposed;
        private List<MassSendCardMsgItem> items;
        private Long msgId;
        private String nickName;
        private Long orderId;
        private String rankSessionId;
        private Long svrId;
        private String userName;

        public static final class Builder {
            private Long createTime;
            private Boolean isBigPic;
            private Boolean isExpand;
            private Boolean isExposed;
            private Boolean isPlaceTop;
            private Boolean isValidExposed;
            private List<MassSendCardMsgItem> items;
            private Long msgId;
            private String nickName;
            private Long orderId;
            private String rankSessionId;
            private Long svrId;
            private String userName;

            public MassSendCardMsg build() {
                MassSendCardMsg massSendCardMsg = new MassSendCardMsg();
                massSendCardMsg.setUserName(this.userName);
                massSendCardMsg.setNickName(this.nickName);
                massSendCardMsg.setOrderId(this.orderId);
                massSendCardMsg.setMsgId(this.msgId);
                massSendCardMsg.setSvrId(this.svrId);
                massSendCardMsg.setIsExposed(this.isExposed);
                massSendCardMsg.setIsValidExposed(this.isValidExposed);
                massSendCardMsg.setIsExpand(this.isExpand);
                massSendCardMsg.setIsPlaceTop(this.isPlaceTop);
                massSendCardMsg.setCreateTime(this.createTime);
                massSendCardMsg.setRankSessionId(this.rankSessionId);
                massSendCardMsg.setIsBigPic(this.isBigPic);
                massSendCardMsg.setItems(this.items);
                return massSendCardMsg;
            }

            public Builder setCreateTime(Long l) {
                this.createTime = l;
                return this;
            }

            public Builder setIsBigPic(Boolean bool) {
                this.isBigPic = bool;
                return this;
            }

            public Builder setIsExpand(Boolean bool) {
                this.isExpand = bool;
                return this;
            }

            public Builder setIsExposed(Boolean bool) {
                this.isExposed = bool;
                return this;
            }

            public Builder setIsPlaceTop(Boolean bool) {
                this.isPlaceTop = bool;
                return this;
            }

            public Builder setIsValidExposed(Boolean bool) {
                this.isValidExposed = bool;
                return this;
            }

            public Builder setItems(List<MassSendCardMsgItem> list) {
                this.items = list;
                return this;
            }

            public Builder setMsgId(Long l) {
                this.msgId = l;
                return this;
            }

            public Builder setNickName(String str) {
                this.nickName = str;
                return this;
            }

            public Builder setOrderId(Long l) {
                this.orderId = l;
                return this;
            }

            public Builder setRankSessionId(String str) {
                this.rankSessionId = str;
                return this;
            }

            public Builder setSvrId(Long l) {
                this.svrId = l;
                return this;
            }

            public Builder setUserName(String str) {
                this.userName = str;
                return this;
            }
        }

        public static MassSendCardMsg fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            MassSendCardMsg massSendCardMsg = new MassSendCardMsg();
            massSendCardMsg.setUserName((String) map.get("userName"));
            massSendCardMsg.setNickName((String) map.get("nickName"));
            Object obj = map.get("orderId");
            Long l4 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            massSendCardMsg.setOrderId(l);
            Object obj2 = map.get("msgId");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            massSendCardMsg.setMsgId(l2);
            Object obj3 = map.get("svrId");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            massSendCardMsg.setSvrId(l3);
            massSendCardMsg.setIsExposed((Boolean) map.get("isExposed"));
            massSendCardMsg.setIsValidExposed((Boolean) map.get("isValidExposed"));
            massSendCardMsg.setIsExpand((Boolean) map.get("isExpand"));
            massSendCardMsg.setIsPlaceTop((Boolean) map.get("isPlaceTop"));
            Object obj4 = map.get("createTime");
            if (obj4 != null) {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            massSendCardMsg.setCreateTime(l4);
            massSendCardMsg.setRankSessionId((String) map.get("rankSessionId"));
            massSendCardMsg.setIsBigPic((Boolean) map.get("isBigPic"));
            massSendCardMsg.setItems((List) map.get("items"));
            return massSendCardMsg;
        }

        public Long getCreateTime() {
            return this.createTime;
        }

        public Boolean getIsBigPic() {
            return this.isBigPic;
        }

        public Boolean getIsExpand() {
            return this.isExpand;
        }

        public Boolean getIsExposed() {
            return this.isExposed;
        }

        public Boolean getIsPlaceTop() {
            return this.isPlaceTop;
        }

        public Boolean getIsValidExposed() {
            return this.isValidExposed;
        }

        public List<MassSendCardMsgItem> getItems() {
            return this.items;
        }

        public Long getMsgId() {
            return this.msgId;
        }

        public String getNickName() {
            return this.nickName;
        }

        public Long getOrderId() {
            return this.orderId;
        }

        public String getRankSessionId() {
            return this.rankSessionId;
        }

        public Long getSvrId() {
            return this.svrId;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setCreateTime(Long l) {
            this.createTime = l;
        }

        public void setIsBigPic(Boolean bool) {
            this.isBigPic = bool;
        }

        public void setIsExpand(Boolean bool) {
            this.isExpand = bool;
        }

        public void setIsExposed(Boolean bool) {
            this.isExposed = bool;
        }

        public void setIsPlaceTop(Boolean bool) {
            this.isPlaceTop = bool;
        }

        public void setIsValidExposed(Boolean bool) {
            this.isValidExposed = bool;
        }

        public void setItems(List<MassSendCardMsgItem> list) {
            this.items = list;
        }

        public void setMsgId(Long l) {
            this.msgId = l;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setOrderId(Long l) {
            this.orderId = l;
        }

        public void setRankSessionId(String str) {
            this.rankSessionId = str;
        }

        public void setSvrId(Long l) {
            this.svrId = l;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("userName", this.userName);
            hashMap.put("nickName", this.nickName);
            hashMap.put("orderId", this.orderId);
            hashMap.put("msgId", this.msgId);
            hashMap.put("svrId", this.svrId);
            hashMap.put("isExposed", this.isExposed);
            hashMap.put("isValidExposed", this.isValidExposed);
            hashMap.put("isExpand", this.isExpand);
            hashMap.put("isPlaceTop", this.isPlaceTop);
            hashMap.put("createTime", this.createTime);
            hashMap.put("rankSessionId", this.rankSessionId);
            hashMap.put("isBigPic", this.isBigPic);
            hashMap.put("items", this.items);
            return hashMap;
        }
    }

    public static class MassSendCardMsgItem {
        private String cover;
        private String cover_1_1;
        private String digest;
        private Boolean isPaySubscribe;
        private Long itemShowType;
        private Long picNum;
        private Long play_length;
        private String play_url;
        private String player;
        private Long time;
        private String title;
        private String url;
        private String urlId;
        private String vid;
        private Long videoHeight;
        private Long videoWidth;

        public static final class Builder {
            private String cover;
            private String cover_1_1;
            private String digest;
            private Boolean isPaySubscribe;
            private Long itemShowType;
            private Long picNum;
            private Long play_length;
            private String play_url;
            private String player;
            private Long time;
            private String title;
            private String url;
            private String urlId;
            private String vid;
            private Long videoHeight;
            private Long videoWidth;

            public MassSendCardMsgItem build() {
                MassSendCardMsgItem massSendCardMsgItem = new MassSendCardMsgItem();
                massSendCardMsgItem.setTitle(this.title);
                massSendCardMsgItem.setUrl(this.url);
                massSendCardMsgItem.setUrlId(this.urlId);
                massSendCardMsgItem.setTime(this.time);
                massSendCardMsgItem.setCover(this.cover);
                massSendCardMsgItem.setCover_1_1(this.cover_1_1);
                massSendCardMsgItem.setDigest(this.digest);
                massSendCardMsgItem.setItemShowType(this.itemShowType);
                massSendCardMsgItem.setPlay_length(this.play_length);
                massSendCardMsgItem.setPlay_url(this.play_url);
                massSendCardMsgItem.setPlayer(this.player);
                massSendCardMsgItem.setVid(this.vid);
                massSendCardMsgItem.setPicNum(this.picNum);
                massSendCardMsgItem.setVideoWidth(this.videoWidth);
                massSendCardMsgItem.setVideoHeight(this.videoHeight);
                massSendCardMsgItem.setIsPaySubscribe(this.isPaySubscribe);
                return massSendCardMsgItem;
            }

            public Builder setCover(String str) {
                this.cover = str;
                return this;
            }

            public Builder setCover_1_1(String str) {
                this.cover_1_1 = str;
                return this;
            }

            public Builder setDigest(String str) {
                this.digest = str;
                return this;
            }

            public Builder setIsPaySubscribe(Boolean bool) {
                this.isPaySubscribe = bool;
                return this;
            }

            public Builder setItemShowType(Long l) {
                this.itemShowType = l;
                return this;
            }

            public Builder setPicNum(Long l) {
                this.picNum = l;
                return this;
            }

            public Builder setPlay_length(Long l) {
                this.play_length = l;
                return this;
            }

            public Builder setPlay_url(String str) {
                this.play_url = str;
                return this;
            }

            public Builder setPlayer(String str) {
                this.player = str;
                return this;
            }

            public Builder setTime(Long l) {
                this.time = l;
                return this;
            }

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }

            public Builder setUrlId(String str) {
                this.urlId = str;
                return this;
            }

            public Builder setVid(String str) {
                this.vid = str;
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

        public static MassSendCardMsgItem fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            MassSendCardMsgItem massSendCardMsgItem = new MassSendCardMsgItem();
            massSendCardMsgItem.setTitle((String) map.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            massSendCardMsgItem.setUrl((String) map.get("url"));
            massSendCardMsgItem.setUrlId((String) map.get("urlId"));
            Object obj = map.get("time");
            Long l6 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            massSendCardMsgItem.setTime(l);
            massSendCardMsgItem.setCover((String) map.get("cover"));
            massSendCardMsgItem.setCover_1_1((String) map.get("cover_1_1"));
            massSendCardMsgItem.setDigest((String) map.get("digest"));
            Object obj2 = map.get("itemShowType");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            massSendCardMsgItem.setItemShowType(l2);
            Object obj3 = map.get("play_length");
            if (obj3 == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            massSendCardMsgItem.setPlay_length(l3);
            massSendCardMsgItem.setPlay_url((String) map.get("play_url"));
            massSendCardMsgItem.setPlayer((String) map.get("player"));
            massSendCardMsgItem.setVid((String) map.get(TPReportKeys.Common.COMMON_VID));
            Object obj4 = map.get("picNum");
            if (obj4 == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(obj4 instanceof Integer ? (long) ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            massSendCardMsgItem.setPicNum(l4);
            Object obj5 = map.get(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            if (obj5 == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(obj5 instanceof Integer ? (long) ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            massSendCardMsgItem.setVideoWidth(l5);
            Object obj6 = map.get(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            if (obj6 != null) {
                l6 = Long.valueOf(obj6 instanceof Integer ? (long) ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            massSendCardMsgItem.setVideoHeight(l6);
            massSendCardMsgItem.setIsPaySubscribe((Boolean) map.get("isPaySubscribe"));
            return massSendCardMsgItem;
        }

        public String getCover() {
            return this.cover;
        }

        public String getCover_1_1() {
            return this.cover_1_1;
        }

        public String getDigest() {
            return this.digest;
        }

        public Boolean getIsPaySubscribe() {
            return this.isPaySubscribe;
        }

        public Long getItemShowType() {
            return this.itemShowType;
        }

        public Long getPicNum() {
            return this.picNum;
        }

        public Long getPlay_length() {
            return this.play_length;
        }

        public String getPlay_url() {
            return this.play_url;
        }

        public String getPlayer() {
            return this.player;
        }

        public Long getTime() {
            return this.time;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlId() {
            return this.urlId;
        }

        public String getVid() {
            return this.vid;
        }

        public Long getVideoHeight() {
            return this.videoHeight;
        }

        public Long getVideoWidth() {
            return this.videoWidth;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setCover_1_1(String str) {
            this.cover_1_1 = str;
        }

        public void setDigest(String str) {
            this.digest = str;
        }

        public void setIsPaySubscribe(Boolean bool) {
            this.isPaySubscribe = bool;
        }

        public void setItemShowType(Long l) {
            this.itemShowType = l;
        }

        public void setPicNum(Long l) {
            this.picNum = l;
        }

        public void setPlay_length(Long l) {
            this.play_length = l;
        }

        public void setPlay_url(String str) {
            this.play_url = str;
        }

        public void setPlayer(String str) {
            this.player = str;
        }

        public void setTime(Long l) {
            this.time = l;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlId(String str) {
            this.urlId = str;
        }

        public void setVid(String str) {
            this.vid = str;
        }

        public void setVideoHeight(Long l) {
            this.videoHeight = l;
        }

        public void setVideoWidth(Long l) {
            this.videoWidth = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.title);
            hashMap.put("url", this.url);
            hashMap.put("urlId", this.urlId);
            hashMap.put("time", this.time);
            hashMap.put("cover", this.cover);
            hashMap.put("cover_1_1", this.cover_1_1);
            hashMap.put("digest", this.digest);
            hashMap.put("itemShowType", this.itemShowType);
            hashMap.put("play_length", this.play_length);
            hashMap.put("play_url", this.play_url);
            hashMap.put("player", this.player);
            hashMap.put(TPReportKeys.Common.COMMON_VID, this.vid);
            hashMap.put("picNum", this.picNum);
            hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, this.videoWidth);
            hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, this.videoHeight);
            hashMap.put("isPaySubscribe", this.isPaySubscribe);
            return hashMap;
        }
    }

    public static class OftenReadAccountInfo {
        private ContactInfo contactInfo;
        private Boolean hasUnreadDot;
        private Long lastMsgTime;

        public static final class Builder {
            private ContactInfo contactInfo;
            private Boolean hasUnreadDot;
            private Long lastMsgTime;

            public OftenReadAccountInfo build() {
                OftenReadAccountInfo oftenReadAccountInfo = new OftenReadAccountInfo();
                oftenReadAccountInfo.setContactInfo(this.contactInfo);
                oftenReadAccountInfo.setHasUnreadDot(this.hasUnreadDot);
                oftenReadAccountInfo.setLastMsgTime(this.lastMsgTime);
                return oftenReadAccountInfo;
            }

            public Builder setContactInfo(ContactInfo contactInfo2) {
                this.contactInfo = contactInfo2;
                return this;
            }

            public Builder setHasUnreadDot(Boolean bool) {
                this.hasUnreadDot = bool;
                return this;
            }

            public Builder setLastMsgTime(Long l) {
                this.lastMsgTime = l;
                return this;
            }
        }

        public static OftenReadAccountInfo fromMap(Map<String, Object> map) {
            OftenReadAccountInfo oftenReadAccountInfo = new OftenReadAccountInfo();
            Object obj = map.get("contactInfo");
            Long l = null;
            oftenReadAccountInfo.setContactInfo(obj == null ? null : ContactInfo.fromMap((Map) obj));
            oftenReadAccountInfo.setHasUnreadDot((Boolean) map.get("hasUnreadDot"));
            Object obj2 = map.get("lastMsgTime");
            if (obj2 != null) {
                l = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            oftenReadAccountInfo.setLastMsgTime(l);
            return oftenReadAccountInfo;
        }

        public ContactInfo getContactInfo() {
            return this.contactInfo;
        }

        public Boolean getHasUnreadDot() {
            return this.hasUnreadDot;
        }

        public Long getLastMsgTime() {
            return this.lastMsgTime;
        }

        public void setContactInfo(ContactInfo contactInfo2) {
            this.contactInfo = contactInfo2;
        }

        public void setHasUnreadDot(Boolean bool) {
            this.hasUnreadDot = bool;
        }

        public void setLastMsgTime(Long l) {
            this.lastMsgTime = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            ContactInfo contactInfo2 = this.contactInfo;
            hashMap.put("contactInfo", contactInfo2 == null ? null : contactInfo2.toMap());
            hashMap.put("hasUnreadDot", this.hasUnreadDot);
            hashMap.put("lastMsgTime", this.lastMsgTime);
            return hashMap;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static class WeApp_Data {
        private String appid;
        private byte[] data_buffer;
        private String path;
        private Long version_type;

        public static final class Builder {
            private String appid;
            private byte[] data_buffer;
            private String path;
            private Long version_type;

            public WeApp_Data build() {
                WeApp_Data weApp_Data = new WeApp_Data();
                weApp_Data.setAppid(this.appid);
                weApp_Data.setVersion_type(this.version_type);
                weApp_Data.setData_buffer(this.data_buffer);
                weApp_Data.setPath(this.path);
                return weApp_Data;
            }

            public Builder setAppid(String str) {
                this.appid = str;
                return this;
            }

            public Builder setData_buffer(byte[] bArr) {
                this.data_buffer = bArr;
                return this;
            }

            public Builder setPath(String str) {
                this.path = str;
                return this;
            }

            public Builder setVersion_type(Long l) {
                this.version_type = l;
                return this;
            }
        }

        public static WeApp_Data fromMap(Map<String, Object> map) {
            Long l;
            WeApp_Data weApp_Data = new WeApp_Data();
            weApp_Data.setAppid((String) map.get("appid"));
            Object obj = map.get("version_type");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            weApp_Data.setVersion_type(l);
            weApp_Data.setData_buffer((byte[]) map.get("data_buffer"));
            weApp_Data.setPath((String) map.get("path"));
            return weApp_Data;
        }

        public String getAppid() {
            return this.appid;
        }

        public byte[] getData_buffer() {
            return this.data_buffer;
        }

        public String getPath() {
            return this.path;
        }

        public Long getVersion_type() {
            return this.version_type;
        }

        public void setAppid(String str) {
            this.appid = str;
        }

        public void setData_buffer(byte[] bArr) {
            this.data_buffer = bArr;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public void setVersion_type(Long l) {
            this.version_type = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("appid", this.appid);
            hashMap.put("version_type", this.version_type);
            hashMap.put("data_buffer", this.data_buffer);
            hashMap.put("path", this.path);
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

    public interface BizApi {
        void addToPreload(String str, Long l, Long l2);

        void createMagicAdBrandService(Long l);

        void createMagicBrandService(Long l);

        Boolean deleteByMsgId(Long l);

        Boolean deleteByTalker(String str);

        void doSearch();

        BizEnterStatusInfo getBizEnterStatusInfo();

        void getBizFinderLivesInfo(Boolean bool, Result<List<BizFinderLiveInfo>> result);

        String getBizImgCacheDirectory();

        String getCdnUrlList();

        ContactInfo getContactInfo(String str);

        void getContactInfoBatch(List<String> list, Result<List<ContactInfo>> result);

        void getMassSendData(Long l, Boolean bool, Boolean bool2, Result<List<MassSendCardMsg>> result);

        BizNotifyTipsInfo getNotifyTipsInfo();

        void getOftenReadAccountInfo(String str, Result<OftenReadAccountInfo> result);

        void getOftenReadAccountInfoBatch(List<String> list, Result<Map<String, OftenReadAccountInfo>> result);

        Long getUnReadCount();

        void gotoBizTestUI();

        void gotoFinder(BizFinderJumpInfo bizFinderJumpInfo);

        void gotoOldList(Long l, Long l2);

        void gotoProfile(String str, Long l, Long l2);

        Boolean isFinderContactFollow(String str);

        Boolean isPaid(String str);

        void launchBizFinderFeed(BizFinderPigeonInfo bizFinderPigeonInfo);

        void loadLocalOftenReadInfo(Result<byte[]> result);

        void onClickNotifyTips();

        Boolean onExpand(Long l);

        void onExposed(Long l, String str, Boolean bool, Boolean bool2);

        void onMinimizeArticle(BizMinimizeInfo bizMinimizeInfo);

        void onMinimizeFinder(BizFinderPigeonInfo bizFinderPigeonInfo);

        void openFinderContact(BizFinderPigeonInfo bizFinderPigeonInfo);

        void openUrl(BizArticleInfo bizArticleInfo);

        void resetRedDot();

        void saveFinderLivesInfoBatch(List<BizFinderLiveInfo> list, Result<Void> result);

        void saveLocalOftenReadInfo(byte[] bArr, Result<Void> result);

        void setPayStatus(String str, Boolean bool);

        void unfollowFinderContact(BizFinderPigeonInfo bizFinderPigeonInfo);

        void updateBizFinderLivesInfo(List<String> list, Result<List<BizFinderLiveInfo>> result);

        /* renamed from: com.tencent.pigeon.BizPigeon$BizApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: A */
            public static /* synthetic */ void m21661A(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizFinderPigeonInfo bizFinderPigeonInfo = (BizFinderPigeonInfo) ((ArrayList) obj).get(0);
                    if (bizFinderPigeonInfo != null) {
                        bizApi.openFinderContact(bizFinderPigeonInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: B */
            public static /* synthetic */ void m21662B(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        hashMap.put("result", bizApi.isFinderContactFollow(str));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("finderUsernameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: C */
            public static /* synthetic */ void m21663C(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                    if (bool != null) {
                        bizApi.getBizFinderLivesInfo(bool, new Result<List<BizFinderLiveInfo>>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(List<BizFinderLiveInfo> list) {
                                this.val$wrapped.put("result", list);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("bizFinderLiveRedDotArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: D */
            public static /* synthetic */ void m21664D(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    List list = (List) ((ArrayList) obj).get(0);
                    if (list != null) {
                        bizApi.saveFinderLivesInfoBatch(list, new Result<Void>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(Void voidR) {
                                this.val$wrapped.put("result", (Object) null);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("infosArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: E */
            public static /* synthetic */ void m21665E(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    List list = (List) ((ArrayList) obj).get(0);
                    if (list != null) {
                        bizApi.updateBizFinderLivesInfo(list, new Result<List<BizFinderLiveInfo>>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(List<BizFinderLiveInfo> list) {
                                this.val$wrapped.put("result", list);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("usernameListArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: F */
            public static /* synthetic */ void m21666F(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        Number number = (Number) arrayList.get(1);
                        if (number != null) {
                            Number number2 = (Number) arrayList.get(2);
                            if (number2 != null) {
                                bizApi.addToPreload(str, Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("openSceneArg unexpectedly null.");
                        }
                        throw new NullPointerException("itemShowTypeArg unexpectedly null.");
                    }
                    throw new NullPointerException("urlArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: G */
            public static /* synthetic */ void m21667G(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        hashMap.put("result", bizApi.isPaid(str));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("urlArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: H */
            public static /* synthetic */ void m21668H(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            bizApi.setPayStatus(str, bool);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("isPaidArg unexpectedly null.");
                    }
                    throw new NullPointerException("urlArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: I */
            public static /* synthetic */ void m21669I(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    bizApi.onClickNotifyTips();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: J */
            public static /* synthetic */ void m21670J(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", bizApi.getNotifyTipsInfo());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: K */
            public static /* synthetic */ void m21671K(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    bizApi.doSearch();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: L */
            public static void m21673L(BinaryMessenger binaryMessenger, BizApi bizApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.gotoOldList", m21675a());
                if (bizApi != null) {
                    basicMessageChannel.setMessageHandler(new BizPigeon$BizApi$$a(bizApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.gotoProfile", m21675a());
                if (bizApi != null) {
                    basicMessageChannel2.setMessageHandler(new BizPigeon$BizApi$$c(bizApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.gotoFinder", m21675a());
                if (bizApi != null) {
                    basicMessageChannel3.setMessageHandler(new BizPigeon$BizApi$$o(bizApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.openUrl", m21675a());
                if (bizApi != null) {
                    basicMessageChannel4.setMessageHandler(new BizPigeon$BizApi$$y(bizApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.addToPreload", m21675a());
                if (bizApi != null) {
                    basicMessageChannel5.setMessageHandler(new BizPigeon$BizApi$$z(bizApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.isPaid", m21675a());
                if (bizApi != null) {
                    basicMessageChannel6.setMessageHandler(new BizPigeon$BizApi$$a0(bizApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.setPayStatus", m21675a());
                if (bizApi != null) {
                    basicMessageChannel7.setMessageHandler(new BizPigeon$BizApi$$b0(bizApi));
                } else {
                    basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.onClickNotifyTips", m21675a());
                if (bizApi != null) {
                    basicMessageChannel8.setMessageHandler(new BizPigeon$BizApi$$c0(bizApi));
                } else {
                    basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getNotifyTipsInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel9.setMessageHandler(new BizPigeon$BizApi$$k0(bizApi));
                } else {
                    basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.doSearch", m21675a());
                if (bizApi != null) {
                    basicMessageChannel10.setMessageHandler(new BizPigeon$BizApi$$l0(bizApi));
                } else {
                    basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.resetRedDot", m21675a());
                if (bizApi != null) {
                    basicMessageChannel11.setMessageHandler(new BizPigeon$BizApi$$l(bizApi));
                } else {
                    basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getUnReadCount", m21675a());
                if (bizApi != null) {
                    basicMessageChannel12.setMessageHandler(new BizPigeon$BizApi$$w(bizApi));
                } else {
                    basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.onExposed", m21675a());
                if (bizApi != null) {
                    basicMessageChannel13.setMessageHandler(new BizPigeon$BizApi$$d0(bizApi));
                } else {
                    basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getContactInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel14.setMessageHandler(new BizPigeon$BizApi$$e0(bizApi));
                } else {
                    basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getContactInfoBatch", m21675a());
                if (bizApi != null) {
                    basicMessageChannel15.setMessageHandler(new BizPigeon$BizApi$$f0(bizApi));
                } else {
                    basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getOftenReadAccountInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel16.setMessageHandler(new BizPigeon$BizApi$$g0(bizApi));
                } else {
                    basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getOftenReadAccountInfoBatch", m21675a());
                if (bizApi != null) {
                    basicMessageChannel17.setMessageHandler(new BizPigeon$BizApi$$h0(bizApi));
                } else {
                    basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getBizEnterStatusInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel18.setMessageHandler(new BizPigeon$BizApi$$i0(bizApi));
                } else {
                    basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getBizImgCacheDirectory", m21675a());
                if (bizApi != null) {
                    basicMessageChannel19.setMessageHandler(new BizPigeon$BizApi$$j0(bizApi));
                } else {
                    basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getCdnUrlList", m21675a());
                if (bizApi != null) {
                    basicMessageChannel20.setMessageHandler(new BizPigeon$BizApi$$b(bizApi));
                } else {
                    basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.deleteByTalker", m21675a());
                if (bizApi != null) {
                    basicMessageChannel21.setMessageHandler(new BizPigeon$BizApi$$d(bizApi));
                } else {
                    basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.deleteByMsgId", m21675a());
                if (bizApi != null) {
                    basicMessageChannel22.setMessageHandler(new BizPigeon$BizApi$$e(bizApi));
                } else {
                    basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.onExpand", m21675a());
                if (bizApi != null) {
                    basicMessageChannel23.setMessageHandler(new BizPigeon$BizApi$$f(bizApi));
                } else {
                    basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.gotoBizTestUI", m21675a());
                if (bizApi != null) {
                    basicMessageChannel24.setMessageHandler(new BizPigeon$BizApi$$g(bizApi));
                } else {
                    basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getMassSendData", m21675a());
                if (bizApi != null) {
                    basicMessageChannel25.setMessageHandler(new BizPigeon$BizApi$$h(bizApi));
                } else {
                    basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.onMinimizeArticle", m21675a());
                if (bizApi != null) {
                    basicMessageChannel26.setMessageHandler(new BizPigeon$BizApi$$i(bizApi));
                } else {
                    basicMessageChannel26.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel27 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.createMagicAdBrandService", m21675a());
                if (bizApi != null) {
                    basicMessageChannel27.setMessageHandler(new BizPigeon$BizApi$$j(bizApi));
                } else {
                    basicMessageChannel27.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel28 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.createMagicBrandService", m21675a());
                if (bizApi != null) {
                    basicMessageChannel28.setMessageHandler(new BizPigeon$BizApi$$k(bizApi));
                } else {
                    basicMessageChannel28.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel29 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.onMinimizeFinder", m21675a());
                if (bizApi != null) {
                    basicMessageChannel29.setMessageHandler(new BizPigeon$BizApi$$m(bizApi));
                } else {
                    basicMessageChannel29.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel30 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.launchBizFinderFeed", m21675a());
                if (bizApi != null) {
                    basicMessageChannel30.setMessageHandler(new BizPigeon$BizApi$$n(bizApi));
                } else {
                    basicMessageChannel30.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel31 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.unfollowFinderContact", m21675a());
                if (bizApi != null) {
                    basicMessageChannel31.setMessageHandler(new BizPigeon$BizApi$$p(bizApi));
                } else {
                    basicMessageChannel31.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel32 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.openFinderContact", m21675a());
                if (bizApi != null) {
                    basicMessageChannel32.setMessageHandler(new BizPigeon$BizApi$$q(bizApi));
                } else {
                    basicMessageChannel32.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel33 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.isFinderContactFollow", m21675a());
                if (bizApi != null) {
                    basicMessageChannel33.setMessageHandler(new BizPigeon$BizApi$$r(bizApi));
                } else {
                    basicMessageChannel33.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel34 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.getBizFinderLivesInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel34.setMessageHandler(new BizPigeon$BizApi$$s(bizApi));
                } else {
                    basicMessageChannel34.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel35 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.saveFinderLivesInfoBatch", m21675a());
                if (bizApi != null) {
                    basicMessageChannel35.setMessageHandler(new BizPigeon$BizApi$$t(bizApi));
                } else {
                    basicMessageChannel35.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel36 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.updateBizFinderLivesInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel36.setMessageHandler(new BizPigeon$BizApi$$u(bizApi));
                } else {
                    basicMessageChannel36.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel37 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.loadLocalOftenReadInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel37.setMessageHandler(new BizPigeon$BizApi$$v(bizApi));
                } else {
                    basicMessageChannel37.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel38 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.BizApi.saveLocalOftenReadInfo", m21675a());
                if (bizApi != null) {
                    basicMessageChannel38.setMessageHandler(new BizPigeon$BizApi$$x(bizApi));
                } else {
                    basicMessageChannel38.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }

            /* renamed from: M */
            public static /* synthetic */ void m21674M(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    byte[] bArr = (byte[]) ((ArrayList) obj).get(0);
                    if (bArr != null) {
                        bizApi.saveLocalOftenReadInfo(bArr, new Result<Void>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(Void voidR) {
                                this.val$wrapped.put("result", (Object) null);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("infoBufferArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: a */
            public static MessageCodec<Object> m21675a() {
                return BizApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m21676b(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            bizApi.gotoOldList(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("sourceArg unexpectedly null.");
                    }
                    throw new NullPointerException("sessionIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: c */
            public static /* synthetic */ void m21677c(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        Number number = (Number) arrayList.get(1);
                        if (number != null) {
                            Number number2 = (Number) arrayList.get(2);
                            if (number2 != null) {
                                bizApi.gotoProfile(str, Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("openArticleFromSceneArg unexpectedly null.");
                        }
                        throw new NullPointerException("addContactSceneArg unexpectedly null.");
                    }
                    throw new NullPointerException("userNameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m21678d(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    bizApi.resetRedDot();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: e */
            public static /* synthetic */ void m21679e(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", bizApi.getUnReadCount());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: f */
            public static /* synthetic */ void m21680f(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            Boolean bool = (Boolean) arrayList.get(2);
                            if (bool != null) {
                                Boolean bool2 = (Boolean) arrayList.get(3);
                                if (bool2 != null) {
                                    bizApi.onExposed(Long.valueOf(number.longValue()), str, bool, bool2);
                                    hashMap.put("result", (Object) null);
                                    reply.reply(hashMap);
                                    return;
                                }
                                throw new NullPointerException("publishEnterSessionArg unexpectedly null.");
                            }
                            throw new NullPointerException("isValidExposedArg unexpectedly null.");
                        }
                        throw new NullPointerException("userNameArg unexpectedly null.");
                    }
                    throw new NullPointerException("msgIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: g */
            public static /* synthetic */ void m21681g(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        hashMap.put("result", bizApi.getContactInfo(str));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("userNameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: h */
            public static /* synthetic */ void m21682h(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    List list = (List) ((ArrayList) obj).get(0);
                    if (list != null) {
                        bizApi.getContactInfoBatch(list, new Result<List<ContactInfo>>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(List<ContactInfo> list) {
                                this.val$wrapped.put("result", list);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("userNamesArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: i */
            public static /* synthetic */ void m21683i(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        bizApi.getOftenReadAccountInfo(str, new Result<OftenReadAccountInfo>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(OftenReadAccountInfo oftenReadAccountInfo) {
                                this.val$wrapped.put("result", oftenReadAccountInfo);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("userNameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: j */
            public static /* synthetic */ void m21684j(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    List list = (List) ((ArrayList) obj).get(0);
                    if (list != null) {
                        bizApi.getOftenReadAccountInfoBatch(list, new Result<Map<String, OftenReadAccountInfo>>(hashMap, reply) {
                            public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                            public final /* synthetic */ Map val$wrapped;

                            {
                                this.val$wrapped = r1;
                                this.val$reply = r2;
                            }

                            public void error(Throwable th) {
                                this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                this.val$reply.reply(this.val$wrapped);
                            }

                            public void success(Map<String, OftenReadAccountInfo> map) {
                                this.val$wrapped.put("result", map);
                                this.val$reply.reply(this.val$wrapped);
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("userNamesArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: k */
            public static /* synthetic */ void m21685k(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", bizApi.getBizEnterStatusInfo());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: l */
            public static /* synthetic */ void m21686l(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", bizApi.getBizImgCacheDirectory());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: m */
            public static /* synthetic */ void m21687m(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("result", bizApi.getCdnUrlList());
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: n */
            public static /* synthetic */ void m21688n(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizFinderJumpInfo bizFinderJumpInfo = (BizFinderJumpInfo) ((ArrayList) obj).get(0);
                    if (bizFinderJumpInfo != null) {
                        bizApi.gotoFinder(bizFinderJumpInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("jumpInfoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: o */
            public static /* synthetic */ void m21689o(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    String str = (String) ((ArrayList) obj).get(0);
                    if (str != null) {
                        hashMap.put("result", bizApi.deleteByTalker(str));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("userNameArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: p */
            public static /* synthetic */ void m21690p(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", bizApi.deleteByMsgId(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("msgIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: q */
            public static /* synthetic */ void m21691q(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", bizApi.onExpand(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("msgIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: r */
            public static /* synthetic */ void m21692r(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    bizApi.gotoBizTestUI();
                    hashMap.put("result", (Object) null);
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
                reply.reply(hashMap);
            }

            /* renamed from: s */
            public static /* synthetic */ void m21693s(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            Boolean bool2 = (Boolean) arrayList.get(2);
                            if (bool2 != null) {
                                bizApi.getMassSendData(Long.valueOf(number.longValue()), bool, bool2, new Result<List<MassSendCardMsg>>(hashMap, reply) {
                                    public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                                    public final /* synthetic */ Map val$wrapped;

                                    {
                                        this.val$wrapped = r1;
                                        this.val$reply = r2;
                                    }

                                    public void error(Throwable th) {
                                        this.val$wrapped.put("error", BizPigeon.wrapError(th));
                                        this.val$reply.reply(this.val$wrapped);
                                    }

                                    public void success(List<MassSendCardMsg> list) {
                                        this.val$wrapped.put("result", list);
                                        this.val$reply.reply(this.val$wrapped);
                                    }
                                });
                                return;
                            }
                            throw new NullPointerException("resetDataArg unexpectedly null.");
                        }
                        throw new NullPointerException("initDataArg unexpectedly null.");
                    }
                    throw new NullPointerException("lastOrderIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: t */
            public static /* synthetic */ void m21694t(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizMinimizeInfo bizMinimizeInfo = (BizMinimizeInfo) ((ArrayList) obj).get(0);
                    if (bizMinimizeInfo != null) {
                        bizApi.onMinimizeArticle(bizMinimizeInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: u */
            public static /* synthetic */ void m21695u(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        bizApi.createMagicAdBrandService(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("sceneArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: v */
            public static /* synthetic */ void m21696v(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        bizApi.createMagicBrandService(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("sceneArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: w */
            public static /* synthetic */ void m21697w(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizFinderPigeonInfo bizFinderPigeonInfo = (BizFinderPigeonInfo) ((ArrayList) obj).get(0);
                    if (bizFinderPigeonInfo != null) {
                        bizApi.onMinimizeFinder(bizFinderPigeonInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: x */
            public static /* synthetic */ void m21698x(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizFinderPigeonInfo bizFinderPigeonInfo = (BizFinderPigeonInfo) ((ArrayList) obj).get(0);
                    if (bizFinderPigeonInfo != null) {
                        bizApi.launchBizFinderFeed(bizFinderPigeonInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: y */
            public static /* synthetic */ void m21699y(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizArticleInfo bizArticleInfo = (BizArticleInfo) ((ArrayList) obj).get(0);
                    if (bizArticleInfo != null) {
                        bizApi.openUrl(bizArticleInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("articleInfoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: z */
            public static /* synthetic */ void m21700z(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    BizFinderPigeonInfo bizFinderPigeonInfo = (BizFinderPigeonInfo) ((ArrayList) obj).get(0);
                    if (bizFinderPigeonInfo != null) {
                        bizApi.unfollowFinderContact(bizFinderPigeonInfo);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("infoArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                }
            }

            /* renamed from: L */
            public static /* synthetic */ void m21672L(BizApi bizApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    bizApi.loadLocalOftenReadInfo(new Result<byte[]>(hashMap, reply) {
                        public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        public final /* synthetic */ Map val$wrapped;

                        {
                            this.val$wrapped = r1;
                            this.val$reply = r2;
                        }

                        public void error(Throwable th) {
                            this.val$wrapped.put("error", BizPigeon.wrapError(th));
                            this.val$reply.reply(this.val$wrapped);
                        }

                        public void success(byte[] bArr) {
                            this.val$wrapped.put("result", bArr);
                            this.val$reply.reply(this.val$wrapped);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", BizPigeon.wrapError(e));
                    reply.reply(hashMap);
                }
            }
        }
    }
}
