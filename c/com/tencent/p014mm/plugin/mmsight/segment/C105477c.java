package com.tencent.p014mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.c */
public interface C105477c {

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.c$a */
    public static class C105478a {

        /* renamed from: a */
        public LinkedBlockingQueue<C105477c> f313680a;

        /* renamed from: b */
        public volatile int f313681b = 0;

        /* renamed from: c */
        public final int f313682c;

        /* renamed from: d */
        public Callable<C105477c> f313683d;

        /* renamed from: e */
        public Lock f313684e = new ReentrantLock();

        public C105478a(int i, Callable<C105477c> callable) {
            this.f313682c = i;
            this.f313680a = new LinkedBlockingQueue<>(i);
            this.f313683d = callable;
        }

        /* renamed from: a */
        public C105477c mo150274a() {
            C105477c cVar;
            long currentTicks = Util.currentTicks();
            Log.m105918d("FetcherPool", "acquireFetcher");
            if (this.f313680a == null) {
                Log.m105918d("FetcherPool", "acquireFetcher no pool directly return null");
                return null;
            }
            ((ReentrantLock) this.f313684e).lock();
            Log.m105919d("FetcherPool", "pool.size() %d, size %d, maxFetcherSize %d", Integer.valueOf(this.f313680a.size()), Integer.valueOf(this.f313681b), Integer.valueOf(this.f313682c));
            LinkedBlockingQueue<C105477c> linkedBlockingQueue = this.f313680a;
            if (linkedBlockingQueue == null) {
                ((ReentrantLock) this.f313684e).unlock();
                return null;
            }
            if (!linkedBlockingQueue.isEmpty() || this.f313681b >= this.f313682c) {
                Log.m105918d("FetcherPool", "waiting fetcher");
                ((ReentrantLock) this.f313684e).unlock();
                cVar = this.f313680a.poll(5, TimeUnit.SECONDS);
            } else {
                Log.m105918d("FetcherPool", "new fetcher");
                this.f313681b++;
                ((ReentrantLock) this.f313684e).unlock();
                if (this.f313683d != null) {
                    long currentTicks2 = Util.currentTicks();
                    try {
                        cVar = this.f313683d.call();
                        Log.m105919d("FetcherPool", "time flee, construct fetcher instance cost %d", Long.valueOf(Util.ticksToNow(currentTicks2)));
                    } catch (Exception e) {
                        Log.printErrStackTrace("FetcherPool", e, " fetcher generater call error %s", e.getMessage());
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("fetcher generator can not be null.");
                }
            }
            Log.m105919d("FetcherPool", "time flee, acquireFetcher cost time %d", Long.valueOf(Util.ticksToNow(currentTicks)));
            return cVar;
        }

        /* renamed from: b */
        public void mo150275b() {
            if (this.f313680a != null) {
                ((ReentrantLock) this.f313684e).lock();
                LinkedBlockingQueue<C105477c> linkedBlockingQueue = this.f313680a;
                if (linkedBlockingQueue == null) {
                    ((ReentrantLock) this.f313684e).unlock();
                    return;
                }
                try {
                    Iterator<C105477c> it = linkedBlockingQueue.iterator();
                    while (it.hasNext()) {
                        it.next().release();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("FetcherPool", e, "destroy fetcher %s", e.getMessage());
                } catch (Throwable th) {
                    this.f313680a = null;
                    ((ReentrantLock) this.f313684e).unlock();
                    throw th;
                }
                this.f313680a = null;
                ((ReentrantLock) this.f313684e).unlock();
            }
        }

        /* renamed from: c */
        public void mo150276c(C105477c cVar) {
            Log.m105918d("FetcherPool", "reuseFetcher");
            if (cVar == null) {
                Log.m105920e("FetcherPool", "Null object can not be reused.");
                return;
            }
            LinkedBlockingQueue<C105477c> linkedBlockingQueue = this.f313680a;
            if (linkedBlockingQueue == null) {
                cVar.release();
            } else if (!linkedBlockingQueue.contains(cVar)) {
                this.f313680a.offer(cVar);
            } else {
                throw new IllegalStateException("fetcher already in pool");
            }
        }
    }

    int getDurationMs();

    Bitmap getFrameAtTime(long j);

    int getScaledHeight();

    int getScaledWidth();

    void init(String str, int i, int i2, int i3);

    void release();

    void reuseBitmap(Bitmap bitmap);
}
