package com.tencent.p014mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher */
public class FFmpegSightJNIThumbFetcher implements C105477c {
    private static final String TAG = "MicroMsg.FFmpegSightJNIThumbFetcher";
    private int mBufId;
    private int mDurationMs;
    private Bitmap mReusedBitmap;
    private int mScaledHeight;
    private int mScaledWidth;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher$ReleaseRunnable */
    public static class ReleaseRunnable implements Runnable {
        public int mBufId;
        public Bitmap mReusedBitmap;

        public void run() {
            Bitmap bitmap = this.mReusedBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                C92716o.f266827d.mo126928m(this.mReusedBitmap);
            }
            SightVideoJNI.freeObj(this.mBufId);
        }

        private ReleaseRunnable(Bitmap bitmap, int i) {
            this.mReusedBitmap = bitmap;
            this.mBufId = i;
        }
    }

    private Point calculateScaledLength(int i, int i2, int i3, int i4, Point point) {
        if (point == null) {
            throw new IllegalArgumentException("FFmpegThumbFetcherImpl : Point to calculateScaledLength can not be null.");
        } else if (i2 <= 0 && i <= 0) {
            point.x = i3;
            point.y = i4;
            return point;
        } else if (i <= 0) {
            point.x = (int) ((((float) i2) / ((float) i4)) * ((float) i3));
            point.y = i2;
            return point;
        } else if (i2 <= 0) {
            point.x = i;
            point.y = (int) ((((float) i) / ((float) i3)) * ((float) i4));
            return point;
        } else {
            float f = (float) i2;
            float f2 = (float) i;
            float f3 = (float) i4;
            float f4 = (float) i3;
            if (f / f2 > f3 / f4) {
                point.x = (int) ((f4 * f) / f3);
                point.y = i2;
            } else {
                point.x = i;
                point.y = (int) ((f3 * f2) / f4);
            }
            return point;
        }
    }

    public int getDurationMs() {
        Log.m105924i(TAG, "getDurationMs() returned: " + this.mDurationMs);
        return this.mDurationMs;
    }

    public Bitmap getFrameAtTime(long j) {
        Log.m105925i(TAG, "getFrameAtTime() called with: timeMs = [%d], mBufId = [%d]", Long.valueOf(j), Integer.valueOf(this.mBufId));
        int i = this.mDurationMs;
        if (j > ((long) i)) {
            j = (long) i;
        }
        if (j < 0) {
            j = 0;
        }
        Log.m105925i(TAG, "getFrameAtTime() seekStream return %d", Integer.valueOf(SightVideoJNI.seekStreamWithFlag((double) (((float) j) / 1000.0f), 1, this.mBufId)));
        Bitmap bitmap = this.mReusedBitmap;
        if (bitmap == null || bitmap.isRecycled() || this.mReusedBitmap.getWidth() != this.mScaledWidth || this.mReusedBitmap.getHeight() != this.mScaledHeight) {
            Bitmap bitmap2 = this.mReusedBitmap;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                C92716o.f266827d.mo126928m(this.mReusedBitmap);
            }
            this.mReusedBitmap = C92716o.f266827d.mo126927l(new C92716o.C92718b(this.mScaledWidth, this.mScaledHeight));
        }
        Log.m105925i(TAG, "getFrameAtTime() dr return %d", Integer.valueOf(SightVideoJNI.drawScaledFrame(this.mBufId, this.mReusedBitmap, this.mScaledWidth, this.mScaledHeight)));
        Bitmap bitmap3 = this.mReusedBitmap;
        this.mReusedBitmap = null;
        return bitmap3;
    }

    public int getScaledHeight() {
        Log.m105924i(TAG, "getScaledHeight() returned: " + this.mScaledHeight);
        return this.mScaledHeight;
    }

    public int getScaledWidth() {
        Log.m105924i(TAG, "getScaledWidth() returned: " + this.mScaledWidth);
        return this.mScaledWidth;
    }

    public void init(String str, int i, int i2, int i3) {
        Log.m105924i(TAG, "init() called with: path = [" + str + "], segment_interval = [" + i + "], width = [" + i2 + "], height = [" + i3 + "]");
        int openFileVFS = SightVideoJNI.openFileVFS(str, 1, 16, false);
        this.mBufId = openFileVFS;
        if (openFileVFS >= 0) {
            int videoWidth = SightVideoJNI.getVideoWidth(openFileVFS);
            int videoHeight = SightVideoJNI.getVideoHeight(this.mBufId);
            this.mDurationMs = (int) (SightVideoJNI.getVideoDuration(this.mBufId) * 1000.0d);
            Point calculateScaledLength = calculateScaledLength(i2, i3, videoWidth, videoHeight, new Point());
            int i4 = calculateScaledLength.x;
            this.mScaledWidth = i4;
            this.mScaledHeight = calculateScaledLength.y;
            Log.m105925i(TAG, "FFmpegSightJNIThumbFetcher.init. scaled size is (%d, %d); raw size is (%d, %d)", Integer.valueOf(i4), Integer.valueOf(this.mScaledHeight), Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
            return;
        }
        throw new C105487k("open file error.");
    }

    public void release() {
        Log.m105924i(TAG, "release() called");
        ThreadPool.post(new ReleaseRunnable(this.mReusedBitmap, this.mBufId), "release");
    }

    public void reuseBitmap(Bitmap bitmap) {
        Log.m105924i(TAG, "reuseBitmap() called with: bitmap = [" + bitmap + "]");
        if (bitmap != null) {
            this.mReusedBitmap = bitmap;
        }
    }
}
