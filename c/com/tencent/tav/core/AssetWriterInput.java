package com.tencent.tav.core;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import com.tencent.tav.asset.MetadataItem;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMPerformance;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.Filter;
import com.tencent.tav.decoder.LookUpFilter;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.xweb.IXWebBroadcastListener;
import java.nio.ByteBuffer;
import java.util.List;

public class AssetWriterInput {
    private final String TAG = ("AssetWriterInput" + hashCode());
    private IAssetWriter assetWriter;
    /* access modifiers changed from: private */
    public Handler handler;
    private HandlerThread handlerThread;
    public PipelineIndicatorInfo indicatorInfo;
    private Bitmap lutBitmap;
    public Filter matrixFilter;
    /* access modifiers changed from: private */
    public int mediaType;
    private List<MetadataItem> metadata;
    /* access modifiers changed from: private */
    public WriterProgressListener progressListener;
    private boolean readyForMoreMediaData;
    private long renderCost = 0;
    private boolean started = false;
    private StatusListener statusListener;
    private boolean stop = false;
    private Matrix transform;
    /* access modifiers changed from: private */
    public EncoderWriter writer;
    private Handler writerHandler;
    private HandlerThread writerThread;

    public interface StatusListener {
        void statusChanged(AssetWriterInput assetWriterInput, AssetWriterStatus assetWriterStatus);
    }

    public class WriterAudioRunnable implements Runnable {
        private final boolean isEndBuffer;
        private final CMSampleBuffer sampleBuffer;

        public void run() {
            if (AssetWriterInput.this.handler != null) {
                long j = -1;
                try {
                    if (this.isEndBuffer) {
                        AssetWriterInput.this.writer.endWriteAudioSample();
                    } else {
                        AssetWriterInput.this.writer.writeAudioSample(this.sampleBuffer.getTime().getTimeUs(), this.sampleBuffer.getSampleByteBuffer());
                        j = AssetWriterInput.this.writer.getAudioPresentationTimeUs();
                    }
                } catch (Throwable th) {
                    ExportErrorStatus errorStatus = th instanceof ExportRuntimeException ? th.getErrorStatus() : new ExportErrorStatus(ExportErrorStatus.WRITE_AUDIO_SAMPLE, th);
                    if (AssetWriterInput.this.progressListener != null) {
                        AssetWriterInput assetWriterInput = AssetWriterInput.this;
                        errorStatus.indicatorInfo = assetWriterInput.indicatorInfo;
                        assetWriterInput.progressListener.onError(errorStatus);
                        return;
                    }
                }
                if (AssetWriterInput.this.progressListener != null) {
                    AssetWriterInput.this.progressListener.onProgressChanged(AssetWriterInput.this, j);
                }
            }
        }

        private WriterAudioRunnable(CMSampleBuffer cMSampleBuffer, boolean z) {
            this.sampleBuffer = cMSampleBuffer;
            this.isEndBuffer = z;
        }
    }

    public interface WriterProgressListener {
        void onError(ExportErrorStatus exportErrorStatus);

        void onProgressChanged(AssetWriterInput assetWriterInput, long j);
    }

    public class WriterVideoRunnable implements Runnable {
        private final CMSampleBuffer sampleBuffer;

