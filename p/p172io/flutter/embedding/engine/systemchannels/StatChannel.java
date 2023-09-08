package p172io.flutter.embedding.engine.systemchannels;

import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.JSONMethodCodec;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.embedding.engine.systemchannels.StatChannel */
public class StatChannel {
    private static final String TAG = "StatChannel";
    public final MethodChannel channel;

    public StatChannel(DartExecutor dartExecutor) {
        this.channel = new MethodChannel(dartExecutor, "flutter/data_stat", JSONMethodCodec.INSTANCE);
    }

    public void reportMemoryUsage() {
        this.channel.invokeMethod("MMDataStat.MemoryUsage", (Object) null);
    }
}
