package com.tencent.thumbplayer.caputure;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import com.tencent.thumbplayer.adapter.player.ITPCapture;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;

public class TPSystemCapture implements ITPCapture, TPSysPlayerImageCapture.CaptureMediaImageListener {
    private AssetFileDescriptor mAssetFileDescriptor;
    private Map<Integer, TPCaptureCallBack> mCallBackMap = new HashMap();
    private FileDescriptor mFileDescriptor;
    private String mUrl;

    public TPSystemCapture(String str) {
        this.mUrl = str;
    }

    public void generateImageAsyncAtTime(long j, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        TPSysPlayerImageCapture.TPSysImageCaptureParams tPSysImageCaptureParams = new TPSysPlayerImageCapture.TPSysImageCaptureParams();
        tPSysImageCaptureParams.url = this.mUrl;
        tPSysImageCaptureParams.fileDescriptor = this.mFileDescriptor;
        tPSysImageCaptureParams.assetFileDescriptor = this.mAssetFileDescriptor;
        tPSysImageCaptureParams.positionMs = j;
        tPSysImageCaptureParams.width = tPImageGeneratorParams.width;
        tPSysImageCaptureParams.height = tPImageGeneratorParams.height;
        this.mCallBackMap.put(Integer.valueOf(TPSysPlayerImageCapture.GetImageCaptureInstance().captureImageWithPosition(tPSysImageCaptureParams, this)), tPCaptureCallBack);
    }

    public void onCaptureFailed(int i, int i2) {
        TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(Integer.valueOf(i));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoFailed(i2);
        }
    }

    public void onCaptureSucceed(int i, long j, int i2, int i3, Bitmap bitmap, long j2) {
        TPCaptureCallBack tPCaptureCallBack = this.mCallBackMap.get(Integer.valueOf(i));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoSuccess(bitmap);
        }
    }

    public void release() {
        this.mCallBackMap.clear();
    }

    public TPSystemCapture(FileDescriptor fileDescriptor) {
        this.mFileDescriptor = fileDescriptor;
    }

    public TPSystemCapture(AssetFileDescriptor assetFileDescriptor) {
        this.mAssetFileDescriptor = assetFileDescriptor;
    }
}
