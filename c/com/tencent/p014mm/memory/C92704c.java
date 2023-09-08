package com.tencent.p014mm.memory;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.concurrent.ConcurrentSkipListMap;
import oa1.C117731d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.memory.c */
public class C92704c extends C92702a<Bitmap> {

    /* renamed from: d */
    public static int f266808d = 20971520;

    /* renamed from: e */
    public static final C92704c f266809e = new C92704c();

    public C92704c() {
        int largeMemoryClass = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        Log.m105925i("MicroMsg.BitmapPool", "BitmapPool %dMB", Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass > 256) {
            f266808d = 20971520;
        } else if (largeMemoryClass > 128) {
            f266808d = 10485760;
        } else {
            f266808d = 5242880;
        }
        if (this.f266805b.size() > 0) {
            ThreadPool.post(new C92706e(this), "BucketPool_preload");
        }
    }

    /* renamed from: b */
    public Object mo126891b(Comparable comparable) {
        return Bitmap.createBitmap(1, ((Integer) comparable).intValue(), C92711k.f266814a);
    }

    /* renamed from: c */
    public void mo126892c() {
        try {
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_bitmap_pool_free_all", "0", false, true), 0) == 1) {
                synchronized (this.f266804a) {
                    for (Object next : ((ConcurrentSkipListMap) this.f266804a).keySet()) {
                        if (next != null && (next instanceof Bitmap) && !((Bitmap) next).isRecycled()) {
                            ((Bitmap) next).recycle();
                        }
                    }
                    ((ConcurrentSkipListMap) this.f266804a).clear();
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BitmapPool", e, "", new Object[0]);
        }
        super.mo126892c();
    }

    /* renamed from: e */
    public long mo126894e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return 0;
        }
        return (long) (C11171e.m11044a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount());
    }

    /* renamed from: g */
    public long mo126896g() {
        return 1048576;
    }

    /* renamed from: h */
    public long mo126897h() {
        return (long) f266808d;
    }

    /* renamed from: i */
    public Comparable mo126898i(Comparable comparable) {
        return Integer.valueOf(((Integer) comparable).intValue() * 4);
    }

    /* renamed from: j */
    public C92705d mo126899j(Comparable comparable) {
        return new C92703b(((Integer) comparable).intValue());
    }

    /* renamed from: n */
    public Integer mo126895f(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return Integer.valueOf(C11171e.m11044a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount());
    }
}
