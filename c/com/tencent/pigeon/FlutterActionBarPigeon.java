package com.tencent.pigeon;

import android.util.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
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

public class FlutterActionBarPigeon {

    public static class FlutterActionBarCallback {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public FlutterActionBarCallback(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return FlutterActionBarCallbackCodec.INSTANCE;
        }

        public void setShowFlutterActionBar(Boolean bool, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterActionBarCallback.setShowFlutterActionBar", getCodec()).send(new ArrayList(Arrays.asList(new Boolean[]{bool})), new FlutterActionBarPigeon$FlutterActionBarCallback$$b(reply));
        }

        public void updateHostActionBar(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterActionBarCallback.updateHostActionBar", getCodec()).send(null, new FlutterActionBarPigeon$FlutterActionBarCallback$$a(reply));
        }
    }

    public static class FlutterActionBarCallbackCodec extends StandardMessageCodec {
        public static final FlutterActionBarCallbackCodec INSTANCE = new FlutterActionBarCallbackCodec();

        private FlutterActionBarCallbackCodec() {
        }
    }

    public static class FlutterActionBarConfig {
        private FlutterActionBarIconConfig leftItem;
        private FlutterActionBarIconConfig rightItem;
        private Boolean showPlatform;
        private FlutterActionBarTitleConfig titleConfig;

        public static final class Builder {
            private FlutterActionBarIconConfig leftItem;
            private FlutterActionBarIconConfig rightItem;
            private Boolean showPlatform;
            private FlutterActionBarTitleConfig titleConfig;

            public FlutterActionBarConfig build() {
                FlutterActionBarConfig flutterActionBarConfig = new FlutterActionBarConfig();
                flutterActionBarConfig.setShowPlatform(this.showPlatform);
                flutterActionBarConfig.setTitleConfig(this.titleConfig);
                flutterActionBarConfig.setLeftItem(this.leftItem);
                flutterActionBarConfig.setRightItem(this.rightItem);
                return flutterActionBarConfig;
            }

            public Builder setLeftItem(FlutterActionBarIconConfig flutterActionBarIconConfig) {
                this.leftItem = flutterActionBarIconConfig;
                return this;
            }

            public Builder setRightItem(FlutterActionBarIconConfig flutterActionBarIconConfig) {
                this.rightItem = flutterActionBarIconConfig;
                return this;
            }

            public Builder setShowPlatform(Boolean bool) {
                this.showPlatform = bool;
                return this;
            }

            public Builder setTitleConfig(FlutterActionBarTitleConfig flutterActionBarTitleConfig) {
                this.titleConfig = flutterActionBarTitleConfig;
                return this;
            }
        }

        public static FlutterActionBarConfig fromMap(Map<String, Object> map) {
            FlutterActionBarConfig flutterActionBarConfig = new FlutterActionBarConfig();
            flutterActionBarConfig.setShowPlatform((Boolean) map.get("showPlatform"));
            Object obj = map.get("titleConfig");
            FlutterActionBarIconConfig flutterActionBarIconConfig = null;
            flutterActionBarConfig.setTitleConfig(obj == null ? null : FlutterActionBarTitleConfig.fromMap((Map) obj));
            Object obj2 = map.get("leftItem");
            flutterActionBarConfig.setLeftItem(obj2 == null ? null : FlutterActionBarIconConfig.fromMap((Map) obj2));
            Object obj3 = map.get("rightItem");
            if (obj3 != null) {
                flutterActionBarIconConfig = FlutterActionBarIconConfig.fromMap((Map) obj3);
            }
            flutterActionBarConfig.setRightItem(flutterActionBarIconConfig);
            return flutterActionBarConfig;
        }

        public FlutterActionBarIconConfig getLeftItem() {
            return this.leftItem;
        }

        public FlutterActionBarIconConfig getRightItem() {
            return this.rightItem;
        }

        public Boolean getShowPlatform() {
            return this.showPlatform;
        }

        public FlutterActionBarTitleConfig getTitleConfig() {
            return this.titleConfig;
        }

        public void setLeftItem(FlutterActionBarIconConfig flutterActionBarIconConfig) {
            this.leftItem = flutterActionBarIconConfig;
        }

        public void setRightItem(FlutterActionBarIconConfig flutterActionBarIconConfig) {
            this.rightItem = flutterActionBarIconConfig;
        }

        public void setShowPlatform(Boolean bool) {
            this.showPlatform = bool;
        }

        public void setTitleConfig(FlutterActionBarTitleConfig flutterActionBarTitleConfig) {
            this.titleConfig = flutterActionBarTitleConfig;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("showPlatform", this.showPlatform);
            FlutterActionBarTitleConfig flutterActionBarTitleConfig = this.titleConfig;
            Map<String, Object> map = null;
            hashMap.put("titleConfig", flutterActionBarTitleConfig == null ? null : flutterActionBarTitleConfig.toMap());
            FlutterActionBarIconConfig flutterActionBarIconConfig = this.leftItem;
            hashMap.put("leftItem", flutterActionBarIconConfig == null ? null : flutterActionBarIconConfig.toMap());
            FlutterActionBarIconConfig flutterActionBarIconConfig2 = this.rightItem;
            if (flutterActionBarIconConfig2 != null) {
                map = flutterActionBarIconConfig2.toMap();
            }
            hashMap.put("rightItem", map);
            return hashMap;
        }
    }

    public interface FlutterActionBarHost {
        void updateConfig(FlutterActionBarConfig flutterActionBarConfig);
    }

