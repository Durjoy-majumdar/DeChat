package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterExptPigeon {

    public interface FlutterExptHost {
        FlutterExptResponse get(FlutterExptRequest flutterExptRequest);
    }

    public static class FlutterExptHostCodec extends StandardMessageCodec {
        public static final FlutterExptHostCodec INSTANCE = new FlutterExptHostCodec();

        private FlutterExptHostCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : FlutterExptResponse.fromMap((Map) readValue(byteBuffer)) : FlutterExptRequest.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FlutterExptRequest) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FlutterExptRequest) obj).toMap());
            } else if (obj instanceof FlutterExptResponse) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((FlutterExptResponse) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    public static class FlutterExptRequest {
        private String key;

        public static final class Builder {
            private String key;

            public FlutterExptRequest build() {
                FlutterExptRequest flutterExptRequest = new FlutterExptRequest();
                flutterExptRequest.setKey(this.key);
                return flutterExptRequest;
            }

            public Builder setKey(String str) {
                this.key = str;
                return this;
            }
        }

        private FlutterExptRequest() {
        }

        public static FlutterExptRequest fromMap(Map<String, Object> map) {
            FlutterExptRequest flutterExptRequest = new FlutterExptRequest();
            flutterExptRequest.setKey((String) map.get("key"));
            return flutterExptRequest;
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String str) {
            if (str != null) {
                this.key = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"key\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("key", this.key);
            return hashMap;
        }
    }

    public static class FlutterExptResponse {
        private String result;

        public static final class Builder {
            private String result;

            public FlutterExptResponse build() {
                FlutterExptResponse flutterExptResponse = new FlutterExptResponse();
                flutterExptResponse.setResult(this.result);
                return flutterExptResponse;
            }

            public Builder setResult(String str) {
                this.result = str;
                return this;
            }
        }

        public static FlutterExptResponse fromMap(Map<String, Object> map) {
            FlutterExptResponse flutterExptResponse = new FlutterExptResponse();
            flutterExptResponse.setResult((String) map.get("result"));
            return flutterExptResponse;
        }

        public String getResult() {
            return this.result;
        }

        public void setResult(String str) {
            this.result = str;
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("result", this.result);
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
