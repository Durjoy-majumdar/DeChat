package com.tencent.tav.player;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tav.core.AudioCompositionDecoderTrack;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.logger.Logger;

public class PlayerThreadAudio implements Handler.Callback {
    private static final String TAG = "PlayerThreadAudio";
    private AudioCompositionDecoderTrack audioDecoderTrack;
    public volatile CMSampleState currentPlayingState = new CMSampleState();
    public volatile long lastSyncMessgeId = -1;
    private AudioTrackWrapper mAudioTrack;
    private boolean mLooper;
    private Handler mMainHandler;
    private Handler mPlayHandler;
    private int mStatus = 1;
    private HandlerThread mThread;
    private Handler mVideoHandler;
    private float rate = 1.0f;
    private float volume = 1.0f;

    public PlayerThreadAudio(AudioCompositionDecoderTrack audioCompositionDecoderTrack, Handler handler, Handler handler2) {
        this.audioDecoderTrack = audioCompositionDecoderTrack;
        this.mMainHandler = handler;
        this.mVideoHandler = handler2;
        initThread();
    }

    private void actionPrepare() {
        if (this.audioDecoderTrack != null) {
            updateStatus(2);
            releaseAudioTrack();
        }
    }

    private String catLog(int i) {
        return PlayerThread.map.mo162805e(i, null);
    }

