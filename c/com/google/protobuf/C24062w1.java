package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.w1 */
public interface C24062w1<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream);

    MessageType parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var);

    MessageType parseFrom(C16994k kVar);

    MessageType parseFrom(C16994k kVar, C23806a0 a0Var);

    MessageType parseFrom(C23856l lVar);

    MessageType parseFrom(C23856l lVar, C23806a0 a0Var);

    MessageType parseFrom(InputStream inputStream);

    MessageType parseFrom(InputStream inputStream, C23806a0 a0Var);

    MessageType parseFrom(ByteBuffer byteBuffer);

    MessageType parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var);

    MessageType parseFrom(byte[] bArr);

    MessageType parseFrom(byte[] bArr, C23806a0 a0Var);

    MessageType parsePartialFrom(C23856l lVar, C23806a0 a0Var);
}
