package com.tencent.thumbplayer.api;

import android.graphics.Bitmap;

public interface TPCaptureCallBack {
    void onCaptureVideoFailed(int i);

    void onCaptureVideoSuccess(Bitmap bitmap);
}
