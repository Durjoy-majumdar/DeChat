package com.tencent.p014mm.memory;

import com.tencent.p014mm.memory.BucketPool;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.tencent.mm.memory.e */
public class C92706e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BucketPool f266812d;

    public C92706e(BucketPool bucketPool) {
        this.f266812d = bucketPool;
    }

    public void run() {
        C92705d dVar;
        BucketPool bucketPool = this.f266812d;
        while (bucketPool.f266805b.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            BucketPool.C92701a remove = bucketPool.f266805b.remove(0);
            C92705d j = bucketPool.mo126899j(bucketPool.mo126898i(remove.mo126903c()));
            long b = remove.mo126902b();
            int a = remove.mo126901a();
            Log.m105925i("MicroMsg.BucketPool", "%s preload start preloadSize: %s sizeInBytes: %s  preLoadBytes: %s and nums: %s", bucketPool, remove.mo126903c(), bucketPool.mo126898i(remove.mo126903c()), Long.valueOf(b), Integer.valueOf(a));
            long j2 = 0;
            int i = 0;
            while (bucketPool.f266806c < bucketPool.mo126897h() && ((b <= 0 || j2 < b) && (a <= 0 || i < a))) {
                Object b2 = bucketPool.mo126891b(remove.mo126903c());
                ((ConcurrentLinkedQueue) j.f266810a).add(b2);
                j2 += bucketPool.mo126894e(b2);
                i++;
                long e = bucketPool.mo126894e(b2);
                synchronized (bucketPool) {
                    dVar = j;
                    bucketPool.f266806c += e;
                }
                j = dVar;
            }
            C92705d dVar2 = j;
            Log.m105919d("MicroMsg.BucketPool", "%s preload finished, put %d elements, used %dms", bucketPool, Integer.valueOf(((ConcurrentLinkedQueue) dVar2.f266810a).size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            ((ConcurrentSkipListMap) bucketPool.f266804a).put(bucketPool.mo126898i(remove.mo126903c()), dVar2);
        }
    }
}
