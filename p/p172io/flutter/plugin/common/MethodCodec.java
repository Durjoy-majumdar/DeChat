package p172io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* renamed from: io.flutter.plugin.common.MethodCodec */
public interface MethodCodec {
    Object decodeEnvelope(ByteBuffer byteBuffer);

    MethodCall decodeMethodCall(ByteBuffer byteBuffer);

    ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj);

    ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3);

    ByteBuffer encodeMethodCall(MethodCall methodCall);

    ByteBuffer encodeSuccessEnvelope(Object obj);
}
