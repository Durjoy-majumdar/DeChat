package com.tencent.tav.decoder.decodecache;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.ITexturePool;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.TexturePool;
import com.tencent.tav.decoder.logger.Logger;
import java.util.concurrent.CountDownLatch;

class SegmentDecoderThread implements Handler.Callback {
    private static final int MSG_DECODER_FRAME = 3;
    private static final int MSG_DECODER_SEGMENT = 2;
    private static final int MSG_QUIT = 1000;
    private static final int MSG_START = 1;
    private static final String TAG = "SegmentDecoderThread";
    private CachedVideoDecoderTrack cachedVideoDecoderTrack;
    public boolean cancel = false;
    public RenderContext context;
    private Handler decoderHandler;
    private HandlerThread decoderThread;
    public IDecoderTrack decoderTrack;
    private CopyFilter filter;
    public CMSampleBuffer seekSampleBuffer;
    private volatile boolean started = false;
    public ITexturePool texturePool;

    public SegmentDecoderThread(CachedVideoDecoderTrack cachedVideoDecoderTrack2, IDecoderTrack iDecoderTrack) {
        this.cachedVideoDecoderTrack = cachedVideoDecoderTrack2;
        this.decoderTrack = iDecoderTrack;
        this.texturePool = new TexturePool();
    }

    private void decoder(DecoderSegmentMsg decoderSegmentMsg) {
        RenderContext renderContext;
        synchronized (this.cachedVideoDecoderTrack.nextFrameDecoderLock) {
            this.cancel = false;
            CacheSegment cacheSegment = decoderSegmentMsg.segment;
            Logger.m144641d(TAG, "decoder:------------------- " + decoderSegmentMsg.segment.segmentTimeRange.getStart() + "  -  " + decoderSegmentMsg.segment.segmentTimeRange.getEnd());
            CMTime start = cacheSegment.segmentTimeRange.getStart();
            CMTime end = cacheSegment.segmentTimeRange.getEnd();
            CMTime duration = cacheSegment.segmentTimeRange.getDuration();
            if (end.bigThan(this.decoderTrack.getDuration())) {
                end = this.decoderTrack.getDuration();
                duration = end.sub(start);
            }
            CMTimeRange cMTimeRange = new CMTimeRange(start, cacheSegment.segmentTimeRange.getDuration());
            if (this.cachedVideoDecoderTrack.revert) {
                CMTime sub = this.decoderTrack.getDuration().sub(end);
                CMTime cMTime = CMTime.CMTimeZero;
                if (sub.smallThan(cMTime)) {
                    sub = cMTime;
                }
                cMTimeRange = new CMTimeRange(sub, duration);
            }
            Logger.m144641d(TAG, "decoder2:------------------- " + cMTimeRange.getStart() + "  -  " + cMTimeRange.getEnd());
            if (cMTimeRange.getStart() != CMTime.CMTimeInvalid && this.cachedVideoDecoderTrack != null && (renderContext = this.context) != null) {
                renderContext.makeCurrent();
                this.decoderTrack.seekTo(cMTimeRange.getStart(), false, false);
                CMSampleBuffer readSample = this.decoderTrack.readSample(cMTimeRange.getStart());
                Logger.m144641d(TAG, "decoder: readFirst " + readSample.getTime() + " cancel = " + this.cancel + "  - " + cMTimeRange.getEnd());
                while (!readSample.getTime().smallThan(CMTime.CMTimeZero) && !this.cancel && readSample.getTime().smallThan(cMTimeRange.getEnd())) {
                    CacheFrame cacheFrame = new CacheFrame();
                    cacheFrame.texturePool = this.texturePool;
                    cacheFrame.frameTime = readSample.getTime();
                    Logger.m144641d(TAG, "decoder:==================== frame.frameTime = " + cacheFrame.frameTime + "  " + readSample.getTextureInfo());
                    if (this.cachedVideoDecoderTrack.revert) {
                        cacheFrame.frameTime = this.decoderTrack.getDuration().sub(readSample.getTime());
                    }
                    cacheFrame.realFrameTime = readSample.getTime();
                    if (readSample.getTextureInfo() != null) {
                        RenderContext renderContext2 = this.context;
                        this.filter.setRenderForScreen(false);
                        this.filter.setRendererWidth(renderContext2.width());
                        this.filter.setRendererHeight(renderContext2.height());
                        renderContext2.makeCurrent();
                        TextureInfo popTexture = this.texturePool.popTexture(3553, renderContext2.width(), renderContext2.height());
                        this.filter.setDesTextureInfo(popTexture);
                        Logger.m144641d(TAG, "decoder:==================== " + readSample.getTime() + "  " + readSample.isNewFrame() + "  " + cacheFrame.frameTime);
                        this.filter.clearBufferBuffer(-16777216);
                        this.filter.applyFilter(readSample.getTextureInfo(), readSample.getTextureInfo().getTextureMatrix());
                        cacheFrame.sampleBuffer = new CMSampleBuffer(cacheFrame.frameTime, popTexture, readSample.isNewFrame());
                        cacheSegment.pushFrame(cacheFrame);
                    }
                    if (!cacheFrame.realFrameTime.add(this.cachedVideoDecoderTrack.getFrameDuration()).smallThan(cMTimeRange.getEnd())) {
                        break;
                    }
                    readSample = this.decoderTrack.readSample();
                }
            }
        }
        RequestStatus requestStatus = decoderSegmentMsg.callbackObject;
        if (requestStatus != null) {
            synchronized (requestStatus) {
                decoderSegmentMsg.callbackObject.setFinish(true);
                decoderSegmentMsg.callbackObject.notifyAll();
            }
        }
    }

