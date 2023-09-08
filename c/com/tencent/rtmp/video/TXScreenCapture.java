package com.tencent.rtmp.video;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.capture.C17428bc;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;

public class TXScreenCapture {

    public static class TXScreenCaptureAssistantActivity extends HellActivity {
        private static final int REQUEST_CODE = 100;
        private static final String TAG = "TXScreenCaptureAssistantActivity";
        private MediaProjectionManager mMediaProjectionManager;

        public void onActivityResult(int i, int i2, Intent intent) {
            MediaProjection mediaProjection;
            LiteavLog.m16901i(TAG, "onActivityResult ".concat(String.valueOf(this)));
            try {
                mediaProjection = this.mMediaProjectionManager.getMediaProjection(i2, intent);
            } catch (Exception e) {
                LiteavLog.m16899e(TAG, "onActivityResult mMediaProjectionManager.getMediaProjection fail.", (Throwable) e);
                mediaProjection = null;
            }
            C17428bc.m17492a((Context) this).mo20587a(mediaProjection);
            finish();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            LiteavLog.m16901i(TAG, "onCreate ".concat(String.valueOf(this)));
            requestWindowFeature(1);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (Exception e) {
                LiteavLog.m16898e(TAG, "Start permission activity failed. ".concat(String.valueOf(e)));
                C17428bc.m17492a((Context) this).mo20587a((MediaProjection) null);
                finish();
            }
        }

        public void onDestroy() {
            super.onDestroy();
            LiteavLog.m16901i(TAG, "onDestroy ".concat(String.valueOf(this)));
        }
    }
}