        public void run() {
            Trace.beginSection("leex-encode");
            if (AssetWriterInput.this.handler != null) {
                try {
                    AssetWriterInput.this.writer.writeVideoSample(this.sampleBuffer);
                    CMSampleBuffer cMSampleBuffer = this.sampleBuffer;
                    if (cMSampleBuffer != null) {
                        if (cMSampleBuffer.getState().stateMatchingTo(-1)) {
                            AssetWriterInput.this.writer.endWriteVideoSample(this.sampleBuffer);
                        }
                    }
                } catch (Throwable th) {
                    ExportErrorStatus errorStatus = th instanceof ExportRuntimeException ? th.getErrorStatus() : new ExportErrorStatus(ExportErrorStatus.WRITE_VIDEO_SAMPLE, th);
                    if (AssetWriterInput.this.progressListener != null) {
                        AssetWriterInput assetWriterInput = AssetWriterInput.this;
                        errorStatus.indicatorInfo = assetWriterInput.indicatorInfo;
                        assetWriterInput.progressListener.onError(errorStatus);
                        return;
                    }
                }
                if (AssetWriterInput.this.progressListener != null) {
                    WriterProgressListener access$400 = AssetWriterInput.this.progressListener;
                    AssetWriterInput assetWriterInput2 = AssetWriterInput.this;
                    access$400.onProgressChanged(assetWriterInput2, assetWriterInput2.writer.getVideoPresentationTimeUs());
                }
            }
            Trace.endSection();
        }

        private WriterVideoRunnable(CMSampleBuffer cMSampleBuffer) {
            this.sampleBuffer = cMSampleBuffer;
        }
    }

    public AssetWriterInput(int i) {
        this.mediaType = i;
    }

