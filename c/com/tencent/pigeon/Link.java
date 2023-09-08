package com.tencent.pigeon;

import android.util.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class Link {

    public interface LinkHandlerApi {
        void openLink(String str);

        void openWeAppLink(LinkWeAppJumpInfo linkWeAppJumpInfo);
    }

    public static class LinkHandlerApiCodec extends StandardMessageCodec {
        public static final LinkHandlerApiCodec INSTANCE = new LinkHandlerApiCodec();

        private LinkHandlerApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : LinkWeAppJumpInfo.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof LinkWeAppJumpInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((LinkWeAppJumpInfo) obj).toMap());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public static class LinkWeAppJumpInfo {
        private String appId;
        private Long appState;
        private Boolean isForbidSSignal;
        private String pagePath;
        private Long scene;
        private String sceneNote;
        private String shareKey;

        public static final class Builder {
            private String appId;
            private Long appState;
            private Boolean isForbidSSignal;
            private String pagePath;
            private Long scene;
            private String sceneNote;
            private String shareKey;

            public LinkWeAppJumpInfo build() {
                LinkWeAppJumpInfo linkWeAppJumpInfo = new LinkWeAppJumpInfo();
                linkWeAppJumpInfo.setAppId(this.appId);
                linkWeAppJumpInfo.setPagePath(this.pagePath);
                linkWeAppJumpInfo.setAppState(this.appState);
                linkWeAppJumpInfo.setIsForbidSSignal(this.isForbidSSignal);
                linkWeAppJumpInfo.setShareKey(this.shareKey);
                linkWeAppJumpInfo.setScene(this.scene);
                linkWeAppJumpInfo.setSceneNote(this.sceneNote);
                return linkWeAppJumpInfo;
            }

            public Builder setAppId(String str) {
                this.appId = str;
                return this;
            }

            public Builder setAppState(Long l) {
                this.appState = l;
                return this;
            }

            public Builder setIsForbidSSignal(Boolean bool) {
                this.isForbidSSignal = bool;
                return this;
            }

            public Builder setPagePath(String str) {
                this.pagePath = str;
                return this;
            }

            public Builder setScene(Long l) {
                this.scene = l;
                return this;
            }

            public Builder setSceneNote(String str) {
                this.sceneNote = str;
                return this;
            }

            public Builder setShareKey(String str) {
                this.shareKey = str;
                return this;
            }
        }

        public static LinkWeAppJumpInfo fromMap(Map<String, Object> map) {
            Long l;
            LinkWeAppJumpInfo linkWeAppJumpInfo = new LinkWeAppJumpInfo();
            linkWeAppJumpInfo.setAppId((String) map.get("appId"));
            linkWeAppJumpInfo.setPagePath((String) map.get("pagePath"));
            Object obj = map.get("appState");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            linkWeAppJumpInfo.setAppState(l);
            linkWeAppJumpInfo.setIsForbidSSignal((Boolean) map.get("isForbidSSignal"));
            linkWeAppJumpInfo.setShareKey((String) map.get("shareKey"));
            Object obj2 = map.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            linkWeAppJumpInfo.setScene(l2);
            linkWeAppJumpInfo.setSceneNote((String) map.get("sceneNote"));
            return linkWeAppJumpInfo;
        }

        public String getAppId() {
            return this.appId;
        }

        public Long getAppState() {
            return this.appState;
        }

        public Boolean getIsForbidSSignal() {
            return this.isForbidSSignal;
        }

        public String getPagePath() {
            return this.pagePath;
        }

        public Long getScene() {
            return this.scene;
        }

        public String getSceneNote() {
            return this.sceneNote;
        }

        public String getShareKey() {
            return this.shareKey;
        }

        public void setAppId(String str) {
            this.appId = str;
        }

        public void setAppState(Long l) {
            this.appState = l;
        }

        public void setIsForbidSSignal(Boolean bool) {
            this.isForbidSSignal = bool;
        }

        public void setPagePath(String str) {
            this.pagePath = str;
        }

        public void setScene(Long l) {
            this.scene = l;
        }

        public void setSceneNote(String str) {
            this.sceneNote = str;
        }

        public void setShareKey(String str) {
            this.shareKey = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("appId", this.appId);
            hashMap.put("pagePath", this.pagePath);
            hashMap.put("appState", this.appState);
            hashMap.put("isForbidSSignal", this.isForbidSSignal);
            hashMap.put("shareKey", this.shareKey);
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.scene);
            hashMap.put("sceneNote", this.sceneNote);
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
