package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import com.tencent.trtc.TRTCCloudListener;

/* renamed from: com.tencent.liteav.trtc.b */
final /* synthetic */ class C17187b implements Runnable {

    /* renamed from: a */
    private final TRTCCloudListener.TRTCSnapshotListener f46448a;

    /* renamed from: b */
    private final Bitmap f46449b;

    private C17187b(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        this.f46448a = tRTCSnapshotListener;
        this.f46449b = bitmap;
    }

    /* renamed from: a */
    public static Runnable m17024a(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        return new C17187b(tRTCSnapshotListener, bitmap);
    }

    public final void run() {
        TrtcCloudJni.lambda$onSnapshotComplete$1(this.f46448a, this.f46449b);
    }
}
