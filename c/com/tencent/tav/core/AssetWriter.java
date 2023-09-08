package com.tencent.tav.core;

import android.view.Surface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tav.asset.MetadataItem;
import com.tencent.tav.core.AssetWriterInput;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.CodecHelper;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.IEncoderFactory;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.AverageTimeReporter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AssetWriter implements AssetWriterInput.StatusListener, IAssetWriter {
    public static final int MAX_BIT_RATE = 8000000;
    private static final String TAG = "AssetWriter";
    private List<Integer> availableMediaTypes;
    private String directoryForTemporaryFiles;
    private ExportConfig encodeOption;
    private EncoderWriter encoderWriter;
    private CMTime endTime = new CMTime((long) MAlarmHandler.NEXT_FIRE_INTERVAL);
    private int errCode;
    private HashMap<AssetWriterInput, AssetWriterStatus> inputStatusHashMap = new HashMap<>();
    private List<AssetWriterInput> inputs = new ArrayList();
    private List<MetadataItem> metadata;
    private String outputFileType;
    private Surface rendSurface;
    private RenderContext renderContext;
    private RenderContextParams renderContextParams;
    private boolean shouldOptimizeForNetworkUse;
    private CMTime startTime = new CMTime(0);
    private AssetWriterStatus status;
    private String videoOutputPath;

    public AssetWriter(String str, String str2) {
        this.videoOutputPath = str;
        this.outputFileType = str2;
    }

    private void updateAssetStatus() {
        Iterator<AssetWriterInput> it = this.inputs.iterator();
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.inputStatusHashMap.get(it.next()) == AssetWriterStatus.AssetWriterStatusCompleted) {
                z2 = true;
            }
            z &= z2;
        }
        if (z) {
            this.status = AssetWriterStatus.AssetWriterStatusCancelled;
            return;
        }
        boolean z3 = true;
        for (AssetWriterInput next : this.inputs) {
            z3 &= this.inputStatusHashMap.get(next) == AssetWriterStatus.AssetWriterStatusWriting || this.inputStatusHashMap.get(next) == AssetWriterStatus.AssetWriterStatusCompleted;
        }
        if (z3) {
            this.status = AssetWriterStatus.AssetWriterStatusWriting;
            return;
        }
        for (AssetWriterInput assetWriterInput : this.inputs) {
            AssetWriterStatus assetWriterStatus = this.inputStatusHashMap.get(assetWriterInput);
            AssetWriterStatus assetWriterStatus2 = AssetWriterStatus.AssetWriterStatusFailed;
            if (assetWriterStatus == assetWriterStatus2) {
                this.status = assetWriterStatus2;
                return;
            }
        }
        for (AssetWriterInput assetWriterInput2 : this.inputs) {
            AssetWriterStatus assetWriterStatus3 = this.inputStatusHashMap.get(assetWriterInput2);
            AssetWriterStatus assetWriterStatus4 = AssetWriterStatus.AssetWriterStatusCancelled;
            if (assetWriterStatus3 == assetWriterStatus4) {
                this.status = assetWriterStatus4;
                return;
            }
        }
    }

    public void addInput(AssetWriterInput assetWriterInput) {
        if (canAddInput(assetWriterInput)) {
            this.inputs.add(assetWriterInput);
            assetWriterInput.addStatusListener(this);
        }
    }

    public boolean canAddInput(AssetWriterInput assetWriterInput) {
        for (AssetWriterInput mediaType : this.inputs) {
            if (mediaType.getMediaType() == assetWriterInput.getMediaType()) {
                return false;
            }
        }
        return true;
    }

    public boolean canApplyOutputSettings(HashMap<String, Object> hashMap, int i) {
        int i2 = 8000000;
        int i3 = 1;
        if (i == 1) {
            String str = hashMap.containsKey("mime") ? (String) hashMap.get("mime") : "video/avc";
            int i4 = -1;
            int intValue = hashMap.containsKey("width") ? ((Integer) hashMap.get("width")).intValue() : -1;
            if (hashMap.containsKey("height")) {
                i4 = ((Integer) hashMap.get("height")).intValue();
            }
            int intValue2 = hashMap.containsKey("frame-rate") ? ((Integer) hashMap.get("frame-rate")).intValue() : 30;
            if (hashMap.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                i2 = ((Integer) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)).intValue();
            }
            return CodecHelper.checkVideoOutSupported(intValue, i4, intValue2, i2, str);
        } else if (i != 2) {
            return false;
        } else {
            String str2 = hashMap.containsKey("mime") ? (String) hashMap.get("mime") : "audio/mp4a-latm";
            if (hashMap.containsKey("aac-profile")) {
                ((Integer) hashMap.get("aac-profile")).intValue();
            }
            if (hashMap.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                i2 = ((Integer) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)).intValue();
            }
            if (hashMap.containsKey("channel-count")) {
                i3 = ((Integer) hashMap.get("channel-count")).intValue();
            }
            return CodecHelper.checkAudioOutSupported(i2, i3, hashMap.containsKey("sample-rate") ? ((Integer) hashMap.get("sample-rate")).intValue() : 44100, str2);
        }
    }

    public void cancelWriting() {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        if (encoderWriter2 != null) {
            encoderWriter2.stop();
            this.encoderWriter = null;
        }
        for (AssetWriterInput put : this.inputs) {
            this.inputStatusHashMap.put(put, AssetWriterStatus.AssetWriterStatusCancelled);
        }
        this.status = AssetWriterStatus.AssetWriterStatusCancelled;
    }

    public Surface createInputSurface() {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        if (encoderWriter2 != null) {
            return encoderWriter2.createInputSurface();
        }
        return null;
    }

    public EncoderWriter encoderWriter() {
        return this.encoderWriter;
    }

    public void endSessionAtSourceTime(CMTime cMTime) {
        this.endTime = cMTime;
    }

    public boolean finishWriting() {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        boolean stop = encoderWriter2 != null ? encoderWriter2.stop() : false;
        this.status = AssetWriterStatus.AssetWriterStatusCompleted;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.release();
            this.renderContext = null;
        }
        Surface surface = this.rendSurface;
        if (surface != null) {
            surface.release();
            this.rendSurface = null;
        }
        return stop;
    }

    public List<Integer> getAvailableMediaTypes() {
        return this.availableMediaTypes;
    }

    public String getDirectoryForTemporaryFiles() {
        return this.directoryForTemporaryFiles;
    }

    public AverageTimeReporter getEncodePerformance() {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        if (encoderWriter2 != null) {
            return encoderWriter2.getPerformance();
        }
        return null;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public List<AssetWriterInput> getInputs() {
        return this.inputs;
    }

    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    public String getOutputFileType() {
        return this.outputFileType;
    }

    public RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public AssetWriterStatus getStatus() {
        return this.status;
    }

    public String getVideoOutputPath() {
        return this.videoOutputPath;
    }

    public boolean isShouldOptimizeForNetworkUse() {
        return this.shouldOptimizeForNetworkUse;
    }

    public boolean prepareParallelSegmentInfo(PipelineIndicatorInfo pipelineIndicatorInfo) {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        if (encoderWriter2 == null || pipelineIndicatorInfo == null) {
            return false;
        }
        int index = pipelineIndicatorInfo.getIndex();
        CMTimeRange cMTimeRange = pipelineIndicatorInfo.timeRange;
        encoderWriter2.prepareParallelSegmentInfo(index, cMTimeRange, cMTimeRange);
        return true;
    }

    public RenderContext renderContext() {
        EncoderWriter encoderWriter2;
        if (this.renderContext == null && (encoderWriter2 = this.encoderWriter) != null) {
            this.rendSurface = encoderWriter2.createInputSurface();
            RenderContext renderContext2 = new RenderContext(this.encoderWriter.getOutWidth(), this.encoderWriter.getOutHeight(), this.rendSurface);
            this.renderContext = renderContext2;
            renderContext2.setParams(this.renderContextParams);
        }
        return this.renderContext;
    }

    public void reset() {
        try {
            this.encoderWriter.reset();
            this.renderContext = null;
        } catch (IOException unused) {
        }
    }

    public void setDirectoryForTemporaryFiles(String str) {
        this.directoryForTemporaryFiles = str;
    }

    public void setEncodeOption(ExportConfig exportConfig) {
        this.encodeOption = exportConfig;
    }

    public void setMetadata(List<MetadataItem> list) {
        this.metadata = list;
    }

    public void setRenderContextParams(RenderContextParams renderContextParams2) {
        this.renderContextParams = renderContextParams2;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.setParams(renderContextParams2);
        }
    }

    public void setShouldOptimizeForNetworkUse(boolean z) {
        this.shouldOptimizeForNetworkUse = z;
    }

    public void startSessionAtSourceTime(CMTime cMTime) {
        this.startTime = cMTime;
    }

    public boolean startWriting(IEncoderFactory iEncoderFactory) {
        if (this.videoOutputPath == null) {
            return false;
        }
        cancelWriting();
        try {
            EncoderWriter encoderWriter2 = new EncoderWriter(this.videoOutputPath, iEncoderFactory);
            this.encoderWriter = encoderWriter2;
            encoderWriter2.setEncodeOption(this.encodeOption);
            for (AssetWriterInput initConfig : this.inputs) {
                initConfig.initConfig(this);
            }
            return true;
        } catch (Exception e) {
            Logger.m144644e(TAG, "startWriting", (Throwable) e);
            this.inputStatusHashMap.clear();
            EncoderWriter encoderWriter3 = this.encoderWriter;
            if (encoderWriter3 != null) {
                encoderWriter3.stop();
                this.encoderWriter = null;
            }
            return false;
        }
    }

    public void statusChanged(AssetWriterInput assetWriterInput, AssetWriterStatus assetWriterStatus) {
        this.inputStatusHashMap.put(assetWriterInput, assetWriterStatus);
        AssetWriterStatus assetWriterStatus2 = this.status;
        updateAssetStatus();
        AssetWriterStatus assetWriterStatus3 = this.status;
        if (assetWriterStatus2 != assetWriterStatus3 && assetWriterStatus3 == AssetWriterStatus.AssetWriterStatusWriting) {
            for (AssetWriterInput next : this.inputs) {
            }
        }
    }

    public boolean finishWriting(boolean z) {
        EncoderWriter encoderWriter2 = this.encoderWriter;
        boolean stop = encoderWriter2 != null ? encoderWriter2.stop(z) : false;
        this.status = AssetWriterStatus.AssetWriterStatusCompleted;
        RenderContext renderContext2 = this.renderContext;
        if (renderContext2 != null) {
            renderContext2.release();
            this.renderContext = null;
        }
        Surface surface = this.rendSurface;
        if (surface != null) {
            surface.release();
            this.rendSurface = null;
        }
        return stop;
    }

    public boolean startWriting() {
        for (AssetWriterInput initConfig : this.inputs) {
            initConfig.initConfig(this);
        }
        return true;
    }
}
