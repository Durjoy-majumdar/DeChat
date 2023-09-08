package com.tencent.tav.player;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.FocusMeteringAction;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.C106896Utils;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tav.core.AudioCompositionDecoderTrack;
import com.tencent.tav.core.CGMathFunctions;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.Filter;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.LookUpFilter;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.player.IPlayer;
import com.tencent.tav.report.PreviewReportSession;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import p1042u.C111060j;

public class PlayerThread implements Handler.Callback {
    public static final int ACTION_FINISH = -1;
    public static final int ACTION_GET_TAV_EXTRA_INFO = 25;
    public static final int ACTION_PAUSE = 3;
    public static final int ACTION_PLAY = 2;
    public static final int ACTION_PREPARE = 1;
    public static final int ACTION_QUIT = 850;
    public static final int ACTION_READ_SAMPLE = 12;
    public static final int ACTION_READ_SNAP_SHOOT_BITMAP = 24;
    public static final int ACTION_REFRESH_SURFACE = 26;
    public static final int ACTION_RELEASE = 6;
    public static final int ACTION_SEEK = 5;
    public static final int ACTION_SEEK_PRE_SAMPLE = 9;
    public static final int ACTION_SET_VOLUME = 7;
    public static final int ACTION_STOP = 4;
    public static final int ACTION_UPDATE_ALLPROPERTIES = 20;
    public static final int ACTION_UPDATE_AUDIOCLIP_PROPERTIES = 22;
    public static final int ACTION_UPDATE_AUDIOVOLUME_PROPERTIES = 23;
    public static final int ACTION_UPDATE_COMPOSITION = 11;
    public static final int ACTION_UPDATE_PROPERTIES = 10;
    public static final int ACTION_UPDATE_SIZE = 21;
    public static final int STATUS_FINISH = 3;
    public static final int STATUS_INIT_CODEC = 2;
    public static final int STATUS_NONE = 1;
    public static final String TAG = "PlayerThreadMain";
    private static final long UNIT_TIME = 1000;
    public static C111060j<String> map;
    private AudioCompositionDecoderTrack aDecoderTrack;
    private long decoderConsumerTimeUs = 0;
    private boolean enableLut;
    private Filter filter;
    private CMTime frameDuration = new CMTime(1, 30);
    private CGRect glViewportRect;
    private volatile long lastSyncMessageId = 0;
    private VideoComposition.RenderLayoutMode layoutMode;
    private Bitmap lutBitmap;
    private PlayerThreadAudio mAudioThread;
    private Surface mDisplayTarget;
    private volatile boolean mEnableScheduleNext = false;
    /* access modifiers changed from: private */
    public boolean mLooper;
    private Handler mMainHandler;
    private boolean mPause;
    private Handler mPlayHandler;
    private CMTimeRange mPlayRange;
    private Player mPlayer;
    private PlayerItem mPlayerItem;
    private CMTime mPosition = CMTime.CMTimeZero;
    private long mStartTime;
    private int mStatus = 1;
    private HandlerThread mThread;
    private OnGetTavExtraListener onGetTavExtraListener;
    private OnReadSnapShootListener onReadSnapShootListener;
    private float rate = 1.0f;
    private RenderContext renderContext;
    private RenderContextParams renderContextParams;
    private CGSize renderSize;
    private PreviewReportSession reportSession;
    private long startTimeUsMark = getCurrentUsTime();
    private CGSize surfaceSize;
    private IDecoderTrack vDecoderTrack;

