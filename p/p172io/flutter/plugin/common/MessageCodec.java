package p172io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* renamed from: io.flutter.plugin.common.MessageCodec */
public interface MessageCodec<T> {
    T decodeMessage(ByteBuffer byteBuffer);

    ByteBuffer encodeMessage(T t);
}
