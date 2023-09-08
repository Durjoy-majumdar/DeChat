package com.tencent.thumbplayer.caputure;

import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.thumbplayer.adapter.player.ITPCapture;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.thumbplayer.core.common.TPVideoFrame;
import com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.HashMap;
import java.util.Map;

public class TPThumbCapture implements ITPCapture, ITPImageGeneratorCallback {
    private static final String TAG = "TPThumbPlayer[TPThumbCapture.java]";
    private Map<Long, TPCaptureCallBack> mCallBackMap;
    private TPImageGenerator mImageGenerator;
    private long mOpaque;

    public TPThumbCapture(String str) {
        this.mOpaque = 0;
        this.mImageGenerator = new TPImageGenerator(str, this);
        this.mCallBackMap = new HashMap();
        try {
            this.mImageGenerator.init();
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, "init: " + Log.getStackTraceString(e));
        }
    }

    public void generateImageAsyncAtTime(long j, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        if (tPImageGeneratorParams == null) {
            tPImageGeneratorParams = new TPImageGeneratorParams();
            tPImageGeneratorParams.format = 37;
        }
        TPImageGeneratorParams tPImageGeneratorParams2 = tPImageGeneratorParams;
        long j2 = this.mOpaque + 1;
        this.mOpaque = j2;
        this.mCallBackMap.put(Long.valueOf(j2), tPCaptureCallBack);
        try {
            this.mImageGenerator.generateImageAsyncAtTime(j, this.mOpaque, tPImageGeneratorParams2);
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, "generateImageAsyncAtTime: " + Log.getStackTraceString(e));
        }
    }

    public void onImageGenerationCompleted(int i, long j, long j2, long j3, TPVideoFrame tPVideoFrame) {
        TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(Long.valueOf(j3));
        if (tPCaptureCallBack != null) {
            if (i != 0 || tPVideoFrame == null) {
                tPCaptureCallBack.onCaptureVideoFailed(i);
            } else {
                Bitmap frame2Bitmap = TPCaptureUtils.frame2Bitmap(tPVideoFrame);
                if (frame2Bitmap != null) {
                    tPCaptureCallBack.onCaptureVideoSuccess(frame2Bitmap);
                } else {
                    tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.FAILED);
                }
            }
        }
        this.mCallBackMap.remove(Long.valueOf(j3));
    }

    public void release() {
        try {
            this.mImageGenerator.cancelAllImageGenerations();
            this.mImageGenerator.unInit();
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, "release: " + Log.getStackTraceString(e));
        }
        this.mCallBackMap.clear();
        this.mImageGenerator = null;
    }

    public TPThumbCapture(int i) {
        this(i, 0, 0);
    }

    public TPThumbCapture(int i, long j, long j2) {
        this.mOpaque = 0;
        this.mImageGenerator = new TPImageGenerator(i, j, j2, this);
        this.mCallBackMap = new HashMap();
        try {
            this.mImageGenerator.init();
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, "init: " + Log.getStackTraceString(e));
        }
    }
}
