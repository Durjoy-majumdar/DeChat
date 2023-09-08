package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterMMKVSlotPigeon {

    public interface FlutterMMKVSlotHost {
        Boolean getBool(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Boolean bool);

        byte[] getBytes(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str);

        Long getInt(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Long l);

        String getString(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str);

        Map<String, String> getStringList(FlutterMMKVSlotInfo flutterMMKVSlotInfo, List<String> list);

        void putBool(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Boolean bool);

        void putBytes(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, byte[] bArr);

        void putInt(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Long l);

        void putString(FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, String str2);

        void putStringList(FlutterMMKVSlotInfo flutterMMKVSlotInfo, Map<String, String> map);
    }

    public static class FlutterMMKVSlotHostCodec extends StandardMessageCodec {
        public static final FlutterMMKVSlotHostCodec INSTANCE = new FlutterMMKVSlotHostCodec();

        private FlutterMMKVSlotHostCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : FlutterMMKVSlotInfo.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterMMKVSlotInfo) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterMMKVSlotInfo) obj).toMap());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public static class FlutterMMKVSlotInfo {
        private String recorderName;
        private Long slotSeconds;

        public static final class Builder {
            private String recorderName;
            private Long slotSeconds;

            public FlutterMMKVSlotInfo build() {
                FlutterMMKVSlotInfo flutterMMKVSlotInfo = new FlutterMMKVSlotInfo();
                flutterMMKVSlotInfo.setRecorderName(this.recorderName);
                flutterMMKVSlotInfo.setSlotSeconds(this.slotSeconds);
                return flutterMMKVSlotInfo;
            }

            public Builder setRecorderName(String str) {
                this.recorderName = str;
                return this;
            }

            public Builder setSlotSeconds(Long l) {
                this.slotSeconds = l;
                return this;
            }
        }

        private FlutterMMKVSlotInfo() {
        }

        public static FlutterMMKVSlotInfo fromMap(Map<String, Object> map) {
            Long l;
            FlutterMMKVSlotInfo flutterMMKVSlotInfo = new FlutterMMKVSlotInfo();
            flutterMMKVSlotInfo.setRecorderName((String) map.get("recorderName"));
            Object obj = map.get("slotSeconds");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterMMKVSlotInfo.setSlotSeconds(l);
            return flutterMMKVSlotInfo;
        }

        public String getRecorderName() {
            return this.recorderName;
        }

        public Long getSlotSeconds() {
            return this.slotSeconds;
        }

        public void setRecorderName(String str) {
            if (str != null) {
                this.recorderName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"recorderName\" is null.");
        }

        public void setSlotSeconds(Long l) {
            if (l != null) {
                this.slotSeconds = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"slotSeconds\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("recorderName", this.recorderName);
            hashMap.put("slotSeconds", this.slotSeconds);
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
