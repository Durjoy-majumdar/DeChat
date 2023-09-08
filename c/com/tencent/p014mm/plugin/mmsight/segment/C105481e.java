package com.tencent.p014mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import p206nj.C76861g;
import p914oj.C89231c;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.e */
public class C105481e implements C105477c {

    /* renamed from: a */
    public MediaMetadataRetriever f313687a;

    /* renamed from: b */
    public int f313688b;

    /* renamed from: c */
    public int f313689c;

    /* renamed from: d */
    public Canvas f313690d = new Canvas();

    /* renamed from: e */
    public Matrix f313691e;

    /* renamed from: f */
    public Paint f313692f = new Paint(1);

    public int getDurationMs() {
        String extractMetadata = this.f313687a.extractMetadata(9);
        if (extractMetadata == null) {
            return 0;
        }
        try {
            return Integer.valueOf(extractMetadata).intValue();
        } catch (Exception e) {
            Log.m105921e("MediaCodecThumbFetcher", "getDuration error %s", e.getMessage());
            return 0;
        }
    }

    public Bitmap getFrameAtTime(long j) {
        Bitmap bitmap;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j * 1000;
        Bitmap frameAtTime = this.f313687a.getFrameAtTime(j2);
        Bitmap bitmap2 = null;
        if (frameAtTime == null) {
            Log.m105929w("MediaCodecThumbFetcher", "get frame fail at time:%s, rawBitmap is null", Long.valueOf(j2));
            return null;
        }
        int i = this.f313688b;
        int i2 = this.f313689c;
        if (!frameAtTime.isRecycled() && i > 0 && i2 > 0) {
            Log.m105919d("MediaCodecThumbFetcher", "scaleBitmap(60) largeBitmap(width : %d, height : %d)", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
            try {
                bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError e) {
                Log.m105921e("MediaCodecThumbFetcher", "%s OutOfMemory %s", C76861g.m92660c(), e.getMessage());
                System.gc();
                try {
                    bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                } catch (Exception e2) {
                    Log.m105921e("MediaCodecThumbFetcher", "%s try again Exception %s", C76861g.m92660c(), e2.getMessage());
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                if (this.f313691e == null) {
                    int width = frameAtTime.getWidth();
                    int height = frameAtTime.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.setTranslate(((float) (i - width)) / 2.0f, ((float) (i2 - height)) / 2.0f);
                    float f = (float) height;
                    float f2 = (float) width;
                    float f3 = (float) i2;
                    float f4 = (float) i;
                    float f5 = f / f2 > f3 / f4 ? f4 / f2 : f3 / f;
                    matrix.postScale(f5, f5, f4 / 2.0f, f3 / 2.0f);
                    this.f313691e = matrix;
                }
                this.f313690d.setBitmap(bitmap);
                this.f313690d.drawBitmap(frameAtTime, this.f313691e, this.f313692f);
                bitmap2 = bitmap;
            }
        }
        frameAtTime.recycle();
        Log.m105919d("MediaCodecThumbFetcher", "time flee : get video thumb bitmap cost time %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return bitmap2;
    }

    public int getScaledHeight() {
        return this.f313689c;
    }

    public int getScaledWidth() {
        return this.f313688b;
    }

    public void init(String str, int i, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(String.format(Locale.CHINA, "destination width and height error, width %d, height %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
        try {
            C89231c cVar = new C89231c();
            this.f313687a = cVar;
            cVar.setDataSource(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MediaCodecThumbFetcher", e, "init error:%s", e.getMessage());
        }
        this.f313688b = i2;
        this.f313689c = i3;
    }

    public void release() {
        MediaMetadataRetriever mediaMetadataRetriever = this.f313687a;
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.release();
        }
        this.f313691e = null;
        this.f313692f = null;
        this.f313690d = null;
    }

    public void reuseBitmap(Bitmap bitmap) {
    }
}
