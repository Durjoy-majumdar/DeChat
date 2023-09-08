package com.tencent.tav.core;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.MetadataItem;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.core.parallel.newversion.AssetParallelExportWork;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import java.util.ArrayList;
import java.util.List;

public class AssetParallelExportSession {
    public static final String TAG = "AssetExportSession";
    public boolean appliesPreferredTrackTransform;
    public Asset asset;
    public AssetExtension assetExtension;
    private AudioMix audioMix;
    private final ExportConfig exportConfig;
    public ExportErrorStatus exportErrorStatus;
    private AssetParallelExportWork exportWork;
    private ArrayList<PipelineIndicatorInfo> indicatorInfo;
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
    public AssetExportSession.AssetExportSessionStatus status;
    private List<String> supportedFileTypes;
    public CMTimeRange timeRange;
    private boolean timeoutInterruptWork;
    public VideoCompositing videoCompositing;
    public VideoComposition videoComposition;

    public interface ExportCallbackHandler {
        void handlerCallback(AssetParallelExportSession assetParallelExportSession);
    }

    @Deprecated
    public AssetParallelExportSession(Asset asset2, EncoderWriter.OutputConfig outputConfig) {
        this(asset2, new ExportConfig(outputConfig), new AssetExtension(AssetExtension.SCENE_EXPORT));
    }

    public void cancelExport() {
        Logger.m144646i("AssetExportSession", "cancelExport");
        AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            assetParallelExportWork.cancel();
        }
    }

    public void exportAsynchronouslyWithCompletionHandler(ExportCallbackHandler exportCallbackHandler) {
        AssetParallelExportWork assetParallelExportWork = new AssetParallelExportWork(this, exportCallbackHandler, this.audioMix, this.exportConfig);
        this.exportWork = assetParallelExportWork;
        assetParallelExportWork.setRenderContextParams(this.renderContextParams);
        this.exportWork.setMediaFactory(this.mediaFactory);
        this.exportWork.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork);
        this.exportWork.startExport();
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

    public ArrayList<PipelineIndicatorInfo> getIndicatorInfo() {
        return this.indicatorInfo;
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

    public AssetExportSession.AssetExportSessionStatus getStatus() {
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

    public VideoCompositing getVideoCompositing() {
        if (this.videoCompositing == null) {
            this.videoCompositing = newVideoCompositing();
        }
        return this.videoCompositing;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public boolean isRevertMode() {
        return this.revertMode;
    }

    public VideoCompositing newVideoCompositing() {
        return this.videoComposition.getCustomVideoCompositor();
    }

    public int parallelSize() {
        AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            return assetParallelExportWork.getParallelCount();
        }
        return 0;
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

    public void setIndicatorInfo(ArrayList<PipelineIndicatorInfo> arrayList) {
        this.indicatorInfo.clear();
        this.indicatorInfo.addAll(arrayList);
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
        AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            assetParallelExportWork.setRenderContextParams(renderContextParams2);
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
        Logger.m144647i("AssetExportSession", "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public AssetParallelExportSession(Asset asset2, ExportConfig exportConfig2) {
        this(asset2, exportConfig2, new AssetExtension(AssetExtension.SCENE_EXPORT));
    }

    public AssetParallelExportSession(Asset asset2, ExportConfig exportConfig2, AssetExtension assetExtension2) {
        this.outputFileType = "mp4";
        this.revertMode = false;
        this.indicatorInfo = new ArrayList<>();
        this.appliesPreferredTrackTransform = false;
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.asset = asset2;
        this.assetExtension = assetExtension2;
        if (exportConfig2 == null || !exportConfig2.available()) {
            Logger.m144643e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            exportConfig2 = new ExportConfig((int) asset2.getNaturalSize().width, (int) asset2.getNaturalSize().height);
        }
        this.exportConfig = exportConfig2;
    }
}
