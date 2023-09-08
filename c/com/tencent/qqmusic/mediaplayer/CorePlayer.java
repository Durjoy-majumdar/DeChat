package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.tav.core.AssetExtension;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class CorePlayer implements Runnable, BaseDecodeDataComponent.HandleDecodeDataCallback {
    private static final AtomicInteger PLAYER_ID_CREATOR = new AtomicInteger(0);
    private static final String TAG = "CorePlayer";
    public final List<IAudioListener> mAudioEffectList;
    private final PlayerCallback mCallback;
    private IDataSource mDataSource;
    private final BaseDecoder mDecoder;
    private final Handler mEventHandler;
    private final QMThreadExecutor mExecutor;
    public AudioInformation mInformation;
    /* access modifiers changed from: private */
    public boolean mIsAudioEffectParamPrepared = false;
    public volatile boolean mIsExit;
    private INativeDataSource mNativeDataSource;
    private BaseDecodeDataComponent mPcmCompnent;
    private String mPlayPath;
    private int mPlayerID;
    private int mPlayerMode;
    private Float mSpeedToSet;
    private final PlayerStateRunner mStateRunner;
    /* access modifiers changed from: private */
    public int mTargetBitDepth = 2;
    public final List<IAudioListener> mTerminalAudioEffectList;
    private String mThreadName;
    private PerformanceTracer performanceTracer;

    public CorePlayer(IDataSource iDataSource, INativeDataSource iNativeDataSource, PlayerCallback playerCallback, Looper looper, BaseDecoder baseDecoder, QMThreadExecutor qMThreadExecutor) {
        PlayerStateRunner playerStateRunner = new PlayerStateRunner(0);
        this.mStateRunner = playerStateRunner;
        this.mPlayerID = PLAYER_ID_CREATOR.addAndGet(1);
        this.mAudioEffectList = new CopyOnWriteArrayList();
        this.mTerminalAudioEffectList = new CopyOnWriteArrayList();
        this.mSpeedToSet = null;
        this.mThreadName = "Unnamed";
        this.mPlayerMode = 0;
        this.mIsExit = false;
        this.performanceTracer = null;
        this.mPlayPath = null;
        if (iDataSource != null && iNativeDataSource != null) {
            throw new IllegalArgumentException("you can't set IDataSource and INativeDataSource at the same time!");
        } else if (iDataSource == null && iNativeDataSource == null) {
            throw new IllegalArgumentException("at least on data source is required!");
        } else {
            this.mEventHandler = new Handler(looper);
            this.mDecoder = baseDecoder;
            this.mDataSource = iDataSource;
            this.mNativeDataSource = iNativeDataSource;
            this.mCallback = playerCallback;
            playerStateRunner.transfer(1);
            this.mExecutor = qMThreadExecutor;
        }
    }

    private String axiliary(String str) {
        return "ID: " + this.mPlayerID + ". " + str;
    }

    private void callExceptionCallback(int i, int i2) {
        callExceptionCallback(i, i2, 0);
    }

    private void decodeEndOrFailed(int i, int i2) {
        Logger.m21786d(TAG, axiliary("decodeEndOrFailed"));
        try {
            if (this.mPcmCompnent == null) {
                Logger.m21787e(TAG, axiliary("mPcmCompnent null! Exiting"));
                return;
            }
            if (this.mInformation != null) {
                Logger.m21791i(TAG, axiliary(String.format("current: %d, duration: %d, isExit: %b, decodeSucc: %b", new Object[]{Long.valueOf(this.mDecoder.getCurrentTime()), Long.valueOf(this.mInformation.getDuration()), Boolean.valueOf(this.mIsExit), Boolean.valueOf(this.mPcmCompnent.hasDecodeDataSuccess())})));
                i &= this.mDecoder.getErrorCodeMask();
            }
            int i3 = 68;
            if (!this.mIsExit) {
                if (this.mPcmCompnent.hasDecodeDataSuccess()) {
                    if (getCurPositionByDecoder() < getDuration() - FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                        Logger.m21787e(TAG, axiliary("Decode failed! Exiting."));
                        if (TextUtils.isEmpty(this.mPlayPath) || !isPathExternalStorage(this.mPlayPath)) {
                            i3 = 67;
                        }
                        callExceptionCallback(i2, i3, i);
                        this.mStateRunner.transfer(6);
                        return;
                    } else if (i2 == 92) {
                        Logger.m21791i(TAG, axiliary("Decode ended! Exiting."));
                        this.mStateRunner.transfer(7);
                        return;
                    } else {
                        return;
                    }
                }
            }
            Logger.m21791i(TAG, axiliary("不留痕迹的退出 时机：解码时退出  step = 4"));
            exitNotCallback();
            this.mStateRunner.transfer(9);
            if (TextUtils.isEmpty(this.mPlayPath) || !isPathExternalStorage(this.mPlayPath)) {
                i3 = 67;
            }
            callExceptionCallback(i2, i3, i);
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    private void exitNotCallback() {
        Logger.m21791i(TAG, axiliary("exitNotCallback"));
        this.mIsExit = true;
    }

    private boolean isPathExternalStorage(String str) {
        return !str.contains("emulated/0") && !str.contains("sdcard0");
    }

    public void addAudioListener(IAudioListener iAudioListener) {
        long j;
        if (iAudioListener.isTerminal()) {
            if (!this.mTerminalAudioEffectList.contains(iAudioListener)) {
                this.mTerminalAudioEffectList.add(iAudioListener);
                Logger.m21791i(TAG, "[addAudioListener] terminal audio added: " + iAudioListener);
            }
        } else if (!this.mAudioEffectList.contains(iAudioListener)) {
            this.mAudioEffectList.add(iAudioListener);
            Logger.m21791i(TAG, "[addAudioListener] audio added: " + iAudioListener);
        }
        if (this.mIsAudioEffectParamPrepared) {
            try {
                j = iAudioListener.onPlayerReady(this.mTargetBitDepth, this.mInformation, getCurPosition());
            } catch (Throwable th) {
                Logger.m21788e(TAG, "[addAudioListener] failed to init audio: " + iAudioListener, th);
                j = 0;
            }
            if (j != 0) {
                Logger.m21789e(TAG, "[addAudioListener] failed to init audio %s, ret: %d", iAudioListener, Long.valueOf(j));
                return;
            }
            return;
        }
        Logger.m21791i(TAG, "[addAudioListener] audio information not ready. init will be delayed.");
    }

    public void changePlayThreadPriorityImmediately() {
        Logger.m21786d(TAG, axiliary("changePlayThreadPriorityImmediately"));
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.changePlayThreadPriorityImmediately();
        }
    }

    public SeekTable createSeekTable() {
        BaseDecoder baseDecoder = this.mDecoder;
        if (baseDecoder != null) {
            return new NativeSeekTable(baseDecoder);
        }
        throw new IllegalStateException("please setDataSource before creating seek table!");
    }

    public void flush() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.flush();
        }
    }

    public long getCurPosition() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return 0;
        }
        return baseDecodeDataComponent.getCurPosition();
    }

    public long getCurPositionByDecoder() {
        try {
            return this.mDecoder.getCurrentTime();
        } catch (SoNotFindException e) {
            Logger.m21790e(TAG, (Throwable) e);
            return 0;
        } catch (Throwable th) {
            Logger.m21788e(TAG, "Strange Exception!", th);
            return 0;
        }
    }

    public AudioInformation getCurrentAudioInformation() {
        return this.mInformation;
    }

    public long getDuration() {
        AudioInformation audioInformation = this.mInformation;
        if (audioInformation == null) {
            return 0;
        }
        try {
            return audioInformation.getDuration();
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
            return 0;
        }
    }

    public long getMinPcmBufferSize() {
        return this.mDecoder.getMinBufferSize();
    }

    public int getPlayerMode() {
        return this.mPlayerMode;
    }

    public int getPlayerState() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return 0;
        }
        return baseDecodeDataComponent.getPlayerState();
    }

    public int getSessionId() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            return baseDecodeDataComponent.getSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            return baseDecodeDataComponent.getSpeed();
        }
        Float f = this.mSpeedToSet;
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public synchronized boolean hasDecodeData() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.hasDecodeData();
    }

    public synchronized boolean hasDecodeDataSuccess() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.hasDecodeDataSuccess();
    }

    public boolean isInit() {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.isInit();
    }

    public void onAudioTrackChanged(AudioTrack audioTrack) {
        this.mDecoder.setAudioTrack(audioTrack);
    }

    public void onPullDecodeDataEndOrFailed(int i, int i2) {
        decodeEndOrFailed(i, i2);
    }

    public void pause(boolean z) {
        Logger.m21791i(TAG, axiliary("pause"));
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.pause(z);
        }
    }

    public void play() {
        Logger.m21791i(TAG, axiliary(AssetExtension.SCENE_PLAY));
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.play();
        }
    }

    public void prepare() {
        Logger.m21791i(TAG, axiliary("prepare"));
        this.mStateRunner.transfer(3);
        this.mExecutor.execute(this, (Thread.UncaughtExceptionHandler) null);
    }

    public int pullDecodeData(int i, byte[] bArr) {
        return this.mDecoder.decodeData(i, bArr);
    }

    public void release() {
        Logger.m21791i(TAG, axiliary("release"));
        this.mEventHandler.removeCallbacksAndMessages((Object) null);
        exitNotCallback();
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.releaseNotify();
        }
        this.mStateRunner.transfer(8);
    }

    public void removeAudioListener(IAudioListener iAudioListener) {
        if (this.mAudioEffectList.remove(iAudioListener)) {
            Logger.m21791i(TAG, "[removeAudioListener] audio removed: " + iAudioListener);
        }
        if (this.mTerminalAudioEffectList.remove(iAudioListener)) {
            Logger.m21791i(TAG, "[removeAudioListener] terminal audio removed: " + iAudioListener);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03f0 A[SYNTHETIC, Splitter:B:153:0x03f0] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0226 A[Catch:{ all -> 0x01eb, all -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248 A[Catch:{ all -> 0x01eb, all -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029d A[SYNTHETIC, Splitter:B:97:0x029d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r11 = r22
            java.lang.String r12 = "release dataSource throw a exception = "
            java.lang.String r13 = "exit, thread: "
            java.lang.String r14 = "release throw a exception = "
            java.lang.String r15 = "thread finally, mIsExit = "
            java.lang.String r10 = "thread finally, ERROR!!!, no mPcmCompnent"
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.startProcessInfoOutput()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "run, thread: "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            java.lang.String r9 = "CorePlayer"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r0)
            r1 = 62
            r2 = 9
            r3 = 91
            r8 = 0
            com.tencent.qqmusic.mediaplayer.PlayerCallback r0 = r11.mCallback     // Catch:{ all -> 0x02df }
            r0.playThreadStart(r11)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x0062
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r4 = r11.mDecoder     // Catch:{ all -> 0x02df }
            int r0 = r4.init((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) r0)     // Catch:{ all -> 0x02df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02df }
            r4.<init>()     // Catch:{ all -> 0x02df }
            java.lang.String r5 = "mDecoder init from dataSource: "
            r4.append(r5)     // Catch:{ all -> 0x02df }
            r4.append(r0)     // Catch:{ all -> 0x02df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02df }
            java.lang.String r4 = r11.axiliary(r4)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r4)     // Catch:{ all -> 0x02df }
            goto L_0x008f
        L_0x0062:
            com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource r0 = r11.mNativeDataSource     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x0085
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r4 = r11.mDecoder     // Catch:{ all -> 0x02df }
            int r0 = r4.init((com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource) r0)     // Catch:{ all -> 0x02df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02df }
            r4.<init>()     // Catch:{ all -> 0x02df }
            java.lang.String r5 = "mDecoder init from native dataSource: "
            r4.append(r5)     // Catch:{ all -> 0x02df }
            r4.append(r0)     // Catch:{ all -> 0x02df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02df }
            java.lang.String r4 = r11.axiliary(r4)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r4)     // Catch:{ all -> 0x02df }
            goto L_0x008f
        L_0x0085:
            r0 = -1
            java.lang.String r4 = "[run] no dataSource!"
            java.lang.String r4 = r11.axiliary(r4)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r4)     // Catch:{ all -> 0x02df }
        L_0x008f:
            r4 = -9
            if (r0 != r4) goto L_0x00c3
            java.lang.String r0 = "empty file, maybe external sdcard or other permission issue"
            java.lang.String r0 = r11.axiliary(r0)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r11.mStateRunner     // Catch:{ all -> 0x02df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02df }
            r0.transfer(r4)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r11.mPlayPath     // Catch:{ all -> 0x02df }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = r11.mPlayPath     // Catch:{ all -> 0x02df }
            boolean r0 = r11.isPathExternalStorage(r0)     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00bc
            r0 = 100
            r11.callExceptionCallback(r3, r0)     // Catch:{ all -> 0x02df }
            goto L_0x0192
        L_0x00bc:
            r0 = 200(0xc8, float:2.8E-43)
            r11.callExceptionCallback(r3, r0)     // Catch:{ all -> 0x02df }
            goto L_0x0192
        L_0x00c3:
            if (r0 == 0) goto L_0x018a
            java.lang.String r4 = "不留痕迹的退出 时机：初始化时 step = 1"
            java.lang.String r4 = r11.axiliary(r4)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r4 = r11.mStateRunner     // Catch:{ all -> 0x02df }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02df }
            r4.transfer(r5)     // Catch:{ all -> 0x02df }
            r4 = -2
            if (r0 != r4) goto L_0x00f1
            java.lang.String r0 = r11.mPlayPath     // Catch:{ all -> 0x02df }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = r11.mPlayPath     // Catch:{ all -> 0x02df }
            boolean r0 = r11.isPathExternalStorage(r0)     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x00ee
            r0 = 56
            goto L_0x00f3
        L_0x00ee:
            r0 = 55
            goto L_0x00f3
        L_0x00f1:
            r0 = 62
        L_0x00f3:
            r11.callExceptionCallback(r3, r0)     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x0113
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            boolean r1 = r11.mIsExit
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r0)
            goto L_0x011a
        L_0x0113:
            java.lang.String r0 = r11.axiliary(r10)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r9, (java.lang.String) r0)
        L_0x011a:
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.stopProcessInfoOutput()
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x0123 }
            r0.release()     // Catch:{ all -> 0x0123 }
            goto L_0x013e
        L_0x0123:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r9, (java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x013e:
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource
            if (r0 == 0) goto L_0x0162
            r0.close()     // Catch:{ IOException -> 0x0146 }
            goto L_0x0162
        L_0x0146:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r9, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0162:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x0169
            r0.release()
        L_0x0169:
            r11.mPlayerMode = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r0)
            return
        L_0x018a:
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x02df }
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r0.getAudioInformation()     // Catch:{ all -> 0x02df }
            r11.mInformation = r0     // Catch:{ all -> 0x02df }
        L_0x0192:
            com.tencent.qqmusic.mediaplayer.PlayerConfigManager r0 = com.tencent.qqmusic.mediaplayer.PlayerConfigManager.getInstance()     // Catch:{ all -> 0x02d8 }
            r0.setCommonPlayerRef(r11)     // Catch:{ all -> 0x02d8 }
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r11.mInformation     // Catch:{ all -> 0x02d8 }
            if (r0 == 0) goto L_0x023d
            boolean r0 = r11.mIsExit     // Catch:{ all -> 0x0233 }
            if (r0 != 0) goto L_0x023d
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent     // Catch:{ all -> 0x0233 }
            if (r0 != 0) goto L_0x023d
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r11.mInformation     // Catch:{ all -> 0x0233 }
            long r0 = r0.getDuration()     // Catch:{ all -> 0x0233 }
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x01f3
            int r0 = r11.mPlayerMode     // Catch:{ all -> 0x0233 }
            if (r0 != r4) goto L_0x01b7
            goto L_0x01f3
        L_0x01b7:
            com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent r0 = new com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent     // Catch:{ all -> 0x0233 }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r3 = r11.mStateRunner     // Catch:{ all -> 0x0233 }
            com.tencent.qqmusic.mediaplayer.AudioInformation r5 = r11.mInformation     // Catch:{ all -> 0x0233 }
            com.tencent.qqmusic.mediaplayer.PlayerCallback r6 = r11.mCallback     // Catch:{ all -> 0x0233 }
            android.os.Handler r7 = r11.mEventHandler     // Catch:{ all -> 0x0233 }
            int r2 = r11.mPlayerID     // Catch:{ all -> 0x0233 }
            com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate r1 = new com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate     // Catch:{ all -> 0x0233 }
            r1.<init>(r8)     // Catch:{ all -> 0x0233 }
            r16 = r10
            com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate r10 = new com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate     // Catch:{ all -> 0x01eb }
            r10.<init>(r4)     // Catch:{ all -> 0x01eb }
            r17 = r1
            r1 = r0
            r18 = r2
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r22
            r19 = r13
            r13 = 0
            r8 = r18
            r20 = r9
            r9 = r17
            r21 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02cf }
            r11.mPcmCompnent = r0     // Catch:{ all -> 0x02cf }
            goto L_0x0222
        L_0x01eb:
            r0 = move-exception
            r19 = r13
            r13 = 0
            r4 = r9
            r5 = r16
            goto L_0x0239
        L_0x01f3:
            r20 = r9
            r21 = r10
            r19 = r13
            r13 = 0
            int r0 = r11.mPlayerMode     // Catch:{ all -> 0x02cf }
            if (r0 == r4) goto L_0x0200
            r11.mPlayerMode = r4     // Catch:{ all -> 0x02cf }
        L_0x0200:
            com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent r0 = new com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent     // Catch:{ all -> 0x02cf }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r3 = r11.mStateRunner     // Catch:{ all -> 0x02cf }
            com.tencent.qqmusic.mediaplayer.AudioInformation r5 = r11.mInformation     // Catch:{ all -> 0x02cf }
            com.tencent.qqmusic.mediaplayer.PlayerCallback r6 = r11.mCallback     // Catch:{ all -> 0x02cf }
            android.os.Handler r7 = r11.mEventHandler     // Catch:{ all -> 0x02cf }
            int r8 = r11.mPlayerID     // Catch:{ all -> 0x02cf }
            com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate r9 = new com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate     // Catch:{ all -> 0x02cf }
            r9.<init>(r13)     // Catch:{ all -> 0x02cf }
            com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate r10 = new com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate     // Catch:{ all -> 0x02cf }
            r10.<init>(r4)     // Catch:{ all -> 0x02cf }
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02cf }
            r11.mPcmCompnent = r0     // Catch:{ all -> 0x02cf }
        L_0x0222:
            java.lang.Float r0 = r11.mSpeedToSet     // Catch:{ all -> 0x02cf }
            if (r0 == 0) goto L_0x0244
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r1 = r11.mPcmCompnent     // Catch:{ all -> 0x02cf }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02cf }
            r1.setSpeed(r0)     // Catch:{ all -> 0x02cf }
            r0 = 0
            r11.mSpeedToSet = r0     // Catch:{ all -> 0x02cf }
            goto L_0x0244
        L_0x0233:
            r0 = move-exception
            r19 = r13
            r13 = 0
            r4 = r9
            r5 = r10
        L_0x0239:
            r6 = r19
            goto L_0x03a1
        L_0x023d:
            r20 = r9
            r21 = r10
            r19 = r13
            r13 = 0
        L_0x0244:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent     // Catch:{ all -> 0x02cf }
            if (r0 == 0) goto L_0x024b
            r0.handleDecodeData()     // Catch:{ all -> 0x02cf }
        L_0x024b:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x026a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            boolean r1 = r11.mIsExit
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            r4 = r20
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            goto L_0x0275
        L_0x026a:
            r4 = r20
            r5 = r21
            java.lang.String r0 = r11.axiliary(r5)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r4, (java.lang.String) r0)
        L_0x0275:
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.stopProcessInfoOutput()
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x027e }
            r0.release()     // Catch:{ all -> 0x027e }
            goto L_0x0299
        L_0x027e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0299:
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource
            if (r0 == 0) goto L_0x02bd
            r0.close()     // Catch:{ IOException -> 0x02a1 }
            goto L_0x02bd
        L_0x02a1:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x02bd:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x02c4
            r0.release()
        L_0x02c4:
            r11.mPlayerMode = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6 = r19
            goto L_0x041e
        L_0x02cf:
            r0 = move-exception
            r6 = r19
            r4 = r20
            r5 = r21
            goto L_0x03a1
        L_0x02d8:
            r0 = move-exception
            r4 = r9
            r5 = r10
            r6 = r13
            r13 = 0
            goto L_0x03a1
        L_0x02df:
            r0 = move-exception
            r4 = r9
            r5 = r10
            r6 = r13
            r13 = 0
            boolean r7 = r0 instanceof com.tencent.qqmusic.mediaplayer.SoNotFindException     // Catch:{ all -> 0x03a0 }
            if (r7 == 0) goto L_0x02eb
            r1 = 69
            goto L_0x02f1
        L_0x02eb:
            boolean r7 = r0 instanceof java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x03a0 }
            if (r7 == 0) goto L_0x02f1
            r1 = 60
        L_0x02f1:
            java.lang.String r7 = "不留痕迹的退出 时机：初始化时 step = 2"
            java.lang.String r7 = r11.axiliary(r7)     // Catch:{ all -> 0x03a0 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x03a0 }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r7 = r11.mStateRunner     // Catch:{ all -> 0x03a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03a0 }
            r7.transfer(r2)     // Catch:{ all -> 0x03a0 }
            r11.callExceptionCallback(r3, r1)     // Catch:{ all -> 0x03a0 }
            java.lang.String r1 = "[run] init decoder throws an exception!"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x03a0 }
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x0329
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            boolean r1 = r11.mIsExit
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            goto L_0x0330
        L_0x0329:
            java.lang.String r0 = r11.axiliary(r5)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r4, (java.lang.String) r0)
        L_0x0330:
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.stopProcessInfoOutput()
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x0339 }
            r0.release()     // Catch:{ all -> 0x0339 }
            goto L_0x0354
        L_0x0339:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0354:
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource
            if (r0 == 0) goto L_0x0378
            r0.close()     // Catch:{ IOException -> 0x035c }
            goto L_0x0378
        L_0x035c:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0378:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x037f
            r0.release()
        L_0x037f:
            r11.mPlayerMode = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            return
        L_0x03a0:
            r0 = move-exception
        L_0x03a1:
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0438 }
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x03c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            boolean r1 = r11.mIsExit
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            goto L_0x03c8
        L_0x03c1:
            java.lang.String r0 = r11.axiliary(r5)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r4, (java.lang.String) r0)
        L_0x03c8:
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.stopProcessInfoOutput()
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x03d1 }
            r0.release()     // Catch:{ all -> 0x03d1 }
            goto L_0x03ec
        L_0x03d1:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x03ec:
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource
            if (r0 == 0) goto L_0x0410
            r0.close()     // Catch:{ IOException -> 0x03f4 }
            goto L_0x0410
        L_0x03f4:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0410:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x0417
            r0.release()
        L_0x0417:
            r11.mPlayerMode = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x041e:
            r0.append(r6)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            return
        L_0x0438:
            r0 = move-exception
            r1 = r0
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x0457
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            boolean r2 = r11.mIsExit
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            goto L_0x045e
        L_0x0457:
            java.lang.String r0 = r11.axiliary(r5)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r4, (java.lang.String) r0)
        L_0x045e:
            com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.stopProcessInfoOutput()
            com.tencent.qqmusic.mediaplayer.codec.BaseDecoder r0 = r11.mDecoder     // Catch:{ all -> 0x0467 }
            r0.release()     // Catch:{ all -> 0x0467 }
            goto L_0x0482
        L_0x0467:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r11.axiliary(r2)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0482:
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource r0 = r11.mDataSource
            if (r0 == 0) goto L_0x04a6
            r0.close()     // Catch:{ IOException -> 0x048a }
            goto L_0x04a6
        L_0x048a:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r3 = r2.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x04a6:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent r0 = r11.mPcmCompnent
            if (r0 == 0) goto L_0x04ad
            r0.release()
        L_0x04ad:
            r11.mPlayerMode = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r11.axiliary(r0)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.CorePlayer.run():void");
    }

    public void seek(int i) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.seek(i);
        }
    }

    public int seekTo(int i) {
        return this.mDecoder.seekTo(i);
    }

    public void setAudioStreamType(int i) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setAudioStreamType(i);
        }
    }

    public void setLeastCommonMultiple(int i) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setLeastCommonMultiple(i);
        }
    }

    public void setPlayPath(String str) {
        this.mPlayPath = str;
    }

    public void setPlayerMode(int i) {
        this.mPlayerMode = i;
    }

    public void setSpeed(float f) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            this.mSpeedToSet = Float.valueOf(f);
        } else {
            baseDecodeDataComponent.setSpeed(f);
        }
    }

    public void setThreadName(String str) {
        this.mThreadName = str;
    }

    public void setVolume(float f, float f2) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setVolume(f, f2);
        }
    }

    public void setVolumeForHuawei(float f, float f2) {
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setVolumeForHuawei(f, f2);
        }
    }

    public void stop() {
        Logger.m21791i(TAG, axiliary("stop"));
        BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            exitNotCallback();
        } else {
            baseDecodeDataComponent.stop();
        }
    }

    private void callExceptionCallback(int i, int i2, int i3) {
        this.mCallback.playerException(this, i, i2, i3);
    }

    public class AudioListenerDelegate implements IAudioListener {
        private final boolean mIsTerminal;

        public AudioListenerDelegate(boolean z) {
            this.mIsTerminal = z;
        }

        public long getActualTime(long j) {
            for (IAudioListener actualTime : getAudioListeners()) {
                j = actualTime.getActualTime(j);
            }
            return j;
        }

        public List<IAudioListener> getAudioListeners() {
            return this.mIsTerminal ? CorePlayer.this.mTerminalAudioEffectList : CorePlayer.this.mAudioEffectList;
        }

        public boolean isEnabled() {
            for (IAudioListener isEnabled : getAudioListeners()) {
                if (isEnabled.isEnabled()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTerminal() {
            return this.mIsTerminal;
        }

        public boolean onPcm(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j) {
            BufferInfo bufferInfo3;
            boolean z;
            BufferInfo bufferInfo4 = bufferInfo;
            BufferInfo bufferInfo5 = bufferInfo2;
            long j2 = j;
            boolean z2 = false;
            if (!this.mIsTerminal) {
                List<IAudioListener> list = CorePlayer.this.mAudioEffectList;
                if (list.size() == 0) {
                    bufferInfo.fillInto(bufferInfo2);
                } else {
                    BufferInfo bufferInfo6 = bufferInfo4;
                    BufferInfo bufferInfo7 = bufferInfo5;
                    for (IAudioListener next : list) {
                        if (next.isEnabled()) {
                            try {
                                bufferInfo7.setByteBufferCapacity(bufferInfo6.bufferSize);
                                z = next.onPcm(bufferInfo6, bufferInfo7, j2);
                            } catch (Throwable th) {
                                Logger.m21787e(CorePlayer.TAG, "[onPcm] failed. audio: " + next + " e: " + th);
                                z = false;
                            }
                            if (z) {
                                BufferInfo bufferInfo8 = bufferInfo7;
                                bufferInfo7 = bufferInfo6;
                                bufferInfo6 = bufferInfo8;
                            } else {
                                bufferInfo6.fillInto(bufferInfo7);
                            }
                        } else {
                            bufferInfo6.fillInto(bufferInfo7);
                        }
                        int i = bufferInfo7.bufferSize;
                    }
                    if (bufferInfo6 == bufferInfo4) {
                        bufferInfo.fillInto(bufferInfo2);
                    }
                }
            } else {
                List<IAudioListener> list2 = CorePlayer.this.mTerminalAudioEffectList;
                if (list2.size() == 0) {
                    bufferInfo.fillInto(bufferInfo2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        IAudioListener iAudioListener = list2.get(size);
                        if (iAudioListener.isEnabled()) {
                            try {
                                bufferInfo5.setByteBufferCapacity(bufferInfo4.bufferSize);
                                z2 = iAudioListener.onPcm(bufferInfo4, bufferInfo5, j2);
                            } catch (Throwable th4) {
                                Logger.m21787e(CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener + " e: " + th4);
                            }
                            if (z2) {
                                bufferInfo3 = bufferInfo5;
                            } else {
                                bufferInfo.fillInto(bufferInfo2);
                            }
                        } else {
                            bufferInfo.fillInto(bufferInfo2);
                            size--;
                        }
                    }
                    bufferInfo3 = bufferInfo4;
                    if (bufferInfo3 == bufferInfo4) {
                        bufferInfo.fillInto(bufferInfo2);
                    }
                }
            }
            return true;
        }

        public long onPlayerReady(int i, AudioInformation audioInformation, long j) {
            int unused = CorePlayer.this.mTargetBitDepth = i;
            boolean unused2 = CorePlayer.this.mIsAudioEffectParamPrepared = true;
            for (IAudioListener onPlayerReady : getAudioListeners()) {
                onPlayerReady.onPlayerReady(i, audioInformation, j);
            }
            return 0;
        }

        public void onPlayerSeekComplete(long j) {
            for (IAudioListener onPlayerSeekComplete : getAudioListeners()) {
                onPlayerSeekComplete.onPlayerSeekComplete(j);
            }
        }

        public void onPlayerStopped() {
            for (IAudioListener onPlayerStopped : getAudioListeners()) {
                onPlayerStopped.onPlayerStopped();
            }
        }

        public boolean onPcm(FloatBufferInfo floatBufferInfo, FloatBufferInfo floatBufferInfo2, long j) {
            FloatBufferInfo floatBufferInfo3;
            boolean z;
            FloatBufferInfo floatBufferInfo4 = floatBufferInfo;
            FloatBufferInfo floatBufferInfo5 = floatBufferInfo2;
            long j2 = j;
            boolean z2 = false;
            if (!this.mIsTerminal) {
                List<IAudioListener> list = CorePlayer.this.mAudioEffectList;
                if (list.size() == 0) {
                    floatBufferInfo.copy(floatBufferInfo2);
                } else {
                    FloatBufferInfo floatBufferInfo6 = floatBufferInfo4;
                    FloatBufferInfo floatBufferInfo7 = floatBufferInfo5;
                    for (IAudioListener next : list) {
                        if (next.isEnabled()) {
                            try {
                                floatBufferInfo7.setFloatBufferCapacity(floatBufferInfo6.bufferSize);
                                z = next.onPcm(floatBufferInfo6, floatBufferInfo7, j2);
                            } catch (Throwable th) {
                                Logger.m21787e(CorePlayer.TAG, "[onPcm] failed. audio: " + next + " e: " + th);
                                z = false;
                            }
                            if (z) {
                                FloatBufferInfo floatBufferInfo8 = floatBufferInfo7;
                                floatBufferInfo7 = floatBufferInfo6;
                                floatBufferInfo6 = floatBufferInfo8;
                            } else {
                                floatBufferInfo6.copy(floatBufferInfo7);
                            }
                        } else {
                            floatBufferInfo6.copy(floatBufferInfo7);
                        }
                        int i = floatBufferInfo7.bufferSize;
                    }
                    if (floatBufferInfo6 == floatBufferInfo4) {
                        floatBufferInfo.copy(floatBufferInfo2);
                    }
                }
            } else {
                List<IAudioListener> list2 = CorePlayer.this.mTerminalAudioEffectList;
                if (list2.size() == 0) {
                    floatBufferInfo.copy(floatBufferInfo2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        IAudioListener iAudioListener = list2.get(size);
                        if (iAudioListener.isEnabled()) {
                            try {
                                floatBufferInfo5.setFloatBufferCapacity(floatBufferInfo4.bufferSize);
                                z2 = iAudioListener.onPcm(floatBufferInfo4, floatBufferInfo5, j2);
                            } catch (Throwable th4) {
                                Logger.m21787e(CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener + " e: " + th4);
                            }
                            if (z2) {
                                floatBufferInfo3 = floatBufferInfo5;
                            } else {
                                floatBufferInfo.copy(floatBufferInfo2);
                            }
                        } else {
                            floatBufferInfo.copy(floatBufferInfo2);
                            size--;
                        }
                    }
                    floatBufferInfo3 = floatBufferInfo4;
                    if (floatBufferInfo3 == floatBufferInfo4) {
                        floatBufferInfo.copy(floatBufferInfo2);
                    }
                }
            }
            return true;
        }
    }
}
