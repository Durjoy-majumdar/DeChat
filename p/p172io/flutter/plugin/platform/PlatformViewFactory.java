package p172io.flutter.plugin.platform;

import android.content.Context;
import p172io.flutter.plugin.common.MessageCodec;

/* renamed from: io.flutter.plugin.platform.PlatformViewFactory */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    public abstract PlatformView create(Context context, int i, Object obj);

    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
