package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.List;

@JNINamespace("liteav::manager")
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final String TAG = "TXAudioEffectManagerImpl";
    private List<Integer> mEffectIdList = new ArrayList();
    private long mNativeAudioEffectMgr = 0;

    public static class AudioBgmParams {
        private TXAudioEffectManager.AudioMusicParam mParams;

        public AudioBgmParams(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
            this.mParams = audioMusicParam;
        }

        public long getEndTimeMS() {
            return this.mParams.endTimeMS;
        }

        public int getLoopCount() {
            return this.mParams.loopCount;
        }

        public String getPath() {
            return this.mParams.path;
        }

        public long getStartTimeMS() {
            return this.mParams.startTimeMS;
        }

        public boolean isPublish() {
            return this.mParams.publish;
        }

        public boolean isShortFile() {
            return this.mParams.isShortFile;
        }
    }

    public static class MusicPlayObserver {
        private TXAudioEffectManager.TXMusicPlayObserver mListener;

        public MusicPlayObserver(TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
            this.mListener = tXMusicPlayObserver;
        }

        public void onComplete(long j, int i) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.mListener;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete((int) j, i);
            }
        }

        public void onPlayProgress(long j, long j2, long j3) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.mListener;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress((int) j, j2, j3);
            }
        }

        public void onStart(long j, int i) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.mListener;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart((int) j, i);
            }
        }
    }

    public TXAudioEffectManagerImpl(long j) {
        this.mNativeAudioEffectMgr = j;
    }

    private static long convertToEffectId(int i) {
        return ((long) i) | 8589934592L;
    }

    private static native void nativeDestroy(long j);

    private static native void nativeEnableAudioEarMonitoring(long j, boolean z);

    private static native long nativeGetMusicCurrentPosInMS(long j, long j2);

    private static native long nativeGetMusicDurationInMS(long j, String str);

    private static native void nativePausePlayMusic(long j, long j2);

    private static native void nativeResumePlayMusic(long j, long j2);

    private static native void nativeSeekMusicToPosInMS(long j, long j2, long j3);

    private static native void nativeSetAllMusicVolume(long j, int i);

    private static native void nativeSetAudioEarMonitoringVolume(long j, int i);

    private static native void nativeSetMusicObserver(long j, long j2, MusicPlayObserver musicPlayObserver);

    private static native void nativeSetMusicPitch(long j, long j2, float f);

    private static native void nativeSetMusicPlayoutVolume(long j, long j2, int i);

    private static native void nativeSetMusicPublishVolume(long j, long j2, int i);

    private static native void nativeSetMusicSpeedRate(long j, long j2, float f);

    private static native void nativeSetVoiceCaptureVolume(long j, int i);

    private static native void nativeSetVoiceChangerType(long j, int i);

    private static native void nativeSetVoicePitch(long j, double d);

    private static native void nativeSetVoiceReverbType(long j, int i);

    private static native void nativeStartPlayMusic(long j, long j2, AudioBgmParams audioBgmParams);

    private static native void nativeStopPlayMusic(long j, long j2);

    public static TXAudioEffectManager.TXVoiceChangerType voiceChangerTypeFromInt(int i) {
        return i == 0 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0 : i == 1 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1 : i == 2 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2 : i == 3 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3 : i == 4 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4 : i == 5 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5 : i == 6 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6 : i == 7 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7 : i == 8 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8 : i == 9 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9 : i == 10 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10 : i == 11 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11 : TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    }

    public static TXAudioEffectManager.TXVoiceReverbType voiceReverbTypeFromInt(int i) {
        return i == 0 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0 : i == 1 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1 : i == 2 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2 : i == 3 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3 : i == 4 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4 : i == 5 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5 : i == 6 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6 : i == 7 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7 : i == 8 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8 : i == 9 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9 : i == 10 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10 : TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    }

    public void enableVoiceEarMonitor(boolean z) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeEnableAudioEarMonitoring(j, z);
        }
    }

    public void finalize() {
        super.finalize();
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeAudioEffectMgr = 0;
        }
    }

    public long getMusicCurrentPosInMS(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            return nativeGetMusicCurrentPosInMS(j, (long) i);
        }
        return 0;
    }

    public long getMusicDurationInMS(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m16898e(TAG, "getMusicDurationInMS invalid params");
            return 0;
        }
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            return nativeGetMusicDurationInMS(j, str);
        }
        return 0;
    }

    public void pauseAudioEffect(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativePausePlayMusic(j, convertToEffectId(i));
        }
    }

    public void pausePlayMusic(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativePausePlayMusic(j, (long) i);
        }
    }

    public void playAudioEffect(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || TextUtils.isEmpty(audioMusicParam.path)) {
            LiteavLog.m16898e(TAG, "startPlayMusic invalid params");
            return;
        }
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeStartPlayMusic(j, convertToEffectId(audioMusicParam.f154608id), new AudioBgmParams(audioMusicParam));
            synchronized (this) {
                this.mEffectIdList.add(Integer.valueOf(audioMusicParam.f154608id));
            }
        }
    }

    public void resumeAudioEffect(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeResumePlayMusic(j, convertToEffectId(i));
        }
    }

    public void resumePlayMusic(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeResumePlayMusic(j, (long) i);
        }
    }

    public void seekMusicToPosInMS(int i, int i2) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSeekMusicToPosInMS(j, (long) i, (long) i2);
        }
    }

    public void setAllAudioEffectsVolume(int i) {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                for (Integer intValue : this.mEffectIdList) {
                    setAudioEffectVolume(intValue.intValue(), i);
                }
            }
        }
    }

    public void setAllMusicVolume(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetAllMusicVolume(j, i);
        }
    }

    public void setAudioEffectVolume(int i, int i2) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicPlayoutVolume(j, convertToEffectId(i), i2);
            nativeSetMusicPublishVolume(this.mNativeAudioEffectMgr, convertToEffectId(i), i2);
        }
    }

    public void setEffectObserver(int i, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        long j = this.mNativeAudioEffectMgr;
        if (j == 0) {
            return;
        }
        if (tXMusicPlayObserver != null) {
            nativeSetMusicObserver(j, convertToEffectId(i), new MusicPlayObserver(tXMusicPlayObserver));
        } else {
            nativeSetMusicObserver(j, convertToEffectId(i), (MusicPlayObserver) null);
        }
    }

    public void setMusicObserver(int i, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        long j = this.mNativeAudioEffectMgr;
        if (j == 0) {
            return;
        }
        if (tXMusicPlayObserver != null) {
            nativeSetMusicObserver(j, (long) i, new MusicPlayObserver(tXMusicPlayObserver));
        } else {
            nativeSetMusicObserver(j, (long) i, (MusicPlayObserver) null);
        }
    }

    public void setMusicPitch(int i, float f) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicPitch(j, (long) i, f);
        }
    }

    public void setMusicPlayoutVolume(int i, int i2) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicPlayoutVolume(j, (long) i, i2);
        }
    }

    public void setMusicPublishVolume(int i, int i2) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicPublishVolume(j, (long) i, i2);
        }
    }

    public void setMusicSpeedRate(int i, float f) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicSpeedRate(j, (long) i, f);
        }
    }

    public void setVoiceCaptureVolume(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetVoiceCaptureVolume(j, i);
        }
    }

    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetVoiceChangerType(j, tXVoiceChangerType.getNativeValue());
        }
    }

    public void setVoiceEarMonitorVolume(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetAudioEarMonitoringVolume(j, i);
        }
    }

    public void setVoicePitch(double d) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetVoicePitch(j, d);
        }
    }

    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetVoiceReverbType(j, tXVoiceReverbType.getNativeValue());
        }
    }

    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || TextUtils.isEmpty(audioMusicParam.path)) {
            LiteavLog.m16898e(TAG, "startPlayMusic invalid params");
            return false;
        }
        long j = this.mNativeAudioEffectMgr;
        if (j == 0) {
            return true;
        }
        nativeStartPlayMusic(j, (long) audioMusicParam.f154608id, new AudioBgmParams(audioMusicParam));
        return true;
    }

    public void stopAllAudioEffects() {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                for (Integer next : this.mEffectIdList) {
                    nativeSetMusicObserver(this.mNativeAudioEffectMgr, convertToEffectId(next.intValue()), (MusicPlayObserver) null);
                    nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(next.intValue()));
                }
                this.mEffectIdList.clear();
            }
        }
    }

    public void stopAudioEffect(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeSetMusicObserver(j, convertToEffectId(i), (MusicPlayObserver) null);
            nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(i));
            synchronized (this) {
                int indexOf = this.mEffectIdList.indexOf(Integer.valueOf(i));
                if (indexOf >= 0) {
                    this.mEffectIdList.remove(indexOf);
                }
            }
        }
    }

    public void stopPlayMusic(int i) {
        long j = this.mNativeAudioEffectMgr;
        if (j != 0) {
            nativeStopPlayMusic(j, (long) i);
        }
    }
}
