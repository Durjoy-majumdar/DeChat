package p172io.flutter.embedding.engine.systemchannels;

import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.JSONMethodCodec;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.embedding.engine.systemchannels.SkiaChannel */
public class SkiaChannel {
    private static final String TAG = "SkiaChannel";
    public final MethodChannel channel;

    public SkiaChannel(DartExecutor dartExecutor) {
        this.channel = new MethodChannel(dartExecutor, "flutter/skia", JSONMethodCodec.INSTANCE);
    }

    public void setResourceCacheMaxBytes(int i) {
        this.channel.invokeMethod("Skia.setResourceCacheMaxBytes", Integer.valueOf(i));
    }
}
