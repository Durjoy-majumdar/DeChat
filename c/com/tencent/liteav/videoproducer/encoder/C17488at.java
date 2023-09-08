package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.base.TakeSnapshotListener;

/* renamed from: com.tencent.liteav.videoproducer.encoder.at */
public final /* synthetic */ class C17488at implements Runnable {

    /* renamed from: a */
    private final C17474ah f47469a;

    /* renamed from: b */
    private final TakeSnapshotListener f47470b;

    private C17488at(C17474ah ahVar, TakeSnapshotListener takeSnapshotListener) {
        this.f47469a = ahVar;
        this.f47470b = takeSnapshotListener;
    }

    /* renamed from: a */
    public static Runnable m17630a(C17474ah ahVar, TakeSnapshotListener takeSnapshotListener) {
        return new C17488at(ahVar, takeSnapshotListener);
    }

    public final void run() {
        C17474ah.m17571a(this.f47469a, this.f47470b);
    }
}
