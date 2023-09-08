package com.tencent.qqmusic.mediaplayer;

import android.content.Context;
import android.os.Process;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.lang.ref.WeakReference;

public class PlayerConfigManager {
    private static final int ADD = 1;
    private static final int DTS_COST_THRESHOLD = 40;
    private static boolean ENABLE_CHANGE_THREAD_PRIORITY = false;
    private static final boolean ENABLE_REAL_CHECK = true;
    private static final int MAX_RATIO = 4;
    private static final int MAX_TIMES = 10;
    private static final int MIN_RATIO = 8;
    private static final int NONE = 0;
    private static final int SUB = -1;
    private static final String TAG = "PlayerConfigManager";
    private static PlayerConfigManager mInstance;
    private int[] THREAD_PRIORITY;
    private ContextGetter contextGetter;
    private int count;
    private int mAddPriority;
    private int mBufRatio;
    private WeakReference<CorePlayer> mCommonPlayerRef;
    private int mCurrPriorityIndex;
    private long mLastDecodeSpeed;
    private long mPlaySpeed;
    private int mProcessorNumber;
    private long mStartTime;

    public interface ContextGetter {
        Context getContext();
    }

    private PlayerConfigManager() {
        this.contextGetter = null;
        this.mBufRatio = 4;
        this.count = 0;
        this.mStartTime = 0;
        this.mPlaySpeed = 1;
        this.mAddPriority = 0;
        this.mProcessorNumber = Runtime.getRuntime().availableProcessors();
        this.mCommonPlayerRef = null;
        this.THREAD_PRIORITY = new int[]{19, 10, -2, -4, -8, -16, -19};
        this.mCurrPriorityIndex = 0;
        this.mBufRatio = 4;
        this.count = 0;
        this.mStartTime = 0;
    }

    private boolean add() {
        return this.mAddPriority >= 1;
    }

    public static synchronized PlayerConfigManager getInstance() {
        PlayerConfigManager playerConfigManager;
        synchronized (PlayerConfigManager.class) {
            if (mInstance == null) {
                mInstance = new PlayerConfigManager();
            }
            playerConfigManager = mInstance;
        }
        return playerConfigManager;
    }

    private boolean sub() {
        return this.mAddPriority < -1;
    }

    public void calDTSCostEnd() {
        if (this.mBufRatio != 8 && System.currentTimeMillis() - this.mStartTime > 40) {
            int i = this.count + 1;
            this.count = i;
            if (i > 10) {
                this.mBufRatio *= 2;
                this.count = 0;
            }
        }
    }

    public void calDTSCostStart() {
        if (this.mBufRatio != 8) {
            this.mStartTime = System.currentTimeMillis();
        }
    }

    public void changeDecodeThreadPriority() {
        CorePlayer corePlayer;
        WeakReference<CorePlayer> weakReference = this.mCommonPlayerRef;
        if (weakReference != null && (corePlayer = weakReference.get()) != null) {
            corePlayer.changePlayThreadPriorityImmediately();
        }
    }

    public void changeDecodeThreadPriorityIfNeed() {
        try {
            int i = this.mCurrPriorityIndex;
            int[] iArr = this.THREAD_PRIORITY;
            int i2 = iArr[iArr.length - 1];
            if (!isSingleCpuOrScreenOff() || !ENABLE_CHANGE_THREAD_PRIORITY) {
                int[] iArr2 = this.THREAD_PRIORITY;
                int i3 = iArr2[iArr2.length - 1];
            } else {
                if (add()) {
                    i++;
                } else if (sub()) {
                    i--;
                }
                if (i != this.mCurrPriorityIndex || i < 0 || i >= this.THREAD_PRIORITY.length) {
                    if (i < 0) {
                        i = 0;
                    } else {
                        int[] iArr3 = this.THREAD_PRIORITY;
                        if (i >= iArr3.length) {
                            i = iArr3.length - 1;
                        }
                    }
                    this.mCurrPriorityIndex = i;
                    int i4 = this.THREAD_PRIORITY[i];
                    this.mAddPriority = 0;
                } else {
                    Logger.m21791i(TAG, "changeDecodeThreadPriorityIfNeed don't change Priority mCurrPriorityIndex = " + this.THREAD_PRIORITY[this.mCurrPriorityIndex]);
                    return;
                }
            }
            Process.setThreadPriority(0);
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    public int getBufRatio() {
        int i = this.mBufRatio;
        if (i <= 1) {
            this.mBufRatio = 4;
        } else if (i > 8) {
            this.mBufRatio = 8;
        }
        Logger.m21791i(TAG, "getBufRatio = " + this.mBufRatio);
        this.count = 0;
        return this.mBufRatio;
    }

    public Context getContext() {
        ContextGetter contextGetter2 = this.contextGetter;
        if (contextGetter2 != null) {
            return contextGetter2.getContext();
        }
        return null;
    }

    public boolean isSingleCpuOrScreenOff() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.mProcessorNumber = availableProcessors;
        return availableProcessors <= 1;
    }

    public void setCommonPlayerRef(CorePlayer corePlayer) {
        if (corePlayer != null) {
            this.mCommonPlayerRef = new WeakReference<>(corePlayer);
            this.mCurrPriorityIndex = 0;
            this.mAddPriority = 0;
            AudioInformation currentAudioInformation = corePlayer.getCurrentAudioInformation();
            if (currentAudioInformation != null) {
                this.mPlaySpeed = (long) (((float) ((currentAudioInformation.getSampleRate() * 2) * ((long) currentAudioInformation.getChannels()))) / 1000.0f);
                Logger.m21791i(TAG, "setCommonPlayerRef info = " + currentAudioInformation + ",mPlaySpeed = " + this.mPlaySpeed);
            }
        }
    }

    public void setContextGetter(ContextGetter contextGetter2) {
        this.contextGetter = contextGetter2;
    }
}
