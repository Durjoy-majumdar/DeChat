package com.tencent.p014mm.memory;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.memory.n */
public class C92714n implements C92709i {

    /* renamed from: d */
    public Bitmap f266818d = null;

    /* renamed from: e */
    public MMHandler f266819e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public boolean f266820f = false;

    /* renamed from: g */
    public AtomicInteger f266821g;

    /* renamed from: h */
    public boolean f266822h;

    /* renamed from: i */
    public Runnable f266823i;

    /* renamed from: j */
    public int f266824j;

    /* renamed from: n */
    public int f266825n;

    /* renamed from: com.tencent.mm.memory.n$a */
    public class C92715a implements Runnable {
        public C92715a() {
        }

        public void run() {
            C92714n.this.mo126923f();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C92714n(Bitmap bitmap) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f266821g = atomicInteger;
        this.f266822h = true;
        this.f266823i = new C92715a();
        this.f266824j = 0;
        this.f266825n = 0;
        this.f266818d = bitmap;
        atomicInteger.set(1);
        this.f266820f = false;
        mo126921d();
    }

    /* renamed from: c */
    public static C92714n m116851c(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C92714n(bitmap);
    }

    /* renamed from: a */
    public void mo126909a() {
        this.f266821g.incrementAndGet();
    }

    /* renamed from: b */
    public void mo126910b() {
        if (this.f266821g.get() > 0) {
            this.f266821g.decrementAndGet();
            if (this.f266821g.get() >= 0) {
                this.f266819e.removeCallbacks(this.f266823i);
                this.f266819e.postDelayed(this.f266823i, 500);
            }
        }
    }

    /* renamed from: d */
    public final int mo126921d() {
        if (C11171e.m11044a(19)) {
            Bitmap bitmap = this.f266818d;
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105924i("MicroMsg.ReleasableBitmap", "getByteCount recycle " + this.f266824j + " " + toString());
                return this.f266824j;
            }
            int byteCount = this.f266818d.getByteCount();
            this.f266824j = byteCount;
            return byteCount;
        }
        Bitmap bitmap2 = this.f266818d;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            Log.m105924i("MicroMsg.ReleasableBitmap", "getAllocationByteCount recycle " + this.f266825n + " " + toString());
            return this.f266825n;
        }
        int allocationByteCount = this.f266818d.getAllocationByteCount();
        this.f266825n = allocationByteCount;
        return allocationByteCount;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f266818d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo126922e() {
        /*
            r1 = this;
            boolean r0 = r1.f266820f
            if (r0 != 0) goto L_0x0011
            android.graphics.Bitmap r0 = r1.f266818d
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92714n.mo126922e():boolean");
    }

    /* renamed from: f */
    public final boolean mo126923f() {
        if (this.f266820f || this.f266821g.get() > 0) {
            return false;
        }
        this.f266820f = true;
        if (this.f266822h) {
            C92712l.m116840c().mo126912d(this.f266818d);
        }
        return true;
    }

    public void finalize() {
    }

    public String toString() {
        return super.toString();
    }
}
