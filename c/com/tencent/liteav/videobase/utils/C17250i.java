package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: com.tencent.liteav.videobase.utils.i */
public final class C17250i implements C17249g {

    /* renamed from: a */
    private final Deque<PixelFrame> f46627a = new LinkedList();

    /* renamed from: b */
    private int f46628b;

    public C17250i(int i) {
        this.f46628b = i;
    }

    /* renamed from: a */
    public final PixelFrame mo20217a() {
        PixelFrame pollFirst;
        synchronized (this) {
            pollFirst = this.f46627a.pollFirst();
        }
        return pollFirst;
    }

    /* renamed from: b */
    public final void mo20219b() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f46627a);
            this.f46627a.clear();
        }
        LiteavLog.m16901i("RingFrameQueue", "evictAll pixelFrame.");
        PixelFrame.releasePixelFrames(arrayList);
    }

    /* renamed from: c */
    public final int mo20227c() {
        int size;
        synchronized (this) {
            size = this.f46627a.size();
        }
        return size;
    }

    /* renamed from: a */
    public final void mo20218a(PixelFrame pixelFrame) {
        PixelFrame removeFirst;
        pixelFrame.retain();
        synchronized (this) {
            removeFirst = this.f46627a.size() >= this.f46628b ? this.f46627a.removeFirst() : null;
            this.f46627a.addLast(pixelFrame);
        }
        if (removeFirst != null) {
            removeFirst.release();
        }
    }

    /* renamed from: b */
    public final boolean mo20226b(PixelFrame pixelFrame) {
        boolean z = false;
        if (pixelFrame == null) {
            return false;
        }
        synchronized (this) {
            if (this.f46627a.size() > 0) {
                z = this.f46627a.removeFirstOccurrence(pixelFrame);
            }
        }
        if (z) {
            pixelFrame.release();
        }
        return z;
    }
}
