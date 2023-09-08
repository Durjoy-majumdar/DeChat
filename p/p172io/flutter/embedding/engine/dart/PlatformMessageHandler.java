package p172io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

/* renamed from: io.flutter.embedding.engine.dart.PlatformMessageHandler */
public interface PlatformMessageHandler {
    void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i, long j);

    void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer);
}