    private void initThread() {
        HandlerThread handlerThread = new HandlerThread("PlayerAudioThread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mPlayHandler = new Handler(this.mThread.getLooper(), this);
    }

    private void pause() {
        if (this.mStatus == 2) {
            this.mLooper = false;
            this.currentPlayingState = new CMSampleState();
            removePendingMessage(12);
        }
    }

    private void play(Object obj) {
        if (this.mStatus != 1) {
            this.mLooper = true;
            if ((obj instanceof CMTime) && Math.abs(((CMTime) obj).getTimeUs() - this.currentPlayingState.getTime().getTimeUs()) > 100000) {
                seekTo(obj);
            }
            if (this.mStatus == 3) {
                updateStatus(2);
            }
            sendMessage(12, AssetExtension.SCENE_PLAY, System.currentTimeMillis());
        }
    }

    private void playerFinish() {
        this.currentPlayingState = new CMSampleState();
        this.audioDecoderTrack.seekTo(CMTime.CMTimeZero, false, true);
        this.mLooper = false;
        updateStatus(3);
        removePendingMessage(12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readSample() {
        /*
            r9 = this;
            com.tencent.tav.core.AudioCompositionDecoderTrack r0 = r9.audioDecoderTrack
            if (r0 == 0) goto L_0x013f
            boolean r1 = r9.mLooper
            if (r1 != 0) goto L_0x000a
            goto L_0x013f
        L_0x000a:
            float r1 = r9.rate
            r0.setRate(r1)
            r0 = -2
            com.tencent.tav.coremedia.CMSampleState r0 = com.tencent.tav.coremedia.CMSampleState.fromError(r0)
            java.lang.String r1 = "PlayerThreadAudio"
            java.lang.String r2 = "readSample start"
            r9.m144656v(r1, r2)
            r2 = 0
            com.tencent.tav.core.AudioCompositionDecoderTrack r3 = r9.audioDecoderTrack     // Catch:{ Exception -> 0x003e }
            com.tencent.tav.coremedia.CMSampleBuffer r3 = r3.readSample()     // Catch:{ Exception -> 0x003e }
            com.tencent.tav.coremedia.CMSampleState r0 = r3.getState()     // Catch:{ Exception -> 0x003c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c }
            r4.<init>()     // Catch:{ Exception -> 0x003c }
            java.lang.String r5 = "readSample finish "
            r4.append(r5)     // Catch:{ Exception -> 0x003c }
            r4.append(r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x003c }
            r9.m144656v(r1, r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x0045
        L_0x003c:
            r4 = move-exception
            goto L_0x0040
        L_0x003e:
            r4 = move-exception
            r3 = r2
        L_0x0040:
            java.lang.String r5 = "java.lang.IllegalStateException: buffer was freed"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r5, (java.lang.Throwable) r4)
        L_0x0045:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "processFrame() called sampleState--> "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r9.m144656v(r1, r4)
            com.tencent.tav.player.AudioTrackWrapper r4 = r9.mAudioTrack
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "processFrame() called new mediaFormat"
            r9.m144656v(r1, r4)
            com.tencent.tav.player.AudioTrackWrapper r4 = new com.tencent.tav.player.AudioTrackWrapper
            r5 = 44100(0xac44, float:6.1797E-41)
            r6 = 1
            r4.<init>(r5, r6)
            r9.mAudioTrack = r4
            float r5 = r9.volume
            r4.setVolume(r5)
        L_0x0072:
            r4 = 3
            long[] r4 = new long[r4]
            r4 = {-1, -3, -100} // fill-array
            boolean r4 = r0.stateMatchingTo(r4)
            if (r4 != 0) goto L_0x0135
            com.tencent.tav.coremedia.CMTime r4 = r0.getTime()
            com.tencent.tav.core.AudioCompositionDecoderTrack r5 = r9.audioDecoderTrack
            com.tencent.tav.coremedia.CMTime r5 = r5.getDuration()
            boolean r4 = r4.bigThan(r5)
            if (r4 == 0) goto L_0x0090
            goto L_0x0135
        L_0x0090:
            long r4 = r0.getStateCode()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0108
            if (r3 == 0) goto L_0x0108
            r4 = 0
            java.nio.ByteBuffer r5 = r3.getSampleByteBuffer()     // Catch:{ Exception -> 0x00d8 }
            if (r5 == 0) goto L_0x00de
            r5.position(r4)     // Catch:{ Exception -> 0x00d8 }
            int r6 = r5.limit()     // Catch:{ Exception -> 0x00d8 }
            byte[] r2 = new byte[r6]     // Catch:{ Exception -> 0x00d8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8 }
            r6.<init>()     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r7 = "read sample thread: "
            r6.append(r7)     // Catch:{ Exception -> 0x00d8 }
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00d8 }
            long r7 = r7.getId()     // Catch:{ Exception -> 0x00d8 }
            r6.append(r7)     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r7 = " "
            r6.append(r7)     // Catch:{ Exception -> 0x00d8 }
            com.tencent.tav.coremedia.CMTime r3 = r3.getTime()     // Catch:{ Exception -> 0x00d8 }
            r6.append(r3)     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x00d8 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r1, r3)     // Catch:{ Exception -> 0x00d8 }
            r5.get(r2)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00de
        L_0x00d8:
            r3 = move-exception
            java.lang.String r5 = "readSample: "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r5, (java.lang.Throwable) r3)
        L_0x00de:
            if (r2 == 0) goto L_0x0103
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "processFrame() called run audioData length audioData--"
            r3.append(r5)
            int r5 = r2.length
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r9.m144656v(r1, r3)
            com.tencent.tav.core.AudioCompositionDecoderTrack r3 = r9.audioDecoderTrack
            com.tencent.tav.coremedia.CMTime r5 = com.tencent.tav.coremedia.CMTime.CMTimeInvalid
            r3.asyncReadNextSample(r5)
            com.tencent.tav.player.AudioTrackWrapper r3 = r9.mAudioTrack
            int r5 = r2.length
            r3.writeData(r2, r4, r5)
            goto L_0x0108
        L_0x0103:
            java.lang.String r2 = "processFrame() called run audioData length exception"
            r9.m144656v(r1, r2)
        L_0x0108:
            r9.currentPlayingState = r0
            boolean r0 = r9.mLooper
            if (r0 == 0) goto L_0x012f
            float r0 = r9.rate
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x012f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "processFrame() called run looper "
            r0.append(r2)
            com.tencent.tav.coremedia.CMSampleState r2 = r9.currentPlayingState
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.m144656v(r1, r0)
            r9.scheduleNextWork()
            goto L_0x013f
        L_0x012f:
            java.lang.String r0 = "processFrame() not run looper"
            r9.m144656v(r1, r0)
            goto L_0x013f
        L_0x0135:
            java.lang.String r2 = "processFrame() called end of stream"
            r9.m144656v(r1, r2)
            r9.playerFinish()
            r9.currentPlayingState = r0
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.player.PlayerThreadAudio.readSample():void");
    }

    private void release() {
        releaseAudioTrack();
        removePendingMessage(new int[0]);
        updateStatus(1);
        try {
            Logger.m144643e(TAG, "quit: PlayerThreadAudio " + this);
            this.mThread.quit();
            this.mThread = null;
            synchronized (this.mVideoHandler) {
                this.mVideoHandler.sendEmptyMessage(PlayerThread.ACTION_QUIT);
            }
        } catch (Exception e) {
            try {
                Logger.m144644e(TAG, "release error-->", (Throwable) e);
                synchronized (this.mVideoHandler) {
                    this.mVideoHandler.sendEmptyMessage(PlayerThread.ACTION_QUIT);
                }
            } catch (Throwable th) {
                synchronized (this.mVideoHandler) {
                    this.mVideoHandler.sendEmptyMessage(PlayerThread.ACTION_QUIT);
                    this.mPlayHandler = null;
                    this.mVideoHandler = null;
                    throw th;
                }
            }
        }
        this.mPlayHandler = null;
        this.mVideoHandler = null;
    }

    private void releaseAudioTrack() {
        AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.stop();
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    private void removePendingMessage(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mPlayHandler.removeCallbacksAndMessages((Object) null);
            return;
        }
        for (int removeMessages : iArr) {
            this.mPlayHandler.removeMessages(removeMessages);
        }
    }

    private void scheduleNextWork() {
        sendMessage(12, "schedule next", System.currentTimeMillis());
    }

    private void seekTo(Object obj) {
        if (obj instanceof PlayerMessage) {
            obj = ((PlayerMessage) obj).bizMsg1;
        }
        if (obj instanceof CMTime) {
            CMTime cMTime = (CMTime) obj;
            this.currentPlayingState = new CMSampleState(cMTime);
            this.audioDecoderTrack.seekTo(cMTime, false, true);
        }
        AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.flush();
        }
    }

    private void setVolume(Object obj) {
        float floatValue = obj instanceof PlayerMessage ? ((Float) ((PlayerMessage) obj).bizMsg1).floatValue() : obj instanceof Float ? ((Float) obj).floatValue() : 1.0f;
        if (floatValue >= 0.0f && floatValue <= 1.0f) {
            setVolumeToAudioTrack(floatValue);
        }
    }

    private void setVolumeToAudioTrack(float f) {
        this.volume = f;
        AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.setVolume(f);
        }
    }

    private void stop(boolean z) {
        if (z) {
            removePendingMessage(12);
            this.mLooper = false;
            this.currentPlayingState = new CMSampleState();
        }
        updateStatus(1);
        releaseAudioTrack();
    }

    private void updateStatus(int i) {
        this.mStatus = i;
    }

    /* renamed from: v */
    private void m144656v(String str, String str2) {
        Logger.m144648v(str, str2);
    }

    public CMTime getCurrentPlayingState() {
        return this.currentPlayingState.getTime();
    }

    public boolean handleMessage(Message message) {
        Object obj = message.obj;
        PlayerMessage playerMessage = null;
        PlayerMessage playerMessage2 = obj == null ? null : (PlayerMessage) obj;
        Object obj2 = playerMessage2 != null ? playerMessage2.bizMsg1 : null;
        StringBuilder sb = new StringBuilder();
        sb.append("handleMessage() called with: msg = [");
        sb.append(catLog(message.what));
        sb.append(message.what);
        sb.append("]--status-->");
        sb.append(this.mStatus);
        sb.append("--from-->");
        if (playerMessage2 != null) {
            playerMessage = playerMessage2;
        }
        sb.append(playerMessage);
        sb.append(" targetObj = ");
        sb.append(obj2);
        m144656v(TAG, sb.toString());
        try {
            int i = message.what;
            if (i == -1) {
                playerFinish();
            } else if (i != 12) {
                switch (i) {
                    case 1:
                        actionPrepare();
                        break;
                    case 2:
                        play(obj2);
                        break;
                    case 3:
                        pause();
                        break;
                    case 4:
                        stop(false);
                        break;
                    case 5:
                        seekTo(obj2);
                        break;
                    case 6:
                        release();
                        break;
                    case 7:
                        setVolume(obj2);
                        break;
                }
            } else {
                readSample();
            }
            if (playerMessage2 != null && !TextUtils.isEmpty(playerMessage2.form) && playerMessage2.form.startsWith("syncAudioStatus")) {
                Logger.m144641d(TAG, "handleMessage:  SyncMessageId = " + playerMessage2.msgId + ", what = " + message.what);
                this.lastSyncMessgeId = playerMessage2.msgId;
            }
            return true;
        } catch (Exception e) {
            Logger.m144644e(TAG, "handleMessage: error", (Throwable) e);
            if (playerMessage2 != null && !TextUtils.isEmpty(playerMessage2.form) && playerMessage2.form.startsWith("syncAudioStatus")) {
                Logger.m144641d(TAG, "handleMessage:  SyncMessageId = " + playerMessage2.msgId + ", what = " + message.what);
                this.lastSyncMessgeId = playerMessage2.msgId;
            }
            return false;
        } catch (Throwable th) {
            if (playerMessage2 != null && !TextUtils.isEmpty(playerMessage2.form) && playerMessage2.form.startsWith("syncAudioStatus")) {
                Logger.m144641d(TAG, "handleMessage:  SyncMessageId = " + playerMessage2.msgId + ", what = " + message.what);
                this.lastSyncMessgeId = playerMessage2.msgId;
            }
            throw th;
        }
    }

    public boolean isFinished() {
        return 3 == this.mStatus && this.currentPlayingState.isInvalid();
    }

    public void sendMessage(int i, Object obj, String str, long j) {
        m144656v(TAG, "sendMessage() called with: what = [" + catLog(i) + "], obj = [" + obj + "], from = [" + str + "]");
        Handler handler = this.mPlayHandler;
        if (handler != null && this.mThread != null) {
            if ((i == 3 || i == -1 || i == 5 || i == 6) && handler.hasMessages(12)) {
                this.mPlayHandler.removeMessages(12);
                sendMessage(12, "schedule next", System.currentTimeMillis());
            }
            this.mPlayHandler.obtainMessage(i, new PlayerMessage(obj, str, j)).sendToTarget();
        }
    }

    public void sendMessageDelay(int i, long j, String str, long j2) {
        m144656v(TAG, "sendMessageDelay() called with: what = [" + catLog(i) + "], delay = [" + j + "], from = [" + str + "]");
        if (this.mPlayHandler != null) {
            Message message = new Message();
            message.what = i;
            message.obj = new PlayerMessage((Object) null, str, j2);
            this.mPlayHandler.sendMessageDelayed(message, j);
        }
    }

    public void setRate(float f) {
        this.rate = Math.abs(f);
    }

    public void update(AudioCompositionDecoderTrack audioCompositionDecoderTrack) {
        this.audioDecoderTrack = audioCompositionDecoderTrack;
    }

    @Deprecated
    public void updateComposition(AudioCompositionDecoderTrack audioCompositionDecoderTrack) {
        sendMessage(4, "updateComposition", System.currentTimeMillis());
        sendMessage(1, audioCompositionDecoderTrack, "updateComposition", System.currentTimeMillis());
    }

    public void sendMessage(int i, String str, long j) {
        m144656v(TAG, "sendMessage() called with: what = [" + catLog(i) + "], from = [" + str + "]");
        Handler handler = this.mPlayHandler;
        if (handler != null && this.mThread != null) {
            handler.obtainMessage(i, new PlayerMessage((Object) null, str, j)).sendToTarget();
        }
    }
}