    private void quit() {
        CMSampleBuffer cMSampleBuffer = this.seekSampleBuffer;
        if (!(cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null)) {
            this.seekSampleBuffer.getTextureInfo().release();
        }
        this.filter.release();
        this.decoderTrack.release();
        this.texturePool.release();
        this.context.release();
        this.decoderHandler.removeCallbacksAndMessages((Object) null);
        this.decoderThread.quit();
    }

    private void start() {
        HandlerThread handlerThread = new HandlerThread("SegmentDecoder");
        this.decoderThread = handlerThread;
        handlerThread.start();
        this.decoderHandler = new Handler(this.decoderThread.getLooper(), this);
    }

    private void startDecoder() {
        RenderContext renderContext = new RenderContext(this.cachedVideoDecoderTrack.renderContext.width(), this.cachedVideoDecoderTrack.renderContext.height(), (Surface) null, this.cachedVideoDecoderTrack.renderContext.eglContext());
        this.context = renderContext;
        this.decoderTrack.start(renderContext, this.cachedVideoDecoderTrack.validTimeRange);
        this.started = true;
        this.context.makeCurrent();
        this.filter = new CopyFilter();
    }

    public void decoderSegment(CacheSegment cacheSegment, RequestStatus requestStatus) {
        this.cancel = true;
        this.decoderHandler.removeCallbacksAndMessages((Object) null);
        this.decoderHandler.obtainMessage(2, new DecoderSegmentMsg(cacheSegment, requestStatus)).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            startDecoder();
            return false;
        } else if (i == 2) {
            decoder((DecoderSegmentMsg) message.obj);
            return false;
        } else if (i == 3) {
            decoder((DecoderFrameMsg) message.obj);
            return false;
        } else if (i != 1000) {
            return false;
        } else {
            quit();
            return false;
        }
    }

    public void release() {
        this.cancel = true;
        if (this.decoderThread != null) {
            this.decoderHandler.removeCallbacksAndMessages((Object) null);
            this.decoderHandler.sendEmptyMessage(1000);
        }
    }

    public void startForReady() {
        start();
        this.decoderHandler.sendEmptyMessage(1);
        while (!this.started) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void decoderSegment(CMTime cMTime, CountDownLatch countDownLatch) {
        this.cancel = true;
        this.decoderHandler.removeCallbacksAndMessages((Object) null);
        this.decoderHandler.obtainMessage(3, new DecoderFrameMsg(cMTime, countDownLatch)).sendToTarget();
    }

    private void decoder(DecoderFrameMsg decoderFrameMsg) {
        TextureInfo textureInfo;
        CMTime cMTime = decoderFrameMsg.time;
        if (this.cachedVideoDecoderTrack.revert) {
            cMTime = this.decoderTrack.getDuration().sub(decoderFrameMsg.time);
        }
        RenderContext renderContext = this.context;
        if (renderContext != null) {
            renderContext.makeCurrent();
        }
        CMSampleBuffer seekTo = this.decoderTrack.seekTo(cMTime, true, false);
        if (seekTo.getTextureInfo() != null) {
            RenderContext renderContext2 = this.context;
            this.filter.setRenderForScreen(false);
            this.filter.setRendererWidth(renderContext2.width());
            this.filter.setRendererHeight(renderContext2.height());
            CMSampleBuffer cMSampleBuffer = this.seekSampleBuffer;
            if (cMSampleBuffer != null) {
                textureInfo = cMSampleBuffer.getTextureInfo();
            } else {
                textureInfo = this.texturePool.popTexture(3553, renderContext2.width(), renderContext2.height());
            }
            this.filter.setDesTextureInfo(textureInfo);
            Logger.m144641d(TAG, "decoder:==========|=|========= " + seekTo.getTime() + "  " + seekTo.isNewFrame() + "  ");
            this.filter.clearBufferBuffer(-16777216);
            this.filter.applyFilter(seekTo.getTextureInfo(), seekTo.getTextureInfo().getTextureMatrix());
            CMTime time = seekTo.getTime();
            if (this.cachedVideoDecoderTrack.revert) {
                time = this.decoderTrack.getDuration().sub(time);
            }
            this.seekSampleBuffer = new CMSampleBuffer(time, textureInfo, seekTo.isNewFrame());
        }
        CountDownLatch countDownLatch = decoderFrameMsg.finishWait;
        if (countDownLatch != null) {
            synchronized (countDownLatch) {
                decoderFrameMsg.finishWait.countDown();
            }
        }
    }
}
