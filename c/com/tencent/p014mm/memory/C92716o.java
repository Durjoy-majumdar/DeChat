package com.tencent.p014mm.memory;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.ConcurrentSkipListMap;
import oa1.C117731d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.memory.o */
public class C92716o extends BucketPool<Bitmap, C92718b> {

    /* renamed from: d */
    public static C92716o f266827d = new C92716o();

    /* renamed from: com.tencent.mm.memory.o$a */
    public static class C92717a extends C92705d<Bitmap, C92718b> {
        public C92717a(C92718b bVar) {
            super(bVar);
        }
    }

    /* renamed from: com.tencent.mm.memory.o$b */
    public static class C92718b implements Comparable {

        /* renamed from: d */
        public int f266828d;

        /* renamed from: e */
        public int f266829e;

        /* renamed from: f */
        public String f266830f;

        public C92718b(int i, int i2) {
            this.f266828d = i;
            this.f266829e = i2;
            this.f266830f = String.format("SightBitmapSize: [%s, %s]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }

        public int compareTo(Object obj) {
            if (obj == null || !(obj instanceof C92718b)) {
                return 0;
            }
            int i = this.f266828d;
            C92718b bVar = (C92718b) obj;
            int i2 = bVar.f266828d;
            if (i == i2 && this.f266829e == bVar.f266829e) {
                return 0;
            }
            return i * this.f266829e > i2 * bVar.f266829e ? 1 : -1;
        }

        public String toString() {
            return this.f266830f;
        }
    }

    /* renamed from: b */
    public Object mo126891b(Comparable comparable) {
        C92718b bVar = (C92718b) comparable;
        return Bitmap.createBitmap(bVar.f266828d, bVar.f266829e, C92711k.f266814a);
    }

    /* renamed from: c */
    public void mo126892c() {
        try {
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_sight_bitmap_pool_free_all", "0", false, true), 0) == 1) {
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
            Log.printErrStackTrace("MicroMsg.SightBitmapPool", e, "", new Object[0]);
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

    /* renamed from: f */
    public Comparable mo126895f(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return new C92718b(bitmap.getWidth(), bitmap.getHeight());
    }

    /* renamed from: g */
    public long mo126896g() {
        return 307200;
    }

    /* renamed from: h */
    public long mo126897h() {
        return 1228800;
    }

    /* renamed from: i */
    public Comparable mo126898i(Comparable comparable) {
        return (C92718b) comparable;
    }

    /* renamed from: j */
    public C92705d mo126899j(Comparable comparable) {
        return new C92717a((C92718b) comparable);
    }

    /* renamed from: l */
    public synchronized Bitmap mo126927l(C92718b bVar) {
        Bitmap bitmap;
        bitmap = (Bitmap) mo126893d(bVar);
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = Bitmap.createBitmap(bVar.f266828d, bVar.f266829e, C92711k.f266814a);
        }
        return bitmap;
    }

    /* renamed from: m */
    public synchronized void mo126928m(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                mo126900k(bitmap);
                try {
                    if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_sight_bitmap_pool_recycle", "0", false, true), 0) == 1) {
                        bitmap.recycle();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SightBitmapPool", e, "", new Object[0]);
                }
            }
        }
        return;
    }
}
