package com.tencent.pigeon;

import android.util.Log;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterMMKVPigeon {

    public static class FlutterBoolRequest {
        private String key;
        private String name;
        private Boolean value;

        public static final class Builder {
            private String key;
            private String name;
            private Boolean value;

            public FlutterBoolRequest build() {
                FlutterBoolRequest flutterBoolRequest = new FlutterBoolRequest();
                flutterBoolRequest.setName(this.name);
                flutterBoolRequest.setKey(this.key);
                flutterBoolRequest.setValue(this.value);
                return flutterBoolRequest;
            }

            public Builder setKey(String str) {
                this.key = str;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setValue(Boolean bool) {
                this.value = bool;
                return this;
            }
        }

        private FlutterBoolRequest() {
        }

        public static FlutterBoolRequest fromMap(Map<String, Object> map) {
            FlutterBoolRequest flutterBoolRequest = new FlutterBoolRequest();
            flutterBoolRequest.setName((String) map.get("name"));
            flutterBoolRequest.setKey((String) map.get("key"));
            flutterBoolRequest.setValue((Boolean) map.get("value"));
            return flutterBoolRequest;
        }

        public String getKey() {
            return this.key;
        }

        public String getName() {
            return this.name;
        }

        public Boolean getValue() {
            return this.value;
        }

        public void setKey(String str) {
            if (str != null) {
                this.key = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"key\" is null.");
        }

        public void setName(String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setValue(Boolean bool) {
            if (bool != null) {
                this.value = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.name);
            hashMap.put("key", this.key);
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FlutterBoolResponse {
        private Boolean value;

        public static final class Builder {
            private Boolean value;

            public FlutterBoolResponse build() {
                FlutterBoolResponse flutterBoolResponse = new FlutterBoolResponse();
                flutterBoolResponse.setValue(this.value);
                return flutterBoolResponse;
            }

            public Builder setValue(Boolean bool) {
                this.value = bool;
                return this;
            }
        }

        private FlutterBoolResponse() {
        }

        public static FlutterBoolResponse fromMap(Map<String, Object> map) {
            FlutterBoolResponse flutterBoolResponse = new FlutterBoolResponse();
            flutterBoolResponse.setValue((Boolean) map.get("value"));
            return flutterBoolResponse;
        }

        public Boolean getValue() {
            return this.value;
        }

        public void setValue(Boolean bool) {
            if (bool != null) {
                this.value = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FlutterIntRequest {
        private String key;
        private String name;
        private Long value;

        public static final class Builder {
            private String key;
            private String name;
            private Long value;

            public FlutterIntRequest build() {
                FlutterIntRequest flutterIntRequest = new FlutterIntRequest();
                flutterIntRequest.setName(this.name);
                flutterIntRequest.setKey(this.key);
                flutterIntRequest.setValue(this.value);
                return flutterIntRequest;
            }

            public Builder setKey(String str) {
                this.key = str;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setValue(Long l) {
                this.value = l;
                return this;
            }
        }

        private FlutterIntRequest() {
        }

        public static FlutterIntRequest fromMap(Map<String, Object> map) {
            Long l;
            FlutterIntRequest flutterIntRequest = new FlutterIntRequest();
            flutterIntRequest.setName((String) map.get("name"));
            flutterIntRequest.setKey((String) map.get("key"));
            Object obj = map.get("value");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterIntRequest.setValue(l);
            return flutterIntRequest;
        }

        public String getKey() {
            return this.key;
        }

        public String getName() {
            return this.name;
        }

        public Long getValue() {
            return this.value;
        }

        public void setKey(String str) {
            if (str != null) {
                this.key = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"key\" is null.");
        }

        public void setName(String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setValue(Long l) {
            if (l != null) {
                this.value = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.name);
            hashMap.put("key", this.key);
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FlutterIntResponse {
        private Long value;

        public static final class Builder {
            private Long value;

            public FlutterIntResponse build() {
                FlutterIntResponse flutterIntResponse = new FlutterIntResponse();
                flutterIntResponse.setValue(this.value);
                return flutterIntResponse;
            }

            public Builder setValue(Long l) {
                this.value = l;
                return this;
            }
        }

        private FlutterIntResponse() {
        }

        public static FlutterIntResponse fromMap(Map<String, Object> map) {
            Long l;
            FlutterIntResponse flutterIntResponse = new FlutterIntResponse();
            Object obj = map.get("value");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            flutterIntResponse.setValue(l);
            return flutterIntResponse;
        }

        public Long getValue() {
            return this.value;
        }

        public void setValue(Long l) {
            if (l != null) {
                this.value = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public interface FlutterMMKVHost {
        FlutterBoolResponse getBool(FlutterBoolRequest flutterBoolRequest);

        FlutterIntResponse getInt(FlutterIntRequest flutterIntRequest);

        FlutterStringResponse getString(FlutterStringRequest flutterStringRequest);

        void putBool(FlutterBoolRequest flutterBoolRequest);

        void putInt(FlutterIntRequest flutterIntRequest);

        void putString(FlutterStringRequest flutterStringRequest);
    }

    public static class FlutterMMKVHostCodec extends StandardMessageCodec {
        public static final FlutterMMKVHostCodec INSTANCE = new FlutterMMKVHostCodec();

        private FlutterMMKVHostCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return FlutterBoolRequest.fromMap((Map) readValue(byteBuffer));
                case -127:
                    return FlutterBoolResponse.fromMap((Map) readValue(byteBuffer));
                case -126:
                    return FlutterIntRequest.fromMap((Map) readValue(byteBuffer));
                case -125:
                    return FlutterIntResponse.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_AUDIO_SAMPLE /*-124*/:
                    return FlutterStringRequest.fromMap((Map) readValue(byteBuffer));
                case ExportErrorStatus.END_WRITE_VIDEO_SAMPLE /*-123*/:
                    return FlutterStringResponse.fromMap((Map) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterBoolRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterBoolRequest) obj).toMap());
            } else if (obj instanceof FlutterBoolResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FlutterBoolResponse) obj).toMap());
            } else if (obj instanceof FlutterIntRequest) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((FlutterIntRequest) obj).toMap());
            } else if (obj instanceof FlutterIntResponse) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((FlutterIntResponse) obj).toMap());
            } else if (obj instanceof FlutterStringRequest) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((FlutterStringRequest) obj).toMap());
            } else if (obj instanceof FlutterStringResponse) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((FlutterStringResponse) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class FlutterStringRequest {
        private String key;
        private String name;
        private String value;

        public static final class Builder {
            private String key;
            private String name;
            private String value;

            public FlutterStringRequest build() {
                FlutterStringRequest flutterStringRequest = new FlutterStringRequest();
                flutterStringRequest.setName(this.name);
                flutterStringRequest.setKey(this.key);
                flutterStringRequest.setValue(this.value);
                return flutterStringRequest;
            }

            public Builder setKey(String str) {
                this.key = str;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setValue(String str) {
                this.value = str;
                return this;
            }
        }

        private FlutterStringRequest() {
        }

        public static FlutterStringRequest fromMap(Map<String, Object> map) {
            FlutterStringRequest flutterStringRequest = new FlutterStringRequest();
            flutterStringRequest.setName((String) map.get("name"));
            flutterStringRequest.setKey((String) map.get("key"));
            flutterStringRequest.setValue((String) map.get("value"));
            return flutterStringRequest;
        }

        public String getKey() {
            return this.key;
        }

        public String getName() {
            return this.name;
        }

        public String getValue() {
            return this.value;
        }

        public void setKey(String str) {
            if (str != null) {
                this.key = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"key\" is null.");
        }

        public void setName(String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setValue(String str) {
            if (str != null) {
                this.value = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.name);
            hashMap.put("key", this.key);
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    public static class FlutterStringResponse {
        private String value;

        public static final class Builder {
            private String value;

            public FlutterStringResponse build() {
                FlutterStringResponse flutterStringResponse = new FlutterStringResponse();
                flutterStringResponse.setValue(this.value);
                return flutterStringResponse;
            }

            public Builder setValue(String str) {
                this.value = str;
                return this;
            }
        }

        private FlutterStringResponse() {
        }

        public static FlutterStringResponse fromMap(Map<String, Object> map) {
            FlutterStringResponse flutterStringResponse = new FlutterStringResponse();
            flutterStringResponse.setValue((String) map.get("value"));
            return flutterStringResponse;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            if (str != null) {
                this.value = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("value", this.value);
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
