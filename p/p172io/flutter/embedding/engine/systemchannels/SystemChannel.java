package p172io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.JSONMessageCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.SystemChannel */
public class SystemChannel {
    private static final String TAG = "SystemChannel";
    public final BasicMessageChannel<Object> channel;

    public SystemChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        Log.m165290v(TAG, "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.channel.send(hashMap);
    }
}
