package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class PlayerStateRunner {
    private static final String TAG = "StateRunner";
    private WeakReference<AudioTrack> mAudioTrack = new WeakReference<>((Object) null);
    private final ReadWriteLock mLock = new ReentrantReadWriteLock();
    private Integer mState;

    public PlayerStateRunner(Integer num) {
        this.mState = num;
    }

    public Integer get() {
        this.mLock.readLock().lock();
        try {
            int intValue = this.mState.intValue();
            AudioTrack audioTrack = this.mAudioTrack.get();
            if (audioTrack != null) {
                int playState = audioTrack.getPlayState();
                if (playState == 2) {
                    intValue = 5;
                } else if (playState == 3) {
                    intValue = 4;
                }
                if (!this.mState.equals(Integer.valueOf(intValue))) {
                    Logger.m21787e(TAG, "!mState.equals(state), mstate = " + this.mState.toString() + "   state = " + intValue);
                }
            }
            return Integer.valueOf(intValue);
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean isEqual(Integer... numArr) {
        this.mLock.readLock().lock();
        try {
            for (Integer equals : numArr) {
                if (this.mState.equals(equals)) {
                    this.mLock.readLock().unlock();
                    return true;
                }
            }
            this.mLock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            this.mLock.readLock().unlock();
            throw th;
        }
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.mAudioTrack = new WeakReference<>(audioTrack);
    }

    public Integer transfer(Integer num) {
        this.mLock.writeLock().lock();
        try {
            Integer num2 = this.mState;
            this.mState = num;
            Logger.m21791i(TAG, num2.toString() + " -> " + this.mState.toString());
            return num2;
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    public boolean transfer(Integer num, Integer... numArr) {
        boolean z;
        this.mLock.writeLock().lock();
        try {
            if (isEqual(numArr)) {
                transfer(num);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.mLock.writeLock().unlock();
        }
    }
}