    public static class FlutterActionBarHostCodec extends StandardMessageCodec {
        public static final FlutterActionBarHostCodec INSTANCE = new FlutterActionBarHostCodec();

        private FlutterActionBarHostCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return FlutterActionBarConfig.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return FlutterActionBarIconConfig.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FlutterActionBarTitleConfig.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterActionBarConfig) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterActionBarConfig) obj).toMap());
            } else if (obj instanceof FlutterActionBarIconConfig) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FlutterActionBarIconConfig) obj).toMap());
            } else if (obj instanceof FlutterActionBarTitleConfig) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FlutterActionBarTitleConfig) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class FlutterActionBarIconConfig {
        private Long iconColor;
        private Long iconId;
        private String text;
        private Long type;

        public static final class Builder {
            private Long iconColor;
            private Long iconId;
            private String text;
            private Long type;

            public FlutterActionBarIconConfig build() {
                FlutterActionBarIconConfig flutterActionBarIconConfig = new FlutterActionBarIconConfig();
                flutterActionBarIconConfig.setIconId(this.iconId);
                flutterActionBarIconConfig.setType(this.type);
                flutterActionBarIconConfig.setIconColor(this.iconColor);
                flutterActionBarIconConfig.setText(this.text);
                return flutterActionBarIconConfig;
            }

            public Builder setIconColor(Long l) {
                this.iconColor = l;
                return this;
            }

            public Builder setIconId(Long l) {
                this.iconId = l;
                return this;
            }

            public Builder setText(String str) {
                this.text = str;
                return this;
            }

            public Builder setType(Long l) {
                this.type = l;
                return this;
            }
        }

        public static FlutterActionBarIconConfig fromMap(Map<String, Object> map) {
            Long l;
            Long l2;
            FlutterActionBarIconConfig flutterActionBarIconConfig = new FlutterActionBarIconConfig();
            Object obj = map.get("iconId");
            Long l3 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterActionBarIconConfig.setIconId(l);
            Object obj2 = map.get("type");
            if (obj2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            flutterActionBarIconConfig.setType(l2);
            Object obj3 = map.get("iconColor");
            if (obj3 != null) {
                l3 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            flutterActionBarIconConfig.setIconColor(l3);
            flutterActionBarIconConfig.setText((String) map.get(MimeTypes.BASE_TYPE_TEXT));
            return flutterActionBarIconConfig;
        }

        public Long getIconColor() {
            return this.iconColor;
        }

        public Long getIconId() {
            return this.iconId;
        }

        public String getText() {
            return this.text;
        }

        public Long getType() {
            return this.type;
        }

        public void setIconColor(Long l) {
            this.iconColor = l;
        }

        public void setIconId(Long l) {
            this.iconId = l;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setType(Long l) {
            this.type = l;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("iconId", this.iconId);
            hashMap.put("type", this.type);
            hashMap.put("iconColor", this.iconColor);
            hashMap.put(MimeTypes.BASE_TYPE_TEXT, this.text);
            return hashMap;
        }
    }

    public static class FlutterActionBarTitleConfig {
        private Long color;
        private String subTitile;
        private Long subTitleColor;
        private String text;

        public static final class Builder {
            private Long color;
            private String subTitile;
            private Long subTitleColor;
            private String text;

            public FlutterActionBarTitleConfig build() {
                FlutterActionBarTitleConfig flutterActionBarTitleConfig = new FlutterActionBarTitleConfig();
                flutterActionBarTitleConfig.setText(this.text);
                flutterActionBarTitleConfig.setColor(this.color);
                flutterActionBarTitleConfig.setSubTitile(this.subTitile);
                flutterActionBarTitleConfig.setSubTitleColor(this.subTitleColor);
                return flutterActionBarTitleConfig;
            }

            public Builder setColor(Long l) {
                this.color = l;
                return this;
            }

            public Builder setSubTitile(String str) {
                this.subTitile = str;
                return this;
            }

            public Builder setSubTitleColor(Long l) {
                this.subTitleColor = l;
                return this;
            }

            public Builder setText(String str) {
                this.text = str;
                return this;
            }
        }

        public static FlutterActionBarTitleConfig fromMap(Map<String, Object> map) {
            Long l;
            FlutterActionBarTitleConfig flutterActionBarTitleConfig = new FlutterActionBarTitleConfig();
            flutterActionBarTitleConfig.setText((String) map.get(MimeTypes.BASE_TYPE_TEXT));
            Object obj = map.get("color");
            Long l2 = null;
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterActionBarTitleConfig.setColor(l);
            flutterActionBarTitleConfig.setSubTitile((String) map.get("subTitile"));
            Object obj2 = map.get("subTitleColor");
            if (obj2 != null) {
                l2 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            flutterActionBarTitleConfig.setSubTitleColor(l2);
            return flutterActionBarTitleConfig;
        }

        public Long getColor() {
            return this.color;
        }

        public String getSubTitile() {
            return this.subTitile;
        }

        public Long getSubTitleColor() {
            return this.subTitleColor;
        }

        public String getText() {
            return this.text;
        }

        public void setColor(Long l) {
            this.color = l;
        }

        public void setSubTitile(String str) {
            this.subTitile = str;
        }

        public void setSubTitleColor(Long l) {
            this.subTitleColor = l;
        }

        public void setText(String str) {
            this.text = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(MimeTypes.BASE_TYPE_TEXT, this.text);
            hashMap.put("color", this.color);
            hashMap.put("subTitile", this.subTitile);
            hashMap.put("subTitleColor", this.subTitleColor);
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
