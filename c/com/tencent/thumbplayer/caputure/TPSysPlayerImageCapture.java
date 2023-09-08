package com.tencent.thumbplayer.caputure;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.io.FileDescriptor;
import java.util.HashMap;

public class TPSysPlayerImageCapture {
    private static final int EV_CAP_IMAGE = 1;
    private static final int EV_STOP_CAP_IMAGE = 2;
    private static final String TAG = "TPSysPlayerImageCapture";
    private static TPSysPlayerImageCapture gInstance;
    private int mBaseID = 0;
    private EventHandler mCapHandler = null;
    private HandlerThread mHandlerThread = null;
    /* access modifiers changed from: private */
    public MediaMetadataRetriever mRetriever = null;

    public interface CaptureMediaImageListener {
        void onCaptureFailed(int i, int i2);

        void onCaptureSucceed(int i, long j, int i2, int i3, Bitmap bitmap, long j2);
    }

    public static class CaptureMsg {
        /* access modifiers changed from: private */
        public AssetFileDescriptor assetFileDescriptor;
        /* access modifiers changed from: private */
        public FileDescriptor fileDescriptor;
        /* access modifiers changed from: private */
        public int height;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public int f56997id;
        public CaptureMediaImageListener lis;
        /* access modifiers changed from: private */
        public long positionMs;
        /* access modifiers changed from: private */
        public String url;
        /* access modifiers changed from: private */
        public int width;

        private CaptureMsg() {
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                TPLogUtil.m21897i(TPSysPlayerImageCapture.TAG, "eventHandler EV_CAP_IMAGE");
                TPSysPlayerImageCapture.this.doRealCaptureImage((CaptureMsg) message.obj);
            } else if (i != 2) {
                TPLogUtil.m21897i(TPSysPlayerImageCapture.TAG, "eventHandler unknow msg");
            } else {
                TPLogUtil.m21897i(TPSysPlayerImageCapture.TAG, "eventHandler EV_STOP_CAP_IMAGE");
                if (TPSysPlayerImageCapture.this.mRetriever != null) {
                    TPSysPlayerImageCapture.this.mRetriever.release();
                    MediaMetadataRetriever unused = TPSysPlayerImageCapture.this.mRetriever = null;
                }
            }
        }
    }

    public static class TPSysImageCaptureParams {
        public AssetFileDescriptor assetFileDescriptor;
        public FileDescriptor fileDescriptor;
        public int height;
        public long positionMs;
        public String url;
        public int width;
    }

    private TPSysPlayerImageCapture() {
        try {
            this.mHandlerThread = TPThreadPool.getInstance().obtainShareThread();
            this.mCapHandler = new EventHandler(this.mHandlerThread.getLooper());
        } catch (Throwable th) {
            TPLogUtil.m21895e(TAG, th);
            this.mCapHandler = new EventHandler(Looper.getMainLooper());
        }
    }

    public static synchronized TPSysPlayerImageCapture GetImageCaptureInstance() {
        TPSysPlayerImageCapture tPSysPlayerImageCapture;
        synchronized (TPSysPlayerImageCapture.class) {
            if (gInstance == null) {
                gInstance = new TPSysPlayerImageCapture();
            }
            tPSysPlayerImageCapture = gInstance;
        }
        return tPSysPlayerImageCapture;
    }

    /* access modifiers changed from: private */
    public void doRealCaptureImage(CaptureMsg captureMsg) {
        MediaMetadataRetriever mediaMetadataRetriever;
        CaptureMsg captureMsg2 = captureMsg;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = this.mRetriever;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
                this.mRetriever = null;
            }
            this.mRetriever = new MediaMetadataRetriever();
            if (captureMsg.fileDescriptor != null) {
                this.mRetriever.setDataSource(captureMsg.fileDescriptor);
            } else if (captureMsg.assetFileDescriptor != null) {
                this.mRetriever.setDataSource(captureMsg.assetFileDescriptor.getFileDescriptor(), captureMsg.assetFileDescriptor.getStartOffset(), captureMsg.assetFileDescriptor.getLength());
            } else {
                this.mRetriever.setDataSource(captureMsg.url, new HashMap());
            }
            Bitmap frameAtTime = this.mRetriever.getFrameAtTime(captureMsg.positionMs * 1000, 2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (frameAtTime != null) {
                captureMsg2.lis.onCaptureSucceed(captureMsg.f56997id, captureMsg.positionMs, captureMsg.width, captureMsg.height, frameAtTime, currentTimeMillis2);
            } else {
                captureMsg2.lis.onCaptureFailed(captureMsg.f56997id, TPGeneralError.FAILED);
            }
            mediaMetadataRetriever = this.mRetriever;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            TPLogUtil.m21894e(TAG, "doRealCaptureImage, Exception: " + e.toString());
            captureMsg2.lis.onCaptureFailed(captureMsg.f56997id, TPGeneralError.FAILED);
            mediaMetadataRetriever = this.mRetriever;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } catch (Throwable th) {
            MediaMetadataRetriever mediaMetadataRetriever3 = this.mRetriever;
            if (mediaMetadataRetriever3 != null) {
                mediaMetadataRetriever3.release();
                this.mRetriever = null;
            }
            throw th;
        }
        mediaMetadataRetriever.release();
        this.mRetriever = null;
    }

    public int captureImageWithPosition(TPSysImageCaptureParams tPSysImageCaptureParams, CaptureMediaImageListener captureMediaImageListener) {
        TPLogUtil.m21897i(TAG, "captureImageWithPosition, position: " + tPSysImageCaptureParams.positionMs + ", width: " + tPSysImageCaptureParams.width + ", height: " + tPSysImageCaptureParams.height);
        this.mBaseID = this.mBaseID + 1;
        if (TextUtils.isEmpty(TPSystemInfo.getDeviceName()) || !TPSystemInfo.getDeviceName().equals("Lenovo+K900")) {
            CaptureMsg captureMsg = new CaptureMsg();
            int unused = captureMsg.f56997id = this.mBaseID;
            FileDescriptor unused2 = captureMsg.fileDescriptor = tPSysImageCaptureParams.fileDescriptor;
            AssetFileDescriptor unused3 = captureMsg.assetFileDescriptor = tPSysImageCaptureParams.assetFileDescriptor;
            String unused4 = captureMsg.url = tPSysImageCaptureParams.url;
            long unused5 = captureMsg.positionMs = tPSysImageCaptureParams.positionMs;
            int unused6 = captureMsg.width = tPSysImageCaptureParams.width;
            int unused7 = captureMsg.height = tPSysImageCaptureParams.height;
            captureMsg.lis = captureMediaImageListener;
            Message message = new Message();
            message.what = 1;
            message.obj = captureMsg;
            if (!this.mCapHandler.sendMessage(message)) {
                TPLogUtil.m21897i(TAG, "captureImageWithPosition, send msg failed ");
            }
            return this.mBaseID;
        }
        TPLogUtil.m21897i(TAG, "captureImageWithPosition, Lenovo+K900 no incompatible");
        return -1;
    }
}
