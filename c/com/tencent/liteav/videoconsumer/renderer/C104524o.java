package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.o */
final /* synthetic */ class C104524o implements Runnable {

    /* renamed from: a */
    private final C17383i f309818a;

    /* renamed from: b */
    private final ByteBuffer f309819b;

    /* renamed from: c */
    private final int f309820c;

    /* renamed from: d */
    private final int f309821d;

    /* renamed from: e */
    private final Matrix f309822e;

    /* renamed from: f */
    private final TakeSnapshotListener f309823f;

    public C104524o(C17383i iVar, ByteBuffer byteBuffer, int i, int i2, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        this.f309818a = iVar;
        this.f309819b = byteBuffer;
        this.f309820c = i;
        this.f309821d = i2;
        this.f309822e = matrix;
        this.f309823f = takeSnapshotListener;
    }

    public final void run() {
        ByteBuffer byteBuffer = this.f309819b;
        int i = this.f309820c;
        int i2 = this.f309821d;
        Matrix matrix = this.f309822e;
        TakeSnapshotListener takeSnapshotListener = this.f309823f;
        try {
            byteBuffer.position(0);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            if (matrix == null) {
                matrix = new Matrix();
            }
            matrix.postScale(1.0f, -1.0f, ((float) i) / 2.0f, ((float) i2) / 2.0f);
            createBitmap.getConfig();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            new Canvas(createBitmap2).drawBitmap(createBitmap, matrix, paint);
            takeSnapshotListener.onComplete(createBitmap2);
        } catch (Throwable th) {
            LiteavLog.m16899e("VideoRenderer", "build snapshot bitmap failed.", th);
            takeSnapshotListener.onComplete((Bitmap) null);
        }
    }
}
