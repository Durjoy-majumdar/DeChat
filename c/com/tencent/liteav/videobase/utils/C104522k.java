package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videobase.utils.k */
final /* synthetic */ class C104522k implements Runnable {

    /* renamed from: a */
    private final ByteBuffer f309808a;

    /* renamed from: b */
    private final int f309809b;

    /* renamed from: c */
    private final int f309810c;

    /* renamed from: d */
    private final TakeSnapshotListener f309811d;

    private C104522k(ByteBuffer byteBuffer, int i, int i2, TakeSnapshotListener takeSnapshotListener) {
        this.f309808a = byteBuffer;
        this.f309809b = i;
        this.f309810c = i2;
        this.f309811d = takeSnapshotListener;
    }

    /* renamed from: a */
    public static Runnable m139839a(ByteBuffer byteBuffer, int i, int i2, TakeSnapshotListener takeSnapshotListener) {
        return new C104522k(byteBuffer, i, i2, takeSnapshotListener);
    }

    public final void run() {
        ByteBuffer byteBuffer = this.f309808a;
        int i = this.f309809b;
        int i2 = this.f309810c;
        TakeSnapshotListener takeSnapshotListener = this.f309811d;
        byteBuffer.position(0);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        takeSnapshotListener.onComplete(createBitmap);
    }
}
