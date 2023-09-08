package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.r */
final /* synthetic */ class C17390r implements Runnable {

    /* renamed from: a */
    private final C17383i f47168a;

    /* renamed from: b */
    private final TakeSnapshotListener f47169b;

    private C17390r(C17383i iVar, TakeSnapshotListener takeSnapshotListener) {
        this.f47168a = iVar;
        this.f47169b = takeSnapshotListener;
    }

    /* renamed from: a */
    public static Runnable m17397a(C17383i iVar, TakeSnapshotListener takeSnapshotListener) {
        return new C17390r(iVar, takeSnapshotListener);
    }

    public final void run() {
        C17383i iVar = this.f47168a;
        TakeSnapshotListener takeSnapshotListener = this.f47169b;
        LiteavLog.m16901i("VideoRenderer", "takeSnapshot ");
        iVar.f47145s = takeSnapshotListener;
    }
}
