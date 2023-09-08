package com.tencent.p014mm.plugin.appbrand.jsruntime;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.k */
public interface C83170k extends C40481j {
    /* renamed from: C0 */
    void mo115391C0(C83143a0 a0Var);

    /* renamed from: K0 */
    C83143a0 mo115394K0();

    /* renamed from: U0 */
    void mo115401U0(int i, ByteBuffer byteBuffer);

    /* renamed from: Z */
    int mo115404Z();

    void bufferStoreBindTo(long j, long j2);

    /* renamed from: k1 */
    ByteBuffer mo115416k1(int i, boolean z);

    void releaseDirectByteBuffer(ByteBuffer byteBuffer);

    boolean supportBufferStoreBindTo();
}
