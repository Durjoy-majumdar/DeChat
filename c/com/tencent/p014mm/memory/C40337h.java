package com.tencent.p014mm.memory;

import com.tencent.p014mm.sdk.SynchronizedPool;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.memory.h */
public class C40337h extends SynchronizedPool<ByteBuffer> {

    /* renamed from: a */
    public static C40337h f108423a = new C40337h();

    /* renamed from: com.tencent.mm.memory.h$a */
    public class C40338a implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                C40337h.f108423a.putWithoutCheck(ByteBuffer.allocate(16384));
            }
        }
    }

    static {
        ThreadPool.post(new C40338a(), "DecodeTempStorage_preload");
    }

    public C40337h() {
        super(20);
    }
}