    private ExportErrorStatus appendAudioSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        boolean smallThan = cMSampleBuffer.getTime().smallThan(CMTime.CMTimeZero);
        if (!smallThan) {
            ByteBuffer allocate = ByteBuffer.allocate(cMSampleBuffer.getSampleByteBuffer().limit());
            allocate.order(cMSampleBuffer.getSampleByteBuffer().order());
            allocate.put(cMSampleBuffer.getSampleByteBuffer());
            allocate.flip();
            cMSampleBuffer = new CMSampleBuffer(cMSampleBuffer.getTime(), allocate);
        }
        this.writerHandler.post(new WriterAudioRunnable(cMSampleBuffer, smallThan));
        return null;
    }

    private ExportErrorStatus appendVideoSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        return appendVideoSampleBuffer(cMSampleBuffer, false);
    }

    private void onStartError(Exception exc, int i) {
        ExportErrorStatus exportErrorStatus;
        if (exc instanceof ExportRuntimeException) {
            exportErrorStatus = ((ExportRuntimeException) exc).getErrorStatus();
        } else {
            exportErrorStatus = new ExportErrorStatus(i == 1 ? -101 : -102, exc);
        }
        WriterProgressListener writerProgressListener = this.progressListener;
        if (writerProgressListener != null) {
            exportErrorStatus.indicatorInfo = this.indicatorInfo;
            writerProgressListener.onError(exportErrorStatus);
        }
    }

    private TextureInfo renderSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        if (textureInfo == null) {
            return null;
        }
        if (this.matrixFilter == null) {
            Bitmap bitmap = this.lutBitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                this.matrixFilter = new Filter();
            } else {
                this.matrixFilter = new LookUpFilter(this.lutBitmap);
            }
            this.matrixFilter.setRendererWidth(this.assetWriter.renderContext().width());
            this.matrixFilter.setRendererHeight(this.assetWriter.renderContext().height());
            this.matrixFilter.setRenderForScreen(!this.writer.isVideoEncodeNeedVideoRenderOutputTexture());
        }
        return this.matrixFilter.applyFilter(textureInfo, this.transform, textureInfo.getTextureMatrix());
    }

    public void addStatusListener(StatusListener statusListener2) {
        this.statusListener = statusListener2;
    }

    public ExportErrorStatus appendSampleBuffer(CMSampleBuffer cMSampleBuffer) {
        return appendSampleBuffer(cMSampleBuffer, false);
    }

    public synchronized void close() {
        Logger.m144646i(this.TAG, "close");
        HandlerThread handlerThread2 = this.handlerThread;
        if (handlerThread2 != null) {
            this.readyForMoreMediaData = false;
            handlerThread2.quit();
            this.handlerThread = null;
            this.handler = null;
        }
        if (this.writerThread != null) {
            this.writerHandler.removeCallbacks((Runnable) null);
            this.writerThread.quit();
            this.writerThread = null;
            this.writerHandler = null;
        }
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    public void initConfig(IAssetWriter iAssetWriter) {
        this.assetWriter = iAssetWriter;
        this.writer = iAssetWriter.encoderWriter();
    }

    public boolean isReadyForMoreMediaData() {
        if (this.readyForMoreMediaData) {
            if (this.mediaType == 1) {
                if (this.writer.videoTrackWritable()) {
                    return true;
                }
            } else if (this.writer.audioTrackWritable()) {
                return true;
            }
        }
        return false;
    }

    public void markAsFinished() {
        this.writerHandler.post(new Runnable() {
            public void run() {
                if (AssetWriterInput.this.mediaType == 1) {
                    try {
                        AssetWriterInput.this.writer.endWriteVideoSample((CMSampleBuffer) null);
                    } catch (Throwable th) {
                        if (AssetWriterInput.this.progressListener != null) {
                            AssetWriterInput.this.progressListener.onError(new ExportErrorStatus(ExportErrorStatus.END_WRITE_VIDEO_SAMPLE, th, "", AssetWriterInput.this.indicatorInfo));
                            return;
                        }
                    }
                    if (AssetWriterInput.this.progressListener != null) {
                        AssetWriterInput.this.progressListener.onProgressChanged(AssetWriterInput.this, -1);
                        return;
                    }
                    return;
                }
                try {
                    AssetWriterInput.this.writer.endWriteAudioSample();
                } catch (Throwable th4) {
                    if (AssetWriterInput.this.progressListener != null) {
                        AssetWriterInput.this.progressListener.onError(new ExportErrorStatus(ExportErrorStatus.END_WRITE_AUDIO_SAMPLE, th4, "", AssetWriterInput.this.indicatorInfo));
                        return;
                    }
                }
                if (AssetWriterInput.this.progressListener != null) {
                    AssetWriterInput.this.progressListener.onProgressChanged(AssetWriterInput.this, -1);
                }
            }
        });
    }

    public void postRunnable(Runnable runnable) {
        if (this.handler != null && this.handlerThread.isAlive()) {
            this.handler.post(runnable);
        }
    }

    public synchronized void requestMediaDataWhenReadyOnQueue(HandlerThread handlerThread2, final Runnable runnable) {
        if (this.handler != null) {
            Logger.m144643e(this.TAG, "正在处理上一次的request请求，无法重复发起");
        } else if (this.assetWriter == null) {
            Logger.m144643e(this.TAG, "还没有与AssetWriter关联，无法发起request请求");
        } else {
            this.handlerThread = handlerThread2;
            handlerThread2.start();
            Handler handler2 = new Handler(handlerThread2.getLooper());
            this.handler = handler2;
            handler2.post(new Runnable() {
                public void run() {
                    if (AssetWriterInput.this.start()) {
                        runnable.run();
                    }
                }
            });
            HandlerThread handlerThread3 = new HandlerThread("writerThread");
            this.writerThread = handlerThread3;
            handlerThread3.start();
            this.writerHandler = new Handler(this.writerThread.getLooper());
        }
    }

    public void reset(final Runnable runnable) {
        this.handler.post(new Runnable() {
            public void run() {
                if (AssetWriterInput.this.start()) {
                    runnable.run();
                }
            }
        });
    }

    public void setEnableLut(Bitmap bitmap) {
        this.lutBitmap = bitmap;
    }

    public void setMetadata(List<MetadataItem> list) {
        this.metadata = list;
    }

    public void setTransform(Matrix matrix) {
        this.transform = matrix;
    }

    public void setWriterProgressListener(WriterProgressListener writerProgressListener) {
        this.progressListener = writerProgressListener;
    }

    public boolean start() {
        Logger.m144646i(this.TAG, IXWebBroadcastListener.STAGE_START);
        if (this.started) {
            return true;
        }
        try {
            if (this.mediaType == 1) {
                this.writer.startVideoEncoder();
                this.writer.setVideoSampleRenderContext(this.assetWriter.renderContext());
            } else {
                this.writer.startAudioEncoder();
            }
            this.readyForMoreMediaData = true;
            this.started = true;
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "start: ", (Throwable) e);
            onStartError(e, this.mediaType);
        }
        return this.started;
    }

    public void stop() {
        this.stop = true;
        this.readyForMoreMediaData = false;
    }

    private ExportErrorStatus appendVideoSampleBuffer(CMSampleBuffer cMSampleBuffer, boolean z) {
        ExportErrorStatus exportErrorStatus;
        CMPerformance cMPerformance = new CMPerformance(CMPerformance.CMPerformanceStage.ENCODE_RENDER_CLEAR);
        cMPerformance.markStart();
        try {
            this.assetWriter.renderContext().makeCurrent(z);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            cMPerformance.markEnd();
            if (cMSampleBuffer == null || cMSampleBuffer.getTime().getTimeUs() < 0) {
                exportErrorStatus = null;
            } else {
                Logger.m144646i(this.TAG, "appendSampleBuffer: start " + cMSampleBuffer.getTime());
                CMPerformance cMPerformance2 = new CMPerformance(CMPerformance.CMPerformanceStage.ENCODE_RENDER);
                cMPerformance2.addPreNode(cMPerformance);
                cMPerformance2.markStart();
                try {
                    TextureInfo renderSampleBuffer = renderSampleBuffer(cMSampleBuffer);
                    if (this.writer.isVideoEncodeNeedVideoRenderOutputTexture()) {
                        GLES20.glFinish();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    this.writer.processVideoTexture(renderSampleBuffer, cMSampleBuffer.getTime());
                    this.renderCost += System.currentTimeMillis() - currentTimeMillis;
                    exportErrorStatus = null;
                } catch (Exception e) {
                    exportErrorStatus = new ExportErrorStatus(ExportErrorStatus.RENDER_SAMPLE_BUFFER, e);
                }
                cMPerformance2.markEnd();
                CMPerformance cMPerformance3 = new CMPerformance(CMPerformance.CMPerformanceStage.ENCODE_SWAP_BUFFER);
                cMPerformance3.addPreNode(cMPerformance2);
                cMPerformance3.markStart();
                try {
                    this.assetWriter.renderContext().setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
                    this.assetWriter.renderContext().swapBuffers();
                    Trace.endSection();
                } catch (Exception e2) {
                    exportErrorStatus = new ExportErrorStatus(ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS, e2);
                }
                cMPerformance3.markEnd();
                cMSampleBuffer.getState().performance = cMPerformance3;
                Logger.m144648v(this.TAG, "appendSampleBuffer: end " + cMSampleBuffer.getTime());
            }
            this.writerHandler.post(new WriterVideoRunnable(cMSampleBuffer));
            return exportErrorStatus;
        } catch (Exception e3) {
            return new ExportErrorStatus(ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT, e3);
        }
    }

    public ExportErrorStatus appendSampleBuffer(CMSampleBuffer cMSampleBuffer, boolean z) {
        if (!this.stop) {
            try {
                String str = this.TAG;
                Logger.m144646i(str, "appendSampleBuffer: start " + cMSampleBuffer.getTime() + " type: " + this.mediaType);
                if (this.mediaType == 1 && this.assetWriter.renderContext() != null) {
                    return appendVideoSampleBuffer(cMSampleBuffer, z);
                }
                if (this.mediaType == 2) {
                    return appendAudioSampleBuffer(cMSampleBuffer);
                }
            } catch (Throwable th) {
                Logger.m144644e(this.TAG, "appendSampleBuffer: error", th);
                StatusListener statusListener2 = this.statusListener;
                if (statusListener2 != null) {
                    statusListener2.statusChanged(this, AssetWriterStatus.AssetWriterStatusFailed);
                }
                return new ExportErrorStatus(ExportErrorStatus.APPEND_BUFFER, th);
            }
        }
        return new ExportErrorStatus(-11);
    }
}
