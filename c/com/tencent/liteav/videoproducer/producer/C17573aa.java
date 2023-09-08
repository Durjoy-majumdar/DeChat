package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;

/* renamed from: com.tencent.liteav.videoproducer.producer.aa */
final /* synthetic */ class C17573aa implements Runnable {

    /* renamed from: a */
    private final C17604f f47794a;

    /* renamed from: b */
    private final SnapshotSourceType f47795b;

    /* renamed from: c */
    private final TakeSnapshotListener f47796c;

    private C17573aa(C17604f fVar, SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        this.f47794a = fVar;
        this.f47795b = snapshotSourceType;
        this.f47796c = takeSnapshotListener;
    }

    /* renamed from: a */
    public static Runnable m17771a(C17604f fVar, SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        return new C17573aa(fVar, snapshotSourceType, takeSnapshotListener);
    }

    public final void run() {
        C17604f.m17840a(this.f47794a, this.f47795b, this.f47796c);
    }
}
