package com.tencent.liteav.audio;

import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::audio")
public class AudioDeviceManager {
    private static final String TAG = "AudioDeviceManager";
    private AudioManager mAudioManager;

    private synchronized AudioManager getAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        }
        return this.mAudioManager;
    }

    private int getAudioMode() {
        try {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getMode();
            }
            return -1;
        } catch (Exception e) {
            Log.m97547i(TAG, "Exception occurs in getAudioMode " + e.getMessage(), new Object[0]);
            return -1;
        }
    }

    private int getSystemVolume() {
        try {
            int i = getAudioMode() == 0 ? 3 : 0;
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                return audioManager.getStreamVolume(i);
            }
            return -1;
        } catch (Exception e) {
            Log.m97547i(TAG, "Exception occurs in getSystemVolume " + e.getMessage(), new Object[0]);
            return -1;
        }
    }
}
