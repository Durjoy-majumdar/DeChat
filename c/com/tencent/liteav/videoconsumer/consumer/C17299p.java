package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videoconsumer.decoder.C17326ao;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.renderer.C17380g;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.p */
final /* synthetic */ class C17299p implements Runnable {

    /* renamed from: a */
    private final C17286j f46872a;

    /* renamed from: b */
    private final SnapshotSourceType f46873b;

    /* renamed from: c */
    private final TakeSnapshotListener f46874c;

    private C17299p(C17286j jVar, SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        this.f46872a = jVar;
        this.f46873b = snapshotSourceType;
        this.f46874c = takeSnapshotListener;
    }

    /* renamed from: a */
    public static Runnable m17209a(C17286j jVar, SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        return new C17299p(jVar, snapshotSourceType, takeSnapshotListener);
    }

    public final void run() {
        C17380g gVar;
        C17286j jVar = this.f46872a;
        SnapshotSourceType snapshotSourceType = this.f46873b;
        TakeSnapshotListener takeSnapshotListener = this.f46874c;
        String str = jVar.f46828a;
        LiteavLog.m16901i(str, "takeSnapshot: sourceType = " + snapshotSourceType + ", listener = " + takeSnapshotListener);
        if (snapshotSourceType == SnapshotSourceType.STREAM) {
            VideoDecodeController videoDecodeController = jVar.f46833f;
            if (videoDecodeController != null) {
                videoDecodeController.mo20376a((Runnable) new C17326ao(videoDecodeController, takeSnapshotListener));
            }
        } else if (snapshotSourceType != SnapshotSourceType.VIEW) {
        } else {
            if (jVar.f46836i == null || (gVar = jVar.f46831d) == null) {
                C17380g gVar2 = jVar.f46832e;
                if (gVar2 != null) {
                    gVar2.mo20305a(takeSnapshotListener);
                    return;
                }
                LiteavLog.m16905w(jVar.f46828a, "takeSnapshot return null, no match render.");
                if (takeSnapshotListener != null) {
                    takeSnapshotListener.onComplete((Bitmap) null);
                    return;
                }
                return;
            }
            gVar.mo20305a(takeSnapshotListener);
        }
    }
}
