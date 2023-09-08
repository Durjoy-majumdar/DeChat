package com.google.protobuf;

/* renamed from: com.google.protobuf.j1 */
public interface C23845j1 extends C23848k1 {

    /* renamed from: com.google.protobuf.j1$a */
    public interface C23846a extends C23848k1, Cloneable {
        C23845j1 build();

        C23845j1 buildPartial();

        C23846a mergeFrom(C23845j1 j1Var);

        C23846a mergeFrom(C23856l lVar, C23806a0 a0Var);
    }

    C24062w1<? extends C23845j1> getParserForType();

    int getSerializedSize();

    C23846a newBuilderForType();

    C23846a toBuilder();

    byte[] toByteArray();

    C16994k toByteString();

    void writeTo(C23897n nVar);
}
