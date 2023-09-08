package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterMemoryPigeon {

    public static class FlutterMemoryHost {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public FlutterMemoryHost(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return FlutterMemoryHostCodec.INSTANCE;
        }

        public void freeImageCache(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterMemoryHost.freeImageCache", getCodec()).send(null, new FlutterMemoryPigeon$FlutterMemoryHost$$a(reply));
        }
    }

    public static class FlutterMemoryHostCodec extends StandardMessageCodec {
        public static final FlutterMemoryHostCodec INSTANCE = new FlutterMemoryHostCodec();

        private FlutterMemoryHostCodec() {
        }
    }

    private static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