    /* renamed from: com.tencent.tav.player.PlayerThread$2 */
    public static /* synthetic */ class C1069202 {

        /* renamed from: $SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode */
        public static final /* synthetic */ int[] f320110x9b0bbeb6;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.tav.core.composition.VideoComposition$RenderLayoutMode[] r0 = com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f320110x9b0bbeb6 = r0
                com.tencent.tav.core.composition.VideoComposition$RenderLayoutMode r1 = com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.aspectFit     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f320110x9b0bbeb6     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tav.core.composition.VideoComposition$RenderLayoutMode r1 = com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.aspectFill     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.player.PlayerThread.C1069202.<clinit>():void");
        }
    }

    static {
        C111060j<String> jVar = new C111060j<>(10);
        map = jVar;
        jVar.mo162807g(1, "初始化");
        map.mo162807g(2, "播放");
        map.mo162807g(3, "暂停");
        map.mo162807g(4, "停止");
        map.mo162807g(5, "拖动");
        map.mo162807g(12, "读取下一帧");
        map.mo162807g(6, "结束线程");
        map.mo162807g(26, "刷新渲染");
    }

    public PlayerThread(IDecoderTrack iDecoderTrack, AudioCompositionDecoderTrack audioCompositionDecoderTrack, CGSize cGSize, Surface surface, Handler handler, Player player) {
        this.vDecoderTrack = iDecoderTrack;
        this.aDecoderTrack = audioCompositionDecoderTrack;
        this.mDisplayTarget = surface;
        this.mMainHandler = handler;
        this.renderSize = cGSize;
        if (iDecoderTrack != null) {
            this.frameDuration = iDecoderTrack.getFrameDuration();
        }
        this.mPlayer = player;
        this.mPlayerItem = player.getCurrentItem();
        initThread();
    }

    private void applyViewport() {
        CGRect cGRect;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null && (cGRect = this.glViewportRect) != null && cGRect.origin != null && cGRect.size != null) {
            renderContext2.updateViewport(cGRect);
        }
    }

    private String catLog(int i) {
        String e = map.mo162805e(i, null);
        return TextUtils.isEmpty(e) ? String.valueOf(i) : e;
    }

    private void checkCopyPixelBuffer(CMTime cMTime) {
        if (this.onReadSnapShootListener != null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.renderContext.width() * this.renderContext.height() * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.rewind();
            GLES20.glReadPixels(0, 0, this.renderContext.width(), this.renderContext.height(), NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
            Bitmap createBitmap = Bitmap.createBitmap(this.renderContext.width(), this.renderContext.height(), Bitmap.Config.ARGB_4444);
            allocateDirect.rewind();
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            this.onReadSnapShootListener.onSuccess(C106896Utils.flipYBitmap(createBitmap), cMTime);
            this.onReadSnapShootListener = null;
        }
    }

    private long getCurrentUsTime() {
        return System.nanoTime() / 1000;
    }

    private CMTime getLastSeekPosAndRemoveOther() {
        MessageQueue messageQueue;
        CMTime cMTime = CMTime.CMTimeInvalid;
        if (Build.VERSION.SDK_INT >= 23) {
            messageQueue = this.mPlayHandler.getLooper().getQueue();
        } else {
            Field declaredField = Handler.class.getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            messageQueue = (MessageQueue) declaredField.get(this.mPlayHandler);
        }
        Field declaredField2 = MessageQueue.class.getDeclaredField("mMessages");
        declaredField2.setAccessible(true);
        Message message = (Message) declaredField2.get(messageQueue);
        ArrayList arrayList = new ArrayList();
        while (message != null) {
            if (message.what == 5) {
                Object obj = message.obj;
                if (obj instanceof PlayerMessage) {
                    cMTime = (CMTime) ((PlayerMessage) obj).bizMsg1;
                    arrayList.add(message);
                    Field declaredField3 = Message.class.getDeclaredField("next");
                    declaredField3.setAccessible(true);
                    message = (Message) declaredField3.get(message);
                }
            }
            if (message.getTarget() == this.mPlayHandler) {
                break;
            }
            Field declaredField32 = Message.class.getDeclaredField("next");
            declaredField32.setAccessible(true);
            message = (Message) declaredField32.get(message);
        }
        if (cMTime != CMTime.CMTimeInvalid) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Message message2 = (Message) it.next();
                this.mPlayHandler.removeMessages(message2.what, message2.obj);
            }
        }
        return cMTime;
    }

    private long getWaitTime(CMTime cMTime, boolean z, boolean z2) {
        long timeUs = this.frameDuration.getTimeUs();
        long timeUs2 = cMTime.getTimeUs();
        if (z || z2) {
            Logger.m144641d("PlayerThreadMain", "getWaitTime - 0 " + z + "  |  " + z2);
            return 0;
        }
        long abs = (long) (((float) timeUs) / Math.abs(this.rate));
        long j = abs - this.decoderConsumerTimeUs;
        Logger.m144648v("PlayerThreadMain", "getWaitTime--position-->" + timeUs2 + " rate = " + this.rate + "--decoderConsumerTimeUs-->" + this.decoderConsumerTimeUs + "--frameDurationMs-->" + timeUs + "--realTime-->" + abs + "--nextFrameTime-->" + (timeUs2 + abs) + "--sleepTime-->" + j + "  mStartTime = " + this.mStartTime);
        return j;
    }

    private void initDecoderTrack(Object obj) {
        CGSize cGSize;
        if (this.renderContext == null && this.mDisplayTarget != null) {
            RenderContextParams renderContextParams2 = this.renderContextParams;
            EGLContext eGLContext = (renderContextParams2 == null || !(renderContextParams2.getParam("share_context") instanceof EGLContext)) ? null : (EGLContext) this.renderContextParams.getParam("share_context");
            if (eGLContext != null) {
                CGSize cGSize2 = this.surfaceSize;
                this.renderContext = new RenderContext((int) cGSize2.width, (int) cGSize2.height, this.mDisplayTarget, eGLContext);
            } else {
                CGSize cGSize3 = this.surfaceSize;
                this.renderContext = new RenderContext((int) cGSize3.width, (int) cGSize3.height, this.mDisplayTarget);
            }
            this.renderContext.setParams(this.renderContextParams);
        }
        VideoComposition videoComposition = this.mPlayerItem.getVideoComposition();
        if (videoComposition != null) {
            this.renderSize = videoComposition.getRenderSize();
            this.layoutMode = videoComposition.getRenderLayoutMode();
        }
        RenderContext renderContext2 = this.renderContext;
        if (!(renderContext2 == null || (cGSize = this.renderSize) == null)) {
            renderContext2.setHeight((int) cGSize.height);
            this.renderContext.setWidth((int) this.renderSize.width);
        }
        initViewport();
        updateProgressPreNextAction(this.mPosition);
        IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        if (iDecoderTrack != null) {
            try {
                CMTime cMTime = this.frameDuration;
                iDecoderTrack.setFrameRate((int) (((long) cMTime.timeScale) / cMTime.getValue()));
                this.vDecoderTrack.start(this.renderContext);
                if (!this.mLooper) {
                    if (this.mPosition == CMTime.CMTimeInvalid) {
                        this.mPosition = this.vDecoderTrack.getDuration();
                    }
                    this.vDecoderTrack.seekTo(this.mPosition, false, true);
                    readSample(-1);
                }
                onCompositionUpdate(obj, true);
                Logger.m144648v("PlayerThreadMain", "prepare: init codec-->" + Thread.currentThread().getName() + "--vDecoderTrack-->" + this.vDecoderTrack);
            } catch (Exception e) {
                Logger.m144648v("PlayerThreadMain", "init composition cause exception: " + e);
                this.vDecoderTrack.release();
                this.vDecoderTrack = null;
                onCompositionUpdate(obj, false);
            }
        } else {
            onCompositionUpdate(obj, false);
        }
        AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.start();
            this.aDecoderTrack.seekTo(this.mPosition, false, false);
        }
        updateStatus(2);
        synAudioComposition();
        notifyProgressChange();
    }

    private void initThread() {
        HandlerThread handlerThread = new HandlerThread("PlayerVideoThread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mPlayHandler = new Handler(this.mThread.getLooper(), this);
        this.mAudioThread = new PlayerThreadAudio(this.aDecoderTrack, this.mMainHandler, getPlayHandler());
    }

    private void initViewport() {
        CGSize cGSize = this.renderSize;
        if (cGSize == null) {
            cGSize = this.surfaceSize;
        }
        if (this.layoutMode == null) {
            this.glViewportRect = CGMathFunctions.initGLViewportDefault(this.surfaceSize, cGSize);
        } else {
            initViewportByLayoutMode(cGSize);
        }
        applyViewport();
        this.mMainHandler.obtainMessage(3, this.glViewportRect).sendToTarget();
    }

    private void initViewportByLayoutMode(CGSize cGSize) {
        int i = C1069202.f320110x9b0bbeb6[this.layoutMode.ordinal()];
        if (i == 1) {
            this.glViewportRect = CGMathFunctions.initGLViewportFit(this.surfaceSize, cGSize);
        } else if (i != 2) {
            this.glViewportRect = CGMathFunctions.initGLViewportDefault(this.surfaceSize, cGSize);
        } else {
            this.glViewportRect = CGMathFunctions.initGLViewportFill(this.surfaceSize, cGSize);
        }
    }

    private void isNeedEnsureLooper(int i) {
        if (i == 2) {
            this.mLooper = true;
        }
    }

    private boolean needNotifyProgressChange() {
        MessageQueue messageQueue;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                messageQueue = this.mPlayHandler.getLooper().getQueue();
            } else {
                Field declaredField = Handler.class.getDeclaredField("mQueue");
                declaredField.setAccessible(true);
                messageQueue = (MessageQueue) declaredField.get(this.mPlayHandler);
            }
            Field declaredField2 = MessageQueue.class.getDeclaredField("mMessages");
            declaredField2.setAccessible(true);
            Message message = (Message) declaredField2.get(messageQueue);
            if (message != null) {
                int i = message.what;
                if (i == 3 || i == 4 || i == 1 || i == 850 || i == 6) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Logger.m144644e("PlayerThreadMain", "needNotifyProgressChange", (Throwable) e);
            return false;
        }
    }

    private void notifyProgressChange() {
        if (needNotifyProgressChange()) {
            this.mMainHandler.obtainMessage(2, this.mPosition).sendToTarget();
        }
    }

    private void notifyStatus(IPlayer.PlayerStatus playerStatus, String str) {
        this.mMainHandler.obtainMessage(1, new PlayerStatusMsg(playerStatus, str)).sendToTarget();
    }

    private void onCompositionUpdate(Object obj, boolean z) {
        if (obj instanceof OnCompositionUpdateListener) {
            ((OnCompositionUpdateListener) obj).onUpdated(this.mPlayer, z);
        }
    }

    private void pause() {
        this.mLooper = false;
        this.mPause = true;
        enableScheduleNext(false);
        removePendingMessage(12);
        notifyStatus(IPlayer.PlayerStatus.PAUSED, "");
    }

    private void play() {
        int i = this.mStatus;
        if (i != 1) {
            if (i == 3) {
                IDecoderTrack iDecoderTrack = this.vDecoderTrack;
                if (iDecoderTrack != null) {
                    if (this.mPosition.smallThan(iDecoderTrack.getDuration())) {
                        this.vDecoderTrack.seekTo(this.mPosition, false, true);
                    } else {
                        this.vDecoderTrack.seekTo(CMTime.CMTimeZero, false, true);
                    }
                }
                updateStatus(2);
            }
            removePendingMessage(12);
            this.mLooper = true;
            enableScheduleNext(true);
            sendMessage(12, 2, AssetExtension.SCENE_PLAY);
            notifyStatus(IPlayer.PlayerStatus.PLAYING, "");
            Logger.m144648v("PlayerThreadMain", "playm() called start play-->" + this.mStatus);
        } else if (this.vDecoderTrack != null || this.aDecoderTrack != null) {
            sendMessage(1, "not can play");
            sendMessage(2, "not can play");
        }
    }

    private void playerFinish() {
        Logger.m144641d("PlayerThreadMain", "playFinish");
        IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        updateProgressPreNextAction(iDecoderTrack != null ? iDecoderTrack.getDuration() : this.mPlayer.duration());
        notifyProgressChange();
        updateStatus(3);
        syncAudioOtherMsg(-1, (Object) null);
        IDecoderTrack iDecoderTrack2 = this.vDecoderTrack;
        if (iDecoderTrack2 != null) {
            iDecoderTrack2.seekTo(CMTime.CMTimeZero, false, true);
        }
        this.mStartTime = 0;
        this.mLooper = false;
        notifyStatus(IPlayer.PlayerStatus.FINISHED, "");
    }

    private void prepare(Object obj) {
        if (this.mStatus == 1) {
            initDecoderTrack(obj);
            enableScheduleNext(true);
            return;
        }
        sendMessage(4, Boolean.FALSE, "prepare");
        sendMessage(1, obj, "prepare");
    }

    private void readSample(int i) {
        readSample(i, (this.mAudioThread.lastSyncMessgeId > this.lastSyncMessageId ? 1 : (this.mAudioThread.lastSyncMessgeId == this.lastSyncMessageId ? 0 : -1)) == 0 ? this.mAudioThread.getCurrentPlayingState() : CMTime.CMTimeInvalid);
    }

    private CMSampleBuffer readSampleBuffer(int i, CMTime cMTime, CMTime cMTime2) {
        if (i == 5) {
            return this.vDecoderTrack.seekTo(cMTime, true, true);
        }
        CMTime multi = this.frameDuration.multi(this.rate);
        if (cMTime2.smallThan(cMTime.sub(multi.multi(3.0f)))) {
            Logger.m144648v("PlayerThreadMain", "readSampleBuffer: sampleTime = // " + cMTime2.add(this.frameDuration));
            return this.vDecoderTrack.readSample(cMTime.divide(multi).multi(multi));
        } else if (!cMTime2.bigThan(cMTime.add(multi)) || !cMTime.bigThan(CMTime.CMTimeZero) || !this.mAudioThread.isFinished()) {
            Logger.m144648v("PlayerThreadMain", "readSampleBuffer: sampleTime = " + cMTime2.add(multi));
            return this.vDecoderTrack.readSample(cMTime2.add(multi));
        } else {
            syncAudioOtherMsg(2, cMTime2);
            Logger.m144648v("PlayerThreadMain", "readSampleBuffer: sampleTime = /// " + cMTime2.add(multi));
            return this.vDecoderTrack.readSample(multi);
        }
    }

    private void refreshSurface(Callback callback) {
        if (this.mStatus != 1) {
            if (this.vDecoderTrack != null) {
                removePendingMessage(12, 26);
                IDecoderTrack iDecoderTrack = this.vDecoderTrack;
                renderSampleBuffer(iDecoderTrack.readSample(iDecoderTrack.getCurrentSampleTime()));
            }
            if (callback != null) {
                callback.call();
            }
        }
    }

    private void release(Message message) {
        Logger.m144641d("PlayerThreadMain", "release player - " + this);
        this.renderContext.makeCurrent();
        Object obj = message.obj;
        if (obj instanceof PlayerMessage) {
            Object obj2 = ((PlayerMessage) obj).bizMsg1;
            if (obj2 instanceof Runnable) {
                ((Runnable) obj2).run();
            }
        }
        removePendingMessage(new int[0]);
        releaseAudioThread(message.what, message.obj);
        updateStatus(1);
        PreviewReportSession previewReportSession = this.reportSession;
        if (previewReportSession != null) {
            previewReportSession.flush();
            this.reportSession = null;
        }
    }

    private void releaseAudioThread(int i, Object obj) {
        if (i == 6) {
            this.lastSyncMessageId = System.currentTimeMillis();
            Logger.m144641d("PlayerThreadMain", "releaseAudioThread SyncMessageId = " + this.lastSyncMessageId + "  action = " + i + "  obj =  " + obj);
            this.mAudioThread.sendMessage(i, obj, "syncAudioStatus", this.lastSyncMessageId);
        }
    }

    private void releaseComposition() {
        if (this.vDecoderTrack != null) {
            if (this.mPlayerItem.getCustomVideoCompositor() != null) {
                this.mPlayerItem.getCustomVideoCompositor().release();
            }
            this.vDecoderTrack.release();
            this.aDecoderTrack.release();
        }
    }

    private void removePendingMessage(int... iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("handleMessage() called with: removeInt = [");
        sb.append(iArr.length == 0 ? "null" : Integer.valueOf(iArr[0]));
        sb.append("]");
        Logger.m144648v("PlayerThreadMain", sb.toString());
        if (iArr.length == 0) {
            synchronized (this.mPlayHandler) {
                if (!this.mPlayHandler.hasMessages(ACTION_QUIT)) {
                    this.mPlayHandler.removeCallbacksAndMessages((Object) null);
                } else {
                    this.mPlayHandler.removeCallbacksAndMessages((Object) null);
                    this.mPlayHandler.sendEmptyMessage(ACTION_QUIT);
                }
            }
            return;
        }
        for (int removeMessages : iArr) {
            this.mPlayHandler.removeMessages(removeMessages);
        }
    }

    private void renderSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        Logger.m144648v("PlayerThreadMain", "renderSampleBuffer() called with: sampleBuffer = [" + cMSampleBuffer + "]");
        if (cMSampleBuffer.getTextureInfo() != null) {
            if (this.filter == null) {
                if (this.enableLut) {
                    this.filter = new LookUpFilter(this.lutBitmap);
                } else {
                    this.filter = new Filter();
                }
                this.filter.setRendererWidth(this.renderContext.width());
                this.filter.setRendererHeight(this.renderContext.height());
            }
            this.renderContext.makeCurrent();
            TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
            OnGetTavExtraListener onGetTavExtraListener2 = this.onGetTavExtraListener;
            if (onGetTavExtraListener2 != null) {
                onGetTavExtraListener2.getTextureInfo(textureInfo);
                return;
            }
            applyViewport();
            this.filter.setBgColor(this.mPlayer.getBgColor());
            this.filter.applyFilter(textureInfo, (Matrix) null, textureInfo.getTextureMatrix());
            checkCopyPixelBuffer(cMSampleBuffer.getTime());
            this.renderContext.setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
            this.renderContext.swapBuffers();
        }
    }

    private void scheduleNextWork(long j) {
        if (!this.mEnableScheduleNext) {
            Logger.m144646i("PlayerThreadMain", "disable scheduleNextWork ignore");
            return;
        }
        long j2 = j / 1000;
        if (j2 > 0) {
            Logger.m144648v("scheduleNextWork", "waitTime" + j2);
            sendMessageDelay(12, j2, "schedule next");
            return;
        }
        sendMessage(12, "schedule next");
    }

    private void seek(CMTime cMTime) {
        if (this.mStatus != 1) {
            CMTime cMTime2 = CMTime.CMTimeInvalid;
            try {
                cMTime2 = getLastSeekPosAndRemoveOther();
            } catch (Exception e) {
                Logger.m144644e("PlayerThreadMain", "getLastSeekPosAndRemoveOther", (Throwable) e);
            }
            if (cMTime2.getValue() > -1) {
                cMTime = cMTime2;
            }
            if (this.vDecoderTrack != null) {
                removePendingMessage(12);
                this.mPosition = cMTime;
                notifyProgressChange();
                syncAudioOtherMsg(3, cMTime);
                syncAudioOtherMsg(5, cMTime);
                readSample(5, cMTime);
                this.mPlayHandler.postDelayed(new Runnable() {
                    public void run() {
                        if (PlayerThread.this.mLooper) {
                            PlayerThread.this.syncAudioOtherMsg(2, (Object) null);
                        }
                    }
                }, 10);
                return;
            }
            syncAudioOtherMsg(5, cMTime);
        }
    }

    private void seekPreSample() {
        CMTime currentSampleTime = this.vDecoderTrack.getCurrentSampleTime();
        if (currentSampleTime != CMTime.CMTimeInvalid) {
            seek(currentSampleTime);
        }
    }

    private void stop(boolean z) {
        releaseComposition();
        Filter filter2 = this.filter;
        if (filter2 != null) {
            filter2.release();
            this.filter = null;
        }
        this.mStartTime = 0;
        enableScheduleNext(false);
        updateStatus(1);
        if (z) {
            notifyStatus(IPlayer.PlayerStatus.STOPPED, "");
            removePendingMessage(new int[0]);
            this.mLooper = false;
        }
    }

    private void synAudioComposition() {
        if (this.aDecoderTrack != null) {
            this.lastSyncMessageId = System.currentTimeMillis();
            Logger.m144641d("PlayerThreadMain", "synAudioComposition SyncMessageId = " + this.lastSyncMessageId);
            this.mAudioThread.sendMessage(1, (Object) null, "syncAudioStatus composition", this.lastSyncMessageId);
        }
    }

    /* access modifiers changed from: private */
    public void syncAudioOtherMsg(int i, Object obj) {
        if (i == 3 || i == 2 || i == 4 || i == 6 || i == 7 || i == -1 || i == 5) {
            this.lastSyncMessageId = System.currentTimeMillis();
            Logger.m144641d("PlayerThreadMain", "syncAudioOtherMsg SyncMessageId = " + this.lastSyncMessageId + "  action = " + i + "  obj = " + obj);
            this.mAudioThread.sendMessage(i, obj, "syncAudioStatus", this.lastSyncMessageId);
        }
    }

    private void syncAudioProgress() {
        AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            if (!this.mPosition.equalsTo(audioCompositionDecoderTrack.getCurrentSampleTime())) {
                this.mPosition = this.aDecoderTrack.getCurrentSampleTime();
                notifyProgressChange();
            }
            if (this.mAudioThread.isFinished()) {
                Logger.m144648v("PlayerThreadMain", "processFrame() called with: finish");
                playerFinish();
            } else if (this.mLooper) {
                scheduleNextWork(30);
                this.mPause = false;
            }
        }
    }

    private void udpateAudioVolumeProperties() {
    }

    private void updateAllProperties() {
    }

    private void updateAudioClipsProperties() {
        AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.release();
        }
        AudioCompositionDecoderTrack initAudioCompositionDecoderTrack = this.mPlayerItem.initAudioCompositionDecoderTrack();
        this.aDecoderTrack = initAudioCompositionDecoderTrack;
        initAudioCompositionDecoderTrack.start();
        this.mAudioThread.update(this.aDecoderTrack);
        if (this.mLooper) {
            syncAudioOtherMsg(2, this.mPosition);
        }
    }

    private void updateComposition(Object obj) {
        if (obj instanceof PlayerItem) {
            PlayerItem playerItem = (PlayerItem) obj;
            this.vDecoderTrack = playerItem.getRealDecoderTrack();
            this.aDecoderTrack = playerItem.getAudioCompositionDecoderTrack();
            this.mPlayerItem = playerItem;
        }
        IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        if (iDecoderTrack != null) {
            this.frameDuration = iDecoderTrack.getFrameDuration();
        }
        this.mAudioThread.update(this.aDecoderTrack);
    }

    private void updateProgressPreNextAction(CMTime cMTime) {
        this.mPosition = cMTime;
    }

    private void updateProperties() {
    }

    private void updateStatus(int i) {
        this.mStatus = i;
    }

    public void bindSurface(IDecoderTrack iDecoderTrack, PlayerLayer playerLayer) {
        this.mDisplayTarget = playerLayer.surface;
        this.vDecoderTrack = iDecoderTrack;
        this.surfaceSize = new CGSize((float) playerLayer.surfaceWidth, (float) playerLayer.surfaceHeight);
        sendMessage(1, "bind surface");
    }

    public void cancelAllPendingSeeks() {
        removePendingMessage(5);
    }

    public void enableScheduleNext(boolean z) {
        this.mEnableScheduleNext = z;
    }

    public CGRect getGlViewportRect() {
        return this.glViewportRect;
    }

    public Handler getPlayHandler() {
        return this.mPlayHandler;
    }

    public CMTime getPosition() {
        return this.mPosition;
    }

    public RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public boolean handleMessage(Message message) {
        Callback callback;
        Object obj;
        Object obj2 = message.obj;
        PlayerMessage playerMessage = obj2 == null ? null : (PlayerMessage) obj2;
        if (playerMessage != null) {
            obj = playerMessage.bizMsg1;
            callback = playerMessage.callback;
        } else {
            obj = null;
            callback = null;
        }
        int i = message.what;
        if (i != 2) {
            syncAudioOtherMsg(i, obj2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleMessage() called with: msg = [");
        sb.append(catLog(message.what));
        sb.append("]--obj-->");
        sb.append(obj);
        sb.append("--from-->");
        sb.append(playerMessage == null ? null : playerMessage.form);
        Logger.m144648v("PlayerThreadMain", sb.toString());
        if (this.mThread == null) {
            return false;
        }
        try {
            int i2 = message.what;
            if (i2 != 850) {
                switch (i2) {
                    case 1:
                        prepare(obj);
                        break;
                    case 2:
                        play();
                        break;
                    case 3:
                        pause();
                        break;
                    case 4:
                        stop(obj == null ? false : ((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        seek((CMTime) obj);
                        break;
                    case 6:
                        release(message);
                        break;
                    default:
                        switch (i2) {
                            case 9:
                                seekPreSample();
                                break;
                            case 10:
                                updateProperties();
                                break;
                            case 11:
                                UpdateCompositionMessage updateCompositionMessage = (UpdateCompositionMessage) obj;
                                stop(true);
                                releaseComposition();
                                if (updateCompositionMessage != null) {
                                    updateComposition(updateCompositionMessage.playerItem);
                                    prepare(updateCompositionMessage.updateListener);
                                    break;
                                }
                                break;
                            case 12:
                                if (this.mPlayRange == null || this.mPosition.add(this.frameDuration).smallThan(this.mPlayRange.getEnd())) {
                                    if (this.mEnableScheduleNext) {
                                        readSample(obj == null ? 0 : ((Integer) obj).intValue());
                                        break;
                                    }
                                } else {
                                    seek(this.mPlayRange.getStart());
                                    break;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 20:
                                        updateAllProperties();
                                        break;
                                    case 21:
                                        if (obj instanceof CGSize) {
                                            this.surfaceSize = (CGSize) obj;
                                            initViewport();
                                            break;
                                        }
                                        break;
                                    case 22:
                                        updateAudioClipsProperties();
                                        break;
                                    case 23:
                                        udpateAudioVolumeProperties();
                                        break;
                                    case 24:
                                        if (obj instanceof OnReadSnapShootListener) {
                                            this.onReadSnapShootListener = (OnReadSnapShootListener) obj;
                                            break;
                                        }
                                        break;
                                    case 25:
                                        if (obj instanceof OnGetTavExtraListener) {
                                            this.onGetTavExtraListener = (OnGetTavExtraListener) obj;
                                            break;
                                        }
                                        break;
                                    case 26:
                                        refreshSurface((Callback) obj);
                                        break;
                                }
                        }
                }
            } else {
                Logger.m144646i("PlayerThreadMain", "quit: PlayerThreadMain " + this);
                removePendingMessage(new int[0]);
                this.mThread.quit();
                this.mThread = null;
                this.vDecoderTrack.release();
                this.aDecoderTrack.release();
                this.renderContext.release();
                this.renderContext = null;
                this.vDecoderTrack = null;
                this.aDecoderTrack = null;
                this.mPlayHandler.removeCallbacksAndMessages((Object) null);
            }
            if (callback != null) {
                callback.call();
            }
            return true;
        } catch (Exception e) {
            Logger.m144648v("PlayerThreadMain", "player error:" + Log.getStackTraceString(e));
            return false;
        }
    }

    public boolean hasMessage(int i) {
        Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return false;
        }
        return handler.hasMessages(i);
    }

    public void removePendingUpdateCompositionMessage() {
        removePendingMessage(11);
    }

    public void removeReadSampleMessage() {
        if (this.mStatus != 1 && this.vDecoderTrack != null) {
            removePendingMessage(12, 26);
        }
    }

    public void sendMessage(int i, Object obj, String str, Callback callback) {
        Logger.m144641d("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i) + "], obj = [" + obj + "], from = [" + str + "]");
        Handler handler = this.mPlayHandler;
        if (handler != null && this.mThread != null) {
            handler.obtainMessage(i, new PlayerMessage(obj, str, System.currentTimeMillis(), callback)).sendToTarget();
        }
    }

    public void sendMessageDelay(int i, long j, String str) {
        Logger.m144648v("PlayerThreadMain", "sendMessageDelay() called with: what = [" + catLog(i) + "], delay = [" + j + "], from = [" + str + "]");
        if (this.mPlayHandler != null) {
            Message message = new Message();
            message.what = i;
            message.obj = new PlayerMessage((Object) null, str, System.currentTimeMillis());
            this.mPlayHandler.sendMessageDelayed(message, j);
        }
    }

    public void setEnableLut(boolean z, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.enableLut = false;
            return;
        }
        this.enableLut = z;
        this.lutBitmap = bitmap;
        Filter filter2 = this.filter;
        if (filter2 != null && (filter2 instanceof LookUpFilter)) {
            ((LookUpFilter) filter2).setUseLut(z, bitmap);
        }
    }

    public void setFrameDuration(CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setPlayRange(CMTimeRange cMTimeRange) {
        this.mPlayRange = cMTimeRange;
    }

    public void setRate(float f) {
        this.rate = f;
        this.mAudioThread.setRate(f);
    }

    public void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.setParams(renderContextParams2);
        }
    }

    public void updatePositionRightAway(CMTime cMTime) {
        this.mPosition = cMTime;
    }

    private void readSample(int i, CMTime cMTime) {
        int i2 = i;
        CMTime cMTime2 = cMTime;
        if (this.vDecoderTrack == null) {
            syncAudioProgress();
            return;
        }
        if (this.reportSession == null) {
            this.reportSession = new PreviewReportSession();
        }
        try {
            long timeUs = this.frameDuration.divide(this.rate).getTimeUs() - (getCurrentUsTime() - this.startTimeUsMark);
            if (timeUs > 0) {
                Thread.sleep(timeUs / 1000);
            }
        } catch (Throwable th) {
            Logger.m144644e("PlayerThreadMain", "readSample", th);
        }
        this.startTimeUsMark = getCurrentUsTime();
        isNeedEnsureLooper(i);
        CMSampleState cMSampleState = new CMSampleState();
        CMTime currentSampleTime = this.vDecoderTrack.getCurrentSampleTime();
        Logger.m144648v("PlayerThreadMain", "readSample[" + i2 + "] lastPosition = " + currentSampleTime + " syncPlayingTime = " + cMTime2);
        if (i2 == 2) {
            syncAudioOtherMsg(2, currentSampleTime);
        }
        if (i2 == 5 || this.mEnableScheduleNext) {
            try {
                this.renderContext.makeCurrent();
                long nanoTime = System.nanoTime();
                CMSampleBuffer readSampleBuffer = readSampleBuffer(i2, cMTime2, currentSampleTime);
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (i2 == 5 || this.mEnableScheduleNext) {
                    long nanoTime3 = System.nanoTime();
                    renderSampleBuffer(readSampleBuffer);
                    this.reportSession.tickPreview(nanoTime2, System.nanoTime() - nanoTime3);
                    cMSampleState = readSampleBuffer.getState();
                    this.vDecoderTrack.asyncReadNextSample(cMSampleState.getTime().add(new CMTime(1, cMSampleState.getTime().timeScale)));
                    this.decoderConsumerTimeUs = getCurrentUsTime() - this.startTimeUsMark;
                    Logger.m144648v("PlayerThreadMain", "readSample() called with: messageId = [" + i2 + "]--currentSampleState-->" + cMSampleState + "--looper-->" + this.mLooper + " consumer = " + (System.currentTimeMillis() - this.startTimeUsMark));
                    if (cMSampleState.stateMatchingTo(-1, -3)) {
                        Logger.m144648v("PlayerThreadMain", "readSample() called with: finish");
                        playerFinish();
                        return;
                    }
                    boolean z = 5 == i2;
                    if (cMSampleState.getStateCode() >= 0) {
                        this.mPosition = cMSampleState.getTime();
                        if (!z && !this.mPlayHandler.hasMessages(5)) {
                            notifyProgressChange();
                        }
                    } else {
                        if (cMSampleState.stateMatchingTo(-100)) {
                            this.vDecoderTrack.seekTo(CMTime.CMTimeZero, false, true);
                        }
                        cMSampleState = new CMSampleState(currentSampleTime);
                    }
                    if (this.mLooper) {
                        boolean z2 = this.mPause;
                        this.decoderConsumerTimeUs = (getCurrentUsTime() - this.startTimeUsMark) + FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                        scheduleNextWork(getWaitTime(cMSampleState.getTime(), z, z2));
                        this.mPause = false;
                    }
                    Logger.m144648v("PlayerThreadMain", "readSample end [" + i2 + "]--looper-->" + this.mLooper + " consumer = " + (getCurrentUsTime() - this.startTimeUsMark));
                    return;
                }
                Logger.m144646i("PlayerThreadMain", "disable schedule next, ignore this render");
            } catch (Exception e) {
                Logger.m144644e("PlayerThreadMain", "readSample", (Throwable) e);
                if (e instanceof IllegalStateException) {
                    notifyStatus(IPlayer.PlayerStatus.ERROR, "解码异常");
                }
            }
        } else {
            Logger.m144646i("PlayerThreadMain", "disable schedule next, ignore this readSample");
        }
    }

    public void sendMessage(int i, Object obj, String str) {
        Logger.m144648v("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i) + "], obj = [" + obj + "], from = [" + str + "]");
        Handler handler = this.mPlayHandler;
        if (handler != null && this.mThread != null) {
            handler.obtainMessage(i, new PlayerMessage(obj, str, System.currentTimeMillis())).sendToTarget();
        }
    }

    public void sendMessage(int i, String str) {
        Logger.m144648v("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i) + "], from = [" + str + "]");
        Handler handler = this.mPlayHandler;
        if (handler != null && this.mThread != null) {
            handler.obtainMessage(i, new PlayerMessage((Object) null, str, System.currentTimeMillis())).sendToTarget();
        }
    }
}
