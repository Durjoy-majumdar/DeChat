package com.tencent.tav.core;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.MetadataItem;
import com.tencent.tav.codec.DefaultMediaFactory;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.IEncoderFactory;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.ExportReportSession;
import java.util.List;

public class AssetExportSession {
    public static final String TAG = "AssetExportSession";
    public boolean appliesPreferredTrackTransform;
    public Asset asset;
    public AssetExtension assetExtension;
    private AudioMix audioMix;
    public boolean calculateBfsTransform;
    private final ExportConfig exportConfig;
    public ExportErrorStatus exportErrorStatus;
    private AssetExportThread exportThread;
    private boolean isNeedCheckFrameProcessTimeout;
    private IMediaFactory mediaFactory;
    private List<MetadataItem> metadata;
    public String outputFilePath;
    public String outputFileType;
    private String presetName;
    public ExportErrorStatus processErrorStatus;
    public float progress;
    private RenderContextParams renderContextParams;
    private boolean revertMode;
    public AssetExportSessionStatus status;
    private List<String> supportedFileTypes;
    public CMTimeRange timeRange;
    private boolean timeoutInterruptWork;
    public VideoCompositing videoCompositing;
    public VideoComposition videoComposition;

    public enum AssetExportSessionStatus {
        AssetExportSessionStatusUnknown,
        AssetExportSessionStatusExporting,
        AssetExportSessionStatusCompleted,
        AssetExportSessionStatusFailed,
        AssetExportSessionStatusCancelled,
        AssetExportSessionStatusTimeout
    }

    public interface ExportCallbackHandler {
        void handlerCallback(AssetExportSession assetExportSession);
    }

    @Deprecated
    public AssetExportSession(Asset asset2, EncoderWriter.OutputConfig outputConfig) {
        this(asset2, new ExportConfig(outputConfig), new AssetExtension(AssetExtension.SCENE_EXPORT));
    }

    public void cancelExport() {
        Logger.m144646i("AssetExportSession", "cancelExport");
        AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            assetExportThread.cancel();
        }
    }

    public void exportAsynchronouslyWithCompletionHandler(ExportCallbackHandler exportCallbackHandler) {
        AssetExportThread assetExportThread = new AssetExportThread(this, exportCallbackHandler, this.audioMix, this.exportConfig);
        this.exportThread = assetExportThread;
        assetExportThread.setRenderContextParams(this.renderContextParams);
        this.exportThread.setMediaFactory(this.mediaFactory);
        this.exportThread.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork);
        this.exportThread.startExport();
    }

    public Asset getAsset() {
        return this.asset;
    }

    public AudioMix getAudioMix() {
        return this.audioMix;
    }

    public int getErrCode() {
        ExportErrorStatus exportErrorStatus2 = this.exportErrorStatus;
        if (exportErrorStatus2 != null) {
            return exportErrorStatus2.code;
        }
        return 0;
    }

    public ExportConfig getExportConfig() {
        return this.exportConfig;
    }

    public ExportErrorStatus getExportErrorStatus() {
        return this.exportErrorStatus;
    }

    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public String getOutputFileType() {
        return this.outputFileType;
    }

    public String getPresetName() {
        return this.presetName;
    }

    public float getProgress() {
        return this.progress;
    }

    public RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public ExportReportSession getReportSession() {
        AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            return assetExportThread.getReportSession();
        }
        return null;
    }

    public AssetExportSessionStatus getStatus() {
        return this.status;
    }

    public List<String> getSupportedFileTypes() {
        return this.supportedFileTypes;
    }

    public Throwable getThrowable() {
        ExportErrorStatus exportErrorStatus2 = this.exportErrorStatus;
        if (exportErrorStatus2 != null) {
            return exportErrorStatus2.throwable;
        }
        return null;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public boolean isRevertMode() {
        return this.revertMode;
    }

    public void release() {
        AudioMix audioMix2 = this.audioMix;
        if (audioMix2 != null) {
            audioMix2.release();
            this.audioMix = null;
        }
    }

    public void setAppliesPreferredTrackTransform(boolean z) {
        this.appliesPreferredTrackTransform = z;
    }

    public void setAudioMix(AudioMix audioMix2) {
        this.audioMix = audioMix2;
    }

    public void setCalculateBfsTransform(boolean z) {
        this.calculateBfsTransform = z;
    }

    @Deprecated
    public void setEncoderFactory(IEncoderFactory iEncoderFactory) {
        this.mediaFactory = new DefaultMediaFactory(iEncoderFactory, (IDecoderFactory) null);
    }

    public void setMediaFactory(IMediaFactory iMediaFactory) {
        this.mediaFactory = iMediaFactory;
    }

    public void setMetadata(List<MetadataItem> list) {
        this.metadata = list;
    }

    public void setOutputFilePath(String str) {
        this.outputFilePath = str;
    }

    public void setOutputFileType(String str) {
        this.outputFileType = str;
    }

    public void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
        AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            assetExportThread.setRenderContextParams(renderContextParams2);
        }
    }

    public void setRevertMode(boolean z) {
        this.revertMode = z;
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public void setTimeoutParameter(boolean z, boolean z2) {
        this.isNeedCheckFrameProcessTimeout = z;
        this.timeoutInterruptWork = z2;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
        if (videoComposition2 != null) {
            this.videoCompositing = videoComposition2.getCustomVideoCompositor();
        }
    }

    public AssetExportSession(Asset asset2, ExportConfig exportConfig2) {
        this(asset2, exportConfig2, new AssetExtension(AssetExtension.SCENE_EXPORT));
    }

    public AssetExportSession(Asset asset2, ExportConfig exportConfig2, AssetExtension assetExtension2) {
        this.outputFileType = "mp4";
        this.revertMode = false;
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.appliesPreferredTrackTransform = false;
        this.calculateBfsTransform = false;
        this.asset = asset2;
        this.assetExtension = assetExtension2;
        if (exportConfig2 == null || !exportConfig2.available()) {
            Logger.m144643e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            exportConfig2 = new ExportConfig((int) asset2.getNaturalSize().width, (int) asset2.getNaturalSize().height);
        }
        this.exportConfig = exportConfig2;
    }
}
